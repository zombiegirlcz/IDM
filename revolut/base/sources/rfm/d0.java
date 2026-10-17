package rfm;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends yfm.c implements efm.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f253927c;

    @Override // yfm.c, dom.b
    public final void cancel() {
        super.cancel();
        this.f253927c.dispose();
    }

    @Override // efm.l
    public final void onComplete() {
        this.f313466a.onComplete();
    }

    @Override // efm.l
    public final void onError(Throwable th10) {
        this.f313466a.onError(th10);
    }

    @Override // efm.l
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f253927c, cVar)) {
            this.f253927c = cVar;
            this.f313466a.e(this);
        }
    }
}
