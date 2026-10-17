package cbh;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22816a;

    static {
        int[] iArr = new int[g0.values().length];
        try {
            iArr[g0.INIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g0.LOAD_UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g0.LOAD_DOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g0.RETRY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f22816a = iArr;
    }
}
