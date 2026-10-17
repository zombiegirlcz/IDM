package avk;

import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.t0;

/* JADX INFO: loaded from: classes12.dex */
public final class y extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f10129w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f10130x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h0 f10131y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, h0 h0Var, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f10131y = h0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                y yVar = new y(0, this.f10131y, continuation);
                yVar.f10129w = flowCollector;
                yVar.f10130x = obj3;
                return yVar.invokeSuspend(Unit.f186387a);
            case 1:
                y yVar2 = new y(1, this.f10131y, continuation);
                yVar2.f10129w = flowCollector;
                yVar2.f10130x = obj3;
                return yVar2.invokeSuspend(Unit.f186387a);
            case 2:
                y yVar3 = new y(2, this.f10131y, continuation);
                yVar3.f10129w = flowCollector;
                yVar3.f10130x = obj3;
                return yVar3.invokeSuspend(Unit.f186387a);
            default:
                y yVar4 = new y(3, this.f10131y, continuation);
                yVar4.f10129w = flowCollector;
                yVar4.f10130x = obj3;
                return yVar4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        Flow gVar2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f10129w;
                    jhi.b bVarZ2 = this.f10131y.v.Z2((nel.n) this.f10130x);
                    this.f10129w = null;
                    this.f10130x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, bVarZ2, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f10129w;
                    if (((Boolean) this.f10130x).booleanValue()) {
                        h0 h0Var = this.f10131y;
                        fsl.m mVar = h0Var.f10092x;
                        k4l.d dVar = k4l.d.MARGIN;
                        xi0.a aVar3 = xi0.b.Companion;
                        String str = h0Var.u.f103914a;
                        aVar3.getClass();
                        gVar = ((fsl.w) mVar).a(new InvestOrdersParams.OrdersByCurrency(xi0.a.a(str), dVar, null, 28));
                    } else {
                        gVar = new go.g(null, 2);
                    }
                    this.f10129w = null;
                    this.f10130x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar, this) == aVar2) {
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
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f10129w;
                    Flow flowV = ((Boolean) this.f10130x).booleanValue() ? nim.a.v(new t0(this.f10131y.G.B(b0.f10071a), 1), c0.f10074a) : new go.g(null, 2);
                    this.f10129w = null;
                    this.f10130x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowV, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f10129w;
                    if (((Boolean) this.f10130x).booleanValue()) {
                        h0 h0Var2 = this.f10131y;
                        h1h.b bVar = h0Var2.f10093y;
                        InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
                        xi0.a aVar6 = xi0.b.Companion;
                        String str2 = h0Var2.u.f103914a;
                        aVar6.getClass();
                        List listC = zhm.u.c(xi0.a.a(str2));
                        companion.getClass();
                        InvestTransactionsFilter.InvestTransactionsFilterImpl investTransactionsFilterImplB = InvestTransactionsFilter.Companion.b(listC);
                        InvestTransactionsListContract$Disclaimers.INSTANCE.getClass();
                        gVar2 = bVar.b3(investTransactionsFilterImplB, new h1h.c(false, InvestTransactionsListContract$Disclaimers.Companion.a()));
                    } else {
                        gVar2 = new go.g(zhm.f0.f322471a, 2);
                    }
                    this.f10129w = null;
                    this.f10130x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, gVar2, this) == aVar5) {
                        return aVar5;
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
