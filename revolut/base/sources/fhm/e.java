package fhm;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends ngm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f135273a;

    public e(f fVar) {
        this.f135273a = fVar;
    }

    @Override // bhm.c
    public final int b(int i) {
        this.f135273a.f135279j = true;
        return 2;
    }

    @Override // bhm.g
    public final void clear() {
        this.f135273a.f135274a.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f135273a.e) {
            return;
        }
        this.f135273a.e = true;
        this.f135273a.d();
        this.f135273a.f135275b.lazySet(null);
        if (this.f135273a.i.getAndIncrement() == 0) {
            this.f135273a.f135275b.lazySet(null);
            f fVar = this.f135273a;
            if (fVar.f135279j) {
                return;
            }
            fVar.f135274a.clear();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f135273a.e;
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return this.f135273a.f135274a.isEmpty();
    }

    @Override // bhm.g
    public final Object poll() {
        return this.f135273a.f135274a.poll();
    }
}
