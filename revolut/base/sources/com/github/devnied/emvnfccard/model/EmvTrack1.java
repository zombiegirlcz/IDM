package com.github.devnied.emvnfccard.model;

import java.util.Date;

/* JADX INFO: loaded from: classes16.dex */
public class EmvTrack1 extends AbstractData {
    private static final long serialVersionUID = 6619730513813482135L;
    private String cardNumber;
    private Date expireDate;
    private String formatCode;
    private String holderFirstname;
    private String holderLastname;
    private byte[] raw;
    private Service service;

    public String getCardNumber() {
        return this.cardNumber;
    }

    public Date getExpireDate() {
        return this.expireDate;
    }

    public String getFormatCode() {
        return this.formatCode;
    }

    public String getHolderFirstname() {
        return this.holderFirstname;
    }

    public String getHolderLastname() {
        return this.holderLastname;
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

    public void setFormatCode(String str) {
        this.formatCode = str;
    }

    public void setHolderFirstname(String str) {
        this.holderFirstname = str;
    }

    public void setHolderLastname(String str) {
        this.holderLastname = str;
    }

    public void setRaw(byte[] bArr) {
        this.raw = bArr;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
