package w6f;

import aw0.t0;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.models.ManagedPortfolioUnrealisedReturnBreakdown;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements n {
    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ManagedPortfolioReturnBreakdownControllerStateMapper_value", new t0((Clause) new TextLocalisedClause(R$string.managed_portfolios_template_details_investment_unrealised_return_value_appreciation, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(domainState.f295434a.f91333a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.managed_portfolios_template_details_investment_unrealised_return_income, null, null, 14), (Image) null, 0, false, 30);
        ManagedPortfolioUnrealisedReturnBreakdown managedPortfolioUnrealisedReturnBreakdown = domainState.f295434a;
        List listK = v.k(model, new CellDetailsDelegate.Model("ManagedPortfolioReturnBreakdownControllerStateMapper_income", t0Var, new MoneyClause(managedPortfolioUnrealisedReturnBreakdown.f91334b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("ManagedPortfolioReturnBreakdownControllerStateMapper_total_fees", new t0((Clause) new TextLocalisedClause(R$string.managed_portfolios_template_details_investment_unrealised_return_total_fees, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(managedPortfolioUnrealisedReturnBreakdown.f91335c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("ManagedPortfolioReturnBreakdownControllerStateMapper_total", new t0((Clause) new TextLocalisedClause(R$string.managed_portfolios_template_details_investment_unrealised_return_total, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(managedPortfolioUnrealisedReturnBreakdown.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new d(listK);
    }
}
