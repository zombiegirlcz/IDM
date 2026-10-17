package nkm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public final class c0 implements Iterator, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f216830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f216831b;

    public c0(d0 d0Var) {
        this.f216831b = d0Var;
        this.f216830a = d0Var.f216835a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f216830a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f216831b.f216836b.invoke(this.f216830a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
