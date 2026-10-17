package zuh;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b((String) ((Map.Entry) obj2).getKey(), (String) ((Map.Entry) obj3).getKey());
    }
}
