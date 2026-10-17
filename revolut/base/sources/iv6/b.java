package iv6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f168752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f168753b;

    static {
        int[] iArr = new int[pr6.j.values().length];
        try {
            iArr[pr6.j.BANK_TRANSFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pr6.j.OPEN_BANKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pr6.j.PAY_WITH_REVOLUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pr6.j.SEPA_DIRECT_DEBIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f168752a = iArr;
        int[] iArr2 = new int[or6.a.values().length];
        try {
            iArr2[or6.a.FAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[or6.a.PASS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f168753b = iArr2;
    }
}
