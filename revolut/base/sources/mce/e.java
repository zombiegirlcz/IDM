package mce;

import java.util.Comparator;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b((LocalDate) obj2, (LocalDate) obj3);
    }
}
