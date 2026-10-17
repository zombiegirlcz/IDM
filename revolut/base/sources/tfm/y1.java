package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class y1 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.l f270957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f270959c;
    public long d;
    public boolean e;

    public y1(efm.l lVar, long j2) {
        this.f270957a = lVar;
        this.f270958b = j2;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f270959c.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270959c.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f270957a.onComplete();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.e) {
            mo3.a.m(th10);
        } else {
            this.e = true;
            this.f270957a.onError(th10);
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.e) {
            return;
        }
        long j2 = this.d;
        if (j2 != this.f270958b) {
            this.d = j2 + 1;
            return;
        }
        this.e = true;
        this.f270959c.dispose();
        this.f270957a.onSuccess(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f270959c, cVar)) {
            this.f270959c = cVar;
            this.f270957a.onSubscribe(this);
        }
    }
}
