package yjj;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionNextPlan;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPlanChange;
import com.revolut.retail.feature.esim.impl.R$string;
import dej.t1;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gej.a f314535a;

    public i(gej.a bytesFormatter) {
        Intrinsics.checkNotNullParameter(bytesFormatter, "bytesFormatter");
        this.f314535a = bytesFormatter;
    }

    public final vjj.k a(t1 subscription) {
        Instant instant;
        Clause clauseA;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        EsimSubscriptionPlanChange esimSubscriptionPlanChange = subscription.O;
        EsimSubscriptionNextPlan esimSubscriptionNextPlan = esimSubscriptionPlanChange != null ? esimSubscriptionPlanChange.f100497c : null;
        if (esimSubscriptionNextPlan != null && (instant = esimSubscriptionNextPlan.f100467a) != null) {
            if (esimSubscriptionNextPlan.f100469c) {
                clauseA = new TextLocalisedClause(R$string.esim_mobile_plans_plan_item_unlimited_gb_title, null, null, 14);
            } else {
                Long l2 = esimSubscriptionNextPlan.f100468b;
                clauseA = l2 != null ? gej.a.a(this.f314535a, l2.longValue(), null, 4) : null;
            }
            if (clauseA != null) {
                return new vjj.k(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(g.a(R$drawable.uikit_icn_24_exchange, null), new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_upgrades_on, v.k(clauseA, new TimeClause(instant.toEpochMilli(), new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, null, 12)), null, 12))), null);
            }
        }
        return null;
    }
}
