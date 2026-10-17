package veh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f288331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f288332x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f288333y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, Continuation continuation, k kVar) {
        super(3, continuation);
        this.u = i;
        this.f288333y = kVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                i iVar = new i(0, continuation, this.f288333y);
                iVar.f288331w = flowCollector;
                iVar.f288332x = obj3;
                return iVar.invokeSuspend(Unit.f186387a);
            default:
                i iVar2 = new i(1, continuation, this.f288333y);
                iVar2.f288331w = flowCollector;
                iVar2.f288332x = obj3;
                return iVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowQ;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f288331w;
                    teh.c cVar = (teh.c) this.f288332x;
                    Continuation continuation = null;
                    if (cVar != null) {
                        k kVar = this.f288333y;
                        flowQ = q.Q(kVar.f288339t, new sdi.a(continuation, kVar, cVar, 20));
                    } else {
                        flowQ = vkm.i.f290039a;
                    }
                    this.f288331w = null;
                    this.f288332x = null;
                    this.v = 1;
                    if (q.u(flowCollector, flowQ, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f288331w;
                    w4l.k loadingStrategy = (w4l.k) this.f288332x;
                    k kVar2 = this.f288333y;
                    rul.e eVar = kVar2.f288335p;
                    String instrumentRef = kVar2.o.f95719a;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    neh.b bVar = (neh.b) eVar.f257629a;
                    Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB = bVar.d.b(instrumentRef, loadingStrategy);
                    this.f288331w = null;
                    this.f288332x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, dVarB, this) == aVar2) {
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
