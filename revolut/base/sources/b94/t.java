package b94;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13663a;

    static {
        int[] iArr = new int[pu3.d.values().length];
        try {
            iArr[pu3.d.MORTGAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pu3.d.LOAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pu3.d.CREDIT_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pu3.d.BNPL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[pu3.d.LINE_OF_CREDIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[pu3.d.OVERDRAFT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f13663a = iArr;
    }
}
