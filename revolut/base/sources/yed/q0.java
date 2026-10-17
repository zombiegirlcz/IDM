package yed;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f312890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f312891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f312892c;

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
        f312890a = iArr;
        int[] iArr2 = new int[mgd.b.values().length];
        try {
            iArr2[mgd.b.ONE_TIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[mgd.b.RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f312891b = iArr2;
        int[] iArr3 = new int[mgd.e.values().length];
        try {
            iArr3[mgd.e.ONE_HOUR.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[mgd.e.ONE_DAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f312892c = iArr3;
    }
}
