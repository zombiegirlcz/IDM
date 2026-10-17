package iuk;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f168656a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.INSIGHTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.TECHNICALS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.SENTIMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.FUNDAMENTALS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[a.ANALYST_RATINGS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f168656a = iArr;
    }
}
