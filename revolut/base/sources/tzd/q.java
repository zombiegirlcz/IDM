package tzd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f275936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f275937b;

    static {
        int[] iArr = new int[ayd.a.values().length];
        try {
            iArr[ayd.a.AccountStatement.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ayd.a.ProfitAndLossStatement.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f275936a = iArr;
        int[] iArr2 = new int[h.values().length];
        try {
            iArr2[h.PDF.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[h.EXCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f275937b = iArr2;
    }
}
