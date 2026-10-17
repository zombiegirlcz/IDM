package k6f;

import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.models.SectorAllocationSection$RegularSectorAllocation;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((SectorAllocationSection$RegularSectorAllocation) obj3).f91296a, ((SectorAllocationSection$RegularSectorAllocation) obj2).f91296a);
    }
}
