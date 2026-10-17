package o65;

import q35.k0;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f222505a;

    static {
        int[] iArr = new int[k0.values().length];
        try {
            iArr[k0.LoanHasOutstandingRepayment.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k0.LoanInOverdue.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k0.LimitPerPeriodReached.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k0.RepaymentDayChangeAlreadyDone.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k0.LoanHasTokenRepaymentPlanActive.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[k0.LoanHasZeroLoanAmountRenegotiationActive.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[k0.LoanHasInterestOnlyWithoutTermExtensionRenegotiationActive.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[k0.LoanHasRepaymentDeferralRenegotiationActive.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[k0.LoanHasProlongationRenegotiationActive.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[k0.LoanHasInterestFreePeriodRenegotiationActive.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[k0.LoanHasNoScheduledRepaymentsPaid.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[k0.ToggledOff.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[k0.LoanInactive.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[k0.LoanAgreementTerminated.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[k0.LoanAgreementCancelled.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[k0.LoanHasNoScheduledRepaymentsLeft.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[k0.LoanInSubmissionWindow.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[k0.LoanHasPendingRepaymentRequest.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[k0.Unknown.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        f222505a = iArr;
    }
}
