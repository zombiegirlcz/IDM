package gs2;

import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import java.util.Comparator;

/* JADX INFO: loaded from: classes21.dex */
public final class x implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((RecurringPaymentWithExtra) obj3).getF81653a().f249314a.e, ((RecurringPaymentWithExtra) obj2).getF81653a().f249314a.e);
    }
}
