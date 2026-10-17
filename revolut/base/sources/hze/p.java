package hze;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c f157170w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f157170w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.f157170w, continuation);
        pVar.v = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((cue.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        cue.d dVar = (cue.d) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar = this.f157170w;
            com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.b bVar = new com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.b(dVar, cVar, null);
            this.v = null;
            this.u = 1;
            if (cVar.p2(this, bVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
