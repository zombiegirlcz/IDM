package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ifm.c f270417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f270418b;

    @Override // efm.y
    public final void onComplete() {
        this.f270418b = zfm.m.COMPLETE;
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f270418b = new zfm.k(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f270418b = obj2;
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        ifm.c cVar2 = this.f270417a;
        mfm.f.b(cVar, "next is null");
        if (cVar2 == null) {
            this.f270417a = cVar;
            return;
        }
        cVar.dispose();
        if (cVar2 != lfm.d.DISPOSED) {
            boh.f.o(e.class);
        }
    }
}
