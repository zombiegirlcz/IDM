package sfl;

import aw0.p9;
import aw0.wa;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public interface a {
    static PercentageClause a(tfl.a aVar, BigDecimal value, boolean z, wa trailingZeroPolicy, p9 signShowingPolicy, int i) {
        Custom custom;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            trailingZeroPolicy = wa.SHOW_ALL_ZEROES;
        }
        if ((i & 8) != 0) {
            signShowingPolicy = p9.ONLY_NEGATIVE;
        }
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(trailingZeroPolicy, "trailingZeroPolicy");
        Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
        BigDecimal bigDecimalAbs = value.abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        PercentageClause.Format.Custom custom2 = new PercentageClause.Format.Custom(2, signShowingPolicy, trailingZeroPolicy, RoundingMode.HALF_UP);
        Custom custom3 = null;
        if (z) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (value.compareTo(bigDecimal) > 0) {
                custom = new Custom(Integer.valueOf(R$attr.uikit_colorPerformancePositive), false, null, false, null, 254);
            } else if (value.compareTo(bigDecimal) < 0) {
                custom = new Custom(Integer.valueOf(R$attr.uikit_colorPerformanceNegative), false, null, false, null, 254);
            }
            custom3 = custom;
        }
        return new PercentageClause(bigDecimalAbs, custom2, custom3);
    }
}
