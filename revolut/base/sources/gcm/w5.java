package gcm;

import com.google.common.base.Preconditions;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class w5 implements Executor, Runnable {
    public static final Logger d = Logger.getLogger(w5.class.getName());
    public static final z5 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f142931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f142932b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f142933c = 0;

    static {
        z5 v5Var;
        try {
            v5Var = new u5(AtomicIntegerFieldUpdater.newUpdater(w5.class, "c"));
        } catch (Throwable th10) {
            d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th10);
            v5Var = new v5();
        }
        e = v5Var;
    }

    public w5(Executor executor) {
        Preconditions.checkNotNull(executor, "'executor' must not be null.");
        this.f142931a = executor;
    }

    public final void a(Runnable runnable) {
        z5 z5Var = e;
        if (z5Var.o(this)) {
            try {
                this.f142931a.execute(this);
            } catch (Throwable th10) {
                if (runnable != null) {
                    this.f142932b.remove(runnable);
                }
                z5Var.p(this);
                throw th10;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f142932b.add((Runnable) Preconditions.checkNotNull(runnable, "'r' must not be null."));
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        z5 z5Var = e;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f142932b;
        while (true) {
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e2) {
                    d.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e2);
                }
            } catch (Throwable th10) {
                z5Var.p(this);
                throw th10;
            }
        }
        z5Var.p(this);
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        a(null);
    }
}
