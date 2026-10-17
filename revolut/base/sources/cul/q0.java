package cul;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f109158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f109159b;

    static {
        int[] iArr = new int[k4l.r0.values().length];
        try {
            iArr[k4l.r0.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k4l.r0.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k4l.r0.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k4l.r0.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f109158a = iArr;
        int[] iArr2 = new int[f8l.c.values().length];
        try {
            iArr2[f8l.c.SECURITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[f8l.c.FIAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[f8l.c.CRYPTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[f8l.c.COMMODITY.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[f8l.c.UNDEFINED.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        f109159b = iArr2;
    }
}
