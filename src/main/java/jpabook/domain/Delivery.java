package jpabook.domain;

import javax.annotation.processing.Generated;
import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
public class Delivery extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    private String city;
    private String street;
    private String zipcode;
    private DeliveryStatus status;

    // 양방향으로 설계시
    @OneToOne(mappedBy = "delivery", fetch = LAZY)
    private Order order;
}
