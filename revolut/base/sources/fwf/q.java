package fwf;

import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((PurchasedTransitTicket.Pending) obj3).i, ((PurchasedTransitTicket.Pending) obj2).i);
    }
}
