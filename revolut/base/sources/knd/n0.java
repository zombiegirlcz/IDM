package knd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f186118a;

    static {
        int[] iArr = new int[yld.d.values().length];
        try {
            iArr[yld.d.SPENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yld.d.INCOME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yld.d.EARNINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yld.d.CASHFLOW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[yld.d.SALES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[yld.d.NET_BALANCE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f186118a = iArr;
    }
}
