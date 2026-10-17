package tfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class s4 extends AtomicInteger implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270809a;
    public final ihm.j d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final efm.w f270812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f270813h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f270810b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zfm.c f270811c = new zfm.c();
    public final r4 e = new r4(this, 0);
    public final AtomicReference f = new AtomicReference();

    public s4(efm.y yVar, ihm.j jVar, efm.w wVar) {
        this.f270809a = yVar;
        this.d = jVar;
        this.f270812g = wVar;
    }

    public final void a() {
        if (this.f270810b.getAndIncrement() == 0) {
            while (!isDisposed()) {
                if (!this.f270813h) {
                    this.f270813h = true;
                    this.f270812g.subscribe(this);
                }
                if (this.f270810b.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this.f);
        lfm.d.a(this.e);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) this.f.get());
    }

    @Override // efm.y
    public final void onComplete() {
        lfm.d.c(this.f, null);
        this.f270813h = false;
        this.d.onNext(0);
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        lfm.d.a(this.e);
        jh.d.p(this.f270809a, th10, this, this.f270811c);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        jh.d.q(this.f270809a, obj2, this, this.f270811c);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this.f, cVar);
    }
}
