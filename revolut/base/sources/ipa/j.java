package ipa;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements Map, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f167702a;

    public j(Map data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f167702a = data;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object compute(Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj2, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj2) {
        if (!(obj2 instanceof String)) {
            return false;
        }
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f167702a.containsKey(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj2) {
        if (!(obj2 instanceof String)) {
            return false;
        }
        String value = (String) obj2;
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f167702a.containsValue(value);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f167702a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f167702a, ((j) obj2).f167702a);
    }

    @Override // java.util.Map
    public final Object get(Object obj2) {
        if (!(obj2 instanceof String)) {
            return null;
        }
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        return (String) this.f167702a.get(key);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f167702a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f167702a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f167702a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object merge(Object obj2, Object obj3, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object replace(Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f167702a.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f167702a.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(Object obj2, Object obj3, Object obj4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
