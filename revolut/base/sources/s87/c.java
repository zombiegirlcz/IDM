package s87;

import aw0.o9;
import aw0.p9;
import aw0.wa;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    public static CompositeClause a(BigDecimal bigDecimal, Function1 function1, boolean z) {
        int iD = xqi.a.d(bigDecimal, true, RoundingMode.HALF_EVEN);
        int iB = b(bigDecimal, z);
        BigDecimal bigDecimalAbs = bigDecimal.abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        NumberClause numberClause = new NumberClause(bigDecimalAbs, new NumberClause.Format.FixedDigitsAfterDot(2, p9.NEVER, wa.SHOW_ALL_ZEROES, RoundingMode.HALF_EVEN), null, null, 12);
        Clause[] elements = new Clause[3];
        elements[0] = iD > 0 ? new ImageClause(R$drawable.uikit_icn_10_stocks_arrow_up, new ImageClauseTint.Color(new Color.Solid(iB)), (Float) null, (Float) null, 28) : iD < 0 ? new ImageClause(R$drawable.uikit_icn_10_stocks_arrow_down, new ImageClauseTint.Color(new Color.Solid(iB)), (Float) null, (Float) null, 28) : null;
        elements[1] = iD != 0 ? new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        elements[2] = function1.invoke(numberClause);
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
    }

    public static int b(BigDecimal bigDecimal, boolean z) {
        int iD = xqi.a.d(bigDecimal, true, RoundingMode.HALF_EVEN);
        Pair pair = z ? new Pair(Integer.valueOf(R$attr.uikit_colorPerformanceNegative), Integer.valueOf(R$attr.uikit_colorPerformancePositive)) : new Pair(Integer.valueOf(R$attr.uikit_colorPerformancePositive), Integer.valueOf(R$attr.uikit_colorPerformanceNegative));
        return iD > 0 ? ((Number) pair.f186385a).intValue() : iD < 0 ? ((Number) pair.f186386b).intValue() : R$attr.uikit_colorGreyTone50;
    }
}
