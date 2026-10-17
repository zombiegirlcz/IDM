package tmb;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public final CompositeClause a(List products, xi0.b baseCurrency) {
        ProductGroup.UpsellConfig upsellConfig;
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        SavingsProductData savingsProductData = (SavingsProductData) d0.d0(products);
        ProductGroup productGroup = savingsProductData != null ? savingsProductData.f86684b : null;
        ProductGroup.TextWithExplanation textWithExplanation = (productGroup == null || (upsellConfig = productGroup.f86525h) == null) ? null : upsellConfig.f86592a;
        if (productGroup == null || textWithExplanation == null) {
            return null;
        }
        ProductGroup.ExplanationWithLabel explanationWithLabel = textWithExplanation.f86589b;
        return nkb.a.b(textWithExplanation, explanationWithLabel != null ? new g(explanationWithLabel) : null);
    }
}
