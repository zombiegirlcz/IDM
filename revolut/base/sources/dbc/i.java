package dbc;

import akg.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f112712w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f112713x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f112714y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, k kVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f112714y = kVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                i iVar = new i(0, this.f112714y, continuation);
                iVar.f112712w = flowCollector;
                iVar.f112713x = obj3;
                return iVar.invokeSuspend(Unit.f186387a);
            default:
                i iVar2 = new i(1, this.f112714y, continuation);
                iVar2.f112712w = flowCollector;
                iVar2.f112713x = obj3;
                return iVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f112712w;
                    n nVarJ = this.f112714y.f112716p.j(new wbc.b(100, new Integer(0), new Integer(30)));
                    this.f112712w = null;
                    this.f112713x = null;
                    this.v = 1;
                    if (q.u(flowCollector, nVarJ, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f112712w;
                    k kVar = this.f112714y;
                    Flow flowI = kVar.o.O() ? zi0.c.i(Boolean.TRUE) : kVar.f112718r.a();
                    this.f112712w = null;
                    this.f112713x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, flowI, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
