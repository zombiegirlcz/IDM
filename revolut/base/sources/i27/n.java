package i27;

import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((OrderInitiationPage) obj3).f86428b, ((OrderInitiationPage) obj2).f86428b);
    }
}
