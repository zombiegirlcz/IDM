package eul;

import com.revolut.trading.orders.ui.invest.placement.models.OrderTypeWrapper;
import java.util.Comparator;
import java.util.Set;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class u implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Set set = v.d;
        return cim.b.b(Integer.valueOf(d0.f0(set, ((OrderTypeWrapper) obj2).getF106867b())), Integer.valueOf(d0.f0(set, ((OrderTypeWrapper) obj3).getF106867b())));
    }
}
