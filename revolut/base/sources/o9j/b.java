package o9j;

import aw0.bb;
import aw0.cb;
import aw0.l1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.hi;
import com.revolut.core.ui_kit.delegates.mi;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature_chart_mapping_impl.R$plurals;
import com.revolut.feature_chart_mapping_impl.R$string;
import hw0.x;
import hw0.z;
import ip0.hm0;
import ip0.jm0;
import iw0.j;
import iw0.k;
import iw0.l;
import iw0.m;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import oc.c;
import org.jetbrains.annotations.NotNull;
import qta.d;
import qta.f;
import qv0.i;
import tof.a3;
import tof.o3;
import tof.p0;
import u9j.e;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public interface b {

    @NotNull
    public static final a Companion = a.f223287a;

    /* JADX WARN: Multi-variable type inference failed */
    static List a(b bVar, xi0.b bVar2, f fVar, TrendViewDelegate.a trendViewState, Data ratesPlotData, List transactions, Double d, xi0.b pocketCurrency, xi0.b bVar3, Integer num, p9j.b bVar4, TextLocalisedClause textLocalisedClause, int i) {
        String str;
        xi0.b bVar5;
        Integer num2;
        p9j.b bVar6;
        TextLocalisedClause textLocalisedClause2;
        Lazy lazy;
        Integer num3;
        jm0 jm0Var;
        List plot;
        String str2;
        d dVar;
        String str3;
        float f;
        ArrayList arrayList;
        cb colorScheme;
        xi0.b bVar7;
        x xVar;
        z zVar;
        Object next;
        Object next2;
        xi0.b bVar8;
        Map map;
        Iterator it8;
        float f4;
        float f5;
        xi0.b bVar9;
        int i2;
        nwh.b bVar10;
        String str4;
        char c2;
        m mVar;
        xi0.b bVar11;
        float f6;
        xi0.b bVar12;
        int i3;
        nwh.b bVar13;
        List list;
        String str5;
        List listC;
        j jVar;
        f chartPeriod = fVar;
        boolean z = (i & 64) != 0;
        xi0.b bVar14 = (i & 256) != 0 ? null : bVar3;
        Integer num4 = (i & 512) != 0 ? null : num;
        p9j.b chartTabStyle = (i & 1024) != 0 ? p9j.b.FIXED : bVar4;
        TextLocalisedClause textLocalisedClause3 = (i & 2048) != 0 ? null : textLocalisedClause;
        e eVar = (e) bVar;
        nwh.b bVar15 = eVar.f278491b;
        Lazy lazy2 = eVar.f;
        u9j.a aVar = eVar.f278490a;
        Intrinsics.checkNotNullParameter(chartPeriod, "selectedChartPeriod");
        Intrinsics.checkNotNullParameter(trendViewState, "trendViewState");
        Intrinsics.checkNotNullParameter(ratesPlotData, "ratesPlotData");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        boolean z3 = z;
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        Intrinsics.checkNotNullParameter(chartTabStyle, "chartTabStyle");
        xi0.b bVarG = bVar2 != null ? eVar.f278492c.g(bVar2) : null;
        d dVar2 = (d) ratesPlotData.getContent();
        if (dVar2 == null || dVar2.e.isEmpty()) {
            dVar2 = null;
        }
        if (dVar2 == null || bVarG == null) {
            str = "elements";
            bVar5 = bVar14;
            num2 = num4;
            bVar6 = chartTabStyle;
            textLocalisedClause2 = textLocalisedClause3;
            lazy = lazy2;
            num3 = null;
            jm0Var = null;
        } else {
            if (d != null) {
                num2 = num4;
                bVar6 = chartTabStyle;
                plot = e.f(dVar2, d.doubleValue());
            } else {
                num2 = num4;
                bVar6 = chartTabStyle;
                plot = dVar2.e;
            }
            if (plot.isEmpty() || chartPeriod != f.DAY) {
                str2 = "pocketCurrency";
                dVar = dVar2;
                str3 = "elements";
                textLocalisedClause2 = textLocalisedClause3;
                lazy = lazy2;
                f = 1.0f;
            } else {
                textLocalisedClause2 = textLocalisedClause3;
                long jLongValue = ((Number) ((Pair) d0.b0(plot)).f186385a).longValue();
                lazy = lazy2;
                str2 = "pocketCurrency";
                long jLongValue2 = ((Number) ((Pair) d0.m0(plot)).f186385a).longValue();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                dVar = dVar2;
                str3 = "elements";
                LocalDate localDatePlusDays = ((l80.f) eVar.d).e().plusDays(1L);
                Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
                long seconds = timeUnit.toSeconds(c.E(localDatePlusDays, g0m.a.f139502a));
                float f32 = jLongValue2;
                float f35 = jLongValue;
                f = (f32 - f35) / (seconds - f35);
            }
            Intrinsics.checkNotNullParameter(plot, "plot");
            Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
            Intrinsics.checkNotNullParameter(transactions, "transactions");
            List list2 = plot.size() > 1 ? plot : null;
            if (list2 != null) {
                ArrayList arrayListD = nwh.b.d(list2);
                Map mapA = nwh.b.a(arrayListD, transactions);
                float fLongValue = ((Number) ((Pair) d0.m0(arrayListD)).f186385a).longValue() - ((Number) ((Pair) d0.b0(arrayListD)).f186385a).longValue();
                float size = (fLongValue / (arrayListD.size() - 1)) * f;
                char c3 = '\n';
                ArrayList arrayList2 = new ArrayList(w.t(arrayListD, 10));
                Iterator it9 = arrayListD.iterator();
                int i5 = 0;
                while (it9.hasNext()) {
                    Object next3 = it9.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        v.s();
                        throw null;
                    }
                    Pair pair = (Pair) next3;
                    float f36 = (i5 * size) / fLongValue;
                    List list3 = (List) mapA.get(pair);
                    if (list3 == null) {
                        bVar8 = bVarG;
                        map = mapA;
                        it8 = it9;
                        f4 = fLongValue;
                        f5 = size;
                        bVar9 = bVar14;
                        i2 = i6;
                        bVar10 = bVar15;
                        str4 = str3;
                        c2 = c3;
                        mVar = null;
                    } else if (list3.isEmpty()) {
                        bVar8 = bVarG;
                        map = mapA;
                        it8 = it9;
                        f4 = fLongValue;
                        f5 = size;
                        bVar9 = bVar14;
                        i2 = i6;
                        bVar10 = bVar15;
                        str4 = str3;
                        mVar = null;
                        c2 = c3;
                    } else {
                        map = mapA;
                        List listV0 = d0.V0(list3, 3);
                        it8 = it9;
                        f4 = fLongValue;
                        ArrayList arrayList3 = new ArrayList(w.t(listV0, 10));
                        Iterator it10 = listV0.iterator();
                        int i21 = 0;
                        while (it10.hasNext()) {
                            Object next4 = it10.next();
                            int i22 = i21 + 1;
                            if (i21 < 0) {
                                v.s();
                                throw null;
                            }
                            a3 a3Var = (a3) next4;
                            Iterator it11 = it10;
                            if (i21 != 2) {
                                p0 p0Var = a3Var.z;
                                o3 o3Var = a3Var.J;
                                f6 = size;
                                dj0.d dVar3 = a3Var.k;
                                i3 = i6;
                                int i32 = p0Var == p0.BUY ? R$string.chart_tooltip_buy_action_title : R$string.chart_tooltip_sell_action_title;
                                list = list3;
                                dj0.d dVar4 = a3Var.f272599l;
                                bVar12 = bVar14;
                                bVar11 = bVarG;
                                dj0.d dVarA = ((!Intrinsics.f(dVar3.f115083b, dVar4.f115083b) || dVar4.f115082a == 0) ? dVar3 : pyd.c.H(dVar3, dVar4)).a();
                                ScaleMode.CryptoHoldingFormat cryptoHoldingFormat = ScaleMode.CryptoHoldingFormat.f51439a;
                                l lVar = new l(new TextLocalisedClause(i32, u.c(new MoneyClause(dVarA, new MoneyClause.Format.Defaults(null, cryptoHoldingFormat, false, false, 13), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8));
                                if (o3Var == null) {
                                    bVar13 = bVar15;
                                    jVar = null;
                                } else {
                                    bVar13 = bVar15;
                                    jVar = new j(new TextLocalisedClause(R$string.chart_tooltip_price_row_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10), new RateClause(new BigDecimal(String.valueOf(a3Var.f272619w)), o3Var.f272965a.f115083b, new RateClause.Format.Default(dVar3.f115083b, true), null));
                                }
                                k[] kVarArr = {lVar, jVar, o3Var == null ? null : new j(new TextLocalisedClause(R$string.chart_tooltip_total_row_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10), new MoneyClause(o3Var.f272965a.a(), new MoneyClause.Format.Defaults(null, cryptoHoldingFormat, false, false, 13), null, null, 12))};
                                str5 = str3;
                                Intrinsics.checkNotNullParameter(kVarArr, str5);
                                listC = kotlin.collections.d.L(kVarArr);
                            } else {
                                bVar11 = bVarG;
                                f6 = size;
                                bVar12 = bVar14;
                                i3 = i6;
                                bVar13 = bVar15;
                                list = list3;
                                str5 = str3;
                                int size2 = list.size() - i21;
                                listC = u.c(new l(new TextLocalisedQuantityClause(R$plurals.chart_tooltip_others_title, Integer.valueOf(size2), u.c(Integer.valueOf(size2)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8)));
                            }
                            arrayList3.add(listC);
                            str3 = str5;
                            i21 = i22;
                            it10 = it11;
                            size = f6;
                            i6 = i3;
                            bVar15 = bVar13;
                            list3 = list;
                            bVar14 = bVar12;
                            bVarG = bVar11;
                        }
                        bVar8 = bVarG;
                        f5 = size;
                        bVar9 = bVar14;
                        i2 = i6;
                        bVar10 = bVar15;
                        str4 = str3;
                        c2 = '\n';
                        mVar = new m(nwh.b.f(list3), w.u(arrayList3), null);
                    }
                    chartPeriod = fVar;
                    arrayList2.add(nwh.b.e(pair, chartPeriod, f36, mVar));
                    mapA = map;
                    str3 = str4;
                    c3 = c2;
                    it9 = it8;
                    fLongValue = f4;
                    size = f5;
                    i5 = i2;
                    bVar15 = bVar10;
                    bVar14 = bVar9;
                    bVarG = bVar8;
                }
                num3 = null;
                arrayList = arrayList2;
            } else {
                num3 = null;
                arrayList = null;
            }
            xi0.b bVar16 = bVarG;
            bVar5 = bVar14;
            str = str3;
            if (bVar15.c(plot)) {
                cb.Companion.getClass();
                colorScheme = bb.d();
            } else {
                cb.Companion.getClass();
                colorScheme = bb.b();
            }
            int iY = kotlin.collections.d.Y((f[]) lazy.getValue(), chartPeriod);
            d dVar5 = dVar;
            double d5 = dVar5.f249051a;
            xi0.b bVar17 = dVar5.f249052b;
            boolean z4 = chartPeriod == f.DAY;
            boolean z6 = (trendViewState instanceof mi) || (trendViewState instanceof hi);
            u9j.d dVar6 = (u9j.d) aVar;
            dVar6.getClass();
            Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
            Intrinsics.checkNotNullParameter(bVar17, str2);
            if (z6) {
                bVar7 = bVar16;
                xVar = num3;
            } else {
                float f37 = (float) d5;
                bVar7 = bVar16;
                xVar = new x(f37, BitmapDescriptorFactory.HUE_RED, u9j.d.b(f37, bVar7, bVar17), null, null, hw0.b.START, false, false, null, YearClass.CLASS_2010);
            }
            if (arrayList != null) {
                Iterator it12 = arrayList.iterator();
                if (it12.hasNext()) {
                    next = it12.next();
                    if (it12.hasNext()) {
                        float f41 = ((hw0.k) next).f156007b;
                        do {
                            Object next5 = it12.next();
                            float f42 = ((hw0.k) next5).f156007b;
                            if (Float.compare(f41, f42) < 0) {
                                next = next5;
                                f41 = f42;
                            }
                        } while (it12.hasNext());
                    }
                } else {
                    next = num3;
                }
                hw0.k kVar = (hw0.k) next;
                float f57 = BitmapDescriptorFactory.HUE_RED;
                float f69 = kVar != null ? kVar.f156007b : 0.0f;
                Iterator it13 = arrayList.iterator();
                if (it13.hasNext()) {
                    next2 = it13.next();
                    if (it13.hasNext()) {
                        float f75 = ((hw0.k) next2).f156007b;
                        do {
                            Object next6 = it13.next();
                            float f77 = ((hw0.k) next6).f156007b;
                            if (Float.compare(f75, f77) > 0) {
                                next2 = next6;
                                f75 = f77;
                            }
                        } while (it13.hasNext());
                    }
                } else {
                    next2 = num3;
                }
                hw0.k kVar2 = (hw0.k) next2;
                if (kVar2 != null) {
                    f57 = kVar2.f156007b;
                }
                zVar = new z(new hw0.a(f57, u9j.d.b(f57, bVar7, bVar17)), new hw0.a(f69, u9j.d.b(f69, bVar7, bVar17)), ms0.v.WhiteTransparentBackground, false, true);
            } else {
                zVar = num3;
            }
            jm0Var = new jm0("ASSET_DETAILS_CHART_LIST_ID", colorScheme, arrayList, z4, xVar, null, iY, false, 230, null, false, true, zVar, null, new l1.c(0), hm0.Thick, null, null, null, null, 0, R$attr.uikit_dp8, 0, 0, -268491232);
            int i33 = R$attr.uikit_dp0;
            int i43 = dVar6.f278489c;
            yp0.b.p(jm0Var, i33, i33, i43, i43);
        }
        if (jm0Var == null) {
            jm0Var = (jm0) ((u9j.d) aVar).d.getValue();
        }
        u9j.d dVar7 = (u9j.d) aVar;
        i[] iVarArr = {jm0Var, dVar7.e(chartPeriod, (f[]) lazy.getValue(), z3 ? Integer.valueOf(R$drawable.uikit_icn_24_candlestick_chart) : num3, num2, bVar6), dVar7.g(textLocalisedClause2, pocketCurrency, bVar5)};
        Intrinsics.checkNotNullParameter(iVarArr, str);
        return kotlin.collections.d.L(iVarArr);
    }
}
