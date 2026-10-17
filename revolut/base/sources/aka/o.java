package aka;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class o implements Map<String, String>, pim.a {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f5766b = {yhm.j.c(yhm.k.PUBLICATION, new aj0.o(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f5767a;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ String compute(String str, BiFunction<? super String, ? super String, ? extends String> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ String computeIfAbsent(String str, Function<? super String, ? extends String> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ String computeIfPresent(String str, BiFunction<? super String, ? super String, ? extends String> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj2) {
        if (!(obj2 instanceof String)) {
            return false;
        }
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f5767a.containsKey(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj2) {
        if (!(obj2 instanceof String)) {
            return false;
        }
        String value = (String) obj2;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f5767a.containsValue(value);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, String>> entrySet() {
        return this.f5767a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj2) {
        if (obj2 instanceof o) {
            return Intrinsics.f(this.f5767a, ((o) obj2).f5767a);
        }
        return false;
    }

    @Override // java.util.Map
    public final String get(Object obj2) {
        if (!(obj2 instanceof String)) {
            return null;
        }
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(key, "key");
        return (String) this.f5767a.get(key);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f5767a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f5767a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f5767a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ String merge(String str, String str2, BiFunction<? super String, ? super String, ? extends String> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ String put(String str, String str2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends String> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ String putIfAbsent(String str, String str2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final String remove(Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ String replace(String str, String str2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super String, ? extends String> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f5767a.size();
    }

    public final String toString() {
        return "ProductArticlesConfig(map=" + this.f5767a + ")";
    }

    @Override // java.util.Map
    public final Collection<String> values() {
        return this.f5767a.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, String str2, String str3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
