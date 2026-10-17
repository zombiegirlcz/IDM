package dec;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(m.a((com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f) obj2)), Integer.valueOf(m.a((com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f) obj3)));
    }
}
