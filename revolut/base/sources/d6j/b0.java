package d6j;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.domain.api.WealthDomainApi$Toggles$ChartsCachingImprovements;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.joda.time.DateTime;
import tof.cc;
import tof.g8;
import tof.h8;
import tof.i7;
import tof.u9;
import tof.ua;
import tof.y6;
import vkm.j2;
import vkm.q0;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f111551w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f111552x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n0 f111553y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i, n0 n0Var, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f111553y = n0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(0, this.f111553y, continuation);
                b0Var.f111551w = flowCollector;
                b0Var.f111552x = obj3;
                return b0Var.invokeSuspend(Unit.f186387a);
            case 1:
                b0 b0Var2 = new b0(1, this.f111553y, continuation);
                b0Var2.f111551w = flowCollector;
                b0Var2.f111552x = obj3;
                return b0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                b0 b0Var3 = new b0(2, this.f111553y, continuation);
                b0Var3.f111551w = flowCollector;
                b0Var3.f111552x = obj3;
                return b0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                b0 b0Var4 = new b0(3, this.f111553y, continuation);
                b0Var4.f111551w = flowCollector;
                b0Var4.f111552x = obj3;
                return b0Var4.invokeSuspend(Unit.f186387a);
            case 4:
                b0 b0Var5 = new b0(4, this.f111553y, continuation);
                b0Var5.f111551w = flowCollector;
                b0Var5.f111552x = obj3;
                return b0Var5.invokeSuspend(Unit.f186387a);
            default:
                b0 b0Var6 = new b0(5, this.f111553y, continuation);
                b0Var6.f111551w = flowCollector;
                b0Var6.f111552x = obj3;
                return b0Var6.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.lang.Throwable, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Long l2;
        boolean z;
        ?? r110;
        efm.r rVarC;
        Flow flowM;
        ?? r111;
        vkm.d dVarB;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f111551w;
                    xi0.b bVar = (xi0.b) this.f111552x;
                    n0 n0Var = this.f111553y;
                    u1d.a aVar2 = n0Var.f111575t;
                    y1d.b.Companion.getClass();
                    akg.n nVarC3 = aVar2.c3(y1d.a.d, new Pair(n0Var.o.f99788a.f306286a, bVar.f306286a));
                    this.f111551w = null;
                    this.f111552x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, nVarC3, this) == aVar) {
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
                n0 n0Var2 = this.f111553y;
                y5j.g gVar = n0Var2.C;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f111551w;
                    wkm.l lVarQ = vkm.q.Q(yh5.b.e(n0Var2.f111571p.a(), mo3.a.g(new y5j.e(gVar.f311097a.C0("CHART_TYPE_KEY", String.class), 1), null, h0.f111561a, 1), mo3.a.g(new y5j.e(gVar.f311097a.C0("CHART_PERIOD_KEY", String.class), 0), null, i0.f111563a, 1)), new b0(2, n0Var2, null));
                    this.f111551w = null;
                    this.f111552x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, lVarQ, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                final n0 n0Var3 = this.f111553y;
                gte.a aVar4 = n0Var3.f111572q;
                f61.a aVar5 = n0Var3.B;
                cli.y yVar = n0Var3.R;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f111551w;
                    yhm.r rVar = (yhm.r) this.f111552x;
                    xi0.b bVar2 = (xi0.b) rVar.f314201a;
                    y5j.b bVar3 = (y5j.b) rVar.f314202b;
                    qta.f duration = (qta.f) rVar.f314203c;
                    int i5 = w.f111607a[bVar3.ordinal()];
                    w4l.k loadingStrategy = w4l.j.f294644c;
                    w4l.h loadingStrategy2 = w4l.h.f294642c;
                    if (i5 == 1) {
                        int i6 = w.f111608b[duration.ordinal()];
                        l2 = i6 != 1 ? i6 != 2 ? null : 600L : 60L;
                        if (l2 != null) {
                            Pair currencyPair = new Pair(((o) ((j2) yVar.f22677a).getValue()).f111579a, bVar2);
                            aVar5.getClass();
                            Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                            Intrinsics.checkNotNullParameter(duration, "duration");
                            Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                            rVarC = ((vpk.p) aVar5.f132372b).c(currencyPair, duration, l2, loadingStrategy2);
                            r110 = 0;
                            z = false;
                        } else {
                            Pair currencyPair2 = new Pair(((o) ((j2) yVar.f22677a).getValue()).f111579a, bVar2);
                            if (!((jte.d) aVar4).c(WealthDomainApi$Toggles$ChartsCachingImprovements.f105071c)) {
                                loadingStrategy = loadingStrategy2;
                            }
                            aVar5.getClass();
                            Intrinsics.checkNotNullParameter(currencyPair2, "currencyPair");
                            Intrinsics.checkNotNullParameter(duration, "duration");
                            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                            vpk.p pVar = (vpk.p) aVar5.f132372b;
                            Intrinsics.checkNotNullParameter(currencyPair2, "currencyPair");
                            Intrinsics.checkNotNullParameter(duration, "duration");
                            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                            z = false;
                            r110 = 0;
                            vpk.g gVar2 = new vpk.g(currencyPair2, duration, vpk.f.MID_LINE, null, null, false, SyslogConstants.LOG_CLOCK);
                            x4l.c cVar = pVar.i;
                            if (pVar.b()) {
                                loadingStrategy = pVar.f291251g.d(loadingStrategy, vpk.p.f(gVar2), true);
                            }
                            rVarC = rd0.e.c(cVar.b(gVar2, loadingStrategy), kotlin.coroutines.g.f186406a);
                        }
                        Intrinsics.checkNotNullParameter(rVarC, "<this>");
                        Data data = new Data(r110, r110, z);
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        efm.r<hhm.g> rVarTimestamp = rVarC.timestamp(timeUnit);
                        Intrinsics.checkNotNullExpressionValue(rVarTimestamp, "timestamp(...)");
                        efm.r rVarSkip = te0.w.r0(rVarTimestamp, new hhm.g(data, 0L, timeUnit)).skip(1L);
                        Intrinsics.checkNotNullExpressionValue(rVarSkip, "skip(...)");
                        zd3.h itemDelay = new zd3.h(data, 10);
                        Intrinsics.checkNotNullParameter(rVarSkip, "<this>");
                        Intrinsics.checkNotNullParameter(itemDelay, "itemDelay");
                        efm.r rVarSwitchMap = rVarSkip.switchMap(cj9.c.p(new mic.a0(17, itemDelay)));
                        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                        efm.r map = rVarSwitchMap.map(new zh7.a(18, new zg6.c(27)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        final int i21 = 0;
                        final int i22 = 1;
                        flowM = u0.m(new q0(nim.a.v(u0.m(n0Var3.S, rd0.e.b(map)), new Function1() { // from class: d6j.u
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                DateTime dateTimeMinusDays;
                                int i32 = i21;
                                n0 n0Var4 = n0Var3;
                                Pair pair = (Pair) obj3;
                                switch (i32) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                        qta.c cVar2 = (qta.c) pair.f186385a;
                                        qta.d dVar = (qta.d) pair.f186386b;
                                        if (cVar2 == null) {
                                            return dVar;
                                        }
                                        return qta.d.a(dVar, zhm.d0.F0(new Pair(Long.valueOf(((l80.f) n0Var4.J).b().toEpochMilli()), Double.valueOf(cVar2.f249048c.doubleValue())), dVar.e));
                                    default:
                                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                        qta.f fVar = (qta.f) pair.f186385a;
                                        io3.d dVar2 = (io3.d) pair.f186386b;
                                        whf.b bVar4 = n0Var4.D;
                                        i7.c cVar3 = i7.Companion;
                                        u9 u9Var = new u9(false);
                                        ua uaVar = new ua(dVar2.f163145a);
                                        cc ccVar = new cc(zhm.u.c(y6.EXCHANGE));
                                        l80.e eVar = n0Var4.J;
                                        switch (w.f111608b[fVar.ordinal()]) {
                                            case 1:
                                                dateTimeMinusDays = ((l80.f) eVar).g().minusDays(1);
                                                break;
                                            case 2:
                                                dateTimeMinusDays = ((l80.f) eVar).g().minusWeeks(1);
                                                break;
                                            case 3:
                                                dateTimeMinusDays = ((l80.f) eVar).g().minusMonths(1);
                                                break;
                                            case 4:
                                                dateTimeMinusDays = ((l80.f) eVar).g().minusMonths(3);
                                                break;
                                            case 5:
                                                dateTimeMinusDays = ((l80.f) eVar).g().minusMonths(6);
                                                break;
                                            case 6:
                                                dateTimeMinusDays = ((l80.f) eVar).g().minusYears(1);
                                                break;
                                            case 7:
                                                dateTimeMinusDays = ((l80.f) eVar).g().minusYears(5);
                                                break;
                                            case 8:
                                                dateTimeMinusDays = new DateTime(0L);
                                                break;
                                            default:
                                                throw new NoWhenBranchMatchedException();
                                        }
                                        Intrinsics.checkNotNullExpressionValue(dateTimeMinusDays, "getStartDate(...)");
                                        i7[] i7VarArr = {u9Var, uaVar, ccVar, new g8(dateTimeMinusDays), new h8(((l80.f) eVar).g())};
                                        cVar3.getClass();
                                        return rd0.e.b(nim.a.w(whf.b.a(bVar4, te0.w.h(i7.c.a(i7VarArr)), null, null, null, 14), new kotlin.jvm.internal.h0() { // from class: d6j.a0
                                            @Override // kotlin.jvm.internal.h0, wim.p
                                            public final Object get(Object obj4) {
                                                return ((whf.p) obj4).f297646a;
                                            }
                                        }));
                                }
                            }
                        }), new e0(3, n0Var3, r110), 1), new q0(boh.f.e(u0.m(new y5j.e(n0Var3.C.f311097a.C0("CHART_PERIOD_KEY", String.class), 0), (MutableStateFlow) n0Var3.T.getValue()), new Function1() { // from class: d6j.u
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                DateTime dateTimeMinusDays;
                                int i32 = i22;
                                n0 n0Var4 = n0Var3;
                                Pair pair = (Pair) obj3;
                                switch (i32) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                        qta.c cVar2 = (qta.c) pair.f186385a;
                                        qta.d dVar = (qta.d) pair.f186386b;
                                        if (cVar2 == null) {
                                            return dVar;
                                        }
                                        return qta.d.a(dVar, zhm.d0.F0(new Pair(Long.valueOf(((l80.f) n0Var4.J).b().toEpochMilli()), Double.valueOf(cVar2.f249048c.doubleValue())), dVar.e));
                                    default:
                                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                        qta.f fVar = (qta.f) pair.f186385a;
                                        io3.d dVar2 = (io3.d) pair.f186386b;
                                        whf.b bVar4 = n0Var4.D;
                                        i7.c cVar3 = i7.Companion;
                                        u9 u9Var = new u9(false);
                                        ua uaVar = new ua(dVar2.f163145a);
                                        cc ccVar = new cc(zhm.u.c(y6.EXCHANGE));
                                        l80.e eVar = n0Var4.J;
                                        switch (w.f111608b[fVar.ordinal()]) {
                                            case 1:
                                                dateTimeMinusDays = ((l80.f) eVar).g().minusDays(1);
                                                break;
                                            case 2:
                                                dateTimeMinusDays = ((l80.f) eVar).g().minusWeeks(1);
                                                break;
                                            case 3:
                                                dateTimeMinusDays = ((l80.f) eVar).g().minusMonths(1);
                                                break;
                                            case 4:
                                                dateTimeMinusDays = ((l80.f) eVar).g().minusMonths(3);
                                                break;
                                            case 5:
                                                dateTimeMinusDays = ((l80.f) eVar).g().minusMonths(6);
                                                break;
                                            case 6:
                                                dateTimeMinusDays = ((l80.f) eVar).g().minusYears(1);
                                                break;
                                            case 7:
                                                dateTimeMinusDays = ((l80.f) eVar).g().minusYears(5);
                                                break;
                                            case 8:
                                                dateTimeMinusDays = new DateTime(0L);
                                                break;
                                            default:
                                                throw new NoWhenBranchMatchedException();
                                        }
                                        Intrinsics.checkNotNullExpressionValue(dateTimeMinusDays, "getStartDate(...)");
                                        i7[] i7VarArr = {u9Var, uaVar, ccVar, new g8(dateTimeMinusDays), new h8(((l80.f) eVar).g())};
                                        cVar3.getClass();
                                        return rd0.e.b(nim.a.w(whf.b.a(bVar4, te0.w.h(i7.c.a(i7VarArr)), null, null, null, 14), new kotlin.jvm.internal.h0() { // from class: d6j.a0
                                            @Override // kotlin.jvm.internal.h0, wim.p
                                            public final Object get(Object obj4) {
                                                return ((whf.p) obj4).f297646a;
                                            }
                                        }));
                                }
                            }
                        }), new e0(4, n0Var3, r110), 1));
                        r111 = r110;
                    } else {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i32 = w.f111608b[duration.ordinal()];
                        l2 = i32 != 1 ? i32 != 2 ? null : 600L : 60L;
                        if (l2 != null) {
                            dVarB = rd0.e.b(aVar5.E(new Pair(((o) ((j2) yVar.f22677a).getValue()).f111579a, bVar2), duration, l2, false));
                        } else {
                            Pair pair = new Pair(((o) ((j2) yVar.f22677a).getValue()).f111579a, bVar2);
                            if (!((jte.d) aVar4).c(WealthDomainApi$Toggles$ChartsCachingImprovements.f105071c)) {
                                loadingStrategy = loadingStrategy2;
                            }
                            dVarB = rd0.e.b(aVar5.F(pair, duration, false, loadingStrategy));
                        }
                        flowM = new q0(dVarB, new e0(5, n0Var3, null), 1);
                        r111 = 0;
                    }
                    this.f111551w = r111;
                    this.f111552x = r111;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowM, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f111551w;
                    xi0.b bVar4 = (xi0.b) this.f111552x;
                    n0 n0Var4 = this.f111553y;
                    vkm.d dVarB2 = rd0.e.b(ou5.b.u(n0Var4.G, n0Var4.o.f99788a, bVar4));
                    this.f111551w = null;
                    this.f111552x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, dVarB2, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f111551w;
                    xi0.b bVar5 = (xi0.b) this.f111552x;
                    n0 n0Var5 = this.f111553y;
                    vkm.d dVarB3 = rd0.e.b(nim.a.w(n0Var5.A.e(v1.c.w(n0Var5.o.f99788a, bVar5), n9l.b.SEC_3), j0.f111564a));
                    this.f111551w = null;
                    this.f111552x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, dVarB3, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = this.f111551w;
                    xi0.b bVar6 = (xi0.b) this.f111552x;
                    n0 n0Var6 = this.f111553y;
                    wkm.l lVarF3 = n0Var6.f111576w.f3(n0Var6.o.f99788a, bVar6);
                    this.f111551w = null;
                    this.f111552x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, lVarF3, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
