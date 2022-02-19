package org.rbleuse.springdatacassandra

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDataCassandraApplication

fun main(args: Array<String>) {
	runApplication<SpringDataCassandraApplication>(*args)
}
