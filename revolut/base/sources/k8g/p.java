package k8g;

import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import m1c.f1;
import vkm.q0;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f182147w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f182148x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a f182149y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f182149y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                p pVar = new p(0, this.f182149y, continuation);
                pVar.f182147w = flowCollector;
                pVar.f182148x = obj3;
                return pVar.invokeSuspend(Unit.f186387a);
            case 1:
                p pVar2 = new p(1, this.f182149y, continuation);
                pVar2.f182147w = flowCollector;
                pVar2.f182148x = obj3;
                return pVar2.invokeSuspend(Unit.f186387a);
            default:
                p pVar3 = new p(2, this.f182149y, continuation);
                pVar3.f182147w = flowCollector;
                pVar3.f182148x = obj3;
                return pVar3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f182147w;
                    q0 q0VarN = rd0.e.n(this.f182149y.o.p(com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a.f93605y), h0.f322473a);
                    this.f182147w = null;
                    this.f182148x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, q0VarN, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f182147w;
                    q0 q0VarN2 = rd0.e.n(this.f182149y.f93606p.i(com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a.f93605y), h0.f322473a);
                    this.f182147w = null;
                    this.f182148x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, q0VarN2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f182147w;
                    y yVarD = rd0.e.d(rd0.e.b(this.f182149y.f93609s.c(new RevPointsTransactionPageParams(3, null, null, null, f1.HOTELS_POINTS, null, null, null, null, 494))), h0.f322473a);
                    this.f182147w = null;
                    this.f182148x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, yVarD, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
