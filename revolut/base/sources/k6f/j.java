package k6f;

import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.models.RegionAllocationSection;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((RegionAllocationSection.RegularRegionAllocation) obj3).f91291a, ((RegionAllocationSection.RegularRegionAllocation) obj2).f91291a);
    }
}
