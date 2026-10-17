package com.google.common.base;

import a0.d;
import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Preconditions {
    private Preconditions() {
    }

    private static String badElementIndex(int i, int i2, String str) {
        if (i < 0) {
            return Strings.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return Strings.lenientFormat("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(d.n("negative size: ", i2));
    }

    private static String badPositionIndex(int i, int i2, String str) {
        if (i < 0) {
            return Strings.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return Strings.lenientFormat("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(d.n("negative size: ", i2));
    }

    private static String badPositionIndexes(int i, int i2, int i3) {
        return (i < 0 || i > i3) ? badPositionIndex(i, i3, "start index") : (i2 < 0 || i2 > i3) ? badPositionIndex(i2, i3, "end index") : Strings.lenientFormat("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static int checkElementIndex(int i, int i2) {
        return checkElementIndex(i, i2, "index");
    }

    public static <T> T checkNotNull(T t2) {
        t2.getClass();
        return t2;
    }

    public static int checkPositionIndex(int i, int i2) {
        return checkPositionIndex(i, i2, "index");
    }

    public static void checkPositionIndexes(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(badPositionIndexes(i, i2, i3));
        }
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

    public static int checkPositionIndex(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(badPositionIndex(i, i2, str));
        }
        return i;
    }

    public static void checkState(boolean z, Object obj2) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj2));
        }
    }

    public static void checkArgument(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, objArr));
        }
    }

    public static <T> T checkNotNull(T t2, String str, Object... objArr) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, objArr));
    }

    public static void checkState(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, objArr));
        }
    }

    public static void checkArgument(boolean z, String str, char c2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c2)));
        }
    }

    public static <T> T checkNotNull(T t2, String str, char c2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c2)));
    }

    public static void checkState(boolean z, String str, char c2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c2)));
        }
    }

    public static void checkArgument(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i)));
        }
    }

    public static <T> T checkNotNull(T t2, String str, int i) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i)));
    }

    public static void checkState(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i)));
        }
    }

    public static void checkArgument(boolean z, String str, long j2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j2)));
        }
    }

    public static <T> T checkNotNull(T t2, String str, long j2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j2)));
    }

    public static void checkState(boolean z, String str, long j2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j2)));
        }
    }

    public static void checkArgument(boolean z, String str, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj2));
        }
    }

    public static <T> T checkNotNull(T t2, String str, Object obj2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj2));
    }

    public static void checkState(boolean z, String str, Object obj2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj2));
        }
    }

    public static void checkArgument(boolean z, String str, char c2, char c3) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c2), Character.valueOf(c3)));
        }
    }

    public static <T> T checkNotNull(T t2, String str, char c2, char c3) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c2), Character.valueOf(c3)));
    }

    public static void checkState(boolean z, String str, char c2, char c3) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c2), Character.valueOf(c3)));
        }
    }

    public static void checkArgument(boolean z, String str, char c2, int i) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c2), Integer.valueOf(i)));
        }
    }

    public static <T> T checkNotNull(T t2, String str, char c2, int i) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c2), Integer.valueOf(i)));
    }

    public static void checkState(boolean z, String str, char c2, int i) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c2), Integer.valueOf(i)));
        }
    }

    public static void checkArgument(boolean z, String str, char c2, long j2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c2), Long.valueOf(j2)));
        }
    }

    public static <T> T checkNotNull(T t2, String str, char c2, long j2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c2), Long.valueOf(j2)));
    }

    public static void checkState(boolean z, String str, char c2, long j2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c2), Long.valueOf(j2)));
        }
    }

    public static void checkArgument(boolean z, String str, char c2, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c2), obj2));
        }
    }

    public static <T> T checkNotNull(T t2, String str, char c2, Object obj2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c2), obj2));
    }

    public static void checkState(boolean z, String str, char c2, Object obj2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c2), obj2));
        }
    }

    public static void checkArgument(boolean z, String str, int i, char c2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i), Character.valueOf(c2)));
        }
    }

    public static <T> T checkNotNull(T t2, String str, int i, char c2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i), Character.valueOf(c2)));
    }

    public static void checkState(boolean z, String str, int i, char c2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i), Character.valueOf(c2)));
        }
    }

    public static void checkArgument(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static <T> T checkNotNull(T t2, String str, int i, int i2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void checkState(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void checkArgument(boolean z, String str, int i, long j2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i), Long.valueOf(j2)));
        }
    }

    public static <T> T checkNotNull(T t2, String str, int i, long j2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i), Long.valueOf(j2)));
    }

    public static void checkState(boolean z, String str, int i, long j2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i), Long.valueOf(j2)));
        }
    }

    public static void checkArgument(boolean z, String str, int i, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i), obj2));
        }
    }

    public static <T> T checkNotNull(T t2, String str, int i, Object obj2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i), obj2));
    }

    public static void checkState(boolean z, String str, int i, Object obj2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i), obj2));
        }
    }

    public static void checkArgument(boolean z, String str, long j2, char c2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j2), Character.valueOf(c2)));
        }
    }

    public static <T> T checkNotNull(T t2, String str, long j2, char c2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j2), Character.valueOf(c2)));
    }

    public static void checkState(boolean z, String str, long j2, char c2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j2), Character.valueOf(c2)));
        }
    }

    public static void checkArgument(boolean z, String str, long j2, int i) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    public static <T> T checkNotNull(T t2, String str, long j2, int i) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j2), Integer.valueOf(i)));
    }

    public static void checkState(boolean z, String str, long j2, int i) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    public static void checkArgument(boolean z, String str, long j2, long j3) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    public static <T> T checkNotNull(T t2, String str, long j2, long j3) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j2), Long.valueOf(j3)));
    }

    public static void checkState(boolean z, String str, long j2, long j3) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    public static void checkArgument(boolean z, String str, long j2, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j2), obj2));
        }
    }

    public static <T> T checkNotNull(T t2, String str, long j2, Object obj2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j2), obj2));
    }

    public static void checkState(boolean z, String str, long j2, Object obj2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j2), obj2));
        }
    }

    public static void checkArgument(boolean z, String str, Object obj2, char c2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj2, Character.valueOf(c2)));
        }
    }

    public static <T> T checkNotNull(T t2, String str, Object obj2, char c2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj2, Character.valueOf(c2)));
    }

    public static void checkState(boolean z, String str, Object obj2, char c2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj2, Character.valueOf(c2)));
        }
    }

    public static void checkArgument(boolean z, String str, Object obj2, int i) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj2, Integer.valueOf(i)));
        }
    }

    public static <T> T checkNotNull(T t2, String str, Object obj2, int i) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj2, Integer.valueOf(i)));
    }

    public static void checkState(boolean z, String str, Object obj2, int i) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj2, Integer.valueOf(i)));
        }
    }

    public static void checkArgument(boolean z, String str, Object obj2, long j2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj2, Long.valueOf(j2)));
        }
    }

    public static <T> T checkNotNull(T t2, String str, Object obj2, long j2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj2, Long.valueOf(j2)));
    }

    public static void checkState(boolean z, String str, Object obj2, long j2) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj2, Long.valueOf(j2)));
        }
    }

    public static void checkArgument(boolean z, String str, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj2, obj3));
        }
    }

    public static <T> T checkNotNull(T t2, String str, Object obj2, Object obj3) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj2, obj3));
    }

    public static void checkState(boolean z, String str, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj2, obj3));
        }
    }

    public static void checkArgument(boolean z, String str, Object obj2, Object obj3, Object obj4) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj2, obj3, obj4));
        }
    }

    public static <T> T checkNotNull(T t2, String str, Object obj2, Object obj3, Object obj4) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj2, obj3, obj4));
    }

    public static void checkState(boolean z, String str, Object obj2, Object obj3, Object obj4) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj2, obj3, obj4));
        }
    }

    public static void checkArgument(boolean z, String str, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (!z) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj2, obj3, obj4, obj5));
        }
    }

    public static <T> T checkNotNull(T t2, String str, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj2, obj3, obj4, obj5));
    }

    public static void checkState(boolean z, String str, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (!z) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj2, obj3, obj4, obj5));
        }
    }
}
