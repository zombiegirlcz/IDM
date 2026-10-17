package wwi;

import dwi.b0;
import hwi.p0;
import hwi.v0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import le.u1;
import te0.w;
import tjf.k0;
import vkm.z1;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f300682w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f300683x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f300684y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Continuation continuation, q qVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f300684y = qVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                m mVar = new m(continuation, this.f300684y, 0);
                mVar.f300682w = flowCollector;
                mVar.f300683x = obj3;
                return mVar.invokeSuspend(Unit.f186387a);
            case 1:
                m mVar2 = new m(continuation, this.f300684y, 1);
                mVar2.f300682w = flowCollector;
                mVar2.f300683x = obj3;
                return mVar2.invokeSuspend(Unit.f186387a);
            default:
                m mVar3 = new m(continuation, this.f300684y, 2);
                mVar3.f300682w = flowCollector;
                mVar3.f300683x = obj3;
                return mVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        k0 k0Var;
        switch (this.u) {
            case 0:
                q qVar = this.f300684y;
                z1 z1Var = qVar.f300689q;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f300682w;
                    boolean z = ((String) this.f300683x).length() == 0;
                    Continuation continuation = null;
                    if (z) {
                        k0Var = new k0(vkm.q.Q(z1Var, new m(continuation, qVar, 1)), 3);
                    } else {
                        if (z) {
                            throw new NoWhenBranchMatchedException();
                        }
                        k0Var = new k0(vkm.q.Q(z1Var, new m(continuation, qVar, 2)), 4);
                    }
                    this.f300682w = null;
                    this.f300683x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, k0Var, this) == aVar) {
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
                b0 b0Var = this.f300684y.f300688p;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f300682w;
                    w4l.f fVar = (w4l.f) ((v0) b0Var.f120410b).f.getValue();
                    Unit unit = Unit.f186387a;
                    efm.r rVarF = fVar.f(unit, false);
                    v0 v0Var = (v0) b0Var.f120410b;
                    efm.r rVarF2 = ((w4l.f) v0Var.f.getValue()).f(unit, false);
                    efm.r map = rd0.e.c(v0Var.f156263c.C0("CACHE_KEY_RECENTLY_VIEWED_AIRPORTS", v0.f156260l), kotlin.coroutines.g.f186406a).map(new hw3.d(17, new hwf.b(16)));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    efm.r map2 = w.f0(map).map(new hw3.d(16, new hwf.b(15)));
                    Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                    vkm.d dVarB = rd0.e.b(w.l(rVarF, nim.a.w(u1.d(rVarF2, map2), new p0(v0Var, 3))));
                    this.f300682w = null;
                    this.f300683x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB, this) == aVar2) {
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
                    FlowCollector flowCollector3 = this.f300682w;
                    Flow flow = (Flow) this.f300684y.f300690r.getValue();
                    this.f300682w = null;
                    this.f300683x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flow, this) == aVar3) {
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
