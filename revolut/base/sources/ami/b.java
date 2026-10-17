package ami;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6435a;

    static {
        int[] iArr = new int[wli.q.values().length];
        try {
            iArr[wli.q.EXTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wli.q.PROGRAMMATIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f6435a = iArr;
    }
}
