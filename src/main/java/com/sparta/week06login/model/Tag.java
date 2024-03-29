package com.sparta.week06login.model;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tagId;

    @Column(nullable = false)
    private String keyword;

    public Tag(String keyword) {
        this.keyword = keyword;
    }
}


