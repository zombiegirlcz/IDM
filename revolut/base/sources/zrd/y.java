package zrd;

import aw0.h1;
import aw0.i4;
import aw0.j1;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.j0;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthContract$InputData;
import ip0.ed0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lnd.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements cli.n {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final MoneyClause.Format.Defaults f324712g = new MoneyClause.Format.Defaults(null, null, false, false, 15);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final MoneyClause.Format.Headers f324713h = new MoneyClause.Format.Headers(null, null, null, false, false, 31);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bsd.j f324714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bsd.h f324715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tsj.g f324716c;
    public final TotalWealthContract$InputData d;
    public final zjh.j e;
    public final gte.a f;

    public y(fsd.c groupMapper, fsd.b groupDetailsMapper, k0 analyticsTimeSwitcherMapper, bsd.j totalWealthToolbarStateMapper, bsd.h totalWealthBalanceChartMapper, rrd.g customAssetsDisclaimerProvider, tsj.g customAssetsInteractor, TotalWealthContract$InputData inputData, zjh.j legalEntityDisclaimerMapper, rrd.k performanceBackgroundMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(groupMapper, "groupMapper");
        Intrinsics.checkNotNullParameter(groupDetailsMapper, "groupDetailsMapper");
        Intrinsics.checkNotNullParameter(analyticsTimeSwitcherMapper, "analyticsTimeSwitcherMapper");
        Intrinsics.checkNotNullParameter(totalWealthToolbarStateMapper, "totalWealthToolbarStateMapper");
        Intrinsics.checkNotNullParameter(totalWealthBalanceChartMapper, "totalWealthBalanceChartMapper");
        Intrinsics.checkNotNullParameter(customAssetsDisclaimerProvider, "customAssetsDisclaimerProvider");
        Intrinsics.checkNotNullParameter(customAssetsInteractor, "customAssetsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(performanceBackgroundMapper, "performanceBackgroundMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f324714a = totalWealthToolbarStateMapper;
        this.f324715b = totalWealthBalanceChartMapper;
        this.f324716c = customAssetsInteractor;
        this.d = inputData;
        this.e = legalEntityDisclaimerMapper;
        this.f = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(dj0.d r48, java.util.List r49, java.util.List r50) {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zrd.y.a(dj0.d, java.util.List, java.util.List):java.util.ArrayList");
    }

    public final ed0 b(List list, amd.j jVar, dj0.d dVar, TextLocalisedClause textLocalisedClause) {
        amd.b bVar;
        List<amd.j> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (amd.j jVar2 : list2) {
            String strD = jVar2.f6332a.d();
            Clause clauseE = fsd.c.e(jVar2);
            List list3 = jVar2.f6333b;
            dj0.d.Companion.getClass();
            dj0.d dVarO = dj0.d.e;
            int i = 0;
            for (Object obj2 : list3) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                dVarO = i == 0 ? ((amd.d) obj2).d : pyd.c.O(dVarO, ((amd.d) obj2).d);
                i = i2;
            }
            arrayList.add(new i4(strD, clauseE, dVarO.a().f115082a, new Color.Solid(fsd.c.a(jVar2.f6332a))));
        }
        return new ed0("CHART_ID", j0.a(arrayList, new j1(new h1(((jVar != null ? jVar.f6332a : null) == amd.b.INVEST && (jVar.e instanceof ssd.f)) ? new TextLocalisedClause(R$string.analytics_total_wealth_youth_invest_short_title, null, null, 14) : jVar != null ? fsd.c.e(jVar) : textLocalisedClause), new MoneyClause(dVar.a(), f324713h, null, null, 12), null), (jVar == null || (bVar = jVar.f6332a) == null) ? null : bVar.toString(), false, null, null, 240), null);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.f324678a, new zr2.o(this, 7), new znc.j(27), new zhl.l(this, domainState, 8));
    }
}
