package lx6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceTax;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Double.valueOf(((FreelancerInvoiceTax) obj2).f73416a.f73420c), Double.valueOf(((FreelancerInvoiceTax) obj3).f73416a.f73420c));
    }
}
