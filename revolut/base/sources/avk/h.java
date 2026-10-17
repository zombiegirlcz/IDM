package avk;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.cfd.impl.screens.cash_balance.CfdCashBalanceController;
import com.revolut.feature.retail.cfd.impl.screens.home.CfdTradingHomeScreen;
import com.revolut.feature.robo.impl.ui.screen.portfolio_details.PortfolioDetailsScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.overview.NoteDetailsOverviewController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsController;
import com.revolut.feature.wealth.mutual_funds.impl.ui.mutual_fund_details.MutualFundDetailsScreen;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.bond_details.BondDetailsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.cfd_details.CfdDetailsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview.EtfDetailsOverviewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewController;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements h1h.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10083a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListSubheaderDelegate f10084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RowDelegate f10085c;

    public h(CashBalanceController cashBalanceController) {
        this.f10084b = cashBalanceController.O;
        this.f10085c = cashBalanceController.L;
    }

    @Override // f1h.f
    /* JADX INFO: renamed from: c */
    public final RowDelegate getM() {
        switch (this.f10083a) {
        }
        return this.f10085c;
    }

    @Override // h1h.f
    /* JADX INFO: renamed from: j0 */
    public final ListSubheaderDelegate getL() {
        switch (this.f10083a) {
        }
        return this.f10084b;
    }

    public h(CfdCashBalanceController cfdCashBalanceController) {
        this.f10084b = cfdCashBalanceController.R;
        this.f10085c = cfdCashBalanceController.S;
    }

    public h(NoteDetailsOverviewController noteDetailsOverviewController) {
        this.f10084b = noteDetailsOverviewController.T;
        this.f10085c = noteDetailsOverviewController.Q;
    }

    public h(CfdDetailsController cfdDetailsController) {
        this.f10084b = cfdDetailsController.S;
        this.f10085c = cfdDetailsController.X;
    }

    public h(CfdTradingHomeScreen cfdTradingHomeScreen) {
        this.f10084b = cfdTradingHomeScreen.O;
        this.f10085c = cfdTradingHomeScreen.S;
    }

    public h(MutualFundDetailsScreen mutualFundDetailsScreen) {
        this.f10084b = mutualFundDetailsScreen.Q;
        this.f10085c = mutualFundDetailsScreen.P;
    }

    public h(EtfDetailsOverviewController etfDetailsOverviewController) {
        this.f10084b = etfDetailsOverviewController.Y;
        this.f10085c = etfDetailsOverviewController.f103935e0;
    }

    public h(PortfolioDetailsScreen portfolioDetailsScreen) {
        this.f10084b = portfolioDetailsScreen.X;
        this.f10085c = portfolioDetailsScreen.S;
    }

    public h(StockDetailsOverviewController stockDetailsOverviewController) {
        this.f10084b = stockDetailsOverviewController.S;
        this.f10085c = stockDetailsOverviewController.V;
    }

    public h(BondDetailsController bondDetailsController) {
        this.f10084b = bondDetailsController.f103888b0;
        this.f10085c = bondDetailsController.g0;
    }

    public h(ManagedPortfolioDetailsController managedPortfolioDetailsController) {
        this.f10084b = managedPortfolioDetailsController.Q;
        this.f10085c = managedPortfolioDetailsController.O;
    }
}
