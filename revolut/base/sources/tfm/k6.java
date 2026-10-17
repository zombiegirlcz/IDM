package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class k6 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f270595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f270596c;
    public long d;

    public k6(efm.y yVar, long j2) {
        this.f270594a = yVar;
        this.d = j2;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f270596c.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270596c.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.f270595b) {
            return;
        }
        this.f270595b = true;
        this.f270596c.dispose();
        this.f270594a.onComplete();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.f270595b) {
            mo3.a.m(th10);
            return;
        }
        this.f270595b = true;
        this.f270596c.dispose();
        this.f270594a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f270595b) {
            return;
        }
        long j2 = this.d;
        long j3 = j2 - 1;
        this.d = j3;
        if (j2 > 0) {
            boolean z = j3 == 0;
            this.f270594a.onNext(obj2);
            if (z) {
                onComplete();
            }
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f270596c, cVar)) {
            this.f270596c = cVar;
            long j2 = this.d;
            efm.y yVar = this.f270594a;
            if (j2 != 0) {
                yVar.onSubscribe(this);
                return;
            }
            this.f270595b = true;
            cVar.dispose();
            lfm.e.a(yVar);
        }
    }
}
