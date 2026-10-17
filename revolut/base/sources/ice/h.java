package ice;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f160250a;

    static {
        int[] iArr = new int[b9e.b.values().length];
        try {
            iArr[b9e.b.SUBSCRIPTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b9e.b.SCHEDULED_TRANSFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b9e.b.DIRECT_DEBIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b9e.b.INACTIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[b9e.b.BLOCKED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[b9e.b.PAY_LATER_REPAYMENT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[b9e.b.LOAN_PAYMENT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[b9e.b.BLOCKED_OR_INACTIVE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[b9e.b.BLOCKED_OR_DEACTIVATED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f160250a = iArr;
    }
}
