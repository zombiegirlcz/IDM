package bij;

import akg.n;
import dee.x;
import dfj.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import nfj.m1;
import vkm.q;
import vkm.y;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f15520w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f15521x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f15522y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, k kVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f15522y = kVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                i iVar = new i(0, this.f15522y, continuation);
                iVar.f15520w = flowCollector;
                iVar.f15521x = obj3;
                return iVar.invokeSuspend(Unit.f186387a);
            default:
                i iVar2 = new i(1, this.f15522y, continuation);
                iVar2.f15520w = flowCollector;
                iVar2.f15521x = obj3;
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
                    FlowCollector flowCollector = this.f15520w;
                    y yVarB = this.f15522y.o.b(w4l.i.f294643c);
                    this.f15520w = null;
                    this.f15521x = null;
                    this.v = 1;
                    if (q.u(flowCollector, yVarB, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f15520w;
                    w4l.k loadingStrategy = (w4l.k) this.f15521x;
                    u uVar = this.f15522y.f15525q;
                    uVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    m1 m1Var = (m1) uVar.f114115b;
                    m1Var.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    n nVarV = nim.a.v(m1Var.f214990g.b(Unit.f186387a, loadingStrategy), new x(5));
                    this.f15520w = null;
                    this.f15521x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, nVarV, this) == aVar2) {
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
