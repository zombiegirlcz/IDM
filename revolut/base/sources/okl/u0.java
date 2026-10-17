package okl;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class u0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f226241w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.revolut.sso.impl.ui.auth.n nVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = nVar;
        this.f226241w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new u0(this.v, this.f226241w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((u0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        bjl.p0 p0Var = this.v.S;
        this.u = 1;
        BridgeDestination bridgeDestinationC = ((rqk.k) p0Var).c(null, this.f226241w);
        return bridgeDestinationC == aVar ? aVar : bridgeDestinationC;
    }
}
