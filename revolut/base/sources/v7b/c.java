package v7b;

import java.time.LocalDate;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b((LocalDate) obj3, (LocalDate) obj2);
    }
}
