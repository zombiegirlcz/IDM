package i4h;

import aw0.db;
import aw0.k7;
import aw0.o9;
import aw0.p9;
import aw0.q2;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.assetdetails.ui.impl.R$string;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.youTransactor.uCube.rpc.Constants;
import d9.e1;
import e3h.g;
import ip0.ck0;
import ip0.ml;
import ip0.ni;
import ip0.ol;
import ip0.yl;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mx0.lc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements e3h.f {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4h.e f158446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jxk.f f158447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l4h.b f158448c;
    public final l80.e d;
    public final int e;
    public final i3k.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i3k.h f158449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i3k.h f158450h;

    public d(l4h.e disclaimerProvider, l4h.i historicalChartToTrendViewMapper, l4h.h historicalChartPresentationMapper, jxk.f tradingSessionMapper, l4h.b advancedChartsNavigationMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(disclaimerProvider, "disclaimerProvider");
        Intrinsics.checkNotNullParameter(historicalChartToTrendViewMapper, "historicalChartToTrendViewMapper");
        Intrinsics.checkNotNullParameter(historicalChartPresentationMapper, "historicalChartPresentationMapper");
        Intrinsics.checkNotNullParameter(tradingSessionMapper, "tradingSessionMapper");
        Intrinsics.checkNotNullParameter(advancedChartsNavigationMapper, "advancedChartsNavigationMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f158446a = disclaimerProvider;
        this.f158447b = tradingSessionMapper;
        this.f158448c = advancedChartsNavigationMapper;
        this.d = dateProvider;
        this.e = R$attr.uikit_dp0;
        this.f = new i3k.h(15);
        this.f158449g = new i3k.h(16);
        this.f158450h = new i3k.h(17);
    }

    public static List d(InstrumentTicker instrumentTicker, eel.c cVar, boolean z, boolean z3) {
        int i;
        Pair pair;
        Pair pair2;
        Clause compositeClause;
        if (cVar != eel.c.ONE_DAY || ((instrumentTicker != null && !i(instrumentTicker.v)) || z || instrumentTicker == null)) {
            return null;
        }
        dj0.d dVar = instrumentTicker.f105122r;
        nel.p0 p0Var = instrumentTicker.v;
        String str = instrumentTicker.f105113c;
        BigDecimal bigDecimal = instrumentTicker.f105126x;
        if (c.f158443a[instrumentTicker.d.ordinal()] == 2) {
            BigDecimal bigDecimal2 = instrumentTicker.z;
            if (bigDecimal != null && e1.I(bigDecimal)) {
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "HistoricalChartMapper", a0.d.r(str, " has lastCloseYtm 0."), null, null, 24);
                bigDecimal = null;
            }
            if (bigDecimal2 != null && e1.I(bigDecimal2)) {
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "HistoricalChartMapper", a0.d.r(str, " has previousCloseYtm 0."), null, null, 24);
                bigDecimal2 = null;
            }
            if (bigDecimal == null || bigDecimal2 == null) {
                pair2 = new Pair(new TextDelegate.Model("AFTER_HOURS_ID", new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ck0(0), null, null, 0, 0, 0, 0, 2036), new TextDelegate.Model("AT_CLOSE_ID", new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ck0(0), null, null, 0, 0, 0, 0, 2036));
            } else {
                BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                MathContext mathContext = MathContext.DECIMAL128;
                BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimal2, mathContext);
                long j2 = 100;
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j2);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(bigDecimalValueOf);
                RoundingMode roundingMode = RoundingMode.HALF_UP;
                BigDecimal scale = bigDecimalMultiply.setScale(2, roundingMode);
                BigDecimal bigDecimal3 = instrumentTicker.f105125w;
                if (bigDecimal3 == null) {
                    compositeClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                } else {
                    BigDecimal bigDecimalSubtract2 = bigDecimal3.subtract(bigDecimal);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                    BigDecimal bigDecimalDivide2 = bigDecimalSubtract2.divide(bigDecimal, mathContext);
                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j2);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                    BigDecimal scale2 = bigDecimalDivide2.multiply(bigDecimalValueOf2).setScale(2, roundingMode);
                    compositeClause = new CompositeClause(zhm.v.k(new PercentageClause(bigDecimalSubtract2, new PercentageClause.Format.Custom(2, 10, p9.ONLY_NEGATIVE, null, null), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(e1.C(bigDecimalSubtract2) ? R$drawable.uikit_icn_10_stocks_arrow_down : R$drawable.uikit_icn_10_stocks_arrow_up, Integer.valueOf(e1.C(bigDecimalSubtract2) ? R$attr.uikit_colorPerformanceNegative : R$attr.uikit_colorPerformancePositive), (Float) null, (Float) null, 28), new TextClause(" " + scale2.abs() + "% ", (Style) new Custom(Integer.valueOf(scale2.compareTo(BigDecimal.ZERO) >= 0 ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorPerformanceNegative), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), new DotDividerClause((Integer) null), new TextLocalisedClause(p0Var == nel.p0.AFTER_HOURS ? R$string.wealth_market_state_after_hours : R$string.wealth_market_state_pre_market, null, null, 14)), null, null, null, 14);
                }
                CompositeClause compositeClause2 = new CompositeClause(zhm.v.k(new PercentageClause(bigDecimalSubtract, new PercentageClause.Format.Custom(2, 10, p9.ONLY_NEGATIVE, null, null), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(e1.C(bigDecimalSubtract) ? R$drawable.uikit_icn_10_stocks_arrow_down : R$drawable.uikit_icn_10_stocks_arrow_up, Integer.valueOf(e1.C(bigDecimalSubtract) ? R$attr.uikit_colorPerformanceNegative : R$attr.uikit_colorPerformancePositive), (Float) null, (Float) null, 28), new TextClause(" " + scale.abs() + "% ", (Style) new Custom(Integer.valueOf(scale.compareTo(BigDecimal.ZERO) >= 0 ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorPerformanceNegative), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), new DotDividerClause((Integer) null), new TextLocalisedClause(R$string.wealth_price_last_close, null, null, 14)), null, null, null, 14);
                ck0 ck0Var = new ck0(0);
                int i2 = R$attr.uikit_dp0;
                TextDelegate.Model model = new TextDelegate.Model("AFTER_HOURS_ID", compositeClause, false, ck0Var, null, null, i2, i2, 0, 0, 1652);
                ck0 ck0Var2 = new ck0(0);
                int i3 = R$attr.uikit_dp0;
                pair2 = new Pair(model, new TextDelegate.Model("AT_CLOSE_ID", compositeClause2, false, ck0Var2, null, null, i3, i3, 0, 0, 1652));
            }
            pair = pair2;
            i = 2;
        } else {
            dj0.d dVar2 = instrumentTicker.o;
            if (dVar != null && dVar.k()) {
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "HistoricalChartMapper", a0.d.r(str, " has lastClose 0."), null, null, 24);
                dVar = null;
            }
            if (dVar2 != null && dVar2.k()) {
                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "HistoricalChartMapper", a0.d.r(str, " has prevClose 0."), null, null, 24);
                dVar2 = null;
            }
            if (dVar == null || dVar2 == null) {
                i = 2;
                pair = new Pair(new TextDelegate.Model("AFTER_HOURS_ID", new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ck0(0), null, null, 0, 0, 0, 0, 2036), new TextDelegate.Model("AT_CLOSE_ID", new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ck0(0), null, null, 0, 0, 0, 0, 2036));
            } else {
                dj0.d dVarH = pyd.c.H(dVar, dVar2);
                BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(dVarH.f115082a);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
                BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(dVar2.f115082a);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf4, "valueOf(...)");
                MathContext mathContext2 = MathContext.DECIMAL128;
                BigDecimal bigDecimalDivide3 = bigDecimalValueOf3.divide(bigDecimalValueOf4, mathContext2);
                long j3 = 100;
                BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(j3);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf5, "valueOf(...)");
                BigDecimal bigDecimalMultiply2 = bigDecimalDivide3.multiply(bigDecimalValueOf5);
                RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                BigDecimal scale3 = bigDecimalMultiply2.setScale(2, roundingMode2);
                dj0.d dVarH2 = pyd.c.H(instrumentTicker.e, dVar);
                BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(dVarH2.f115082a);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf6, "valueOf(...)");
                BigDecimal bigDecimalValueOf7 = BigDecimal.valueOf(dVar.f115082a);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf7, "valueOf(...)");
                BigDecimal bigDecimalDivide4 = bigDecimalValueOf6.divide(bigDecimalValueOf7, mathContext2);
                BigDecimal bigDecimalValueOf8 = BigDecimal.valueOf(j3);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf8, "valueOf(...)");
                BigDecimal scale4 = bigDecimalDivide4.multiply(bigDecimalValueOf8).setScale(2, roundingMode2);
                k7 k7Var = k7.ALWAYS;
                MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(k7Var, ScaleMode.PrettyFormat.f51440a, z3, false, 8);
                o9 o9Var = o9.NON_SENSITIVE;
                Integer numValueOf = Integer.valueOf(R$attr.uikit_colorGreyTone50);
                db dbVar = db.EMPHASIS2;
                MoneyClause moneyClause = new MoneyClause(dVarH2, defaults, new Custom(numValueOf, false, dbVar, false, null, Constants.TAG_SUPPORTED_LOCALE_LIST), o9Var);
                TextClause textClause = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                i = 2;
                long j5 = dVarH2.f115082a;
                ImageClause imageClause = new ImageClause(j5 < 0 ? R$drawable.uikit_icn_10_stocks_arrow_down : R$drawable.uikit_icn_10_stocks_arrow_up, Integer.valueOf(j5 < 0 ? R$attr.uikit_colorPerformanceNegative : R$attr.uikit_colorPerformancePositive), (Float) null, (Float) null, 28);
                String str2 = " " + scale4.abs() + "% ";
                BigDecimal bigDecimal4 = BigDecimal.ZERO;
                CompositeClause compositeClause3 = new CompositeClause(zhm.v.k(moneyClause, textClause, imageClause, new TextClause(str2, (Style) new Custom(Integer.valueOf(scale4.compareTo(bigDecimal4) >= 0 ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorPerformanceNegative), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), new DotDividerClause((Integer) null), new TextLocalisedClause(p0Var == nel.p0.AFTER_HOURS ? R$string.wealth_market_state_after_hours : R$string.wealth_market_state_pre_market, null, null, 14)), null, null, null, 14);
                MoneyClause moneyClause2 = new MoneyClause(dVarH, new MoneyClause.Format.Defaults(k7Var, null, z3, false, 10), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, dbVar, false, null, Constants.TAG_SUPPORTED_LOCALE_LIST), o9Var);
                TextClause textClause2 = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                long j16 = dVarH.f115082a;
                CompositeClause compositeClause4 = new CompositeClause(zhm.v.k(moneyClause2, textClause2, new ImageClause(j16 < 0 ? R$drawable.uikit_icn_10_stocks_arrow_down : R$drawable.uikit_icn_10_stocks_arrow_up, Integer.valueOf(j16 < 0 ? R$attr.uikit_colorPerformanceNegative : R$attr.uikit_colorPerformancePositive), (Float) null, (Float) null, 28), new TextClause(" " + scale3.abs() + "% ", (Style) new Custom(Integer.valueOf(scale3.compareTo(bigDecimal4) >= 0 ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorPerformanceNegative), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), new DotDividerClause((Integer) null), new TextLocalisedClause(R$string.wealth_price_last_close, null, null, 14)), null, null, null, 14);
                ck0 ck0Var3 = new ck0(0);
                int i5 = R$attr.uikit_dp0;
                TextDelegate.Model model2 = new TextDelegate.Model("AFTER_HOURS_ID", compositeClause3, false, ck0Var3, null, null, i5, i5, 0, 0, 1652);
                ck0 ck0Var4 = new ck0(0);
                int i6 = R$attr.uikit_dp0;
                pair = new Pair(model2, new TextDelegate.Model("AT_CLOSE_ID", compositeClause4, false, ck0Var4, null, null, i6, i6, 0, 0, 1652));
            }
        }
        qv0.i iVar = (qv0.i) pair.f186385a;
        qv0.i iVar2 = (qv0.i) pair.f186386b;
        qv0.i[] iVarArr = new qv0.i[i];
        iVarArr[0] = iVar;
        iVarArr[1] = iVar2;
        return zhm.v.k(iVarArr);
    }

    public static TextDelegate.Model f(Clause clause, boolean z, eel.c cVar, nel.p0 p0Var) {
        if (cVar == eel.c.ONE_DAY && !z && i(p0Var)) {
            return null;
        }
        ck0 ck0Var = new ck0(0);
        int i = R$attr.uikit_dp0;
        return new TextDelegate.Model("PERIOD_LIST_ID", clause, false, ck0Var, null, null, i, i, 0, 0, 1652);
    }

    public static TextDelegate.Model g(Clause clause, boolean z, eel.c cVar, nel.p0 p0Var) {
        if (cVar == eel.c.ONE_DAY && !z && i(p0Var)) {
            return null;
        }
        ck0 ck0Var = new ck0(0);
        int i = R$attr.uikit_dp0;
        return new TextDelegate.Model("PROFIT_LOSE_ID", clause, false, ck0Var, null, null, i, i, 0, 0, 1652);
    }

    public static boolean i(nel.p0 p0Var) {
        return p0Var == nel.p0.AFTER_HOURS || p0Var == nel.p0.PRE_MARKET || p0Var == nel.p0.NONE;
    }

    public final FixedTabsDelegate.Model b(eel.c cVar, List chartPeriods, Integer num) {
        Intrinsics.checkNotNullParameter(chartPeriods, "chartPeriods");
        return new FixedTabsDelegate.Model("CHART_TABS_ID", l4h.d.c(chartPeriods), cVar != null ? cVar.getId() : null, ni.WIDGET, null, num, 0, R$attr.uikit_dp0, 3488);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List c(com.revolut.data.model.Data r44, com.revolut.core.ui_kit.delegates.TrendViewDelegate.a r45, eel.c r46, eel.i r47, com.revolut.data.model.Data r48, nel.n r49, com.revolut.data.model.Data r50, java.util.List r51, com.revolut.data.model.Data r52, com.revolut.data.model.Data r53, boolean r54, boolean r55, boolean r56, boolean r57, eel.d r58) {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4h.d.c(com.revolut.data.model.Data, com.revolut.core.ui_kit.delegates.TrendViewDelegate$a, eel.c, eel.i, com.revolut.data.model.Data, nel.n, com.revolut.data.model.Data, java.util.List, com.revolut.data.model.Data, com.revolut.data.model.Data, boolean, boolean, boolean, boolean, eel.d):java.util.List");
    }

    public final qv0.i e(eel.d dVar, nel.z zVar, Clause clause, Data data, boolean z, boolean z3) {
        Pair pair;
        if (z && dVar != eel.d.SCROLLABLE) {
            switch (zVar == null ? -1 : l4h.a.f192126a[zVar.ordinal()]) {
                case -1:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    pair = null;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    pair = new Pair(g.a.f122292a, new ml(this.f158448c.f192127a, Integer.valueOf(R$id.stock_details_header_advanced_chart_entry_point_tag)));
                    break;
            }
        } else {
            pair = null;
        }
        if (clause == null) {
            return new yl("HEADER_LOADING_ID", 0, 30);
        }
        q2 q2Var = new q2(2, clause, null, zVar != nel.z.STRUCTURED_NOTE);
        g.a aVar = pair != null ? (g.a) pair.f186385a : null;
        HeaderDelegate.Model model = new HeaderDelegate.Model("PRICE_HEADER", pair != null ? (ol) pair.f186386b : null, q2Var, data != null ? (TagViewData) iii.c.f(data, new i3k.h(18), new i2l.n0(7), new hnc.a(this, 16)) : null, null, null, null, new HeaderDelegate.a.b(16, false, false, false, pair != null), aVar, tx0.k0.LARGE, HeaderDelegate.Model.b.a.f52415a, 25536);
        if (z3) {
            model.f52411w = R$attr.uikit_dp16;
        }
        return model;
    }

    public final qv0.i h(eel.d dVar, eel.c cVar, List list, nel.z zVar, i4l.a aVar, eel.i iVar, boolean z, boolean z3) {
        ResourceImage resourceImage;
        ResourceImage resourceImage2;
        int i;
        lcVar = null;
        lc lcVar = null;
        switch (zVar == null ? -1 : c.f158443a[zVar.ordinal()]) {
            case -1:
            case 3:
            case 12:
            case 13:
            case 14:
            case 15:
                resourceImage = null;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                if (zVar == null || !io3.h.i(zVar) || iVar == null) {
                    int i2 = c.f158445c[aVar.ordinal()];
                    if (i2 == 1) {
                        i = R$drawable.uikit_icn_24_candlestick_chart;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R$drawable.uikit_icn_24_line_chart;
                    }
                } else {
                    int i3 = c.f158444b[iVar.ordinal()];
                    if (i3 == 1) {
                        i = R$drawable.uikit_icn_24_percent;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R$drawable.uikit_icn_24_dollars_and_shares;
                    }
                }
                resourceImage = new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                break;
        }
        int iIndexOf = list.indexOf(cVar);
        int i5 = z ? R$attr.uikit_dp16 : R$attr.uikit_dp0;
        if (dVar != eel.d.SCROLLABLE) {
            return new FixedTabsDelegate.Model("CHART_TABS_ID", l4h.d.c(list), cVar != null ? cVar.getId() : null, ni.WIDGET, resourceImage != null ? new FixedTabsDelegate.ExtraButton.Icon(resourceImage) : null, Integer.valueOf(iIndexOf), 0, i5, 3488);
        }
        String id10 = cVar.getId();
        List<eel.c> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (eel.c cVar2 : list2) {
            arrayList.add(new com.revolut.core.ui_kit.views.q(cVar2.getId(), new com.revolut.core.ui_kit.views.t(l4h.d.b(cVar2)), 58));
        }
        lc lcVar2 = resourceImage != null ? new lc(null, resourceImage, "SWITCH_CHART_TYPE_ACTION_ID") : null;
        if (z3) {
            switch (zVar != null ? l4h.a.f192126a[zVar.ordinal()] : -1) {
                case -1:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    resourceImage2 = null;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    resourceImage2 = this.f158448c.f192127a;
                    break;
            }
            if (resourceImage2 != null) {
                lcVar = new lc(null, resourceImage2, "OPEN_ADVANCED_CHART_ACTION_ID");
            }
        }
        lc[] elements = {lcVar2, lcVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new TabsDelegate.Model("CHART_TABS_ID", arrayList, id10, Integer.valueOf(iIndexOf), null, kotlin.collections.d.L(elements), 0, i5, null, 7888);
    }
}
