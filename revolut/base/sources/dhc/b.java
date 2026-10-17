package dhc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f114777a;

    static {
        int[] iArr = new int[egc.a.values().length];
        try {
            iArr[egc.a.RENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[egc.a.BILLS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f114777a = iArr;
    }
}
