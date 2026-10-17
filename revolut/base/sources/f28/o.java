package f28;

import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f131475w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f131476x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ dsh.e f131477y;
    public final /* synthetic */ t z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Continuation continuation, dsh.e eVar, t tVar) {
        super(3, continuation);
        this.f131477y = eVar;
        this.z = tVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                o oVar = new o(continuation, this.z, this.f131477y);
                oVar.f131475w = flowCollector;
                oVar.f131476x = obj3;
                return oVar.invokeSuspend(Unit.f186387a);
            default:
                o oVar2 = new o(continuation, this.f131477y, this.z);
                oVar2.f131475w = flowCollector;
                oVar2.f131476x = obj3;
                return oVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowS;
        y xVar;
        h0 h0Var;
        efm.r map;
        Flow flowB;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f131475w;
                    int i2 = 3;
                    Continuation continuation = null;
                    if (((Boolean) this.f131476x).booleanValue()) {
                        t tVar = this.z;
                        hbh.o oVar = tVar.f131484g;
                        InvestTransactionsFilter.INSTANCE.getClass();
                        flowS = vkm.q.Q(rd0.e.e(mo3.a.h(vkm.q.s(oVar.b(InvestTransactionsFilter.Companion.f105346b, w4l.h.f294642c), p.f131478a, vkm.q.f290100b), r.f131480a, s.f131481a, 2), zhm.h0.f322473a, new eob.e(i2, 17, continuation)), new o((Continuation) null, this.f131477y, tVar));
                    } else {
                        flowS = org.bouncycastle.jcajce.provider.digest.a.s(3, null);
                    }
                    this.f131475w = null;
                    this.f131476x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowS, this) == aVar) {
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
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f131475w;
                    Boolean bool = (Boolean) this.f131476x;
                    y.Companion.getClass();
                    dsh.e config = this.f131477y;
                    Intrinsics.checkNotNullParameter(config, "config");
                    String strA = config.a("analyticsMethod");
                    if (Intrinsics.f(strA, "totalValue")) {
                        g0 g0Var = h0.Companion;
                        String strA2 = config.a("timeframe");
                        eel.c cVar = eel.c.ONE_MONTH;
                        g0Var.getClass();
                        xVar = new x(g0.a(cVar, strA2));
                    } else if (Intrinsics.f(strA, "performance")) {
                        g0 g0Var2 = h0.Companion;
                        String strA3 = config.a("timeframe");
                        eel.c cVar2 = eel.c.ONE_DAY;
                        g0Var2.getClass();
                        xVar = new w(g0.a(cVar2, strA3));
                    } else {
                        xVar = new x(eel.c.ONE_MONTH);
                    }
                    Object obj3 = null;
                    if (bool.booleanValue()) {
                        g0 g0Var3 = h0.Companion;
                        eel.c chartPeriod = xVar.L();
                        g0Var3.getClass();
                        Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
                        switch (f0.f131464b[chartPeriod.ordinal()]) {
                            case 1:
                                h0Var = h0.DAY;
                                break;
                            case 2:
                                h0Var = h0.WEEK;
                                break;
                            case 3:
                                h0Var = h0.MONTH;
                                break;
                            case 4:
                                h0Var = h0.HALF_YEAR;
                                break;
                            case 5:
                                h0Var = h0.YEAR;
                                break;
                            case 6:
                            case 7:
                                h0Var = h0.ALL;
                                break;
                            default:
                                throw new IllegalStateException("Can't convert " + chartPeriod + " to AnalyticsWidgetTimeframe");
                        }
                        t tVar2 = this.z;
                        Lazy lazy = tVar2.f131485h;
                        kwg.l lVar = tVar2.f131483c;
                        if (xVar instanceof x) {
                            List analyticsProductTypes = (List) lazy.getValue();
                            Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
                            eel.c timeSpan = ((x) xVar).f131488a;
                            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                            map = lVar.f(new kwg.h(lVar, analyticsProductTypes, timeSpan, 0)).map(new ey7.a(new a(h0Var, 0), 22));
                        } else {
                            if (!(xVar instanceof w)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List analyticsProductTypes2 = (List) lazy.getValue();
                            iwg.c method = iwg.c.TIME_WEIGHTED;
                            Intrinsics.checkNotNullParameter(analyticsProductTypes2, "analyticsProductTypes");
                            eel.c timeSpan2 = ((w) xVar).f131487a;
                            Intrinsics.checkNotNullParameter(timeSpan2, "timeSpan");
                            Intrinsics.checkNotNullParameter(method, "method");
                            map = lVar.f(new kwg.c(lVar, analyticsProductTypes2, timeSpan2, method, obj3, 0)).map(new ey7.a(new a(h0Var, 1), 23));
                        }
                        Intrinsics.h(map);
                        flowB = rd0.e.b(map);
                    } else {
                        flowB = new go.g(new d(xVar), 2);
                    }
                    this.f131475w = null;
                    this.f131476x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowB, this) == aVar2) {
                        return aVar2;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Continuation continuation, t tVar, dsh.e eVar) {
        super(3, continuation);
        this.z = tVar;
        this.f131477y = eVar;
    }
}
