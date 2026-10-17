package vjm;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class k extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f289843a;

    public k(e eVar) {
        this.f289843a = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj2) {
        Map.Entry entry = (Map.Entry) obj2;
        if (contains(entry)) {
            return false;
        }
        this.f289843a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f289843a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        Map.Entry entry = (Map.Entry) obj2;
        Object obj3 = this.f289843a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj3 != value) {
            return obj3 != null && obj3.equals(value);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new j(this.f289843a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj2) {
        Map.Entry entry = (Map.Entry) obj2;
        if (!contains(entry)) {
            return false;
        }
        this.f289843a.remove(entry.getKey());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f289843a.size();
    }
}
