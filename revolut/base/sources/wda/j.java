package wda;

import ard.c0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vge.f1;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function3 {
    public final /* synthetic */ xi0.b A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f296484w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f296485x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r f296486y;
    public final /* synthetic */ io3.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Continuation continuation, r rVar, io3.d dVar, xi0.b bVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f296486y = rVar;
        this.z = dVar;
        this.A = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                j jVar = new j(continuation, this.f296486y, this.z, this.A, 0);
                jVar.f296484w = flowCollector;
                jVar.f296485x = obj3;
                return jVar.invokeSuspend(Unit.f186387a);
            default:
                j jVar2 = new j(continuation, this.f296486y, this.z, this.A, 1);
                jVar2.f296484w = flowCollector;
                jVar2.f296485x = obj3;
                return jVar2.invokeSuspend(Unit.f186387a);
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
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f296484w;
                    Continuation continuation = null;
                    if (((Boolean) this.f296485x).booleanValue()) {
                        flowQ = new go.g(null, 2);
                    } else {
                        io3.d dVar = this.z;
                        String str = dVar.f163146b;
                        io3.l lVar = dVar.e;
                        r rVar = this.f296486y;
                        flowQ = vkm.q.Q(r.a(rVar, str, lVar), new j(continuation, rVar, dVar, this.A, 1));
                    }
                    this.f296484w = null;
                    this.f296485x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowQ, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f296484w;
                    w4l.k kVar = (w4l.k) this.f296485x;
                    r rVar2 = this.f296486y;
                    dmj.k kVar2 = new dmj.k(rd0.e.b(rVar2.e.e.c()), 25);
                    uea.f fVar = rVar2.f296498b;
                    io3.d dVar2 = this.z;
                    vkm.y yVarE = rd0.e.e(new vkm.v(new v0f.p(new c0(yh5.b.d(kVar2, mo3.a.g(rd0.e.b(fVar.c(kVar, dVar2.f163146b, dVar2.e)), null, k.f296487a, 1)), rVar2, dVar2, this.A, 25), 13), new l(2, 0, null)), h0.f322473a, new f1(3, 18, null));
                    this.f296484w = null;
                    this.f296485x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, yVarE, this) == aVar2) {
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
