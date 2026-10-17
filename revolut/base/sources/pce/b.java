package pce;

import ibd.h;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f234908a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.MANUAL_CARD_MANDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.CARD_MANDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.PREDEFINED_CARD_MANDATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.BIZUM_MANDATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[h.WALLET.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[h.BILL_MONEY_BOX.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[h.VAULT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[h.SAVINGS_POCKET.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[h.CREDIT_CARD_PAYMENT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[h.LOAN_PAYMENT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[h.MORTGAGE_PAYMENT.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[h.PAY_LATER_PAYMENT.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[h.CRYPTO.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[h.PAID_PLAN.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[h.REFUND.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[h.BILL.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[h.QR_CODE.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[h.BPAY.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[h.NZ_BILLS.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[h.UAE_BILLS.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[h.UPI.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        f234908a = iArr;
    }
}
