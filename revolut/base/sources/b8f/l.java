package b8f;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f13238w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f13239x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n f13240y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, n nVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f13240y = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                l lVar = new l(0, this.f13240y, continuation);
                lVar.f13238w = flowCollector;
                lVar.f13239x = obj3;
                return lVar.invokeSuspend(Unit.f186387a);
            default:
                l lVar2 = new l(1, this.f13240y, continuation);
                lVar2.f13238w = flowCollector;
                lVar2.f13239x = obj3;
                return lVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f13238w;
                    w4l.k loadingStrategy = (w4l.k) this.f13239x;
                    n nVar = this.f13240y;
                    o7.d dVar = nVar.f13242p;
                    String templateId = nVar.o.f91425a;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(templateId, "templateId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    lrk.a aVar2 = (lrk.a) dVar.f222642b;
                    Intrinsics.checkNotNullParameter(templateId, "templateId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB = aVar2.f199524a.b(templateId, loadingStrategy);
                    this.f13238w = null;
                    this.f13239x = null;
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f13238w;
                    n nVar2 = this.f13240y;
                    vkm.d dVarD = nVar2.f13243q.d(nVar2.o.f91425a);
                    this.f13238w = null;
                    this.f13239x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarD, this) == aVar3) {
                        return aVar3;
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
