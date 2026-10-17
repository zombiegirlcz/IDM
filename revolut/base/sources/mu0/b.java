package mu0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208942a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.LARGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f208942a = iArr;
    }
}
