package et6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceTaxRate;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Double.valueOf(((FreelancerInvoiceTaxRate) obj3).f73420c), Double.valueOf(((FreelancerInvoiceTaxRate) obj2).f73420c));
    }
}
