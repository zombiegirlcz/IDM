package wud;

import aw0.o9;
import aw0.wa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.staking.api.model.StakingInterestRate;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements ttd.a {
    public final CompositeClause b(BigDecimal rate, boolean z) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        int i = 2;
        Style style = null;
        Clause clauseW = yoj.b.w(new NumberClause(rate, new NumberClause.Format.FixedDigitsAfterDot(i, 8, null, wa.SHOW_ALL_ZEROES, RoundingMode.HALF_EVEN), style, null, 8), new TextClause("%", (Style) null, (Integer) null, false, (o9) null, (List) null, 124));
        TextClause textClause = new TextClause("APY", (Style) null, (Integer) null, false, (o9) null, (List) null, 124);
        if (!z) {
            textClause = null;
        }
        Clause[] elements = {clauseW, textClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), d.L(elements));
    }

    public final CompositeClause c(StakingInterestRate interestRate, boolean z, Custom custom) {
        NumberClause.Format.FixedDigitsAfterDot fixedDigitsAfterDot;
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        int i = a.f300103a[interestRate.d.ordinal()];
        if (i == 1) {
            int i2 = 2;
            fixedDigitsAfterDot = new NumberClause.Format.FixedDigitsAfterDot(i2, 8, null, wa.STRIP_ONE_TRAILING_ZERO, RoundingMode.HALF_EVEN);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = 2;
            fixedDigitsAfterDot = new NumberClause.Format.FixedDigitsAfterDot(i3, 8, null, wa.SHOW_ALL_ZEROES, RoundingMode.HALF_EVEN);
        }
        Clause clauseW = yoj.b.w(new NumberClause(interestRate.f88069b, fixedDigitsAfterDot, custom, null, 8), new TextClause("%", (Style) custom, (Integer) null, false, (o9) null, (List) null, 124));
        TextClause textClause = new TextClause(interestRate.d.name(), (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
        if (!z) {
            textClause = null;
        }
        Clause[] elements = {clauseW, textClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), d.L(elements));
    }
}
