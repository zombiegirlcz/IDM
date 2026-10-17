package pgm;

/* JADX INFO: loaded from: classes14.dex */
public final class u extends xgm.b implements fgm.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dom.b f236152c;
    public long d;
    public boolean e;

    @Override // dom.b
    public final void cancel() {
        set(4);
        this.f305774b = null;
        this.f236152c.cancel();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.h(this.f236152c, bVar)) {
            this.f236152c = bVar;
            this.f305773a.e(this);
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f305773a.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.e) {
            jb3.l.v(th10);
        } else {
            this.e = true;
            this.f305773a.onError(th10);
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.e) {
            return;
        }
        long j2 = this.d;
        if (j2 != 0) {
            this.d = j2 + 1;
            return;
        }
        this.e = true;
        this.f236152c.cancel();
        c(obj2);
    }
}
