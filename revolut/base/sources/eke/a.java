package eke;

import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((dje.a) obj2).getOrder()), Integer.valueOf(((dje.a) obj3).getOrder()));
    }
}
