package tb5;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f269467a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.FIXED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.MIN_REPAYMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.STATEMENT_BALANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f269467a = iArr;
    }
}
