package smm;

import com.google.protobuf.d3;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Map f264462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f264463b;

    public d(c cVar, HashMap map) {
        this.f264463b = cVar;
        this.f264462a = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f264463b.f264461b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj2) {
        return this.f264462a.containsKey(obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new d3(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj2) {
        return this == obj2 || this.f264462a.equals(obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj2) {
        if (((Collection) this.f264462a.get(obj2)) == null) {
            return null;
        }
        c cVar = this.f264463b;
        cVar.getClass();
        return new b(cVar, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f264462a.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f264463b.f264461b.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj2) {
        Collection collection = (Collection) this.f264462a.remove(obj2);
        if (collection == null) {
            return null;
        }
        ArrayList arrayListC = ((f) this.f264463b).c();
        arrayListC.addAll(collection);
        collection.clear();
        return arrayListC;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f264462a.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f264462a.toString();
    }
}
