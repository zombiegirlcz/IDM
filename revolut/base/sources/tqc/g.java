package tqc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f273553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f273554b;

    static {
        int[] iArr = new int[cqc.d.values().length];
        try {
            iArr[cqc.d.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cqc.d.OPEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cqc.d.PENDING_REVIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[cqc.d.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[cqc.d.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f273553a = iArr;
        int[] iArr2 = new int[cqc.c.values().length];
        try {
            iArr2[cqc.c.FUNDS_SENT_TO_WRONG_ACCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[cqc.c.SALARY_NOT_RECEIVED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[cqc.c.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f273554b = iArr2;
    }
}
