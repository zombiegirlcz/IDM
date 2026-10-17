package a85;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f2112b;

    static {
        int[] iArr = new int[n35.f.values().length];
        try {
            iArr[n35.f.FinalPaymentReduction.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n35.f.MonthlyPaymentReduction.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n35.f.NextPaymentReduction.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n35.f.TermReduction.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f2111a = iArr;
        int[] iArr2 = new int[n35.h.values().length];
        try {
            iArr2[n35.h.PartialHealthy.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[n35.h.PartialOutstanding.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[n35.h.PartialOverdue.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[n35.h.PartialOutstandingOverdue.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[n35.h.FullRepayment.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        f2112b = iArr2;
    }
}
