package ow1;

import com.revolut.feature.apm.breb.impl.ui.qr_request.request.BrebQrRequestScreenContract$InputData;
import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import rv1.v;

/* JADX INFO: loaded from: classes20.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f230266w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f230267x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f230268y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Continuation continuation, q qVar) {
        super(3, continuation);
        this.u = i;
        this.f230268y = qVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                o oVar = new o(0, continuation, this.f230268y);
                oVar.f230266w = flowCollector;
                oVar.f230267x = obj3;
                return oVar.invokeSuspend(Unit.f186387a);
            default:
                o oVar2 = new o(1, continuation, this.f230268y);
                oVar2.f230266w = flowCollector;
                oVar2.f230267x = obj3;
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
                    FlowCollector flowCollector = this.f230266w;
                    q qVar = this.f230268y;
                    wkm.l lVarQ = vkm.q.Q(qVar.o, new o(1, null, qVar));
                    this.f230266w = null;
                    this.f230267x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, lVarQ, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f230266w;
                    BrebQrRequestScreenContract$InputData brebQrRequestScreenContract$InputData = (BrebQrRequestScreenContract$InputData) this.f230267x;
                    v vVar = this.f230268y.f230270p;
                    Alias alias = brebQrRequestScreenContract$InputData.f61760a;
                    dj0.d dVar = brebQrRequestScreenContract$InputData.f61761b;
                    vVar.getClass();
                    Intrinsics.checkNotNullParameter(alias, "alias");
                    akg.n nVarV = nim.a.v(vVar.f257680a.k(alias, dVar), new rrd.l(vVar, 12));
                    this.f230266w = null;
                    this.f230267x = null;
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
