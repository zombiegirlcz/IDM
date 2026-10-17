package tfm;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l5 extends AtomicReference implements efm.y, ifm.c, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bgm.d f270615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f270617c;
    public final efm.c0 d;
    public final AtomicReference e = new AtomicReference();
    public ifm.c f;

    public l5(bgm.d dVar, long j2, TimeUnit timeUnit, efm.c0 c0Var) {
        this.f270615a = dVar;
        this.f270616b = j2;
        this.f270617c = timeUnit;
        this.d = c0Var;
    }

    public abstract void a();

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this.e);
        this.f.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        lfm.d.a(this.e);
        a();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        lfm.d.a(this.e);
        this.f270615a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        lazySet(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f, cVar)) {
            this.f = cVar;
            this.f270615a.onSubscribe(this);
            long j2 = this.f270616b;
            lfm.d.c(this.e, this.d.e(this, j2, j2, this.f270617c));
        }
    }
}
