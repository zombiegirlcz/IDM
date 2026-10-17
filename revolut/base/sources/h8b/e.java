package h8b;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e {
    public static final TextLocalisedClause a(ej0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new TextLocalisedClause(R$string.wealth_stock_corporate_events_coupon_amount_per_note, u.c(new MoneyClause(mif.a.Q(bVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
    }
}
