package pbd;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.savings.impl.R$string;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import dcd.b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ncd.i;
import ncd.j;
import ncd.k;
import ocd.c;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public interface a {
    static /* synthetic */ CompositeClause a(a aVar, SavingsProductData savingsProductData, Custom custom, int i) {
        if ((i & 2) != 0) {
            custom = null;
        }
        return ((b) aVar).j(savingsProductData, custom, true);
    }

    static CompositeClause b(b bVar, SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(savingsProductData, "savingsProductData");
        SavingsProduct savingsProduct = savingsProductData.f86683a;
        ProductGroup productGroup = savingsProductData.f86684b;
        double dB = c.b(savingsProductData);
        Double dF = c.f(savingsProductData);
        SavingsProduct.InterestRate interestRate = savingsProduct.f86621h;
        k kVar = interestRate.f86645b.f86647a;
        k kVarB = interestRate.b();
        SavingsProduct.InterestRate interestRate2 = savingsProduct.f86621h;
        String str = interestRate2.f86645b.f86648b;
        SavingsProduct.InterestRate.DisplayProperties displayProperties = interestRate2.f86646c;
        return bVar.h(dB, kVar, str, dF, kVarB, displayProperties != null ? displayProperties.f86648b : null, productGroup.d.f86566j);
    }

    static CompositeClause c(b bVar, SavingsProductData savingsProductData) {
        String str;
        Intrinsics.checkNotNullParameter(savingsProductData, "savingsProductData");
        ProductGroup productGroup = savingsProductData.f86684b;
        k kVar = k.NET;
        ProductGroup.RateConfig rateConfigC = c.c(productGroup, kVar);
        if (rateConfigC == null || (str = rateConfigC.f86570a) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        List listK = v.k(bVar.i(savingsProductData.f86683a.f86621h.a().f86651c, kVar, null), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 8);
    }

    static Clause d(a aVar, j savingsInterestRate, Style style, int i) {
        if ((i & 4) != 0) {
            style = null;
        }
        b bVar = (b) aVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(savingsInterestRate, "savingsInterestRate");
        CompositeClause compositeClauseL = bVar.l(savingsInterestRate.f214177a, style);
        i iVar = savingsInterestRate.f214178b;
        CompositeClause compositeClauseL2 = iVar != null ? bVar.l(iVar, style) : null;
        return compositeClauseL2 != null ? new TextLocalisedClause(R$string.savings_rates_with_secondary_rate, v.k(compositeClauseL, compositeClauseL2), style, 8) : compositeClauseL;
    }

    static Clause f(b bVar, SavingsProduct.InterestRate.RateTier tier, SavingsProduct.InterestRate interestRate) {
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        CompositeClause compositeClauseO = bVar.o(tier, interestRate);
        CompositeClause compositeClauseP = bVar.p(tier, interestRate);
        return compositeClauseP != null ? new TextLocalisedClause(R$string.savings_rates_with_secondary_rate, v.k(compositeClauseO, compositeClauseP), null, 8) : compositeClauseO;
    }
}
