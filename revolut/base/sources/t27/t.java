package t27;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f267444a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.PRODUCT_TAX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.FIXED_PERCENTAGE_TAX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f267444a = iArr;
    }
}
