package a2f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f831a;

    static {
        int[] iArr = new int[u2f.i.values().length];
        try {
            iArr[u2f.i.NUMERIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u2f.i.ALPHANUMERIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f831a = iArr;
    }
}
