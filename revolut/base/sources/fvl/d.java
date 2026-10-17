package fvl;

import com.revolut.feature.trading_orders.common.models.SourcePocket;
import java.util.Comparator;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((SourcePocket) obj3).getF91792b(), ((SourcePocket) obj2).getF91792b());
    }
}
