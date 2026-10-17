package sfh;

import aii.e;
import aii.g;
import cgh.n;
import com.revolut.feature.wealth.private_equity.api.WealthPrivateEquityApi$Toggles$PreTradeStateRevamp;
import com.revolut.feature.wealth.private_equity.api.navigation.fund_details.FundHighlightsScreenDestination;
import com.revolut.feature.wealth.private_equity.api.navigation.fund_details.FundPerformanceScreenDestination;
import com.revolut.feature.wealth.private_equity.api.navigation.fund_details.PortfolioUpdatesScreenDestination;
import com.revolut.feature.wealth.private_equity.api.ui.details.FundDetailsContract$InputData;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.FundDetailsScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fees_info.FundFeesInfoScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fund_highlights.FundHighlightsScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.FundPerformanceScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.portfolio_updates.PortfolioUpdatesScreen;
import java.util.List;
import kgh.l;
import kotlin.jvm.internal.Intrinsics;
import ngh.f;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof ofh.a) {
            ofh.a aVar = (ofh.a) descriptor;
            return aVar.a(new FundDetailsScreen(new FundDetailsContract$InputData(aVar.f224856a)));
        }
        if (descriptor instanceof nfh.a) {
            nfh.a aVar2 = (nfh.a) descriptor;
            return aVar2.a(new FundFeesInfoScreen(aVar2.f214906a));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nte.a
    public final List e() {
        return u.c(WealthPrivateEquityApi$Toggles$PreTradeStateRevamp.f95727c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof FundHighlightsScreenDestination) {
            return new FundHighlightsScreen(new n(((FundHighlightsScreenDestination) destination).f95728a));
        }
        if (destination instanceof PortfolioUpdatesScreenDestination) {
            return new PortfolioUpdatesScreen(new f(((PortfolioUpdatesScreenDestination) destination).f95731a));
        }
        if (!(destination instanceof FundPerformanceScreenDestination)) {
            return null;
        }
        FundPerformanceScreenDestination fundPerformanceScreenDestination = (FundPerformanceScreenDestination) destination;
        return new FundPerformanceScreen(new l(fundPerformanceScreenDestination.f95729a, fundPerformanceScreenDestination.f95730b));
    }
}
