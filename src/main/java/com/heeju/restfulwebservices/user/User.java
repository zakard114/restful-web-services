package com.heeju.restfulwebservices.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private Integer id;
    private String name;
    private LocalDate birthDate;

}
