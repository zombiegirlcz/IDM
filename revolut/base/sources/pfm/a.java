package pfm;

import efm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends efm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f235714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f235715c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f235713a = i;
        this.f235714b = obj2;
        this.f235715c = obj3;
    }

    @Override // efm.b
    public final void x(efm.d dVar) {
        switch (this.f235713a) {
            case 0:
                ((efm.b) this.f235714b).d(new ofm.h(dVar, (efm.f) this.f235715c, 1));
                break;
            case 1:
                ((efm.b) this.f235714b).d(new cpi.g(this, dVar));
                break;
            case 2:
                u uVar = new u(dVar, (kfm.o) this.f235715c);
                dVar.onSubscribe(uVar);
                ((efm.b) this.f235714b).d(uVar);
                break;
            case 3:
                rfm.k kVar = new rfm.k(dVar, (kfm.o) this.f235715c, 0);
                dVar.onSubscribe(kVar);
                ((efm.k) this.f235714b).i(kVar);
                break;
            default:
                rfm.k kVar2 = new rfm.k(dVar, (kfm.o) this.f235715c, 1);
                dVar.onSubscribe(kVar2);
                ((d0) this.f235714b).q(kVar2);
                break;
        }
    }
}
