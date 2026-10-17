package zhm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public abstract class r implements Iterator, pim.a {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Byte.valueOf(nextByte());
    }

    public abstract byte nextByte();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
