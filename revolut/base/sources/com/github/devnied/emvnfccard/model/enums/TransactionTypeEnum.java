package com.github.devnied.emvnfccard.model.enums;

/* JADX INFO: loaded from: classes16.dex */
public enum TransactionTypeEnum implements IKeyEnum {
    PURCHASE(0),
    CASH_ADVANCE(1),
    CASHBACK(9),
    REFUND(32),
    LOADED(254),
    UNLOADED(255);

    private final int value;

    TransactionTypeEnum(int i) {
        this.value = i;
    }

    @Override // com.github.devnied.emvnfccard.model.enums.IKeyEnum
    public int getKey() {
        return this.value;
    }
}
