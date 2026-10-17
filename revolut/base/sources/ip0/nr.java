package ip0;

import android.text.InputFilter;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class nr implements List, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f165562a;

    public nr(List filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f165562a = filters;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj2) {
        if (!(obj2 instanceof InputFilter)) {
            return false;
        }
        InputFilter element = (InputFilter) obj2;
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f165562a.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f165562a.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj2) {
        if (obj2 instanceof nr) {
            List list = ((nr) obj2).f165562a;
            int size = list.size();
            List list2 = this.f165562a;
            if (size == list2.size()) {
                int size2 = list2.size();
                for (int i = 0; i < size2; i++) {
                    InputFilter inputFilter = (InputFilter) list2.get(i);
                    InputFilter inputFilter2 = (InputFilter) list.get(i);
                    if (!Intrinsics.f(inputFilter, inputFilter2) && !inputFilter.getClass().equals(inputFilter2.getClass())) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (InputFilter) this.f165562a.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.List
    public final int indexOf(Object obj2) {
        if (!(obj2 instanceof InputFilter)) {
            return -1;
        }
        InputFilter element = (InputFilter) obj2;
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f165562a.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f165562a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f165562a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj2) {
        if (!(obj2 instanceof InputFilter)) {
            return -1;
        }
        InputFilter element = (InputFilter) obj2;
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f165562a.lastIndexOf(element);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f165562a.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f165562a.size();
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.f165562a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.u0.j(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nr(InputFilter... args) {
        this(kotlin.collections.d.v0(args));
        Intrinsics.checkNotNullParameter(args, "args");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.f165562a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return kotlin.jvm.internal.u0.k(this, array);
    }
}
