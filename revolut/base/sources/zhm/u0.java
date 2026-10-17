package zhm;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes14.dex */
public final class u0 implements ListIterator, pim.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListIterator f322480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f322481b;

    public u0(v0 v0Var, int i) {
        this.f322481b = v0Var;
        this.f322480a = v0Var.f322482a.listIterator(b0.K(i, v0Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj2) {
        ListIterator listIterator = this.f322480a;
        listIterator.add(obj2);
        listIterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f322480a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f322480a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f322480a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return v.j(this.f322481b) - this.f322480a.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f322480a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return v.j(this.f322481b) - this.f322480a.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f322480a.remove();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj2) {
        this.f322480a.set(obj2);
    }
}
