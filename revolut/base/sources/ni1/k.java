package ni1;

import com.revolut.feature.address.models.Address;
import java.util.Comparator;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((Address) obj2).getFullAddress(), ((Address) obj3).getFullAddress());
    }
}
