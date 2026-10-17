package cd7;

import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import java.util.Comparator;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        ibd.h hVar = ((RecurringPaymentWithExtra) obj3).getF81653a().f249314a.f160152c;
        ibd.h hVar2 = ibd.h.CREDIT_CARD_PAYMENT;
        return cim.b.b(Boolean.valueOf(hVar == hVar2), Boolean.valueOf(((RecurringPaymentWithExtra) obj2).getF81653a().f249314a.f160152c == hVar2));
    }
}
