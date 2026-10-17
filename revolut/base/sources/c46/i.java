package c46;

import com.revolut.feature.defi.common.models.domain.DeFiAssetAmount;
import com.revolut.feature.defi.common.models.domain.DeFiAssetAmountWithFiat;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f21094a;

    public i(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f21094a = uiKitResources;
    }

    public static BigDecimal a(f8l.b bVar, Amount amount, Amount amount2) {
        Pair pair;
        BigDecimal bigDecimal = amount.f104717a;
        BigDecimal bigDecimal2 = amount2.f104717a;
        int i = h.f21091a[bVar.ordinal()];
        if (i == 1) {
            pair = new Pair(bigDecimal, bigDecimal2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(bigDecimal2, bigDecimal);
        }
        BigDecimal bigDecimal3 = (BigDecimal) pair.f186385a;
        BigDecimal bigDecimal4 = (BigDecimal) pair.f186386b;
        if (bigDecimal3.signum() == 0) {
            BigDecimal bigDecimal5 = BigDecimal.ZERO;
            Intrinsics.h(bigDecimal5);
            return bigDecimal5;
        }
        BigDecimal bigDecimalDivide = bigDecimal4.divide(bigDecimal3, MathContext.DECIMAL128);
        Intrinsics.h(bigDecimalDivide);
        return bigDecimalDivide;
    }

    public static boolean b(DeFiAssetAmountWithFiat deFiAssetAmountWithFiat) {
        return deFiAssetAmountWithFiat.f71683a.f71682c.compareTo(BigInteger.ZERO) > 0;
    }

    public static Amount c(DeFiAssetAmount deFiAssetAmount) {
        return new Amount(deFiAssetAmount.a(), new Asset(f8l.c.SECURITY, deFiAssetAmount.f71681b, new xi0.b(4, deFiAssetAmount.f71680a, Integer.valueOf(deFiAssetAmount.d))));
    }
}
