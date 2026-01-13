package com.example.Day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    public String Hello(){
        return "this is the first line";
    }

    @GetMapping("/Spring")
    public String Spring(){
        return " hey I am learning spring for the  first time ";
    }

    @GetMapping("/learn")
    public String learn(){
        return "today i learned to make routes using SpringBoot";
    }

    @GetMapping("/future")
    public String future(){
        return "i will be learning backend development in java using springboot framework";
    }



}
