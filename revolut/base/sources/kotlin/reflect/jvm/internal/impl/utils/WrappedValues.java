package kotlin.reflect.jvm.internal.impl.utils;

import mkm.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class WrappedValues {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ah.a f187883a = new ah.a(10);
    public static volatile boolean throwWrappedProcessCanceledException;

    /* JADX INFO: loaded from: classes14.dex */
    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th10) {
            super("Rethrow stored exception", th10);
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i == 1 || i == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i != 1 && i != 2) {
            if (i == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static <V> Object escapeNull(V v) {
        return v == null ? f187883a : v;
    }

    @NotNull
    public static Object escapeThrowable(@NotNull Throwable th10) {
        if (th10 != null) {
            return new g(th10);
        }
        a(3);
        throw null;
    }

    public static <V> V unescapeExceptionOrNull(@NotNull Object obj2) {
        if (obj2 != null) {
            return (V) unescapeNull(unescapeThrowable(obj2));
        }
        a(4);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V unescapeNull(@NotNull Object obj2) {
        if (obj2 == 0) {
            a(0);
            throw null;
        }
        if (obj2 == f187883a) {
            return null;
        }
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V unescapeThrowable(Object obj2) {
        if (!(obj2 instanceof g)) {
            return obj2;
        }
        Throwable th10 = ((g) obj2).f206512a;
        if (th10 == null) {
            g.a(1);
            throw null;
        }
        if (throwWrappedProcessCanceledException && ExceptionUtilsKt.isProcessCanceledException(th10)) {
            throw new WrappedProcessCanceledException(th10);
        }
        throw ExceptionUtilsKt.rethrow(th10);
    }
}
