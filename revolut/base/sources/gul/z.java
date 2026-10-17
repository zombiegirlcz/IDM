package gul;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class z {
    public static Amount a(Amount securityBalance, nel.n instrument, k4l.e0 orderLimits) {
        Intrinsics.checkNotNullParameter(securityBalance, "securityBalance");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
        if (!io3.h.i(instrument.f214597c) || !orderLimits.a()) {
            return null;
        }
        BigDecimal bigDecimalDivide = securityBalance.f104717a.divide(orderLimits.b(), RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return Amount.a(securityBalance, bigDecimalDivide);
    }
}
