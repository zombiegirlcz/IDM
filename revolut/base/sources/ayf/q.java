package ayf;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11179a;

    static {
        int[] iArr = new int[fxf.a.values().length];
        try {
            iArr[fxf.a.FINE_LOCATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fxf.a.COARSE_LOCATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fxf.a.ANY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f11179a = iArr;
    }
}
