package y0e;

import aii.p;
import com.revolut.feature.stock_lending.api.navigation.StockLendingV2FlowDestination;
import com.revolut.feature.stock_lending.impl.ui.onboarding.StockLendingOnboardingController;
import com.revolut.feature.stock_lending.impl.ui.onboarding.StockLendingOnboardingDestination;
import com.revolut.feature.stock_lending.impl.ui.v2.flow.StockLendingFlow;
import com.revolut.feature.stock_lending.impl.ui.v2.flow.StockLendingFlowContract$InputData;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import dki.g;
import java.util.List;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f310210a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f310210a = featureToggleInteractor;
    }

    @Override // nte.a
    public final List e() {
        return u.c(FeatureWealthApi$Toggles.StockLendingRSUAB.f95168c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof StockLendingOnboardingDestination) {
            return new StockLendingOnboardingController(((StockLendingOnboardingDestination) destination).f88402b);
        }
        if (!(destination instanceof StockLendingV2FlowDestination)) {
            return null;
        }
        if (!((d) this.f310210a).c(FeatureWealthApi$Toggles.StockLendingRSUAB.f95168c)) {
            return null;
        }
        StockLendingV2FlowDestination stockLendingV2FlowDestination = (StockLendingV2FlowDestination) destination;
        return new StockLendingFlow(new StockLendingFlowContract$InputData(stockLendingV2FlowDestination.f88397a, stockLendingV2FlowDestination.f88398b));
    }
}
