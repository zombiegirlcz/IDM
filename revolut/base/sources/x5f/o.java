package x5f;

import com.revolut.feature.wealth.models.portfolio_metrics.RegionSubclassAllocation;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((RegionSubclassAllocation) obj3).f95692b, ((RegionSubclassAllocation) obj2).f95692b);
    }
}
