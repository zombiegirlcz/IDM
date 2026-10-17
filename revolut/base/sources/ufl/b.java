package ufl;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import dj0.d;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements sfl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tfl.a f279869a;

    public b(tfl.a wealthCoreClauseFactory) {
        Intrinsics.checkNotNullParameter(wealthCoreClauseFactory, "wealthCoreClauseFactory");
        this.f279869a = wealthCoreClauseFactory;
    }

    public final Clause c(d balanceDelta, BigDecimal balanceDeltaPercentage, boolean z, o9 sensitivity, MoneyClause.Format.Defaults format) {
        Intrinsics.checkNotNullParameter(balanceDelta, "balanceDelta");
        Intrinsics.checkNotNullParameter(balanceDeltaPercentage, "balanceDeltaPercentage");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        Intrinsics.checkNotNullParameter(format, "format");
        long j2 = balanceDelta.f115082a;
        tfl.a aVar = this.f279869a;
        if (j2 == 0) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            PercentageClause percentageClauseA = sfl.a.a(aVar, ZERO, false, null, null, 12);
            Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
            BigDecimal percent = percentageClauseA.f57904a;
            PercentageClause.Format format2 = percentageClauseA.f57905b;
            Intrinsics.checkNotNullParameter(percent, "percent");
            Intrinsics.checkNotNullParameter(format2, "format");
            return new PercentageClause(percent, format2, custom);
        }
        int i = j2 > 0 ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorPerformanceNegative;
        BigDecimal bigDecimalAbs = balanceDeltaPercentage.abs();
        MoneyClause moneyClause = z ? new MoneyClause(balanceDelta, format, null, sensitivity, 4) : null;
        ImageClause imageClause = new ImageClause(j2 > 0 ? R$drawable.uikit_icn_10_stocks_arrow_up : R$drawable.uikit_icn_10_stocks_arrow_down, Integer.valueOf(i), (Float) null, (Float) null, 28);
        if (j2 <= 0) {
            Intrinsics.h(bigDecimalAbs);
            bigDecimalAbs = bigDecimalAbs.negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "negate(...)");
        }
        BigDecimal bigDecimal = bigDecimalAbs;
        Intrinsics.h(bigDecimal);
        Clause[] elements = {moneyClause, imageClause, sfl.a.a(aVar, bigDecimal, true, null, null, 12)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
