package t64;

import bq.i;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import fsi.g;
import java.util.Set;
import t0b.l;
import yy0.f;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements j3l.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f268237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f268238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f268239c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f268240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f268241h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f268242j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f268243l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f268244m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f268245n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f268246p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f268247q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f268248r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f268249s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f268250t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f268251w;

    public d(c cVar, xoi.d dVar) {
        this.f268238b = cVar;
        this.f268237a = dVar;
        int i = 10;
        this.f268239c = e4m.b.b(new l(cVar, this, 0, i));
        this.d = e4m.b.b(new l(cVar, this, 1, i));
        this.e = e4m.b.b(new l(cVar, this, 3, i));
        this.f = e4m.b.b(new l(cVar, this, 2, i));
        this.f268240g = e4m.b.b(new l(cVar, this, 5, i));
        this.f268241h = e4m.b.b(new l(cVar, this, 7, i));
        this.i = e4m.b.b(new l(cVar, this, 6, i));
        this.f268242j = e4m.b.b(new l(cVar, this, 4, i));
        this.k = e4m.b.b(new l(cVar, this, 9, i));
        this.f268243l = e4m.b.b(new l(cVar, this, 8, i));
        this.f268244m = e4m.b.b(new l(cVar, this, 10, i));
        this.f268245n = e4m.b.b(new l(cVar, this, 12, i));
        this.o = e4m.b.b(new l(cVar, this, 11, i));
        this.f268246p = e4m.b.b(new l(cVar, this, 13, i));
        this.f268247q = e4m.b.b(new l(cVar, this, 14, i));
        this.f268248r = e4m.b.b(new l(cVar, this, 15, i));
        this.f268249s = e4m.b.b(new l(cVar, this, 16, i));
        this.f268250t = e4m.b.b(new l(cVar, this, 18, i));
        this.u = e4m.b.b(new l(cVar, this, 17, i));
        this.v = e4m.b.b(new l(cVar, this, 19, i));
        this.f268251w = e4m.b.b(new l(cVar, this, 20, i));
    }

    @Override // gsi.a
    public final f Q() {
        return i.j(this.f268237a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f268237a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f268237a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f268237a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f268237a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f268237a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f268237a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f268237a);
    }

    @Override // j3l.e
    public final h3l.l b() {
        return (h3l.l) this.f268251w.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f268237a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f268237a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f268237a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f268237a);
    }

    @Override // j3l.e
    public final h3l.e getState() {
        return (h3l.e) this.f268238b.f0.get();
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(17);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f268237a));
        builderBuilderWithExpectedSize.add(this.f268239c.get());
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f268242j.get());
        c cVar = this.f268238b;
        mm.d dVar = (mm.d) cVar.Z.get();
        ImmutableMap.Builder builderBuilderWithExpectedSize2 = ImmutableMap.builderWithExpectedSize(8);
        builderBuilderWithExpectedSize2.put(mm.e.class, new mm.f());
        builderBuilderWithExpectedSize2.put(qc0.c.class, cVar.c0.get());
        builderBuilderWithExpectedSize2.put(qc0.d.class, cVar.f268211d0.get());
        builderBuilderWithExpectedSize2.put(qc0.f.class, cVar.f268212e0.get());
        builderBuilderWithExpectedSize2.put(h3l.c.class, cVar.g0.get());
        builderBuilderWithExpectedSize2.put(h3l.d.class, cVar.f268215h0.get());
        builderBuilderWithExpectedSize2.put(h3l.b.class, cVar.i0.get());
        builderBuilderWithExpectedSize2.put(h3l.a.class, cVar.j0.get());
        builderBuilderWithExpectedSize.add(new en.c(dVar, builderBuilderWithExpectedSize2.build()));
        builderBuilderWithExpectedSize.add(this.f268243l.get());
        builderBuilderWithExpectedSize.add(this.f268244m.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        builderBuilderWithExpectedSize.add(this.f268246p.get());
        builderBuilderWithExpectedSize.add(this.f268247q.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.f268248r.get());
        builderBuilderWithExpectedSize.add(this.f268249s.get());
        builderBuilderWithExpectedSize.add(this.u.get());
        return j6.a.g(this.v, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f268237a);
    }
}
