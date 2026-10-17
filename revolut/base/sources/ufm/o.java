package ufm;

import efm.d0;
import efm.f0;
import efm.h0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import rfm.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class o extends AtomicReference implements f0, Runnable, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f279901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f279902b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f279903c;
    public h0 d;
    public final long e;
    public final TimeUnit f;

    public o(f0 f0Var, h0 h0Var, long j2, TimeUnit timeUnit) {
        this.f279901a = f0Var;
        this.d = h0Var;
        this.e = j2;
        this.f = timeUnit;
        if (h0Var != null) {
            this.f279903c = new a0(f0Var, 3);
        } else {
            this.f279903c = null;
        }
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this);
        lfm.d.a(this.f279902b);
        a0 a0Var = this.f279903c;
        if (a0Var != null) {
            lfm.d.a(a0Var);
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) get());
    }

    @Override // efm.f0
    public final void onError(Throwable th10) {
        ifm.c cVar = (ifm.c) get();
        lfm.d dVar = lfm.d.DISPOSED;
        if (cVar == dVar || !compareAndSet(cVar, dVar)) {
            mo3.a.m(th10);
        } else {
            lfm.d.a(this.f279902b);
            this.f279901a.onError(th10);
        }
    }

    @Override // efm.f0
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this, cVar);
    }

    @Override // efm.f0
    public final void onSuccess(Object obj2) {
        ifm.c cVar = (ifm.c) get();
        lfm.d dVar = lfm.d.DISPOSED;
        if (cVar == dVar || !compareAndSet(cVar, dVar)) {
            return;
        }
        lfm.d.a(this.f279902b);
        this.f279901a.onSuccess(obj2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ifm.c cVar = (ifm.c) get();
        lfm.d dVar = lfm.d.DISPOSED;
        if (cVar == dVar || !compareAndSet(cVar, dVar)) {
            return;
        }
        if (cVar != null) {
            cVar.dispose();
        }
        h0 h0Var = this.d;
        if (h0Var == null) {
            this.f279901a.onError(new TimeoutException(zfm.h.c(this.e, this.f)));
        } else {
            this.d = null;
            ((d0) h0Var).q(this.f279903c);
        }
    }
}
