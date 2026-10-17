package sdi;

import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import efm.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import m1c.f1;
import mif.e0;
import sa6.y;
import vdl.c1;
import vkm.s1;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f261921w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f261922x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f261923y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Continuation continuation, q qVar) {
        super(3, continuation);
        this.u = i;
        this.f261923y = qVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                o oVar = new o(0, continuation, this.f261923y);
                oVar.f261921w = flowCollector;
                oVar.f261922x = obj3;
                return oVar.invokeSuspend(Unit.f186387a);
            default:
                o oVar2 = new o(1, continuation, this.f261923y);
                oVar2.f261921w = flowCollector;
                oVar2.f261922x = obj3;
                return oVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow gVar;
        int i = this.u;
        q qVar = this.f261923y;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f261921w;
                    RevPointsPocketState revPointsPocketState = (RevPointsPocketState) this.f261922x;
                    if (revPointsPocketState instanceof RevPointsPocketState.Active) {
                        gVar = vkm.q.Q(rd0.e.b(ue0.e.E(m70.a.g(qVar.e.b(), null, new sa5.a(18), 1), 2)), new o(i2, continuation, qVar));
                    } else {
                        if (!(revPointsPocketState instanceof RevPointsPocketState.Inactive)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        gVar = new go.g(f0.f322471a, 2);
                    }
                    this.f261921w = null;
                    this.f261922x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, gVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f261921w;
                    int iIntValue = ((Number) this.f261922x).intValue();
                    Flow flowA = qVar.f261926a.a(new RevPointsTransactionPageParams(iIntValue + 1, null, null, null, f1.REVPOINTS_POCKET, null, null, null, null, 494));
                    r map = ((njf.j) qVar.f).f().map(new sc7.g(new y(28), 21));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    vkm.d dVarB = rd0.e.b(map);
                    p pVar = new p(iIntValue, null, qVar);
                    this.f261921w = null;
                    this.f261922x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector2);
                    Object objG = e0.g(this, s1.f290118a, new c1((Function3) pVar, (Continuation) null, 15), flowCollector2, new Flow[]{flowA, dVarB});
                    if (objG != fim.a.COROUTINE_SUSPENDED) {
                        objG = Unit.f186387a;
                    }
                    if (objG != fim.a.COROUTINE_SUSPENDED) {
                        objG = Unit.f186387a;
                    }
                    if (objG == obj3) {
                        return obj3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
