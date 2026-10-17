package bzh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f20030b;

    static {
        int[] iArr = new int[kyh.f.values().length];
        try {
            iArr[kyh.f.EXCEEDED_CRYPTO_LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kyh.f.FAILED_CRYPTO_LOWER_LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kyh.f.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f20029a = iArr;
        int[] iArr2 = new int[kyh.g.values().length];
        try {
            iArr2[kyh.g.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[kyh.g.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f20030b = iArr2;
    }
}
