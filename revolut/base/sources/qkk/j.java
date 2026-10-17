package qkk;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import hx7.q;
import kotlin.jvm.internal.Intrinsics;
import qkk.d;
import zhm.u;
import zhm.v;
import zm3.l;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f247019c;
        l lVar = domainState.f247017a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(z ? R$string.family_plans_eligibility_check_requires_upgrade_title : R$string.family_plans_eligibility_check_requires_upgrade_dialog_title, v.k(q.v(lVar), dok.g.d(domainState.f247018b, null)), null, 12);
        TextLocalisedClause textLocalisedClause2 = domainState.f247019c ? new TextLocalisedClause(R$string.family_plans_eligibility_check_requires_upgrade_subtitle, u.c(q.v(lVar)), null, 12) : new TextLocalisedClause(R$string.family_plans_eligibility_check_requires_upgrade_dialog_description, null, null, 14);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("primary_button", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.family_plans_eligibility_check_requires_upgrade_action_upgrade, null, null, 14), false, null, null, d.b.f247016a, null, 744);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("secondary_button", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.family_plans_eligibility_check_requires_upgrade_action_cancel, null, null, 14), false, null, null, d.a.f247015a, null, 744);
        yp0.b.r(model2, 0, 0, 0, 0, 15);
        return new h(textLocalisedClause, textLocalisedClause2, v.k(model, model2));
    }
}
