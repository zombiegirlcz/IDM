package mle;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f206688a;

    static {
        int[] iArr = new int[hke.a.values().length];
        try {
            iArr[hke.a.ALL_SETTINGS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hke.a.STOCKS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hke.a.ROBO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[hke.a.TAA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f206688a = iArr;
    }
}
