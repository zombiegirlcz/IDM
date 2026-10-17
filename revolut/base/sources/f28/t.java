package f28;

import aw0.ja;
import aw0.o9;
import aw0.y6;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.invest_feed.impl.widgets.analytics.screen.AnalyticsMethodScreen;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChart;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChartPoint;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChart;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.wealth.resources.R$string;
import d9.e1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements csh.e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f131482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kwg.l f131483c;
    public final gte.a d;
    public final ybl.l e;
    public final wif.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hbh.o f131484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f131485h;

    public t(e0 analyticsWidgetMapper, kwg.l complexAnalyticsInteractor, gte.a featureToggleInteractor, ybl.l tradingConfigInteractor, wif.a userFeaturesChecker, hbh.o investTransactionsWidgetProvider) {
        Intrinsics.checkNotNullParameter(analyticsWidgetMapper, "analyticsWidgetMapper");
        Intrinsics.checkNotNullParameter(complexAnalyticsInteractor, "complexAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(investTransactionsWidgetProvider, "investTransactionsWidgetProvider");
        this.f131482b = analyticsWidgetMapper;
        this.f131483c = complexAnalyticsInteractor;
        this.d = featureToggleInteractor;
        this.e = tradingConfigInteractor;
        this.f = userFeaturesChecker;
        this.f131484g = investTransactionsWidgetProvider;
        this.f131485h = yhm.j.b(new es.e(this, 14));
    }

    public static final BaseDraggableWidgetDelegate.Model i(t tVar, g gVar, final String id10) {
        final e0 e0Var = tVar.f131482b;
        if (gVar instanceof e) {
            e eVar = (e) gVar;
            Data chartData = eVar.f131460b;
            final h0 timeframe = eVar.f131459a;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(chartData, "chartData");
            Intrinsics.checkNotNullParameter(timeframe, "timeframe");
            final int i = 0;
            return (BaseDraggableWidgetDelegate.Model) iii.c.f(chartData, new e2j.i(id10, 27), new b0(id10, 0), new Function3() { // from class: f28.c0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    BigDecimal bigDecimalMultiply;
                    Object next;
                    Clause textClause;
                    switch (i) {
                        case 0:
                            PerformanceChart chart = (PerformanceChart) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(chart, "chart");
                            List list = chart.f94993c;
                            PerformanceChartPoint performanceChartPoint = (PerformanceChartPoint) zhm.d0.o0(list);
                            if (performanceChartPoint == null || (bigDecimalMultiply = new BigDecimal(String.valueOf(performanceChartPoint.f94996c)).multiply(new BigDecimal(100))) == null) {
                                bigDecimalMultiply = BigDecimal.ZERO;
                            }
                            BigDecimal bigDecimal = bigDecimalMultiply;
                            Intrinsics.h(bigDecimal);
                            int i2 = 0;
                            boolean z = e1.G(bigDecimal) || e1.I(bigDecimal);
                            ja jaVar = new ja(new TextLocalisedClause(R$string.wealth_analytics_mode_performance, null, null, 14), xqi.a.c(bigDecimal, false, false, false, false, true, 71), e0.c(timeframe));
                            List list2 = list;
                            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                            for (Object obj5 : list2) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    zhm.v.s();
                                    throw null;
                                }
                                arrayList.add(new y6(e0.d(i2, list.size()), ((PerformanceChartPoint) obj5).f94996c));
                                i2 = i3;
                            }
                            return e0.b(e0Var, id10, "ANALYTICS_PERFORMANCE_WIDGET_LIST_ID", jaVar, z, arrayList, null, null, 96);
                        default:
                            TotalValueChart chart2 = (TotalValueChart) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(chart2, "chart");
                            List list3 = chart2.f95004c;
                            List list4 = list3;
                            zhm.q qVarK1 = zhm.d0.k1(list4);
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(qVarK1, 10));
                            Iterator it8 = qVarK1.iterator();
                            while (true) {
                                kotlin.jvm.internal.d dVar = (kotlin.jvm.internal.d) it8;
                                if (!((Iterator) dVar.f186416c).hasNext()) {
                                    Iterator it9 = list4.iterator();
                                    if (it9.hasNext()) {
                                        next = it9.next();
                                        if (it9.hasNext()) {
                                            dj0.d dVar2 = ((TotalValueChartPoint) next).f95006b;
                                            do {
                                                Object next2 = it9.next();
                                                dj0.d dVar3 = ((TotalValueChartPoint) next2).f95006b;
                                                dVar2.getClass();
                                                if (dVar2.compareTo(dVar3) < 0) {
                                                    next = next2;
                                                    dVar2 = dVar3;
                                                }
                                            } while (it9.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    TotalValueChartPoint totalValueChartPoint = (TotalValueChartPoint) next;
                                    MoneyClause moneyClause = totalValueChartPoint != null ? new MoneyClause(totalValueChartPoint.f95006b, new MoneyClause.Format.Shorts(false, 63), null, null, 12) : null;
                                    dj0.d dVar4 = chart2.e;
                                    boolean z3 = dVar4.f(dj0.d.e) || dVar4.k();
                                    TotalValueChartPoint totalValueChartPoint2 = (TotalValueChartPoint) zhm.d0.o0(list3);
                                    if (totalValueChartPoint2 != null) {
                                        textClause = new MoneyClause(totalValueChartPoint2.f95006b, new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12);
                                    } else {
                                        m70.a.c(t0.f186434a);
                                        textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                                    }
                                    return e0.b(e0Var, id10, "ANALYTICS_TOTAL_VALUE_WIDGET_LIST_ID", new ja(new TextLocalisedClause(R$string.wealth_analytics_mode_value_title, null, null, 14), textClause, e0.c(timeframe)), z3, arrayList2, null, moneyClause, 32);
                                }
                                arrayList2.add(new y6(e0.d(((IndexedValue) dVar.next()).f186391a, list3.size()), ((TotalValueChartPoint) r5.f186392b).f95006b.f115082a));
                            }
                            break;
                    }
                }
            });
        }
        if (gVar instanceof f) {
            f fVar = (f) gVar;
            Data chartData2 = fVar.f131462b;
            final h0 timeframe2 = fVar.f131461a;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(chartData2, "chartData");
            Intrinsics.checkNotNullParameter(timeframe2, "timeframe");
            final int i2 = 1;
            return (BaseDraggableWidgetDelegate.Model) iii.c.f(chartData2, new e2j.i(id10, 28), new b0(id10, 1), new Function3() { // from class: f28.c0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    BigDecimal bigDecimalMultiply;
                    Object next;
                    Clause textClause;
                    switch (i2) {
                        case 0:
                            PerformanceChart chart = (PerformanceChart) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(chart, "chart");
                            List list = chart.f94993c;
                            PerformanceChartPoint performanceChartPoint = (PerformanceChartPoint) zhm.d0.o0(list);
                            if (performanceChartPoint == null || (bigDecimalMultiply = new BigDecimal(String.valueOf(performanceChartPoint.f94996c)).multiply(new BigDecimal(100))) == null) {
                                bigDecimalMultiply = BigDecimal.ZERO;
                            }
                            BigDecimal bigDecimal = bigDecimalMultiply;
                            Intrinsics.h(bigDecimal);
                            int i22 = 0;
                            boolean z = e1.G(bigDecimal) || e1.I(bigDecimal);
                            ja jaVar = new ja(new TextLocalisedClause(R$string.wealth_analytics_mode_performance, null, null, 14), xqi.a.c(bigDecimal, false, false, false, false, true, 71), e0.c(timeframe2));
                            List list2 = list;
                            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                            for (Object obj5 : list2) {
                                int i3 = i22 + 1;
                                if (i22 < 0) {
                                    zhm.v.s();
                                    throw null;
                                }
                                arrayList.add(new y6(e0.d(i22, list.size()), ((PerformanceChartPoint) obj5).f94996c));
                                i22 = i3;
                            }
                            return e0.b(e0Var, id10, "ANALYTICS_PERFORMANCE_WIDGET_LIST_ID", jaVar, z, arrayList, null, null, 96);
                        default:
                            TotalValueChart chart2 = (TotalValueChart) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(chart2, "chart");
                            List list3 = chart2.f95004c;
                            List list4 = list3;
                            zhm.q qVarK1 = zhm.d0.k1(list4);
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(qVarK1, 10));
                            Iterator it8 = qVarK1.iterator();
                            while (true) {
                                kotlin.jvm.internal.d dVar = (kotlin.jvm.internal.d) it8;
                                if (!((Iterator) dVar.f186416c).hasNext()) {
                                    Iterator it9 = list4.iterator();
                                    if (it9.hasNext()) {
                                        next = it9.next();
                                        if (it9.hasNext()) {
                                            dj0.d dVar2 = ((TotalValueChartPoint) next).f95006b;
                                            do {
                                                Object next2 = it9.next();
                                                dj0.d dVar3 = ((TotalValueChartPoint) next2).f95006b;
                                                dVar2.getClass();
                                                if (dVar2.compareTo(dVar3) < 0) {
                                                    next = next2;
                                                    dVar2 = dVar3;
                                                }
                                            } while (it9.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    TotalValueChartPoint totalValueChartPoint = (TotalValueChartPoint) next;
                                    MoneyClause moneyClause = totalValueChartPoint != null ? new MoneyClause(totalValueChartPoint.f95006b, new MoneyClause.Format.Shorts(false, 63), null, null, 12) : null;
                                    dj0.d dVar4 = chart2.e;
                                    boolean z3 = dVar4.f(dj0.d.e) || dVar4.k();
                                    TotalValueChartPoint totalValueChartPoint2 = (TotalValueChartPoint) zhm.d0.o0(list3);
                                    if (totalValueChartPoint2 != null) {
                                        textClause = new MoneyClause(totalValueChartPoint2.f95006b, new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12);
                                    } else {
                                        m70.a.c(t0.f186434a);
                                        textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                                    }
                                    return e0.b(e0Var, id10, "ANALYTICS_TOTAL_VALUE_WIDGET_LIST_ID", new ja(new TextLocalisedClause(R$string.wealth_analytics_mode_value_title, null, null, 14), textClause, e0.c(timeframe2)), z3, arrayList2, null, moneyClause, 32);
                                }
                                arrayList2.add(new y6(e0.d(((IndexedValue) dVar.next()).f186391a, list3.size()), ((TotalValueChartPoint) r5.f186392b).f95006b.f115082a));
                            }
                            break;
                    }
                }
            });
        }
        if (!(gVar instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        y yVar = ((d) gVar).f131456a;
        if (yVar instanceof w) {
            Intrinsics.checkNotNullParameter(id10, "id");
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_analytics_mode_performance, null, null, 14);
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return e0Var.a(xqi.a.c(ZERO, false, false, true, false, false, LDSFile.EF_SOD_TAG), textLocalisedClause, id10);
        }
        if (!(yVar instanceof x)) {
            throw new NoWhenBranchMatchedException();
        }
        xi0.b.Companion.getClass();
        xi0.b currency = xi0.b.i;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        boolean z = false;
        return e0Var.a(new MoneyClause(new dj0.d(0L, currency), new MoneyClause.Format.Headers(null, null, null, false, false, 31), new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), z, z, 254), null, 8), new TextLocalisedClause(R$string.wealth_analytics_mode_value_title, null, null, 14), id10);
    }

    @Override // csh.e
    public final List a(String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.widget_pop_up_timeframe_option_title, null, null, 14);
        EnumEntries<h0> enumEntriesA = h0.a();
        ArrayList arrayList = new ArrayList(zhm.w.t(enumEntriesA, 10));
        for (h0 h0Var : enumEntriesA) {
            arrayList.add(new dsh.a(e0.c(h0Var), h0Var.b()));
        }
        return zhm.u.c(new dsh.b(widgetType, textLocalisedClause, arrayList, inputConfig.a("timeframe"), new dsh.q(inputConfig, 2)));
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "AnalyticsMedium")) {
            throw new IllegalArgumentException(j6.a.q("Invalid widgetType: ", str));
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return vkm.q.x(vkm.q.Q(mo3.a.g(ybl.l.d(this.e), null, null, 3), new dz6.n(null, this, 28)), continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return RowsWidgetDelegate.Model.Companion.b(RowsWidgetDelegate.Model.INSTANCE, id10, new TextLocalisedClause(R$string.wealth_invest_widget_analytics_header_title, null, null, 14), 1, null, 24);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        InvestWidgetContext widgetContext2 = (InvestWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return new ahd.y(vkm.q.Q(vkm.q.Q(mo3.a.g(ybl.l.d(this.e), null, null, 3), new dz6.n(null, this, 28)), new o((Continuation) null, this, config)), this, id10, 25);
    }

    @Override // csh.e
    public final dsh.j h(WidgetContext widgetContext, String widgetType, dsh.e inputConfig) {
        InvestWidgetContext widgetContext2 = (InvestWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        if (Intrinsics.f(widgetType, "AnalyticsMedium")) {
            return new dsh.j(new TextLocalisedClause(R$string.wealth_analytics_widget_action_select_method_title, null, null, 14), new dsh.n(new AnalyticsMethodScreen(Intrinsics.f(inputConfig.a("analyticsMethod"), "performance") ? h28.c.PERFORMANCE : h28.c.TOTAL), new dsh.q(inputConfig, 1)), 4);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.invest_feed.api.models.InvestWidgetContext r6, java.lang.String r7, java.lang.String r8, dsh.e r9, kotlin.coroutines.Continuation r10) {
        /*
            r5 = this;
            boolean r6 = r10 instanceof f28.l
            if (r6 == 0) goto L13
            r6 = r10
            f28.l r6 = (f28.l) r6
            int r0 = r6.f131473y
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f131473y = r0
            goto L1a
        L13:
            f28.l r6 = new f28.l
            gim.c r10 = (gim.c) r10
            r6.<init>(r5, r10)
        L1a:
            java.lang.Object r10 = r6.f131471w
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f131473y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            f28.t r6 = r6.v
            kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
            yhm.o.b(r10)
            return r10
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            f28.t r7 = r6.v
            java.lang.String r8 = r6.u
            yhm.o.b(r10)
            goto L54
        L40:
            yhm.o.b(r10)
            if (r9 != 0) goto L58
            r6.u = r7
            r6.v = r5
            r6.f131473y = r3
            java.lang.Object r10 = r5.b(r8, r6)
            if (r10 != r0) goto L52
            goto L94
        L52:
            r8 = r7
            r7 = r5
        L54:
            r9 = r10
            dsh.e r9 = (dsh.e) r9
            goto L5a
        L58:
            r8 = r7
            r7 = r5
        L5a:
            ybl.l r10 = r7.e
            akg.n r10 = ybl.l.d(r10)
            r1 = 3
            r3 = 0
            jhi.b r10 = mo3.a.g(r10, r3, r3, r1)
            dz6.n r1 = new dz6.n
            r4 = 28
            r1.<init>(r3, r7, r4)
            wkm.l r10 = vkm.q.Q(r10, r1)
            f28.o r1 = new f28.o
            r1.<init>(r3, r7, r9)
            wkm.l r7 = vkm.q.Q(r10, r1)
            amh.w r9 = new amh.w
            r10 = 9
            r9.<init>(r7, r10)
            ahd.y r7 = new ahd.y
            r10 = 24
            r7.<init>(r9, r5, r8, r10)
            r6.u = r3
            r6.v = r3
            r6.f131473y = r2
            java.lang.Object r6 = vkm.q.x(r7, r6)
            if (r6 != r0) goto L95
        L94:
            return r0
        L95:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f28.t.f(com.revolut.feature.invest_feed.api.models.InvestWidgetContext, java.lang.String, java.lang.String, dsh.e, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
