package x23;

import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class s extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.v, continuation, 0);
            default:
                return new s(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((s) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((CardPersonalisationController) cVar.f65175s.f302493a).d3().f211227c.u0();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((CardPersonalisationController) cVar.f65175s.f302493a).d3().f211227c.u0();
                cVar.H2(cVar.f65179y, new x1.n(27));
                break;
        }
        return Unit.f186387a;
    }
}
