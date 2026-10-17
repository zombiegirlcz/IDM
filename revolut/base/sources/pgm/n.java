package pgm;

import au0.x5;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class n implements fgm.d, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f236110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f236111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f236112c;
    public final fgm.o d;
    public dom.b e;

    public n(dom.a aVar, long j2, TimeUnit timeUnit, fgm.o oVar) {
        this.f236110a = aVar;
        this.f236111b = j2;
        this.f236112c = timeUnit;
        this.d = oVar;
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
        if (xgm.f.h(this.e, bVar)) {
            this.e = bVar;
            this.f236110a.e(this);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        this.d.a(new ag.q(this, 28), this.f236111b, this.f236112c);
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.d.a(new x5(26, (Object) this, false, (Object) th10), 0L, this.f236112c);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        this.d.a(new x5(27, (Object) this, false, obj2), this.f236111b, this.f236112c);
    }
}
