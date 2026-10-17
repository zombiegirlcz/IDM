package w01;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f293606a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.FIT_XY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.CENTER_IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.CENTER_OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f293606a = iArr;
    }
}
