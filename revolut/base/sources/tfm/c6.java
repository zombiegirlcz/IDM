package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class c6 implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bgm.d f270390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lfm.a f270391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f270392c;
    public volatile boolean d;
    public boolean e;

    public c6(bgm.d dVar, lfm.a aVar) {
        this.f270390a = dVar;
        this.f270391b = aVar;
    }

    @Override // efm.y
    public final void onComplete() {
        this.f270391b.dispose();
        this.f270390a.onComplete();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f270391b.dispose();
        this.f270390a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.e) {
            this.f270390a.onNext(obj2);
        } else if (this.d) {
            this.e = true;
            this.f270390a.onNext(obj2);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f270392c, cVar)) {
            this.f270392c = cVar;
            this.f270391b.a(0, cVar);
        }
    }
}
