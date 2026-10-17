package n05;

import com.revolut.feature.credit.health.impl.domain.model.CreditScoreInsight;
import com.revolut.feature.credit.health.impl.domain.model.CreditScoreInsightAction;
import com.revolut.feature.credit.health.impl.domain.model.CreditScoreInsightActionId;
import com.revolut.feature.credit.health.impl.domain.model.CreditScoreInsights;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m05.m;
import m05.p;
import m05.s;
import m05.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {
    public static p a(int i, Double d, Double d5, Double d6, Double d10, Integer num, Integer num2, Integer num3, Integer num4) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            d = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            d5 = null;
        }
        if ((i & 16) != 0) {
            num3 = null;
        }
        if ((i & 32) != 0) {
            num4 = null;
        }
        if ((i & 64) != 0) {
            d6 = null;
        }
        if ((i & 128) != 0) {
            d10 = null;
        }
        Double d15 = d5;
        return new p(num, d, num2, d15, num3, num4, d6, d10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:136:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.credit.health.impl.domain.model.CreditScoreInsights b(m05.m r19) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n05.a.b(m05.m):com.revolut.feature.credit.health.impl.domain.model.CreditScoreInsights");
    }

    public static final m c(CreditScoreInsights creditScoreInsights) {
        String str;
        p pVarA;
        Intrinsics.checkNotNullParameter(creditScoreInsights, "<this>");
        String string = creditScoreInsights.f69988a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        ArrayList<CreditScoreInsight> arrayList = creditScoreInsights.f69989b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (CreditScoreInsight creditScoreInsight : arrayList) {
            String strName = creditScoreInsight.f69962a.name();
            String strName2 = creditScoreInsight.f69963b.name();
            ArrayList<CreditScoreInsightAction> arrayList3 = creditScoreInsight.f69964c;
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
            for (CreditScoreInsightAction creditScoreInsightAction : arrayList3) {
                CreditScoreInsightActionId creditScoreInsightActionId = creditScoreInsightAction.f69965a;
                if (creditScoreInsightActionId instanceof CreditScoreInsightActionId.UpdateLocalPhoneNumber) {
                    str = "UPDATE_LOCAL_PHONE_NUMBER";
                } else if (creditScoreInsightActionId instanceof CreditScoreInsightActionId.ApplySecuredCreditCard) {
                    str = "APPLY_SECURED_CREDIT_CARD";
                } else if (creditScoreInsightActionId instanceof CreditScoreInsightActionId.CheckCreditBureauData) {
                    str = "CHECK_CREDIT_BUREAU_DATA";
                } else if (creditScoreInsightActionId instanceof CreditScoreInsightActionId.PayDownBalancesEarly) {
                    str = "PAY_DOWN_BALANCES_EARLY";
                } else if (creditScoreInsightActionId instanceof CreditScoreInsightActionId.SwitchSalaryToRevolut) {
                    str = "SWITCH_SALARY_TO_REVOLUT";
                } else if (creditScoreInsightActionId instanceof CreditScoreInsightActionId.UpdateId) {
                    str = "UPDATE_ID";
                } else if (creditScoreInsightActionId instanceof CreditScoreInsightActionId.CompleteRepayment) {
                    str = "COMPLETE_REPAYMENT";
                } else if (creditScoreInsightActionId instanceof CreditScoreInsightActionId.CloseUnusedCreditCards) {
                    str = "CLOSE_UNUSED_CREDIT_CARDS";
                } else if (creditScoreInsightActionId instanceof CreditScoreInsightActionId.CloseUnusedCreditAccounts) {
                    str = "CLOSE_UNUSED_CREDIT_ACCOUNTS";
                } else if (creditScoreInsightActionId instanceof CreditScoreInsightActionId.UseRevolutBudgetingTools) {
                    str = "USE_REVOLUT_BUDGETING_TOOLS";
                } else if (creditScoreInsightActionId instanceof CreditScoreInsightActionId.KeepFixedDebtsLow) {
                    str = "KEEP_FIXED_DEBTS_LOW";
                } else if (creditScoreInsightActionId instanceof CreditScoreInsightActionId.MaintainSavings) {
                    str = "MAINTAIN_SAVINGS";
                } else if (creditScoreInsightActionId instanceof CreditScoreInsightActionId.SettleOverdueBalances) {
                    str = "SETTLE_OVERDUE_BALANCES";
                } else if (creditScoreInsightActionId instanceof CreditScoreInsightActionId.StayUnderUtilisation) {
                    str = "STAY_UNDER_UTILISATION";
                } else if (creditScoreInsightActionId instanceof CreditScoreInsightActionId.WaitBeforeApplying) {
                    str = "WAIT_BEFORE_APPLYING";
                } else if (creditScoreInsightActionId instanceof CreditScoreInsightActionId.ReduceMonthlySpending) {
                    str = "REDUCE_MONTHLY_SPENDING";
                } else if (creditScoreInsightActionId instanceof CreditScoreInsightActionId.IncreaseSavings) {
                    str = "INCREASE_SAVINGS";
                } else {
                    if (!(creditScoreInsightActionId instanceof CreditScoreInsightActionId.LowerMonthlyDebtRepayments)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "LOWER_MONTHLY_DEBT_REPAYMENTS";
                }
                String strName3 = creditScoreInsightAction.f69966b.name();
                CreditScoreInsightActionId creditScoreInsightActionId2 = creditScoreInsightAction.f69965a;
                if (creditScoreInsightActionId2 instanceof CreditScoreInsightActionId.SettleOverdueBalances) {
                    pVarA = a(254, null, null, null, null, Integer.valueOf(((CreditScoreInsightActionId.SettleOverdueBalances) creditScoreInsightActionId2).f69981a), null, null, null);
                } else if (creditScoreInsightActionId2 instanceof CreditScoreInsightActionId.StayUnderUtilisation) {
                    pVarA = a(Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION, Double.valueOf(((CreditScoreInsightActionId.StayUnderUtilisation) creditScoreInsightActionId2).f69982a), null, null, null, null, null, null, null);
                } else if (creditScoreInsightActionId2 instanceof CreditScoreInsightActionId.WaitBeforeApplying) {
                    pVarA = a(Constants.TAG_FB_CHARGING_STATUS, null, null, null, null, null, Integer.valueOf(((CreditScoreInsightActionId.WaitBeforeApplying) creditScoreInsightActionId2).f69987a), null, null);
                } else if (creditScoreInsightActionId2 instanceof CreditScoreInsightActionId.ReduceMonthlySpending) {
                    pVarA = a(Constants.TAG_BLE_FIRMWARE_VERSION, null, Double.valueOf(((CreditScoreInsightActionId.ReduceMonthlySpending) creditScoreInsightActionId2).f69980a), null, null, null, null, null, null);
                } else if (creditScoreInsightActionId2 instanceof CreditScoreInsightActionId.IncreaseSavings) {
                    CreditScoreInsightActionId.IncreaseSavings increaseSavings = (CreditScoreInsightActionId.IncreaseSavings) creditScoreInsightActionId2;
                    pVarA = a(Constants.TAG_CF_ENHANCED_SRED_CONFIGURATION, null, null, null, null, null, null, Integer.valueOf(increaseSavings.f69972a), Integer.valueOf(increaseSavings.f69973b));
                } else if (creditScoreInsightActionId2 instanceof CreditScoreInsightActionId.LowerMonthlyDebtRepayments) {
                    CreditScoreInsightActionId.LowerMonthlyDebtRepayments lowerMonthlyDebtRepayments = (CreditScoreInsightActionId.LowerMonthlyDebtRepayments) creditScoreInsightActionId2;
                    pVarA = a(63, null, null, Double.valueOf(lowerMonthlyDebtRepayments.f69975a), Double.valueOf(lowerMonthlyDebtRepayments.f69976b), null, null, null, null);
                } else if (creditScoreInsightActionId2 instanceof CreditScoreInsightActionId.MaintainSavings) {
                    CreditScoreInsightActionId.MaintainSavings maintainSavings = (CreditScoreInsightActionId.MaintainSavings) creditScoreInsightActionId2;
                    pVarA = a(Constants.TAG_CF_ENHANCED_SRED_CONFIGURATION, null, null, null, null, null, null, Integer.valueOf(maintainSavings.f69977a), Integer.valueOf(maintainSavings.f69978b));
                } else {
                    if (!(creditScoreInsightActionId2 instanceof CreditScoreInsightActionId.UpdateLocalPhoneNumber) && !(creditScoreInsightActionId2 instanceof CreditScoreInsightActionId.ApplySecuredCreditCard) && !(creditScoreInsightActionId2 instanceof CreditScoreInsightActionId.CheckCreditBureauData) && !(creditScoreInsightActionId2 instanceof CreditScoreInsightActionId.PayDownBalancesEarly) && !(creditScoreInsightActionId2 instanceof CreditScoreInsightActionId.SwitchSalaryToRevolut) && !(creditScoreInsightActionId2 instanceof CreditScoreInsightActionId.UpdateId) && !(creditScoreInsightActionId2 instanceof CreditScoreInsightActionId.CompleteRepayment) && !(creditScoreInsightActionId2 instanceof CreditScoreInsightActionId.CloseUnusedCreditCards) && !(creditScoreInsightActionId2 instanceof CreditScoreInsightActionId.CloseUnusedCreditAccounts) && !(creditScoreInsightActionId2 instanceof CreditScoreInsightActionId.UseRevolutBudgetingTools) && !(creditScoreInsightActionId2 instanceof CreditScoreInsightActionId.KeepFixedDebtsLow)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pVarA = null;
                }
                arrayList4.add(new s(str, strName3, pVarA));
            }
            arrayList2.add(new v(strName, strName2, arrayList4));
        }
        return new m(string, arrayList2);
    }
}
