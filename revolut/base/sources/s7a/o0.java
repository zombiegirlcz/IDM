package s7a;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f260621a;

    static {
        int[] iArr = new int[w.values().length];
        try {
            iArr[w.HIDDEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w.SHOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w.DEPENDS_ON_CONTENT_COUNT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f260621a = iArr;
    }
}
