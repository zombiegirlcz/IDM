package fwf;

import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((PurchasedTransitTicket.Activated) obj3).i, ((PurchasedTransitTicket.Activated) obj2).i);
    }
}
