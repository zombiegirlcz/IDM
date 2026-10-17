package ee6;

import dw3.f6;
import iri.j;
import ljl.q1;
import qth.g;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements hri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.e f125100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xd6.a f125101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gvh.a f125102c;
    public final q1 d;
    public final g e;
    public final e f = this;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f125103g = e4m.b.b(new f6(this, 0, 21));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f125104h = e4m.b.b(new f6(this, 1, 21));
    public final e4m.e i = e4m.b.b(new f6(this, 2, 21));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f125105j = e4m.b.b(new f6(this, 3, 21));

    public e(hri.b bVar, l70.e eVar, q1 q1Var, xd6.a aVar, gvh.a aVar2, g gVar) {
        this.f125100a = eVar;
        this.f125101b = aVar;
        this.f125102c = aVar2;
        this.d = q1Var;
        this.e = gVar;
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f125104h.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f125103g.get();
    }
}
