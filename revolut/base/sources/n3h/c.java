package n3h;

import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$Destination;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$Disclaimers;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mpd.p;
import nel.n;
import q2h.f;
import q2h.g;
import q2h.h;
import q2h.j;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends q2h.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final udf.a f212132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d1e.a f212133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z5j.d f212134n;

    public c(udf.a createTradingOrderCommandProvider, d1e.a stockLendingNaviCommandProvider, z5j.d commodityAssetDetailsOrderFlowCommandProvider) {
        Intrinsics.checkNotNullParameter(createTradingOrderCommandProvider, "createTradingOrderCommandProvider");
        Intrinsics.checkNotNullParameter(stockLendingNaviCommandProvider, "stockLendingNaviCommandProvider");
        Intrinsics.checkNotNullParameter(commodityAssetDetailsOrderFlowCommandProvider, "commodityAssetDetailsOrderFlowCommandProvider");
        this.f212132l = createTradingOrderCommandProvider;
        this.f212133m = stockLendingNaviCommandProvider;
        this.f212134n = commodityAssetDetailsOrderFlowCommandProvider;
    }

    @Override // q2h.b
    public final void Z2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (obj2 instanceof q2h.c) {
            q2h.c cVar = (q2h.c) obj2;
            if (!(cVar instanceof h)) {
                if (!(cVar instanceof j)) {
                    throw new NoWhenBranchMatchedException();
                }
                n4l.c stockLendingStatus = ((j) cVar).f241658a;
                d1e.a aVar = this.f212133m;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(stockLendingStatus, "stockLendingStatus");
                NaviCommand naviCommandB = aVar.b(stockLendingStatus);
                BridgeDestination bridgeDestinationB = naviCommandB != null ? u0.b(naviCommandB) : null;
                if (bridgeDestinationB != null) {
                    A2(bridgeDestinationB);
                    return;
                }
                return;
            }
            h hVar = (h) cVar;
            if (hVar instanceof q2h.e) {
                T2(new p(this, (q2h.e) hVar, null, 29), new yi5.b(27));
                return;
            }
            if (hVar instanceof q2h.d) {
                T2(new p(this, (q2h.d) hVar, null, 28), new yi5.b(27));
                return;
            }
            boolean z = hVar instanceof g;
            InvestOrdersListFeatureContract$Disclaimers.None none = InvestOrdersListFeatureContract$Disclaimers.None.f91750a;
            if (!z) {
                if (!(hVar instanceof f)) {
                    throw new NoWhenBranchMatchedException();
                }
                xi0.b bVar = ((f) hVar).f241656a;
                A2(new InvestOrdersListFeatureContract$Destination(new InvestOrdersListFeatureContract$InputData.RecurringOrders(new InvestOrdersParams.OrdersByCurrency(bVar, null, null, 26), new InvestOrdersListFeatureContract$InputData.RecurringOrders.DisplayOptions(new InvestOrdersListFeatureContract$InputData.RecurringOrders.PlusActionNavBarButton.StartCommodityOrder(bVar), none))));
                return;
            }
            n nVar = ((g) hVar).f241657a;
            nVar.getClass();
            xi0.a aVar2 = xi0.b.Companion;
            String str = nVar.f214596b;
            aVar2.getClass();
            A2(new InvestOrdersListFeatureContract$Destination(new InvestOrdersListFeatureContract$InputData.RecurringOrders(new InvestOrdersParams.OrdersByCurrency(xi0.a.a(str), null, null, 26), new InvestOrdersListFeatureContract$InputData.RecurringOrders.DisplayOptions(new InvestOrdersListFeatureContract$InputData.RecurringOrders.PlusActionNavBarButton.StartSecurityOrder(nVar), none))));
        }
    }
}
