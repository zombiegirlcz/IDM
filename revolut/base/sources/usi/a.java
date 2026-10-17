package usi;

import aii.u;
import com.revolut.retail.feature.adjust_analytics.api.AdjustAnalyticsFeatureConfig;
import com.revolut.retail.feature.adjust_analytics.impl.ui.AdjustAnalyticsContract$InputData;
import com.revolut.retail.feature.adjust_analytics.impl.ui.AdjustAnalyticsController;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof AdjustAnalyticsFeatureConfig.AdjustAnalytics.Destination)) {
            return null;
        }
        AdjustAnalyticsFeatureConfig.AdjustAnalytics.Destination destination2 = (AdjustAnalyticsFeatureConfig.AdjustAnalytics.Destination) destination;
        return new AdjustAnalyticsController(new AdjustAnalyticsContract$InputData(destination2.getF98701a(), destination2.getF98702b()));
    }
}
