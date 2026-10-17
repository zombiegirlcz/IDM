package l2c;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f191754w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f191755x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a f191756y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f191756y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                q qVar = new q(0, this.f191756y, continuation);
                qVar.f191754w = flowCollector;
                qVar.f191755x = obj3;
                return qVar.invokeSuspend(Unit.f186387a);
            case 1:
                q qVar2 = new q(1, this.f191756y, continuation);
                qVar2.f191754w = flowCollector;
                qVar2.f191755x = obj3;
                return qVar2.invokeSuspend(Unit.f186387a);
            default:
                q qVar3 = new q(2, this.f191756y, continuation);
                qVar3.f191754w = flowCollector;
                qVar3.f191755x = obj3;
                return qVar3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f191754w;
                    vkm.d dVarB = rd0.e.b(this.f191756y.f84174q.j(true));
                    this.f191754w = null;
                    this.f191755x = null;
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
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f191754w;
                    vkm.d dVarB2 = rd0.e.b(xvh.c.c(this.f191756y.f84173p, null, w4l.h.f294642c, 1));
                    this.f191754w = null;
                    this.f191755x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB2, this) == aVar2) {
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
                    FlowCollector flowCollector3 = this.f191754w;
                    nyb.k kVar = this.f191756y.o;
                    kVar.getClass();
                    w4l.h loadingStrategy = w4l.h.f294642c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    jxb.l lVar = (jxb.l) kVar.f220804a;
                    lVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB3 = rd0.e.b(lVar.f.e(Unit.f186387a, loadingStrategy));
                    this.f191754w = null;
                    this.f191755x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarB3, this) == aVar3) {
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
