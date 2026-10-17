package x5f;

import com.revolut.feature.wealth.models.portfolio_metrics.SectorSubclassAllocation;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((SectorSubclassAllocation) obj3).f95694b, ((SectorSubclassAllocation) obj2).f95694b);
    }
}
