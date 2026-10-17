package oem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes23.dex */
public final class h implements Set, pim.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f224663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f224664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f224665c;
    public final int d;

    public h(Set delegate, Function1 convertTo, Function1 convert) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(convertTo, "convertTo");
        Intrinsics.checkNotNullParameter(convert, "convert");
        this.f224663a = delegate;
        this.f224664b = convertTo;
        this.f224665c = convert;
        this.d = delegate.size();
    }

    public final ArrayList a(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(w.t(collection2, 10));
        Iterator it8 = collection2.iterator();
        while (it8.hasNext()) {
            arrayList.add(this.f224665c.invoke(it8.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj2) {
        return this.f224663a.add(this.f224665c.invoke(obj2));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f224663a.addAll(a(elements));
    }

    public final ArrayList b(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(w.t(collection2, 10));
        Iterator it8 = collection2.iterator();
        while (it8.hasNext()) {
            arrayList.add(this.f224664b.invoke(it8.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f224663a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj2) {
        return this.f224663a.contains(this.f224665c.invoke(obj2));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f224663a.containsAll(a(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj2) {
        if (obj2 == null || !(obj2 instanceof Set)) {
            return false;
        }
        ArrayList arrayListB = b(this.f224663a);
        return ((Set) obj2).containsAll(arrayListB) && arrayListB.containsAll((Collection) obj2);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f224663a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f224663a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj2) {
        return this.f224663a.remove(this.f224665c.invoke(obj2));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f224663a.removeAll(d0.i1(a(elements)));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f224663a.retainAll(d0.i1(a(elements)));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return u0.j(this);
    }

    public final String toString() {
        return b(this.f224663a).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return u0.k(this, array);
    }
}
