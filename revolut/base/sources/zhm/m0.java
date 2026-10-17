package zhm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public abstract class m0 implements Iterator, pim.a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
