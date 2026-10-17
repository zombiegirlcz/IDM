package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class StorageKt {
    @NotNull
    public static final <T> T getValue(@NotNull NotNullLazyValue<? extends T> notNullLazyValue, Object obj2, @NotNull KProperty p2) {
        Intrinsics.checkNotNullParameter(notNullLazyValue, "<this>");
        Intrinsics.checkNotNullParameter(p2, "p");
        return (T) notNullLazyValue.invoke();
    }

    public static final <T> T getValue(@NotNull NullableLazyValue<? extends T> nullableLazyValue, Object obj2, @NotNull KProperty p2) {
        Intrinsics.checkNotNullParameter(nullableLazyValue, "<this>");
        Intrinsics.checkNotNullParameter(p2, "p");
        return (T) nullableLazyValue.invoke();
    }
}
