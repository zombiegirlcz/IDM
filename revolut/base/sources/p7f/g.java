package p7f;

import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.InvestorUpdateHistoryFlowContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.StrategyReportScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.StrategyReportScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ StrategyReportScreen f233761w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(StrategyReportScreen strategyReportScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f233761w = strategyReportScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f233761w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f233761w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        StrategyReportScreen strategyReportScreen = this.f233761w;
        switch (i) {
            case 0:
                String templateId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.a aVar2 = (com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.a) strategyReportScreen.d();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(templateId, "templateId");
                oki.h.v2(aVar2.f91376t, new StrategyReportScreenContract$ModalStep.InvestorUpdateHistory(new InvestorUpdateHistoryFlowContract$InputData(templateId, (String) aVar2.f91373q.getValue())), ModalDestination.Style.POPUP.f98311a);
                break;
            default:
                String deeplink = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.a aVar4 = (com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.a) strategyReportScreen.d();
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                aVar4.n2(new osk.m(aVar4, deeplink, null, 23), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
