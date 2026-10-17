package ulm;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ThreadPoolExecutor f281085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f281086b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f281087c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public static void d(f0 f0Var, ylm.n nVar, ylm.q qVar, ylm.n nVar2, int i) {
        im.a aVar;
        ylm.n other;
        if ((i & 1) != 0) {
            nVar = null;
        }
        if ((i & 2) != 0) {
            qVar = null;
        }
        if ((i & 4) != 0) {
            nVar2 = null;
        }
        f0Var.getClass();
        vlm.j.b(f0Var);
        boolean zIsShutdown = ((ThreadPoolExecutor) f0Var.a()).isShutdown();
        synchronized (f0Var) {
            if (qVar != null) {
                try {
                    if (!f0Var.d.remove(qVar)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            if (nVar2 != null) {
                nVar2.f314775b.decrementAndGet();
                if (!f0Var.f281087c.remove(nVar2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (nVar != null) {
                f0Var.f281086b.add(nVar);
                ylm.q qVar2 = nVar.f314776c;
                if (!qVar2.f314781c && (other = f0Var.b(qVar2.f314780b.f281095a.d)) != null) {
                    Intrinsics.checkNotNullParameter(other, "other");
                    nVar.f314775b = other.f314775b;
                }
            }
            if ((qVar != null || nVar2 != null) && (zIsShutdown || f0Var.f281087c.isEmpty())) {
                f0Var.d.isEmpty();
            }
            if (zIsShutdown) {
                List listD1 = zhm.d0.d1(f0Var.f281086b);
                f0Var.f281086b.clear();
                aVar = new im.a(listD1, 1);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it8 = f0Var.f281086b.iterator();
                Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
                while (it8.hasNext()) {
                    ylm.n nVar3 = (ylm.n) it8.next();
                    if (f0Var.f281087c.size() >= 64) {
                        break;
                    }
                    if (nVar3.f314775b.get() < 5) {
                        it8.remove();
                        nVar3.f314775b.incrementAndGet();
                        arrayList.add(nVar3);
                        f0Var.f281087c.add(nVar3);
                    }
                }
                aVar = new im.a(arrayList, 1);
            }
        }
        int size = aVar.b().size();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            ylm.n nVar4 = (ylm.n) aVar.b().get(i2);
            if (nVar4 == nVar) {
                z = false;
            } else {
                ylm.q qVar3 = nVar4.f314776c;
                qVar3.e.dispatcherQueueEnd(qVar3, f0Var);
            }
            if (zIsShutdown) {
                nVar4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                ylm.q qVar4 = nVar4.f314776c;
                qVar4.h(interruptedIOException);
                nVar4.f314774a.onFailure(qVar4, interruptedIOException);
            } else {
                ExecutorService executorService = f0Var.a();
                nVar4.getClass();
                Intrinsics.checkNotNullParameter(executorService, "executorService");
                ylm.q qVar5 = nVar4.f314776c;
                vlm.j.b(qVar5.f314779a.f226053a);
                try {
                    try {
                        ((ThreadPoolExecutor) executorService).execute(nVar4);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        ylm.q qVar6 = nVar4.f314776c;
                        qVar6.h(interruptedIOException2);
                        nVar4.f314774a.onFailure(qVar6, interruptedIOException2);
                        qVar5.f314779a.f226053a.c(nVar4);
                    }
                } catch (Throwable th11) {
                    qVar5.f314779a.f226053a.c(nVar4);
                    throw th11;
                }
            }
        }
        if (!z || nVar == null) {
            return;
        }
        ylm.q qVar7 = nVar.f314776c;
        qVar7.e.dispatcherQueueStart(qVar7, f0Var);
    }

    public final synchronized ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (this.f281085a == null) {
                this.f281085a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), vlm.j.m(vlm.j.f290513b + " Dispatcher", false));
            }
            threadPoolExecutor = this.f281085a;
            Intrinsics.h(threadPoolExecutor);
        } catch (Throwable th10) {
            throw th10;
        }
        return threadPoolExecutor;
    }

    public final ylm.n b(String str) {
        Iterator it8 = this.f281087c.iterator();
        Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
        while (it8.hasNext()) {
            ylm.n nVar = (ylm.n) it8.next();
            if (Intrinsics.f(nVar.f314776c.f314780b.f281095a.d, str)) {
                return nVar;
            }
        }
        Iterator it9 = this.f281086b.iterator();
        Intrinsics.checkNotNullExpressionValue(it9, "iterator(...)");
        while (it9.hasNext()) {
            ylm.n nVar2 = (ylm.n) it9.next();
            if (Intrinsics.f(nVar2.f314776c.f314780b.f281095a.d, str)) {
                return nVar2;
            }
        }
        return null;
    }

    public final void c(ylm.n call) {
        Intrinsics.checkNotNullParameter(call, "call");
        d(this, null, null, call, 3);
    }
}
