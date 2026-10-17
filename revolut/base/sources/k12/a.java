package k12;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteBreakdownItem;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import dj0.d;
import f8l.c;
import f8l.e;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static final Amount a(d dVar) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(dVar.f115082a);
        xi0.b bVar = dVar.f115083b;
        return new Amount(new BigDecimal(bigIntegerValueOf, bVar.c()), b(bVar));
    }

    public static final Asset b(xi0.b bVar) {
        return cp5.d.A(bVar) ? new Asset(c.FIAT, bVar.f306286a, bVar) : cp5.d.z(bVar) ? new Asset(c.CRYPTO, bVar.f306286a, bVar) : cp5.d.y(bVar) ? new Asset(c.COMMODITY, bVar.f306286a, bVar) : new Asset(c.UNDEFINED, bVar.f306286a, bVar);
    }

    public static final ChargeEntry c(ApmQuoteBreakdownItem apmQuoteBreakdownItem) {
        String str = apmQuoteBreakdownItem.f62214a;
        String str2 = apmQuoteBreakdownItem.f62216c;
        String str3 = apmQuoteBreakdownItem.f62215b;
        Amount amountA = a(apmQuoteBreakdownItem.d);
        d dVar = apmQuoteBreakdownItem.e;
        return new ChargeEntry(str, str2, str3, amountA, dVar != null ? a(dVar) : null);
    }

    public static final OrderQuoteParams d(ApmQuote apmQuote) {
        Intrinsics.checkNotNullParameter(apmQuote, "<this>");
        xi0.b bVar = apmQuote.f62211c.f115083b;
        d dVar = apmQuote.f62210b;
        return new OrderQuoteParams(bVar, dVar.f115083b, e.MARKET, new BigDecimal(BigInteger.valueOf(dVar.f115082a), dVar.f115083b.c()), f8l.b.TO, f8l.b.FROM, null, false, null, null, null, null, null, null, 16128);
    }
}
