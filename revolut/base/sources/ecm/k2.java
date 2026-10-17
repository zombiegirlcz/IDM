package ecm;

import com.google.common.base.Preconditions;
import java.lang.Thread;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class k2 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f124833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f124834b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f124835c = new AtomicReference();

    public k2(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f124833a = (Thread.UncaughtExceptionHandler) Preconditions.checkNotNull(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    public final void a() {
        AtomicReference atomicReference;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f124834b;
        do {
            Thread threadCurrentThread = Thread.currentThread();
            do {
                atomicReference = this.f124835c;
                if (atomicReference.compareAndSet(null, threadCurrentThread)) {
                    while (true) {
                        try {
                            Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                            if (runnable == null) {
                                break;
                            }
                            try {
                                runnable.run();
                            } catch (Throwable th10) {
                                this.f124833a.uncaughtException(Thread.currentThread(), th10);
                            }
                        } catch (Throwable th11) {
                            atomicReference.set(null);
                            throw th11;
                        }
                    }
                    atomicReference.set(null);
                }
            } while (atomicReference.get() == null);
            return;
        } while (!concurrentLinkedQueue.isEmpty());
    }

    public final void b(Runnable runnable) {
        this.f124834b.add((Runnable) Preconditions.checkNotNull(runnable, "runnable is null"));
    }

    public final cpi.g c(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j2, TimeUnit timeUnit) {
        j2 j2Var = new j2(runnable);
        return new cpi.g(j2Var, scheduledExecutorService.schedule(new h2(this, 0, j2Var, runnable), j2, timeUnit));
    }

    public final void d() {
        Preconditions.checkState(Thread.currentThread() == this.f124835c.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}
