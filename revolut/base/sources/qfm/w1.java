package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class w1 extends efm.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f245574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f245575c;

    public w1(int i, int i2) {
        this.f245574b = i;
        this.f245575c = i + i2;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        boolean z = aVar instanceof nfm.a;
        int i = this.f245575c;
        int i2 = this.f245574b;
        if (z) {
            aVar.e(new v1((nfm.a) aVar, i2, i, 0));
        } else {
            aVar.e(new v1(aVar, i2, i, 1));
        }
    }
}
