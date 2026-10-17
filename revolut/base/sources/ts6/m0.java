package ts6;

import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ s0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(s0 s0Var, Continuation continuation) {
        super(1, continuation);
        this.v = s0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            FeatureCommand featureCommandF = zh9.u0.f(new FreelancerBizFeatureConfig.TaxHub(0));
            this.u = 1;
            obj2 = this.v.g(null, featureCommandF, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return new BridgeDestination((NaviCommand) obj2);
    }
}
