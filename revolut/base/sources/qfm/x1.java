package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class x1 extends z1 {
    @Override // dom.a
    public final void onComplete() {
        h(0);
    }

    @Override // qfm.z1, dom.a
    public final void onError(Throwable th10) {
        this.k.cancel();
        this.i.onError(th10);
    }
}
