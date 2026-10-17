package qmm;

import java.util.Iterator;
import omm.c;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements Iterator, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f247852a;

    public b(Iterator it8) {
        this.f247852a = it8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f247852a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f247852a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove() is not supported");
    }
}
