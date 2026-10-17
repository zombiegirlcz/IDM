package com.github.devnied.emvnfccard.model;

import java.util.Date;

/* JADX INFO: loaded from: classes16.dex */
public class EmvTrack2 extends AbstractData {
    private static final long serialVersionUID = -2906133619803198319L;
    private String cardNumber;
    private Date expireDate;
    private byte[] raw;
    private Service service;

    public String getCardNumber() {
        return this.cardNumber;
    }

    public Date getExpireDate() {
        return this.expireDate;
    }

    public byte[] getRaw() {
        return this.raw;
    }

    public Service getService() {
        return this.service;
    }

    public void setCardNumber(String str) {
        this.cardNumber = str;
    }

    public void setExpireDate(Date date) {
        this.expireDate = date;
    }

    public void setRaw(byte[] bArr) {
        this.raw = bArr;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
