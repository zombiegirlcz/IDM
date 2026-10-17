package h3b;

import aw0.n6;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.retail.cfd.impl.R$string;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f149110a;

    public z(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f149110a = featureToggleInteractor;
    }

    public final aw0.g a(boolean z, boolean z3) {
        n6 n6Var = new n6(new TextLocalisedClause(R$string.wealth_margin_common_action_top_up, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, z, null, z ? h.ADD_MONEY : null, 476);
        FeatureWealthApi$Toggles.InvestWithdrawToMoveMoney investWithdrawToMoveMoney = FeatureWealthApi$Toggles.InvestWithdrawToMoveMoney.f95164c;
        jte.d dVar = (jte.d) this.f149110a;
        return new aw0.g(n6Var, new n6((dVar.c(investWithdrawToMoveMoney) && dVar.c(FeatureWealthApi$Toggles.CfdMoveMoney.f95155c)) ? new TextLocalisedClause(R$string.wealth_margin_cfd_home_move_money, null, null, 14) : new TextLocalisedClause(R$string.wealth_margin_cfd_home_withdraw, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, z3, null, z3 ? h.WITHDRAW : null, 476), (Clause) null, (aw0.f) null, 24);
    }
}
