package com.annyarusova.subscriptionservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "person")
@Getter
@Setter
@RequiredArgsConstructor
public class UserEntity {
    @Id
    @Column(nullable = false, unique = true)
    private String login;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String nickname;
    @Column(unique = true)
    private String email;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE", nullable = false)
    private LocalDateTime lastNotify = LocalDateTime.now();

    public UserEntity(String login, String password, String nickname) {
        this.login = login;
        this.password = password;
        this.nickname = nickname;
        this.email = null;
    }
}
