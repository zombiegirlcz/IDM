package dgm;

/* JADX INFO: loaded from: classes13.dex */
public final class g extends yfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f114729a;

    public g(h hVar) {
        this.f114729a = hVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (yfm.g.f(j2)) {
            h hVar = this.f114729a;
            com.bumptech.glide.d.a(hVar.k, j2);
            hVar.u();
        }
    }

    @Override // nfm.f
    public final int b(int i) {
        this.f114729a.f114735l = true;
        return 2;
    }

    @Override // dom.b
    public final void cancel() {
        if (this.f114729a.f114733h) {
            return;
        }
        this.f114729a.f114733h = true;
        Runnable runnable = (Runnable) this.f114729a.f114731c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        this.f114729a.f114732g.lazySet(null);
        if (this.f114729a.f114734j.getAndIncrement() == 0) {
            this.f114729a.f114732g.lazySet(null);
            h hVar = this.f114729a;
            if (hVar.f114735l) {
                return;
            }
            hVar.f114730b.clear();
        }
    }

    @Override // nfm.j
    public final void clear() {
        this.f114729a.f114730b.clear();
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return this.f114729a.f114730b.isEmpty();
    }

    @Override // nfm.j
    public final Object poll() {
        return this.f114729a.f114730b.poll();
    }
}
