package iu6;

import nr6.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f168522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f168523b;

    static {
        int[] iArr = new int[nr6.e.values().length];
        try {
            iArr[nr6.e.CARD_READER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[nr6.e.INVOICE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[nr6.e.LINK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[nr6.e.POS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[nr6.e.PRESTASHOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[nr6.e.QR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[nr6.e.SHOPIFY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[nr6.e.SHOPIFY_RPAY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[nr6.e.APPLE_TAP_TO_PAY.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[nr6.e.WOOCOMMERCE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f168522a = iArr;
        int[] iArr2 = new int[c0.values().length];
        try {
            iArr2[c0.PAID.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[c0.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[c0.REFUNDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[c0.PARTIAL_REFUND.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[c0.AUTHORISED.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[c0.PARTIALLY_PAID.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[c0.FAILED.ordinal()] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[c0.CANCELLED.ordinal()] = 8;
        } catch (NoSuchFieldError unused18) {
        }
        f168523b = iArr2;
    }
}
