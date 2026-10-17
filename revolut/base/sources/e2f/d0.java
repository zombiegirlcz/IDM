package e2f;

import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.TradeRevPointsAgentDetailsScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import m1c.f1;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f122060w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f122061x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b f122062y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i, com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b bVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f122062y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                d0 d0Var = new d0(0, this.f122062y, continuation);
                d0Var.f122060w = flowCollector;
                d0Var.f122061x = obj3;
                return d0Var.invokeSuspend(Unit.f186387a);
            case 1:
                d0 d0Var2 = new d0(1, this.f122062y, continuation);
                d0Var2.f122060w = flowCollector;
                d0Var2.f122061x = obj3;
                return d0Var2.invokeSuspend(Unit.f186387a);
            default:
                d0 d0Var3 = new d0(2, this.f122062y, continuation);
                d0Var3.f122060w = flowCollector;
                d0Var3.f122061x = obj3;
                return d0Var3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        u2f.d dVar;
        String str;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f122060w;
                    Data data = (Data) this.f122061x;
                    Flow gVar = new go.g(new Data(zhm.f0.f322471a, null, false, 6, null), 2);
                    u2f.d dVar2 = (u2f.d) data.getContent();
                    if (dVar2 != null && dVar2.f276625n.contains(u2f.l.GIFT_CARDS) && (dVar = (u2f.d) data.getContent()) != null && (str = dVar.f276626p) != null) {
                        gVar = rd0.e.n(this.f122062y.f91150r.c(str, w4l.i.f294643c), zhm.h0.f322473a);
                    }
                    this.f122060w = null;
                    this.f122061x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector);
                    Object objCollect = gVar.collect(new b8d.a0(flowCollector, data, 2), this);
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar) {
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
                    FlowCollector flowCollector2 = this.f122060w;
                    vkm.d dVarB = rd0.e.b(this.f122062y.v.c(new RevPointsTransactionPageParams(1, null, null, null, f1.TRAINS_POINTS, null, null, null, null, 494)));
                    this.f122060w = null;
                    this.f122061x = null;
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
            default:
                com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b bVar = this.f122062y;
                TradeRevPointsAgentDetailsScreenContract$InputData tradeRevPointsAgentDetailsScreenContract$InputData = bVar.o;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f122060w;
                    vkm.d dVarH = bVar.f91148p.h(tradeRevPointsAgentDetailsScreenContract$InputData.f91137a, w4l.h.f294642c);
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    j23.b bVarD = yh5.b.d(vkm.q.Q(rd0.e.n(dVarH, h0Var), new d0(0, bVar, null)), rd0.e.n(bVar.f91151s.o(tradeRevPointsAgentDetailsScreenContract$InputData.f91137a, tradeRevPointsAgentDetailsScreenContract$InputData.f91138b), h0Var));
                    this.f122060w = null;
                    this.f122061x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, bVarD, this) == aVar3) {
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
