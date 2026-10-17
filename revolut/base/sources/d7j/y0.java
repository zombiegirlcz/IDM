package d7j;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import e7l.g;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class y0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f112079w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f112080x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g f112081y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(int i, com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f112081y = gVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                y0 y0Var = new y0(0, this.f112081y, continuation);
                y0Var.f112079w = flowCollector;
                y0Var.f112080x = obj3;
                return y0Var.invokeSuspend(Unit.f186387a);
            case 1:
                y0 y0Var2 = new y0(1, this.f112081y, continuation);
                y0Var2.f112079w = flowCollector;
                y0Var2.f112080x = obj3;
                return y0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                y0 y0Var3 = new y0(2, this.f112081y, continuation);
                y0Var3.f112079w = flowCollector;
                y0Var3.f112080x = obj3;
                return y0Var3.invokeSuspend(Unit.f186387a);
            default:
                y0 y0Var4 = new y0(3, this.f112081y, continuation);
                y0Var4.f112079w = flowCollector;
                y0Var4.f112080x = obj3;
                return y0Var4.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f112079w;
                    Pair pair = (Pair) this.f112080x;
                    Set allowedAssetTypes = (Set) pair.f186385a;
                    wd6.h orderType = (wd6.h) pair.f186386b;
                    com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar = this.f112081y;
                    b7j.j jVar = gVar.f99863s;
                    xi0.b baseOrderCurrency = gVar.N.f99825a.f99807c.f99802a;
                    jVar.getClass();
                    Intrinsics.checkNotNullParameter(baseOrderCurrency, "baseOrderCurrency");
                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                    Intrinsics.checkNotNullParameter(allowedAssetTypes, "allowedAssetTypes");
                    vkm.d dVarB = rd0.e.b(nim.a.w(kli.a.h(((ik3.c) jVar.f13063b).l(g.b.f123407a, w4l.h.f294642c), rd0.e.c(((s6j.a) jVar.f13064c).a(), kotlin.coroutines.g.f186406a)), new b4d.c(baseOrderCurrency, 8, orderType, allowedAssetTypes)));
                    this.f112079w = null;
                    this.f112080x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, dVarB, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f112079w;
                    r0 r0Var = (r0) this.f112080x;
                    akg.n nVarV = nim.a.v(rd0.e.b(this.f112081y.E.c(v1.c.w(r0Var.f112045a, r0Var.f112047c), n9l.b.SEC_3)), new a26.p(r0Var, 18));
                    this.f112079w = null;
                    this.f112080x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVarV, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f112079w;
                    OrderQuoteParams orderQuoteParams = (OrderQuoteParams) this.f112080x;
                    Flow flowV = orderQuoteParams != null ? nim.a.v(o7.b.u(this.f112081y.A, orderQuoteParams), new a26.p(orderQuoteParams, 19)) : new go.g(new Data(null, null, false, 2, null), 2);
                    this.f112079w = null;
                    this.f112080x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowV, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f112079w;
                    com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar2 = this.f112081y;
                    Continuation continuation = null;
                    vkm.y yVarE = rd0.e.e(new vkm.v1(new j1(0, gVar2, continuation)), m72.b.w("CommodityOrderEditModel", "DraftInitialization"), new awd.b(gVar2, continuation, 24));
                    this.f112079w = null;
                    this.f112080x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, yVarE, this) == aVar4) {
                        return aVar4;
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
