package efm;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f125388a;

    static {
        int[] iArr = new int[a.values().length];
        f125388a = iArr;
        try {
            iArr[a.DROP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f125388a[a.LATEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f125388a[a.MISSING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f125388a[a.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
