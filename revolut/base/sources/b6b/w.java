package b6b;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class w implements xki.c, d7b.a, f7b.b, x7b.b, b8b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk.a f12682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f12684c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f12685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f12686h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f12687j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f12688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f12689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f12690n;

    public w(o oVar, agk.a aVar) {
        this.f12683b = oVar;
        this.f12682a = aVar;
        this.d = e4m.b.b(new m(oVar, this, 2, 8));
        this.e = e4m.b.b(new m(oVar, this, 3, 8));
        this.f = e4m.b.b(new m(oVar, this, 4, 8));
        this.f12685g = e4m.b.b(new m(oVar, this, 1, 8));
        this.f12686h = e4m.b.b(new m(oVar, this, 5, 8));
        this.i = e4m.b.b(new m(oVar, this, 0, 8));
        this.f12687j = e4m.b.b(new m(oVar, this, 7, 8));
        this.k = e4m.b.b(new m(oVar, this, 6, 8));
        this.f12688l = e4m.b.b(new m(oVar, this, 8, 8));
        this.f12689m = e4m.b.b(new m(oVar, this, 9, 8));
        this.f12690n = e4m.b.b(new m(oVar, this, 10, 8));
    }

    @Override // d7b.a
    public final z b() {
        return new z(this.f12683b, this.f12684c, 0);
    }

    @Override // f7b.b
    public final b0 c() {
        return new b0(this.f12683b, this.f12684c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.copyOf((Collection) this.i.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // x7b.b
    public final g0 j() {
        return new g0(this.f12683b, this.f12684c, 1);
    }

    @Override // b8b.b
    public final j0 q() {
        return new j0(this.f12683b, this.f12684c, 1);
    }

    public final r10.f s() {
        o oVar = this.f12683b;
        q5b.b bVarB = oVar.f12651b.b();
        vc.s.j(bVarB);
        return new r10.f(bVarB, oVar.e.a());
    }
}
