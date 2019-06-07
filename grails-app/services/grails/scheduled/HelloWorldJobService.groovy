package grails.scheduled

import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.springframework.scheduling.annotation.Scheduled

import java.text.SimpleDateFormat

@Slf4j
@CompileStatic
@Transactional
class HelloWorldJobService {

    boolean lazyInit = false

    @Scheduled(fixedDelay = 10000L)
    void executeEveryTen() {
        log.info "Simple Job every 10 seconds :{}", new SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(new Date())
    }
}
