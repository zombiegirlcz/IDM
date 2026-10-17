package s71;

import ibd.h;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f260500a;

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
            iArr[h.PAID_PLAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[h.CREDIT_CARD_PAYMENT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[h.UPI_MANDATE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[h.SAVINGS_POCKET.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[h.VAULT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[h.WALLET.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f260500a = iArr;
    }
}
