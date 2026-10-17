package el5;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b((Integer) ((Map.Entry) obj2).getValue(), (Integer) ((Map.Entry) obj3).getValue());
    }
}
