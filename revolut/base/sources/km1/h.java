package km1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f185675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f185676b;

    static {
        int[] iArr = new int[xo1.b.values().length];
        try {
            iArr[xo1.b.BILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xo1.b.MOBILE_TOPUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f185675a = iArr;
        int[] iArr2 = new int[cm1.a.values().length];
        try {
            iArr2[cm1.a.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[cm1.a.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[cm1.a.BIWEEKLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[cm1.a.MONTHLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[cm1.a.QUARTERLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[cm1.a.SEMIANNUALLY.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[cm1.a.ANNUALLY.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        f185676b = iArr2;
    }
}
