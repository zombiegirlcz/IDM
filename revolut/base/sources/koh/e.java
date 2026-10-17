package koh;

import aii.g;
import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$CommissionFreeEtfs;
import com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$InvestScreenerHighDividendWidget;
import com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$InvestScreenerRedesignShowAllMetrics;
import com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$InvestScreenerRemoteCollectionWidgets;
import com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$InvestTopMoversScreenerRedesign;
import com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$ScreenerPopularInstrumentsCollection;
import com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$TradeScreenBondCollectionsScreenerMigration;
import com.revolut.feature.wealth_discovery.api.declaration.AllAssetsListDestination;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerCollectionDestination;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerMostTradedDestination;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerRedesignAddNewCollectionDestination;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerRedesignAllCollectionsDestination;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerRedesignDestination;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerResultDestination;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerTopMoversDestination;
import com.revolut.feature.wealth_discovery.impl.screener.flows.new_collection.ScreenerNewCollectionFlow;
import com.revolut.feature.wealth_discovery.impl.screener.flows.new_collection.ScreenerNewCollectionFlowContract$Input;
import com.revolut.feature.wealth_discovery.impl.screener.flows.screener.ScreenerRedesignFlow;
import com.revolut.feature.wealth_discovery.impl.screener.flows.screener.ScreenerRedesignFlowContract$Input;
import com.revolut.feature.wealth_discovery.impl.screener.flows.view_collection.ScreenerViewCollectionFlow;
import com.revolut.feature.wealth_discovery.impl.screener.flows.view_collection.ScreenerViewCollectionFlowContract$CollectionConfig;
import com.revolut.feature.wealth_discovery.impl.screener.flows.view_collection.ScreenerViewCollectionFlowContract$Input;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_assets_list.AllAssetsListScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.ScreenerAllCollectionsRedesignScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.meta_collection.ScreenerMetaCollectionScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.result.ScreenerResultScreen;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import cqh.h;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zel.f;
import zel.k;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements ohi.a, nte.a, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f186368a;

    public e(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f186368a = deeplinkGateways;
    }

    @Override // ohi.a, nhi.h, aii.p
    public final void b() {
    }

    @Override // nhi.f
    public final g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }

    @Override // nte.a
    public final List e() {
        return v.k(ScreenerApi$Toggles$InvestScreenerRedesignShowAllMetrics.f96093c, ScreenerApi$Toggles$InvestScreenerHighDividendWidget.f96092c, ScreenerApi$Toggles$InvestScreenerRemoteCollectionWidgets.f96094c, ScreenerApi$Toggles$InvestTopMoversScreenerRedesign.f96095c, ScreenerApi$Toggles$CommissionFreeEtfs.f96091c, ScreenerApi$Toggles$TradeScreenBondCollectionsScreenerMigration.f96097c, ScreenerApi$Toggles$ScreenerPopularInstrumentsCollection.f96096c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ScreenerRedesignDestination) {
            ScreenerRedesignDestination screenerRedesignDestination = (ScreenerRedesignDestination) destination;
            return new ScreenerRedesignFlow(new ScreenerRedesignFlowContract$Input(screenerRedesignDestination.f96105a, screenerRedesignDestination.f96106b));
        }
        if (destination instanceof ScreenerRedesignAllCollectionsDestination) {
            return new ScreenerAllCollectionsRedesignScreen();
        }
        if (destination instanceof ScreenerRedesignAddNewCollectionDestination) {
            return new ScreenerNewCollectionFlow(new ScreenerNewCollectionFlowContract$Input(((ScreenerRedesignAddNewCollectionDestination) destination).f96103a));
        }
        if (destination instanceof ScreenerCollectionDestination) {
            ScreenerCollectionDestination screenerCollectionDestination = (ScreenerCollectionDestination) destination;
            ScreenerCollection screenerCollection = screenerCollectionDestination.f96100b;
            return new ScreenerViewCollectionFlow(new ScreenerViewCollectionFlowContract$Input(screenerCollection != null ? new ScreenerViewCollectionFlowContract$CollectionConfig.FromCollection(screenerCollection) : new ScreenerViewCollectionFlowContract$CollectionConfig.FromId(screenerCollectionDestination.f96099a)));
        }
        if (destination instanceof ScreenerResultDestination) {
            ScreenerResultDestination screenerResultDestination = (ScreenerResultDestination) destination;
            return gc0.c.b(new ScreenerResultScreen(new nqh.e(screenerResultDestination.f96107a, screenerResultDestination.f96108b, screenerResultDestination.f96109c, screenerResultDestination.d, screenerResultDestination.e)), new aab.b(21));
        }
        if (destination instanceof AllAssetsListDestination) {
            return new AllAssetsListScreen(new jph.g(((AllAssetsListDestination) destination).f96098a));
        }
        if (destination instanceof ScreenerTopMoversDestination) {
            ScreenerTopMoversDestination screenerTopMoversDestination = (ScreenerTopMoversDestination) destination;
            f fVar = screenerTopMoversDestination.f96110a;
            k kVar = screenerTopMoversDestination.f96111b;
            if (kVar == null) {
                kVar = k.TOP_GAINERS;
            }
            return new ScreenerMetaCollectionScreen(new h(new wgl.c(fVar, kVar, zel.a.ONE_DAY)));
        }
        if (!(destination instanceof ScreenerMostTradedDestination)) {
            return null;
        }
        ScreenerMostTradedDestination screenerMostTradedDestination = (ScreenerMostTradedDestination) destination;
        f fVar2 = screenerMostTradedDestination.f96101a;
        zel.c cVar = screenerMostTradedDestination.f96102b;
        if (cVar == null) {
            cVar = zel.c.MOST_TRADED;
        }
        return new ScreenerMetaCollectionScreen(new h(new wgl.b(fVar2, cVar, zel.a.ONE_DAY)));
    }

    @Override // aii.p
    public final Set h() {
        return this.f186368a;
    }
}
