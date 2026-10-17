package iv3;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f168706a;

    static {
        int[] iArr = new int[it3.f.values().length];
        try {
            iArr[it3.f.INCOME_FETCH_READY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[it3.f.INCOME_FETCH_STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[it3.f.INCOME_FETCH_FINISHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[it3.f.INCOME_FETCH_FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[it3.f.INCOME_FETCH_BLOCKED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[it3.f.INCOME_CHECK_PASSED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[it3.f.INCOME_CHECK_FAILED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[it3.f.INCOME_CHECK_SKIPPED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f168706a = iArr;
    }
}
