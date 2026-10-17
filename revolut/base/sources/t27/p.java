package t27;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f267439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f267440b;

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
        f267439a = iArr;
        int[] iArr2 = new int[es6.b.values().length];
        try {
            iArr2[es6.b.FIXED_PERCENTAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[es6.b.PER_PRODUCT_PERCENTAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f267440b = iArr2;
    }
}
