package lid;

import com.revolut.feature.shops.api.model.ShopsOutlet;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Double.valueOf(((ShopsOutlet) obj3).d.f25486a), Double.valueOf(((ShopsOutlet) obj2).d.f25486a));
    }
}
