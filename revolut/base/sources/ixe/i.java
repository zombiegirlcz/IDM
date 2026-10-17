package ixe;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.topup_screen.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class i {
    public static Clause a(dj0.d dVar, hha.i iVar) {
        int i;
        if (iVar == null) {
            return sx4.f.b(3, null, null, dVar);
        }
        int i2 = h.f169558a[iVar.ordinal()];
        if (i2 == 1) {
            i = R$string.checkout_billing_yearly_price_v2;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.checkout_billing_monthly_price_v2;
        }
        return new TextLocalisedClause(i, u.c(sx4.f.b(3, null, null, dVar)), null, 12);
    }
}
