package dhm;

import xgm.f;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends xgm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f114853a;

    public c(d dVar) {
        this.f114853a = dVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (f.f(j2)) {
            d dVar = this.f114853a;
            xam.a.b(dVar.k, j2);
            dVar.o();
        }
    }

    @Override // bhm.c
    public final int b(int i) {
        this.f114853a.f114859l = true;
        return 2;
    }

    @Override // dom.b
    public final void cancel() {
        if (this.f114853a.f114857h) {
            return;
        }
        this.f114853a.f114857h = true;
        Runnable runnable = (Runnable) this.f114853a.f114855c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        this.f114853a.f114856g.lazySet(null);
        if (this.f114853a.f114858j.getAndIncrement() == 0) {
            this.f114853a.f114856g.lazySet(null);
            d dVar = this.f114853a;
            if (dVar.f114859l) {
                return;
            }
            dVar.f114854b.clear();
        }
    }

    @Override // bhm.g
    public final void clear() {
        this.f114853a.f114854b.clear();
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return this.f114853a.f114854b.isEmpty();
    }

    @Override // bhm.g
    public final Object poll() {
        return this.f114853a.f114854b.poll();
    }
}
