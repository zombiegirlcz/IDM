package tfm;

import efm.c0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class p6 extends AtomicReference implements efm.y, ifm.c, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bgm.d f270723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f270725c;
    public final c0.a d;
    public ifm.c e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f270726g;

    public p6(bgm.d dVar, long j2, TimeUnit timeUnit, c0.a aVar) {
        this.f270723a = dVar;
        this.f270724b = j2;
        this.f270725c = timeUnit;
        this.d = aVar;
    }

    @Override // ifm.c
    public final void dispose() {
        this.e.dispose();
        this.d.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.f270726g) {
            return;
        }
        this.f270726g = true;
        this.f270723a.onComplete();
        this.d.dispose();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.f270726g) {
            mo3.a.m(th10);
            return;
        }
        this.f270726g = true;
        this.f270723a.onError(th10);
        this.d.dispose();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f || this.f270726g) {
            return;
        }
        this.f = true;
        this.f270723a.onNext(obj2);
        ifm.c cVar = (ifm.c) get();
        if (cVar != null) {
            cVar.dispose();
        }
        lfm.d.c(this, this.d.b(this, this.f270724b, this.f270725c));
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.e, cVar)) {
            this.e = cVar;
            this.f270723a.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f = false;
    }
}
