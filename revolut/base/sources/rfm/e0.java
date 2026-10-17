package rfm;

/* JADX INFO: loaded from: classes13.dex */
public final class e0 extends ofm.j implements efm.l, efm.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f253931c;
    public ifm.c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(efm.y yVar, int i) {
        super(yVar);
        this.f253931c = i;
    }

    @Override // ofm.j, ifm.c
    public final void dispose() {
        switch (this.f253931c) {
            case 0:
                super.dispose();
                this.d.dispose();
                break;
            default:
                super.dispose();
                this.d.dispose();
                break;
        }
    }

    @Override // efm.l
    public void onComplete() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f224925a.onComplete();
    }

    @Override // efm.l
    public final void onError(Throwable th10) {
        switch (this.f253931c) {
            case 0:
                if ((get() & 54) == 0) {
                    lazySet(2);
                    this.f224925a.onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
            default:
                if ((get() & 54) == 0) {
                    lazySet(2);
                    this.f224925a.onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
        }
    }

    @Override // efm.l
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f253931c) {
            case 0:
                if (lfm.d.f(this.d, cVar)) {
                    this.d = cVar;
                    this.f224925a.onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.f(this.d, cVar)) {
                    this.d = cVar;
                    this.f224925a.onSubscribe(this);
                }
                break;
        }
    }
}
