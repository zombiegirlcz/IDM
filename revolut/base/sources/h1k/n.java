package h1k;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f148604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f148605b;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.TODAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.YESTERDAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m.PREVIOUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f148604a = iArr;
        int[] iArr2 = new int[rzj.g.values().length];
        try {
            iArr2[rzj.g.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[rzj.g.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[rzj.g.COMMODITIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[rzj.g.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f148605b = iArr2;
    }
}
