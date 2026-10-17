package q35;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class k0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 LimitPerPeriodReached;
    public static final k0 LoanAgreementCancelled;
    public static final k0 LoanAgreementTerminated;
    public static final k0 LoanHasInterestFreePeriodRenegotiationActive;
    public static final k0 LoanHasInterestOnlyWithoutTermExtensionRenegotiationActive;
    public static final k0 LoanHasNoScheduledRepaymentsLeft;
    public static final k0 LoanHasNoScheduledRepaymentsPaid;
    public static final k0 LoanHasOutstandingRepayment;
    public static final k0 LoanHasPendingRepaymentRequest;
    public static final k0 LoanHasProlongationRenegotiationActive;
    public static final k0 LoanHasRepaymentDeferralRenegotiationActive;
    public static final k0 LoanHasTokenRepaymentPlanActive;
    public static final k0 LoanHasZeroLoanAmountRenegotiationActive;
    public static final k0 LoanInOverdue;
    public static final k0 LoanInSubmissionWindow;
    public static final k0 LoanInactive;
    public static final k0 RepaymentDayChangeAlreadyDone;
    public static final k0 ToggledOff;
    public static final k0 Unknown;

    static {
        k0 k0Var = new k0("LoanInactive", 0);
        LoanInactive = k0Var;
        k0 k0Var2 = new k0("LoanAgreementTerminated", 1);
        LoanAgreementTerminated = k0Var2;
        k0 k0Var3 = new k0("LoanAgreementCancelled", 2);
        LoanAgreementCancelled = k0Var3;
        k0 k0Var4 = new k0("ToggledOff", 3);
        ToggledOff = k0Var4;
        k0 k0Var5 = new k0("RepaymentDayChangeAlreadyDone", 4);
        RepaymentDayChangeAlreadyDone = k0Var5;
        k0 k0Var6 = new k0("LimitPerPeriodReached", 5);
        LimitPerPeriodReached = k0Var6;
        k0 k0Var7 = new k0("LoanHasZeroLoanAmountRenegotiationActive", 6);
        LoanHasZeroLoanAmountRenegotiationActive = k0Var7;
        k0 k0Var8 = new k0("LoanHasInterestOnlyWithoutTermExtensionRenegotiationActive", 7);
        LoanHasInterestOnlyWithoutTermExtensionRenegotiationActive = k0Var8;
        k0 k0Var9 = new k0("LoanHasRepaymentDeferralRenegotiationActive", 8);
        LoanHasRepaymentDeferralRenegotiationActive = k0Var9;
        k0 k0Var10 = new k0("LoanHasProlongationRenegotiationActive", 9);
        LoanHasProlongationRenegotiationActive = k0Var10;
        k0 k0Var11 = new k0("LoanHasInterestFreePeriodRenegotiationActive", 10);
        LoanHasInterestFreePeriodRenegotiationActive = k0Var11;
        k0 k0Var12 = new k0("LoanHasTokenRepaymentPlanActive", 11);
        LoanHasTokenRepaymentPlanActive = k0Var12;
        k0 k0Var13 = new k0("LoanInOverdue", 12);
        LoanInOverdue = k0Var13;
        k0 k0Var14 = new k0("LoanHasOutstandingRepayment", 13);
        LoanHasOutstandingRepayment = k0Var14;
        k0 k0Var15 = new k0("LoanHasNoScheduledRepaymentsPaid", 14);
        LoanHasNoScheduledRepaymentsPaid = k0Var15;
        k0 k0Var16 = new k0("LoanHasNoScheduledRepaymentsLeft", 15);
        LoanHasNoScheduledRepaymentsLeft = k0Var16;
        k0 k0Var17 = new k0("LoanInSubmissionWindow", 16);
        LoanInSubmissionWindow = k0Var17;
        k0 k0Var18 = new k0("LoanHasPendingRepaymentRequest", 17);
        LoanHasPendingRepaymentRequest = k0Var18;
        k0 k0Var19 = new k0("Unknown", 18);
        Unknown = k0Var19;
        k0[] k0VarArr = {k0Var, k0Var2, k0Var3, k0Var4, k0Var5, k0Var6, k0Var7, k0Var8, k0Var9, k0Var10, k0Var11, k0Var12, k0Var13, k0Var14, k0Var15, k0Var16, k0Var17, k0Var18, k0Var19};
        $VALUES = k0VarArr;
        $ENTRIES = vc.s.n(k0VarArr);
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }
}
