package cul;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvestOrderEditScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(InvestOrderEditScreen investOrderEditScreen, Continuation continuation) {
        super(2, continuation);
        this.v = investOrderEditScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CellDetailsSwitcherDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        a0 a0VarD = this.v.d();
        boolean z = model.f51915c;
        com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) a0VarD;
        eVar.getClass();
        eVar.n2(new af3.f(eVar, z, (Continuation) null, 9), new whi.b(6));
        return Unit.f186387a;
    }
}
