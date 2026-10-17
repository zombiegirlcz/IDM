package nnc;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public final CellDetailsDelegate.Model a(a riskMetricsCellItem) {
        Clause textClause;
        BigDecimal bigDecimal;
        Intrinsics.checkNotNullParameter(riskMetricsCellItem, "riskMetricsCellItem");
        String str = riskMetricsCellItem.f217514a;
        boolean z = riskMetricsCellItem.f217516c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(riskMetricsCellItem.f217515b, null, null, 14);
        BigDecimal bigDecimal2 = riskMetricsCellItem.e;
        if (bigDecimal2 != null) {
            if (z) {
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                BigDecimal bigDecimalMultiply = bigDecimal2.multiply(bigDecimalValueOf);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                bigDecimal = bigDecimalMultiply;
            } else {
                bigDecimal = bigDecimal2;
            }
            Object[] elements = {(bigDecimal2.signum() < 0 || !riskMetricsCellItem.d) ? null : new TextClause("+", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), z ? new PercentageClause(bigDecimal, (PercentageClause.Format) null, (Style) null, 6) : new NumberClause(bigDecimal, new NumberClause.Format.FixedDigitsAfterDot(2, 14, null, null, null), null, null, 12)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            textClause = new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
        } else {
            textClause = new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new CellDetailsDelegate.Model(str, textLocalisedClause, textClause, 0, null, null, null, null, null, false, 0, 0, 32760);
    }
}
