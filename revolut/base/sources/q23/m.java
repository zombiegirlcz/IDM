package q23;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.v, continuation, 0);
            case 1:
                return new m(this.v, continuation, 1);
            default:
                return new m(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((rp0.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Continuation continuation = null;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b bVar = this.v;
                return yji.l.a1(bVar, rd0.e.b(((ik3.g) ((ik3.c) bVar.f65154x).f161878a).f161890j.e(Unit.f186387a, w4l.h.f294642c)), null, null, new l(bVar, continuation, 0), 3);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b bVar2 = this.v;
                return yji.l.a1(bVar2, xam.a.h(new jkh.g(bVar2, continuation, 26), nim.a.v(rd0.e.b(((ha3.m) bVar2.f65150r).b(bVar2.o.f65140b ? l93.c.JUNIOR : l93.c.RETAIL)), new q09.a(27))), null, null, new l(bVar2, continuation, 1), 3);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b bVar3 = this.v;
                bVar3.H2(bVar3.B, new q09.a(28));
                return Unit.f186387a;
        }
    }
}
