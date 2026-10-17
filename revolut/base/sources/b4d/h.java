package b4d;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12303a;

    static {
        int[] iArr = new int[mgd.f.values().length];
        try {
            iArr[mgd.f.TARGET_PRICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mgd.f.PRICE_CHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f12303a = iArr;
    }
}
