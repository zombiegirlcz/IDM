package jwf;

import com.revolut.feature.transport.impl.common.TransportHubLocation;
import com.revolut.feature.transport.models.TransportLocation;
import ivf.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransportHubLocation f178988w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, TransportHubLocation transportHubLocation, Continuation continuation) {
        super(1, continuation);
        this.v = nVar;
        this.f178988w = transportHubLocation;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.v, this.f178988w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
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
        ouf.a aVar2 = this.v.f178991q;
        TransportLocation transportLocation = ((TransportHubLocation.Selected) this.f178988w).f92504a;
        this.u = 1;
        Object objC = ((r) aVar2).c(transportLocation, this);
        return objC == aVar ? aVar : objC;
    }
}
