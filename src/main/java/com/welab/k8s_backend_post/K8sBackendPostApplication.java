package com.welab.k8s_backend_post;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class K8sBackendPostApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sBackendPostApplication.class, args);
	}

}
