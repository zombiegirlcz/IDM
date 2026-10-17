package tfm;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes13.dex */
public final class u1 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.g f270855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.g f270856c;
    public final kfm.a d;
    public final kfm.a e;
    public ifm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f270857g;

    public u1(efm.y yVar, kfm.g gVar, kfm.g gVar2, kfm.a aVar, kfm.a aVar2) {
        this.f270854a = yVar;
        this.f270855b = gVar;
        this.f270856c = gVar2;
        this.d = aVar;
        this.e = aVar2;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.f270857g) {
            return;
        }
        try {
            this.d.run();
            this.f270857g = true;
            this.f270854a.onComplete();
            try {
                this.e.run();
            } catch (Throwable th10) {
                m70.a.u(th10);
                mo3.a.m(th10);
            }
        } catch (Throwable th11) {
            m70.a.u(th11);
            onError(th11);
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.f270857g) {
            mo3.a.m(th10);
            return;
        }
        this.f270857g = true;
        try {
            this.f270856c.accept(th10);
        } catch (Throwable th11) {
            m70.a.u(th11);
            th10 = new CompositeException(th10, th11);
        }
        this.f270854a.onError(th10);
        try {
            this.e.run();
        } catch (Throwable th12) {
            m70.a.u(th12);
            mo3.a.m(th12);
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f270857g) {
            return;
        }
        try {
            this.f270855b.accept(obj2);
            this.f270854a.onNext(obj2);
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.f.dispose();
            onError(th10);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f, cVar)) {
            this.f = cVar;
            this.f270854a.onSubscribe(this);
        }
    }
}
