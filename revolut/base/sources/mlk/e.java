package mlk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$plurals;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import java.time.Period;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {
    public static TextLocalisedClause a(hha.d plan, w wVar, boolean z, boolean z3) {
        TimeClause timeClause;
        Date date;
        Period period;
        TimeClause timeClause2;
        Date date2;
        Period period2;
        Intrinsics.checkNotNullParameter(plan, "plan");
        if (!z) {
            Clause clauseD = dok.g.d(plan, null);
            TextLocalisedQuantityClause textLocalisedQuantityClauseI = (wVar == null || (period = wVar.f207032b) == null) ? null : xam.a.i(period, R$plurals.plan_cancellation_screen_benefits_subtitle_notice_period_days, R$plurals.plan_cancellation_screen_benefits_subtitle_notice_period_months);
            if (wVar == null || (date = wVar.f207031a) == null) {
                timeClause = null;
            } else {
                long time = date.getTime();
                TimeClause.Format.INSTANCE.getClass();
                timeClause = new TimeClause(time, TimeClause.Format.f57959a, null, null, 12);
            }
            return (textLocalisedQuantityClauseI == null || timeClause == null) ? timeClause != null ? new TextLocalisedClause(R$string.plan_cancellation_screen_benefits, zhm.v.k(clauseD, timeClause), null, 12) : new TextLocalisedClause(R$string.plan_cancellation_screen_benefits_subtitle_ends_immediately, zhm.u.c(clauseD), null, 12) : new TextLocalisedClause(R$string.plan_cancellation_screen_benefits_subtitle_ends_with_notice, zhm.v.k(clauseD, timeClause, textLocalisedQuantityClauseI), null, 12);
        }
        Clause clauseD2 = dok.g.d(plan, null);
        TextLocalisedQuantityClause textLocalisedQuantityClauseI2 = (wVar == null || (period2 = wVar.f207032b) == null) ? null : xam.a.i(period2, R$plurals.plan_cancellation_screen_benefits_subtitle_notice_period_days, R$plurals.plan_cancellation_screen_benefits_subtitle_notice_period_months);
        if (wVar == null || (date2 = wVar.f207031a) == null) {
            timeClause2 = null;
        } else {
            long time2 = date2.getTime();
            TimeClause.Format.INSTANCE.getClass();
            timeClause2 = new TimeClause(time2, TimeClause.Format.f57959a, null, null, 12);
        }
        if (textLocalisedQuantityClauseI2 != null && timeClause2 != null) {
            return new TextLocalisedClause(R$string.plan_cancellation_screen_benefits_subtitle_ends_with_notice, zhm.v.k(clauseD2, timeClause2, textLocalisedQuantityClauseI2), null, 12);
        }
        if (timeClause2 != null) {
            return new TextLocalisedClause(z3 ? R$string.plan_cancellation_screen_benefits_family_plans_benefits : R$string.plan_cancellation_screen_benefits_family_plans_redesign_subtitle_ends_on_date, zhm.v.k(clauseD2, timeClause2), null, 12);
        }
        return new TextLocalisedClause(z3 ? R$string.plan_cancellation_screen_benefits_family_plans_subtitle_ends_immediately : R$string.plan_cancellation_screen_benefits_family_plans_redesign_subtitle_ends_immediately, zhm.u.c(clauseD2), null, 12);
    }
}
