package q6i;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_move_money.impl.R$string;

/* JADX INFO: loaded from: classes10.dex */
public final class o {
    public static TextLocalisedClause a(dj0.d dVar) {
        return new TextLocalisedClause(R$string.move_money_amount_screen_balance, zhm.u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
    }
}
