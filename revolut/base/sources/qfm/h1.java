package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class h1 extends efm.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f245421b;

    public /* synthetic */ h1(Object obj2, int i) {
        this.f245420a = i;
        this.f245421b = obj2;
    }

    @Override // efm.k
    public final void j(efm.l lVar) {
        switch (this.f245420a) {
            case 0:
                ((u2) this.f245421b).a(new g1(lVar));
                break;
            case 1:
                lVar.onSubscribe(lfm.e.INSTANCE);
                lVar.onError((Throwable) this.f245421b);
                break;
            default:
                ((pfm.t) this.f245421b).d(new rfm.p(lVar, 0));
                break;
        }
    }
}
