package com.google.android.gms.common.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
public final class Asserts {
    private Asserts() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkMainThread(@NonNull String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String strValueOf = String.valueOf(Thread.currentThread());
        String strValueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb6 = new StringBuilder(strValueOf2.length() + strValueOf.length() + 56 + 1);
        j6.a.D(sb6, "checkMainThread: current thread ", strValueOf, " IS NOT the main thread ", strValueOf2);
        sb6.append("!");
        sb6.toString();
        throw new IllegalStateException(str);
    }

    @KeepForSdk
    public static void checkNotMainThread(@NonNull String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        String strValueOf = String.valueOf(Thread.currentThread());
        String strValueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb6 = new StringBuilder(strValueOf2.length() + strValueOf.length() + 55 + 1);
        j6.a.D(sb6, "checkNotMainThread: current thread ", strValueOf, " IS the main thread ", strValueOf2);
        sb6.append("!");
        sb6.toString();
        throw new IllegalStateException(str);
    }

    @KeepForSdk
    public static void checkNotNull(Object obj2) {
        if (obj2 == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    @KeepForSdk
    public static void checkNull(Object obj2) {
        if (obj2 != null) {
            throw new IllegalArgumentException("non-null reference");
        }
    }

    @KeepForSdk
    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @KeepForSdk
    public static void checkNotNull(Object obj2, @NonNull Object obj3) {
        if (obj2 == null) {
            throw new IllegalArgumentException(String.valueOf(obj3));
        }
    }

    @KeepForSdk
    public static void checkNull(Object obj2, @NonNull Object obj3) {
        if (obj2 != null) {
            throw new IllegalArgumentException(String.valueOf(obj3));
        }
    }

    @KeepForSdk
    public static void checkState(boolean z, @NonNull Object obj2) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj2));
        }
    }
}
