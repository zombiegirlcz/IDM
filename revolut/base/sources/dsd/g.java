package dsd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f117297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f117298b;

    static {
        int[] iArr = new int[amd.b.values().length];
        try {
            iArr[amd.b.LOANS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[amd.b.CREDIT_CARDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[amd.b.PAY_LATER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f117297a = iArr;
        int[] iArr2 = new int[yld.g.values().length];
        try {
            iArr2[yld.g.ASSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[yld.g.LIABILITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f117298b = iArr2;
    }
}
