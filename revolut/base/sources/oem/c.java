package oem;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class c implements Map, pim.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f224657a = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.f224657a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj2) {
        if (!(obj2 instanceof String)) {
            return false;
        }
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f224657a.containsKey(new d(key));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        return this.f224657a.containsValue(obj2);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new h(this.f224657a.entrySet(), new nb.e(14), new nb.e(15));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj2) {
        if (obj2 == null || !(obj2 instanceof c)) {
            return false;
        }
        return Intrinsics.f(((c) obj2).f224657a, this.f224657a);
    }

    @Override // java.util.Map
    public final Object get(Object obj2) {
        if (!(obj2 instanceof String)) {
            return null;
        }
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f224657a.get(a1m.e.i(key));
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f224657a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f224657a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new h(this.f224657a.keySet(), new nb.e(16), new nb.e(17));
    }

    @Override // java.util.Map
    public final Object put(Object obj2, Object value) {
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f224657a.put(a1m.e.i(key), value);
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry entry : from.entrySet()) {
            String key = (String) entry.getKey();
            Object value = entry.getValue();
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f224657a.put(a1m.e.i(key), value);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj2) {
        if (!(obj2 instanceof String)) {
            return null;
        }
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f224657a.remove(a1m.e.i(key));
    }

    @Override // java.util.Map
    public final int size() {
        return this.f224657a.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f224657a.values();
    }
}
