package dec;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(m.a(((PaymentMethod.Pocket) obj2).f84380h)), Integer.valueOf(m.a(((PaymentMethod.Pocket) obj3).f84380h)));
    }
}
