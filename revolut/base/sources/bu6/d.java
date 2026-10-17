package bu6;

import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubAssessmentStep;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((TaxHubAssessmentStep) obj2).f73481b.a()), Integer.valueOf(((TaxHubAssessmentStep) obj3).f73481b.a()));
    }
}
