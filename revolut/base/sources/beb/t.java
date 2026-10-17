package beb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xdb.y f14753w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a aVar, xdb.y yVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f14753w = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.v, this.f14753w, continuation);
        tVar.u = obj2;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ((t) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        return Boolean.TRUE;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Throwable th10 = (Throwable) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a aVar2 = this.v;
        aVar2.H2(aVar2.f82839s, new s(this.f14753w, th10, 0));
        return Boolean.TRUE;
    }
}
