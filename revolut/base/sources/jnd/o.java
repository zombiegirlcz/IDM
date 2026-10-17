package jnd;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b((Integer) ((Map.Entry) obj2).getKey(), (Integer) ((Map.Entry) obj3).getKey());
    }
}
