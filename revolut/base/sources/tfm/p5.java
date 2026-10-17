package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p5 extends AtomicReference implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bgm.d f270720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.w f270721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f270722c = new AtomicReference();
    public ifm.c d;

    public p5(bgm.d dVar, efm.w wVar) {
        this.f270720a = dVar;
        this.f270721b = wVar;
    }

    public abstract void a();

    public abstract void b();

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this.f270722c);
        this.d.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270722c.get() == lfm.d.DISPOSED;
    }

    @Override // efm.y
    public final void onComplete() {
        lfm.d.a(this.f270722c);
        a();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        lfm.d.a(this.f270722c);
        this.f270720a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        lazySet(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.d, cVar)) {
            this.d = cVar;
            this.f270720a.onSubscribe(this);
            if (this.f270722c.get() == null) {
                this.f270721b.subscribe(new k1(this, 1));
            }
        }
    }
}
