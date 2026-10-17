package tjk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutHyperText;
import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((PricingPlanLayoutHyperText.Descriptor) obj3).getF102840a().length()), Integer.valueOf(((PricingPlanLayoutHyperText.Descriptor) obj2).getF102840a().length()));
    }
}
