package sfm;

import efm.d0;
import efm.w;
import efm.y;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends efm.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f262502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f262503h;
    public final Object i;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f262502g = i;
        this.f262503h = obj2;
        this.i = obj3;
    }

    @Override // efm.r
    public final void subscribeActual(y yVar) {
        switch (this.f262502g) {
            case 0:
                a aVar = new a(yVar, (w) this.i, 0);
                yVar.onSubscribe(aVar);
                ((efm.b) this.f262503h).d(aVar);
                break;
            case 1:
                d dVar = new d(yVar, (kfm.o) this.i);
                yVar.onSubscribe(dVar);
                ((efm.k) this.f262503h).i(dVar);
                break;
            default:
                a aVar2 = new a(yVar, (kfm.o) this.i, 1);
                yVar.onSubscribe(aVar2);
                ((d0) this.f262503h).q(aVar2);
                break;
        }
    }
}
