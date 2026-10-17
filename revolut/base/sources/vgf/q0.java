package vgf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tof.t2;

/* JADX INFO: loaded from: classes8.dex */
public final class q0 extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.u = aVar;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q0(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar2 = this.u;
        return aVar2.C1(aVar2.f91941y.b((t2) this.v));
    }
}
