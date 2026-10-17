package qfm;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends AtomicLong implements efm.j, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f245542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f245543c = new s(this);
    public final AtomicReference d = new AtomicReference();

    public t(dom.a aVar, n nVar) {
        this.f245541a = aVar;
        this.f245542b = nVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (yfm.g.f(j2)) {
            yfm.g.c(this.d, this, j2);
        }
    }

    @Override // dom.b
    public final void cancel() {
        yfm.g.b(this.f245543c);
        yfm.g.b(this.d);
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        yfm.g.d(this.d, this, bVar);
    }

    @Override // dom.a
    public final void onComplete() {
        this.f245541a.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.f245541a.onError(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        this.f245541a.onNext(obj2);
    }
}
