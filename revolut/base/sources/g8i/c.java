package g8i;

import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import com.revolut.feature_move_money.impl.R$string;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static TextLocalisedClause a(WalletAutomation.Limit limit) {
        MoneyClause moneyClause = new MoneyClause(limit.f86449a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
        int i = b.f141362a[limit.f86450b.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.move_money_automation_set_automation_limit_daily, zhm.u.c(moneyClause), null, 12);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.move_money_automation_set_automation_limit_weekly, zhm.u.c(moneyClause), null, 12);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.move_money_automation_set_automation_limit_monthly, zhm.u.c(moneyClause), null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }
}
