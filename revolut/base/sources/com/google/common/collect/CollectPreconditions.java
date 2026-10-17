package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class CollectPreconditions {
    public static void checkEntryNotNull(Object obj2, Object obj3) {
        if (obj2 == null) {
            throw new NullPointerException(a0.d.m(obj3, "null key in entry: null="));
        }
        if (obj3 == null) {
            throw new NullPointerException(v0.a.h(obj2, "null value in entry: ", "=null"));
        }
    }

    public static int checkNonnegative(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(com.google.android.gms.internal.mlkit_vision_face.a.k(i, str, " cannot be negative but was: "));
    }

    public static void checkPositive(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException(com.google.android.gms.internal.mlkit_vision_face.a.k(i, str, " must be positive but was: "));
        }
    }

    public static void checkRemove(boolean z) {
        Preconditions.checkState(z, "no calls to next() since the last call to remove()");
    }

    public static long checkNonnegative(long j2, String str) {
        if (j2 >= 0) {
            return j2;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + j2);
    }
}
