package kn;

import java.util.Comparator;

/* JADX INFO: loaded from: classes17.dex */
public final class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((ym.c) obj3).getLevel()), Integer.valueOf(((ym.c) obj2).getLevel()));
    }
}
