package qfm;

import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends efm.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f245380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f245381c;

    public /* synthetic */ c(Object obj2, int i) {
        this.f245380b = i;
        this.f245381c = obj2;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        switch (this.f245380b) {
            case 0:
                b bVar = new b((Publisher[]) this.f245381c, aVar);
                aVar.e(bVar);
                bVar.onComplete();
                break;
            case 1:
                Object[] objArr = (Object[]) this.f245381c;
                if (!(aVar instanceof nfm.a)) {
                    aVar.e(new u0(aVar, objArr, 1));
                } else {
                    aVar.e(new u0((nfm.a) aVar, objArr, 0));
                }
                break;
            default:
                ((rfm.w) this.f245381c).i(new rfm.d0(aVar));
                break;
        }
    }
}
