package t73;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class p2 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p2(this.v, continuation, 0);
            default:
                return new p2(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p2) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h93.f0 f0Var = (h93.f0) ((q0) ((vkm.j2) gVar.f65434h0.f22677a).getValue()).d.f224257a;
                if (f0Var != null) {
                    gVar.l2(new r1(gVar, f0Var, null, 10), new yi5.b(26));
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gVar.H2(gVar.f65434h0, new d(15));
                break;
        }
        return Unit.f186387a;
    }
}
