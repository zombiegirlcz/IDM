package hxg;

import aii.u;
import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import com.revolut.feature.wealth.analytics.navigation.ComplexAnalyticsDestination;
import com.revolut.feature.wealth.analytics.ui.complex_analytics.v2.screen.performance.sector.ComplexAnalyticsSectorContributorController;
import com.revolut.feature.wealth.analytics.ui.complex_analytics.v2.screen.performance.sector.ComplexAnalyticsSectorContributorControllerContract$InputData;
import com.revolut.feature.wealth.analytics.ui.complex_analytics.v2.screen.totalvalue.sector.ComplexAnalyticsSectorAllocationController;
import com.revolut.feature.wealth.analytics.ui.complex_analytics.v2.screen.totalvalue.sector.ComplexAnalyticsSectorAllocationControllerContract$InputData;
import com.revolut.feature.wealth.analytics.ui.navigation.complex_analytics.ComplexAnalyticsSectorAllocationDestination;
import com.revolut.feature.wealth.analytics.ui.navigation.complex_analytics.ComplexAnalyticsSectorContributorDestination;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return WealthAnalyticsApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ComplexAnalyticsDestination) {
            ComplexAnalyticsDestination complexAnalyticsDestination = (ComplexAnalyticsDestination) destination;
            return b.a(complexAnalyticsDestination.getF95032b(), complexAnalyticsDestination.getE(), complexAnalyticsDestination.getF95031a());
        }
        if (destination instanceof ComplexAnalyticsSectorAllocationDestination) {
            return new ComplexAnalyticsSectorAllocationController((ComplexAnalyticsSectorAllocationControllerContract$InputData) ((ComplexAnalyticsSectorAllocationDestination) destination).f98300a);
        }
        if (destination instanceof ComplexAnalyticsSectorContributorDestination) {
            return new ComplexAnalyticsSectorContributorController((ComplexAnalyticsSectorContributorControllerContract$InputData) ((ComplexAnalyticsSectorContributorDestination) destination).f98300a);
        }
        return null;
    }
}
