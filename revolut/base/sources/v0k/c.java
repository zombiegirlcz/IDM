package v0k;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f284917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f284918b;

    static {
        int[] iArr = new int[qzj.c.values().length];
        try {
            iArr[qzj.c.TOP_STORIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qzj.c.NEWS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f284917a = iArr;
        int[] iArr2 = new int[rzj.g.values().length];
        try {
            iArr2[rzj.g.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[rzj.g.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[rzj.g.COMMODITIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[rzj.g.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f284918b = iArr2;
    }
}
