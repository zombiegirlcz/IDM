package k0k;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.retail.feature.marketnews.api.navigation.destination.WealthAllNewsDestination;
import com.revolut.retail.feature.marketnews.api.navigation.destination.WealthAssetTypeNewsDestination;
import com.revolut.retail.feature.marketnews.api.navigation.destination.WealthNewsArticleReaderDestination;
import com.revolut.retail.feature.marketnews.api.navigation.destination.WealthNewsOverviewDestination;
import com.revolut.retail.feature.marketnews.impl.flows.wealthassettypenews.WealthAssetTypeNewsFlow;
import com.revolut.retail.feature.marketnews.impl.flows.wealthassettypenews.WealthAssetTypeNewsFlowContract$InputData;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnews.WealthNewsFlow;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnews.WealthNewsFlowContract$InputData;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnews.destination.WealthDailyNewsDestination;
import com.revolut.retail.feature.marketnews.impl.ui.instrument_news_controller.InstrumentNewsController;
import com.revolut.retail.feature.marketnews.impl.ui.instrument_news_controller.InstrumentNewsControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof szj.a)) {
            super.c(descriptor);
            return null;
        }
        szj.a aVar = (szj.a) descriptor;
        return aVar.a(new InstrumentNewsController(new InstrumentNewsControllerContract$InputData(aVar.c(), aVar.b())));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof WealthNewsOverviewDestination) {
            return new WealthNewsFlow(new WealthNewsFlowContract$InputData.Overview(((WealthNewsOverviewDestination) destination).f101822a));
        }
        if (destination instanceof WealthNewsArticleReaderDestination) {
            WealthNewsArticleReaderDestination wealthNewsArticleReaderDestination = (WealthNewsArticleReaderDestination) destination;
            return new WealthNewsFlow(new WealthNewsFlowContract$InputData.Reader(wealthNewsArticleReaderDestination.f101819a, wealthNewsArticleReaderDestination.f101820b));
        }
        if (destination instanceof WealthAssetTypeNewsDestination) {
            WealthAssetTypeNewsDestination wealthAssetTypeNewsDestination = (WealthAssetTypeNewsDestination) destination;
            return new WealthAssetTypeNewsFlow(new WealthAssetTypeNewsFlowContract$InputData(wealthAssetTypeNewsDestination.f101817a, wealthAssetTypeNewsDestination.f101818b));
        }
        if (destination instanceof WealthDailyNewsDestination) {
            WealthDailyNewsDestination wealthDailyNewsDestination = (WealthDailyNewsDestination) destination;
            return new WealthNewsFlow(new WealthNewsFlowContract$InputData.DailyNews(wealthDailyNewsDestination.f101845b, wealthDailyNewsDestination.f101846c, wealthDailyNewsDestination.d));
        }
        if (destination instanceof WealthAllNewsDestination) {
            return new WealthNewsFlow(new WealthNewsFlowContract$InputData.AllNews(((WealthAllNewsDestination) destination).getF101816a()));
        }
        return null;
    }
}
