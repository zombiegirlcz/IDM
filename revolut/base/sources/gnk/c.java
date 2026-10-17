package gnk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import hha.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class c {
    public static Clause a(dj0.d price, i iVar) {
        Intrinsics.checkNotNullParameter(price, "price");
        int i = iVar == null ? -1 : b.f145025a[iVar.ordinal()];
        if (i == -1) {
            return dok.b.b(price, null, null, null, 7);
        }
        if (i == 1) {
            return new TextLocalisedClause(R$string.plans_country_profiles_price_monthly, u.c(dok.b.b(price, null, null, null, 7)), null, 12);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.plans_country_profiles_price_annual, u.c(dok.b.b(price, null, null, null, 7)), null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }
}
