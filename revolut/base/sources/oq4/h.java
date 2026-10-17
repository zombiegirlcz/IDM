package oq4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {
    public static TextLocalisedClause a(com.revolut.feature.credit.card.api.navigation.a screenMode) {
        Intrinsics.checkNotNullParameter(screenMode, "screenMode");
        int i = g.f227739a[screenMode.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_initial_deposit_header_title, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_header_title, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_withdraw_header_title, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
