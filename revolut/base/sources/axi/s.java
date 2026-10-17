package axi;

import dwi.i0;
import hwi.x0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f10970w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f10971x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c f10972y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Continuation continuation, com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c cVar, String str, int i) {
        super(3, continuation);
        this.u = i;
        this.f10972y = cVar;
        this.z = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                s sVar = new s(continuation, this.f10972y, this.z, 0);
                sVar.f10970w = flowCollector;
                sVar.f10971x = obj3;
                return sVar.invokeSuspend(Unit.f186387a);
            default:
                s sVar2 = new s(continuation, this.f10972y, this.z, 1);
                sVar2.f10970w = flowCollector;
                sVar2.f10971x = obj3;
                return sVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow oVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f10970w;
                    Flow flowD = this.f10972y.z.d(new mga.b(this.z));
                    this.f10970w = null;
                    this.f10971x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowD, this) == aVar) {
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
                com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c cVar = this.f10972y;
                dwi.r rVar = cVar.f99056q;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f10970w;
                    rVar.getClass();
                    w4l.i loadingStrategy = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    hwi.v vVar = (hwi.v) rVar.f120454a;
                    vVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB = vVar.d.b(Unit.f186387a, loadingStrategy);
                    int i3 = ((l) ((j2) cVar.D.f22677a).getValue()).f10951a;
                    Continuation continuation = null;
                    String str = this.z;
                    if (str == null) {
                        str = null;
                    }
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    hwi.v vVar2 = (hwi.v) rVar.f120454a;
                    vVar2.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB2 = vVar2.e.b(new hwi.q(i3, str), loadingStrategy);
                    i0 i0Var = (i0) cVar.f99057r;
                    wkm.l lVarQ = vkm.q.Q(vkm.q.q(x0.a(i0Var.f120428a)), new cvi.i(continuation, i0Var, 29));
                    vkm.d dVarB3 = rd0.e.b(cVar.f99058s.c(true));
                    b0 b0Var = cVar.f99061x;
                    r10.q qVar = b0Var.f10946a;
                    if (qVar.E()) {
                        r10.q qVar2 = b0Var.f10946a;
                        do3.f fVar = do3.f.BANKING;
                        oVar = new ax9.o(yh5.b.d(r10.q.m0(qVar2, fVar, zhm.u.c(do3.s.ACTIVE), 4), r10.q.k0(qVar, fVar)), 1);
                    } else {
                        oVar = new go.g(null, 2);
                    }
                    uf0.b bVarH = yh5.b.h(dVarB, dVarB2, lVarQ, dVarB3, oVar);
                    this.f10970w = null;
                    this.f10971x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, bVarH, this) == aVar2) {
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
