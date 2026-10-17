package zul;

import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InvestmentProjectionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(InvestmentProjectionsScreen investmentProjectionsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = investmentProjectionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InvestmentProjectionsScreen investmentProjectionsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.trading.orders.ui.screens.investment_plan.projection.a) investmentProjectionsScreen.R2()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.screens.investment_plan.projection.a aVar3 = (com.revolut.trading.orders.ui.screens.investment_plan.projection.a) investmentProjectionsScreen.R2();
                aVar3.getClass();
                aVar3.n2(new e0(0, aVar3, null), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
