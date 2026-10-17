package wfm;

import efm.c0;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends c0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f297204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ifm.b f297205b = new ifm.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f297206c;

    public w(ScheduledExecutorService scheduledExecutorService) {
        this.f297204a = scheduledExecutorService;
    }

    @Override // efm.c0.a
    public final ifm.c b(Runnable runnable, long j2, TimeUnit timeUnit) {
        if (this.f297206c) {
            return lfm.e.INSTANCE;
        }
        u uVar = new u(runnable, this.f297205b);
        this.f297205b.a(uVar);
        try {
            uVar.a(j2 <= 0 ? this.f297204a.submit((Callable) uVar) : this.f297204a.schedule((Callable) uVar, j2, timeUnit));
            return uVar;
        } catch (RejectedExecutionException e) {
            dispose();
            mo3.a.m(e);
            return lfm.e.INSTANCE;
        }
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.f297206c) {
            return;
        }
        this.f297206c = true;
        this.f297205b.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f297206c;
    }
}
