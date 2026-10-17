package tfm;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes13.dex */
public final class d7 extends AtomicBoolean implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.c0 f270415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f270416c;

    public d7(efm.y yVar, efm.c0 c0Var) {
        this.f270414a = yVar;
        this.f270415b = c0Var;
    }

    @Override // ifm.c
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.f270415b.c(new com.bumptech.glide.k(this, 16));
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get();
    }

    @Override // efm.y
    public final void onComplete() {
        if (get()) {
            return;
        }
        this.f270414a.onComplete();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (get()) {
            mo3.a.m(th10);
        } else {
            this.f270414a.onError(th10);
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (get()) {
            return;
        }
        this.f270414a.onNext(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f270416c, cVar)) {
            this.f270416c = cVar;
            this.f270414a.onSubscribe(this);
        }
    }
}
