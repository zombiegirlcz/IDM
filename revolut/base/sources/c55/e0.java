package c55;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f21434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f21435c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[b95.a.values().length];
        try {
            iArr[b95.a.PERSONAL_LOAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b95.a.REFINANCING_LOAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b95.a.MORTGAGE_LOAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f21433a = iArr;
        int[] iArr2 = new int[n35.i.values().length];
        try {
            iArr2[n35.i.ExactDueAmount.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[n35.i.LessThanDue.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[n35.i.MoreThanDue.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f21434b = iArr2;
        int[] iArr3 = new int[n35.h.values().length];
        try {
            iArr3[n35.h.FullRepayment.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[n35.h.PartialHealthy.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[n35.h.PartialOutstandingOverdue.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[n35.h.PartialOutstanding.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[n35.h.PartialOverdue.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        f21435c = iArr3;
        int[] iArr4 = new int[n35.f.values().length];
        try {
            iArr4[n35.f.TermReduction.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[n35.f.FinalPaymentReduction.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[n35.f.MonthlyPaymentReduction.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[n35.f.NextPaymentReduction.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        d = iArr4;
    }
}
