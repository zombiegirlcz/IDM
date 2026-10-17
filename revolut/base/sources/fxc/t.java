package fxc;

import com.revolut.feature.card.verification.api.navigation.CardVerificationFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ u u;
    public final /* synthetic */ t61.g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, t61.g gVar, Continuation continuation) {
        super(1, continuation);
        this.u = uVar;
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = this.v.f268137a;
        u uVar = this.u;
        return uVar.C1(new BridgeDestination(new FeatureCommand(new CardVerificationFeatureConfig.CardVerificationForResult(str, uVar.o.f85821b))));
    }
}
