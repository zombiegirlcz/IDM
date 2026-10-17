package qzb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.y;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f250506w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f250507x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.impl.ui.opt_in.screen.a f250508y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f250508y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                o oVar = new o(0, this.f250508y, continuation);
                oVar.f250506w = flowCollector;
                oVar.f250507x = obj3;
                return oVar.invokeSuspend(Unit.f186387a);
            default:
                o oVar2 = new o(1, this.f250508y, continuation);
                oVar2.f250506w = flowCollector;
                oVar2.f250507x = obj3;
                return oVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f250506w;
                    y yVarJ = this.f250508y.f83824t.j(new md6.q(md6.p.REV_POINTS, false));
                    this.f250506w = null;
                    this.f250507x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, yVarJ, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f250506w;
                    w4l.k loadingStrategy = (w4l.k) this.f250507x;
                    u29.b bVar = this.f250508y.o;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    Flow flowH = xam.a.h(new qqj.g(bVar, loadingStrategy, (Continuation) null, 29), f39.c.b(bVar.f276563b));
                    this.f250506w = null;
                    this.f250507x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowH, this) == aVar2) {
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
