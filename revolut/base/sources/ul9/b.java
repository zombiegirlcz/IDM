package ul9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f280908a;

    static {
        int[] iArr = new int[bla.c.values().length];
        try {
            iArr[bla.c.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bla.c.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[bla.c.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[bla.c.NOT_AVAILABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f280908a = iArr;
    }
}
