package ivf;

import com.revolut.feature.transport.models.transit.TransitTicket;
import java.util.Comparator;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((TransitTicket) d0.b0(((bxf.f) obj2).f19682c)).f92708c.d), Integer.valueOf(((TransitTicket) d0.b0(((bxf.f) obj3).f19682c)).f92708c.d));
    }
}
