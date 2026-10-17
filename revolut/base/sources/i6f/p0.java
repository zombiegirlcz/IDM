package i6f;

import i6f.v;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.trading.managed_portfolios.impl.ui.details.c u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.revolut.feature.trading.managed_portfolios.impl.ui.details.c cVar, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p0(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.u.C2(v.c.f158987a);
        return Unit.f186387a;
    }
}
