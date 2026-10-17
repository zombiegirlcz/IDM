package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class k1 implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.y f270584b;

    public /* synthetic */ k1(efm.y yVar, int i) {
        this.f270583a = i;
        this.f270584b = yVar;
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270583a) {
            case 0:
                ((l1) this.f270584b).f270604b.onComplete();
                break;
            default:
                p5 p5Var = (p5) this.f270584b;
                p5Var.d.dispose();
                p5Var.a();
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270583a) {
            case 0:
                ((l1) this.f270584b).f270604b.onError(th10);
                break;
            default:
                p5 p5Var = (p5) this.f270584b;
                p5Var.d.dispose();
                p5Var.f270720a.onError(th10);
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270583a) {
            case 0:
                ((l1) this.f270584b).f270604b.onNext(obj2);
                break;
            default:
                ((p5) this.f270584b).b();
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f270583a) {
            case 0:
                lfm.b bVar = ((l1) this.f270584b).f270603a;
                bVar.getClass();
                lfm.d.d(bVar, cVar);
                break;
            default:
                lfm.d.e(((p5) this.f270584b).f270722c, cVar);
                break;
        }
    }
}
