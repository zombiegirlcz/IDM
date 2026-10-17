package g6f;

import aw0.cb;
import aw0.l1;
import ch.qos.logback.core.net.SyslogConstants;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.hi;
import com.revolut.core.ui_kit.delegates.mi;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import hw0.x;
import ip0.hm0;
import ip0.jm0;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import org.jetbrains.annotations.NotNull;
import r10.w;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f140929b = yhm.j.b(new g53.e(4));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f140930a;

    public j(w chartMappersProvider) {
        Intrinsics.checkNotNullParameter(chartMappersProvider, "chartMappersProvider");
        this.f140930a = chartMappersProvider;
    }

    public static List a(int i) {
        jm0 jm0Var = new jm0("PERFORMANCE_CHART_LIST_ID", null, f0.f322471a, false, null, null, i, true, 230, null, false, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, -454);
        int i2 = R$attr.uikit_dp0;
        int i3 = R$attr.uikit_dp16;
        yp0.b.p(jm0Var, i2, i2, i3, i3);
        return u.c(jm0Var);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        s0 s0Var = new s0(2);
        final pdh.c cVar = domainState.f140920a;
        Data data = domainState.f140922c;
        TrendViewDelegate.a aVar = (TrendViewDelegate.a) domainState.f140921b.f224257a;
        final boolean zJ = pd.b.j(aVar != null ? Boolean.valueOf((aVar instanceof mi) || (aVar instanceof hi)) : null);
        Companion.getClass();
        Lazy lazy = f140929b;
        final int iY = kotlin.collections.d.Y((pdh.c[]) lazy.getValue(), cVar);
        s0Var.b(((List) iii.c.f(data, new a5g.i(this, iY), new f(this, iY), new Function3() { // from class: g6f.g
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                p6f.g chart = (p6f.g) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(chart, "chart");
                if (chart.a().isEmpty()) {
                    FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("EMPTY_CHART_LIST_ID", new TextLocalisedClause(R$string.managed_portfolios_compare_chart_empty_title, null, null, 14), null, new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_line_chart, null, null, 6)), zj.REGULAR, null, false, null, null, false, 0, 0, 31172);
                    yp0.b.r(model, R$attr.uikit_dp16, R$attr.uikit_dp32, 0, 0, 12);
                    return u.c(model);
                }
                c6f.a aVarF = this.f140925a.f140930a.f(chart);
                ArrayList arrayListB = aVarF.b(chart);
                cb cbVarA = aVarF.a(chart);
                x xVarC = zJ ? null : aVarF.c(chart);
                jm0 jm0Var = new jm0("PERFORMANCE_CHART_LIST_ID", cbVarA, arrayListB, cVar == pdh.c.ONE_MONTH, xVarC, null, iY, false, 230, null, false, true, aVarF.d(chart, c6f.f.MAIN_CHART_ONLY), null, new l1.c(0), hm0.Thick, null, null, null, null, 0, 0, 0, 0, -55776);
                int i = R$attr.uikit_dp0;
                int i2 = R$attr.uikit_dp16;
                yp0.b.p(jm0Var, i, i, i2, i2);
                return u.c(jm0Var);
            }
        })).toArray(new koi.j[0]));
        String strName = domainState.f140920a.name();
        pdh.c[] cVarArr = (pdh.c[]) lazy.getValue();
        ArrayList arrayList = new ArrayList(cVarArr.length);
        for (pdh.c cVar2 : cVarArr) {
            String strName2 = cVar2.name();
            switch (i.f140928a[cVar2.ordinal()]) {
                case 1:
                    textLocalisedClause = new TextLocalisedClause(R$string.managed_portfolios_details_chart_tab_1m, null, null, 14);
                    break;
                case 2:
                    textLocalisedClause = new TextLocalisedClause(R$string.managed_portfolios_details_chart_tab_6m, null, null, 14);
                    break;
                case 3:
                    textLocalisedClause = new TextLocalisedClause(R$string.managed_portfolios_details_chart_tab_ytd, null, null, 14);
                    break;
                case 4:
                    textLocalisedClause = new TextLocalisedClause(R$string.managed_portfolios_details_chart_tab_1y, null, null, 14);
                    break;
                case 5:
                    textLocalisedClause = new TextLocalisedClause(R$string.managed_portfolios_details_chart_tab_5y, null, null, 14);
                    break;
                case 6:
                    textLocalisedClause = new TextLocalisedClause(R$string.managed_portfolios_details_chart_tab_10y, null, null, 14);
                    break;
                default:
                    throw new IllegalArgumentException("");
            }
            arrayList.add(new FixedTabs.Item(strName2, textLocalisedClause, (AnalyticsContext) null, 12));
        }
        s0Var.a(new FixedTabsDelegate.Model("PERFORMANCE_CHART_TABS_LIST_ID", arrayList, strName, false, null, SyslogConstants.LOG_CLOCK));
        ArrayList arrayList2 = s0Var.f186433a;
        return new a(v.k(arrayList2.toArray(new koi.j[arrayList2.size()])));
    }
}
