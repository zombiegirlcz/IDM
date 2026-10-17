package wfm;

import efm.c0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes13.dex */
public final class m extends c0.a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f297185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f297186c;
    public final AtomicBoolean d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ifm.b f297184a = new ifm.b();

    public m(l lVar) {
        n nVar;
        n nVar2;
        this.f297185b = lVar;
        if (lVar.f297183c.f161042b) {
            nVar2 = o.f297189h;
        } else {
            while (true) {
                if (lVar.f297182b.isEmpty()) {
                    nVar = new n(lVar.f);
                    lVar.f297183c.a(nVar);
                    break;
                } else {
                    nVar = (n) lVar.f297182b.poll();
                    if (nVar != null) {
                        break;
                    }
                }
            }
            nVar2 = nVar;
        }
        this.f297186c = nVar2;
    }

    @Override // efm.c0.a
    public final ifm.c b(Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.f297184a.f161042b ? lfm.e.INSTANCE : this.f297186c.d(runnable, j2, timeUnit, this.f297184a);
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.d.compareAndSet(false, true)) {
            this.f297184a.dispose();
            if (o.i) {
                this.f297186c.d(this, 0L, TimeUnit.NANOSECONDS, null);
                return;
            }
            l lVar = this.f297185b;
            lVar.getClass();
            long jNanoTime = System.nanoTime() + lVar.f297181a;
            n nVar = this.f297186c;
            nVar.f297187c = jNanoTime;
            lVar.f297182b.offer(nVar);
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.d.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar = this.f297185b;
        lVar.getClass();
        long jNanoTime = System.nanoTime() + lVar.f297181a;
        n nVar = this.f297186c;
        nVar.f297187c = jNanoTime;
        lVar.f297182b.offer(nVar);
    }
}
