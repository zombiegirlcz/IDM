package wfm;

import efm.c0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public final class i extends c0.a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f297174a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f297176c;
    public final AtomicInteger d = new AtomicInteger();
    public final ifm.b e = new ifm.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ufm.g f297175b = new ufm.g();

    public i(Executor executor) {
        this.f297174a = executor;
    }

    @Override // efm.c0.a
    public final ifm.c a(Runnable runnable) {
        if (this.f297176c) {
            return lfm.e.INSTANCE;
        }
        h hVar = new h(runnable);
        this.f297175b.offer(hVar);
        if (this.d.getAndIncrement() != 0) {
            return hVar;
        }
        try {
            this.f297174a.execute(this);
            return hVar;
        } catch (RejectedExecutionException e) {
            this.f297176c = true;
            this.f297175b.clear();
            mo3.a.m(e);
            return lfm.e.INSTANCE;
        }
    }

    @Override // efm.c0.a
    public final ifm.c b(Runnable runnable, long j2, TimeUnit timeUnit) {
        if (j2 <= 0) {
            return a(runnable);
        }
        if (this.f297176c) {
            return lfm.e.INSTANCE;
        }
        lfm.b bVar = new lfm.b(1);
        lfm.b bVar2 = new lfm.b(bVar);
        u uVar = new u(new et0.w((Object) this, (Object) bVar2, (Object) runnable, false, 12), this.e);
        this.e.a(uVar);
        Executor executor = this.f297174a;
        if (executor instanceof ScheduledExecutorService) {
            try {
                uVar.a(((ScheduledExecutorService) executor).schedule((Callable) uVar, j2, timeUnit));
            } catch (RejectedExecutionException e) {
                this.f297176c = true;
                mo3.a.m(e);
                return lfm.e.INSTANCE;
            }
        } else {
            uVar.a(new f(j.d.d(uVar, j2, timeUnit)));
        }
        lfm.d.c(bVar, uVar);
        return bVar2;
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.f297176c) {
            return;
        }
        this.f297176c = true;
        this.e.dispose();
        if (this.d.getAndIncrement() == 0) {
            this.f297175b.clear();
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f297176c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ufm.g gVar = this.f297175b;
        int iAddAndGet = 1;
        while (!this.f297176c) {
            do {
                Runnable runnable = (Runnable) gVar.poll();
                if (runnable != null) {
                    runnable.run();
                } else if (this.f297176c) {
                    gVar.clear();
                    return;
                } else {
                    iAddAndGet = this.d.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            } while (!this.f297176c);
            gVar.clear();
            return;
        }
        gVar.clear();
    }
}
