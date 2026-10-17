package wfm;

import efm.c0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class j extends c0 {
    public static final c0 d = hhm.f.f152429a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f297177c;

    public j(Executor executor) {
        this.f297177c = executor;
    }

    @Override // efm.c0
    public final c0.a b() {
        return new i(this.f297177c);
    }

    @Override // efm.c0
    public final ifm.c c(Runnable runnable) {
        Executor executor = this.f297177c;
        try {
            if (executor instanceof ExecutorService) {
                t tVar = new t(runnable);
                tVar.a(((ExecutorService) executor).submit(tVar));
                return tVar;
            }
            h hVar = new h(runnable);
            executor.execute(hVar);
            return hVar;
        } catch (RejectedExecutionException e) {
            mo3.a.m(e);
            return lfm.e.INSTANCE;
        }
    }

    @Override // efm.c0
    public final ifm.c d(Runnable runnable, long j2, TimeUnit timeUnit) {
        mfm.f.b(runnable, "run is null");
        Executor executor = this.f297177c;
        if (executor instanceof ScheduledExecutorService) {
            try {
                t tVar = new t(runnable);
                tVar.a(((ScheduledExecutorService) executor).schedule(tVar, j2, timeUnit));
                return tVar;
            } catch (RejectedExecutionException e) {
                mo3.a.m(e);
                return lfm.e.INSTANCE;
            }
        }
        g gVar = new g(runnable);
        ifm.c cVarD = d.d(new r8.d(this, gVar, 19), j2, timeUnit);
        lfm.b bVar = gVar.f297171a;
        bVar.getClass();
        lfm.d.c(bVar, cVarD);
        return gVar;
    }

    @Override // efm.c0
    public final ifm.c e(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        Executor executor = this.f297177c;
        if (!(executor instanceof ScheduledExecutorService)) {
            return super.e(runnable, j2, j3, timeUnit);
        }
        try {
            s sVar = new s(runnable);
            sVar.a(((ScheduledExecutorService) executor).scheduleAtFixedRate(sVar, j2, j3, timeUnit));
            return sVar;
        } catch (RejectedExecutionException e) {
            mo3.a.m(e);
            return lfm.e.INSTANCE;
        }
    }
}
