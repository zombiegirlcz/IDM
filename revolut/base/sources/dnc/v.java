package dnc;

import com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((AssetSubclassAllocation.Cash) obj3).f95682a, ((AssetSubclassAllocation.Cash) obj2).f95682a);
    }
}
