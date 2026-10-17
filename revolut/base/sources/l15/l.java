package l15;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f191469a;

    static {
        int[] iArr = new int[ux4.j.values().length];
        try {
            iArr[ux4.j.LOAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ux4.j.CREDIT_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ux4.j.MORTGAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ux4.j.PAY_LATER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ux4.j.OVERDRAFT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f191469a = iArr;
    }
}
