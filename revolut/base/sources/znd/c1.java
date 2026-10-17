package znd;

import aw0.k7;
import aw0.o9;
import aw0.w4;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.api.R$plurals;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.api.models.GroupingExtraData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsContract$InputData;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.pb0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c1 implements cli.n {

    @NotNull
    public static final a1 Companion = new a1();
    public static final MoneyClause.Format.Defaults o = new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Set f323730p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cmd.a f323731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lnd.x f323732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lnd.t f323733c;
    public final lnd.k0 d;
    public final cod.i e;
    public final cod.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lnd.o0 f323734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cod.b f323735h;
    public final pyb.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lnd.z f323736j;
    public final AnalyticsDetailsContract$InputData k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f323737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w4 f323738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w4 f323739n;

    static {
        yld.d[] elements = {yld.d.NET_BALANCE, yld.d.EARNINGS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f323730p = kotlin.collections.d.y0(elements);
    }

    public c1(cmd.a categoryGroupMapper, lnd.x analyticsFilterMapper, lnd.t analyticsChartMapper, lnd.k0 analyticsTimeSwitcherMapper, lnd.t0 proCategoryGroupMapper, cod.i toolbarMapper, cod.f performanceMapper, lnd.o0 categoriesSectionMapper, cod.b analyticsActionsMapper, pyb.h revPointsOptInPlacementsMapper, lnd.z analyticsInlineTransactionMapper, wnd.a accountsSelectionTitleMapper, AnalyticsDetailsContract$InputData inputData, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(categoryGroupMapper, "categoryGroupMapper");
        Intrinsics.checkNotNullParameter(analyticsFilterMapper, "analyticsFilterMapper");
        Intrinsics.checkNotNullParameter(analyticsChartMapper, "analyticsChartMapper");
        Intrinsics.checkNotNullParameter(analyticsTimeSwitcherMapper, "analyticsTimeSwitcherMapper");
        Intrinsics.checkNotNullParameter(proCategoryGroupMapper, "proCategoryGroupMapper");
        Intrinsics.checkNotNullParameter(toolbarMapper, "toolbarMapper");
        Intrinsics.checkNotNullParameter(performanceMapper, "performanceMapper");
        Intrinsics.checkNotNullParameter(categoriesSectionMapper, "categoriesSectionMapper");
        Intrinsics.checkNotNullParameter(analyticsActionsMapper, "analyticsActionsMapper");
        Intrinsics.checkNotNullParameter(revPointsOptInPlacementsMapper, "revPointsOptInPlacementsMapper");
        Intrinsics.checkNotNullParameter(analyticsInlineTransactionMapper, "analyticsInlineTransactionMapper");
        Intrinsics.checkNotNullParameter(accountsSelectionTitleMapper, "accountsSelectionTitleMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f323731a = categoryGroupMapper;
        this.f323732b = analyticsFilterMapper;
        this.f323733c = analyticsChartMapper;
        this.d = analyticsTimeSwitcherMapper;
        this.e = toolbarMapper;
        this.f = performanceMapper;
        this.f323734g = categoriesSectionMapper;
        this.f323735h = analyticsActionsMapper;
        this.i = revPointsOptInPlacementsMapper;
        this.f323736j = analyticsInlineTransactionMapper;
        this.k = inputData;
        this.f323737l = ((jte.d) featureToggleInteractor).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c);
        this.f323738m = new w4(new znc.j(12));
        this.f323739n = new w4(new znc.j(13));
    }

    public static he3.j b(ind.e eVar, String str, fnd.a aVar) {
        List list;
        Object obj2 = null;
        ind.c cVar = eVar instanceof ind.c ? (ind.c) eVar : null;
        if (cVar == null) {
            return null;
        }
        if (aVar != null) {
            ind.b0 b0Var = cVar.e;
            if (b0Var instanceof ind.z) {
                int i = b1.f323725b[aVar.ordinal()];
                if (i == 1) {
                    list = ((ind.z) b0Var).f162835a;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    list = ((ind.z) b0Var).f162836b;
                }
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (Intrinsics.f(((he3.j) next).f151563a, str)) {
                        obj2 = next;
                        break;
                    }
                }
                return (he3.j) obj2;
            }
        }
        Iterator it9 = cVar.b(true).iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Object next2 = it9.next();
            if (Intrinsics.f(((he3.j) next2).f151563a, str)) {
                obj2 = next2;
                break;
            }
        }
        return (he3.j) obj2;
    }

    public static he3.j d(ind.g gVar, String str, fnd.a aVar, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval) {
        Object next;
        Object next2;
        if (str != null) {
            Iterator it8 = gVar.f162804a.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((ind.e) next).a(), gVar.f162805b.f200981b)) {
                    break;
                }
            }
            ind.e eVar = (ind.e) next;
            he3.j jVarB = eVar != null ? b(eVar, str, aVar) : null;
            if (jVarB != null) {
                return jVarB;
            }
            if (analyticsSpendingPeriod$Interval != null) {
                Iterator it9 = gVar.f162804a.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it9.next();
                    if (Intrinsics.f(((ind.e) next2).a(), analyticsSpendingPeriod$Interval)) {
                        break;
                    }
                }
                ind.e eVar2 = (ind.e) next2;
                if (eVar2 != null) {
                    return b(eVar2, str, aVar);
                }
            }
        }
        return null;
    }

    public static List g() {
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.analytics_main_no_transactions, null, null, 14);
        int i = R$attr.uikit_dp24;
        List listC = zhm.u.c(new RowDelegate.Model("EMPTY_STATE_ROW_ID", image24, textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, RowDelegate.Model.b.a.f53266a, null, null, null, null, null, null, null, i, i, 0, 0, 486522872));
        j(listC);
        return listC;
    }

    public static ArrayList h() {
        IntRange intRange = new IntRange(1, 3, 1);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(String.valueOf(it8.nextInt())));
        }
        j(arrayList);
        return arrayList;
    }

    public static void j(List list) {
        int i = R$attr.uikit_dp16;
        yp0.b.k(list, i, i, 0, 0, 28);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(ind.g r76, znd.a r77) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: znd.c1.a(ind.g, znd.a):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bd  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r15) {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: znd.c1.c(cli.j):cli.o");
    }

    public final boolean e() {
        yld.d dVar = this.k.f87547b;
        return dVar == yld.d.SPENDING || dVar == yld.d.INCOME;
    }

    public final Clause f(a aVar) {
        rnd.h hVar;
        if (aVar.f == null && aVar.f323718r == null && (hVar = aVar.f323722x) != null) {
            return wnd.a.b(this.k.f87546a, aVar.f323723y, hVar, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254));
        }
        return null;
    }

    public final AbstractList i(dj0.d dVar, c cVar, ind.g gVar, String str, GroupingExtraData groupingExtraData) throws Throwable {
        boolean z;
        Clause textLocalisedQuantityClause;
        RowDelegate.Model.c pfVar;
        Object tVar;
        TextClause textClause;
        boolean z3 = cVar.f323728b;
        List list = cVar.f323729c;
        boolean z4 = z3 && !Intrinsics.f(cVar.f323727a.f162833a, "SMALL_SEGMENTS_GROUP_ID");
        List<he3.j> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (he3.j jVar : list2) {
            yld.i iVarC = ((fnd.d) this.f323731a).c(jVar, gVar.e, true, str, groupingExtraData);
            dj0.d dVar2 = jVar.f151564b;
            List list3 = jVar.e;
            he3.j jVar2 = iVarC.f314698a;
            boolean zA = jVar.d.a();
            String str2 = jVar.f151563a;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(iVarC.f314700c, null, null, false, null, false, 62);
            Clause clause = iVarC.f314699b;
            if (zA) {
                z = z4;
                textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.freelancer_analytics_sales_breakdown_sales_count, Integer.valueOf(jVar2.e.size()), (List) null, (Style) null, 28);
            } else if (list3.size() == 0) {
                z = z4;
                textLocalisedQuantityClause = new TextLocalisedClause(R$string.analytics_main_no_transactions, null, null, 14);
            } else {
                z = z4;
                textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.categorisation_transactions_number, Integer.valueOf(list3.size()), (List) null, (Style) null, 28);
            }
            Clause clause2 = textLocalisedQuantityClause;
            if (z || !z3) {
                pfVar = new pf(new TextLocalisedClause(R.string.common_action_clear, null, null, 14), null, null, false, null, null, 510);
            } else {
                MoneyClause moneyClause = new MoneyClause(otd.f.a(dVar2), o, null, null, 12);
                if (lnd.o0.b(this.k.f87547b)) {
                    float f = (dVar2.a().f115082a * 100.0f) / dVar.a().f115082a;
                    textClause = new TextClause(f >= 1.0f ? a0.d.h(rim.d.c(f), "%") : "<1%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                } else {
                    textClause = null;
                }
                pfVar = new RowDelegate.Model.c.b(moneyClause, textClause, null, false, 124);
            }
            if (zA) {
                String str3 = jVar2.f151563a;
                he3.l lVar = jVar2.d;
                tVar = new ind.t(str3, lnd.t0.a(lVar), lnd.t0.b(lVar));
            } else {
                tVar = new ind.j(jVar.f151563a, null);
            }
            arrayList.add(new RowDelegate.Model(str2, image40, clause, null, 0, clause2, null, null, 0, pfVar, false, null, false, null, null, null, null, null, null, tVar, null, 0, 0, 0, 0, 532675544));
            z4 = z;
        }
        boolean z6 = z4;
        int size = list.size();
        if (!z3) {
            j(arrayList);
            return arrayList;
        }
        aim.e eVarD = i26.l.d(new RowDelegate.Model("OTHER", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_fees, R$attr.uikit_colorWhite, R$attr.uikit_colorGreyTone50), null, null, false, null, false, 62), new TextLocalisedClause(R$string.analytics_spendings_category_others, null, null, 14), null, 0, new TextLocalisedQuantityClause(R$plurals.categorisation_categories_number, Integer.valueOf(size), (List) null, (Style) null, 28), null, null, 0, !z6 ? new pf(new TextLocalisedClause(R.string.common_action_clear, null, null, 14), null, null, false, null, null, 510) : null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800), arrayList, new RowDelegate.Model("id", null, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906), Integer.MAX_VALUE);
        j(eVarD);
        return eVarD;
    }
}
