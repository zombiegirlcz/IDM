package zc;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements ListIterator, Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f320980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f320981b;

    public e(int i, int i2) {
        if (i2 < 0 || i2 > i) {
            throw new IndexOutOfBoundsException(vc.s.l(i2, i, "index"));
        }
        this.f320980a = i;
        this.f320981b = i2;
    }

    public abstract Object a(int i);

    @Override // java.util.ListIterator
    public final void add(Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f320981b < this.f320980a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f320981b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f320981b;
        this.f320981b = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f320981b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f320981b - 1;
        this.f320981b = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f320981b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj2) {
        throw new UnsupportedOperationException();
    }
}
