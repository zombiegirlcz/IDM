package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner;
import org.jetbrains.annotations.NotNull;
import sim.d;

/* JADX INFO: loaded from: classes14.dex */
public final class NullableArrayMapAccessor<K, V, T extends V> extends AbstractArrayMapOwner.AbstractArrayMapAccessor<K, V, T> implements d {
    public NullableArrayMapAccessor(int i) {
        super(i);
    }

    @Override // sim.d
    public T getValue(@NotNull AbstractArrayMapOwner<K, V> thisRef, @NotNull KProperty property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        return (T) thisRef.a().get(this.f187853a);
    }
}
