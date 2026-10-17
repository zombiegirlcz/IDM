package zy;

import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Locale locale = (Locale) obj2;
        Locale locale2 = (Locale) obj3;
        return cim.b.b(locale.getDisplayName(locale), locale2.getDisplayName(locale2));
    }
}
