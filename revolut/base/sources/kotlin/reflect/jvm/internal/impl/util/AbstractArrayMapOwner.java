package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractArrayMapOwner<K, V> implements Iterable<V>, pim.a {

    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class AbstractArrayMapAccessor<K, V, T extends V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f187853a;

        public AbstractArrayMapAccessor(int i) {
            this.f187853a = i;
        }
    }

    public abstract ArrayMap a();

    public abstract TypeAttributes.Companion b();

    public final boolean isEmpty() {
        return a().getSize() == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<V> iterator() {
        return a().iterator();
    }
}
