package mkm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public final class f implements Iterator, pim.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f206510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f206511b = true;

    public f(Object obj2) {
        this.f206510a = obj2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f206511b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f206511b) {
            throw new NoSuchElementException();
        }
        this.f206511b = false;
        return this.f206510a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
