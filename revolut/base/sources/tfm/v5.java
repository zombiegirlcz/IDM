package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class v5 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f270895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f270896c;

    public v5(efm.y yVar, long j2) {
        this.f270894a = yVar;
        this.f270895b = j2;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f270896c.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270896c.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        this.f270894a.onComplete();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f270894a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        long j2 = this.f270895b;
        if (j2 != 0) {
            this.f270895b = j2 - 1;
        } else {
            this.f270894a.onNext(obj2);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f270896c, cVar)) {
            this.f270896c = cVar;
            this.f270894a.onSubscribe(this);
        }
    }
}
