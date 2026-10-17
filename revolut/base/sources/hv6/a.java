package hv6;

import or6.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f155786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f155787b;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.VISA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.MASTERCARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.AMERICAN_EXPRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.DISCOVER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[e.JCB.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f155786a = iArr;
        int[] iArr2 = new int[lr6.a.values().length];
        try {
            iArr2[lr6.a.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[lr6.a.REFUND_STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[lr6.a.REFUND_VALIDATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[lr6.a.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[lr6.a.FAILING.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[lr6.a.CANCELLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[lr6.a.CANCELLING.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[lr6.a.CANCELLATION_STARTED.ordinal()] = 8;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[lr6.a.SOFT_DECLINED.ordinal()] = 9;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[lr6.a.DECLINED.ordinal()] = 10;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[lr6.a.DECLINING.ordinal()] = 11;
        } catch (NoSuchFieldError unused16) {
        }
        f155787b = iArr2;
    }
}
