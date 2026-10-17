package fs9;

import java.util.Comparator;
import kotlin.Pair;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b((LocalDate) ((Pair) obj3).f186386b, (LocalDate) ((Pair) obj2).f186386b);
    }
}
