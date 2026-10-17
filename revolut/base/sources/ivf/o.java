package ivf;

import com.revolut.feature.transport.models.transit.TransitTicket;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((TransitTicket) obj2).f92712l), Integer.valueOf(((TransitTicket) obj3).f92712l));
    }
}
