package io.github.flyhero.easylog.example.custom.service;

import io.github.flyhero.easylog.service.IOperatorService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


/**
 * @author WangQingFei(qfwang666@163.com)
 * @date 2022/2/26 11:44
 */
@Service
public class OperatorGetService implements IOperatorService {


    @Override
    public String getOperator() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = request.getHeader("token");
        return "test";
    }

    @Override
    public String getTenant() {
        return "company";
    }
}
