package kotlin.reflect.jvm.internal.impl.storage;

import dki.h;
import fkm.e;
import fkm.g;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class LockBasedStorageManager implements StorageManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleLock f187746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExceptionHandlingStrategy f187747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f187748c;
    public static final String d = d0.C0(LockBasedStorageManager.class.getCanonicalName(), ".", "");
    public static final StorageManager NO_LOCKS = new a("NO_LOCKS", ExceptionHandlingStrategy.THROW, EmptySimpleLock.INSTANCE);

    public interface ExceptionHandlingStrategy {
        public static final ExceptionHandlingStrategy THROW = new b();

        @NotNull
        RuntimeException handleException(@NotNull Throwable th10);
    }

    public LockBasedStorageManager(String str, ExceptionHandlingStrategy exceptionHandlingStrategy, SimpleLock simpleLock) {
        if (str == null) {
            a(4);
            throw null;
        }
        if (exceptionHandlingStrategy == null) {
            a(5);
            throw null;
        }
        if (simpleLock == null) {
            a(6);
            throw null;
        }
        this.f187746a = simpleLock;
        this.f187747b = exceptionHandlingStrategy;
        this.f187748c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.a(int):void");
    }

    public static void c(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!stackTrace[i].getClassName().startsWith(d)) {
                break;
            } else {
                i++;
            }
        }
        List listSubList = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
    }

    public h b(Object obj2, String str) {
        StringBuilder sb6 = new StringBuilder("Recursion detected ");
        sb6.append(str);
        sb6.append(obj2 == null ? "" : a0.d.m(obj2, "on input: "));
        sb6.append(" under ");
        sb6.append(this);
        AssertionError assertionError = new AssertionError(sb6.toString());
        c(assertionError);
        throw assertionError;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> T compute(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            a(34);
            throw null;
        }
        this.f187746a.lock();
        try {
            return (T) function0.invoke();
        } finally {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> CacheWithNotNullValues<K, V> createCacheWithNotNullValues() {
        return new fkm.c(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> CacheWithNullableValues<K, V> createCacheWithNullableValues() {
        return new e(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createLazyValue(@NotNull Function0<? extends T> function0) {
        if (function0 != null) {
            return new g(this, function0);
        }
        a(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createLazyValueWithPostCompute(@NotNull Function0<? extends T> function0, Function1<? super Boolean, ? extends T> function1, @NotNull Function1<? super T, Unit> function12) {
        if (function0 == null) {
            a(28);
            throw null;
        }
        if (function12 != null) {
            return new fkm.b(this, function0, function1, function12);
        }
        a(29);
        throw null;
    }

    @NotNull
    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            a(14);
            throw null;
        }
        if (concurrentMap == null) {
            a(15);
            throw null;
        }
        if (concurrentMap == null) {
            fkm.h.a(1);
            throw null;
        }
        if (function1 != null) {
            return new fkm.h(this, concurrentMap, function1);
        }
        fkm.h.a(2);
        throw null;
    }

    @NotNull
    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            a(21);
            throw null;
        }
        if (concurrentMap != null) {
            return new d(this, concurrentMap, function1);
        }
        a(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NullableLazyValue<T> createNullableLazyValue(@NotNull Function0<? extends T> function0) {
        if (function0 != null) {
            return new c(this, function0);
        }
        a(30);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createRecursionTolerantLazyValue(@NotNull Function0<? extends T> function0, @NotNull T t2) {
        if (function0 == null) {
            a(26);
            throw null;
        }
        if (t2 != null) {
            return new fkm.a(this, function0, t2);
        }
        a(27);
        throw null;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(getClass().getSimpleName());
        sb6.append("@");
        sb6.append(Integer.toHexString(hashCode()));
        sb6.append(" (");
        return v0.a.i(sb6, this.f187748c, ")");
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(@NotNull Function1<? super K, ? extends V> function1) {
        if (function1 != null) {
            MemoizedFunctionToNullable<K, V> memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues = createMemoizedFunctionWithNullableValues(function1, new ConcurrentHashMap(3, 1.0f, 2));
            if (memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues != null) {
                return memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues;
            }
            a(20);
            throw null;
        }
        a(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(@NotNull Function1<? super K, ? extends V> function1) {
        if (function1 != null) {
            MemoizedFunctionToNotNull<K, V> memoizedFunctionToNotNullCreateMemoizedFunction = createMemoizedFunction(function1, new ConcurrentHashMap(3, 1.0f, 2));
            if (memoizedFunctionToNotNullCreateMemoizedFunction != null) {
                return memoizedFunctionToNotNullCreateMemoizedFunction;
            }
            a(10);
            throw null;
        }
        a(9);
        throw null;
    }

    public LockBasedStorageManager(String str) {
        this(str, (Runnable) null, (Function1<InterruptedException, Unit>) null);
    }

    public LockBasedStorageManager(String str, Runnable runnable, Function1<InterruptedException, Unit> function1) {
        this(str, ExceptionHandlingStrategy.THROW, SimpleLock.Companion.simpleLock(runnable, function1));
    }
}
