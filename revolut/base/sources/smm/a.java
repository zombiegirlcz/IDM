package smm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f264454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f264455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ListIterator f264456c;
    public final /* synthetic */ c d;

    public a(c cVar, Object obj2) {
        this.d = cVar;
        this.f264454a = obj2;
        List list = (List) cVar.f264461b.get(obj2);
        list = list == null ? Collections.EMPTY_LIST : list;
        this.f264455b = list;
        this.f264456c = list.listIterator();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj2) {
        c cVar = this.d;
        HashMap map = cVar.f264461b;
        Object obj3 = this.f264454a;
        if (map.get(obj3) == null) {
            ArrayList arrayListC = ((f) cVar).c();
            cVar.f264461b.put(obj3, arrayListC);
            this.f264455b = arrayListC;
            this.f264456c = arrayListC.listIterator();
        }
        this.f264456c.add(obj2);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f264456c.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f264456c.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f264456c.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f264456c.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f264456c.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f264456c.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f264456c.remove();
        if (this.f264455b.isEmpty()) {
            this.d.f264461b.remove(this.f264454a);
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj2) {
        this.f264456c.set(obj2);
    }

    public a(c cVar, Object obj2, int i) {
        this.d = cVar;
        this.f264454a = obj2;
        List list = (List) cVar.f264461b.get(obj2);
        list = list == null ? Collections.EMPTY_LIST : list;
        this.f264455b = list;
        this.f264456c = list.listIterator(i);
    }
}
