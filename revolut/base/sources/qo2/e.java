package qo2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.bank_account_switching.api.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {
    private e() {
    }

    public static TextLocalisedClause a(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int i = d.f247989a[cVar.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.account_switch_set_payment_repeat_daily, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.account_switch_set_payment_repeat_weekly, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.account_switch_set_payment_repeat_biweekly, null, null, 14);
        }
        if (i == 4) {
            return new TextLocalisedClause(R$string.account_switch_set_payment_repeat_monthly, null, null, 14);
        }
        if (i == 5) {
            return new TextLocalisedClause(R$string.account_switch_set_payment_repeat_yearly, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
