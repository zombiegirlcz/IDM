package c7i;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature_move_money.impl.automation.screen.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.revolut.feature_move_money.impl.automation.screen.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j0 j0Var = new j0(this.v, continuation);
        j0Var.u = obj2;
        return j0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j0) create((h7i.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h7i.p pVar = (h7i.p) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature_move_money.impl.automation.screen.c cVar = this.v;
        cVar.H2(cVar.D, new c69.v(pVar, 9));
        return Unit.f186387a;
    }
}
