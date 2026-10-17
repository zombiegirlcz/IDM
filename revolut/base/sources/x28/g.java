package x28;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.widgets.AvatarGridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.n3;
import com.revolut.core.ui_kit.delegates.widgets.q3;
import com.revolut.core.ui_kit.delegates.widgets.t3;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.invest_feed.api.widget.InvestFeedWidgetApi$FeatureToggles$PopularFirstBuysFeedWidgetRevamp;
import com.revolut.retail.wealth.resources.R$string;
import dsh.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import op0.c2;
import op0.q;
import qv0.c;
import xzg.h0;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f302522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f302523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dsh.e f302524c;

    public g(j jVar, String str, dsh.e eVar) {
        this.f302522a = jVar;
        this.f302523b = str;
        this.f302524c = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        q3 tabs;
        c2 c2Var;
        u0h.c data = (u0h.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(data, "popularFirstBuyData");
        j jVar = this.f302522a;
        jbh.e eVar = jVar.f302527b.f287069a;
        boolean zC = ((jte.d) jVar.e).c(InvestFeedWidgetApi$FeatureToggles$PopularFirstBuysFeedWidgetRevamp.f76454c);
        u0h.a aVar = u0h.a.f276198a;
        Object type = zC ? new u0h.b(r.a.c(r.Companion, this.f302524c)) : aVar;
        String listId = this.f302523b;
        Intrinsics.checkNotNullParameter(listId, "id");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.equals(aVar)) {
            boolean z = data.f276201b;
            h0 h0Var = data.f276200a;
            List list = h0Var.f309997b;
            boolean zIsEmpty = list.isEmpty();
            if (zIsEmpty) {
                c2Var = null;
            } else {
                c2Var = new c2(v9h.c.a(), z ? "POPULAR_FIRST_BUY_ETFS_WIDGET_TAB_ID" : "POPULAR_FIRST_BUY_WIDGET_STOCKS_TAB_ID");
            }
            if (!z || zIsEmpty) {
                list = h0Var.f309996a;
            }
            AvatarGridWidgetDelegate.Model.Companion companion = AvatarGridWidgetDelegate.Model.INSTANCE;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_widget_popular_first_buys_widget_title, null, null, 14);
            List listV0 = d0.V0(list, 8);
            ArrayList arrayList = new ArrayList(w.t(listV0, 10));
            Iterator it8 = listV0.iterator();
            while (it8.hasNext()) {
                arrayList.add(j1h.b.b(eVar, (vel.e) it8.next(), null, null, null, 14));
            }
            return AvatarGridWidgetDelegate.Model.Companion.b(companion, listId, textLocalisedClause, arrayList, c2Var, null, 48);
        }
        if (!(type instanceof u0h.b)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = ((u0h.b) type).f276199a;
        boolean z3 = data.f276201b;
        h0 h0Var2 = data.f276200a;
        List list2 = h0Var2.f309997b;
        boolean zIsEmpty2 = list2.isEmpty();
        if (zIsEmpty2) {
            tabs = null;
        } else {
            tabs = new q3(v9h.c.a(), z3 ? "POPULAR_FIRST_BUY_ETFS_WIDGET_TAB_ID" : "POPULAR_FIRST_BUY_WIDGET_STOCKS_TAB_ID");
        }
        if (!z3 || zIsEmpty2) {
            list2 = h0Var2.f309996a;
        }
        boolean z4 = list2.size() > i;
        List listV02 = d0.V0(list2, i);
        ArrayList items = new ArrayList(w.t(listV02, 10));
        Iterator it9 = listV02.iterator();
        while (it9.hasNext()) {
            items.add(j1h.b.a(eVar, (vel.e) it9.next(), null, 6));
        }
        n3 n3Var = z4 ? new n3(new TextLocalisedClause(R$string.wealth_invest_transactions_widget_button_see_all, null, null, 14), null) : null;
        if (tabs == null) {
            return RowsWidgetDelegate.Model.Companion.a(RowsWidgetDelegate.Model.INSTANCE, listId, new TextLocalisedClause(R$string.wealth_invest_widget_popular_first_buys_widget_title, null, null, 14), items, false, n3Var, 104);
        }
        RowsWidgetDelegate.Model.Companion companion2 = RowsWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause header = new TextLocalisedClause(R$string.wealth_invest_widget_popular_first_buys_widget_title, null, null, 14);
        companion2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(items, "items");
        t3 subtitleMode = t3.f55514a;
        Intrinsics.checkNotNullParameter(subtitleMode, "subtitleMode");
        q qVar = q.DYNAMIC;
        aim.e eVarB = u.b();
        eVarB.add(new BaseDynamicWidgetDelegate.BigHeaderModel("header", header, null, true, null, 48));
        FixedTabsDelegate.Model model = new FixedTabsDelegate.Model("ROWS_WIDGET_TABS", tabs.f55482a, tabs.f55483b, false, null, SyslogConstants.LOG_CLOCK);
        c.C1364c c1364c = c.C1364c.f249512a;
        Intrinsics.checkNotNullParameter(c1364c, "<set-?>");
        model.i = c1364c;
        model.f52347j = R$attr.uikit_dp8;
        model.k = R$attr.uikit_dp4;
        eVarB.add(model);
        eVarB.addAll(RowsWidgetDelegate.Model.Companion.i(companion2, d0.V0(items, 10), qVar, subtitleMode));
        if (n3Var != null) {
            eVarB.add(RowsWidgetDelegate.Model.Companion.e(n3Var));
        }
        return new RowsWidgetDelegate.Model(listId, u.a(eVarB), false, qVar, null, new py0.c(header), true, null, null, 1280);
    }
}
