package wu6;

import lr6.h0;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f300073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f300074b;

    static {
        int[] iArr = new int[qr6.b.values().length];
        try {
            iArr[qr6.b.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qr6.b.CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qr6.b.AUTHORISED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[qr6.b.CAPTURED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[qr6.b.DECLINED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[qr6.b.CANCELLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[qr6.b.FINISHED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[qr6.b.REFUNDED_AMOUNT_CHANGED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[qr6.b.REFUND_STARTED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[qr6.b.REFUNDED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[qr6.b.AUTHENTICATION_VERIFIED.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[qr6.b.AUTHENTICATION_FAILED.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[qr6.b.AUTHENTICATION_CHALLENGE.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[qr6.b.AUTHORISATION_PASSED.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        f300073a = iArr;
        int[] iArr2 = new int[h0.values().length];
        try {
            iArr2[h0.AUTHENTICATION_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[h0.CARDHOLDER_NAME_MISSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[h0.CURRENCY_NOT_SUPPORTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[h0.CUSTOMER_CHALLENGE_ABANDONED.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[h0.CUSTOMER_CHALLENGE_FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[h0.CUSTOMER_VERIFICATION_FAILED.ordinal()] = 6;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[h0.DO_NOT_HONOUR.ordinal()] = 7;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[h0.EXPIRED_CARD.ordinal()] = 8;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[h0.HIGH_RISK.ordinal()] = 9;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[h0.INSUFFICIENT_FUNDS.ordinal()] = 10;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[h0.INVALID_ACCOUNT.ordinal()] = 11;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[h0.INVALID_ADDRESS.ordinal()] = 12;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[h0.INVALID_AMOUNT.ordinal()] = 13;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[h0.INVALID_CARD.ordinal()] = 14;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[h0.INVALID_COUNTRY.ordinal()] = 15;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[h0.INVALID_CVV.ordinal()] = 16;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[h0.INVALID_EMAIL.ordinal()] = 17;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[h0.INVALID_EXPIRY.ordinal()] = 18;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[h0.INVALID_MERCHANT.ordinal()] = 19;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[h0.INVALID_PHONE.ordinal()] = 20;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[h0.INVALID_PIN.ordinal()] = 21;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[h0.INVALID_TRANSACTION.ordinal()] = 22;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[h0.ISSUER_DECLINE.ordinal()] = 23;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr2[h0.ISSUER_NOT_AVAILABLE.ordinal()] = 24;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr2[h0.LAW_VIOLATION.ordinal()] = 25;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr2[h0.NEW_CARD_NOT_UNBLOCKED.ordinal()] = 26;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr2[h0.NO_SUCH_ISSUER.ordinal()] = 27;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr2[h0.PICK_UP_CARD.ordinal()] = 28;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr2[h0.PIN_REQUIRED.ordinal()] = 29;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr2[h0.PIN_TRIES_EXCEEDED.ordinal()] = 30;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr2[h0.REJECTED_BY_CUSTOMER.ordinal()] = 31;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr2[h0.RESTRICTED_CARD.ordinal()] = 32;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr2[h0.SECURITY_VIOLATION.ordinal()] = 33;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr2[h0.STOLEN_CARD.ordinal()] = 34;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr2[h0.SUSPECTED_FRAUD.ordinal()] = 35;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr2[h0.TECHNICAL_ERROR.ordinal()] = 36;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr2[h0.THREE_DS_CHALLENGE_ABANDONED.ordinal()] = 37;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr2[h0.THREE_DS_CHALLENGE_FAILED.ordinal()] = 38;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr2[h0.THREE_DS_CHALLENGE_FAILED_MANUALLY.ordinal()] = 39;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr2[h0.TRANSACTION_NOT_ALLOWED.ordinal()] = 40;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr2[h0.TRANSACTION_NOT_ALLOWED_FOR_CARDHOLDER.ordinal()] = 41;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr2[h0.UNKNOWN_CARD.ordinal()] = 42;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr2[h0.WITHDRAWAL_FREQUENCY_EXCEEDED.ordinal()] = 43;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr2[h0.WITHDRAWAL_LIMIT_EXCEEDED.ordinal()] = 44;
        } catch (NoSuchFieldError unused58) {
        }
        f300074b = iArr2;
    }
}
