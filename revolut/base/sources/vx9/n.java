package vx9;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((ux9.t) obj2).getTimestamp()), Long.valueOf(((ux9.t) obj3).getTimestamp()));
    }
}
