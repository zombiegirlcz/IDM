package qfm;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public final class h2 implements efm.j, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.f0 f245422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dom.b f245423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f245424c;
    public Object d;

    public h2(efm.f0 f0Var) {
        this.f245422a = f0Var;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f245423b.cancel();
        this.f245423b = yfm.g.CANCELLED;
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.f245423b, bVar)) {
            this.f245423b = bVar;
            this.f245422a.onSubscribe(this);
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f245423b == yfm.g.CANCELLED;
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.f245424c) {
            return;
        }
        this.f245424c = true;
        this.f245423b = yfm.g.CANCELLED;
        Object obj2 = this.d;
        this.d = null;
        if (obj2 == null) {
            obj2 = null;
        }
        efm.f0 f0Var = this.f245422a;
        if (obj2 != null) {
            f0Var.onSuccess(obj2);
        } else {
            f0Var.onError(new NoSuchElementException());
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.f245424c) {
            mo3.a.m(th10);
            return;
        }
        this.f245424c = true;
        this.f245423b = yfm.g.CANCELLED;
        this.f245422a.onError(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f245424c) {
            return;
        }
        if (this.d == null) {
            this.d = obj2;
            return;
        }
        this.f245424c = true;
        this.f245423b.cancel();
        this.f245423b = yfm.g.CANCELLED;
        this.f245422a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
    }
}
