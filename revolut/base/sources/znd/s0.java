package znd;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class s0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar = this.v;
            kge.d dVar = bVar.f87567t;
            yld.d dVar2 = bVar.v.f87547b;
            this.u = 1;
            if (dVar.y(dVar2, this) == aVar) {
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
