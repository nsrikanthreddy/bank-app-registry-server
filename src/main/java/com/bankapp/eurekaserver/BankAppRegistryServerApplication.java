package com.bankapp.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BankAppRegistryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAppRegistryServerApplication.class, args);
	}

}
