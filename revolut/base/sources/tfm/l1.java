package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class l1 implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lfm.b f270603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.y f270604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f270605c;
    public final /* synthetic */ l d;

    public l1(l lVar, lfm.b bVar, efm.y yVar) {
        this.d = lVar;
        this.f270603a = bVar;
        this.f270604b = yVar;
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.f270605c) {
            return;
        }
        this.f270605c = true;
        ((efm.r) this.d.f270600h).subscribe(new k1(this, 0));
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.f270605c) {
            mo3.a.m(th10);
        } else {
            this.f270605c = true;
            this.f270604b.onError(th10);
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        onComplete();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.b bVar = this.f270603a;
        bVar.getClass();
        lfm.d.d(bVar, cVar);
    }
}
