package k3k;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class h0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ t0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(t0 t0Var, Continuation continuation) {
        super(2, continuation);
        this.v = t0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        t0 t0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ufm.i iVarB = ((ym6.d) t0Var.f180796t).b(null, null, false);
            this.u = 1;
            obj2 = nim.a.b(iVarB, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return t0Var.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP)), (NaviCommand) obj2)));
    }
}
