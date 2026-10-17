package zul;

import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ InvestmentProjectionsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InvestmentProjectionsScreen investmentProjectionsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = investmentProjectionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((InputSliderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.trading.orders.ui.screens.investment_plan.projection.a aVar2 = (com.revolut.trading.orders.ui.screens.investment_plan.projection.a) this.u.R2();
        aVar2.getClass();
        aVar2.n2(new e0(1, aVar2, null), new whi.b(6));
        return Unit.f186387a;
    }
}
