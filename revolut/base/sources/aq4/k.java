package aq4;

import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements n {
    public static g a(Clause clause, List list, boolean z, boolean z3) {
        TextNavBarMenuItem textNavBarMenuItem = new TextNavBarMenuItem("id_skip_repayment", new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_header_action_skip, null, null, 14), null, null, 12);
        if (!z3) {
            textNavBarMenuItem = null;
        }
        return new g(list, clause, z, textNavBarMenuItem);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_facility_cancellation_credit_card_checkout_footerButton, u.c(new MoneyClause(domainState.f8247a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
        return (g) iii.c.f(t1.t(domainState.f8248b, domainState.e), new i(this, textLocalisedClause, 0), new j(this, textLocalisedClause), new a15.n(domainState, this, textLocalisedClause));
    }
}
