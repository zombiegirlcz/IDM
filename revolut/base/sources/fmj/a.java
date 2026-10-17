package fmj;

import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.impl.R$string;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static TextLocalisedClause a(dj0.d dVar) {
        return new TextLocalisedClause(R$string.esim_mobile_plans_phone_number_checkout_footer_action_pay, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12);
    }
}
