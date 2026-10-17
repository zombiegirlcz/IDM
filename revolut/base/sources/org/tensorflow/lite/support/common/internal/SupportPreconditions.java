package org.tensorflow.lite.support.common.internal;

import a0.d;

/* JADX INFO: loaded from: classes14.dex */
public final class SupportPreconditions {
    private SupportPreconditions() {
        throw new AssertionError("SupportPreconditions is Uninstantiable.");
    }

    private static String badElementIndex(int i, int i2, String str) {
        if (i < 0) {
            return str + " (" + i + ") must not be negative";
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(d.n("negative size: ", i2));
        }
        return str + " (" + i + ") must be less than size (" + i2 + ")";
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static int checkElementIndex(int i, int i2) {
        return checkElementIndex(i, i2, "index");
    }

    public static String checkNotEmpty(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Given String is empty or null.");
        }
        return str;
    }

    public static <T> T checkNotNull(T t2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("The object reference is null.");
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void checkArgument(boolean z, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    public static int checkElementIndex(int i, int i2, String str) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(badElementIndex(i, i2, str));
        }
        return i;
    }

    public static <T> T checkNotNull(T t2, Object obj2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void checkState(boolean z, Object obj2) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj2));
        }
    }

    public static String checkNotEmpty(String str, Object obj2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
        return str;
    }
}
