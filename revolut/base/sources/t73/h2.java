package t73;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class h2 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h2 h2Var = new h2(this.v, continuation);
        h2Var.u = obj2;
        return h2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h2) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = this.v;
        gVar.H2(gVar.f65434h0, new t05.v(data, 15));
        return Unit.f186387a;
    }
}
