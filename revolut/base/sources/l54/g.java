package l54;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b bVar, Continuation continuation) {
        super(1, continuation);
        this.u = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b bVar = this.u;
        ((qb5.b) bVar.f67137t).b(bVar.f67133p.f67119a, bVar.P2(), false);
        bVar.f67134q.getClass();
        l.a1(bVar, bVar.X1(wj4.a.b()), null, null, new i(bVar, null, 2), 3);
        return Unit.f186387a;
    }
}
