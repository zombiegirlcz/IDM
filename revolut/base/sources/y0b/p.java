package y0b;

import aw0.k7;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.advanced_charts.impl.R$string;
import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import com.revolut.feature.retail.advanced_charts.models.ChartTimeFrameDisplayType;
import com.revolut.feature.retail.advanced_charts.models.LockPolicy;
import com.revolut.feature.retail.advanced_charts.models.OverlayPolicy;
import d9.e1;
import ip0.z;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;
import org.jetbrains.annotations.NotNull;
import wyg.s;
import xo8.j0;
import yrb.x;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0b.d f310193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0b.l f310194b;

    public p(j0b.d tradeMapper, x0b.l advancedChartMapper) {
        Intrinsics.checkNotNullParameter(tradeMapper, "tradeMapper");
        Intrinsics.checkNotNullParameter(advancedChartMapper, "advancedChartMapper");
        this.f310193a = tradeMapper;
        this.f310194b = advancedChartMapper;
    }

    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Clause clause;
        Clause clause2;
        boolean z;
        List listC;
        int i;
        j0b.e eVar;
        Data data;
        d1b.a aVar;
        s01.d dVar;
        c1b.f fVar;
        c1b.e eVar2;
        boolean z3;
        d1b.e eVar3;
        c1b.h hVar;
        c1b.k kVar;
        d1b.d dVar2;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Clause clause3 = domainState.f310174a;
        x xVar = domainState.f310176c;
        g0b.c domainState2 = domainState.d;
        Data data2 = domainState2.e;
        boolean z4 = domainState2.f139406n;
        Clause clause4 = (Clause) iii.c.f(data2, new y07.m(6), new xx9.e(28), new x0b.h(20));
        if (domainState.e) {
            c1b.a mode = c1b.a.FULLSCREEN;
            Intrinsics.checkNotNullParameter(domainState2, "domainState");
            Intrinsics.checkNotNullParameter(mode, "mode");
            c1b.f fVar2 = domainState2.f139411t;
            od0.a aVar2 = od0.a.f224253a;
            String str = od0.a.g() ? "https://charts.revolut.com/index.html" : "https://charts.revolut.codes/index.html";
            x0b.l lVar = this.f310194b;
            String string = ((f80.b) lVar.f301562c).f(str).buildUpon().appendQueryParameter("mode", mode.a()).appendQueryParameter("handlerVersion", fVar2.a()).build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            s01.g gVar = z4 ? s01.f.f258753a : s01.e.f258752a;
            AdvancedChartSymbol advancedChartSymbol = domainState2.d;
            d1b.e eVar4 = domainState2.f139400c;
            c1b.h hVar2 = domainState2.f139398a;
            c1b.k kVar2 = domainState2.f139399b;
            Set set = domainState2.f139402h;
            Set set2 = !set.isEmpty() ? set : null;
            c1b.j jVar2 = (c1b.j) domainState2.e.getContent();
            clause = clause3;
            clause2 = clause4;
            int i2 = 0;
            Pair pair = (Pair) iii.c.f(domainState2.f139404l, new wyc.p(23), new s(10), new x0b.h(i2));
            Pair pair2 = (Pair) iii.c.f(domainState2.f139405m, new wyc.p(23), new s(10), new x0b.h(i2));
            Data data3 = domainState2.f;
            d1b.b bVar = data3 != null ? (d1b.b) iii.c.f(data3, new wyc.p(22), new s(9), new w2a.o(29)) : null;
            Set set3 = domainState2.i;
            OverlayPolicy overlayPolicy = domainState2.f139403j;
            LockPolicy lockPolicy = domainState2.k;
            c1b.e eVar5 = domainState2.f139407p;
            boolean z6 = domainState2.f139408q;
            int[] iArr = x0b.k.f301559a;
            int i3 = iArr[mode.ordinal()];
            if (i3 == 1) {
                aVar = (d1b.a) lVar.e.getValue();
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = (d1b.a) lVar.d.getValue();
            }
            d1b.a aVar3 = aVar;
            AdvancedChartSymbol advancedChartSymbol2 = domainState2.f139409r;
            int i5 = iArr[mode.ordinal()];
            if (i5 == 1) {
                dVar = s01.d.FIXED;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = s01.d.MATCH_PARENT;
            }
            s01.d dVar3 = dVar;
            ChartTimeFrameDisplayType chartTimeFrameDisplayType = domainState2.f139410s;
            c1b.f fVar3 = domainState2.f139411t;
            c1b.i iVar = domainState2.u;
            f01.a aVar4 = lVar.f301561b;
            if (iVar != null) {
                fVar = fVar3;
                ej0.b bVar2 = iVar.d;
                z = z4;
                BigDecimal bigDecimal = bVar2.f126703a;
                eVar2 = eVar5;
                z3 = z6;
                eVar3 = eVar4;
                hVar = hVar2;
                kVar = kVar2;
                dVar2 = new d1b.d(iVar.f20435a, aVar4.b(new TextLocalisedClause(R$string.trading_advanced_charts_open_position_quantity, u.c(new NumberClause(iVar.f20436b, new NumberClause.Format.FixedDigitsAfterDot(2, 14, null, null, null), null, null, 12)), null, 12)).toString(), pyd.c.Y(iVar.f20437c).doubleValue(), aVar4.b(new MoneyClause(mif.a.P(bVar2, bVar2.f126704b.c(), 2), new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12)).toString(), lVar.a(e1.G(bigDecimal) ? R$attr.uikit_colorPerformancePositive : e1.C(bigDecimal) ? R$attr.uikit_colorPerformanceNegative : R$attr.uikit_colorPerformanceStatic), lVar.a(R$attr.uikit_colorPopoverBackground), lVar.a(R$attr.uikit_colorForeground), lVar.a(R$attr.uikit_colorAccent));
            } else {
                fVar = fVar3;
                z = z4;
                eVar2 = eVar5;
                z3 = z6;
                eVar3 = eVar4;
                hVar = hVar2;
                kVar = kVar2;
                dVar2 = null;
            }
            s01.h hVar3 = new s01.h(string, gVar, advancedChartSymbol, eVar3, hVar, kVar, set2, set3, overlayPolicy, lockPolicy, eVar2, pair, pair2, bVar, jVar2, advancedChartSymbol2, aVar3, z3, dVar3, chartTimeFrameDisplayType, fVar, dVar2);
            if (mode == c1b.a.EMBEDDED) {
                int i6 = R$attr.uikit_dp0;
                yp0.b.p(hVar3, i6, i6, i6, i6);
            }
            listC = u.c(hVar3);
        } else {
            clause = clause3;
            clause2 = clause4;
            z = z4;
            listC = f0.f322471a;
        }
        List list = listC;
        mx0.d dVar4 = mx0.d.SEMIACCENT;
        c1b.h hVar4 = domainState2.f139398a;
        Intrinsics.checkNotNullParameter(hVar4, "<this>");
        switch (a1b.b.f580a[hVar4.ordinal()]) {
            case 1:
                i = R$string.trading_advanced_chart_interval_one_minute;
                break;
            case 2:
                i = R$string.trading_advanced_chart_interval_two_minutes;
                break;
            case 3:
                i = R$string.trading_advanced_chart_interval_five_minutes;
                break;
            case 4:
                i = R$string.trading_advanced_chart_interval_ten_minutes;
                break;
            case 5:
                i = R$string.trading_advanced_chart_interval_fifteen_minutes;
                break;
            case 6:
                i = R$string.trading_advanced_chart_interval_thirty_minutes;
                break;
            case 7:
                i = R$string.trading_advanced_chart_interval_one_hour;
                break;
            case 8:
                i = R$string.trading_advanced_chart_interval_four_hours;
                break;
            case 9:
                i = R$string.trading_advanced_chart_interval_twelve_hours;
                break;
            case 10:
                i = R$string.trading_advanced_chart_interval_one_day;
                break;
            case 11:
                i = R$string.trading_advanced_chart_interval_two_days;
                break;
            case 12:
                i = R$string.trading_advanced_chart_interval_four_days;
                break;
            case 13:
                i = R$string.trading_advanced_chart_interval_one_week;
                break;
            case 14:
                i = R$string.trading_advanced_chart_interval_five_weeks;
                break;
            case 15:
                i = R$string.trading_advanced_chart_interval_one_month;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ActionsView.Item[] elements = {new ActionsView.Item("CHART_ACTIONS_DATE", dVar4, false, z ? e4.EnabledNonClickable : e4.EnabledClickable, null, new TextLocalisedClause(i, null, null, 14), null, null, null, null, false, null, null, null, null, 32660), new ActionsView.Item("CHART_ACTIONS_CHART_STYLE", dVar4, false, z ? e4.EnabledNonClickable : e4.EnabledClickable, null, null, new ResourceImage(R$drawable.uikit_icn_24_candlestick_chart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32660), new ActionsView.Item("CHART_ACTIONS_ADD", dVar4, false, z ? e4.EnabledNonClickable : e4.EnabledClickable, null, null, new ResourceImage(R$drawable.uikit_icn_24_plus_circle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32660), new ActionsView.Item("CHART_ACTIONS_DRAWING", dVar4, false, z ? e4.EnabledNonClickable : e4.EnabledClickable, null, null, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32660), (xVar == null || (data = xVar.o) == null) ? null : (ActionsView.Item) iii.c.f(data, new y07.m(7), new xx9.e(29), new j0(domainState, 14))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listC2 = u.c(new z("CHART_ACTIONS_LIST", kotlin.collections.d.L(elements), null, null, 0, 0, 124));
        List listA = xVar != null ? this.f310193a.a(xVar) : null;
        if (listA == null) {
            listA = f0.f322471a;
        }
        List list2 = listA;
        if (xVar == null || (eVar = xVar.f316259n) == null) {
            eVar = j0b.e.COLLAPSED;
        }
        return new j(clause, clause2, eVar, list2, listC2, list);
    }
}
