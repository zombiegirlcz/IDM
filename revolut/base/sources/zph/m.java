package zph;

import aw0.o9;
import aw0.p9;
import aw0.wa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.retail.wealth.resources.R$plurals;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m {
    public static Clause a(soh.i rangeValue, int i) {
        Intrinsics.checkNotNullParameter(rangeValue, "rangeValue");
        soh.g gVar = rangeValue.f264840b;
        BigDecimal bigDecimal = rangeValue.f264839a;
        int i2 = l.f324308a[gVar.ordinal()];
        if (i2 == 1) {
            BigDecimal bigDecimalMultiply = bigDecimal.multiply(new BigDecimal(100));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            return new PercentageClause(bigDecimalMultiply, new PercentageClause.Format.Custom(i - 2, 2, p9.ONLY_NEGATIVE, wa.SHOW_ALL_ZEROES, null), (Style) null, 4);
        }
        if (i2 == 2) {
            return new NumberClause(rangeValue.f264839a, new NumberClause.Format.FixedDigitsAfterDot(i, 2, p9.ONLY_NEGATIVE, wa.SHOW_ALL_ZEROES, null), null, null, 12);
        }
        if (i2 != 3) {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = R$plurals.screener_section_value_years;
            String plainString = bigDecimal.toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
            return new TextLocalisedQuantityClause(i3, bigDecimal, zhm.u.c(new TextClause(plainString, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), (Style) null, 24);
        }
        xi0.b.Companion.getClass();
        xi0.b bVar = xi0.b.i;
        int iC = bVar.c();
        BigDecimal scale = bigDecimal.setScale(iC, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        BigDecimal bigDecimalPow = BigDecimal.TEN.pow(iC);
        Intrinsics.checkNotNullExpressionValue(bigDecimalPow, "pow(...)");
        BigDecimal bigDecimalMultiply2 = scale.multiply(bigDecimalPow);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        return new MoneyClause(new dj0.d(bigDecimalMultiply2.longValue(), bVar), new MoneyClause.Format.Shorts(false, 63), null, null, 12);
    }
}
