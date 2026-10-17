package ybh;

import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.WealthAddMoneyScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class e1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ WealthAddMoneyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(WealthAddMoneyScreen wealthAddMoneyScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = wealthAddMoneyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e1(this.v, continuation, 0);
            case 1:
                return new e1(this.v, continuation, 1);
            default:
                return new e1(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e1) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        WealthAddMoneyScreen wealthAddMoneyScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) wealthAddMoneyScreen.R2()).accept(d.f312300a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) wealthAddMoneyScreen.R2()).accept(j.f312315a);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) wealthAddMoneyScreen.R2()).accept(e.f312301a);
                break;
        }
        return Unit.f186387a;
    }
}
