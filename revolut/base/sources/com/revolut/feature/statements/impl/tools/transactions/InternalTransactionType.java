package com.revolut.feature.statements.impl.tools.transactions;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.internal.d;
import efm.r;

/* JADX INFO: loaded from: classes7.dex */
public enum InternalTransactionType {
    ATM("ATM"),
    CARD_PAYMENT("CARD_PAYMENT"),
    CARD_REFUND("CARD_REFUND"),
    CARD_CHARGEBACK("TOPUP_CHARGEBACK"),
    EXCHANGE("EXCHANGE"),
    AUTO_EXCHANGE("AUTO_EXCHANGE"),
    CARD_CREDIT("CARD_CREDIT"),
    FEE("FEE"),
    REFUND("REFUND"),
    REWARD("REWARD"),
    TOPUP("TOPUP"),
    TOPUP_CHARGEBACK("TOPUP_CHARGEBACK"),
    TOPUP_RETURN("TOPUP_RETURN"),
    TRANSFER("TRANSFER"),
    INTERNAL_TRANSFER("INTERNAL_TRANSFER"),
    REQUEST_MONEY("REQUEST_MONEY"),
    UNKNOWN("UNKNOWN"),
    TRANSFER_BY_LINK("TRANSFER_BY_LINK"),
    TRANSFER_TO_R("TRANSFER_TO_R"),
    TRANSFER_POCKET_TO_POCKET("TRANSFER_POCKET_TO_POCKET"),
    TRANSFER_FROM_R("TRANSFER_FROM_R"),
    TRANSFER_TO_BANK("TRANSFER_TO_BANK"),
    REQUEST_MONEY_FROM("REQUEST_MONEY_FROM"),
    REQUEST_MONEY_TO("REQUEST_MONEY_TO"),
    LOAN("LOAN"),
    TRADE("TRADE");

    String value;

    InternalTransactionType(String str) {
        this.value = str;
    }

    @NonNull
    public static InternalTransactionType fromValue(@NonNull String str) {
        for (InternalTransactionType internalTransactionType : values()) {
            if (internalTransactionType.getValue().equalsIgnoreCase(str)) {
                return internalTransactionType;
            }
        }
        return UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$parse$0(String str, InternalTransactionType internalTransactionType) throws Exception {
        return internalTransactionType.getAlias().equalsIgnoreCase(str);
    }

    @NonNull
    public static InternalTransactionType parse(String str) {
        return TextUtils.isEmpty(str) ? UNKNOWN : (InternalTransactionType) r.fromArray(values()).filter(new d(str, 3)).blockingFirst(UNKNOWN);
    }

    @NonNull
    public String getAlias() {
        return getValue();
    }

    @NonNull
    public String getValue() {
        return this.value;
    }
}
