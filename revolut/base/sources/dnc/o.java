package dnc;

import com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q0;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f116266w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f116267x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r f116268y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, r rVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f116268y = rVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                o oVar = new o(0, this.f116268y, continuation);
                oVar.f116266w = flowCollector;
                oVar.f116267x = obj3;
                return oVar.invokeSuspend(Unit.f186387a);
            case 1:
                o oVar2 = new o(1, this.f116268y, continuation);
                oVar2.f116266w = flowCollector;
                oVar2.f116267x = obj3;
                return oVar2.invokeSuspend(Unit.f186387a);
            default:
                o oVar3 = new o(2, this.f116268y, continuation);
                oVar3.f116266w = flowCollector;
                oVar3.f116267x = obj3;
                return oVar3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f116266w;
                    r rVar = this.f116268y;
                    ybl.b bVar = rVar.f116273q;
                    List list = (List) rVar.f116272p.e.getValue();
                    ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((AssetSubclassAllocation) it8.next()).getF95689b());
                    }
                    q0 q0VarN = rd0.e.n(nim.a.v(((ael.k) bVar).l(d0.i1(arrayList)), new p(rVar, 0)), h0.f322473a);
                    this.f116266w = null;
                    this.f116267x = null;
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
                    FlowCollector flowCollector2 = this.f116266w;
                    r rVar2 = this.f116268y;
                    ybl.b bVar2 = rVar2.f116273q;
                    List list2 = (List) rVar2.f116272p.f.getValue();
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        arrayList2.add(((AssetSubclassAllocation) it9.next()).getF95689b());
                    }
                    q0 q0VarN2 = rd0.e.n(nim.a.v(((ael.k) bVar2).l(d0.i1(arrayList2)), new p(rVar2, 1)), h0.f322473a);
                    this.f116266w = null;
                    this.f116267x = null;
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
                    FlowCollector flowCollector3 = this.f116266w;
                    r rVar3 = this.f116268y;
                    ybl.b bVar3 = rVar3.f116273q;
                    List list3 = (List) rVar3.f116272p.f85154g.getValue();
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                    Iterator it10 = list3.iterator();
                    while (it10.hasNext()) {
                        arrayList3.add(((AssetSubclassAllocation) it10.next()).getF95689b());
                    }
                    q0 q0VarN3 = rd0.e.n(nim.a.v(((ael.k) bVar3).l(d0.i1(arrayList3)), new p(rVar3, 2)), h0.f322473a);
                    this.f116266w = null;
                    this.f116267x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, q0VarN3, this) == aVar3) {
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
