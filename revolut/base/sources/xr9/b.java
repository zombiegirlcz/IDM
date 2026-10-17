package xr9;

import java.util.Comparator;
import kotlin.Pair;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b((DateTime) ((Pair) obj3).f186386b, (DateTime) ((Pair) obj2).f186386b);
    }
}
