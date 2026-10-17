package fvk;

import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.v1;
import zhm.f0;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f138460w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f138461x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x f138462y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, x xVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f138462y = xVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                s sVar = new s(0, this.f138462y, continuation);
                sVar.f138460w = flowCollector;
                sVar.f138461x = obj3;
                return sVar.invokeSuspend(Unit.f186387a);
            case 1:
                s sVar2 = new s(1, this.f138462y, continuation);
                sVar2.f138460w = flowCollector;
                sVar2.f138461x = obj3;
                return sVar2.invokeSuspend(Unit.f186387a);
            case 2:
                s sVar3 = new s(2, this.f138462y, continuation);
                sVar3.f138460w = flowCollector;
                sVar3.f138461x = obj3;
                return sVar3.invokeSuspend(Unit.f186387a);
            default:
                s sVar4 = new s(3, this.f138462y, continuation);
                sVar4.f138460w = flowCollector;
                sVar4.f138461x = obj3;
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
                    FlowCollector flowCollector = this.f138460w;
                    nel.n nVar = (nel.n) this.f138461x;
                    y1d.b.Companion.getClass();
                    Set setB = y0.b(y1d.a.e);
                    v1 v1VarZ2 = this.f138462y.f138473s.Z2(new AlertsWidgetContext(setB, setB, new AssetIdWithSymbol(nVar.f214596b, nVar.e), nVar.i.f306286a, zhm.u.c(mgd.d.ACTIVE), null, 7728));
                    this.f138460w = null;
                    this.f138461x = null;
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
                    FlowCollector flowCollector2 = this.f138460w;
                    if (((Boolean) this.f138461x).booleanValue()) {
                        x xVar = this.f138462y;
                        gVar = xVar.f138470p.b(new y2h.b(xVar.o.f103946a));
                    } else {
                        gVar = new go.g(null, 2);
                    }
                    this.f138460w = null;
                    this.f138461x = null;
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
                    FlowCollector flowCollector3 = this.f138460w;
                    if (((Boolean) this.f138461x).booleanValue()) {
                        x xVar2 = this.f138462y;
                        gVar2 = boh.f.e(xVar2.f138472r.a(xVar2.o.f103946a, false), new w(xVar2));
                    } else {
                        gVar2 = new go.g(null, 2);
                    }
                    this.f138460w = null;
                    this.f138461x = null;
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
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f138460w;
                    if (((Boolean) this.f138461x).booleanValue()) {
                        x xVar3 = this.f138462y;
                        h1h.b bVar = xVar3.C;
                        InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
                        xi0.a aVar5 = xi0.b.Companion;
                        String str = xVar3.o.f103946a;
                        aVar5.getClass();
                        List listC = zhm.u.c(xi0.a.a(str));
                        companion.getClass();
                        InvestTransactionsFilter.InvestTransactionsFilterImpl investTransactionsFilterImplB = InvestTransactionsFilter.Companion.b(listC);
                        InvestTransactionsListContract$Disclaimers.INSTANCE.getClass();
                        gVar3 = bVar.b3(investTransactionsFilterImplB, new h1h.c(false, InvestTransactionsListContract$Disclaimers.Companion.b()));
                    } else {
                        gVar3 = new go.g(f0.f322471a, 2);
                    }
                    this.f138460w = null;
                    this.f138461x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, gVar3, this) == aVar4) {
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
