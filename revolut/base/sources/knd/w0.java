package knd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f186150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f186151b;

    static {
        int[] iArr = new int[fnd.a.values().length];
        try {
            iArr[fnd.a.INFLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fnd.a.OUTFLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f186150a = iArr;
        int[] iArr2 = new int[yld.d.values().length];
        try {
            iArr2[yld.d.SPENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[yld.d.INCOME.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[yld.d.NET_BALANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[yld.d.EARNINGS.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[yld.d.CASHFLOW.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[yld.d.SALES.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        f186151b = iArr2;
    }
}
