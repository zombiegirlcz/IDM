package xdi;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f304465w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f304466x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u f304467y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, Continuation continuation, u uVar) {
        super(3, continuation);
        this.u = i;
        this.f304467y = uVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                q qVar = new q(0, continuation, this.f304467y);
                qVar.f304465w = flowCollector;
                qVar.f304466x = obj3;
                return qVar.invokeSuspend(Unit.f186387a);
            default:
                q qVar2 = new q(1, continuation, this.f304467y);
                qVar2.f304465w = flowCollector;
                qVar2.f304466x = obj3;
                return qVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f304465w;
                    ldi.f fVar = this.f304467y.f304470p;
                    fVar.getClass();
                    w4l.h loadingStrategy = w4l.h.f294642c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    pdi.k kVar = (pdi.k) fVar.f194134a;
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB = kVar.f.b(Unit.f186387a, loadingStrategy);
                    this.f304465w = null;
                    this.f304466x = null;
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
                    FlowCollector flowCollector2 = this.f304465w;
                    Flow flowC = this.f304467y.f304470p.c(w4l.h.f294642c);
                    this.f304465w = null;
                    this.f304466x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowC, this) == aVar2) {
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
