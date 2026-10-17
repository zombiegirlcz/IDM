package ruk;

import ael.d0;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.analyst_details_screen.AnalystDetailsScreenContract$InputData;
import com.revolut.shared.feature.wealth.domain.api.interactors.InstrumentTickerInteractor$Companion;
import ip0.v7;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q0;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f257609w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f257610x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t f257611y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, Continuation continuation, t tVar) {
        super(3, continuation);
        this.u = i;
        this.f257611y = tVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                n nVar = new n(0, continuation, this.f257611y);
                nVar.f257609w = flowCollector;
                nVar.f257610x = obj3;
                return nVar.invokeSuspend(Unit.f186387a);
            default:
                n nVar2 = new n(1, continuation, this.f257611y);
                nVar2.f257609w = flowCollector;
                nVar2.f257610x = obj3;
                return nVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                t tVar = this.f257611y;
                AnalystDetailsScreenContract$InputData analystDetailsScreenContract$InputData = tVar.f257618q;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f257609w;
                    q0 q0VarY = com.revolut.data.database.models.openbanking.d.y("ANALYST_DETAILS_SCREEN_TAG", "observeInstrumentDetails", rd0.e.b(nim.a.w(tVar.f257619r.a(analystDetailsScreenContract$InputData.f103880a.f214596b, false), p.f257613a)));
                    ybl.b bVar = tVar.f257620s;
                    String str = analystDetailsScreenContract$InputData.f103880a.f214596b;
                    ybl.b.Companion.getClass();
                    j23.b bVarD = yh5.b.d(q0VarY, nz8.d.j(v7.y("ANALYST_DETAILS_SCREEN_TAG", "observeInstrumentSummaryPeriodically", vkm.q.q(nim.a.v(((ael.k) bVar).p(str, w4l.h.f294642c, InstrumentTickerInteractor$Companion.f105074b.a()), q.f257614a))), r.f257615a, 1));
                    this.f257609w = null;
                    this.f257610x = null;
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
                t tVar2 = this.f257611y;
                l80.e eVar = tVar2.f257621t;
                AnalystDetailsScreenContract$InputData analystDetailsScreenContract$InputData2 = tVar2.f257618q;
                d0 d0Var = tVar2.f257619r;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f257609w;
                    w4l.k kVar = (w4l.k) this.f257610x;
                    q0 q0VarY2 = com.revolut.data.database.models.openbanking.d.y("ANALYST_DETAILS_SCREEN_TAG", "observeInstrumentDetails", rd0.e.b(nim.a.w(d0Var.a(analystDetailsScreenContract$InputData2.f103880a.f214596b, false), s.f257616a)));
                    String ref2 = analystDetailsScreenContract$InputData2.f103880a.f214596b;
                    LocalDate from = ((l80.f) eVar).e().minusMonths(6L).withDayOfMonth(1);
                    Intrinsics.checkNotNullExpressionValue(from, "withDayOfMonth(...)");
                    LocalDate to6 = ((l80.f) eVar).e();
                    boolean zF = Intrinsics.f(kVar, w4l.i.f294643c);
                    d0Var.getClass();
                    Intrinsics.checkNotNullParameter(ref2, "ref");
                    Intrinsics.checkNotNullParameter(from, "from");
                    Intrinsics.checkNotNullParameter(to6, "to");
                    vdl.o oVar = (vdl.o) d0Var.f3605b;
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(ref2, "ref");
                    Intrinsics.checkNotNullParameter(from, "from");
                    Intrinsics.checkNotNullParameter(to6, "to");
                    w4l.f fVar = oVar.o;
                    DateTimeFormatter dateTimeFormatter = vdl.o.f288008r;
                    String str2 = from.format(dateTimeFormatter);
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                    String str3 = to6.format(dateTimeFormatter);
                    Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                    j23.b bVarD2 = yh5.b.d(q0VarY2, rd0.e.n(rd0.e.b(fVar.f(new vdl.l(ref2, str2, str3), zF)), y0.b(new Pair("ANALYST_DETAILS_SCREEN_TAG", "observeInstrumentRecommendations"))));
                    this.f257609w = null;
                    this.f257610x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, bVarD2, this) == aVar2) {
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
