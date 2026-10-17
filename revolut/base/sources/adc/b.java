package adc;

import q6c.n;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f3322b;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.COMPLETING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.AUTHORISED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n.AUTHORISATION_PASSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[n.CAPTURED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[n.CAPTURE_STARTED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[n.DECLINED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[n.DECLINING.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[n.FAILED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[n.FAILING.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[n.REFUND_VALIDATED.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[n.REFUND_STARTED.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[n.CANCELLATION_STARTED.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[n.CANCELLING.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[n.CANCELLED.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[n.AUTHORISATION_STARTED.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[n.AUTHENTICATION_CHALLENGE.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[n.AUTHENTICATION_VERIFIED.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[n.PENDING.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[n.SOFT_DECLINED.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[n.UNKNOWN.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        f3321a = iArr;
        int[] iArr2 = new int[r6c.a.values().length];
        try {
            iArr2[r6c.a.THREE_DS.ordinal()] = 1;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[r6c.a.REVOLUT_SSO.ordinal()] = 2;
        } catch (NoSuchFieldError unused23) {
        }
        f3322b = iArr2;
    }
}
