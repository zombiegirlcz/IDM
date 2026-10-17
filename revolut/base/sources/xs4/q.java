package xs4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c f308411w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f308411w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f308411w, continuation, 0);
            default:
                return new q(this.f308411w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c cVar = this.f308411w;
                p pVar = new p(cVar, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(cVar.k, "credit_card_reload_instalment_plan_details", pVar, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c cVar2 = this.f308411w;
                p pVar2 = new p(cVar2, null, 3);
                this.v = 1;
                Object objB2 = pu7.a.B(cVar2.k, "Repay instalments", pVar2, this);
                return objB2 == aVar2 ? aVar2 : objB2;
        }
    }
}
