package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7d.i f109715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mkd.g f109716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f109717c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f109718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f109719h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f109720j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f109721l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f109722m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f109723n;

    public i0(h0 h0Var, p0 p0Var, ViewController viewController, mkd.g gVar, i7d.i iVar) {
        this.f109717c = h0Var;
        this.f109715a = iVar;
        this.f109716b = gVar;
        int i = 2;
        this.d = e4m.b.b(new d0(h0Var, this, 2, i));
        this.e = e4m.b.b(new d0(h0Var, this, 1, i));
        this.f = e4m.b.b(new d0(h0Var, this, 0, i));
        this.f109718g = e4m.b.b(new d0(h0Var, this, 4, i));
        this.f109719h = e4m.b.b(new d0(h0Var, this, 3, i));
        this.i = e4m.b.b(e4m.c.a(viewController));
        int i2 = 2;
        this.f109720j = e4m.b.b(new d0(h0Var, this, 5, i2));
        this.k = e4m.b.b(new d0(h0Var, this, 6, i2));
        this.f109721l = e4m.b.b(new d0(h0Var, this, 7, i2));
        this.f109722m = e4m.b.b(new d0(h0Var, this, 9, i2));
        this.f109723n = e4m.b.b(new d0(h0Var, this, 8, i2));
    }

    @Override // xki.e
    public final Set f() {
        yji.n nVar = (yji.n) this.k.get();
        i7d.o oVar = (i7d.o) this.f109718g.get();
        h7d.e.a(oVar);
        return ImmutableSet.of(nVar, (yji.n) oVar, (yji.n) this.f109721l.get());
    }

    @Override // xki.e
    public final Set g() {
        yji.d dVar = (yji.d) this.f.get();
        i7d.n nVar = (i7d.n) this.f109719h.get();
        h7d.c.a(nVar);
        return ImmutableSet.of(dVar, (yji.d) nVar, (yji.d) this.f109720j.get());
    }
}
