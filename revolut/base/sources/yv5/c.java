package yv5;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((e) obj3).getLastSeen()), Long.valueOf(((e) obj2).getLastSeen()));
    }
}
