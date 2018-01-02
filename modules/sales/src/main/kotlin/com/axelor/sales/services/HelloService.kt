package com.axelor.sales.services

import com.axelor.sales.db.HelloSales
import org.slf4j.Logger
import org.slf4j.LoggerFactory


interface HelloService {
    fun say(helloSales: HelloSales): String
    fun hello(): String
}


class HelloServiceImpl : HelloService {

    protected val log = LoggerFactory.getLogger(HelloServiceImpl::class.java)

    override fun say(helloSales: HelloSales): String {
        return String.format("Welcome '%s!'", helloSales.getTitle())
    }

    override fun hello(): String {
        return "Hello world!!!"
    }
}
