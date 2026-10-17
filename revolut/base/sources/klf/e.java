package klf;

import com.revolut.data.model.Data;
import h6e.f;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f185467w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f185468x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f185469y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Continuation continuation, i iVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f185469y = iVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                e eVar = new e(continuation, this.f185469y, 0);
                eVar.f185467w = flowCollector;
                eVar.f185468x = obj3;
                return eVar.invokeSuspend(Unit.f186387a);
            default:
                e eVar2 = new e(continuation, this.f185469y, 1);
                eVar2.f185467w = flowCollector;
                eVar2.f185468x = obj3;
                return eVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        i93.c cVar;
        List list;
        i93.h hVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f185467w;
                    String str = (String) this.f185468x;
                    Flow flowB = str != null ? rd0.e.b(((ha3.x) this.f185469y.f185509c).v(str)) : new go.g(new Data(null, null, false, 7, null), 2);
                    this.f185467w = null;
                    this.f185468x = null;
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
                    FlowCollector flowCollector2 = this.f185467w;
                    yhm.r rVar = (yhm.r) this.f185468x;
                    h93.f0 f0Var = (h93.f0) rVar.f314201a;
                    Map map = (Map) rVar.f314202b;
                    boolean zBooleanValue = ((Boolean) rVar.f314203c).booleanValue();
                    io3.d dVar = (io3.d) map.get((f0Var == null || (cVar = f0Var.f150113g) == null || (list = cVar.f) == null || (hVar = (i93.h) zhm.d0.d0(list)) == null) ? null : hVar.f159559a);
                    if (dVar != null) {
                        gVar = nim.a.v(g6e.a.a(this.f185469y.d, zhm.u.c(dVar), zBooleanValue ? f.d.f149639a : f.e.f149640a, null, false, 12), g.f185481a);
                    } else {
                        gVar = new go.g(new Data(null, null, false, 7, null), 2);
                    }
                    this.f185467w = null;
                    this.f185468x = null;
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
        }
    }
}
