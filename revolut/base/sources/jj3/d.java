package jj3;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b((String) ((Map.Entry) obj2).getKey(), (String) ((Map.Entry) obj3).getKey());
    }
}
