package nzd;

import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((Locale) obj2).getDisplayName(), ((Locale) obj3).getDisplayName());
    }
}
