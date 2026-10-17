package zhm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public abstract class s implements Iterator, pim.a {
    public abstract char a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
