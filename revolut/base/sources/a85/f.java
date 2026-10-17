package a85;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class f {
    public static TextLocalisedClause a(n35.f fVar, LoanRepaymentTerms.ScheduleInfo scheduleInfo, n35.h hVar) {
        LocalDate localDate;
        int i = fVar == null ? -1 : e.f2111a[fVar.ordinal()];
        if (i != -1) {
            if (i == 1) {
                dj0.d dVarA = a55.b.a(scheduleInfo != null ? scheduleInfo.f70101c : null);
                if (dVarA != null) {
                    int i2 = e.f2112b[hVar.ordinal()];
                    if (i2 == 1) {
                        return new TextLocalisedClause(R$string.loan_management_schedule_v2_repayment_info_healthy_final_repayment_reduced, u.c(sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, dVarA)), null, 12);
                    }
                    if (i2 == 2) {
                        return new TextLocalisedClause(R$string.loan_management_schedule_v2_repayment_info_outstanding_final_repayment_reduced, u.c(sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, dVarA)), null, 12);
                    }
                    if (i2 == 3 || i2 == 4) {
                        return new TextLocalisedClause(R$string.loan_management_schedule_v2_repayment_info_overdue_final_repayment_reduced, u.c(sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, dVarA)), null, 12);
                    }
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else if (i == 2) {
                dj0.d dVarA2 = a55.b.a(scheduleInfo != null ? scheduleInfo.f70100b : null);
                if (dVarA2 != null) {
                    int i3 = e.f2112b[hVar.ordinal()];
                    if (i3 == 1) {
                        return new TextLocalisedClause(R$string.loan_management_schedule_v2_repayment_info_healthy_monthly_repayments_reduced, u.c(sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, dVarA2)), null, 12);
                    }
                    if (i3 == 2) {
                        return new TextLocalisedClause(R$string.loan_management_schedule_v2_repayment_info_outstanding_future_payments_reduced, u.c(sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, dVarA2)), null, 12);
                    }
                    if (i3 == 3 || i3 == 4) {
                        return new TextLocalisedClause(R$string.loan_management_schedule_v2_repayment_info_overdue_future_repayments_reduced, u.c(sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, dVarA2)), null, 12);
                    }
                    if (i3 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else if (i == 3) {
                dj0.d dVarA3 = a55.b.a(scheduleInfo != null ? scheduleInfo.f70099a : null);
                if (dVarA3 != null) {
                    int i5 = e.f2112b[hVar.ordinal()];
                    if (i5 == 1) {
                        return new TextLocalisedClause(R$string.loan_management_schedule_v2_repayment_info_healthy_next_repayment_reduced, u.c(sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, dVarA3)), null, 12);
                    }
                    if (i5 == 2) {
                        return new TextLocalisedClause(R$string.loan_management_schedule_v2_repayment_info_outstanding_next_repayment_reduced, u.c(sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, dVarA3)), null, 12);
                    }
                    if (i5 == 3 || i5 == 4) {
                        return new TextLocalisedClause(R$string.loan_management_schedule_v2_repayment_info_overdue_next_repayment_reduced, u.c(sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, dVarA3)), null, 12);
                    }
                    if (i5 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                LoanRepaymentTerms.DateDifference dateDifference = scheduleInfo != null ? scheduleInfo.e : null;
                if (dateDifference != null && (localDate = dateDifference.f70098b) != null) {
                    long jUntil = localDate.until(dateDifference.f70097a, ChronoUnit.MONTHS);
                    int i6 = e.f2112b[hVar.ordinal()];
                    if (i6 == 1) {
                        return new TextLocalisedClause(R$string.loan_management_schedule_v2_repayment_info_healthy_term_reduced, u.c(new TextLocalisedQuantityClause(R$plurals.months, Long.valueOf(jUntil), (List) null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 12)), null, 12);
                    }
                    if (i6 == 2) {
                        return new TextLocalisedClause(R$string.loan_management_schedule_v2_repayment_info_outstanding_term_reduced, u.c(new TextLocalisedQuantityClause(R$plurals.months, Long.valueOf(jUntil), (List) null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 12)), null, 12);
                    }
                    if (i6 == 3 || i6 == 4) {
                        return new TextLocalisedClause(R$string.loan_management_schedule_v2_repayment_info_overdue_term_reduced, u.c(new TextLocalisedQuantityClause(R$plurals.months, Long.valueOf(jUntil), (List) null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 12)), null, 12);
                    }
                    if (i6 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return null;
    }
}
