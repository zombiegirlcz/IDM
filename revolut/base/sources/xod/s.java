package xod;

import com.revolut.core.ui_kit.delegates.widgets.g0;
import com.revolut.core.ui_kit.delegates.widgets.h0;
import com.revolut.core.ui_kit.delegates.widgets.i0;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.api.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zod.d0;
import zod.e0;

/* JADX INFO: loaded from: classes7.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f307824a;

    public s(r categoryDetailsMapper) {
        Intrinsics.checkNotNullParameter(categoryDetailsMapper, "categoryDetailsMapper");
        this.f307824a = categoryDetailsMapper;
    }

    public static h0 b(zod.z zVar) {
        dj0.d dVar;
        TextLocalisedClause textLocalisedClause;
        dj0.d dVar2 = zVar.f324041a;
        zod.y yVar = zVar.f324042b;
        MoneyClause moneyClause = new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        zod.x xVar = zVar.f324043c;
        zod.x xVar2 = zod.x.HISTORICAL;
        TextLocalisedClause textLocalisedClause2 = xVar == xVar2 ? null : yVar == zod.y.OVERSPENT ? new TextLocalisedClause(R$string.analytics_dashboard_widget_spent_budget_value_overspent, zhm.u.c(moneyClause), null, 12) : new TextLocalisedClause(R$string.analytics_dashboard_widget_spent_budget_value_left_to_spend, zhm.u.c(moneyClause), null, 12);
        if (xVar == xVar2) {
            textLocalisedClause = new TextLocalisedClause(yVar == zod.y.OVERSPENT ? R$string.analytics_dashboard_widget_spent_budget_description_overspent : R$string.analytics_dashboard_widget_spent_budget_description_leftover, zhm.u.c(moneyClause), null, 12);
        } else {
            textLocalisedClause = (yVar == zod.y.OVERSPENT || (dVar = zVar.d) == null) ? null : new TextLocalisedClause(R$string.analytics_dashboard_widget_spent_budget_description_per_day, zhm.u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
        }
        return new h0(new TextLocalisedClause(R$string.analytics_dashboard_widget_spent_budget_title, null, null, 14), textLocalisedClause2, textLocalisedClause, yVar == zod.y.OVERSPENT ? g0.WARNING : g0.SUCCESS);
    }

    public final i0 a(e0 details) {
        Intrinsics.checkNotNullParameter(details, "details");
        if (!(details instanceof d0)) {
            if (details instanceof zod.z) {
                return b((zod.z) details);
            }
            throw new NoWhenBranchMatchedException();
        }
        d0 details2 = (d0) details;
        List list = details2.f323981a;
        Intrinsics.checkNotNullParameter(details2, "details");
        if (list.isEmpty()) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            q qVarA = this.f307824a.a((zod.c0) it8.next());
            arrayList.add(new com.revolut.core.ui_kit.delegates.widgets.c0(qVarA.f307820a, qVarA.f307821b));
        }
        return new com.revolut.core.ui_kit.delegates.widgets.d0((com.revolut.core.ui_kit.delegates.widgets.c0) zhm.d0.b0(arrayList), (com.revolut.core.ui_kit.delegates.widgets.c0) zhm.d0.e0(1, arrayList), (com.revolut.core.ui_kit.delegates.widgets.c0) zhm.d0.e0(2, arrayList));
    }
}
