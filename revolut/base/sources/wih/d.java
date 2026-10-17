package wih;

import aii.e;
import aii.g;
import aii.u;
import aii.x;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.settings.preview.displayCurrency.DisplayCurrencyPreviewController;
import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.feature.wealth.ui.api.currencychanger.kompot.WealthCurrencyChangerDescriptor;
import com.revolut.feature.wealth.ui.api.navigation.DisclosuresDestination;
import com.revolut.feature.wealth.ui.api.navigation.InvestDocumentsDestination;
import com.revolut.feature.wealth.ui.api.navigation.InvestDocumentsDetailsDestination;
import com.revolut.feature.wealth.ui.api.navigation.account.WealthAccountsGetStartedOnboardingDestination;
import com.revolut.feature.wealth.ui.api.navigation.cash_balance.CashBalanceDestination;
import com.revolut.feature.wealth.ui.api.navigation.cash_balance.UnsettledDialogDestination;
import com.revolut.feature.wealth.ui.api.navigation.currencychanger.WealthCurrencyChangerDestination;
import com.revolut.feature.wealth.ui.api.navigation.holdings.CashHoldingMarginLoanInfoDialogDescriptor;
import com.revolut.feature.wealth.ui.api.navigation.investment_plans_collection.RecurringBuyHubCollectionDestination;
import com.revolut.feature.wealth.ui.api.navigation.statement.AccountsStatementDestination;
import com.revolut.feature.wealth.ui.api.navigation.trade.HoldingTradeDetailsDestination;
import com.revolut.feature.wealth.ui.api.navigation.trade.WealthTradeRedesignDestination;
import com.revolut.feature.wealth.ui.impl.accounts.screen.get_started_onboarding.WealthAccountsGetStartedOnboardingScreen;
import com.revolut.feature.wealth.ui.impl.actions.handler.WealthTransferFlowControllerFactory$Descriptor;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceController;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceControllerContract$InputData;
import com.revolut.feature.wealth.ui.impl.cash_balance.info.CashBalanceInfoDialogController;
import com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.UnsettledDialogController;
import com.revolut.feature.wealth.ui.impl.currencychanger.screen.CurrencyChangerScreen;
import com.revolut.feature.wealth.ui.impl.disclosures.DisclosuresController;
import com.revolut.feature.wealth.ui.impl.disclosures.DisclosuresControllerContract$Input;
import com.revolut.feature.wealth.ui.impl.documents.InvestDocumentsScreen;
import com.revolut.feature.wealth.ui.impl.documents.details.InvestDocumentsDetailsScreen;
import com.revolut.feature.wealth.ui.impl.documents.details.InvestDocumentsDetailsScreenContract$InputData;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.cash_selector.CashHoldingsSelectorScreen;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.CashHoldingsInfoFlow;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.CashHoldingsInfoFlowContract$InputData;
import com.revolut.feature.wealth.ui.impl.recurring_buy_hub_collection.RecurringBuyHubCollectionController;
import com.revolut.feature.wealth.ui.impl.statements.flow.StatementFlow;
import com.revolut.feature.wealth.ui.impl.trade_redesign.popular_commodities.PopularCommoditiesController;
import com.revolut.feature.wealth.ui.impl.trade_redesign.popular_commodities.PopularCommoditiesScreenDestination;
import com.revolut.feature.wealth.ui.impl.trade_redesign.screen.TradeScreen;
import com.revolut.feature.wealth.ui.impl.trade_redesign.screen.TradeScreenContract$Input;
import com.revolut.feature.wealth.ui.impl.trades.HoldingTradeDetailsController;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pih.i;
import pnh.k;
import qih.f;
import tzg.m;
import vkm.q;
import y4d.l;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements ohi.a, nte.a {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f297901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f297902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ejh.b f297903c;
    public final j6h.c d;
    public final com.revolut.feature.wealth.ui.impl.actions.handler.b e;

    public d(mlh.c wealthWithdrawInfoDialogProvider, l displayCurrencyPreviewInteractor, m wealthAccountsInteractor, ejh.b onboardingNavigationCommandFactory, j6h.c giaMarginCommandProvider, mlh.a cashHoldingMarginLoanInfoDialogProvider, com.revolut.feature.wealth.ui.impl.actions.handler.b wealthTransferFlowControllerFactory) {
        Intrinsics.checkNotNullParameter(wealthWithdrawInfoDialogProvider, "wealthWithdrawInfoDialogProvider");
        Intrinsics.checkNotNullParameter(displayCurrencyPreviewInteractor, "displayCurrencyPreviewInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(onboardingNavigationCommandFactory, "onboardingNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(giaMarginCommandProvider, "giaMarginCommandProvider");
        Intrinsics.checkNotNullParameter(cashHoldingMarginLoanInfoDialogProvider, "cashHoldingMarginLoanInfoDialogProvider");
        Intrinsics.checkNotNullParameter(wealthTransferFlowControllerFactory, "wealthTransferFlowControllerFactory");
        this.f297901a = displayCurrencyPreviewInteractor;
        this.f297902b = wealthAccountsInteractor;
        this.f297903c = onboardingNavigationCommandFactory;
        this.d = giaMarginCommandProvider;
        this.e = wealthTransferFlowControllerFactory;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof WealthCurrencyChangerDescriptor) {
            WealthCurrencyChangerDescriptor wealthCurrencyChangerDescriptor = (WealthCurrencyChangerDescriptor) descriptor;
            return wealthCurrencyChangerDescriptor.a(new CurrencyChangerScreen(wealthCurrencyChangerDescriptor.getF95900a()));
        }
        if (descriptor instanceof qih.d) {
            qih.d dVar = (qih.d) descriptor;
            return dVar.a(mlh.c.b(dVar.b(), dVar.c()));
        }
        if (descriptor instanceof qih.b) {
            qih.b bVar = (qih.b) descriptor;
            return bVar.a(mlh.c.a(bVar.b(), bVar.c(), bVar.d()));
        }
        if (descriptor instanceof CashHoldingMarginLoanInfoDialogDescriptor) {
            CashHoldingMarginLoanInfoDialogDescriptor cashHoldingMarginLoanInfoDialogDescriptor = (CashHoldingMarginLoanInfoDialogDescriptor) descriptor;
            return cashHoldingMarginLoanInfoDialogDescriptor.a(mlh.a.a(cashHoldingMarginLoanInfoDialogDescriptor.getF95930a(), cashHoldingMarginLoanInfoDialogDescriptor.getF95931b()));
        }
        if (descriptor instanceof f) {
            f fVar = (f) descriptor;
            return fVar.a(new CashHoldingsInfoFlow(new CashHoldingsInfoFlowContract$InputData.ForTradingAccount(fVar.d(), fVar.c(), fVar.b(), fVar.f(), fVar.e())));
        }
        if (descriptor instanceof qih.c) {
            qih.c cVar = (qih.c) descriptor;
            Clause clauseD = cVar.d();
            WealthDisclaimersContract$Disclaimer$Investment wealthDisclaimersContract$Disclaimer$InvestmentC = cVar.c();
            TradingAccount tradingAccountE = cVar.e();
            return cVar.a(new CashHoldingsInfoFlow(new CashHoldingsInfoFlowContract$InputData.ForSelectedCashHolding(cVar.b(), clauseD, wealthDisclaimersContract$Disclaimer$InvestmentC, cVar.f(), tradingAccountE)));
        }
        if (descriptor instanceof rih.a) {
            return ((rih.a) descriptor).a(new RecurringBuyHubCollectionController());
        }
        if (descriptor instanceof qih.e) {
            qih.e eVar = (qih.e) descriptor;
            return eVar.a(new CashHoldingsSelectorScreen(eVar.b()));
        }
        if (descriptor instanceof pih.a) {
            pih.a aVar = (pih.a) descriptor;
            return aVar.a(new CashBalanceInfoDialogController(aVar.b()));
        }
        if (descriptor instanceof i) {
            i iVar = (i) descriptor;
            return iVar.a(new UnsettledDialogController(iVar.b()));
        }
        if (descriptor instanceof WealthTransferFlowControllerFactory$Descriptor) {
            WealthTransferFlowControllerFactory$Descriptor wealthTransferFlowControllerFactory$Descriptor = (WealthTransferFlowControllerFactory$Descriptor) descriptor;
            return wealthTransferFlowControllerFactory$Descriptor.a(this.e.a(wealthTransferFlowControllerFactory$Descriptor));
        }
        if (descriptor instanceof sih.a) {
            sih.a aVar2 = (sih.a) descriptor;
            return aVar2.a(gc0.c.b(new HoldingTradeDetailsController(new k(aVar2.b())), new v1c.c(4)));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nhi.f
    public final Object d(x xVar, Continuation continuation) {
        if (!(xVar instanceof plh.a)) {
            return null;
        }
        plh.a aVar = (plh.a) xVar;
        return q.x(q.H(new c(xVar, this, (Continuation) null, 0), mo3.a.g(zi0.c.w(m.d(this.f297902b, l9.l.M(aVar.a()), l9.l.t(aVar.a()), 2)), null, null, 3)), continuation);
    }

    @Override // nte.a
    public final List e() {
        return WealthUiApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        xnh.a aVar;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof InvestDocumentsDetailsDestination) {
            return new InvestDocumentsDetailsScreen(new InvestDocumentsDetailsScreenContract$InputData(((InvestDocumentsDetailsDestination) destination).getF95908b()));
        }
        if (destination instanceof InvestDocumentsDestination) {
            return new InvestDocumentsScreen();
        }
        xnh.a aVar2 = null;
        if (!(destination instanceof WealthTradeRedesignDestination)) {
            if (destination instanceof HoldingTradeDetailsDestination) {
                return gc0.c.b(new HoldingTradeDetailsController(new k(((HoldingTradeDetailsDestination) destination).getF95939a())), new v1c.c(4));
            }
            if (destination instanceof AccountsStatementDestination) {
                AccountsStatementDestination accountsStatementDestination = (AccountsStatementDestination) destination;
                return new StatementFlow(new amh.f(accountsStatementDestination.getF95937a(), accountsStatementDestination.getF95938b()));
            }
            if (destination instanceof WealthAccountsGetStartedOnboardingDestination) {
                return new WealthAccountsGetStartedOnboardingScreen(((WealthAccountsGetStartedOnboardingDestination) destination).getF95917a());
            }
            if (destination instanceof CashBalanceDestination) {
                CashBalanceDestination cashBalanceDestination = (CashBalanceDestination) destination;
                return new CashBalanceController(new CashBalanceControllerContract$InputData(cashBalanceDestination.getF95918a(), cashBalanceDestination.getF95919b()));
            }
            if (destination instanceof WealthCurrencyChangerDestination) {
                return new DisplayCurrencyPreviewController(this.f297901a);
            }
            if (destination instanceof RecurringBuyHubCollectionDestination) {
                return new RecurringBuyHubCollectionController();
            }
            if (destination instanceof PopularCommoditiesScreenDestination) {
                return new PopularCommoditiesController();
            }
            if (destination instanceof DisclosuresDestination) {
                return new DisclosuresController(new DisclosuresControllerContract$Input(((DisclosuresDestination) destination).getF95902a()));
            }
            if (destination instanceof UnsettledDialogDestination) {
                return new UnsettledDialogController(((UnsettledDialogDestination) destination).getF95926a());
            }
            return null;
        }
        sih.c f95940b = ((WealthTradeRedesignDestination) destination).getF95940b();
        if (f95940b != null) {
            switch (a.f297895a[f95940b.ordinal()]) {
                case 1:
                    aVar = xnh.a.STOCKS;
                    break;
                case 2:
                    aVar = xnh.a.BONDS;
                    break;
                case 3:
                    aVar = xnh.a.ETFS;
                    break;
                case 4:
                    aVar = xnh.a.CFD;
                    break;
                case 5:
                    aVar = xnh.a.COMMODITY;
                    break;
                case 6:
                    aVar = xnh.a.PRIVATE_MARKETS;
                    break;
                case 7:
                    aVar = xnh.a.MUTUAL_FUNDS;
                    break;
                case 8:
                    aVar = xnh.a.STRUCTURED_NOTES;
                    break;
                case 9:
                    aVar = xnh.a.STRATEGIES;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            aVar2 = aVar;
        }
        return new TradeScreen(new TradeScreenContract$Input(aVar2));
    }
}
