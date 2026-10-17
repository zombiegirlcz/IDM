package qxg;

import java.util.Comparator;
import rxg.j;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((j) obj3).a().abs(), ((j) obj2).a().abs());
    }
}
