package wda;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vge.f1;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ io3.l A;
    public final /* synthetic */ List B;
    public final /* synthetic */ xi0.b C;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f296491w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f296492x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r f296493y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Continuation continuation, r rVar, String str, io3.l lVar, List list, xi0.b bVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f296493y = rVar;
        this.z = str;
        this.A = lVar;
        this.B = list;
        this.C = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                o oVar = new o(continuation, this.f296493y, this.z, this.A, this.B, this.C, 0);
                oVar.f296491w = flowCollector;
                oVar.f296492x = obj3;
                return oVar.invokeSuspend(Unit.f186387a);
            default:
                o oVar2 = new o(continuation, this.f296493y, this.z, this.A, this.B, this.C, 1);
                oVar2.f296491w = flowCollector;
                oVar2.f296492x = obj3;
                return oVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f296491w;
                    if (((Boolean) this.f296492x).booleanValue()) {
                        flowQ = new go.g(r0.g(), 2);
                    } else {
                        String str = this.z;
                        io3.l lVar = this.A;
                        r rVar = this.f296493y;
                        flowQ = vkm.q.Q(r.a(rVar, str, lVar), new o(null, rVar, this.z, this.A, this.B, this.C, 1));
                    }
                    this.f296491w = null;
                    this.f296492x = null;
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
                    FlowCollector flowCollector2 = this.f296491w;
                    w4l.k kVar = (w4l.k) this.f296492x;
                    r rVar2 = this.f296493y;
                    vkm.y yVarE = rd0.e.e(new vkm.v(new c2d.g(yh5.b.d(new dmj.k(rd0.e.b(rVar2.e.e.c()), 25), mo3.a.g(rd0.e.b(rVar2.f296498b.c(kVar, this.z, this.A)), null, p.f296494a, 1)), rVar2, this.B, this.C, this.z, this.A, 4), new l(2, 1, null)), h0.f322473a, new f1(3, 19, null));
                    this.f296491w = null;
                    this.f296492x = null;
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
