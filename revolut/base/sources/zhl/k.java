package zhl;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nel.z;
import org.jetbrains.annotations.NotNull;
import vdl.l1;
import vkm.q;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements vgl.c {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f322451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yhl.d f322452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yhl.h f322453c;
    public final gte.a d;
    public final ybl.b e;

    public k(l1 repository, yhl.d corporateEventsInteractor, yhl.h tradingEventsInteractor, gte.a featureToggleInteractor, ybl.b instrumentTickerInteractor, a chartEventAggregationInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(corporateEventsInteractor, "corporateEventsInteractor");
        Intrinsics.checkNotNullParameter(tradingEventsInteractor, "tradingEventsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(chartEventAggregationInteractor, "chartEventAggregationInteractor");
        this.f322451a = repository;
        this.f322452b = corporateEventsInteractor;
        this.f322453c = tradingEventsInteractor;
        this.d = featureToggleInteractor;
        this.e = instrumentTickerInteractor;
    }

    public static final eel.e b(k kVar, eel.e eVar, InstrumentTicker instrumentTicker) throws Throwable {
        long j2;
        eel.f fVar;
        List listF0 = eVar.f125227a;
        eel.i iVar = eVar.d;
        eel.h hVar = eVar.e;
        eel.l lVar = (eel.l) d0.o0(listF0);
        Long lValueOf = lVar != null ? Long.valueOf(lVar.f125238b) : null;
        long j3 = eVar.f125229c;
        long j5 = instrumentTicker.f105119n;
        if (listF0.isEmpty()) {
            int i = e.f322440c[iVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                long j16 = eVar.f125228b;
                long jMax = Math.max(j5, j3);
                BigDecimal bigDecimal = hVar instanceof eel.g ? ((eel.g) hVar).f125231a : null;
                return new eel.e(v.l(g(instrumentTicker)), j16, jMax, eVar.d, bigDecimal != null ? new eel.g(bigDecimal) : null);
            }
            long j22 = eVar.f125228b;
            long jMax2 = Math.max(j5, j3);
            ej0.b bVar = hVar instanceof eel.f ? ((eel.f) hVar).f125230a : null;
            eel.i iVar2 = eVar.d;
            List listL = v.l(f(instrumentTicker));
            if (bVar != null) {
                eel.f fVar2 = new eel.f(bVar);
                j2 = j22;
                fVar = fVar2;
            } else {
                j2 = j22;
                fVar = null;
            }
            return new eel.e(listL, j2, jMax2, iVar2, fVar);
        }
        if (lValueOf == null || j5 <= lValueOf.longValue()) {
            return eVar;
        }
        int i2 = e.f322440c[iVar.ordinal()];
        if (i2 == 1) {
            eel.l lVarF = f(instrumentTicker);
            if (lVarF != null) {
                listF0 = d0.F0(lVarF, listF0);
            }
            List list = listF0;
            long j42 = eVar.f125228b;
            long jMax3 = Math.max(j5, j3);
            ej0.b bVar2 = hVar instanceof eel.f ? ((eel.f) hVar).f125230a : null;
            return new eel.e(list, j42, jMax3, eVar.d, bVar2 != null ? new eel.f(bVar2) : null);
        }
        if (i2 != 2) {
            throw new IllegalStateException("");
        }
        eel.l lVarG = g(instrumentTicker);
        if (lVarG != null) {
            listF0 = d0.F0(lVarG, listF0);
        }
        List list2 = listF0;
        long j46 = eVar.f125228b;
        long jMax4 = Math.max(j5, j3);
        BigDecimal bigDecimal2 = hVar instanceof eel.g ? ((eel.g) hVar).f125231a : null;
        return new eel.e(list2, j46, jMax4, eVar.d, bigDecimal2 != null ? new eel.g(bigDecimal2) : null);
    }

    public static final int c(k kVar, eel.e eVar, long j2) {
        List list = eVar.f125227a;
        if (list.size() <= 1) {
            return 0;
        }
        int iG = v.g(eVar.f125227a, new nxc.a(j2, 25));
        int i = iG >= 0 ? iG + 1 : -(iG + 1);
        int iJ = v.j(list);
        if (i <= iJ) {
            iJ = i;
        }
        int i2 = i - 1;
        int i3 = i2 >= 0 ? i2 : 0;
        Instant instantOfEpochMilli = Instant.ofEpochMilli(((eel.l) list.get(i3)).f125238b);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        LocalDate localDateW = oi0.d.W(instantOfEpochMilli);
        Instant instantOfEpochMilli2 = Instant.ofEpochMilli(j2);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
        boolean zF = Intrinsics.f(localDateW, oi0.d.W(instantOfEpochMilli2));
        Instant instantOfEpochMilli3 = Instant.ofEpochMilli(((eel.l) list.get(iJ)).f125238b);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli3, "ofEpochMilli(...)");
        LocalDate localDateW2 = oi0.d.W(instantOfEpochMilli3);
        Instant instantOfEpochMilli4 = Instant.ofEpochMilli(j2);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli4, "ofEpochMilli(...)");
        boolean zF2 = Intrinsics.f(localDateW2, oi0.d.W(instantOfEpochMilli4));
        return ((!zF || zF2) && ((zF2 && !zF) || Math.abs(j2 - ((eel.l) list.get(i3)).f125238b) > Math.abs(j2 - ((eel.l) list.get(iJ)).f125238b))) ? iJ : i3;
    }

    public static eel.l f(InstrumentTicker instrumentTicker) {
        ej0.b value = instrumentTicker.d == z.BOND ? instrumentTicker.f105114g : instrumentTicker.f;
        if (value == null) {
            return null;
        }
        String str = instrumentTicker.f105112b;
        long j2 = instrumentTicker.f105119n;
        Intrinsics.checkNotNullParameter(value, "value");
        return new eel.l(str, j2, new eel.f(value));
    }

    public static eel.l g(InstrumentTicker instrumentTicker) throws Throwable {
        BigDecimal value = instrumentTicker.f105125w;
        if (value != null) {
            String str = instrumentTicker.f105112b;
            long j2 = instrumentTicker.f105119n;
            Intrinsics.checkNotNullParameter(value, "value");
            return new eel.l(str, j2, new eel.g(value));
        }
        hx7.e.n(new IllegalStateException("lastYtm must be present instrument having chart with valueType=" + eel.i.YTM));
        return null;
    }

    public final wkm.l d(nel.n instrument, go.g chartPeriodFlow, Flow chartValueTypeFlow, boolean z, boolean z3, vgl.b latestChartPointStrategy, vgl.a corporateEventsGroupingStrategy, i4g.g gVar) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(chartPeriodFlow, "chartPeriodFlow");
        Intrinsics.checkNotNullParameter(chartValueTypeFlow, "chartValueTypeFlow");
        Intrinsics.checkNotNullParameter(latestChartPointStrategy, "latestChartPointStrategy");
        Intrinsics.checkNotNullParameter(corporateEventsGroupingStrategy, "corporateEventsGroupingStrategy");
        return q.Q(yh5.b.d(chartPeriodFlow, chartValueTypeFlow), new g(null, this, instrument, latestChartPointStrategy, z, z3, gVar, corporateEventsGroupingStrategy));
    }

    public final wkm.l e(Flow chartPeriodFlow, go.g chartValueTypeFlow, String ref2, vgl.b latestChartPointStrategy) {
        Object gVar;
        Intrinsics.checkNotNullParameter(chartPeriodFlow, "chartPeriodFlow");
        Intrinsics.checkNotNullParameter(chartValueTypeFlow, "chartValueTypeFlow");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(latestChartPointStrategy, "latestChartPointStrategy");
        int i = e.f322439b[latestChartPointStrategy.ordinal()];
        if (i != 1) {
            ybl.b bVar = this.e;
            if (i == 2) {
                gVar = nim.a.v(rd0.e.b(((ael.k) bVar).n(u.c(ref2), w4l.h.f294642c)), new zg6.c(15));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar = nim.a.v(rd0.e.b(ybl.b.a(bVar, u.c(ref2))), new zg6.c(16));
            }
        } else {
            gVar = new go.g(new Data(null, null, false, 6, null), 2);
        }
        return q.Q(yh5.b.d(chartPeriodFlow, chartValueTypeFlow), new x4k.c((Continuation) null, this, ref2, gVar, 9));
    }
}
