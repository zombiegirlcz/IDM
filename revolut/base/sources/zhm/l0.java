package zhm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public abstract class l0 implements Iterator, pim.a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
