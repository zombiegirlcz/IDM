package smm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements List, Collection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f264457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f264458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f264459c;

    public b(c cVar, Object obj2) {
        this.f264459c = cVar;
        this.f264458b = cVar;
        this.f264457a = obj2;
    }

    public final List a() {
        return (List) this.f264459c.f264461b.get(this.f264457a);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj2) {
        List listA = a();
        if (listA == null) {
            c cVar = this.f264458b;
            ArrayList arrayListC = ((f) cVar).c();
            cVar.f264461b.put(this.f264457a, arrayListC);
            listA = arrayListC;
        }
        return listA.add(obj2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        List listA = a();
        if (listA == null) {
            c cVar = this.f264458b;
            ArrayList arrayListC = ((f) cVar).c();
            cVar.f264461b.put(this.f264457a, arrayListC);
            listA = arrayListC;
        }
        return listA.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        List listA = a();
        if (listA != null) {
            listA.clear();
            this.f264458b.b(this.f264457a);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj2) {
        List listA = a();
        if (listA == null) {
            return false;
        }
        return listA.contains(obj2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        List listA = a();
        if (listA == null) {
            return false;
        }
        return listA.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj2) {
        List listA = a();
        if (listA == null) {
            return Collections.EMPTY_LIST.equals(obj2);
        }
        if (!(obj2 instanceof List)) {
            return false;
        }
        List list = (List) obj2;
        if (listA == list) {
            return true;
        }
        if (listA.size() == list.size()) {
            Iterator it8 = listA.iterator();
            Iterator it9 = list.iterator();
            while (it8.hasNext() && it9.hasNext()) {
                Object next = it8.next();
                Object next2 = it9.next();
                if (next == null) {
                    if (next2 != null) {
                        break;
                    }
                } else if (!next.equals(next2)) {
                    break;
                }
            }
            if (it8.hasNext() || it9.hasNext()) {
                break;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        List listA = a();
        if (listA == null) {
            listA = Collections.EMPTY_LIST;
        }
        return listA.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        List listA = a();
        if (listA == null) {
            return 0;
        }
        Iterator it8 = listA.iterator();
        int iHashCode = 1;
        while (it8.hasNext()) {
            Object next = it8.next();
            iHashCode = (iHashCode * 31) + (next == null ? 0 : next.hashCode());
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj2) {
        List listA = a();
        if (listA == null) {
            listA = Collections.EMPTY_LIST;
        }
        return listA.indexOf(obj2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        List listA = a();
        if (listA == null) {
            return true;
        }
        return listA.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return a() == null ? qmm.a.f247851a : new e(this.f264458b, this.f264457a);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj2) {
        List listA = a();
        if (listA == null) {
            listA = Collections.EMPTY_LIST;
        }
        return listA.lastIndexOf(obj2);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new a(this.f264459c, this.f264457a);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj2) {
        List listA = a();
        if (listA == null) {
            return false;
        }
        boolean zRemove = listA.remove(obj2);
        if (listA.isEmpty()) {
            this.f264458b.b(this.f264457a);
        }
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        List listA = a();
        if (listA == null) {
            return false;
        }
        boolean zRemoveAll = listA.removeAll(collection);
        if (listA.isEmpty()) {
            this.f264458b.b(this.f264457a);
        }
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        List listA = a();
        if (listA == null) {
            return false;
        }
        boolean zRetainAll = listA.retainAll(collection);
        if (listA.isEmpty()) {
            this.f264458b.b(this.f264457a);
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj2) {
        List listA = a();
        if (listA == null) {
            listA = Collections.EMPTY_LIST;
        }
        return listA.set(i, obj2);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        List listA = a();
        if (listA == null) {
            return 0;
        }
        return listA.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        List listA = a();
        if (listA == null) {
            listA = Collections.EMPTY_LIST;
        }
        return listA.subList(i, i2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        List listA = a();
        return listA == null ? omm.a.f226859a.toArray() : listA.toArray();
    }

    public final String toString() {
        List listA = a();
        return listA == null ? omm.a.f226859a.toString() : listA.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new a(this.f264459c, this.f264457a, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        List listA = a();
        if (listA == null) {
            return omm.a.f226859a.toArray(objArr);
        }
        return listA.toArray(objArr);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        List listA = a();
        if (listA == null) {
            listA = Collections.EMPTY_LIST;
        }
        Object objRemove = listA.remove(i);
        if (listA.isEmpty()) {
            this.f264459c.b(this.f264457a);
        }
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj2) {
        List listA = a();
        if (listA == null) {
            c cVar = this.f264459c;
            ArrayList arrayListC = ((f) cVar).c();
            cVar.f264461b.put(this.f264457a, arrayListC);
            listA = arrayListC;
        }
        listA.add(i, obj2);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        List listA = a();
        if (listA == null) {
            c cVar = this.f264459c;
            ArrayList arrayListC = ((f) cVar).c();
            boolean zAddAll = arrayListC.addAll(i, collection);
            if (zAddAll) {
                cVar.f264461b.put(this.f264457a, arrayListC);
            }
            return zAddAll;
        }
        return listA.addAll(i, collection);
    }
}
