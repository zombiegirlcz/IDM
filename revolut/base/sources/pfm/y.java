package pfm;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends ofm.c implements efm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f235776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ifm.c f235777b;

    public y(efm.y yVar) {
        this.f235776a = yVar;
    }

    @Override // nfm.f
    public final int b(int i) {
        return 2;
    }

    @Override // nfm.j
    public final void clear() {
    }

    @Override // ifm.c
    public final void dispose() {
        this.f235777b.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f235777b.isDisposed();
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return true;
    }

    @Override // efm.d
    public final void onComplete() {
        this.f235776a.onComplete();
    }

    @Override // efm.d
    public final void onError(Throwable th10) {
        this.f235776a.onError(th10);
    }

    @Override // efm.d
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f235777b, cVar)) {
            this.f235777b = cVar;
            this.f235776a.onSubscribe(this);
        }
    }

    @Override // nfm.j
    public final /* bridge */ /* synthetic */ Object poll() {
        return null;
    }
}
