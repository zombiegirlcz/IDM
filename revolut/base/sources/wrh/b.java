package wrh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f299580a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.HORIZONTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.VERTICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f299580a = iArr;
    }
}
