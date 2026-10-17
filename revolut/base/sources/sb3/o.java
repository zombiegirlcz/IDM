package sb3;

import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.k1;
import sb3.i;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ p v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Continuation continuation) {
        super(2, continuation);
        this.v = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((ob3.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ob3.a aVar = (ob3.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (aVar.f223867a instanceof k1) {
            BridgeDestination bridgeDestinationB = u0.b(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(aVar.f223868b), null, null, null, 126)));
            p pVar = this.v;
            pVar.C1(bridgeDestinationB);
            pVar.C2(i.b.f261482a);
        }
        return Unit.f186387a;
    }
}
