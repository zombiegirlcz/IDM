package zul;

import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvestmentProjectionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InvestmentProjectionsScreen investmentProjectionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = investmentProjectionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarR2 = this.v.R2();
        int i = ((cy0.a) pair.f186386b).f110014a;
        com.revolut.trading.orders.ui.screens.investment_plan.projection.a aVar2 = (com.revolut.trading.orders.ui.screens.investment_plan.projection.a) qVarR2;
        aVar2.getClass();
        aVar2.n2(new cam.q(i, 14, aVar2, null), new whi.b(6));
        return Unit.f186387a;
    }
}
