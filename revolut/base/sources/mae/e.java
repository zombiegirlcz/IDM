package mae;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    public static TextLocalisedClause a(WalletAutomation automation) {
        Intrinsics.checkNotNullParameter(automation, "automation");
        MoneyClause moneyClause = new MoneyClause(automation.getF86446a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        if (automation instanceof WalletAutomation.DropsBelow) {
            return new TextLocalisedClause(R$string.automation_goes_below_description, zhm.u.c(moneyClause), null, 12);
        }
        if (automation instanceof WalletAutomation.Exceeds) {
            return new TextLocalisedClause(R$string.automation_goes_above_description, zhm.u.c(moneyClause), null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Clause b(qua.p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        String str = subscription.k;
        return str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.recurring_payments_form_transfer, null, null, 14);
    }
}
