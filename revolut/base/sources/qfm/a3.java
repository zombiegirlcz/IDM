package qfm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class a3 implements efm.j, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f245371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.c f245372c;
    public dom.b d;
    public boolean e;

    public a3(dom.a aVar, Iterator it8, vf0.n nVar) {
        this.f245370a = aVar;
        this.f245371b = it8;
        this.f245372c = nVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        this.d.a(j2);
    }

    public final void b(Throwable th10) {
        m70.a.u(th10);
        this.e = true;
        this.d.cancel();
        this.f245370a.onError(th10);
    }

    @Override // dom.b
    public final void cancel() {
        this.d.cancel();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.d, bVar)) {
            this.d = bVar;
            this.f245370a.e(this);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f245370a.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.e) {
            mo3.a.m(th10);
        } else {
            this.e = true;
            this.f245370a.onError(th10);
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        Iterator it8 = this.f245371b;
        if (this.e) {
            return;
        }
        try {
            Object next = it8.next();
            mfm.f.b(next, "The iterator returned a null value");
            try {
                Object objApply = this.f245372c.apply(obj2, next);
                mfm.f.b(objApply, "The zipper function returned a null value");
                dom.a aVar = this.f245370a;
                aVar.onNext(objApply);
                try {
                    if (it8.hasNext()) {
                        return;
                    }
                    this.e = true;
                    this.d.cancel();
                    aVar.onComplete();
                } catch (Throwable th10) {
                    b(th10);
                }
            } catch (Throwable th11) {
                b(th11);
            }
        } catch (Throwable th12) {
            b(th12);
        }
    }
}
