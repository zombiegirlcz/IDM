package i52;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class c0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c0 c0Var = new c0(this.v, continuation);
        c0Var.u = obj2;
        return c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c0) create((c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c cVar = (c) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a aVar2 = this.v;
        aVar2.H2(aVar2.A, new i30.a(cVar, 14));
        return Unit.f186387a;
    }
}
