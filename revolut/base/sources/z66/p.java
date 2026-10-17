package z66;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f319699w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f319700x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.defi.trade.impl.ui.trade.a f319701y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, com.revolut.feature.defi.trade.impl.ui.trade.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f319701y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                p pVar = new p(0, this.f319701y, continuation);
                pVar.f319699w = flowCollector;
                pVar.f319700x = obj3;
                return pVar.invokeSuspend(Unit.f186387a);
            default:
                p pVar2 = new p(1, this.f319701y, continuation);
                pVar2.f319699w = flowCollector;
                pVar2.f319700x = obj3;
                return pVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f319699w;
                    Flow flowB = this.f319701y.f71892x.B(q.f319702a);
                    this.f319699w = null;
                    this.f319700x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowB, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f319699w;
                    Pair pair = (Pair) this.f319700x;
                    List list = (List) pair.f186385a;
                    xi0.b bVar = (xi0.b) pair.f186386b;
                    t46.a aVar3 = this.f319701y.f71886p;
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        v1.c.A(arrayList, (xi0.b) it8.next(), bVar);
                    }
                    akg.n nVarV = nim.a.v(t46.a.a(aVar3, arrayList), s.f319704a);
                    this.f319699w = null;
                    this.f319700x = null;
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
        }
    }
}
