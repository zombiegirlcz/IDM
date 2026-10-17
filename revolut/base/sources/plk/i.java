package plk;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import pj9.n;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        j jVar = this.v;
        if (i == 0) {
            o.b(obj2);
            d0 d0VarFirstOrError = m70.a.g(jVar.o.n(), null, null, 3).map(new pjg.i(new n(22), 12)).firstOrError();
            Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
            this.u = 1;
            obj2 = nim.a.b(d0VarFirstOrError, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return jVar.C1(new BridgeDestination(new FeatureCommand(new PricingPlanFeatureConfig.DashboardByPlans(null, u.c(((hha.d) obj2).f152287a), null, null, true, xfa.b.DOWNGRADE, 173))));
    }
}
