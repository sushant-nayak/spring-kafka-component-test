package com.sushantnayak.springkafkacomponenttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringKafkaComponentTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaComponentTestApplication.class, args);
	}

}
