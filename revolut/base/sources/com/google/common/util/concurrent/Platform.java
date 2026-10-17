package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
final class Platform {
    private Platform() {
    }

    public static boolean isInstanceOfThrowableClass(Throwable th10, Class<? extends Throwable> cls) {
        return cls.isInstance(th10);
    }

    public static void restoreInterruptIfIsInterruptedException(Throwable th10) {
        Preconditions.checkNotNull(th10);
        if (th10 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
