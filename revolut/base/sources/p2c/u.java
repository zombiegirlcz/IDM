package p2c;

import com.revolut.core.backend_flow.api.navigation.BackendFlowDestination;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import java.time.Period;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new u(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((u) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ufm.n nVarE = aVar2.f84182p.e();
            this.u = 1;
            obj2 = nim.a.b(nVarE, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Period period = ((m1c.q) obj2).f201439a;
        return aVar2.C1(new BridgeDestination(u0.f(new BackendFlowDestination(period != null ? BackendFlowInput.Companion.a(BackendFlowInput.INSTANCE, "rev-points-spare-change-refund-sc-active-for-user-with-param", a0.d.x("sc_refund_interval", String.valueOf(period.getDays())), null, 4) : BackendFlowInput.Companion.a(BackendFlowInput.INSTANCE, "rev-points-spare-change-refund-sc-active-for-user", null, null, 6)))));
    }
}
