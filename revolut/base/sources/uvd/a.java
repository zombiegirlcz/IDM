package uvd;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import wtd.b;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements Map, pim.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f283355b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f283356a = r0.k(new Pair("REQUESTED", b.REQUESTED), new Pair("COMPLETED", b.COMPLETED));

    private a() {
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

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.Map
    public final boolean containsKey(Object obj2) {
        if (!(obj2 instanceof String)) {
            return false;
        }
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f283356a.containsKey(key);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.Map
    public final boolean containsValue(Object obj2) {
        if (!(obj2 instanceof b)) {
            return false;
        }
        b value = (b) obj2;
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f283356a.containsValue(value);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.Map
    public final Set entrySet() {
        return this.f283356a.entrySet();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.Map
    public final Object get(Object obj2) {
        if (!(obj2 instanceof String)) {
            return null;
        }
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        return (b) this.f283356a.get(key);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f283356a.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.Map
    public final Set keySet() {
        return this.f283356a.keySet();
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.Map
    public final int size() {
        return this.f283356a.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.Map
    public final Collection values() {
        return this.f283356a.values();
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
