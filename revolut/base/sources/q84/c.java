package q84;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f242971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f242972b;

    static {
        int[] iArr = new int[pu3.d.values().length];
        try {
            iArr[pu3.d.MORTGAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pu3.d.CREDIT_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pu3.d.LOAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pu3.d.LINE_OF_CREDIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[pu3.d.OVERDRAFT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[pu3.d.BNPL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f242971a = iArr;
        int[] iArr2 = new int[pu3.e.values().length];
        try {
            iArr2[pu3.e.MONTHLY_REPAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[pu3.e.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f242972b = iArr2;
    }
}
