package u3c;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f276904w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f276905x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f276906y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, Continuation continuation, o oVar) {
        super(3, continuation);
        this.u = i;
        this.f276906y = oVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                j jVar = new j(0, continuation, this.f276906y);
                jVar.f276904w = flowCollector;
                jVar.f276905x = obj3;
                return jVar.invokeSuspend(Unit.f186387a);
            default:
                j jVar2 = new j(1, continuation, this.f276906y);
                jVar2.f276904w = flowCollector;
                jVar2.f276905x = obj3;
                return jVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f276904w;
                    w4l.k loadingStrategy = (w4l.k) this.f276905x;
                    k3c.p pVar = (k3c.p) this.f276906y.o;
                    pVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB = pVar.e.b(Unit.f186387a, loadingStrategy);
                    this.f276904w = null;
                    this.f276905x = null;
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
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f276904w;
                    akg.n nVarB = this.f276906y.f276914p.b(Intrinsics.f((w4l.k) this.f276905x, w4l.i.f294643c));
                    this.f276904w = null;
                    this.f276905x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVarB, this) == aVar2) {
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
