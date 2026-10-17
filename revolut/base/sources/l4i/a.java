package l4i;

import boh.f;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import dj0.d;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static ej0.b a(Amount amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        boolean zD = d(amount);
        BigDecimal bigDecimal = amount.f104717a;
        Asset asset = amount.f104718b;
        if (zD) {
            int iScale = bigDecimal.scale();
            return new ej0.b(bigDecimal, new xi0.b(4, asset.f104720b, iScale != new xi0.b(4, asset.f104720b, null).c() ? Integer.valueOf(iScale) : null));
        }
        throw new IllegalArgumentException("Amount with assetType " + asset.f104719a + " can't be mapped to Money");
    }

    public static d b(Amount amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        boolean zD = d(amount);
        BigDecimal bigDecimal = amount.f104717a;
        Asset asset = amount.f104718b;
        if (zD) {
            int iScale = bigDecimal.scale();
            return new d(bigDecimal.unscaledValue().longValue(), new xi0.b(4, asset.f104720b, iScale != new xi0.b(4, asset.f104720b, null).c() ? Integer.valueOf(iScale) : null));
        }
        throw new IllegalArgumentException("Amount with assetType " + asset.f104719a + " can't be mapped to Money");
    }

    public static Asset c(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return cp5.d.A(currency) ? new Asset(f8l.c.FIAT, currency.f306286a, currency) : cp5.d.z(currency) ? new Asset(f8l.c.CRYPTO, currency.f306286a, currency) : cp5.d.y(currency) ? new Asset(f8l.c.COMMODITY, currency.f306286a, currency) : new Asset(f8l.c.UNDEFINED, currency.f306286a, currency);
    }

    public static boolean d(Amount amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        return f.l(amount.f104718b);
    }

    public static Amount e(d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        return new Amount(new BigDecimal(BigInteger.valueOf(money.f115082a), money.f115083b.c()), c(money.f115083b));
    }
}
