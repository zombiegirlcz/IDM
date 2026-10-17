package m2b;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements xki.c, j4b.a, x3b.a, r4b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2b.d f201851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f201852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f201853c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f201854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f201855h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f201856j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f201857l;

    public m(v vVar, ViewController viewController, w2b.d dVar) {
        this.f201852b = vVar;
        this.f201851a = dVar;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 7;
        this.e = e4m.b.b(new lzk.b(vVar, this, 2, i));
        this.f = e4m.b.b(new lzk.b(vVar, this, 1, i));
        this.f201854g = e4m.b.b(new lzk.b(vVar, this, 0, i));
        this.f201855h = e4m.b.b(new lzk.b(vVar, this, 4, i));
        this.i = e4m.b.b(new lzk.b(vVar, this, 3, i));
        this.f201856j = e4m.b.b(new lzk.b(vVar, this, 5, i));
        this.k = e4m.b.b(new lzk.b(vVar, this, 6, i));
        this.f201857l = e4m.b.b(new lzk.b(vVar, this, 7, i));
    }

    @Override // x3b.a
    public final z b() {
        return new z(this.f201852b, this.f201853c, 1);
    }

    @Override // j4b.a
    public final b0 c() {
        return new b0(this.f201852b, this.f201853c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f201854g.get());
    }

    @Override // r4b.a
    public final d0 j() {
        return new d0(this.f201852b, this.f201853c, 1);
    }

    public final o7.b q() {
        ybl.d dVarH = this.f201852b.e.h();
        vc.s.j(dVarH);
        return new o7.b(dVarH);
    }
}
