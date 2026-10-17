package dt7;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f117397a;

    static {
        int[] iArr = new int[ps7.b.values().length];
        try {
            iArr[ps7.b.SHOW_CONFIRMATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ps7.b.SHOW_COVERAGE_DETAILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ps7.b.CANCEL_INSURANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ps7.b.KEEP_INSURANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f117397a = iArr;
    }
}
