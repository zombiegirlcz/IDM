package vrl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f291671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f291672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f291673c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[q0.values().length];
        try {
            iArr[q0.LEGACY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q0.NEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q0.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f291671a = iArr;
        int[] iArr2 = new int[bfl.g.values().length];
        try {
            iArr2[bfl.g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[bfl.g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f291672b = iArr2;
        int[] iArr3 = new int[f8l.c.values().length];
        try {
            iArr3[f8l.c.SECURITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[f8l.c.FIAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[f8l.c.CRYPTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[f8l.c.COMMODITY.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[f8l.c.UNDEFINED.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        f291673c = iArr3;
        int[] iArr4 = new int[k4l.r0.values().length];
        try {
            iArr4[k4l.r0.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[k4l.r0.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[k4l.r0.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[k4l.r0.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        d = iArr4;
    }
}
