package q7c;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f242810a;

    static {
        int[] iArr = new int[uib.c.values().length];
        try {
            iArr[uib.c.SAVINGS_AND_FUNDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[uib.c.SAVINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[uib.c.FLEXIBLE_CASH_FUNDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[uib.c.FLEXIBLE_ACCOUNTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[uib.c.INTEREST.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f242810a = iArr;
    }
}
