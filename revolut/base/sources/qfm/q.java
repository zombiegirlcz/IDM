package qfm;

import au0.x5;
import efm.c0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements efm.j, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f245506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f245507c;
    public final c0.a d;
    public dom.b e;

    public q(dom.a aVar, long j2, TimeUnit timeUnit, c0.a aVar2) {
        this.f245505a = aVar;
        this.f245506b = j2;
        this.f245507c = timeUnit;
        this.d = aVar2;
    }

    @Override // dom.b
    public final void a(long j2) {
        this.e.a(j2);
    }

    @Override // dom.b
    public final void cancel() {
        this.e.cancel();
        this.d.dispose();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.e, bVar)) {
            this.e = bVar;
            this.f245505a.e(this);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        this.d.b(new o(this), this.f245506b, this.f245507c);
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.d.b(new p(this, th10), 0L, this.f245507c);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        this.d.b(new x5(28, (Object) this, false, obj2), this.f245506b, this.f245507c);
    }
}
