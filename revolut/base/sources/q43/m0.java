package q43;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class m0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b((b0) ((Map.Entry) obj2).getKey(), (b0) ((Map.Entry) obj3).getKey());
    }
}
