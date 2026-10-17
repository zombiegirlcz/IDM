package k1i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f180277a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.PRESENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.FUTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f180277a = iArr;
    }
}
