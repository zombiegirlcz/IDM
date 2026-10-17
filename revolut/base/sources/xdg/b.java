package xdg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f304439a;

    static {
        int[] iArr = new int[sei.a.values().length];
        try {
            iArr[sei.a.AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sei.a.PRICE_CHANGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[sei.a.UNAVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f304439a = iArr;
    }
}
