package com.example.employee_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class EmployeeBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeBackendApplication.class, args);
    }

}
