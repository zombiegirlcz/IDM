package na4;

import bq.i;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import h3l.l;
import java.util.Set;
import ms1.s;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements j3l.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fsi.g f213779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f213780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f213781c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f213782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f213783h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f213784j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f213785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f213786m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f213787n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f213788p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f213789q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f213790r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f213791s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f213792t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f213793w;

    public g(e eVar, xoi.d dVar) {
        this.f213780b = eVar;
        this.f213779a = dVar;
        int i = 13;
        this.f213781c = e4m.b.b(new s(eVar, this, 0, i));
        this.d = e4m.b.b(new s(eVar, this, 1, i));
        this.e = e4m.b.b(new s(eVar, this, 3, i));
        this.f = e4m.b.b(new s(eVar, this, 2, i));
        this.f213782g = e4m.b.b(new s(eVar, this, 5, i));
        this.f213783h = e4m.b.b(new s(eVar, this, 7, i));
        this.i = e4m.b.b(new s(eVar, this, 6, i));
        this.f213784j = e4m.b.b(new s(eVar, this, 4, i));
        this.k = e4m.b.b(new s(eVar, this, 9, i));
        this.f213785l = e4m.b.b(new s(eVar, this, 8, i));
        this.f213786m = e4m.b.b(new s(eVar, this, 10, i));
        this.f213787n = e4m.b.b(new s(eVar, this, 12, i));
        this.o = e4m.b.b(new s(eVar, this, 11, i));
        this.f213788p = e4m.b.b(new s(eVar, this, 13, i));
        this.f213789q = e4m.b.b(new s(eVar, this, 14, i));
        this.f213790r = e4m.b.b(new s(eVar, this, 15, i));
        this.f213791s = e4m.b.b(new s(eVar, this, 16, i));
        this.f213792t = e4m.b.b(new s(eVar, this, 18, i));
        this.u = e4m.b.b(new s(eVar, this, 17, i));
        this.v = e4m.b.b(new s(eVar, this, 19, i));
        this.f213793w = e4m.b.b(new s(eVar, this, 20, i));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return i.j(this.f213779a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f213779a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f213779a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f213779a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f213779a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f213779a);
    }

    @Override // gsi.h
    public final fsi.g a() {
        return this.f213779a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f213779a);
    }

    @Override // j3l.e
    public final l b() {
        return (l) this.f213793w.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f213779a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f213779a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f213779a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f213779a);
    }

    @Override // j3l.e
    public final h3l.e getState() {
        return (h3l.e) this.f213780b.f0.get();
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(17);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f213779a));
        builderBuilderWithExpectedSize.add(this.f213781c.get());
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f213784j.get());
        e eVar = this.f213780b;
        mm.d dVar = (mm.d) eVar.Z.get();
        ImmutableMap.Builder builderBuilderWithExpectedSize2 = ImmutableMap.builderWithExpectedSize(8);
        builderBuilderWithExpectedSize2.put(mm.e.class, new mm.f());
        builderBuilderWithExpectedSize2.put(qc0.c.class, eVar.c0.get());
        builderBuilderWithExpectedSize2.put(qc0.d.class, eVar.f213753d0.get());
        builderBuilderWithExpectedSize2.put(qc0.f.class, eVar.f213754e0.get());
        builderBuilderWithExpectedSize2.put(h3l.c.class, eVar.g0.get());
        builderBuilderWithExpectedSize2.put(h3l.d.class, eVar.f213757h0.get());
        builderBuilderWithExpectedSize2.put(h3l.b.class, eVar.i0.get());
        builderBuilderWithExpectedSize2.put(h3l.a.class, eVar.j0.get());
        builderBuilderWithExpectedSize.add(new en.c(dVar, builderBuilderWithExpectedSize2.build()));
        builderBuilderWithExpectedSize.add(this.f213785l.get());
        builderBuilderWithExpectedSize.add(this.f213786m.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        builderBuilderWithExpectedSize.add(this.f213788p.get());
        builderBuilderWithExpectedSize.add(this.f213789q.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.f213790r.get());
        builderBuilderWithExpectedSize.add(this.f213791s.get());
        builderBuilderWithExpectedSize.add(this.u.get());
        return j6.a.g(this.v, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f213779a);
    }
}
