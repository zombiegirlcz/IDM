package nrj;

import android.os.Parcelable;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.delegates.s6;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.spending_analytics.api.R$string;
import ip0.jh0;
import ip0.lh0;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements p {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cmd.b f218659a;

    public k(cmd.b daysClauseProvider) {
        Intrinsics.checkNotNullParameter(daysClauseProvider, "daysClauseProvider");
        this.f218659a = daysClauseProvider;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        TextLocalisedClause textLocalisedClause;
        Object nhVar;
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        uzi.b bVar = domainState.f218655a;
        aim.e eVarB = u.b();
        String str = "TAB_ID_WEEKLY";
        FixedTabs.Item[] elements = {new FixedTabs.Item("TAB_ID_WEEKLY", new TextLocalisedClause(R$string.analytics_period_picker_tab_title_weekly, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("TAB_ID_MONTHLY", new TextLocalisedClause(R$string.analytics_period_picker_tab_title_monthly, null, null, 14), (AnalyticsContext) null, 12)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        uzi.c cVar = bVar.f284679a;
        int[] iArr = j.f218658a;
        int i = iArr[cVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "TAB_ID_MONTHLY";
        }
        eVarB.add(new FixedTabsDelegate.Model("LIST_ID_TABS", listL, str, false, null, SyslogConstants.LOG_CLOCK));
        int i2 = bVar.f284680b;
        int i3 = iArr[cVar.ordinal()];
        if (i3 == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.analytics_edit_cycle_screen_week_day_picker_subheader, u.c(((cnd.b) this.f218659a).a(i2)), null, 12);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.analytics_edit_cycle_screen_month_day_picker_subheader, u.c(Integer.valueOf(i2)), null, 12);
        }
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("LIST_ID_DAY_PICKER_SUBHEADER", (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp16, 0, 0, 0, 61434);
        int i5 = iArr[cVar.ordinal()];
        if (i5 == 1) {
            jh0 jh0Var = jh0.FLEXBOX;
            int i6 = i2 - 1;
            List list = cnd.b.f25405a;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            int i21 = 0;
            for (Object obj2 : list) {
                int i22 = i21 + 1;
                if (i21 < 0) {
                    v.s();
                    throw null;
                }
                arrayList.add(new SuggestionsBarDelegate.Suggestion(a0.d.n("LIST_ID_DAY_WEEK_PICKER", i21), (Clause) obj2, null, i21 == i6 ? lh0.ACCENT : lh0.SEMIACCENT, null, false, Integer.valueOf(i21), null, 372));
                i21 = i22;
            }
            nhVar = new nh("LIST_ID_DAY_WEEK_PICKER", arrayList, jh0Var, R$attr.uikit_dp4, 0, 0, 0, 0, 496);
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i32 = i2 - 1;
            IntRange intRange = new IntRange(1, 31, 1);
            ArrayList arrayList2 = new ArrayList(w.t(intRange, 10));
            vim.f it8 = intRange.iterator();
            while (it8.f289625c) {
                arrayList2.add(String.valueOf(it8.nextInt()));
            }
            nhVar = new s6("LIST_ID_DAY_MONTH_PICKER", i32, arrayList2, null, null, 2032);
        }
        List listK = v.k(model, nhVar);
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return new g(u.a(eVarB));
    }
}
