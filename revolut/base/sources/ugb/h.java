package ugb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f279996a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.TAX_RESIDENCY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.EMPLOYMENT_CONTRACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.SELF_EMPLOYMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b.FIT_FOR_WORK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[b.DATA_SHARING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[b.OTHER_INCOME_INSURANCE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f279996a = iArr;
    }
}
