package y65;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f311174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f311175b;

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
        f311174a = iArr;
        int[] iArr2 = new int[com.revolut.feature.credit.loan.api.models.rev10.j.values().length];
        try {
            iArr2[com.revolut.feature.credit.loan.api.models.rev10.j.RepaymentDeferral.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[com.revolut.feature.credit.loan.api.models.rev10.j.Prolongation.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[com.revolut.feature.credit.loan.api.models.rev10.j.InterestFreePeriod.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[com.revolut.feature.credit.loan.api.models.rev10.j.InterestOnlyWithoutTermExtension.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[com.revolut.feature.credit.loan.api.models.rev10.j.ZeroLoanAmount.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[com.revolut.feature.credit.loan.api.models.rev10.j.InterestOnlyPeriod.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[com.revolut.feature.credit.loan.api.models.rev10.j.TokenRepaymentPlan.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        f311175b = iArr2;
    }
}
