package kce;

import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((RecurringPaymentWithExtra) obj2).getF81653a().f249314a.f, ((RecurringPaymentWithExtra) obj3).getF81653a().f249314a.f);
    }
}
