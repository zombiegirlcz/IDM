package bul;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18907a;

    static {
        int[] iArr = new int[k4l.k.values().length];
        try {
            iArr[k4l.k.TODAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k4l.k.NEXT_TRADING_DAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k4l.k.ONE_WEEK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k4l.k.NINETY_DAYS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k4l.k.SIX_MONTHS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[k4l.k.CUSTOM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f18907a = iArr;
    }
}
