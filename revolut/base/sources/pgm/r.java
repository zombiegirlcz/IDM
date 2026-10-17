package pgm;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* JADX INFO: loaded from: classes14.dex */
public final class r extends wgm.a {
    public final igm.g e;
    public final igm.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final igm.a f236134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final igm.a f236135h;

    public r(bhm.a aVar, igm.g gVar, he2.b bVar, kgm.b bVar2, kgm.b bVar3) {
        super(aVar);
        this.e = gVar;
        this.f = bVar;
        this.f236134g = bVar2;
        this.f236135h = bVar3;
    }

    @Override // bhm.c
    public final int b(int i) {
        return f(7);
    }

    @Override // bhm.a
    public final boolean d(Object obj2) {
        if (this.d) {
            return false;
        }
        try {
            this.e.accept(obj2);
            return this.f297345a.d(obj2);
        } catch (Throwable th10) {
            c(th10);
            return false;
        }
    }

    @Override // wgm.a, dom.a
    public final void onComplete() {
        if (this.d) {
            return;
        }
        try {
            this.f236134g.run();
            this.d = true;
            this.f297345a.onComplete();
            try {
                this.f236135h.run();
            } catch (Throwable th10) {
                ce9.m.F(th10);
                jb3.l.v(th10);
            }
        } catch (Throwable th11) {
            c(th11);
        }
    }

    @Override // wgm.a, dom.a
    public final void onError(Throwable th10) {
        bhm.a aVar = this.f297345a;
        if (this.d) {
            jb3.l.v(th10);
            return;
        }
        this.d = true;
        try {
            this.f.accept(th10);
            aVar.onError(th10);
        } catch (Throwable th11) {
            ce9.m.F(th11);
            aVar.onError(new CompositeException(th10, th11));
        }
        try {
            this.f236135h.run();
        } catch (Throwable th12) {
            ce9.m.F(th12);
            jb3.l.v(th12);
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.d) {
            return;
        }
        try {
            this.e.accept(obj2);
            this.f297345a.onNext(obj2);
        } catch (Throwable th10) {
            c(th10);
        }
    }

    @Override // bhm.g
    public final Object poll() throws Exception {
        CompositeException compositeException;
        igm.g gVar = this.f;
        igm.a aVar = this.f236135h;
        try {
            Object objPoll = this.f297347c.poll();
            if (objPoll == null) {
                return objPoll;
            }
            try {
                this.e.accept(objPoll);
                aVar.run();
                return objPoll;
            } catch (Throwable th10) {
                try {
                    ce9.m.F(th10);
                    try {
                        gVar.accept(th10);
                        q75.t tVar = ygm.g.f313672a;
                        if (th10 instanceof Exception) {
                            throw th10;
                        }
                        throw th10;
                    } finally {
                    }
                } catch (Throwable th11) {
                    aVar.run();
                    throw th11;
                }
            }
        } catch (Throwable th102) {
            ce9.m.F(th102);
            try {
                gVar.accept(th102);
                q75.t tVar2 = ygm.g.f313672a;
                if (th102 instanceof Exception) {
                    throw th102;
                }
                throw th102;
            } finally {
            }
        }
    }
}
