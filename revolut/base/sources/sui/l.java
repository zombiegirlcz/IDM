package sui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f265784w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f265785x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.b f265786y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.b bVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f265786y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                l lVar = new l(0, this.f265786y, continuation);
                lVar.f265784w = flowCollector;
                lVar.f265785x = obj3;
                return lVar.invokeSuspend(Unit.f186387a);
            case 1:
                l lVar2 = new l(1, this.f265786y, continuation);
                lVar2.f265784w = flowCollector;
                lVar2.f265785x = obj3;
                return lVar2.invokeSuspend(Unit.f186387a);
            default:
                l lVar3 = new l(2, this.f265786y, continuation);
                lVar3.f265784w = flowCollector;
                lVar3.f265785x = obj3;
                return lVar3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f265784w;
                    w4l.k loadingStrategy = (w4l.k) this.f265785x;
                    mti.b bVar = this.f265786y.f98875p;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    pti.k kVar = bVar.f208844a;
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB = kVar.d.b(Unit.f186387a, loadingStrategy);
                    this.f265784w = null;
                    this.f265785x = null;
                    this.v = 1;
                    if (q.u(flowCollector, dVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f265784w;
                    vkm.d dVarB2 = rd0.e.b(this.f265786y.f98876q.c(true));
                    this.f265784w = null;
                    this.f265785x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, dVarB2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f265784w;
                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.b bVar2 = this.f265786y;
                    mti.n nVar = bVar2.f98877r;
                    String airportIataCode = bVar2.o.f98868a;
                    nVar.getClass();
                    Intrinsics.checkNotNullParameter(airportIataCode, "airportIataCode");
                    w4l.h loadingStrategy2 = w4l.h.f294642c;
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    akg.n nVarV = nim.a.v(nVar.f208864b.a(airportIataCode, loadingStrategy2), new msb.c(10));
                    this.f265784w = null;
                    this.f265785x = null;
                    this.v = 1;
                    if (q.u(flowCollector3, nVarV, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
