package mi7;

import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class c {
    public static TextLocalisedClause a(BigDecimal totalShareholderReturn) {
        Intrinsics.checkNotNullParameter(totalShareholderReturn, "totalShareholderReturn");
        int i = R$string.invest_recommended_buys_expected_annual_return;
        BigDecimal bigDecimalMultiply = totalShareholderReturn.multiply(new BigDecimal("100"));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return new TextLocalisedClause(i, u.c(new PercentageClause(bigDecimalMultiply, new PercentageClause.Format.Custom(2, 12, null, null, RoundingMode.HALF_DOWN), (Style) null)), null, 12);
    }
}
