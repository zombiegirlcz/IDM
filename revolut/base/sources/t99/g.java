package t99;

import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.onboarding.impl.exchange_global_access.flow.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.onboarding.impl.exchange_global_access.flow.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ExchangeGlobalAccessOutput.FeatureNotAvailable featureNotAvailable = ExchangeGlobalAccessOutput.FeatureNotAvailable.f78172a;
        com.revolut.feature.onboarding.impl.exchange_global_access.flow.a aVar2 = this.u;
        aVar2.L2(featureNotAvailable);
        oki.h.D2(aVar2.u);
        return Unit.f186387a;
    }
}
