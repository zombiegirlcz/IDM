package xmd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f307206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f307207b;

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
        f307206a = iArr;
        int[] iArr2 = new int[lzi.v.values().length];
        try {
            iArr2[lzi.v.VERY_LOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[lzi.v.TOO_HIGH.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[lzi.v.AMBITIOUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[lzi.v.SUGGESTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[lzi.v.COMFORTABLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        f307207b = iArr2;
    }
}
