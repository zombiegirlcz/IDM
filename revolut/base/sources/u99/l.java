package u99;

import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c cVar, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c.Companion;
        this.u.K2(ExchangeGlobalAccessOutput.FeatureNotAvailable.f78172a);
        return Unit.f186387a;
    }
}
