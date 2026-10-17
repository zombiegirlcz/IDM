package zhm;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes13.dex */
public final class w0 implements ListIterator, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListIterator f322483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.text.m f322484b;

    public w0(kotlin.text.m mVar, int i) {
        this.f322484b = mVar;
        this.f322483a = ((List) mVar.f187917b).listIterator(b0.K(i, mVar));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f322483a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f322483a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f322483a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return v.j(this.f322484b) - this.f322483a.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f322483a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return v.j(this.f322484b) - this.f322483a.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
