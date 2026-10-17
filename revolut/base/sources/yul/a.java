package yul;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$Destination;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$Destination;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$Disclaimer;
import com.revolut.feature.trading_orders.api.investment_plan.projection.InvestmentProjectionsContract$Destination;
import com.revolut.feature.trading_orders.api.navigation.trading_asset_details.RecurringBuyAssetDetailsDestination;
import com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$Destination;
import com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData;
import com.revolut.feature.trading_orders.api.ui.details_pager.InvestOrderDetailsPagerFeatureContract$Descriptor;
import com.revolut.feature.trading_orders.api.ui.details_pager.InvestOrderDetailsPagerFeatureContract$Destination;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$Destination;
import com.revolut.trading.orders.TradingOrdersApi$Toggles;
import com.revolut.trading.orders.ui.details.InvestOrderDetailsScreen;
import com.revolut.trading.orders.ui.details.InvestOrderDetailsScreenRedesigned;
import com.revolut.trading.orders.ui.details_pager.InvestOrderDetailsPagerFlow;
import com.revolut.trading.orders.ui.flows.investment_plan.projection.InvestmentProjectionsFlowViewController;
import com.revolut.trading.orders.ui.flows.trading_asset_details.RecurringBuyAssetDetailsFlow;
import com.revolut.trading.orders.ui.flows.trading_asset_details.RecurringBuyAssetDetailsFlowContract$InputData;
import com.revolut.trading.orders.ui.invest.list.screen.InvestOrdersListScreen;
import com.revolut.trading.orders.ui.invest.placement.account.selector.screen.InvestAccountSelectorScreen;
import com.revolut.trading.orders.ui.invest.placement.account.selector.screen.InvestAccountSelectorScreenContract$InputData;
import com.revolut.trading.orders.ui.invest.placement.security_asset_balance_breakdown.SecurityAssetBalanceBreakdownScreen;
import com.revolut.trading.orders.ui.invest.placement.target_price.TargetPriceScreen;
import com.revolut.trading.orders.ui.invest.placement.target_price.TargetPriceScreenContract$InputData;
import com.revolut.trading.orders.ui.invest.placement.tutorial.TutorialScreen;
import com.revolut.trading.orders.ui.invest.placement.tutorial.TutorialScreenContract$InputData;
import com.revolut.trading.orders.ui.invest.placement.wrapper_flow.InvestOrderWrapperFlowViewController;
import com.revolut.trading.orders.ui.screens.pocket_picker.SourcePocketPickerController;
import com.revolut.trading.orders.ui.screens.schedule.ScheduleSettingsScreen;
import java.util.List;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import odf.c;
import oul.j;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f317058a;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f317058a = featureToggleInteractor;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof idf.a) {
            idf.a aVar = (idf.a) descriptor;
            return aVar.a(new TutorialScreen(new TutorialScreenContract$InputData(aVar.d(), aVar.c(), aVar.b())));
        }
        if (descriptor instanceof hdf.a) {
            hdf.a aVar2 = (hdf.a) descriptor;
            return aVar2.a(new TargetPriceScreen(new TargetPriceScreenContract$InputData(aVar2.c(), aVar2.e(), aVar2.b(), aVar2.d()), new j(aVar2.f())));
        }
        if (descriptor instanceof fdf.a) {
            fdf.a aVar3 = (fdf.a) descriptor;
            return aVar3.a(new InvestAccountSelectorScreen(new InvestAccountSelectorScreenContract$InputData(aVar3.d(), aVar3.b(), aVar3.c(), InvestAccountSelectorContract$Disclaimer.Commodities.f91708a)));
        }
        if (descriptor instanceof c) {
            c cVar = (c) descriptor;
            return cVar.a(new SourcePocketPickerController(cVar.b()));
        }
        if (descriptor instanceof gdf.a) {
            gdf.a aVar4 = (gdf.a) descriptor;
            return aVar4.a(new SecurityAssetBalanceBreakdownScreen(aVar4.b()));
        }
        if (descriptor instanceof pdf.a) {
            pdf.a aVar5 = (pdf.a) descriptor;
            return aVar5.a(new ScheduleSettingsScreen(aVar5.b()));
        }
        if (descriptor instanceof ldf.a) {
            ldf.a aVar6 = (ldf.a) descriptor;
            InvestOrderDetailsContract$InputData investOrderDetailsContract$InputDataB = aVar6.b();
            return aVar6.a(((d) this.f317058a).c(TradingOrdersApi$Toggles.InvestOrderDetailsRedesign.f106789c) ? new InvestOrderDetailsScreenRedesigned(investOrderDetailsContract$InputDataB) : new InvestOrderDetailsScreen(investOrderDetailsContract$InputDataB));
        }
        if (descriptor instanceof InvestOrderDetailsPagerFeatureContract$Descriptor) {
            InvestOrderDetailsPagerFeatureContract$Descriptor investOrderDetailsPagerFeatureContract$Descriptor = (InvestOrderDetailsPagerFeatureContract$Descriptor) descriptor;
            return investOrderDetailsPagerFeatureContract$Descriptor.a(new InvestOrderDetailsPagerFlow(investOrderDetailsPagerFeatureContract$Descriptor.getF91742a()));
        }
        if (!(descriptor instanceof mdf.a)) {
            return null;
        }
        mdf.a aVar7 = (mdf.a) descriptor;
        return aVar7.a(new InvestOrdersListScreen(aVar7.b()));
    }

    @Override // nte.a
    public final List e() {
        return TradingOrdersApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof InvestOrderContract$Destination) {
            return gc0.c.b(new InvestOrderWrapperFlowViewController(((InvestOrderContract$Destination) destination).getF91695a()), new v1c.c(12));
        }
        if (destination instanceof InvestOrdersListFeatureContract$Destination) {
            return new InvestOrdersListScreen(((InvestOrdersListFeatureContract$Destination) destination).getF91746a());
        }
        if (destination instanceof InvestAccountSelectorContract$Destination) {
            InvestAccountSelectorContract$Destination investAccountSelectorContract$Destination = (InvestAccountSelectorContract$Destination) destination;
            return gc0.c.b(new InvestAccountSelectorScreen(new InvestAccountSelectorScreenContract$InputData(investAccountSelectorContract$Destination.getF91705a(), investAccountSelectorContract$Destination.getF91706b(), investAccountSelectorContract$Destination.getF91707c(), investAccountSelectorContract$Destination.getD())), new v1c.c(13));
        }
        if (destination instanceof InvestmentProjectionsContract$Destination) {
            return gc0.c.b(new InvestmentProjectionsFlowViewController(((InvestmentProjectionsContract$Destination) destination).getF91735a()), new v1c.c(14));
        }
        if (destination instanceof RecurringBuyAssetDetailsDestination) {
            return new RecurringBuyAssetDetailsFlow(new RecurringBuyAssetDetailsFlowContract$InputData(((RecurringBuyAssetDetailsDestination) destination).getF91739a()));
        }
        if (destination instanceof InvestOrderDetailsContract$Destination) {
            InvestOrderDetailsContract$InputData f91740a = ((InvestOrderDetailsContract$Destination) destination).getF91740a();
            return gc0.c.b(((d) this.f317058a).c(TradingOrdersApi$Toggles.InvestOrderDetailsRedesign.f106789c) ? new InvestOrderDetailsScreenRedesigned(f91740a) : new InvestOrderDetailsScreen(f91740a), new v1c.c(15));
        }
        if (destination instanceof InvestOrderDetailsPagerFeatureContract$Destination) {
            return new InvestOrderDetailsPagerFlow(((InvestOrderDetailsPagerFeatureContract$Destination) destination).getF91743a());
        }
        return null;
    }
}
