package yjj;

import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.esim.impl.R$string;
import dej.c3;
import dej.t1;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class d {
    public static vjj.k a(t1 subscription) {
        Instant instant;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        CompositeClause compositeClauseM = null;
        CompositeClause compositeClauseM2 = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(g.a(R$drawable.uikit_icn_24_exclamation_mark, Integer.valueOf(R$attr.uikit_colorStatusWarning)), new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_header_not_installed_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10)));
        c3 c3Var = subscription.i;
        if (c3Var != null && (instant = c3Var.d) != null) {
            compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(g.a(R$drawable.uikit_icn_16_exchange, Integer.valueOf(R$attr.uikit_colorGreyTone50)), new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_header_not_installed_description, u.c(new TimeClause(instant.toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8)));
        }
        return new vjj.k(compositeClauseM2, compositeClauseM);
    }
}
