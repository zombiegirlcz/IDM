package g27;

import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import nr6.b0;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f139925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f139926x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t f139927y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Continuation continuation, t tVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f139927y = tVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                q qVar = new q(continuation, this.f139927y, 0);
                qVar.f139925w = flowCollector;
                qVar.f139926x = obj3;
                return qVar.invokeSuspend(Unit.f186387a);
            default:
                q qVar2 = new q(continuation, this.f139927y, 1);
                qVar2.f139925w = flowCollector;
                qVar2.f139926x = obj3;
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
                    FlowCollector flowCollector = this.f139925w;
                    t tVar = this.f139927y;
                    bbd.b bVar = tVar.f139932p;
                    String orderId = tVar.u.f74187a;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(orderId, "orderId");
                    dbd.g gVar = bVar.f14254a;
                    gVar.getClass();
                    Intrinsics.checkNotNullParameter(orderId, "orderId");
                    j23.b bVarD = yh5.b.d(gVar.f112734h.c(orderId, true), vkm.q.Q(tVar.A, new q(null, tVar, 1)));
                    this.f139925w = null;
                    this.f139926x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, bVarD, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f139925w;
                    t tVar2 = this.f139927y;
                    akg.n nVarV = nim.a.v(tVar2.o.t(new AcquiringOrderFilter.InitiationPageId(y0.b(tVar2.u.f74187a)), new b0(false), new gr6.c(w4l.h.f294642c)), r.f139928a);
                    this.f139925w = null;
                    this.f139926x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVarV, this) == aVar2) {
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
