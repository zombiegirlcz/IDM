package inc;

import aw0.o9;
import cli.n;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import doc.b0;
import ijj.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import noc.o;
import ppc.t;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yoc.j f162782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f162783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f162784c;
    public final poc.a d;
    public final ooc.b e;
    public final bdh.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f162785g;

    public j(yoc.j riskTileProvider, b0 chartWidgetMapper, o allocationMapper, poc.a portfolioRiskMetricsWidgetProvider, ooc.b bioWidgetProvider, bdh.e helpWidgetMapper, t roboFooterDisclaimersWidgetMapper) {
        Intrinsics.checkNotNullParameter(riskTileProvider, "riskTileProvider");
        Intrinsics.checkNotNullParameter(chartWidgetMapper, "chartWidgetMapper");
        Intrinsics.checkNotNullParameter(allocationMapper, "allocationMapper");
        Intrinsics.checkNotNullParameter(portfolioRiskMetricsWidgetProvider, "portfolioRiskMetricsWidgetProvider");
        Intrinsics.checkNotNullParameter(bioWidgetProvider, "bioWidgetProvider");
        Intrinsics.checkNotNullParameter(helpWidgetMapper, "helpWidgetMapper");
        Intrinsics.checkNotNullParameter(roboFooterDisclaimersWidgetMapper, "roboFooterDisclaimersWidgetMapper");
        this.f162782a = riskTileProvider;
        this.f162783b = chartWidgetMapper;
        this.f162784c = allocationMapper;
        this.d = portfolioRiskMetricsWidgetProvider;
        this.e = bioWidgetProvider;
        this.f = helpWidgetMapper;
        this.f162785g = roboFooterDisclaimersWidgetMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        qv0.i iVar;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = 10;
        h hVar = new h(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.wealth_robo_portfolio_about_strategy_information_subtitle, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_common_learn_more, null, new Click(28, (Integer) null, (Object) f.f162777a, "portfolio-strategy-subtitle-learn-more", false), 10))), new TextLocalisedClause(R$string.wealth_robo_portfolio_about_strategy_information_title, null, null, 14));
        Data data = domainState.f162774a;
        List listC = (data == null || (iVar = (qv0.i) iii.c.f(data, new im3.e(18), new r(26), new igh.o(this, i))) == null) ? null : u.c(iVar);
        if (listC == null) {
            listC = f0.f322471a;
        }
        List listA = this.f162783b.a(new doc.e(new TextLocalisedClause(R$string.wealth_robo_portfolio_simulated_past_performance_title, null, null, 14)), domainState.f162776c);
        int i2 = R$string.wealth_robo_portfolio_portfolio_allocation;
        List listB = this.f162784c.b(data, new noc.d(i2, i2));
        List listA2 = this.d.a(data, domainState.f162775b);
        List list = data != null ? (List) iii.c.f(data, new im3.e(17), new r(25), new ajd.t(this, domainState.d, 9)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        List[] elements = {listC, listA, listB, listA2, list, this.f.a(), this.f162785g.a(domainState.e)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new i(hVar, w.u(kotlin.collections.d.L(elements)));
    }
}
