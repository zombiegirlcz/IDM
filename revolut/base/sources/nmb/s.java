package nmb;

import java.math.BigDecimal;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(new BigDecimal(String.valueOf(opg.a.d(((ncd.a) obj3).f214169a))), new BigDecimal(String.valueOf(opg.a.d(((ncd.a) obj2).f214169a))));
    }
}
