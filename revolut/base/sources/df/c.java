package df;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f113723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f113724b;

    static {
        int[] iArr = new int[ff.f.values().length];
        f113724b = iArr;
        try {
            iArr[ff.f.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f113724b[ff.f.BAD_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f113724b[ff.f.AUTH_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[ff.d.values().length];
        f113723a = iArr2;
        try {
            iArr2[ff.d.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f113723a[ff.d.BAD_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
