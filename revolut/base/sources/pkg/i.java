package pkg;

import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((UnifiedTransaction) obj2).getF94576c()), Long.valueOf(((UnifiedTransaction) obj3).getF94576c()));
    }
}
