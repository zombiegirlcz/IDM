package tfm;

import efm.c0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class e1 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bgm.d f270422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f270424c;
    public final c0.a d;
    public ifm.c e;
    public d1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile long f270425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f270426h;

    public e1(bgm.d dVar, long j2, TimeUnit timeUnit, c0.a aVar) {
        this.f270422a = dVar;
        this.f270423b = j2;
        this.f270424c = timeUnit;
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
        if (this.f270426h) {
            return;
        }
        this.f270426h = true;
        d1 d1Var = this.f;
        if (d1Var != null) {
            lfm.d.a(d1Var);
        }
        if (d1Var != null) {
            d1Var.run();
        }
        this.f270422a.onComplete();
        this.d.dispose();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.f270426h) {
            mo3.a.m(th10);
            return;
        }
        d1 d1Var = this.f;
        if (d1Var != null) {
            lfm.d.a(d1Var);
        }
        this.f270426h = true;
        this.f270422a.onError(th10);
        this.d.dispose();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f270426h) {
            return;
        }
        long j2 = this.f270425g + 1;
        this.f270425g = j2;
        d1 d1Var = this.f;
        if (d1Var != null) {
            lfm.d.a(d1Var);
        }
        d1 d1Var2 = new d1(obj2, j2, this);
        this.f = d1Var2;
        lfm.d.c(d1Var2, this.d.b(d1Var2, this.f270423b, this.f270424c));
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.e, cVar)) {
            this.e = cVar;
            this.f270422a.onSubscribe(this);
        }
    }
}
