package lnd;

import android.os.Parcelable;
import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.spending_analytics.api.R$plurals;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.api.models.GroupingExtraData;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final MoneyClause.Format.Defaults f197191c = new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cmd.a f197192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jnd.k f197193b;

    public o0(cmd.a groupDetailsMapper, t0 proCategoryGroupMapper, p0 categoryGroupMapper, jnd.k categoryBudgetMapper) {
        Intrinsics.checkNotNullParameter(groupDetailsMapper, "groupDetailsMapper");
        Intrinsics.checkNotNullParameter(proCategoryGroupMapper, "proCategoryGroupMapper");
        Intrinsics.checkNotNullParameter(categoryGroupMapper, "categoryGroupMapper");
        Intrinsics.checkNotNullParameter(categoryBudgetMapper, "categoryBudgetMapper");
        this.f197192a = groupDetailsMapper;
        this.f197193b = categoryBudgetMapper;
    }

    public static TextClause a(dj0.d dVar, dj0.d dVar2) {
        float f = (dVar.a().f115082a * 100.0f) / dVar2.a().f115082a;
        return new TextClause(f >= 1.0f ? a0.d.h(rim.d.c(f), "%") : "<1%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static boolean b(yld.d screenType) {
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        return (screenType == yld.d.NET_BALANCE || screenType == yld.d.EARNINGS) ? false : true;
    }

    public static Clause e(int i) {
        return i == 0 ? new TextLocalisedClause(R$string.analytics_main_no_transactions, null, null, 14) : new TextLocalisedQuantityClause(R$plurals.categorisation_transactions_number, Integer.valueOf(i), (List) null, (Style) null, 28);
    }

    public static List f(List list) {
        List list2 = list;
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            dVarO = i == 0 ? ((he3.j) obj2).f151564b : pyd.c.O(dVarO, ((he3.j) obj2).f151564b);
            i = i2;
        }
        return zhm.d0.P0(list2, new n0(0, dVarO));
    }

    public static ind.u g(he3.j jVar, fnd.a aVar) {
        ejb.j jVar2;
        String str = jVar.f151563a;
        ejb.j[] jVarArrValues = ejb.j.values();
        int length = jVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jVar2 = null;
                break;
            }
            jVar2 = jVarArrValues[i];
            if (kotlin.text.a0.z(jVar2.name(), str, true)) {
                break;
            }
            i++;
        }
        if (jVar2 != null) {
            return new ind.u(jVar2, aVar);
        }
        return null;
    }

    public static void h(List list) {
        int i = R$attr.uikit_dp16;
        yp0.b.k(list, i, i, 0, 0, 28);
    }

    public final List c(List list, boolean z, List list2, amd.i filter, yld.c chartStyle, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, String str, GroupingExtraData groupingExtraData) throws Throwable {
        List listF;
        List categoryGroups = list;
        Intrinsics.checkNotNullParameter(categoryGroups, "categoryGroups");
        List allCategories = list2;
        Intrinsics.checkNotNullParameter(allCategories, "allCategories");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(chartStyle, "chartStyle");
        GroupingExtraData groupingExtraData2 = groupingExtraData;
        Intrinsics.checkNotNullParameter(groupingExtraData2, "groupingExtraData");
        if (analyticsSpendingPeriod$Interval != null && (listF = f(p0.e(analyticsSpendingPeriod$Interval, categoryGroups))) != null) {
            categoryGroups = listF;
        }
        if (filter != amd.i.CATEGORIES || categoryGroups.isEmpty()) {
            return zhm.f0.f322471a;
        }
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("EXCLUDED_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.analytics_spendings_group_by_excluded, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, 0, 0, 57338);
        LargeActionButtonDelegate.Model model2 = categoryGroups.size() > 3 ? new LargeActionButtonDelegate.Model("SEE_ALL_EXCLUDED", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(z ? R$string.analytics_spendings_see_less : R$string.analytics_spendings_see_all, null, null, 14), false, null, null, null, null, 1000) : null;
        if (!z) {
            categoryGroups = zhm.d0.V0(categoryGroups, 3);
        }
        List<he3.j> list3 = categoryGroups;
        ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
        for (he3.j jVar : list3) {
            yld.i iVarC = ((fnd.d) this.f197192a).c(jVar, allCategories, chartStyle == yld.c.PIE_CHART, str, groupingExtraData2);
            arrayList.add(new RowDelegate.Model(jVar.f151563a, new RowDelegate.Model.MainImage.Image40(iVarC.f314700c, null, null, false, null, false, 62), iVarC.f314699b, null, 0, e(jVar.e.size()), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(otd.f.a(jVar.f151564b), f197191c, null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, new ind.p(jVar.f151563a), null, 0, 0, 0, 0, 532675544));
            allCategories = list2;
            groupingExtraData2 = groupingExtraData;
        }
        List listP = arrayList;
        if (model2 != null) {
            listP = i2b.a.p(arrayList, model2);
        }
        h(listP);
        return i2b.a.q(model, listP);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023b  */
    /* JADX WARN: Type inference failed for: r1v14, types: [fnd.a, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v35, types: [ejb.o[]] */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [com.revolut.core.ui_kit.internal.views.ProgressStyle] */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r47v0 */
    /* JADX WARN: Type inference failed for: r47v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r47v2 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [ejb.o] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Enum] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d(java.util.List r55, boolean r56, java.util.List r57, yld.c r58, boolean r59, dj0.d r60, com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r61, java.lang.String r62, com.revolut.feature.spending_analytics.api.models.GroupingExtraData r63, jnd.d r64, lzi.j r65) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lnd.o0.d(java.util.List, boolean, java.util.List, yld.c, boolean, dj0.d, com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval, java.lang.String, com.revolut.feature.spending_analytics.api.models.GroupingExtraData, jnd.d, lzi.j):java.util.List");
    }
}
