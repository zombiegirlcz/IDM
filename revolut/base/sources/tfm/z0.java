package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class z0 extends AtomicReference implements efm.t, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270984a;

    public z0(efm.y yVar) {
        this.f270984a = yVar;
    }

    public final void a() {
        if (isDisposed()) {
            return;
        }
        try {
            this.f270984a.onComplete();
        } finally {
            lfm.d.a(this);
        }
    }

    public final void b(Throwable th10) {
        if (e(th10)) {
            return;
        }
        mo3.a.m(th10);
    }

    public final void c(Object obj2) {
        if (obj2 == null) {
            b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            if (isDisposed()) {
                return;
            }
            this.f270984a.onNext(obj2);
        }
    }

    public final void d(kfm.f fVar) {
        lfm.d.d(this, new lfm.b(fVar));
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this);
    }

    public final boolean e(Throwable th10) {
        if (th10 == null) {
            th10 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (isDisposed()) {
            return false;
        }
        try {
            this.f270984a.onError(th10);
            lfm.d.a(this);
            return true;
        } catch (Throwable th11) {
            lfm.d.a(this);
            throw th11;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) get());
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return j6.a.r(z0.class.getSimpleName(), "{", super.toString(), "}");
    }
}
