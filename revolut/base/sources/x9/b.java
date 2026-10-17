package x9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements Iterator, Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f303496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f303497b = 0;

    public b(Object[] objArr) {
        this.f303496a = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f303497b < this.f303496a.length;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f303497b;
        Object[] objArr = this.f303496a;
        if (i >= objArr.length) {
            throw new NoSuchElementException();
        }
        this.f303497b = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
