package sdi;

import aii.u;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function1 {
    public h u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f261903w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation continuation) {
        super(1, continuation);
        this.f261903w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.f261903w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h hVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            h hVar2 = this.f261903w;
            edi.a aVar2 = hVar2.f261906p;
            this.u = hVar2;
            this.v = 1;
            Object objB = ((ndi.b) aVar2).b(RevPointsOptInSource.PointsPocketDiscovery.f84000a, this);
            if (objB == aVar) {
                return aVar;
            }
            hVar = hVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = this.u;
            yhm.o.b(obj2);
        }
        return hVar.A2((u) obj2);
    }
}
