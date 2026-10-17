package mwk;

import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.v1;
import zhm.f0;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f209519w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f209520x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s f209521y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, Continuation continuation, s sVar) {
        super(3, continuation);
        this.u = i;
        this.f209521y = sVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                n nVar = new n(0, continuation, this.f209521y);
                nVar.f209519w = flowCollector;
                nVar.f209520x = obj3;
                return nVar.invokeSuspend(Unit.f186387a);
            case 1:
                n nVar2 = new n(1, continuation, this.f209521y);
                nVar2.f209519w = flowCollector;
                nVar2.f209520x = obj3;
                return nVar2.invokeSuspend(Unit.f186387a);
            case 2:
                n nVar3 = new n(2, continuation, this.f209521y);
                nVar3.f209519w = flowCollector;
                nVar3.f209520x = obj3;
                return nVar3.invokeSuspend(Unit.f186387a);
            case 3:
                n nVar4 = new n(3, continuation, this.f209521y);
                nVar4.f209519w = flowCollector;
                nVar4.f209520x = obj3;
                return nVar4.invokeSuspend(Unit.f186387a);
            case 4:
                n nVar5 = new n(4, continuation, this.f209521y);
                nVar5.f209519w = flowCollector;
                nVar5.f209520x = obj3;
                return nVar5.invokeSuspend(Unit.f186387a);
            default:
                n nVar6 = new n(5, continuation, this.f209521y);
                nVar6.f209519w = flowCollector;
                nVar6.f209520x = obj3;
                return nVar6.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f209519w;
                    nel.n nVar = (nel.n) this.f209520x;
                    y1d.b.Companion.getClass();
                    Set setB = y0.b(y1d.a.e);
                    v1 v1VarZ2 = this.f209521y.E.Z2(new AlertsWidgetContext(setB, setB, new AssetIdWithSymbol(nVar.f214596b, nVar.e), nVar.i.f306286a, u.c(mgd.d.ACTIVE), null, 7728));
                    this.f209519w = null;
                    this.f209520x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, v1VarZ2, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f209519w;
                    if (((Boolean) this.f209520x).booleanValue()) {
                        s sVar = this.f209521y;
                        gVar = sVar.J.b(new y2h.b(sVar.o.f104061a));
                    } else {
                        gVar = new go.g(null, 2);
                    }
                    this.f209519w = null;
                    this.f209520x = null;
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f209519w;
                    if (((Boolean) this.f209520x).booleanValue()) {
                        s sVar2 = this.f209521y;
                        gVar2 = boh.f.e(sVar2.f209527q.a(sVar2.o.f104061a, false), new o(sVar2));
                    } else {
                        gVar2 = new go.g(null, 2);
                    }
                    this.f209519w = null;
                    this.f209520x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, gVar2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f209519w;
                    Flow flowV = ((Boolean) this.f209520x).booleanValue() ? nim.a.v(this.f209521y.O.B(p.f209523a), q.f209524a) : new go.g(null, 2);
                    this.f209519w = null;
                    this.f209520x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, flowV, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f209519w;
                    Continuation continuation = null;
                    if (((Boolean) this.f209520x).booleanValue()) {
                        s sVar3 = this.f209521y;
                        gVar3 = vkm.q.Q(mo3.a.g(sVar3.f209527q.a(sVar3.o.f104061a, false), null, r.f209525a, 1), new n(5, continuation, sVar3));
                    } else {
                        gVar3 = new go.g(f0.f322471a, 2);
                    }
                    this.f209519w = null;
                    this.f209520x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, gVar3, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = this.f209519w;
                    od0.i iVar = (od0.i) this.f209520x;
                    InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
                    aim.e eVarB = u.b();
                    xi0.a aVar7 = xi0.b.Companion;
                    s sVar4 = this.f209521y;
                    String str = sVar4.o.f104061a;
                    aVar7.getClass();
                    eVarB.add(xi0.a.a(str));
                    nel.n nVar2 = (nel.n) iVar.f224257a;
                    if (nVar2 != null) {
                        eVarB.add(xi0.a.a(nVar2.f214596b));
                    }
                    aim.e eVarA = u.a(eVarB);
                    companion.getClass();
                    g0c.e eVarB3 = sVar4.B.b3(InvestTransactionsFilter.Companion.b(eVarA), new h1h.c(false, new InvestTransactionsListContract$Disclaimers(iVar.d(), 10)));
                    this.f209519w = null;
                    this.f209520x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, eVarB3, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
