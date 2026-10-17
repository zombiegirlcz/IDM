package udc;

import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.c;
import com.revolut.core.ui_kit_resources.R$attr;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final NumberClause a(long j2, NumberClause.Format.FixedDigitsAfterDot format) {
        Intrinsics.checkNotNullParameter(format, "format");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j2, 6);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "getMajorUnits-impl(...)");
        return new NumberClause(bigDecimalValueOf, format, new Custom(new Custom.Color.Gradient(R$attr.uikit_colorRevPointsGradientStart, R$attr.uikit_colorRevPointsGradientEnd, c.TL_BR), false, false, 254), null, 8);
    }

    public static final NumberClause b(long j2, NumberClause.Format format) {
        Intrinsics.checkNotNullParameter(format, "format");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j2, 6);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "getMajorUnits-impl(...)");
        return new NumberClause(bigDecimalValueOf, format, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), o9.SENSITIVE);
    }
}
