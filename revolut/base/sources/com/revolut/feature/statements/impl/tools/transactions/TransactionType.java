package com.revolut.feature.statements.impl.tools.transactions;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.internal.d;
import efm.r;

/* JADX INFO: loaded from: classes7.dex */
public enum TransactionType {
    ATM("ATM", "ATM Withdrawal"),
    CARD_PAYMENT("CARD_PAYMENT", "ExternalCard payment"),
    CARD_REFUND("CARD_REFUND", "Refund"),
    CARD_CHARGEBACK("CARD_CHARGEBACK", "CARD chargeback"),
    EXCHANGE("EXCHANGE", "Exchange"),
    CARD_CREDIT("CARD_CREDIT", "ExternalCard credit"),
    FEE("FEE", "Fee"),
    REFUND("REFUND", "Refund"),
    REWARD("REWARD", "Gift"),
    TOPUP("TOPUP", "Top-up"),
    TOPUP_CHARGEBACK("TOPUP_CHARGEBACK", "Top-up chargeback"),
    TOPUP_RETURN("TOPUP_RETURN", "Return"),
    TRANSFER("TRANSFER", "Transfer"),
    INTERNAL_TRANSFER("INTERNAL_TRANSFER", "Internal transfer"),
    REVX_EXCHANGE("REVX_EXCHANGE", "RevX Exchange"),
    REVX_TRANSFER("REVX_TRANSFER", "RevX Transfer"),
    WITHDRAWAL("WITHDRAWAL", "Withdrawal"),
    REQUEST_MONEY("REQUEST_MONEY", "Request money"),
    LOAN("LOAN", "Credit"),
    LOAN_PAYMENT("LOAN_PAYMENT", "Loan payment"),
    CREDIT_INTEREST("CREDIT_INTEREST", "Credit interest"),
    TRADE("TRADE", "Investment"),
    CREDIT_LINE_REPAYMENT("CREDIT_LINE", "Credit line"),
    CRYPTO_WITHDRAWAL("CRYPTO_WITHDRAWAL", "Crypto withdrawal"),
    P2M_PAYMENT("P2M_PAYMENT", "Pay to Merchant"),
    INTEREST("INTEREST", "Interest"),
    UNKNOWN("UNKNOWN", "unknown");

    String name;
    String value;

    TransactionType(String str, String str2) {
        this.value = str;
        this.name = str2;
    }

    @NonNull
    public static TransactionType fromValue(String str) {
        for (TransactionType transactionType : values()) {
            if (transactionType.getValue().equalsIgnoreCase(str)) {
                return transactionType;
            }
        }
        return UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$parse$0(String str, TransactionType transactionType) throws Exception {
        return transactionType.getAlias().equalsIgnoreCase(str);
    }

    @NonNull
    public static TransactionType parse(String str) {
        return TextUtils.isEmpty(str) ? UNKNOWN : (TransactionType) r.fromArray(values()).filter(new d(str, 5)).blockingFirst(UNKNOWN);
    }

    @NonNull
    public String getAlias() {
        return getValue();
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    @NonNull
    public String getValue() {
        return this.value;
    }
}
