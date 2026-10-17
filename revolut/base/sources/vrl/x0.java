package vrl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f291687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f291688b;

    static {
        int[] iArr = new int[k4l.o0.values().length];
        try {
            iArr[k4l.o0.RECEIVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k4l.o0.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k4l.o0.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k4l.o0.DECLINED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k4l.o0.FILLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[k4l.o0.PARTIALLY_FILLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f291687a = iArr;
        int[] iArr2 = new int[k4l.q0.values().length];
        try {
            iArr2[k4l.q0.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[k4l.q0.GTC.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[k4l.q0.GOOD_TIL_EXT_MARKET.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[k4l.q0.MARKET_ON_OPEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        f291688b = iArr2;
    }
}
