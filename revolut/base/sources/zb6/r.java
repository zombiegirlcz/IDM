package zb6;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.v, continuation);
        rVar.u = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        xi0.b bVar = (xi0.b) pair.f186385a;
        xi0.b bVar2 = ((ba6.l) pair.f186386b).i.f115083b;
        com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a aVar2 = this.v;
        return vkm.q.R(xam.a.h(new s(aVar2, null), vkm.q.Q(aVar2.C, new x4k.c((Continuation) null, aVar2, bVar, bVar2, 6))), new t(aVar2, null));
    }
}
