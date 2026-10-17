package tpc;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import com.revolut.retail.wealth.resources.R$string;
import java.time.LocalDate;
import k4l.c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static TextLocalisedClause a(PortfolioRecurringOrder recurringOrder) {
        Intrinsics.checkNotNullParameter(recurringOrder, "recurringOrder");
        c0 c0Var = recurringOrder.e;
        LocalDate localDate = recurringOrder.f104652g;
        int i = a.f273334a[c0Var.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.wealth_robo_portfolio_recurring_transfer_widget_daily, u.c(new MoneyClause(recurringOrder.i, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.wealth_robo_portfolio_recurring_transfer_widget_weekly, v.k(new MoneyClause(recurringOrder.i, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TimeClause(ebm.a.P(localDate), TimeClause.Format.DayOfWeek.f57966b, null, null, 12)), null, 12);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.wealth_robo_portfolio_recurring_transfer_widget_monthly, v.k(new MoneyClause(recurringOrder.i, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TimeClause(ebm.a.P(localDate), new TimeClause.Format.DayOfMonth(false), null, null, 12)), null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }
}
