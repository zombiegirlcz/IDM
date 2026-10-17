package uf7;

import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import tof.a3;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 extends gim.i implements Function1 {
    public final /* synthetic */ f0 u;
    public final /* synthetic */ a3 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, a3 a3Var, Continuation continuation) {
        super(1, continuation);
        this.u = f0Var;
        this.v = a3Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d0(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return this.u.C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(this.v.f272581b), null, null, null, 126))));
    }
}
