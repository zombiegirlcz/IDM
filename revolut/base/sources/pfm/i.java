package pfm;

import efm.c0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends AtomicReference implements efm.d, Runnable, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.d f235732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f235733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f235734c;
    public final c0 d;
    public Throwable e;

    public i(efm.d dVar, long j2, TimeUnit timeUnit, c0 c0Var) {
        this.f235732a = dVar;
        this.f235733b = j2;
        this.f235734c = timeUnit;
        this.d = c0Var;
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) get());
    }

    @Override // efm.d
    public final void onComplete() {
        lfm.d.c(this, this.d.d(this, this.f235733b, this.f235734c));
    }

    @Override // efm.d
    public final void onError(Throwable th10) {
        this.e = th10;
        lfm.d.c(this, this.d.d(this, 0L, this.f235734c));
    }

    @Override // efm.d
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.e(this, cVar)) {
            this.f235732a.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th10 = this.e;
        this.e = null;
        efm.d dVar = this.f235732a;
        if (th10 != null) {
            dVar.onError(th10);
        } else {
            dVar.onComplete();
        }
    }
}
