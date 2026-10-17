package zhm;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class v0 extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f322482a;

    public v0(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f322482a = delegate;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj2) {
        this.f322482a.add(b0.K(i, this), obj2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f322482a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f322482a.get(b0.J(i, this));
    }

    @Override // zhm.h
    /* JADX INFO: renamed from: getSize */
    public final int getF186390c() {
        return this.f322482a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new u0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new u0(this, 0);
    }

    @Override // zhm.h
    public final Object removeAt(int i) {
        return this.f322482a.remove(b0.J(i, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj2) {
        return this.f322482a.set(b0.J(i, this), obj2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new u0(this, i);
    }
}
