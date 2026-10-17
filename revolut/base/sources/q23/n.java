package q23;

import com.revolut.feature.address.models.Address;
import e7l.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b u;
    public final /* synthetic */ Address v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b bVar, Address address, Continuation continuation) {
        super(2, continuation);
        this.u = bVar;
        this.v = address;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b bVar = this.u;
        fk3.a aVar2 = bVar.f65154x;
        vkm.d dVarB = rd0.e.b(((ik3.c) aVar2).l(g.a.f123406a, w4l.j.f294644c));
        Address address = this.v;
        return yji.l.a1(bVar, nim.a.v(dVarB, new avj.p(address, 21)), null, null, new o4a.b(address, bVar, null, 20), 3);
    }
}
