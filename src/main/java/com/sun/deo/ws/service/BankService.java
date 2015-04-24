/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sun.deo.ws.service;

import com.sun.deo.ws.service.bean.Bank;
import javax.jws.WebService;

/**
 *
 * @author ManishDeo
 */

@WebService
public interface BankService {
    
    public boolean homeLoanEligibility(Bank bank);
}
