package m5f;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.managed_portfolios.api.ManagedPortfoliosApi$Toggles$InvestorUpdatesFlow;
import com.revolut.feature.trading.managed_portfolios.api.ManagedPortfoliosApi$Toggles$ManagedPortfolios;
import com.revolut.feature.trading.managed_portfolios.api.ManagedPortfoliosApi$Toggles$RoboInvestmentSectionRedesign;
import com.revolut.feature.trading.managed_portfolios.api.navigation.ManagedPortfolioDetailsDestination;
import com.revolut.feature.trading.managed_portfolios.api.navigation.ManagedPortfolioInvestorUpdateDestination;
import com.revolut.feature.trading.managed_portfolios.api.navigation.PortfolioRevealDestination;
import com.revolut.feature.trading.managed_portfolios.impl.navigation.ManagedPortfoliosInternalDestination;
import com.revolut.feature.trading.managed_portfolios.impl.ui.compare.ManagedPortfoliosCompareController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.ManagedPortfoliosDetailsFlowController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.ManagedPortfoliosDetailsFlowControllerContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details.PerformanceDetailsScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details.PerformanceDetailsScreenContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.flow.InvestorUpdateFlow;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.flow.InvestorUpdateFlowContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.flow.PortfolioInsightsFlow;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealFlow;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealFlowContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.flow.ManagedPortfolioSelectTemplateFlow;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.flow.ManagedPortfolioSelectTemplateFlowContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.tactical_allocations.TacticalAllocationsController;
import java.util.List;
import java.util.Set;
import k5f.b;
import k5f.c;
import k5f.d;
import k5f.f;
import k5f.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f202937a;

    public a(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f202937a = deeplinkGateways;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        ManagedPortfolioSelectTemplateFlowContract$InputData selectInitialTemplate;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof k5f.g) {
            return ((k5f.g) descriptor).a(new ManagedPortfoliosCompareController());
        }
        if (descriptor instanceof PortfolioRevealDestination) {
            PortfolioRevealDestination portfolioRevealDestination = (PortfolioRevealDestination) descriptor;
            PortfolioRevealDestination.InputData inputData = portfolioRevealDestination.f91234b;
            return portfolioRevealDestination.a(new PortfolioRevealFlow(new PortfolioRevealFlowContract$InputData(inputData.f91235a, inputData.f91236b)));
        }
        if (descriptor instanceof h) {
            h hVar = (h) descriptor;
            return hVar.a(new PerformanceDetailsScreen(new PerformanceDetailsScreenContract$InputData(hVar.f181504a)));
        }
        if (!(descriptor instanceof f)) {
            return null;
        }
        f fVar = (f) descriptor;
        d dVar = fVar.f181503a;
        if (dVar instanceof k5f.a) {
            selectInitialTemplate = new ManagedPortfolioSelectTemplateFlowContract$InputData.ChangeCurrentTemplate(((k5f.a) dVar).f181498a);
        } else if (dVar instanceof b) {
            b bVar = (b) dVar;
            selectInitialTemplate = new ManagedPortfolioSelectTemplateFlowContract$InputData.ChangeInitialTemplate(bVar.f181499a, bVar.f181500b);
        } else {
            if (!(dVar instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            selectInitialTemplate = new ManagedPortfolioSelectTemplateFlowContract$InputData.SelectInitialTemplate(((c) dVar).f181501a);
        }
        return fVar.a(new ManagedPortfolioSelectTemplateFlow(selectInitialTemplate));
    }

    @Override // nte.a
    public final List e() {
        return v.k(ManagedPortfoliosApi$Toggles$ManagedPortfolios.f91228c, ManagedPortfoliosApi$Toggles$InvestorUpdatesFlow.f91227c, ManagedPortfoliosApi$Toggles$RoboInvestmentSectionRedesign.f91229c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ManagedPortfolioDetailsDestination) {
            return new ManagedPortfoliosDetailsFlowController(new ManagedPortfoliosDetailsFlowControllerContract$InputData(((ManagedPortfolioDetailsDestination) destination).f91230b.f91231a));
        }
        if (destination instanceof ManagedPortfolioInvestorUpdateDestination) {
            return new InvestorUpdateFlow(new InvestorUpdateFlowContract$InputData(((ManagedPortfolioInvestorUpdateDestination) destination).f91232b.f91233a));
        }
        if (destination instanceof PortfolioRevealDestination) {
            PortfolioRevealDestination.InputData inputData = ((PortfolioRevealDestination) destination).f91234b;
            return new PortfolioRevealFlow(new PortfolioRevealFlowContract$InputData(inputData.f91235a, inputData.f91236b));
        }
        if (!(destination instanceof ManagedPortfoliosInternalDestination)) {
            return null;
        }
        ManagedPortfoliosInternalDestination managedPortfoliosInternalDestination = (ManagedPortfoliosInternalDestination) destination;
        if (managedPortfoliosInternalDestination instanceof ManagedPortfoliosInternalDestination.PortfolioInsightsDestination) {
            return new PortfolioInsightsFlow(((ManagedPortfoliosInternalDestination.PortfolioInsightsDestination) managedPortfoliosInternalDestination).f91259b);
        }
        if (managedPortfoliosInternalDestination instanceof ManagedPortfoliosInternalDestination.TacticalAllocationDestination) {
            return new TacticalAllocationsController(((ManagedPortfoliosInternalDestination.TacticalAllocationDestination) managedPortfoliosInternalDestination).f91260b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // aii.p
    public final Set h() {
        return this.f202937a;
    }
}
