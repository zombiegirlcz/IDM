package c87;

import aii.u;
import com.revolut.feature.global_markets.api.navigation.GlobalMarketsFeatureConfig$GlobalMarketsDestination;
import com.revolut.feature.global_markets.api.navigation.GlobalMarketsFeatureConfig$IndexDetailsDestination;
import com.revolut.feature.global_markets.impl.navigation.GlobalMarketsCollectionDestination;
import com.revolut.feature.global_markets.impl.ui.flow.index_details.IndexDetailsFlow;
import com.revolut.feature.global_markets.impl.ui.flow.index_details.IndexDetailsFlowContract$InputData;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.collection_details.GlobalMarketsCollectionScreen;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.collection_details.GlobalMarketsCollectionScreenContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f22135a;

    public a(b marketsFlowControllerProvider) {
        Intrinsics.checkNotNullParameter(marketsFlowControllerProvider, "marketsFlowControllerProvider");
        this.f22135a = marketsFlowControllerProvider;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (Intrinsics.f(destination, GlobalMarketsFeatureConfig$GlobalMarketsDestination.f74564a)) {
            this.f22135a.getClass();
            return b.a();
        }
        if (destination instanceof GlobalMarketsFeatureConfig$IndexDetailsDestination) {
            GlobalMarketsFeatureConfig$IndexDetailsDestination globalMarketsFeatureConfig$IndexDetailsDestination = (GlobalMarketsFeatureConfig$IndexDetailsDestination) destination;
            return new IndexDetailsFlow(new IndexDetailsFlowContract$InputData(globalMarketsFeatureConfig$IndexDetailsDestination.f74565a, globalMarketsFeatureConfig$IndexDetailsDestination.f74566b));
        }
        if (destination instanceof GlobalMarketsCollectionDestination) {
            return new GlobalMarketsCollectionScreen(new GlobalMarketsCollectionScreenContract$InputData(((GlobalMarketsCollectionDestination) destination).getF74581a()));
        }
        return null;
    }
}
