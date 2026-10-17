package pgm;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes14.dex */
public final class l extends AtomicLong implements fgm.d, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ghm.a f236097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f236098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f236099c;
    public final fgm.o d;
    public dom.b e;
    public k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile long f236100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f236101h;

    public l(ghm.a aVar, long j2, TimeUnit timeUnit, fgm.o oVar) {
        this.f236097a = aVar;
        this.f236098b = j2;
        this.f236099c = timeUnit;
        this.d = oVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (xgm.f.f(j2)) {
            xam.a.b(this, j2);
        }
    }

    @Override // dom.b
    public final void cancel() {
        this.e.cancel();
        this.d.dispose();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.h(this.e, bVar)) {
            this.e = bVar;
            this.f236097a.e(this);
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.f236101h) {
            return;
        }
        this.f236101h = true;
        k kVar = this.f;
        if (kVar != null) {
            jgm.b.a(kVar);
        }
        if (kVar != null) {
            kVar.a();
        }
        this.f236097a.onComplete();
        this.d.dispose();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.f236101h) {
            jb3.l.v(th10);
            return;
        }
        this.f236101h = true;
        k kVar = this.f;
        if (kVar != null) {
            jgm.b.a(kVar);
        }
        this.f236097a.onError(th10);
        this.d.dispose();
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f236101h) {
            return;
        }
        long j2 = this.f236100g + 1;
        this.f236100g = j2;
        k kVar = this.f;
        if (kVar != null) {
            jgm.b.a(kVar);
        }
        k kVar2 = new k(obj2, j2, this);
        this.f = kVar2;
        jgm.b.c(kVar2, this.d.a(kVar2, this.f236098b, this.f236099c));
    }
}
