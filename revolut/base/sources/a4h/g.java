package a4h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1276a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.ANNUAL_REPORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.SEMIANNUAL_REPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.QUARTERLY_REPORT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f.MONTHLY_REPORT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[f.KID.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[f.PROSPECTUS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f1276a = iArr;
    }
}
