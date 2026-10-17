package ljg;

import aw0.h;
import aw0.m6;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (domainState instanceof b) {
            TrustedMerchant.ToReview toReview = ((b) domainState).f195664a;
            f0 f0Var = f0.f322471a;
            lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.trusted_merchants_approve_dialog_title, u.c(toReview.f94412c), null, 12), new TextLocalisedClause(R$string.trusted_merchants_approve_dialog_description, u.c(toReview.f94412c), null, 12), null, null, false, 28);
            m6 m6Var = n6.Companion;
            return new cii.b(new h(false, m6.c(m6Var, new TextLocalisedClause(R$string.trusted_merchants_approve_dialog_main_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.trusted_merchants_approve_dialog_secondary_button, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121), f0Var, aVar);
        }
        if (!(domainState instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        TrustedMerchant.Approved approved = ((c) domainState).f195665a;
        f0 f0Var2 = f0.f322471a;
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.trusted_merchants_decline_dialog_title, u.c(approved.f94406c), null, 12), new TextLocalisedClause(R$string.trusted_merchants_decline_dialog_description, null, null, 14), null, null, false, 28);
        m6 m6Var2 = n6.Companion;
        return new cii.b(new aw0.g(m6.c(m6Var2, new TextLocalisedClause(R$string.trusted_merchants_decline_dialog_confirm_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var2, new TextLocalisedClause(R$string.trusted_merchants_decline_dialog_cancel_button, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), (Clause) null, (aw0.f) null, 25), f0Var2, aVar2);
    }
}
