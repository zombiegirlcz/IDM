package tpd;

import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import djb.k;
import djb.n;
import efm.r;
import gim.i;
import go.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import w4l.h;
import yhm.o;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f273345w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f273346x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f273347y;
    public final /* synthetic */ xi0.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Continuation continuation, f fVar, xi0.b bVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f273347y = fVar;
        this.z = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                d dVar = new d(continuation, this.f273347y, this.z, 0);
                dVar.f273345w = flowCollector;
                dVar.f273346x = obj3;
                return dVar.invokeSuspend(Unit.f186387a);
            default:
                d dVar2 = new d(continuation, this.f273347y, this.z, 1);
                dVar2.f273345w = flowCollector;
                dVar2.f273346x = obj3;
                return dVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        Flow gVar2;
        Flow gVar3;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f273345w;
                    if (((Boolean) this.f273346x).booleanValue()) {
                        f fVar = this.f273347y;
                        gVar = xam.a.h(new e(fVar, this.z, null), fVar.d.h(h.f294642c));
                    } else {
                        gVar = new g(new Data(f0.f322471a, null, false, 6, null), 2);
                    }
                    this.f273345w = null;
                    this.f273346x = null;
                    this.v = 1;
                    if (q.u(flowCollector, gVar, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f273345w;
                    if (Intrinsics.f(((Data) this.f273346x).getContent(), Boolean.TRUE)) {
                        f fVar2 = this.f273347y;
                        n nVar = fVar2.f273351c;
                        k.b bVar = k.b.f115282a;
                        h hVar = h.f294642c;
                        r rVarF = ((rnb.i) nVar).f(bVar, hVar);
                        xi0.b bVar2 = this.z;
                        vkm.d dVarB = rd0.e.b(pd.b.r(rVarF, new tkm.d(fVar2, bVar2, 13)));
                        jte.d dVar = (jte.d) fVar2.k;
                        if (dVar.c(AnalyticsFeatureApi$Toggles.AnalyticsIncomeSorterJointSavingsAndPockets.f87385c) && dVar.c(SavingsApi$Toggles.JointAccountsSavings.f83075c)) {
                            gVar3 = rd0.e.b(pd.b.r(((rnb.i) nVar).f(k.a.f115281a, hVar), new tkm.d(fVar2, bVar2, 13)));
                        } else {
                            gVar3 = new g(new Data(f0.f322471a, null, false, 6, null), 2);
                        }
                        gVar2 = nim.a.v(u0.m(dVarB, gVar3), new tlf.n(27));
                    } else {
                        gVar2 = new g(new Data(f0.f322471a, null, false, 6, null), 2);
                    }
                    this.f273345w = null;
                    this.f273346x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, gVar2, this) == aVar2) {
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
