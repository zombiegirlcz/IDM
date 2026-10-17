package xmd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f307193a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.AVERAGE_SPENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.RECURRING_EXPENSES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.ROUNDED_AMOUNT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f307193a = iArr;
    }
}
