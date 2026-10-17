package v8i;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import dj0.d;
import j8l.j;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static j a(OrderQuote orderQuote) {
        if (orderQuote == null) {
            return null;
        }
        Amount amount = orderQuote.d;
        if (amount == null) {
            amount = orderQuote.f104754c;
        }
        d dVarL = a.a.L(amount);
        Amount amount2 = orderQuote.f;
        if (amount2 == null) {
            amount2 = orderQuote.e;
        }
        return new j(dVarL, a.a.L(amount2), orderQuote.f104762q);
    }
}
