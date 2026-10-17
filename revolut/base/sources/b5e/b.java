package b5e;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12490a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.GET_STARTED_BUY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f12490a = iArr;
    }
}
