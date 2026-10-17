package d2e;

import com.revolut.feature.store.api.model.StoreSearchOrder;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((StoreSearchOrder) obj3).m2(), ((StoreSearchOrder) obj2).m2());
    }
}
