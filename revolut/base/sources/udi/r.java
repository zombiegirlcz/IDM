package udi;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f279219w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f279220x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_rev_points_pocket_impl.ui.screen.details.b f279221y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, com.revolut.feature_rev_points_pocket_impl.ui.screen.details.b bVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f279221y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                r rVar = new r(0, this.f279221y, continuation);
                rVar.f279219w = flowCollector;
                rVar.f279220x = obj3;
                return rVar.invokeSuspend(Unit.f186387a);
            default:
                r rVar2 = new r(1, this.f279221y, continuation);
                rVar2.f279219w = flowCollector;
                rVar2.f279220x = obj3;
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
                    FlowCollector flowCollector = this.f279219w;
                    akg.n nVarV = nim.a.v(this.f279221y.o.c(w4l.h.f294642c), s.f279222a);
                    this.f279219w = null;
                    this.f279220x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, nVarV, this) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f279219w;
                    vkm.d dVarB = this.f279221y.o.b(w4l.h.f294642c);
                    this.f279219w = null;
                    this.f279220x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB, this) == aVar2) {
                        return aVar2;
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
