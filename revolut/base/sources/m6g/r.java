package m6g;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.v1;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f203109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f203110x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a f203111y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Continuation continuation, com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a aVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f203111y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                r rVar = new r(continuation, this.f203111y, 0);
                rVar.f203109w = flowCollector;
                rVar.f203110x = obj3;
                return rVar.invokeSuspend(Unit.f186387a);
            default:
                r rVar2 = new r(continuation, this.f203111y, 1);
                rVar2.f203109w = flowCollector;
                rVar2.f203110x = obj3;
                return rVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f203109w;
                    w4l.k loadingStrategy = (w4l.k) this.f203110x;
                    com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a aVar2 = this.f203111y;
                    h4g.h hVar = aVar2.f93369t;
                    String offerId = aVar2.o.f93355a;
                    hVar.getClass();
                    Intrinsics.checkNotNullParameter(offerId, "offerId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    v1 v1Var = new v1(new ac8.h(hVar, offerId, loadingStrategy, (Continuation) null, 8));
                    this.f203109w = null;
                    this.f203110x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, v1Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f203109w;
                    akg.n nVarJ = this.f203111y.f93368s.j((w4l.k) this.f203110x);
                    this.f203109w = null;
                    this.f203110x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVarJ, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
