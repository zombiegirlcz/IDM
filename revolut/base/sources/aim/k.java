package aim;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class k extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f5334a;

    public k(f backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f5334a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj2) {
        Map.Entry element = (Map.Entry) obj2;
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f5334a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f5334a.e(elements);
    }

    @Override // aim.a
    public final boolean containsEntry(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f5334a.f(element);
    }

    @Override // zhm.j
    public final int getSize() {
        return this.f5334a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5334a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f fVar = this.f5334a;
        fVar.getClass();
        return new g(fVar, 0);
    }

    @Override // aim.a
    public final boolean remove(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        f fVar = this.f5334a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(entry, "entry");
        fVar.c();
        int i = fVar.i(entry.getKey());
        if (i < 0) {
            return false;
        }
        Object[] objArr = fVar.f5321b;
        Intrinsics.h(objArr);
        if (!Intrinsics.f(objArr[i], entry.getValue())) {
            return false;
        }
        fVar.n(i);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f5334a.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f5334a.c();
        return super.retainAll(elements);
    }
}
