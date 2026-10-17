package zfm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends AtomicInteger implements List, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f322042a = new ArrayList();

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj2) {
        ArrayList arrayList = this.f322042a;
        boolean zAdd = arrayList.add(obj2);
        lazySet(arrayList.size());
        return zAdd;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        ArrayList arrayList = this.f322042a;
        boolean zAddAll = arrayList.addAll(collection);
        lazySet(arrayList.size());
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f322042a.clear();
        lazySet(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj2) {
        return this.f322042a.contains(obj2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f322042a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj2) {
        boolean z = obj2 instanceof o;
        ArrayList arrayList = this.f322042a;
        return z ? arrayList.equals(((o) obj2).f322042a) : arrayList.equals(obj2);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f322042a.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f322042a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj2) {
        return this.f322042a.indexOf(obj2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return get() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f322042a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj2) {
        return this.f322042a.lastIndexOf(obj2);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f322042a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj2) {
        ArrayList arrayList = this.f322042a;
        boolean zRemove = arrayList.remove(obj2);
        lazySet(arrayList.size());
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        ArrayList arrayList = this.f322042a;
        boolean zRemoveAll = arrayList.removeAll(collection);
        lazySet(arrayList.size());
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        ArrayList arrayList = this.f322042a;
        boolean zRetainAll = arrayList.retainAll(collection);
        lazySet(arrayList.size());
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj2) {
        return this.f322042a.set(i, obj2);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return get();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.f322042a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f322042a.toArray();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return this.f322042a.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.f322042a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f322042a.toArray(objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj2) {
        ArrayList arrayList = this.f322042a;
        arrayList.add(i, obj2);
        lazySet(arrayList.size());
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        ArrayList arrayList = this.f322042a;
        boolean zAddAll = arrayList.addAll(i, collection);
        lazySet(arrayList.size());
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        ArrayList arrayList = this.f322042a;
        Object objRemove = arrayList.remove(i);
        lazySet(arrayList.size());
        return objRemove;
    }
}
