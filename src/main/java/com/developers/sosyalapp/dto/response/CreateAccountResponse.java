package com.developers.sosyalapp.dto.response;

import com.developers.sosyalapp.dto.AccountDto;

public class CreateAccountResponse {
    private AccountDto account;

    public AccountDto getAccount() {
        return account;
    }

    public void setAccount(AccountDto account) {
        this.account = account;
    }

    public CreateAccountResponse(AccountDto account) {
        this.account = account;
    }

}
