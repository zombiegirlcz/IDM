package xod;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f307814a;

    static {
        int[] iArr = new int[zod.a.values().length];
        try {
            iArr[zod.a.SPENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zod.a.EXPENSES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zod.a.NET_BALANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[zod.a.INCOME.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[zod.a.CASHFLOW.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[zod.a.SALES.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f307814a = iArr;
    }
}
