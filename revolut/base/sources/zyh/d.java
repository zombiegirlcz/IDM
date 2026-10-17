package zyh;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    public d(l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
    }

    public final MoneyClause a(Amount amount) {
        if (amount != null) {
            return new MoneyClause(l4i.a.b(amount), new MoneyClause.Format.Asset(0), null, null, 12);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
