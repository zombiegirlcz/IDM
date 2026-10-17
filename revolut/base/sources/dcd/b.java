package dcd;

import aim.e;
import aw0.o9;
import aw0.wa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.savings.impl.R$string;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ncd.i;
import ncd.k;
import ocd.c;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements pbd.a {
    public final Clause g(SavingsProductData savingsProductData, boolean z, Custom custom, boolean z3) {
        Intrinsics.checkNotNullParameter(savingsProductData, "savingsProductData");
        CompositeClause compositeClauseJ = j(savingsProductData, custom, z3);
        CompositeClause compositeClauseN = n(savingsProductData, custom, z3);
        return compositeClauseN != null ? new TextLocalisedClause(z ? R$string.savings_rates_with_secondary_rate_in_newline : R$string.savings_rates_with_secondary_rate, v.k(compositeClauseJ, compositeClauseN), custom, 8) : compositeClauseJ;
    }

    public final CompositeClause h(double d, k primaryRateType, String primaryRateSuffix, Double d5, k kVar, String str, String str2) {
        Intrinsics.checkNotNullParameter(primaryRateType, "primaryRateType");
        Intrinsics.checkNotNullParameter(primaryRateSuffix, "primaryRateSuffix");
        CompositeClause compositeClauseM = m(d, primaryRateSuffix, primaryRateType);
        CompositeClause compositeClauseM2 = (d5 == null || kVar == null || str == null) ? null : m(d5.doubleValue(), str, kVar);
        e eVarB = u.b();
        eVarB.add(compositeClauseM);
        if (compositeClauseM2 != null) {
            eVarB.add(new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            eVarB.add(compositeClauseM2);
        }
        if (str2 != null) {
            m70.a.t(t0.f186434a);
            eVarB.add(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            eVarB.add(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        return new CompositeClause(u.a(eVarB), null, null, null, 10);
    }

    public final PercentageClause i(double d, k interestRateType, Style style) {
        PercentageClause.Format.Custom custom;
        Intrinsics.checkNotNullParameter(interestRateType, "interestRateType");
        switch (a.f112854a[interestRateType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                custom = new PercentageClause.Format.Custom(2, 6, null, wa.SHOW_ALL_ZEROES, null);
                break;
            case 6:
                custom = new PercentageClause.Format.Custom(2, 6, null, wa.STRIP_ALL_TRAILING_ZEROES, null);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new PercentageClause(d, custom, style);
    }

    public final CompositeClause j(SavingsProductData savingsProductData, Style style, boolean z) {
        ProductGroup.RateConfig rateConfigC;
        String str;
        Intrinsics.checkNotNullParameter(savingsProductData, "savingsProductData");
        PercentageClause percentageClauseK = k(savingsProductData, style);
        SavingsProduct.InterestRate.DisplayProperties displayProperties = savingsProductData.f86683a.f86621h.f86645b;
        String str2 = displayProperties.f86648b;
        TextClause textClause = null;
        if (z && (rateConfigC = c.c(savingsProductData.f86684b, displayProperties.f86647a)) != null && (str = rateConfigC.d) != null) {
            textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        Clause[] elements = {percentageClauseK, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = d.L(elements);
        m70.a.t(t0.f186434a);
        return new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), style, null, 8);
    }

    public final PercentageClause k(SavingsProductData savingsProductData, Style style) {
        Intrinsics.checkNotNullParameter(savingsProductData, "savingsProductData");
        return i(c.b(savingsProductData), savingsProductData.f86683a.f86621h.f86645b.f86647a, style);
    }

    public final CompositeClause l(i savingsInterestRateInfo, Style style) {
        Intrinsics.checkNotNullParameter(savingsInterestRateInfo, "savingsInterestRateInfo");
        List listK = v.k(i(savingsInterestRateInfo.f214174a, savingsInterestRateInfo.f214176c, style), new TextClause(savingsInterestRateInfo.f214175b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), style, null, 8);
    }

    public final CompositeClause m(double d, String str, k kVar) {
        List listK = v.k(i(d, kVar, null), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 8);
    }

    public final CompositeClause n(SavingsProductData savingsProductData, Style style, boolean z) {
        Style style2;
        PercentageClause percentageClauseI;
        TextClause textClause;
        ProductGroup.RateConfig rateConfigC;
        String str;
        Intrinsics.checkNotNullParameter(savingsProductData, "savingsProductData");
        Intrinsics.checkNotNullParameter(savingsProductData, "savingsProductData");
        Double dF = c.f(savingsProductData);
        SavingsProduct savingsProduct = savingsProductData.f86683a;
        k kVarB = savingsProduct.f86621h.b();
        if (dF == null || kVarB == null) {
            style2 = style;
            percentageClauseI = null;
        } else {
            style2 = style;
            percentageClauseI = i(dF.doubleValue(), kVarB, style2);
        }
        SavingsProduct.InterestRate interestRate = savingsProduct.f86621h;
        SavingsProduct.InterestRate.DisplayProperties displayProperties = interestRate.f86646c;
        String str2 = displayProperties != null ? displayProperties.f86648b : null;
        if (z) {
            k kVarB2 = interestRate.b();
            textClause = (kVarB2 == null || (rateConfigC = c.c(savingsProductData.f86684b, kVarB2)) == null || (str = rateConfigC.d) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = null;
        }
        if (percentageClauseI == null || str2 == null) {
            return null;
        }
        Clause[] elements = {percentageClauseI, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = d.L(elements);
        m70.a.t(t0.f186434a);
        return new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), style2, null, 8);
    }

    public final CompositeClause o(SavingsProduct.InterestRate.RateTier tier, SavingsProduct.InterestRate interestRate) {
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        Double d = c.d(tier.f86654c, interestRate.f86645b.f86647a);
        if (d == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        double dDoubleValue = d.doubleValue();
        SavingsProduct.InterestRate.DisplayProperties displayProperties = interestRate.f86645b;
        return m(dDoubleValue, displayProperties.f86648b, displayProperties.f86647a);
    }

    public final CompositeClause p(SavingsProduct.InterestRate.RateTier tier, SavingsProduct.InterestRate interestRate) {
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        k kVarB = interestRate.b();
        Double d = kVarB != null ? c.d(tier.f86654c, kVarB) : null;
        SavingsProduct.InterestRate.DisplayProperties displayProperties = interestRate.f86646c;
        String str = displayProperties != null ? displayProperties.f86648b : null;
        if (d == null || str == null) {
            return null;
        }
        double dDoubleValue = d.doubleValue();
        k kVarB2 = interestRate.b();
        if (kVarB2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        List listK = v.k(i(dDoubleValue, kVarB2, null), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 8);
    }
}
