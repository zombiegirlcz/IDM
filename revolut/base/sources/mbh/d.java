package mbh;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import go.g;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ma2.s;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.b f204216a;

    public d(o7.b orderQuoteInteractor, l4i.a amountConverter, by5.a orderQuoteParamsFactory) {
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(orderQuoteParamsFactory, "orderQuoteParamsFactory");
        this.f204216a = orderQuoteInteractor;
    }

    public final Flow a(xi0.b bVar, xi0.b targetCurrency, dj0.d amountInTargetCurrency, n1h.a side) {
        f8l.b bVar2;
        f8l.b bVar3;
        xi0.b sourceCurrency = bVar;
        Intrinsics.checkNotNullParameter(sourceCurrency, "fromCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "toCurrency");
        Intrinsics.checkNotNullParameter(amountInTargetCurrency, "inputAmount");
        Intrinsics.checkNotNullParameter(side, "side");
        if (Intrinsics.f(bVar, targetCurrency)) {
            return new g(zi0.c.P(new n1h.d(amountInTargetCurrency, amountInTargetCurrency, null), false, null, 3), 2);
        }
        if (amountInTargetCurrency.k()) {
            int i = c.f204215a[side.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                sourceCurrency = targetCurrency;
            }
            return zi0.c.i(new n1h.d(new dj0.d(0L, sourceCurrency), new dj0.d(0L, sourceCurrency), null));
        }
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(amountInTargetCurrency, "amountInTargetCurrency");
        Intrinsics.checkNotNullParameter(side, "side");
        if (Intrinsics.f(sourceCurrency.f306286a, targetCurrency.f306286a)) {
            throw new IllegalArgumentException(p.a.p("Source and target currencies are the same - ", sourceCurrency.f306286a, ")"));
        }
        f8l.e eVar = f8l.e.MARKET;
        BigDecimal bigDecimal = l4i.a.e(amountInTargetCurrency).f104717a;
        int[] iArr = b.f204214a;
        int i2 = iArr[side.ordinal()];
        if (i2 == 1) {
            bVar2 = f8l.b.TO;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar2 = f8l.b.FROM;
        }
        int i3 = iArr[side.ordinal()];
        if (i3 == 1) {
            bVar3 = f8l.b.TO;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar3 = f8l.b.FROM;
        }
        OrderQuoteParams orderQuoteParams = new OrderQuoteParams(sourceCurrency, targetCurrency, eVar, bigDecimal, bVar2, bVar3, null, false, null, null, null, null, null, null, 16128);
        return rd0.e.n(nim.a.v(o7.b.u(this.f204216a, orderQuoteParams), new s(side, this, orderQuoteParams)), h0.f322473a);
    }
}
