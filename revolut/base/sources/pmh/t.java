package pmh;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import jel.w;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        w wVar = (w) ((Map.Entry) obj2).getKey();
        List list = u.f237585b;
        Integer numValueOf = Integer.valueOf(list.indexOf(wVar));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        Integer numValueOf2 = Integer.valueOf(numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE);
        Integer numValueOf3 = Integer.valueOf(list.indexOf((w) ((Map.Entry) obj3).getKey()));
        Integer num = numValueOf3.intValue() >= 0 ? numValueOf3 : null;
        return cim.b.b(numValueOf2, Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE));
    }
}
