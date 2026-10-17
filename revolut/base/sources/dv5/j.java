package dv5;

import com.revolut.feature.exchange.models.ExchangeOrder;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((ExchangeOrder.Active) obj3).f72129a.i), Long.valueOf(((ExchangeOrder.Active) obj2).f72129a.i));
    }
}
