package cul;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ InvestOrderEditScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InvestOrderEditScreen investOrderEditScreen, Continuation continuation) {
        super(2, continuation);
        this.u = investOrderEditScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CellDetailsSwitcherDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.u.d();
        eVar.getClass();
        eVar.n2(new j1(eVar, null, 4), new whi.b(6));
        return Unit.f186387a;
    }
}
