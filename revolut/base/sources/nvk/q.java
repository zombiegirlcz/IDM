package nvk;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f219729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f219730b;

    static {
        int[] iArr = new int[uqk.e.values().length];
        try {
            iArr[uqk.e.ANNUALLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[uqk.e.QUARTERLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f219729a = iArr;
        int[] iArr2 = new int[uqk.l.values().length];
        try {
            iArr2[uqk.l.INCOME_STATEMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[uqk.l.BALANCE_SHEET.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[uqk.l.CASH_FLOWS.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f219730b = iArr2;
    }
}
