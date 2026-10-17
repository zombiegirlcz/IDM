package xvl;

import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$Destination;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$Disclaimers;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData;
import com.revolut.feature.wealth.ui.api.navigation.investment_plans_collection.RecurringBuyHubCollectionDestination;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends sdf.b {
    @Override // sdf.b
    public final void Z2() {
        A2(RecurringBuyHubCollectionDestination.f95936a);
    }

    @Override // sdf.b
    public final void b3() {
        A2(new InvestOrdersListFeatureContract$Destination(new InvestOrdersListFeatureContract$InputData.RecurringOrders(new InvestOrdersParams.OrdersAll((k4l.d) null, Boolean.TRUE, (String) null, 13), new InvestOrdersListFeatureContract$InputData.RecurringOrders.DisplayOptions(InvestOrdersListFeatureContract$InputData.RecurringOrders.PlusActionNavBarButton.OpenRecurringBuys.f91761a, InvestOrdersListFeatureContract$Disclaimers.None.f91750a))));
    }
}
