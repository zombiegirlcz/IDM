package com.youTransactor.uCube.rpc;

/* JADX INFO: loaded from: classes17.dex */
public enum TransactionType {
    PURCHASE("PURCHASE", "Purchase"),
    WITHDRAWAL("WITHDRAWAL", "Withdrawal"),
    REFUND("REFUND", "Refund"),
    PURCHASE_CASHBACK("PURCHASE_CASHBACK", "Purchase cashback"),
    MANUAL_CASH("MANUAL_CASH", "Manual cash"),
    INQUIRY("INQUIRY", "Inquiry");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f107656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107657b;

    TransactionType(String str, String str2) {
        this.f107657b = str2;
        this.f107656a = b;
    }

    public byte getCode() {
        return this.f107656a;
    }

    public String getLabel() {
        return this.f107657b;
    }
}
