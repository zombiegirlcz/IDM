package t17;

import nr6.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f267197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f267198b;

    static {
        int[] iArr = new int[c0.values().length];
        try {
            iArr[c0.PAID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c0.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c0.REFUNDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c0.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[c0.PARTIAL_REFUND.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[c0.AUTHORISED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[c0.CANCELLED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[c0.PARTIALLY_PAID.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[c0.DISPUTED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[c0.PARTIALLY_DISPUTED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f267197a = iArr;
        int[] iArr2 = new int[ju6.b.values().length];
        try {
            iArr2[ju6.b.PAYMENT_LINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[ju6.b.QR_CODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[ju6.b.INVOICE.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[ju6.b.CARD_READER.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[ju6.b.TAP_TO_PAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[ju6.b.REVOLUT_TERMINAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[ju6.b.E_COMMERCE.ordinal()] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        f267198b = iArr2;
    }
}
