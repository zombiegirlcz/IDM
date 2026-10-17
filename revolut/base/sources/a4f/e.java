package a4f;

import aii.g;
import aii.u;
import com.revolut.feature.trading.api.FeatureTradingApi$Toggles$CashHoldingExchange;
import com.revolut.feature.trading.api.FeatureTradingApi$Toggles$DailyStockHighlights;
import com.revolut.feature.trading.api.FeatureTradingApi$Toggles$EtfInstrumentsCollectionsRedesign;
import com.revolut.feature.trading.api.FeatureTradingApi$Toggles$InvestFxTrading;
import com.revolut.feature.trading.api.FeatureTradingApi$Toggles$InvestmentPlanHub;
import com.revolut.feature.trading.api.FeatureTradingApi$Toggles$RelatedCollections;
import com.revolut.feature.trading.api.navigation.CollectionDestination;
import com.revolut.feature.trading.api.navigation.HoldingsInformationDestination;
import com.revolut.feature.trading.impl.flows.holdings.information.HoldingsInformationFlow;
import com.revolut.feature.trading.impl.ui.collections.CollectionScreen;
import com.revolut.feature.trading.impl.ui.collections.CollectionScreenContract$Input;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }

    @Override // nte.a
    public final List e() {
        return v.k(FeatureTradingApi$Toggles$CashHoldingExchange.f91201c, FeatureTradingApi$Toggles$DailyStockHighlights.f91202c, FeatureTradingApi$Toggles$InvestFxTrading.f91204c, FeatureTradingApi$Toggles$RelatedCollections.f91206c, FeatureTradingApi$Toggles$EtfInstrumentsCollectionsRedesign.f91203c, FeatureTradingApi$Toggles$InvestmentPlanHub.f91205c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof HoldingsInformationDestination) {
            return new HoldingsInformationFlow();
        }
        if (destination instanceof CollectionDestination) {
            return new CollectionScreen(new CollectionScreenContract$Input(((CollectionDestination) destination).f91208a));
        }
        return null;
    }
}
