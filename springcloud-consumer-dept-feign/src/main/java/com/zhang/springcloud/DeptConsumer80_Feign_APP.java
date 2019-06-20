package com.zhang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: zhangchao
 * @Date: 2019/6/17 11:20
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.zhang"})
@ComponentScan("com.zhang")
public class DeptConsumer80_Feign_APP {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_APP.class, args);
    }

}
