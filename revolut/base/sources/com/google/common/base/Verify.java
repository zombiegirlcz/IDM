package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Verify {
    private Verify() {
    }

    public static void verify(boolean z) {
        if (!z) {
            throw new VerifyException();
        }
    }

    public static <T> T verifyNotNull(T t2) {
        return (T) verifyNotNull(t2, "expected a non-null reference", new Object[0]);
    }

    public static void verify(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, objArr));
        }
    }

    public static <T> T verifyNotNull(T t2, String str, Object... objArr) {
        if (t2 != null) {
            return t2;
        }
        throw new VerifyException(Strings.lenientFormat(str, objArr));
    }

    public static void verify(boolean z, String str, char c2) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c2)));
        }
    }

    public static void verify(boolean z, String str, int i) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i)));
        }
    }

    public static void verify(boolean z, String str, long j2) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j2)));
        }
    }

    public static void verify(boolean z, String str, Object obj2) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, obj2));
        }
    }

    public static void verify(boolean z, String str, char c2, char c3) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c2), Character.valueOf(c3)));
        }
    }

    public static void verify(boolean z, String str, int i, char c2) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i), Character.valueOf(c2)));
        }
    }

    public static void verify(boolean z, String str, long j2, char c2) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j2), Character.valueOf(c2)));
        }
    }

    public static void verify(boolean z, String str, Object obj2, char c2) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, obj2, Character.valueOf(c2)));
        }
    }

    public static void verify(boolean z, String str, char c2, int i) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c2), Integer.valueOf(i)));
        }
    }

    public static void verify(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void verify(boolean z, String str, long j2, int i) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    public static void verify(boolean z, String str, Object obj2, int i) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, obj2, Integer.valueOf(i)));
        }
    }

    public static void verify(boolean z, String str, char c2, long j2) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c2), Long.valueOf(j2)));
        }
    }

    public static void verify(boolean z, String str, int i, long j2) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i), Long.valueOf(j2)));
        }
    }

    public static void verify(boolean z, String str, long j2, long j3) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    public static void verify(boolean z, String str, Object obj2, long j2) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, obj2, Long.valueOf(j2)));
        }
    }

    public static void verify(boolean z, String str, char c2, Object obj2) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c2), obj2));
        }
    }

    public static void verify(boolean z, String str, int i, Object obj2) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i), obj2));
        }
    }

    public static void verify(boolean z, String str, long j2, Object obj2) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j2), obj2));
        }
    }

    public static void verify(boolean z, String str, Object obj2, Object obj3) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, obj2, obj3));
        }
    }

    public static void verify(boolean z, String str, Object obj2, Object obj3, Object obj4) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, obj2, obj3, obj4));
        }
    }

    public static void verify(boolean z, String str, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (!z) {
            throw new VerifyException(Strings.lenientFormat(str, obj2, obj3, obj4, obj5));
        }
    }
}
