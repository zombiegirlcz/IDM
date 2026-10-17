package lr6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 AUTHENTICATION_REQUIRED;
    public static final h0 CARDHOLDER_NAME_MISSING;
    public static final h0 CURRENCY_NOT_SUPPORTED;
    public static final h0 CUSTOMER_CHALLENGE_ABANDONED;
    public static final h0 CUSTOMER_CHALLENGE_FAILED;
    public static final h0 CUSTOMER_VERIFICATION_FAILED;
    public static final h0 DO_NOT_HONOUR;
    public static final h0 EXPIRED_CARD;
    public static final h0 HIGH_RISK;
    public static final h0 INSUFFICIENT_FUNDS;
    public static final h0 INVALID_ACCOUNT;
    public static final h0 INVALID_ADDRESS;
    public static final h0 INVALID_AMOUNT;
    public static final h0 INVALID_CARD;
    public static final h0 INVALID_COUNTRY;
    public static final h0 INVALID_CVV;
    public static final h0 INVALID_EMAIL;
    public static final h0 INVALID_EXPIRY;
    public static final h0 INVALID_MERCHANT;
    public static final h0 INVALID_PHONE;
    public static final h0 INVALID_PIN;
    public static final h0 INVALID_TRANSACTION;
    public static final h0 ISSUER_DECLINE;
    public static final h0 ISSUER_NOT_AVAILABLE;
    public static final h0 LAW_VIOLATION;
    public static final h0 NEW_CARD_NOT_UNBLOCKED;
    public static final h0 NO_SUCH_ISSUER;
    public static final h0 PICK_UP_CARD;
    public static final h0 PIN_REQUIRED;
    public static final h0 PIN_TRIES_EXCEEDED;
    public static final h0 REJECTED_BY_CUSTOMER;
    public static final h0 RESTRICTED_CARD;
    public static final h0 SECURITY_VIOLATION;
    public static final h0 STOLEN_CARD;
    public static final h0 SUSPECTED_FRAUD;
    public static final h0 TECHNICAL_ERROR;
    public static final h0 THREE_DS_CHALLENGE_ABANDONED;
    public static final h0 THREE_DS_CHALLENGE_FAILED;
    public static final h0 THREE_DS_CHALLENGE_FAILED_MANUALLY;
    public static final h0 TRANSACTION_NOT_ALLOWED;
    public static final h0 TRANSACTION_NOT_ALLOWED_FOR_CARDHOLDER;
    public static final h0 UNKNOWN_CARD;
    public static final h0 WITHDRAWAL_FREQUENCY_EXCEEDED;
    public static final h0 WITHDRAWAL_LIMIT_EXCEEDED;

    static {
        h0 h0Var = new h0("AUTHENTICATION_REQUIRED", 0);
        AUTHENTICATION_REQUIRED = h0Var;
        h0 h0Var2 = new h0("CARDHOLDER_NAME_MISSING", 1);
        CARDHOLDER_NAME_MISSING = h0Var2;
        h0 h0Var3 = new h0("CURRENCY_NOT_SUPPORTED", 2);
        CURRENCY_NOT_SUPPORTED = h0Var3;
        h0 h0Var4 = new h0("CUSTOMER_CHALLENGE_ABANDONED", 3);
        CUSTOMER_CHALLENGE_ABANDONED = h0Var4;
        h0 h0Var5 = new h0("CUSTOMER_CHALLENGE_FAILED", 4);
        CUSTOMER_CHALLENGE_FAILED = h0Var5;
        h0 h0Var6 = new h0("CUSTOMER_VERIFICATION_FAILED", 5);
        CUSTOMER_VERIFICATION_FAILED = h0Var6;
        h0 h0Var7 = new h0("DO_NOT_HONOUR", 6);
        DO_NOT_HONOUR = h0Var7;
        h0 h0Var8 = new h0("EXPIRED_CARD", 7);
        EXPIRED_CARD = h0Var8;
        h0 h0Var9 = new h0("HIGH_RISK", 8);
        HIGH_RISK = h0Var9;
        h0 h0Var10 = new h0("INSUFFICIENT_FUNDS", 9);
        INSUFFICIENT_FUNDS = h0Var10;
        h0 h0Var11 = new h0("INVALID_ACCOUNT", 10);
        INVALID_ACCOUNT = h0Var11;
        h0 h0Var12 = new h0("INVALID_ADDRESS", 11);
        INVALID_ADDRESS = h0Var12;
        h0 h0Var13 = new h0("INVALID_AMOUNT", 12);
        INVALID_AMOUNT = h0Var13;
        h0 h0Var14 = new h0("INVALID_CARD", 13);
        INVALID_CARD = h0Var14;
        h0 h0Var15 = new h0("INVALID_COUNTRY", 14);
        INVALID_COUNTRY = h0Var15;
        h0 h0Var16 = new h0("INVALID_CVV", 15);
        INVALID_CVV = h0Var16;
        h0 h0Var17 = new h0("INVALID_EMAIL", 16);
        INVALID_EMAIL = h0Var17;
        h0 h0Var18 = new h0("INVALID_EXPIRY", 17);
        INVALID_EXPIRY = h0Var18;
        h0 h0Var19 = new h0("INVALID_MERCHANT", 18);
        INVALID_MERCHANT = h0Var19;
        h0 h0Var20 = new h0("INVALID_PHONE", 19);
        INVALID_PHONE = h0Var20;
        h0 h0Var21 = new h0("INVALID_PIN", 20);
        INVALID_PIN = h0Var21;
        h0 h0Var22 = new h0("INVALID_TRANSACTION", 21);
        INVALID_TRANSACTION = h0Var22;
        h0 h0Var23 = new h0("ISSUER_DECLINE", 22);
        ISSUER_DECLINE = h0Var23;
        h0 h0Var24 = new h0("ISSUER_NOT_AVAILABLE", 23);
        ISSUER_NOT_AVAILABLE = h0Var24;
        h0 h0Var25 = new h0("LAW_VIOLATION", 24);
        LAW_VIOLATION = h0Var25;
        h0 h0Var26 = new h0("NEW_CARD_NOT_UNBLOCKED", 25);
        NEW_CARD_NOT_UNBLOCKED = h0Var26;
        h0 h0Var27 = new h0("NO_SUCH_ISSUER", 26);
        NO_SUCH_ISSUER = h0Var27;
        h0 h0Var28 = new h0("PICK_UP_CARD", 27);
        PICK_UP_CARD = h0Var28;
        h0 h0Var29 = new h0("PIN_REQUIRED", 28);
        PIN_REQUIRED = h0Var29;
        h0 h0Var30 = new h0("PIN_TRIES_EXCEEDED", 29);
        PIN_TRIES_EXCEEDED = h0Var30;
        h0 h0Var31 = new h0("REJECTED_BY_CUSTOMER", 30);
        REJECTED_BY_CUSTOMER = h0Var31;
        h0 h0Var32 = new h0("RESTRICTED_CARD", 31);
        RESTRICTED_CARD = h0Var32;
        h0 h0Var33 = new h0("SECURITY_VIOLATION", 32);
        SECURITY_VIOLATION = h0Var33;
        h0 h0Var34 = new h0("STOLEN_CARD", 33);
        STOLEN_CARD = h0Var34;
        h0 h0Var35 = new h0("SUSPECTED_FRAUD", 34);
        SUSPECTED_FRAUD = h0Var35;
        h0 h0Var36 = new h0("TECHNICAL_ERROR", 35);
        TECHNICAL_ERROR = h0Var36;
        h0 h0Var37 = new h0("THREE_DS_CHALLENGE_ABANDONED", 36);
        THREE_DS_CHALLENGE_ABANDONED = h0Var37;
        h0 h0Var38 = new h0("THREE_DS_CHALLENGE_FAILED", 37);
        THREE_DS_CHALLENGE_FAILED = h0Var38;
        h0 h0Var39 = new h0("THREE_DS_CHALLENGE_FAILED_MANUALLY", 38);
        THREE_DS_CHALLENGE_FAILED_MANUALLY = h0Var39;
        h0 h0Var40 = new h0("TRANSACTION_NOT_ALLOWED", 39);
        TRANSACTION_NOT_ALLOWED = h0Var40;
        h0 h0Var41 = new h0("TRANSACTION_NOT_ALLOWED_FOR_CARDHOLDER", 40);
        TRANSACTION_NOT_ALLOWED_FOR_CARDHOLDER = h0Var41;
        h0 h0Var42 = new h0("UNKNOWN_CARD", 41);
        UNKNOWN_CARD = h0Var42;
        h0 h0Var43 = new h0("WITHDRAWAL_FREQUENCY_EXCEEDED", 42);
        WITHDRAWAL_FREQUENCY_EXCEEDED = h0Var43;
        h0 h0Var44 = new h0("WITHDRAWAL_LIMIT_EXCEEDED", 43);
        WITHDRAWAL_LIMIT_EXCEEDED = h0Var44;
        h0[] h0VarArr = {h0Var, h0Var2, h0Var3, h0Var4, h0Var5, h0Var6, h0Var7, h0Var8, h0Var9, h0Var10, h0Var11, h0Var12, h0Var13, h0Var14, h0Var15, h0Var16, h0Var17, h0Var18, h0Var19, h0Var20, h0Var21, h0Var22, h0Var23, h0Var24, h0Var25, h0Var26, h0Var27, h0Var28, h0Var29, h0Var30, h0Var31, h0Var32, h0Var33, h0Var34, h0Var35, h0Var36, h0Var37, h0Var38, h0Var39, h0Var40, h0Var41, h0Var42, h0Var43, h0Var44};
        $VALUES = h0VarArr;
        $ENTRIES = vc.s.n(h0VarArr);
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }
}
