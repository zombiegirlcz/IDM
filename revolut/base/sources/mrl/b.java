package mrl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208156a;

    static {
        int[] iArr = new int[k4l.d.values().length];
        try {
            iArr[k4l.d.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k4l.d.TAA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k4l.d.COMMODITIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k4l.d.MARGIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f208156a = iArr;
    }
}
