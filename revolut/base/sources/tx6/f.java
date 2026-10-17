package tx6;

import aw0.o9;
import aw0.wa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceTaxRate;
import com.revolut.feature.freelancer.impl.R$string;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final Clause a() {
        return yoj.b.w(yoj.b.w(new TextLocalisedClause(R$string.freelancer_tax_item_no_tax, null, null, 14), new DotDividerClause((Integer) null)), new TextClause("0%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    public final Clause b(FreelancerInvoiceTaxRate taxRate) {
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(taxRate.f73420c);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return yoj.b.w(new NumberClause(bigDecimalValueOf, new NumberClause.Format.FixedDigitsAfterDot(4, 10, null, wa.STRIP_ALL_TRAILING_ZEROES, null), null, null, 12), new TextClause("%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    public final CompositeClause c(FreelancerInvoiceTaxRate taxRate) {
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        return new CompositeClause(v.k(new TextClause(taxRate.f73419b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new DotDividerClause((Integer) null), b(taxRate)), null, null, null, 14);
    }
}
