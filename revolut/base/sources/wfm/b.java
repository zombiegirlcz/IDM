package wfm;

import efm.c0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends c0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lfm.f f297162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ifm.b f297163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lfm.f f297164c;
    public final d d;
    public volatile boolean e;

    public b(d dVar) {
        this.d = dVar;
        lfm.f fVar = new lfm.f();
        this.f297162a = fVar;
        ifm.b bVar = new ifm.b();
        this.f297163b = bVar;
        lfm.f fVar2 = new lfm.f();
        this.f297164c = fVar2;
        fVar2.a(fVar);
        fVar2.a(bVar);
    }

    @Override // efm.c0.a
    public final ifm.c a(Runnable runnable) {
        return this.e ? lfm.e.INSTANCE : this.d.d(runnable, 0L, TimeUnit.MILLISECONDS, this.f297162a);
    }

    @Override // efm.c0.a
    public final ifm.c b(Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.e ? lfm.e.INSTANCE : this.d.d(runnable, j2, timeUnit, this.f297163b);
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f297164c.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.e;
    }
}
