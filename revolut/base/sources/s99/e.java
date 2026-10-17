package s99;

import aii.u;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureDestination;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow.ExchangeGlobalAccessFlow;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow.ExchangeGlobalAccessFlowContract$InputData;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.ExchangeGlobalAccessFlowV2;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.ExchangeGlobalAccessFlowV2Contract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements ohi.a {
    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof l89.c)) {
            return null;
        }
        l89.c cVar = (l89.c) descriptor;
        return cVar.a(new ExchangeGlobalAccessFlowV2(new ExchangeGlobalAccessFlowV2Contract$InputData(cVar.c(), cVar.b(), null, false)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureDestination) {
            ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureDestination exchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureDestination = (ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureDestination) destination;
            return new ExchangeGlobalAccessFlow(new ExchangeGlobalAccessFlowContract$InputData(exchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureDestination.getF78163a(), exchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureDestination.getF78164b(), exchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureDestination.getF78165c()));
        }
        if (!(destination instanceof ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination)) {
            return null;
        }
        ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination exchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination = (ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination) destination;
        AnalyticsProduct f78166a = exchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination.getF78166a();
        return new ExchangeGlobalAccessFlowV2(new ExchangeGlobalAccessFlowV2Contract$InputData(exchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination.getF78167b(), f78166a, exchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination.getD(), exchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination.getF78168c()));
    }
}
