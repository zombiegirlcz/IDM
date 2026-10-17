package pi0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f236363a;

    static {
        int[] iArr = new int[od0.b.values().length];
        try {
            iArr[od0.b.DEVELOPMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[od0.b.BETA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[od0.b.PRODUCTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[od0.b.UNDEFINED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f236363a = iArr;
    }
}
