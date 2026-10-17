package r40;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f251326a;

    static {
        int[] iArr = new int[j30.b.values().length];
        try {
            iArr[j30.b.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j30.b.PARTIALLY_ENABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j30.b.FULLY_ENABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f251326a = iArr;
    }
}
