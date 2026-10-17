package l4c;

import d3c.g0;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f192093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f192094b;

    static {
        int[] iArr = new int[d3c.i.values().length];
        try {
            iArr[d3c.i.CANCELLED_BY_USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d3c.i.INELIGIBLE_MERCHANT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d3c.i.PAYMENT_FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d3c.i.CART_EXPIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f192093a = iArr;
        int[] iArr2 = new int[g0.values().length];
        try {
            iArr2[g0.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[g0.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[g0.PROCESSING.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[g0.DELIVERING.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[g0.COMPLETED.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[g0.REFUNDED.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[g0.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        f192094b = iArr2;
    }
}
