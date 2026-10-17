package ihm;

/* JADX INFO: loaded from: classes14.dex */
public final class l extends ofm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f161464a;

    public l(m mVar) {
        this.f161464a = mVar;
    }

    @Override // nfm.f
    public final int b(int i) {
        this.f161464a.f161471p = true;
        return 2;
    }

    @Override // nfm.j
    public final void clear() {
        this.f161464a.f161465g.clear();
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.f161464a.k) {
            return;
        }
        this.f161464a.k = true;
        this.f161464a.e();
        this.f161464a.f161466h.lazySet(null);
        if (this.f161464a.o.getAndIncrement() == 0) {
            this.f161464a.f161466h.lazySet(null);
            m mVar = this.f161464a;
            if (mVar.f161471p) {
                return;
            }
            mVar.f161465g.clear();
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f161464a.k;
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return this.f161464a.f161465g.isEmpty();
    }

    @Override // nfm.j
    public final Object poll() {
        return this.f161464a.f161465g.poll();
    }
}
