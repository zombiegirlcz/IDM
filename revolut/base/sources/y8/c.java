package y8;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ArrayMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f311593a;

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final void clear() {
        this.f311593a = 0;
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final int hashCode() {
        if (this.f311593a == 0) {
            this.f311593a = super.hashCode();
        }
        return this.f311593a;
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final Object put(Object obj2, Object obj3) {
        this.f311593a = 0;
        return super.put(obj2, obj3);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final void putAll(SimpleArrayMap simpleArrayMap) {
        this.f311593a = 0;
        super.putAll(simpleArrayMap);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final Object removeAt(int i) {
        this.f311593a = 0;
        return super.removeAt(i);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final Object setValueAt(int i, Object obj2) {
        this.f311593a = 0;
        return super.setValueAt(i, obj2);
    }
}
