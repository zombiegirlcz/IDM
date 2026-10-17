package al2;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import gim.i;
import hha.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.p0;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ d u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((p0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = this.u;
        ((r60.d) dVar.f6136l).Q();
        u.Companion.getClass();
        dVar.A2(new BridgeDestination(new FeatureCommand(new PricingPlanFeatureConfig.DashboardByFeature(u.e, xfa.b.PROFILE_LIMITS_ATM, null, false, 1020))));
        return Unit.f186387a;
    }
}
