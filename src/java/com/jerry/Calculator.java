/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jerry;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Kerish
 */
@WebService(serviceName = "Calculator")
public class Calculator {
    /**
     * Web service operation
     */
    @WebMethod(operationName = "sum")
    public int sum(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        return num1+num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiply")
    public int multiply(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        return num1*num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "subtract")
    public int subtract(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        //TODO write your implementation code here:
        return n1-n2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "divide")
    public int divide(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        //TODO write your implementation code here:
        return n1/n2;
    }

    
    
}
