package asi;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8933a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.EXIST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.SCOPED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.ABSENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c.UNAUTHORIZED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[c.EXPIRED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f8933a = iArr;
    }
}
