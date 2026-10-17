package i6f;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ ManagedPortfolioDetailsController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ManagedPortfolioDetailsController managedPortfolioDetailsController, Continuation continuation) {
        super(2, continuation);
        this.u = managedPortfolioDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.trading.managed_portfolios.impl.ui.details.c cVar = (com.revolut.feature.trading.managed_portfolios.impl.ui.details.c) this.u.d();
        oki.h.v2(cVar.J, new ManagedPortfolioDetailsControllerContract$ModalStep.PerformanceDetails(cVar.A.f91277a), ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
