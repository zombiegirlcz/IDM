package p7f;

import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.InvestorUpdateHistoryFlow;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.StrategyReportScreenContract$ModalStep;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.a f233769b;

    public /* synthetic */ o(com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.a aVar, int i) {
        this.f233768a = i;
        this.f233769b = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f233768a) {
            case 0:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                StrategyReportScreenContract$ModalStep step = (StrategyReportScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof StrategyReportScreenContract$ModalStep.InvestorUpdateHistory)) {
                    throw new NoWhenBranchMatchedException();
                }
                InvestorUpdateHistoryFlow investorUpdateHistoryFlow = new InvestorUpdateHistoryFlow(((StrategyReportScreenContract$ModalStep.InvestorUpdateHistory) step).f91371a);
                com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.a aVar = this.f233769b;
                aVar.a(investorUpdateHistoryFlow, new o(aVar, 1));
                return investorUpdateHistoryFlow;
            default:
                oki.g onResult = (oki.g) obj2;
                l7f.e output = (l7f.e) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(output, "output");
                this.f233769b.f91373q.setValue(output.f192580a);
                return Unit.f186387a;
        }
    }
}
