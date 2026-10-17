package nbm;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f214094a;

    static {
        int[] iArr = new int[e.values().length];
        f214094a = iArr;
        try {
            iArr[e.SLOW_SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f214094a[e.SLOW_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f214094a[e.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
