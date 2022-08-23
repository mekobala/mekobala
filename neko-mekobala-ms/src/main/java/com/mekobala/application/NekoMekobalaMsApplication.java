package com.mekobala.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class NekoMekobalaMsApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(NekoMekobalaMsApplication.class, args);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        List<Map<String, Object>> result =
                jdbcTemplate.queryForList("SELECT * FROM USER");
        System.out.println(result);
    }

}
