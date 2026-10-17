package tfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class i5 extends AtomicInteger implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270537a;
    public final ihm.j d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final efm.w f270540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f270541h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f270538b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zfm.c f270539c = new zfm.c();
    public final h5 e = new h5(this);
    public final AtomicReference f = new AtomicReference();

    public i5(efm.y yVar, ihm.j jVar, efm.w wVar) {
        this.f270537a = yVar;
        this.d = jVar;
        this.f270540g = wVar;
    }

    public final void a() {
        if (this.f270538b.getAndIncrement() == 0) {
            while (!isDisposed()) {
                if (!this.f270541h) {
                    this.f270541h = true;
                    this.f270540g.subscribe(this);
                }
                if (this.f270538b.decrementAndGet() == 0) {
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
        lfm.d.a(this.e);
        jh.d.o(this.f270537a, this, this.f270539c);
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        lfm.d.c(this.f, null);
        this.f270541h = false;
        this.d.onNext(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        jh.d.q(this.f270537a, obj2, this, this.f270539c);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.c(this.f, cVar);
    }
}
