package o6f;

import aw0.cb;
import aw0.l1;
import aw0.o9;
import aw0.q2;
import aw0.r2;
import ch.qos.logback.core.net.SyslogConstants;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import do3.q;
import hw0.x;
import ip0.hm0;
import ip0.jm0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r10.w;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f222585b = yhm.j.b(new o23.b(19));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f222586a;

    public k(w chartMappersProvider) {
        Intrinsics.checkNotNullParameter(chartMappersProvider, "chartMappersProvider");
        this.f222586a = chartMappersProvider;
    }

    public static Clause a(a6f.f fVar, pdh.c cVar, Function1 function1) {
        if (fVar instanceof a6f.e) {
            return new TimeClause(((Number) function1.invoke(Integer.valueOf(((a6f.e) fVar).f1672a))).longValue(), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12);
        }
        if (!(fVar instanceof a6f.c)) {
            if (Intrinsics.f(fVar, a6f.d.f1671a)) {
                return hx7.a.G(cVar);
            }
            throw new NoWhenBranchMatchedException();
        }
        a6f.c cVar2 = (a6f.c) fVar;
        long jLongValue = ((Number) function1.invoke(Integer.valueOf(cVar2.f1669a))).longValue();
        q0 q0Var = q0.ONLY_DATE;
        return new CompositeClause(v.k(new TimeClause(jLongValue, new TimeClause.Format.Pretty(q0Var), null, null, 12), new TimeClause(((Number) function1.invoke(Integer.valueOf(cVar2.f1670b))).longValue(), new TimeClause.Format.Pretty(q0Var), null, null, 12)), new TextClause(" - ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static BigDecimal b(ArrayList arrayList, a6f.f fVar) {
        Pair pair;
        if (arrayList.size() < 2) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        int iJ = v.j(arrayList);
        if (iJ < 0) {
            pair = null;
        } else {
            Pair pairR = q.r(fVar);
            if (pairR == null) {
                pairR = new Pair(0, Integer.valueOf(iJ));
            }
            pair = new Pair(Integer.valueOf(kotlin.ranges.f.g(((Number) pairR.f186385a).intValue(), 0, iJ)), Integer.valueOf(kotlin.ranges.f.g(((Number) pairR.f186386b).intValue(), 0, iJ)));
        }
        if (pair == null) {
            BigDecimal ZERO2 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
            return ZERO2;
        }
        BigDecimal bigDecimalSubtract = ((p6f.a) arrayList.get(((Number) pair.f186386b).intValue())).f233256b.subtract(((p6f.a) arrayList.get(((Number) pair.f186385a).intValue())).f233256b);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalMultiply = bigDecimalSubtract.multiply(bigDecimalValueOf);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    public static p6f.b d(ArrayList arrayList, a6f.f fVar) {
        Pair pairR = q.r(fVar);
        int iIntValue = pairR != null ? ((Number) pairR.f186386b).intValue() : v.j(arrayList);
        int iJ = v.j(arrayList);
        if (iIntValue > iJ) {
            iIntValue = iJ;
        }
        return (p6f.b) d0.e0(iIntValue, arrayList);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        final a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f;
        pdh.c cVar = domainState.f222572a;
        Data data = domainState.f222574c;
        if (!z) {
            return new c(f0.f322471a, null);
        }
        aim.e eVarB = u.b();
        if (domainState.d) {
            final int i = 0;
            eVarB.addAll((List) iii.c.f(data, new o69.b(3), new o4a.a(8), new Function3(this) { // from class: o6f.g
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    p6f.b bVarD;
                    switch (i) {
                        case 0:
                            final p6f.g content = (p6f.g) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(content, "content");
                            boolean z3 = content instanceof p6f.d;
                            a aVar = domainState;
                            a6f.d dVar = a6f.d.f1671a;
                            if (z3) {
                                ArrayList arrayList = ((p6f.d) content).f233261a;
                                a6f.f fVar = aVar.f222573b;
                                PercentageClause percentageClause = new PercentageClause(k.b(arrayList, fVar), (PercentageClause.Format) null, (Style) null, 6);
                                final int i2 = 2;
                                return u.c(new HeaderDelegate.Model("LIST_ID_HEADER", null, Intrinsics.f(fVar, dVar) ? new q2(2, percentageClause, "ANIMATION_KEY_HEADER", true) : new r2(percentageClause, null), null, null, k.a(fVar, aVar.f222572a, new Function1() { // from class: o6f.f
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        long j2;
                                        int i3 = i2;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        switch (i3) {
                                            case 0:
                                                j2 = ((p6f.a) ((p6f.d) content).f233261a.get(iIntValue)).f233255a;
                                                break;
                                            case 1:
                                                j2 = ((p6f.b) ((p6f.f) content).e.get(iIntValue)).f233258a;
                                                break;
                                            case 2:
                                                j2 = ((p6f.a) ((p6f.d) content).f233261a.get(iIntValue)).f233255a;
                                                break;
                                            default:
                                                j2 = ((p6f.b) ((p6f.f) content).e.get(iIntValue)).f233258a;
                                                break;
                                        }
                                        return Long.valueOf(j2);
                                    }
                                }), null, null, null, null, null, 129784));
                            }
                            if (!(content instanceof p6f.f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ArrayList arrayList2 = ((p6f.f) content).e;
                            a6f.f fVar2 = aVar.f222573b;
                            p6f.b bVarD2 = k.d(arrayList2, fVar2);
                            if (bVarD2 == null) {
                                return f0.f322471a;
                            }
                            final int i3 = 3;
                            return u.c(new HeaderDelegate.Model("LIST_ID_HEADER", null, fVar2.equals(dVar) ? new q2(2, new MoneyClause(bVarD2.f233259b, new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12), "ANIMATION_KEY_HEADER", true) : new r2(new MoneyClause(bVarD2.f233259b, new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12), null), null, null, k.a(fVar2, pdh.c.ALL, new Function1() { // from class: o6f.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    long j2;
                                    int i32 = i3;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    switch (i32) {
                                        case 0:
                                            j2 = ((p6f.a) ((p6f.d) content).f233261a.get(iIntValue)).f233255a;
                                            break;
                                        case 1:
                                            j2 = ((p6f.b) ((p6f.f) content).e.get(iIntValue)).f233258a;
                                            break;
                                        case 2:
                                            j2 = ((p6f.a) ((p6f.d) content).f233261a.get(iIntValue)).f233255a;
                                            break;
                                        default:
                                            j2 = ((p6f.b) ((p6f.f) content).e.get(iIntValue)).f233258a;
                                            break;
                                    }
                                    return Long.valueOf(j2);
                                }
                            }), null, null, null, null, null, 129784));
                        default:
                            final p6f.g content2 = (p6f.g) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(content2, "content");
                            boolean z4 = content2 instanceof p6f.d;
                            a aVar2 = domainState;
                            if (z4) {
                                final int i5 = 0;
                                return new y6f.a(new PercentageClause(k.b(((p6f.d) content2).f233261a, aVar2.f222573b), (PercentageClause.Format) null, (Style) null, 6), k.a(aVar2.f222573b, aVar2.f222572a, new Function1() { // from class: o6f.f
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        long j2;
                                        int i32 = i5;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        switch (i32) {
                                            case 0:
                                                j2 = ((p6f.a) ((p6f.d) content2).f233261a.get(iIntValue)).f233255a;
                                                break;
                                            case 1:
                                                j2 = ((p6f.b) ((p6f.f) content2).e.get(iIntValue)).f233258a;
                                                break;
                                            case 2:
                                                j2 = ((p6f.a) ((p6f.d) content2).f233261a.get(iIntValue)).f233255a;
                                                break;
                                            default:
                                                j2 = ((p6f.b) ((p6f.f) content2).e.get(iIntValue)).f233258a;
                                                break;
                                        }
                                        return Long.valueOf(j2);
                                    }
                                }));
                            }
                            if (!(content2 instanceof p6f.f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            a6f.f fVar3 = aVar2.f222573b;
                            if (Intrinsics.f(fVar3, a6f.d.f1671a) || (bVarD = k.d(((p6f.f) content2).e, fVar3)) == null) {
                                return null;
                            }
                            final int i6 = 1;
                            return new y6f.a(new MoneyClause(bVarD.f233259b, new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12), k.a(fVar3, pdh.c.ALL, new Function1() { // from class: o6f.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    long j2;
                                    int i32 = i6;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    switch (i32) {
                                        case 0:
                                            j2 = ((p6f.a) ((p6f.d) content2).f233261a.get(iIntValue)).f233255a;
                                            break;
                                        case 1:
                                            j2 = ((p6f.b) ((p6f.f) content2).e.get(iIntValue)).f233258a;
                                            break;
                                        case 2:
                                            j2 = ((p6f.a) ((p6f.d) content2).f233261a.get(iIntValue)).f233255a;
                                            break;
                                        default:
                                            j2 = ((p6f.b) ((p6f.f) content2).e.get(iIntValue)).f233258a;
                                            break;
                                    }
                                    return Long.valueOf(j2);
                                }
                            }));
                    }
                }
            }));
        }
        a6f.f fVar = domainState.f222573b;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        final boolean z3 = (fVar instanceof a6f.e) || (fVar instanceof a6f.c);
        final boolean z4 = domainState.e;
        Companion.getClass();
        Lazy lazy = f222585b;
        final int iY = kotlin.collections.d.Y((pdh.c[]) lazy.getValue(), cVar);
        eVarB.addAll((List) iii.c.f(data, new l2c.l(this, iY), new o4a.a(10), new Function3() { // from class: o6f.h
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                boolean z6;
                p6f.g chart = (p6f.g) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(chart, "chart");
                boolean zIsEmpty = chart.a().isEmpty();
                int i2 = iY;
                if (zIsEmpty) {
                    jm0 jm0Var = new jm0("PERFORMANCE_CHART_LIST_ID", null, f0.f322471a, false, null, null, i2, false, 230, null, false, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, -454);
                    int i3 = R$attr.uikit_dp0;
                    int i5 = R$attr.uikit_dp16;
                    yp0.b.p(jm0Var, i3, i3, i5, i5);
                    return u.c(jm0Var);
                }
                if (chart instanceof p6f.d) {
                    z6 = true;
                } else {
                    if (!(chart instanceof p6f.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z6 = false;
                }
                c6f.a aVarF = this.f222581a.f222586a.f(chart);
                ArrayList arrayListB = aVarF.b(chart);
                boolean z11 = z4;
                List listE = z11 ? aVarF.e(chart) : null;
                c6f.f fVar2 = z11 ? c6f.f.MAIN_AND_ADDITIONAL_CHARTS : c6f.f.MAIN_CHART_ONLY;
                int i6 = R$attr.uikit_dp0;
                x xVarC = null;
                cb cbVarA = aVarF.a(chart);
                if (!z3) {
                    xVarC = aVarF.c(chart);
                }
                jm0 jm0Var2 = new jm0("PERFORMANCE_CHART_LIST_ID", cbVarA, arrayListB, false, xVarC, null, i2, false, 230, null, false, z6, aVarF.d(chart, fVar2), listE, new l1.c(0), hm0.Thick, null, null, null, null, 0, 0, 0, 0, -63960);
                int i21 = R$attr.uikit_dp0;
                yp0.b.p(jm0Var2, i21, i21, i6, i6);
                return u.c(jm0Var2);
            }
        }));
        String strName = cVar.name();
        pdh.c[] cVarArr = (pdh.c[]) lazy.getValue();
        ArrayList arrayList = new ArrayList(cVarArr.length);
        for (pdh.c cVar2 : cVarArr) {
            String strName2 = cVar2.name();
            switch (j.f222584a[cVar2.ordinal()]) {
                case 1:
                    textLocalisedClause = new TextLocalisedClause(R$string.managed_portfolios_details_chart_tab_1d, null, null, 14);
                    break;
                case 2:
                    textLocalisedClause = new TextLocalisedClause(R$string.managed_portfolios_details_chart_tab_1w, null, null, 14);
                    break;
                case 3:
                    textLocalisedClause = new TextLocalisedClause(R$string.managed_portfolios_details_chart_tab_1m, null, null, 14);
                    break;
                case 4:
                    textLocalisedClause = new TextLocalisedClause(R$string.managed_portfolios_details_chart_tab_6m, null, null, 14);
                    break;
                case 5:
                    textLocalisedClause = new TextLocalisedClause(R$string.managed_portfolios_details_chart_tab_ytd, null, null, 14);
                    break;
                case 6:
                    textLocalisedClause = new TextLocalisedClause(R$string.managed_portfolios_details_chart_tab_1y, null, null, 14);
                    break;
                case 7:
                    textLocalisedClause = new TextLocalisedClause(R$string.managed_portfolios_details_chart_tab_5y, null, null, 14);
                    break;
                case 8:
                    textLocalisedClause = new TextLocalisedClause(R$string.managed_portfolios_details_chart_tab_all, null, null, 14);
                    break;
                default:
                    throw new IllegalArgumentException("");
            }
            arrayList.add(new FixedTabs.Item(strName2, textLocalisedClause, (AnalyticsContext) null, 12));
        }
        eVarB.add(new FixedTabsDelegate.Model("PERFORMANCE_CHART_TABS_LIST_ID", arrayList, strName, false, null, SyslogConstants.LOG_CLOCK));
        final int i2 = 1;
        return new c(u.a(eVarB), (y6f.a) iii.c.f(data, new o69.b(4), new o4a.a(9), new Function3(this) { // from class: o6f.g
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                p6f.b bVarD;
                switch (i2) {
                    case 0:
                        final p6f.g content = (p6f.g) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(content, "content");
                        boolean z310 = content instanceof p6f.d;
                        a aVar = domainState;
                        a6f.d dVar = a6f.d.f1671a;
                        if (z310) {
                            ArrayList arrayList2 = ((p6f.d) content).f233261a;
                            a6f.f fVar2 = aVar.f222573b;
                            PercentageClause percentageClause = new PercentageClause(k.b(arrayList2, fVar2), (PercentageClause.Format) null, (Style) null, 6);
                            final int i22 = 2;
                            return u.c(new HeaderDelegate.Model("LIST_ID_HEADER", null, Intrinsics.f(fVar2, dVar) ? new q2(2, percentageClause, "ANIMATION_KEY_HEADER", true) : new r2(percentageClause, null), null, null, k.a(fVar2, aVar.f222572a, new Function1() { // from class: o6f.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    long j2;
                                    int i32 = i22;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    switch (i32) {
                                        case 0:
                                            j2 = ((p6f.a) ((p6f.d) content).f233261a.get(iIntValue)).f233255a;
                                            break;
                                        case 1:
                                            j2 = ((p6f.b) ((p6f.f) content).e.get(iIntValue)).f233258a;
                                            break;
                                        case 2:
                                            j2 = ((p6f.a) ((p6f.d) content).f233261a.get(iIntValue)).f233255a;
                                            break;
                                        default:
                                            j2 = ((p6f.b) ((p6f.f) content).e.get(iIntValue)).f233258a;
                                            break;
                                    }
                                    return Long.valueOf(j2);
                                }
                            }), null, null, null, null, null, 129784));
                        }
                        if (!(content instanceof p6f.f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ArrayList arrayList22 = ((p6f.f) content).e;
                        a6f.f fVar22 = aVar.f222573b;
                        p6f.b bVarD2 = k.d(arrayList22, fVar22);
                        if (bVarD2 == null) {
                            return f0.f322471a;
                        }
                        final int i3 = 3;
                        return u.c(new HeaderDelegate.Model("LIST_ID_HEADER", null, fVar22.equals(dVar) ? new q2(2, new MoneyClause(bVarD2.f233259b, new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12), "ANIMATION_KEY_HEADER", true) : new r2(new MoneyClause(bVarD2.f233259b, new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12), null), null, null, k.a(fVar22, pdh.c.ALL, new Function1() { // from class: o6f.f
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                long j2;
                                int i32 = i3;
                                int iIntValue = ((Integer) obj5).intValue();
                                switch (i32) {
                                    case 0:
                                        j2 = ((p6f.a) ((p6f.d) content).f233261a.get(iIntValue)).f233255a;
                                        break;
                                    case 1:
                                        j2 = ((p6f.b) ((p6f.f) content).e.get(iIntValue)).f233258a;
                                        break;
                                    case 2:
                                        j2 = ((p6f.a) ((p6f.d) content).f233261a.get(iIntValue)).f233255a;
                                        break;
                                    default:
                                        j2 = ((p6f.b) ((p6f.f) content).e.get(iIntValue)).f233258a;
                                        break;
                                }
                                return Long.valueOf(j2);
                            }
                        }), null, null, null, null, null, 129784));
                    default:
                        final p6f.g content2 = (p6f.g) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(content2, "content");
                        boolean z49 = content2 instanceof p6f.d;
                        a aVar2 = domainState;
                        if (z49) {
                            final int i5 = 0;
                            return new y6f.a(new PercentageClause(k.b(((p6f.d) content2).f233261a, aVar2.f222573b), (PercentageClause.Format) null, (Style) null, 6), k.a(aVar2.f222573b, aVar2.f222572a, new Function1() { // from class: o6f.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    long j2;
                                    int i32 = i5;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    switch (i32) {
                                        case 0:
                                            j2 = ((p6f.a) ((p6f.d) content2).f233261a.get(iIntValue)).f233255a;
                                            break;
                                        case 1:
                                            j2 = ((p6f.b) ((p6f.f) content2).e.get(iIntValue)).f233258a;
                                            break;
                                        case 2:
                                            j2 = ((p6f.a) ((p6f.d) content2).f233261a.get(iIntValue)).f233255a;
                                            break;
                                        default:
                                            j2 = ((p6f.b) ((p6f.f) content2).e.get(iIntValue)).f233258a;
                                            break;
                                    }
                                    return Long.valueOf(j2);
                                }
                            }));
                        }
                        if (!(content2 instanceof p6f.f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a6f.f fVar3 = aVar2.f222573b;
                        if (Intrinsics.f(fVar3, a6f.d.f1671a) || (bVarD = k.d(((p6f.f) content2).e, fVar3)) == null) {
                            return null;
                        }
                        final int i6 = 1;
                        return new y6f.a(new MoneyClause(bVarD.f233259b, new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12), k.a(fVar3, pdh.c.ALL, new Function1() { // from class: o6f.f
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                long j2;
                                int i32 = i6;
                                int iIntValue = ((Integer) obj5).intValue();
                                switch (i32) {
                                    case 0:
                                        j2 = ((p6f.a) ((p6f.d) content2).f233261a.get(iIntValue)).f233255a;
                                        break;
                                    case 1:
                                        j2 = ((p6f.b) ((p6f.f) content2).e.get(iIntValue)).f233258a;
                                        break;
                                    case 2:
                                        j2 = ((p6f.a) ((p6f.d) content2).f233261a.get(iIntValue)).f233255a;
                                        break;
                                    default:
                                        j2 = ((p6f.b) ((p6f.f) content2).e.get(iIntValue)).f233258a;
                                        break;
                                }
                                return Long.valueOf(j2);
                            }
                        }));
                }
            }
        }));
    }
}
