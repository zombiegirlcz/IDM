package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class n1 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public efm.y f270668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f270669c;

    private final void a(Object obj2) {
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f270667a) {
            case 0:
                ifm.c cVar = this.f270669c;
                zfm.e eVar = zfm.e.INSTANCE;
                this.f270669c = eVar;
                this.f270668b = eVar;
                cVar.dispose();
                break;
            case 1:
                this.f270669c.dispose();
                break;
            default:
                this.f270669c.dispose();
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f270667a) {
        }
        return this.f270669c.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270667a) {
            case 0:
                efm.y yVar = this.f270668b;
                zfm.e eVar = zfm.e.INSTANCE;
                this.f270669c = eVar;
                this.f270668b = eVar;
                yVar.onComplete();
                break;
            case 1:
                this.f270668b.onComplete();
                break;
            default:
                efm.y yVar2 = this.f270668b;
                yVar2.onNext(efm.p.f125386b);
                yVar2.onComplete();
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270667a) {
            case 0:
                efm.y yVar = this.f270668b;
                zfm.e eVar = zfm.e.INSTANCE;
                this.f270669c = eVar;
                this.f270668b = eVar;
                yVar.onError(th10);
                break;
            case 1:
                this.f270668b.onError(th10);
                break;
            default:
                efm.p pVarA = efm.p.a(th10);
                efm.y yVar2 = this.f270668b;
                yVar2.onNext(pVarA);
                yVar2.onComplete();
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270667a) {
            case 0:
                this.f270668b.onNext(obj2);
                break;
            case 1:
                break;
            default:
                this.f270668b.onNext(efm.p.b(obj2));
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f270667a) {
            case 0:
                if (lfm.d.f(this.f270669c, cVar)) {
                    this.f270669c = cVar;
                    this.f270668b.onSubscribe(this);
                }
                break;
            case 1:
                this.f270669c = cVar;
                this.f270668b.onSubscribe(this);
                break;
            default:
                if (lfm.d.f(this.f270669c, cVar)) {
                    this.f270669c = cVar;
                    this.f270668b.onSubscribe(this);
                }
                break;
        }
    }

    public /* synthetic */ n1(efm.y yVar, int i) {
        this.f270667a = i;
        this.f270668b = yVar;
    }
}
