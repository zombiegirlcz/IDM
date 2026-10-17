package qfm;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public final class e0 implements efm.j, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.f0 f245401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f245402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dom.b f245403c;
    public long d;
    public boolean e;

    public e0(efm.f0 f0Var, Object obj2) {
        this.f245401a = f0Var;
        this.f245402b = obj2;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f245403c.cancel();
        this.f245403c = yfm.g.CANCELLED;
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.f245403c, bVar)) {
            this.f245403c = bVar;
            this.f245401a.onSubscribe(this);
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f245403c == yfm.g.CANCELLED;
    }

    @Override // dom.a
    public final void onComplete() {
        this.f245403c = yfm.g.CANCELLED;
        if (this.e) {
            return;
        }
        this.e = true;
        efm.f0 f0Var = this.f245401a;
        Object obj2 = this.f245402b;
        if (obj2 != null) {
            f0Var.onSuccess(obj2);
        } else {
            f0Var.onError(new NoSuchElementException());
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.e) {
            mo3.a.m(th10);
            return;
        }
        this.e = true;
        this.f245403c = yfm.g.CANCELLED;
        this.f245401a.onError(th10);
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
        this.f245403c.cancel();
        this.f245403c = yfm.g.CANCELLED;
        this.f245401a.onSuccess(obj2);
    }
}
