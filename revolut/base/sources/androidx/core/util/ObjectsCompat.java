package androidx.core.util;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class ObjectsCompat {
    public static boolean equals(Object obj2, Object obj3) {
        return Objects.equals(obj2, obj3);
    }

    public static int hash(Object... objArr) {
        return Objects.hash(objArr);
    }

    public static <T> T requireNonNull(T t2) {
        t2.getClass();
        return t2;
    }

    public static String toString(Object obj2, String str) {
        return obj2 != null ? obj2.toString() : str;
    }

    public static <T> T requireNonNull(T t2, String str) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(str);
    }
}
