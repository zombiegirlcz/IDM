package sjk;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements n {
    @Override // cli.n
    public final o c(j jVar) {
        cii.a aVar;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) domainState.f263736a.getContent();
        if (pricingPlanSubscription != null) {
            Clause clauseA = h.a(pricingPlanSubscription);
            aVar = new cii.a(new lw0.a(new TextLocalisedClause(R$string.premium_cancel_downgrade_confirmation_title, u.c(clauseA), null, 12), new TextLocalisedClause(R$string.premium_cancel_downgrade_confirmation_subtitle, v.k(h.c(pricingPlanSubscription), clauseA), null, 12), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(R$string.premium_cancel_downgrade_confirmation_continue, u.c(clauseA), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.premium_cancel_downgrade_confirmation_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121));
        } else {
            aVar = new cii.a(new lw0.a(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 28), new aw0.h(false, new n6(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121));
        }
        return new f(aVar);
    }
}
