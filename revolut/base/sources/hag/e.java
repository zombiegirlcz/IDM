package hag;

import rei.j;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f150505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f150506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f150507c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[tei.b.values().length];
        try {
            iArr[tei.b.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tei.b.PROCESSING_BOOKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tei.b.PROCESSING_PAYMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[tei.b.PARTIALLY_COMPLETED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[tei.b.PROCESSING_CANCELLATION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[tei.b.FAILED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[tei.b.CANCELLED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[tei.b.CONFIRMED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f150505a = iArr;
        int[] iArr2 = new int[j.values().length];
        try {
            iArr2[j.CONFIRMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[j.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[j.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        f150506b = iArr2;
        int[] iArr3 = new int[fgi.a.values().length];
        try {
            iArr3[fgi.a.VRBO.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        f150507c = iArr3;
        int[] iArr4 = new int[cgi.e.values().length];
        try {
            iArr4[cgi.e.PAY_NOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[cgi.e.PAY_LATER.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        d = iArr4;
    }
}
