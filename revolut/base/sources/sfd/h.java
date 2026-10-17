package sfd;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import ip0.ck0;
import ip0.yj0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements e {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f262400a;

    public h(c commonMapper) {
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        this.f262400a = commonMapper;
    }

    public static List a(Clause clause) {
        return clause != null ? u.c(new TextDelegate.Model("chart_disclaimer", clause, false, new ck0(yj0.CENTER_HORIZONTAL), null, null, R$attr.uikit_dp16, R$attr.uikit_dp32, 0, 0, 1652)) : f0.f322471a;
    }

    public static FixedTabsDelegate.Model b(tfd.b bVar, boolean z) {
        TextLocalisedClause textLocalisedClause;
        List<ngd.a> list = bVar.k;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (ngd.a aVar : list) {
            String strName = aVar.name();
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            switch (i.f262401a[aVar.ordinal()]) {
                case 1:
                    textLocalisedClause = new TextLocalisedClause(R$string.shared_favourites_chart_tabs_one_day, null, null, 14);
                    break;
                case 2:
                    textLocalisedClause = new TextLocalisedClause(R$string.shared_favourites_chart_tabs_one_week, null, null, 14);
                    break;
                case 3:
                    textLocalisedClause = new TextLocalisedClause(R$string.shared_favourites_chart_tabs_one_month, null, null, 14);
                    break;
                case 4:
                    textLocalisedClause = new TextLocalisedClause(R$string.shared_favourites_chart_tabs_three_months, null, null, 14);
                    break;
                case 5:
                    textLocalisedClause = new TextLocalisedClause(R$string.shared_favourites_chart_tabs_six_months, null, null, 14);
                    break;
                case 6:
                    textLocalisedClause = new TextLocalisedClause(R$string.shared_favourites_chart_tabs_one_year, null, null, 14);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new FixedTabs.Item(strName, textLocalisedClause, (AnalyticsContext) null, 12));
        }
        String strName2 = bVar.i.name();
        int i = R$attr.uikit_dp8;
        return new FixedTabsDelegate.Model("chart_ranges", arrayList, strName2, null, null, i, z ? R$attr.uikit_dp16 : i, 0, 0, 408);
    }
}
