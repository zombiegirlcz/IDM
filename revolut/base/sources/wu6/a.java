package wu6;

import or6.e;
import pr6.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f300070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f300071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f300072c;

    static {
        int[] iArr = new int[lr6.a.values().length];
        try {
            iArr[lr6.a.AUTHENTICATION_CHALLENGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lr6.a.AUTHENTICATION_VERIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[lr6.a.AUTHORISATION_PASSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[lr6.a.AUTHORISATION_STARTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[lr6.a.AUTHORISED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[lr6.a.CANCELLATION_STARTED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[lr6.a.CANCELLED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[lr6.a.CANCELLING.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[lr6.a.CAPTURED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[lr6.a.CAPTURE_STARTED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[lr6.a.COMPLETED.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[lr6.a.COMPLETING.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[lr6.a.DECLINED.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[lr6.a.DECLINING.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[lr6.a.FAILED.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[lr6.a.FAILING.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[lr6.a.PENDING.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[lr6.a.REFUND_STARTED.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[lr6.a.REFUND_VALIDATED.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[lr6.a.SOFT_DECLINED.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        f300070a = iArr;
        int[] iArr2 = new int[k.values().length];
        try {
            iArr2[k.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[k.REVOLUT_PAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[k.GOOGLE_PAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[k.APPLE_PAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[k.TAP_TO_PAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused25) {
        }
        f300071b = iArr2;
        int[] iArr3 = new int[e.values().length];
        try {
            iArr3[e.AMERICAN_EXPRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr3[e.DISCOVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr3[e.JCB.ordinal()] = 3;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr3[e.MASTERCARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr3[e.PRIVATE_LABEL.ordinal()] = 5;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr3[e.VISA.ordinal()] = 6;
        } catch (NoSuchFieldError unused31) {
        }
        f300072c = iArr3;
    }
}
