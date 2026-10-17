package jz;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nii.y0;
import vkm.y;

/* JADX INFO: loaded from: classes16.dex */
public final class e extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f179536w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f179537x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f179538y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, l lVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f179538y = lVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                e eVar = new e(0, this.f179538y, continuation);
                eVar.f179536w = flowCollector;
                eVar.f179537x = obj3;
                return eVar.invokeSuspend(Unit.f186387a);
            default:
                e eVar2 = new e(1, this.f179538y, continuation);
                eVar2.f179536w = flowCollector;
                eVar2.f179537x = obj3;
                return eVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow yVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f179536w;
                    if (((Boolean) this.f179537x).booleanValue()) {
                        l lVar = this.f179538y;
                        vv.d dVar = lVar.o;
                        dVar.getClass();
                        yVar = new y(new f(lVar, null), vkm.q.k(new vv.c(dVar, null)));
                    } else {
                        yVar = vkm.i.f290039a;
                    }
                    this.f179536w = null;
                    this.f179537x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, yVar, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f179536w;
                    Flow flowL2 = this.f179538y.L2((y0) this.f179537x);
                    this.f179536w = null;
                    this.f179537x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowL2, this) == aVar2) {
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
