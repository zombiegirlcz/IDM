package i4h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f158480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f158481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f158482c;

    static {
        int[] iArr = new int[nel.p0.values().length];
        try {
            iArr[nel.p0.PRE_MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[nel.p0.OPEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[nel.p0.AFTER_HOURS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[nel.p0.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[nel.p0.UNDEFINED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f158480a = iArr;
        int[] iArr2 = new int[i4l.a.values().length];
        try {
            iArr2[i4l.a.LINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[i4l.a.CANDLESTICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f158481b = iArr2;
        int[] iArr3 = new int[eel.i.values().length];
        try {
            iArr3[eel.i.PRICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[eel.i.YTM.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        f158482c = iArr3;
    }
}
