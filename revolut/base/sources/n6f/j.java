package n6f;

import aw0.n6;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        int i2;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xdh.b bVar = domainState.f212779a;
        int[] iArr = i.f212783a;
        switch (iArr[bVar.ordinal()]) {
            case 1:
                i = R$string.wealth_robo_template_details_rebalance_state_initial_funding_dialog_title;
                break;
            case 2:
                i = com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_rebalance_state_pending_cash_allocation;
                break;
            case 3:
                i = com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_rebalance_state_pending_rebalancing;
                break;
            case 4:
                i = com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_rebalance_state_pending_template_change;
                break;
            case 5:
                i = com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_rebalance_state_pending_template_allocation_change;
                break;
            case 6:
                throw new IllegalStateException("NO_REBALANCE has no rebalance dialog");
            default:
                throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        switch (iArr[bVar.ordinal()]) {
            case 1:
                i2 = R$string.wealth_robo_template_details_rebalance_state_initial_funding_dialog_description;
                break;
            case 2:
                i2 = com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_rebalance_state_pending_cash_allocation_description;
                break;
            case 3:
                i2 = com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_rebalance_state_pending_rebalancing_description;
                break;
            case 4:
                i2 = com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_rebalance_state_pending_template_change_description;
                break;
            case 5:
                i2 = com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_rebalance_state_pending_template_allocation_change_description;
                break;
            case 6:
                throw new IllegalStateException("NO_REBALANCE has no rebalance dialog");
            default:
                throw new NoWhenBranchMatchedException();
        }
        lw0.a aVar = new lw0.a(textLocalisedClause, new TextLocalisedClause(i2, null, null, 14), null, null, false, 28);
        n6 n6Var = new n6(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_common_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, b.f212777a, 504);
        return new h(new cii.a(aVar, bVar == xdh.b.PENDING_INITIAL_FUNDING ? new aw0.h(false, n6Var, new n6(new TextLocalisedClause(R$string.wealth_robo_template_details_rebalance_state_initial_funding_dialog_action, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, c.f212778a, 504), null, null, null, 121) : new aw0.e(false, null, null, n6Var, null, null, 55)));
    }
}
