package i4h;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f158486w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f158487x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p0 f158488y;
    public final /* synthetic */ nel.n z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Continuation continuation, p0 p0Var, nel.n nVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f158488y = p0Var;
        this.z = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                t tVar = new t(continuation, this.f158488y, this.z, 0);
                tVar.f158486w = flowCollector;
                tVar.f158487x = obj3;
                return tVar.invokeSuspend(Unit.f186387a);
            default:
                t tVar2 = new t(continuation, this.f158488y, this.z, 1);
                tVar2.f158486w = flowCollector;
                tVar2.f158487x = obj3;
                return tVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        go.g gVar;
        FlowCollector flowCollector;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f158486w;
                    eel.c cVar = (eel.c) this.f158487x;
                    p0 p0Var = this.f158488y;
                    ryc.a aVar2 = p0Var.f158470n;
                    efm.r chartPeriod = efm.r.just(cVar);
                    Intrinsics.checkNotNullExpressionValue(chartPeriod, "just(...)");
                    aVar2.getClass();
                    nel.n instrument = this.z;
                    Intrinsics.checkNotNullParameter(instrument, "instrument");
                    Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
                    efm.r rVarSwitchMap = chartPeriod.switchMap(new zh7.a(1, new zf5.n(aVar2, instrument, 10)));
                    Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                    akg.n nVarV = nim.a.v(rd0.e.b(rVarSwitchMap), new s(p0Var, cVar, instrument, 0));
                    this.f158486w = null;
                    this.f158487x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVarV, this) == aVar) {
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
                    FlowCollector flowCollector3 = this.f158486w;
                    eel.c cVar2 = (eel.c) this.f158487x;
                    p0 p0Var2 = this.f158488y;
                    zhl.k kVar = p0Var2.o;
                    nel.n nVar = this.z;
                    Intrinsics.h(nVar);
                    nel.z zVar = nVar.f214597c;
                    go.g gVar2 = new go.g(cVar2, 2);
                    Flow flowB = p0Var2.f158478y.B(j0.f158457a);
                    vgl.b bVar = vgl.b.TICKER_PERIODICALLY;
                    boolean z = !io3.h.o(zVar);
                    boolean z3 = (io3.h.i(zVar) || io3.h.l(zVar)) ? false : true;
                    i4g.g gVar3 = null;
                    if (io3.h.o(zVar)) {
                        gVar = gVar2;
                        flowCollector = null;
                        gVar3 = new i4g.g(1, p0Var2, p0.class, "filterNoteConfirmedCoupons", "filterNoteConfirmedCoupons(Lcom/revolut/shared/feature/wealth/models/corporate_events/AssetEvent;)Z", 0, 1);
                    } else {
                        gVar = gVar2;
                        flowCollector = null;
                    }
                    akg.n nVarV2 = nim.a.v(kVar.d(this.z, gVar, flowB, z, z3, bVar, io3.h.o(zVar) ? vgl.a.GROUP_WITH_LAST_IN_QUARTER : vgl.a.NONE, gVar3), new s(p0Var2, cVar2, nVar, 1));
                    this.f158486w = flowCollector;
                    this.f158487x = flowCollector;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, nVarV2, this) == aVar3) {
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
