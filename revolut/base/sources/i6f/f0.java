package i6f;

import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsControllerContract$ModalStep;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.rebalance.RebalanceDialogScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.rebalance.RebalanceDialogScreenContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.managed_portfolio_benchmark.ManagedPortfolioBenchmarkScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.managed_portfolio_benchmark.ManagedPortfolioBenchmarkScreenContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details.PerformanceDetailsScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details.PerformanceDetailsScreenContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.portfolio_actions.ManagedPortfolioDetailsActionsScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.portfolio_actions.ManagedPortfolioDetailsActionsScreenContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.target_allocations.TargetAllocationsController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.target_allocations.TargetAllocationsControllerContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trading.managed_portfolios.impl.ui.details.c f158928b;

    public /* synthetic */ f0(com.revolut.feature.trading.managed_portfolios.impl.ui.details.c cVar, int i) {
        this.f158927a = i;
        this.f158928b = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f158927a) {
            case 0:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ManagedPortfolioDetailsControllerContract$ModalStep step = (ManagedPortfolioDetailsControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                boolean z = step instanceof ManagedPortfolioDetailsControllerContract$ModalStep.BenchmarkChooser;
                com.revolut.feature.trading.managed_portfolios.impl.ui.details.c cVar = this.f158928b;
                if (z) {
                    ManagedPortfolioBenchmarkScreen managedPortfolioBenchmarkScreen = new ManagedPortfolioBenchmarkScreen(new ManagedPortfolioBenchmarkScreenContract$InputData(cVar.A.f91277a, ((ManagedPortfolioDetailsControllerContract$ModalStep.BenchmarkChooser) step).f91278a));
                    g0 block = new g0(cVar, 1);
                    Intrinsics.checkNotNullParameter(block, "block");
                    managedPortfolioBenchmarkScreen.H = block;
                    return managedPortfolioBenchmarkScreen;
                }
                if (step instanceof ManagedPortfolioDetailsControllerContract$ModalStep.MoreActions) {
                    ManagedPortfolioDetailsActionsScreen managedPortfolioDetailsActionsScreen = new ManagedPortfolioDetailsActionsScreen(new ManagedPortfolioDetailsActionsScreenContract$InputData(((ManagedPortfolioDetailsControllerContract$ModalStep.MoreActions) step).f91280b));
                    cVar.a(managedPortfolioDetailsActionsScreen, new fb.c(cVar, step, 17));
                    return managedPortfolioDetailsActionsScreen;
                }
                if (step instanceof ManagedPortfolioDetailsControllerContract$ModalStep.RebalanceStatus) {
                    RebalanceDialogScreen rebalanceDialogScreen = new RebalanceDialogScreen(new RebalanceDialogScreenContract$InputData(((ManagedPortfolioDetailsControllerContract$ModalStep.RebalanceStatus) step).f91282a));
                    cVar.a(rebalanceDialogScreen, new f0(cVar, 1));
                    return rebalanceDialogScreen;
                }
                if (step instanceof ManagedPortfolioDetailsControllerContract$ModalStep.TargetAllocations) {
                    return new TargetAllocationsController(new TargetAllocationsControllerContract$InputData(((ManagedPortfolioDetailsControllerContract$ModalStep.TargetAllocations) step).f91283a));
                }
                if (step instanceof ManagedPortfolioDetailsControllerContract$ModalStep.PerformanceDetails) {
                    return new PerformanceDetailsScreen(new PerformanceDetailsScreenContract$InputData(((ManagedPortfolioDetailsControllerContract$ModalStep.PerformanceDetails) step).f91281a));
                }
                throw new NoWhenBranchMatchedException();
            default:
                oki.g onResult = (oki.g) obj2;
                n6f.g result = (n6f.g) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof n6f.f) {
                    com.revolut.feature.trading.managed_portfolios.impl.ui.details.c cVar2 = this.f158928b;
                    oki.h.v2(cVar2.J, new ManagedPortfolioDetailsControllerContract$ModalStep.TargetAllocations(cVar2.A.f91277a), ModalDestination.Style.POPUP.f98311a);
                }
                return Unit.f186387a;
        }
    }
}
