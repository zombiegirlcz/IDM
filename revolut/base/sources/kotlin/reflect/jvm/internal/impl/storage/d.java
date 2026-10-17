package kotlin.reflect.jvm.internal.impl.storage;

import dki.h;
import fkm.i;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;

/* JADX INFO: loaded from: classes13.dex */
public class d implements MemoizedFunctionToNullable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LockBasedStorageManager f187753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f187754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f187755c;

    public d(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, Function1 function1) {
        if (concurrentMap == null) {
            a(1);
            throw null;
        }
        if (function1 == null) {
            a(2);
            throw null;
        }
        this.f187753a = lockBasedStorageManager;
        this.f187754b = concurrentMap;
        this.f187755c = function1;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "compute";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 3) {
            objArr[1] = "recursionDetected";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i != 3 && i != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public final AssertionError b(Object obj2, Object obj3) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + i.COMPUTING + " is expected, was: " + obj3 + ", most probably race condition detected on input " + obj2 + " under " + this.f187753a);
        LockBasedStorageManager.c(assertionError);
        return assertionError;
    }

    public final AssertionError c(Object obj2, Object obj3) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj2 + ". Old value is " + obj3 + " under " + this.f187753a);
        LockBasedStorageManager.c(assertionError);
        return assertionError;
    }

    public final AssertionError d(Object obj2, Throwable th10) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj2 + " under " + this.f187753a, th10);
        LockBasedStorageManager.c(assertionError);
        return assertionError;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable, kotlin.jvm.functions.Function1
    public Object invoke(Object obj2) {
        Object obj3;
        i iVar;
        AssertionError assertionErrorC;
        AssertionError assertionErrorD;
        LockBasedStorageManager lockBasedStorageManager = this.f187753a;
        LockBasedStorageManager.ExceptionHandlingStrategy exceptionHandlingStrategy = lockBasedStorageManager.f187747b;
        SimpleLock simpleLock = lockBasedStorageManager.f187746a;
        ConcurrentMap concurrentMap = this.f187754b;
        Object obj4 = concurrentMap.get(obj2);
        if (obj4 != null && obj4 != i.COMPUTING) {
            return WrappedValues.unescapeExceptionOrNull(obj4);
        }
        simpleLock.lock();
        try {
            obj3 = concurrentMap.get(obj2);
            iVar = i.COMPUTING;
            assertionErrorC = null;
            if (obj3 == iVar) {
                obj3 = i.RECURSION_WAS_DETECTED;
                h hVarB = lockBasedStorageManager.b(obj2, "");
                if (hVarB == null) {
                    a(3);
                    throw null;
                }
                if (!hVarB.o()) {
                    return hVarB.n();
                }
            }
            if (obj3 == i.RECURSION_WAS_DETECTED) {
                h hVarB2 = lockBasedStorageManager.b(obj2, "");
                if (hVarB2 == null) {
                    a(3);
                    throw null;
                }
                if (!hVarB2.o()) {
                    return hVarB2.n();
                }
            }
        } finally {
        }
        if (obj3 != null) {
            return WrappedValues.unescapeExceptionOrNull(obj3);
        }
        try {
            concurrentMap.put(obj2, iVar);
            Object objInvoke = this.f187755c.invoke(obj2);
            Object objPut = concurrentMap.put(obj2, WrappedValues.escapeNull(objInvoke));
            if (objPut == iVar) {
                return objInvoke;
            }
            assertionErrorC = c(obj2, objPut);
            throw assertionErrorC;
        } catch (Throwable th10) {
            if (ExceptionUtilsKt.isProcessCanceledException(th10)) {
                try {
                    Object objRemove = concurrentMap.remove(obj2);
                    if (objRemove != i.COMPUTING) {
                        throw b(obj2, objRemove);
                    }
                    throw th10;
                } finally {
                }
            }
            if (th10 == assertionErrorC) {
                try {
                    concurrentMap.remove(obj2);
                    throw exceptionHandlingStrategy.handleException(th10);
                } finally {
                }
            }
            Object objPut2 = concurrentMap.put(obj2, WrappedValues.escapeThrowable(th10));
            if (objPut2 != i.COMPUTING) {
                throw c(obj2, objPut2);
            }
            throw exceptionHandlingStrategy.handleException(th10);
        }
        simpleLock.unlock();
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable
    public final boolean isComputed(Object obj2) {
        Object obj3 = this.f187754b.get(obj2);
        return (obj3 == null || obj3 == i.COMPUTING) ? false : true;
    }
}
