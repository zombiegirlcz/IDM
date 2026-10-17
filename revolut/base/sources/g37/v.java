package g37;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import tof.i7;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f140231w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f140232x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.e f140233y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.e eVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f140233y = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                v vVar = new v(0, this.f140233y, continuation);
                vVar.f140231w = flowCollector;
                vVar.f140232x = obj3;
                return vVar.invokeSuspend(Unit.f186387a);
            default:
                v vVar2 = new v(1, this.f140233y, continuation);
                vVar2.f140231w = flowCollector;
                vVar2.f140232x = obj3;
                return vVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f140231w;
                    com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.e eVar = this.f140233y;
                    a61.a aVar2 = eVar.f74293s;
                    w4l.i iVar = w4l.i.f294643c;
                    akg.n nVarV = nim.a.v(u0.i(aVar2.V(iVar), eVar.f74292r.m0(null, iVar), eVar.v.j(w4l.h.f294642c)), w.f140234a);
                    this.f140231w = null;
                    this.f140232x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector);
                    Object objCollect = nVarV.collect(new g27.d(flowCollector, 5), this);
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar) {
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
                    FlowCollector flowCollector2 = this.f140231w;
                    vkm.d dVarB = rd0.e.b(whf.b.a(this.f140233y.u, te0.w.h(i7.a.f272806a), null, null, null, 14));
                    this.f140231w = null;
                    this.f140232x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB, this) == aVar3) {
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
