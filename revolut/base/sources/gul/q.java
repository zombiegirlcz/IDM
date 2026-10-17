package gul;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bsl.c f146995a;

    public q(bsl.c orderLimitsInteractor, l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(orderLimitsInteractor, "orderLimitsInteractor");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f146995a = orderLimitsInteractor;
    }

    public static zsl.x a(OrderQuote orderQuote, xdf.d securityAssetConfig, xdf.c fiatAssetConfig, k4l.e0 orderLimits) {
        nel.n nVar = securityAssetConfig.f304428a;
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(securityAssetConfig, "securityAssetConfig");
        Intrinsics.checkNotNullParameter(fiatAssetConfig, "fiatAssetConfig");
        Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
        long j2 = orderLimits.e;
        xi0.b bVar = fiatAssetConfig.f304425a;
        BigDecimal bigDecimalY = pyd.c.Y(new dj0.d(j2, bVar));
        BigDecimal bigDecimalY2 = pyd.c.Y(new dj0.d(orderLimits.f, bVar));
        f8l.b bVar2 = orderQuote.f104753b;
        f8l.b bVar3 = orderQuote.f104752a;
        Amount amount = orderQuote.f104754c;
        Charges charges = orderQuote.f104755g;
        int i = p.f146994c[bVar2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal bigDecimal = charges.f104731a.f104722a.f104717a;
            BigDecimal bigDecimal2 = amount.f104717a;
            Asset assetT = e1.t(orderQuote);
            if (bVar3 == bVar2) {
                if (bigDecimal2.compareTo(bigDecimalY) < 0) {
                    BigDecimal bigDecimalAdd = bigDecimalY.add(bigDecimal);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                    return new zsl.m(new Amount(bigDecimalAdd, assetT), e1.D(bigDecimal), false, nVar.f214597c);
                }
                if (bigDecimal2.compareTo(bigDecimalY2) <= 0) {
                    return null;
                }
                BigDecimal bigDecimalAdd2 = bigDecimalY2.add(bigDecimal);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
                return new zsl.n(new Amount(bigDecimalAdd2, assetT), false, false, nVar.f214597c);
            }
            if (bigDecimal2.compareTo(bigDecimalY) < 0) {
                BigDecimal bigDecimalAdd3 = bigDecimalY.add(bigDecimal);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd3, "add(...)");
                return new zsl.m(new Amount(bigDecimalAdd3, assetT), e1.D(bigDecimal), false, nVar.f214597c);
            }
            if (bigDecimal2.compareTo(bigDecimalY2) <= 0) {
                return null;
            }
            BigDecimal bigDecimalAdd4 = bigDecimalY2.add(bigDecimal);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd4, "add(...)");
            return new zsl.n(new Amount(bigDecimalAdd4, assetT), e1.D(bigDecimal), false, nVar.f214597c);
        }
        Amount amount2 = securityAssetConfig.f304429b.f304423a;
        Amount amount3 = orderQuote.e;
        BigDecimal bigDecimal3 = charges.f104731a.f104722a.f104717a;
        BigDecimal bigDecimal4 = amount.f104717a;
        Asset assetT2 = e1.t(orderQuote);
        if (bVar3 != bVar2) {
            if (amount3.f104717a.compareTo(bigDecimalY) < 0) {
                BigDecimal bigDecimalSubtract = bigDecimalY.subtract(bigDecimal3);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                return new zsl.m(new Amount(bigDecimalSubtract, assetT2), e1.D(bigDecimal3), true, nVar.f214597c);
            }
            if (amount3.f104717a.compareTo(bigDecimalY2) <= 0 || Intrinsics.f(bigDecimal4, amount2.f104717a)) {
                return null;
            }
            BigDecimal bigDecimalSubtract2 = bigDecimalY2.subtract(bigDecimal3);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
            return new zsl.n(new Amount(bigDecimalSubtract2, assetT2), e1.D(bigDecimal3), true, nVar.f214597c);
        }
        BigDecimal bigDecimalMax = bigDecimalY.max(bigDecimal3);
        if (amount3.f104717a.compareTo(bigDecimalMax) <= 0 && bigDecimal4.compareTo(amount2.f104717a) != 0) {
            Intrinsics.h(bigDecimalMax);
            return new zsl.m(new Amount(bigDecimalMax, assetT2), false, true, nVar.f214597c);
        }
        if (amount3.f104717a.compareTo(bigDecimalY2) <= 0 || bigDecimal4.compareTo(amount2.f104717a) == 0) {
            return null;
        }
        BigDecimal bigDecimalSubtract3 = bigDecimalY2.subtract(bigDecimal3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract3, "subtract(...)");
        return new zsl.n(new Amount(bigDecimalSubtract3, assetT2), e1.D(bigDecimal3), true, nVar.f214597c);
    }
}
