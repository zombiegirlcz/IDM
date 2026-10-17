package yod;

import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((b) obj3).d), Long.valueOf(((b) obj2).d));
    }
}
