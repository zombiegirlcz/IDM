package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: loaded from: classes13.dex */
public class Intrinsics {
    public static boolean a(float f, Float f4) {
        return f4 != null && f == f4.floatValue();
    }

    public static boolean b(Double d, double d5) {
        return d != null && d.doubleValue() == d5;
    }

    public static boolean c(Double d, Double d5) {
        return d == null ? d5 == null : d5 != null && d.doubleValue() == d5.doubleValue();
    }

    public static void checkNotNullExpressionValue(Object obj2, String str) {
        if (obj2 != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(a0.d.r(str, " must not be null"));
        n(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void checkNotNullParameter(Object obj2, String str) {
        if (obj2 != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(m(str));
        n(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static boolean d(Float f, float f4) {
        return f != null && f.floatValue() == f4;
    }

    public static boolean e(Float f, Float f4) {
        return f == null ? f4 == null : f4 != null && f.floatValue() == f4.floatValue();
    }

    public static boolean f(Object obj2, Object obj3) {
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public static void g(Object obj2, String str) {
        if (obj2 != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        n(illegalStateException, Intrinsics.class.getName());
        throw illegalStateException;
    }

    public static void h(Object obj2) {
        if (obj2 != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        n(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void i(Object obj2, String str) {
        if (obj2 != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        n(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void j(Object obj2, String str) {
        if (obj2 != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m(str));
        n(illegalArgumentException, Intrinsics.class.getName());
        throw illegalArgumentException;
    }

    public static int k(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int l(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static String m(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder sbM = v0.a.m("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbM.append(str);
        return sbM.toString();
    }

    public static void n(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static String o(Object obj2, String str) {
        return str + obj2;
    }

    public static void p() {
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
        n(kotlinNullPointerException, Intrinsics.class.getName());
        throw kotlinNullPointerException;
    }

    public static void q() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void r(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(p.a.p("lateinit property ", str, " has not been initialized"));
        n(uninitializedPropertyAccessException, Intrinsics.class.getName());
        throw uninitializedPropertyAccessException;
    }
}
