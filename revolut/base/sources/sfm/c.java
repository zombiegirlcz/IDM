package sfm;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qfm.f1;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AtomicReference implements efm.j, efm.d, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f262504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f1 f262505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f262506c;
    public final AtomicLong d = new AtomicLong();

    public c(dom.a aVar, f1 f1Var) {
        this.f262504a = aVar;
        this.f262505b = f1Var;
    }

    @Override // dom.b
    public final void a(long j2) {
        yfm.g.c(this, this.d, j2);
    }

    @Override // dom.b
    public final void cancel() {
        this.f262506c.dispose();
        yfm.g.b(this);
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        yfm.g.d(this, this.d, bVar);
    }

    @Override // dom.a
    public final void onComplete() {
        f1 f1Var = this.f262505b;
        if (f1Var == null) {
            this.f262504a.onComplete();
        } else {
            this.f262505b = null;
            f1Var.a(this);
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.f262504a.onError(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        this.f262504a.onNext(obj2);
    }

    @Override // efm.d
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f262506c, cVar)) {
            this.f262506c = cVar;
            this.f262504a.e(this);
        }
    }
}
