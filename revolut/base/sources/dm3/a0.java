package dm3;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class a0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.contacts.impl.ui.contact.screen.details.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.revolut.feature.contacts.impl.ui.contact.screen.details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a0 a0Var = new a0(this.v, continuation);
        a0Var.u = obj2;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a0) create((k71.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        k71.q qVar = (k71.q) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.contacts.impl.ui.contact.screen.details.a aVar2 = this.v;
        aVar2.H2(aVar2.G, new ahf.v(qVar, 1));
        return Unit.f186387a;
    }
}
