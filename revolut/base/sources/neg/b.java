package neg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f214512a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.GONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f214512a = iArr;
    }
}
