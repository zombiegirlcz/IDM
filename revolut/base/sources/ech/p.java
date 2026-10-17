package ech;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreenContract$Input;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ech.k;
import java.time.LocalDate;
import java.util.List;
import k4l.c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final adh.h f124752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduleScreenContract$Input f124753b;

    public p(adh.h recurringFundingFrequencyClauseProvider, o buildScheduleInformationClause, ScheduleScreenContract$Input input) {
        Intrinsics.checkNotNullParameter(recurringFundingFrequencyClauseProvider, "recurringFundingFrequencyClauseProvider");
        Intrinsics.checkNotNullParameter(buildScheduleInformationClause, "buildScheduleInformationClause");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f124752a = recurringFundingFrequencyClauseProvider;
        this.f124753b = input;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        TextLocalisedClause textLocalisedClause;
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LocalDate localDate = domainState.f124736a;
        c0 period = domainState.f124737b;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_robo_onboarding_recurring_contribution_schedule_start_date, null, null, 14);
        long jP = ebm.a.P(localDate);
        TimeClause.Format.DateLong dateLong = TimeClause.Format.DateLong.f57962b;
        InputTextDelegate.Model model = new InputTextDelegate.Model("input.start_date", new TimeClause(jP, dateLong, null, null, 12), textLocalisedClause2, null, false, null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, k.b.f124743a, null, null, 0, 0, 0, 0, -33558536, 65023);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("input.frequency", this.f124752a.a(period), new TextLocalisedClause(R.string.common_action_repeat, null, null, 14), null, false, null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, k.a.f124742a, null, null, 0, 0, 0, 0, -33558536, 65023);
        yp0.b.r(model2, 0, 0, 0, 0, 15);
        List listK = v.k(model, model2);
        LocalDate startDate = domainState.f124736a;
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(period, "period");
        TextLocalisedClause textLocalisedClause3 = LocalDate.now().isEqual(startDate) ? new TextLocalisedClause(R$string.wealth_robo_onboarding_recurring_contribution_schedule_description_first_contribution_today, null, null, 14) : new TextLocalisedClause(R$string.wealth_robo_onboarding_recurring_contribution_schedule_description_first_contribution_future, u.c(new TimeClause(ebm.a.P(startDate), dateLong, null, null, 12)), null, 12);
        int i = n.f124751a[period.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_onboarding_recurring_contribution_schedule_description_next_contribution_daily, null, null, 14);
        } else if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_onboarding_recurring_contribution_schedule_description_next_contribution_weekly, u.c(new TimeClause(ebm.a.P(startDate), TimeClause.Format.DayOfWeek.f57966b, null, null, 12)), null, 12);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_onboarding_recurring_contribution_schedule_description_next_contribution_monthly, u.c(new TimeClause(ebm.a.P(startDate), new TimeClause.Format.DayOfMonth(true), null, null, 12)), null, 12);
        }
        return new l(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause3, textLocalisedClause)), listK, this.f124753b.f95601c);
    }
}
