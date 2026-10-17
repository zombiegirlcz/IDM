package wuk;

import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f300208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f300209x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ y f300210y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, Continuation continuation, y yVar) {
        super(3, continuation);
        this.u = i;
        this.f300210y = yVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                s sVar = new s(0, continuation, this.f300210y);
                sVar.f300208w = flowCollector;
                sVar.f300209x = obj3;
                return sVar.invokeSuspend(Unit.f186387a);
            case 1:
                s sVar2 = new s(1, continuation, this.f300210y);
                sVar2.f300208w = flowCollector;
                sVar2.f300209x = obj3;
                return sVar2.invokeSuspend(Unit.f186387a);
            case 2:
                s sVar3 = new s(2, continuation, this.f300210y);
                sVar3.f300208w = flowCollector;
                sVar3.f300209x = obj3;
                return sVar3.invokeSuspend(Unit.f186387a);
            default:
                s sVar4 = new s(3, continuation, this.f300210y);
                sVar4.f300208w = flowCollector;
                sVar4.f300209x = obj3;
                return sVar4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        Flow gVar2;
        Flow gVar3;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f300208w;
                    if (((Boolean) this.f300209x).booleanValue()) {
                        y yVar = this.f300210y;
                        gVar = yVar.f300217q.b(new y2h.b(yVar.o.f103901a));
                    } else {
                        gVar = new go.g(null, 2);
                    }
                    this.f300208w = null;
                    this.f300209x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, gVar, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f300208w;
                    if (((Boolean) this.f300209x).booleanValue()) {
                        y yVar2 = this.f300210y;
                        gVar2 = boh.f.e(yVar2.f300218r.a(yVar2.o.f103901a, false), new v(yVar2));
                    } else {
                        gVar2 = new go.g(null, 2);
                    }
                    this.f300208w = null;
                    this.f300209x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar2, this) == aVar2) {
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
                    FlowCollector flowCollector3 = this.f300208w;
                    Continuation continuation = null;
                    if (((Boolean) this.f300209x).booleanValue()) {
                        y yVar3 = this.f300210y;
                        gVar3 = vkm.q.Q(mo3.a.g(yVar3.f300218r.a(yVar3.o.f103901a, false), null, w.f300214a, 1), new s(3, continuation, yVar3));
                    } else {
                        gVar3 = new go.g(f0.f322471a, 2);
                    }
                    this.f300208w = null;
                    this.f300209x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, gVar3, this) == aVar3) {
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
                    FlowCollector flowCollector4 = this.f300208w;
                    od0.i iVar = (od0.i) this.f300209x;
                    InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
                    aim.e eVarB = zhm.u.b();
                    xi0.a aVar5 = xi0.b.Companion;
                    y yVar4 = this.f300210y;
                    String str = yVar4.o.f103901a;
                    aVar5.getClass();
                    eVarB.add(xi0.a.a(str));
                    nel.n nVar = (nel.n) iVar.f224257a;
                    if (nVar != null) {
                        eVarB.add(xi0.a.a(nVar.f214596b));
                    }
                    aim.e eVarA = zhm.u.a(eVarB);
                    companion.getClass();
                    g0c.e eVarB3 = yVar4.D.b3(InvestTransactionsFilter.Companion.b(eVarA), new h1h.c(false, new InvestTransactionsListContract$Disclaimers(iVar.d(), 10)));
                    this.f300208w = null;
                    this.f300209x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, eVarB3, this) == aVar4) {
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
