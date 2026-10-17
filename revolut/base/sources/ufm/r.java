package ufm;

import efm.c0;
import efm.f0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends AtomicReference implements f0, ifm.c, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f279908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f279909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f279910c;

    public r(f0 f0Var, c0 c0Var) {
        this.f279908a = f0Var;
        this.f279909b = c0Var;
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d dVar = lfm.d.DISPOSED;
        ifm.c cVar = (ifm.c) getAndSet(dVar);
        if (cVar != dVar) {
            this.f279910c = cVar;
            this.f279909b.c(this);
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) get());
    }

    @Override // efm.f0
    public final void onError(Throwable th10) {
        this.f279908a.onError(th10);
    }

    @Override // efm.f0
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.e(this, cVar)) {
            this.f279908a.onSubscribe(this);
        }
    }

    @Override // efm.f0
    public final void onSuccess(Object obj2) {
        this.f279908a.onSuccess(obj2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f279910c.dispose();
    }
}
