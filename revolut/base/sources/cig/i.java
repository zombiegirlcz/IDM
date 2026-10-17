package cig;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ com.revolut.feature.travel.miles.impl.ui.screen.home.search.a u;
    public final /* synthetic */ u2f.d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.travel.miles.impl.ui.screen.home.search.a aVar, u2f.d dVar, Continuation continuation) {
        super(1, continuation);
        this.u = aVar;
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        this.u.C2(new f(this.v));
        return Unit.f186387a;
    }
}
