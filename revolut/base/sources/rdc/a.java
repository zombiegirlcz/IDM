package rdc;

import u6c.k;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f253409a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.HIGH_RISK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.DO_NOT_HONOUR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.SUSPECTED_FRAUD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k.INSUFFICIENT_FUNDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k.INVALID_CARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[k.EXPIRED_CARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[k.RESTRICTED_CARD.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[k.WITHDRAWAL_LIMIT_EXCEEDED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[k.UNKNOWN_CARD.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[k.PICK_UP_CARD.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[k.INVALID_EMAIL.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[k.INVALID_AMOUNT.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[k.REJECTED_BY_CUSTOMER.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[k.CARDHOLDER_NAME_MISSING.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[k.TRANSACTION_NOT_ALLOWED_FOR_CARDHOLDER.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[k.PAYMENT_ATTEMPT_BLOCKED.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[k.THREE_DS_CHALLENGE_FAILED.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[k.THREE_DS_CHALLENGE_ABANDONED.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[k.THREE_DS_CHALLENGE_FAILED_MANUALLY.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[k.CUSTOMER_NAME_MISMATCH.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        f253409a = iArr;
    }
}
