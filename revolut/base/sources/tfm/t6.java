package tfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class t6 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeUnit f270847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final efm.c0 f270848c;
    public long d;
    public ifm.c e;

    public t6(efm.y yVar, TimeUnit timeUnit, efm.c0 c0Var) {
        this.f270846a = yVar;
        this.f270848c = c0Var;
        this.f270847b = timeUnit;
    }

    @Override // ifm.c
    public final void dispose() {
        this.e.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.e.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        this.f270846a.onComplete();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f270846a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f270848c.getClass();
        TimeUnit timeUnit = this.f270847b;
        long jA = efm.c0.a(timeUnit);
        long j2 = this.d;
        this.d = jA;
        this.f270846a.onNext(new hhm.g(obj2, jA - j2, timeUnit));
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.e, cVar)) {
            this.e = cVar;
            this.f270848c.getClass();
            this.d = efm.c0.a(this.f270847b);
            this.f270846a.onSubscribe(this);
        }
    }
}
