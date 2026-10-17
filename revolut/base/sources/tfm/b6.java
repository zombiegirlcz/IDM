package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class b6 implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lfm.a f270367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c6 f270368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bgm.d f270369c;
    public ifm.c d;

    public b6(lfm.a aVar, c6 c6Var, bgm.d dVar) {
        this.f270367a = aVar;
        this.f270368b = c6Var;
        this.f270369c = dVar;
    }

    @Override // efm.y
    public final void onComplete() {
        this.f270368b.d = true;
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f270367a.dispose();
        this.f270369c.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.d.dispose();
        this.f270368b.d = true;
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.d, cVar)) {
            this.d = cVar;
            this.f270367a.a(1, cVar);
        }
    }
}
