package com.configserver.cogi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CogiConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CogiConfigServerApplication.class, args);
	}
}
