package prl;

import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import java.util.Comparator;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((InvestOrder) obj3).getCreatedAt(), ((InvestOrder) obj2).getCreatedAt());
    }
}
