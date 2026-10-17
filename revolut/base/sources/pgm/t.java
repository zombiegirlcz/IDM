package pgm;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes14.dex */
public final class t extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.g f236143c;
    public final he2.b d;
    public final kgm.b e;
    public final kgm.b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b bVar, igm.g gVar) {
        super(bVar);
        he2.b bVar2 = kgm.j.d;
        kgm.b bVar3 = kgm.j.f184027c;
        this.f236143c = gVar;
        this.d = bVar2;
        this.e = bVar3;
        this.f = bVar3;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        boolean z = aVar instanceof bhm.a;
        igm.g gVar = this.f236143c;
        Flowable flowable = this.f236000b;
        if (z) {
            flowable.j(new r((bhm.a) aVar, gVar, this.d, this.e, this.f));
        } else {
            flowable.j(new s(aVar, gVar, this.d, this.e, this.f));
        }
    }
}
