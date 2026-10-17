package no;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class s2 extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.analytics.tracking.v3.l u;
    public final /* synthetic */ ho.l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(com.revolut.analytics.tracking.v3.l lVar, ho.l lVar2, Continuation continuation) {
        super(2, continuation);
        this.u = lVar;
        this.v = lVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s2(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((ho.t) this.u.i.get()).e2(this.v);
        return Unit.f186387a;
    }
}
