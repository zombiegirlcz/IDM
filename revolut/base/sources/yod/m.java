package yod;

import aw0.f2;
import aw0.l2;
import aw0.o9;
import aw0.y1;
import com.revolut.core.ui_kit.delegates.widgets.ChartWithDetailsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ComparisonLineChartWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.c0;
import com.revolut.core.ui_kit.delegates.widgets.j0;
import com.revolut.core.ui_kit.delegates.widgets.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.tracking.TrackableAction;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.api.R$string;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import op0.y0;
import op0.z0;
import org.jetbrains.annotations.NotNull;
import qv0.q;
import xod.x;
import zhm.d0;
import zhm.v;
import zhm.w;
import zod.k0;
import zod.l0;
import zod.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f315663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bsd.h f315664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f315665c;
    public final k d;
    public final gte.a e;

    public m(f linearGaugeSegmentsMapper, bsd.h totalWealthBalanceChartMapper, l80.e dateProvider, ipd.h performanceMapper, x chartWithDetailsSubtitleMapper, k totalWealthWidgetDetailsMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(linearGaugeSegmentsMapper, "linearGaugeSegmentsMapper");
        Intrinsics.checkNotNullParameter(totalWealthBalanceChartMapper, "totalWealthBalanceChartMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(performanceMapper, "performanceMapper");
        Intrinsics.checkNotNullParameter(chartWithDetailsSubtitleMapper, "chartWithDetailsSubtitleMapper");
        Intrinsics.checkNotNullParameter(totalWealthWidgetDetailsMapper, "totalWealthWidgetDetailsMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f315663a = linearGaugeSegmentsMapper;
        this.f315664b = totalWealthBalanceChartMapper;
        this.f315665c = dateProvider;
        this.d = totalWealthWidgetDetailsMapper;
        this.e = featureToggleInteractor;
    }

    public static Clause c(TextLocalisedClause textLocalisedClause, m0 m0Var, boolean z) {
        Clause textClause;
        if (!z) {
            return textLocalisedClause;
        }
        Clause[] clauseArr = new Clause[2];
        if (m0Var.equals(l0.f324007a)) {
            textClause = new TextLocalisedClause(R$string.analytics_dashboard_account_personal, null, null, 14);
        } else {
            if (!(m0Var instanceof k0)) {
                throw new NoWhenBranchMatchedException();
            }
            textClause = new TextClause(((k0) m0Var).f324004b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        clauseArr[0] = textClause;
        clauseArr[1] = textLocalisedClause;
        return v1.c.f(v.k(clauseArr), null);
    }

    public static String d(String str, String str2) {
        String strO;
        return (str2 == null || (strO = com.google.android.gms.internal.mlkit_vision_face.a.o(str, "_", str2)) == null) ? str : strO;
    }

    public final q a(String str, Clause clause, TextLocalisedClause textLocalisedClause, dj0.d dVar, List list, amd.a aVar, boolean z, List totalWealthGroups, xi0.b baseCurrency, zod.l lVar) {
        ArrayList arrayListF0;
        AnalyticsFeatureApi$Toggles.AnalyticsRevamp analyticsRevamp = AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c;
        gte.a aVar2 = this.e;
        if (((jte.d) aVar2).c(analyticsRevamp) && list.isEmpty() && dVar.k()) {
            ChartWithDetailsWidgetDelegate.Model model = new ChartWithDetailsWidgetDelegate.Model(str, clause, new MoneyClause(otd.f.a(dVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, y.f55555a, op0.q.MEDIUM, lVar, 256);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return model;
        }
        LocalDate localDateE = ((l80.f) this.f315665c).e();
        long j2 = dVar.f115082a;
        xi0.b bVar = dVar.f115083b;
        ArrayList arrayListF02 = d0.F0(new nzi.g(j2, localDateE), list);
        y1 y1VarA = this.f315664b.a(arrayListF02, aVar, dVar, false);
        long j3 = ((nzi.g) d0.b0(arrayListF02)).f221072b;
        if (!((jte.d) aVar2).c(analyticsRevamp)) {
            ComparisonLineChartWidgetDelegate.Model model2 = new ComparisonLineChartWidgetDelegate.Model(str, new z0(clause, y0.SINGLE_LINE), new MoneyClause(otd.f.a(dVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), ipd.h.a(dVar, new dj0.d(j3, bVar), z), y1VarA, l2.GREATER_VALUE_GREEN, f2.FIRST_OF_CURRENT_LINE, op0.q.MEDIUM, lVar, new TrackableAction.Custom(textLocalisedClause), 128);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            return model2;
        }
        MoneyClause moneyClause = new MoneyClause(otd.f.a(dVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        dj0.d dVarH = pyd.c.H(dVar, new dj0.d(j3, bVar));
        com.revolut.core.ui_kit.delegates.widgets.d0 d0Var = null;
        j0 j0VarA = x.a(otd.f.c(3, null, null, otd.f.a(dVarH.a())), dVarH, l2.GREATER_VALUE_GREEN, z ? xod.v.ARROW_UP_ON_INCREASE : xod.v.ARROW_DOWN_ON_INCREASE);
        Intrinsics.checkNotNullParameter(totalWealthGroups, "totalWealthGroups");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        List listB = k.b(totalWealthGroups);
        if (!listB.isEmpty()) {
            int size = listB.size();
            k kVar = this.d;
            if (size <= 3) {
                List list2 = listB;
                arrayListF0 = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    i iVarA = kVar.a((h) it8.next());
                    arrayListF0.add(new c0(iVarA.f315661a, iVarA.f315662b));
                }
            } else {
                List list3 = listB;
                List listV0 = d0.V0(list3, 2);
                ArrayList arrayList = new ArrayList(w.t(listV0, 10));
                Iterator it9 = listV0.iterator();
                while (it9.hasNext()) {
                    i iVarA2 = kVar.a((h) it9.next());
                    arrayList.add(new c0(iVarA2.f315661a, iVarA2.f315662b));
                }
                i iVarC = k.c(d0.V(list3, 2), baseCurrency);
                arrayListF0 = d0.F0(new c0(iVarC.f315661a, iVarC.f315662b), arrayList);
            }
            d0Var = new com.revolut.core.ui_kit.delegates.widgets.d0((c0) d0.b0(arrayListF0), (c0) d0.e0(1, arrayListF0), (c0) d0.e0(2, arrayListF0));
        }
        ChartWithDetailsWidgetDelegate.Model model3 = new ChartWithDetailsWidgetDelegate.Model(str, clause, moneyClause, j0VarA, d0Var, new com.revolut.core.ui_kit.delegates.widgets.x(y1VarA, l2.GREATER_VALUE_GREEN, f2.FIRST_OF_CURRENT_LINE), op0.q.MEDIUM, lVar, 256);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        return model3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0383  */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v20, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qv0.q b(java.lang.String r24, com.revolut.core.ui_kit.models.Clause r25, dj0.d r26, java.util.List r27, xi0.b r28, yld.g r29, com.revolut.feature.spending_analytics.api.models.NetWorthAccount r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yod.m.b(java.lang.String, com.revolut.core.ui_kit.models.Clause, dj0.d, java.util.List, xi0.b, yld.g, com.revolut.feature.spending_analytics.api.models.NetWorthAccount, boolean):qv0.q");
    }
}
