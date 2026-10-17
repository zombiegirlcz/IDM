package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements LockBasedStorageManager.ExceptionHandlingStrategy {
    @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy
    public final RuntimeException handleException(Throwable th10) {
        if (th10 == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'throwable' of kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1.handleException must not be null");
        }
        throw ExceptionUtilsKt.rethrow(th10);
    }
}
