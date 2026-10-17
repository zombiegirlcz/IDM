package tm;

import ihm.j;
import ofm.p;
import qza.q;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f272137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f272138c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f272136a = i;
        this.f272137b = obj2;
        this.f272138c = obj3;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f272136a) {
            case 0:
                g gVar = (g) this.f272137b;
                Object obj2 = (mm.a) this.f272138c;
                j jVar = gVar.e;
                if (obj2 == null) {
                    obj2 = mm.e.f207100a;
                }
                jVar.onNext(obj2);
                break;
            case 1:
                w4l.f fVar = (w4l.f) this.f272137b;
                Object obj3 = this.f272138c;
                fVar.c(null, (1 & 2) == 0, new sx4.b(obj3, 13));
                fVar.a(fVar.f294634a.invoke(obj3), obj3, new ru0.d(19), new q(27));
                break;
            default:
                w4l.f fVar2 = (w4l.f) this.f272137b;
                fVar2.f294637g.c((p) this.f272138c);
                break;
        }
    }
}
