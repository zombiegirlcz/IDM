package uz7;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((String) obj2).length()), Integer.valueOf(((String) obj3).length()));
    }
}
