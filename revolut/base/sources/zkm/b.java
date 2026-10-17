package zkm;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import skm.e0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cfm.c f323097a = new cfm.c("CLOSED", 3);

    public static final void a(Function1 function1, Object obj2, CoroutineContext coroutineContext) {
        UndeliveredElementException undeliveredElementExceptionB = b(function1, obj2, null);
        if (undeliveredElementExceptionB != null) {
            e0.v(coroutineContext, undeliveredElementExceptionB);
        }
    }

    public static final UndeliveredElementException b(Function1 function1, Object obj2, UndeliveredElementException undeliveredElementException) {
        try {
            function1.invoke(obj2);
            return undeliveredElementException;
        } catch (Throwable th10) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th10) {
                return new UndeliveredElementException(a0.d.m(obj2, "Exception in undelivered element handler for "), th10);
            }
            yhm.f.a(undeliveredElementException, th10);
            return undeliveredElementException;
        }
    }

    public static final ThreadLocal c() {
        return new ThreadLocal();
    }

    public static final Object d(t tVar, long j2, Function2 function2) {
        while (true) {
            if (tVar.f323123c >= j2 && !tVar.d()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f323098a;
            Object obj2 = atomicReferenceFieldUpdater.get(tVar);
            cfm.c cVar = f323097a;
            if (obj2 == cVar) {
                return cVar;
            }
            t tVar2 = (t) ((c) obj2);
            if (tVar2 == null) {
                tVar2 = (t) function2.invoke(Long.valueOf(tVar.f323123c + 1), tVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(tVar, null, tVar2)) {
                    if (atomicReferenceFieldUpdater.get(tVar) != null) {
                        break;
                    }
                }
                if (tVar.d()) {
                    tVar.e();
                }
            }
            tVar = tVar2;
        }
    }

    public static final t e(Object obj2) {
        if (obj2 != f323097a) {
            return (t) obj2;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final Object f(AtomicReference atomicReference) {
        return atomicReference.get();
    }

    public static final void g(CoroutineContext coroutineContext, Throwable th10) {
        Throwable runtimeException;
        Iterator it8 = e.f323101a.iterator();
        while (it8.hasNext()) {
            try {
                ((skm.a0) it8.next()).handleException(coroutineContext, th10);
            } catch (Throwable th11) {
                if (th10 == th11) {
                    runtimeException = th10;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th11);
                    yhm.f.a(runtimeException, th10);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            yhm.f.a(th10, new DiagnosticCoroutineContextException(coroutineContext));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th10);
    }

    public static final boolean h(Object obj2) {
        return obj2 == f323097a;
    }

    public static final void i(AtomicReference atomicReference, cfm.c cVar) {
        atomicReference.set(cVar);
    }
}
