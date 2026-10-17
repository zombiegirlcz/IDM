package nkm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public final class s implements Iterator, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f216863a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f216864b;

    public s(Object obj2) {
        this.f216864b = obj2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f216863a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f216863a) {
            throw new NoSuchElementException();
        }
        this.f216863a = false;
        return this.f216864b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
