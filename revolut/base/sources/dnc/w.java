package dnc;

import com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation;
import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class w implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((AssetSubclassAllocation) ((Pair) obj3).f186385a).getF95688a(), ((AssetSubclassAllocation) ((Pair) obj2).f186385a).getF95688a());
    }
}
