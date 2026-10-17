package ble;

import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class i1 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.tab.invest.impl.ui.home.f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.revolut.feature.tab.invest.impl.ui.home.f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i1 i1Var = new i1(this.v, continuation);
        i1Var.u = obj2;
        return i1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i1) create((NavBarMessage) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        NavBarMessage navBarMessage = (NavBarMessage) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.tab.invest.impl.ui.home.f fVar = this.v;
        fVar.H2(fVar.f89873e0, new f1(navBarMessage, 0));
        return Unit.f186387a;
    }
}
