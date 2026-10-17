package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class g6 implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.w f270491b;
    public boolean d = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lfm.b f270492c = new lfm.b(1);

    public g6(efm.y yVar, efm.w wVar) {
        this.f270490a = yVar;
        this.f270491b = wVar;
    }

    @Override // efm.y
    public final void onComplete() {
        if (!this.d) {
            this.f270490a.onComplete();
        } else {
            this.d = false;
            this.f270491b.subscribe(this);
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f270490a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.d) {
            this.d = false;
        }
        this.f270490a.onNext(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.b bVar = this.f270492c;
        bVar.getClass();
        lfm.d.d(bVar, cVar);
    }
}
