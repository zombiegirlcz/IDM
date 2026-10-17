package ky4;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class d {
    public static final PercentageClause a(BigDecimal rate, wi0.b countryCode, Custom custom) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        BigDecimal bigDecimalMultiply = rate.multiply(new BigDecimal(100));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return new PercentageClause(bigDecimalMultiply, new PercentageClause.Format.Custom(b(countryCode), 12, null, null, c(countryCode)), custom);
    }

    public static final int b(wi0.b bVar) {
        wi0.a aVar = wi0.b.Companion;
        aVar.getClass();
        if (Intrinsics.f(bVar, wi0.b.p0)) {
            return 1;
        }
        aVar.getClass();
        if (Intrinsics.f(bVar, wi0.b.f297750h0)) {
            return 1;
        }
        aVar.getClass();
        return Intrinsics.f(bVar, wi0.b.W) ? 1 : 2;
    }

    public static final RoundingMode c(wi0.b bVar) {
        wi0.a aVar = wi0.b.Companion;
        aVar.getClass();
        if (!Intrinsics.f(bVar, wi0.b.f297781v1)) {
            aVar.getClass();
            if (!Intrinsics.f(bVar, wi0.b.t2)) {
                aVar.getClass();
                if (!Intrinsics.f(bVar, wi0.b.L0)) {
                    aVar.getClass();
                    if (!Intrinsics.f(bVar, wi0.b.D2)) {
                        return RoundingMode.HALF_UP;
                    }
                }
            }
        }
        return RoundingMode.UP;
    }
}
