package nvk;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f219741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f219742b;

    static {
        int[] iArr = new int[uqk.l.values().length];
        try {
            iArr[uqk.l.INCOME_STATEMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[uqk.l.BALANCE_SHEET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[uqk.l.CASH_FLOWS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f219741a = iArr;
        int[] iArr2 = new int[uqk.e.values().length];
        try {
            iArr2[uqk.e.ANNUALLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[uqk.e.QUARTERLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f219742b = iArr2;
    }
}
