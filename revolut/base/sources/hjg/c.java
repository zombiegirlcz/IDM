package hjg;

import bq.i;
import com.google.common.collect.ImmutableSet;
import e4m.e;
import fsi.g;
import gsi.h;
import java.util.Set;
import xpi.f;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoi.d f152788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f152789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f152790c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f152791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f152792h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f152793j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f152794l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f152795m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f152796n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f152797p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f152798q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f152799r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f152800s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f152801t;
    public final e u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f152802w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f152803x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f152804y;

    public c(d dVar, xoi.d dVar2) {
        xpi.e eVar = f.Companion;
        this.f152789b = dVar;
        this.f152788a = dVar2;
        this.f152790c = e4m.b.b(new b(dVar, this, 0, 0));
        this.d = e4m.b.b(new b(dVar, this, 2, 0));
        this.e = e4m.b.b(new b(dVar, this, 1, 0));
        this.f = e4m.b.b(new b(dVar, this, 4, 0));
        this.f152791g = e4m.b.b(new b(dVar, this, 6, 0));
        this.f152792h = e4m.b.b(new b(dVar, this, 5, 0));
        this.i = e4m.b.b(new b(dVar, this, 3, 0));
        this.f152793j = e4m.b.b(new b(dVar, this, 8, 0));
        this.k = e4m.b.b(new b(dVar, this, 7, 0));
        this.f152794l = e4m.b.b(new b(dVar, this, 9, 0));
        this.f152795m = e4m.b.b(new b(dVar, this, 11, 0));
        this.f152796n = e4m.b.b(new b(dVar, this, 10, 0));
        this.o = e4m.b.b(new b(dVar, this, 12, 0));
        this.f152797p = e4m.b.b(new b(dVar, this, 13, 0));
        this.f152798q = e4m.b.b(new b(dVar, this, 14, 0));
        this.f152799r = e4m.b.b(new b(dVar, this, 15, 0));
        this.f152800s = e4m.b.b(new b(dVar, this, 17, 0));
        this.f152801t = e4m.b.b(new b(dVar, this, 16, 0));
        this.u = e4m.b.b(new b(dVar, this, 18, 0));
        this.v = e4m.b.b(new b(dVar, this, 19, 0));
        this.f152802w = e4m.b.b(new b(dVar, this, 20, 0));
        this.f152803x = e4m.b.b(new b(dVar, this, 22, 0));
        this.f152804y = e4m.b.b(new b(dVar, this, 21, 0));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return i.j(this.f152788a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f152788a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f152788a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f152788a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f152788a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f152788a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f152788a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f152788a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f152788a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f152788a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f152788a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f152788a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(18);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f152788a));
        builderBuilderWithExpectedSize.add(this.f152790c.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(new en.c((mm.d) this.f152789b.f152813n.get(), com.google.android.gms.internal.mlkit_vision_face.a.e(mm.e.class)));
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f152794l.get());
        builderBuilderWithExpectedSize.add(this.f152796n.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        builderBuilderWithExpectedSize.add(this.f152797p.get());
        builderBuilderWithExpectedSize.add(this.f152793j.get());
        builderBuilderWithExpectedSize.add(this.f152792h.get());
        builderBuilderWithExpectedSize.add(this.f152798q.get());
        builderBuilderWithExpectedSize.add(this.f152799r.get());
        builderBuilderWithExpectedSize.add(this.f152801t.get());
        builderBuilderWithExpectedSize.add(this.u.get());
        builderBuilderWithExpectedSize.add(this.v.get());
        return j6.a.g(this.f152802w, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f152788a);
    }
}
