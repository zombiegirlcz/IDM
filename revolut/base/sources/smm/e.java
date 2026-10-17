package smm;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public final class e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f264464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f264465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterator f264466c;
    public final /* synthetic */ c d;

    public e(c cVar, Object obj2) {
        this.d = cVar;
        this.f264464a = obj2;
        Collection collection = (Collection) cVar.f264461b.get(obj2);
        this.f264465b = collection;
        this.f264466c = collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f264466c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f264466c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f264466c.remove();
        if (this.f264465b.isEmpty()) {
            this.d.b(this.f264464a);
        }
    }
}
