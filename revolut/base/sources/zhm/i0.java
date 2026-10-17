package zhm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public abstract class i0 implements Iterator, pim.a {
    public abstract float a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Float.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
