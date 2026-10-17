package nhm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b implements Iterable {
    public static int a(int i, int i2) {
        return (i2 >>> i) & 31;
    }

    public abstract ohm.c b(int i, int i2, Object obj2);

    public abstract b c(int i, int i2, Object obj2, Object obj3, c cVar);

    public p d() {
        return new j(this);
    }

    public abstract boolean isEmpty();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return d().map(new com.google.android.material.color.utilities.f(7));
    }

    public abstract int size();

    public final String toString() {
        return d().map(new com.google.android.material.color.utilities.f(7)).map(new com.google.android.material.color.utilities.f(6)).V5("HashArrayMappedTrie(");
    }
}
