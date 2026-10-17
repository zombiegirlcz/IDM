package rsd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f257049a;

    static {
        int[] iArr = new int[tsd.a.values().length];
        try {
            iArr[tsd.a.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tsd.a.COMMODITIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tsd.a.TAA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[tsd.a.ROBO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[tsd.a.CFDS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f257049a = iArr;
    }
}
