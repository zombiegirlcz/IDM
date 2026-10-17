package ufm;

import efm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class q extends yfm.c implements f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f279907c;

    @Override // yfm.c, dom.b
    public final void cancel() {
        super.cancel();
        this.f279907c.dispose();
    }

    @Override // efm.f0
    public final void onError(Throwable th10) {
        this.f313466a.onError(th10);
    }

    @Override // efm.f0
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f279907c, cVar)) {
            this.f279907c = cVar;
            this.f313466a.e(this);
        }
    }
}
