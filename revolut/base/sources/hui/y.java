package hui;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f155700w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f155701x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c f155702y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c cVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f155702y = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                y yVar = new y(0, this.f155702y, continuation);
                yVar.f155700w = flowCollector;
                yVar.f155701x = obj3;
                return yVar.invokeSuspend(Unit.f186387a);
            case 1:
                y yVar2 = new y(1, this.f155702y, continuation);
                yVar2.f155700w = flowCollector;
                yVar2.f155701x = obj3;
                return yVar2.invokeSuspend(Unit.f186387a);
            default:
                y yVar3 = new y(2, this.f155702y, continuation);
                yVar3.f155700w = flowCollector;
                yVar3.f155701x = obj3;
                return yVar3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f155700w;
                    String str = (String) this.f155701x;
                    Flow gVar = str == null ? new go.g(f0.f322471a, 2) : this.f155702y.v.Z2(new i7d.k(new TextLocalisedClause(R$string.asft_home_section_get_help, null, null, 14), "airport_security_fast_track_home", zhm.u.c(new i7d.g(str))));
                    this.f155700w = null;
                    this.f155701x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, gVar, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f155700w;
                    w4l.k loadingStrategy = (w4l.k) this.f155701x;
                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c cVar = this.f155702y;
                    mti.a aVar3 = cVar.f98838q;
                    aVar3.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    pti.e eVar = aVar3.f208843a;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    j23.b bVarD = yh5.b.d(nim.a.v(eVar.d.b(Unit.f186387a, loadingStrategy), b0.f155672a), ((mti.p) cVar.f98839r).a());
                    this.f155700w = null;
                    this.f155701x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, bVarD, this) == aVar2) {
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
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f155700w;
                    akg.n nVarC = ((mti.g) this.f155702y.f98837p).c((w4l.k) this.f155701x);
                    this.f155700w = null;
                    this.f155701x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, nVarC, this) == aVar4) {
                        return aVar4;
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
