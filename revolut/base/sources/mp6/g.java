package mp6;

import com.revolut.data.model.Data;
import ep6.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import lkf.v;
import rp0.p;
import skm.a2;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f207745w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f207746x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n f207747y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, Continuation continuation, n nVar) {
        super(3, continuation);
        this.u = i;
        this.f207747y = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                g gVar = new g(0, continuation, this.f207747y);
                gVar.f207745w = flowCollector;
                gVar.f207746x = obj3;
                return gVar.invokeSuspend(Unit.f186387a);
            default:
                g gVar2 = new g(1, continuation, this.f207747y);
                gVar2.f207745w = flowCollector;
                gVar2.f207746x = obj3;
                return gVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f207745w;
                    p pVar = (p) this.f207746x;
                    n nVar = this.f207747y;
                    a2 a2Var = nVar.z;
                    Continuation continuation = null;
                    if (a2Var != null && a2Var.d()) {
                        a2Var.f(null);
                    }
                    nVar.z = null;
                    int i2 = pVar == null ? -1 : c.f207743b[pVar.ordinal()];
                    if (i2 == -1) {
                        gVar = new go.g(Unit.f186387a, 2);
                    } else if (i2 == 1) {
                        nVar.V2(new mci.e(nVar, continuation, 16), new yi5.b(29));
                        gVar = new go.g(Unit.f186387a, 2);
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        gVar = new v(rd0.e.b(nVar.f207765t.c()), nVar, 25);
                    }
                    this.f207745w = null;
                    this.f207746x = null;
                    this.v = 1;
                    if (q.u(flowCollector, gVar, this) == aVar) {
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
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f207745w;
                    ep6.c cVar = (ep6.c) this.f207746x;
                    if (cVar instanceof ep6.d) {
                        yo6.d dVar = ((ep6.d) cVar).f128085b;
                        gVar2 = dVar == yo6.d.AI_SEARCH ? new go.g(new Data(null, null, false, 7, null), 2) : dp6.a.a(this.f207747y.f207760n, dVar);
                    } else {
                        if (!(cVar instanceof c.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        gVar2 = new go.g(new Data(null, null, false, 7, null), 2);
                    }
                    this.f207745w = null;
                    this.f207746x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, gVar2, this) == aVar2) {
                        return aVar2;
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
