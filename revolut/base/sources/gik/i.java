package gik;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements n {
    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.premium_plan_referral_plan_sharing_notice_title, null, null, 14), new TextLocalisedClause(R$string.premium_plan_referral_plan_sharing_notice_subtitle, null, null, 14), null, null, false, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("plan_sharing_enable", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.premium_plan_referral_plan_sharing_notice_enable, null, null, 14), false, "plan_sharing_enable_button", null, null, null, 936);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("plan_sharing_not_now", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.premium_plan_referral_plan_sharing_notice_not_now, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model2, 0, 0, 0, 0, 15);
        return new cii.b(null, v.k(model, model2), aVar);
    }
}
