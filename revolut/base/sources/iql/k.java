package iql;

import bjl.p0;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.sso.impl.domain.models.Claim;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.signup.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Claim f167902w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.sso.impl.ui.signup.b bVar, Claim claim, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f167902w = claim;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.v, this.f167902w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
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
        p0 p0Var = this.v.u;
        String str = ((Claim.Phone) this.f167902w).f106131a;
        this.u = 1;
        BridgeDestination bridgeDestinationC = ((rqk.k) p0Var).c(str, null);
        return bridgeDestinationC == aVar ? aVar : bridgeDestinationC;
    }
}
