package ms0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f208178b;

    static {
        int[] iArr = new int[y4.values().length];
        try {
            iArr[y4.LARGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y4.SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f208177a = iArr;
        int[] iArr2 = new int[x4.values().length];
        try {
            iArr2[x4.SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[x4.MINUTES.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f208178b = iArr2;
    }
}
