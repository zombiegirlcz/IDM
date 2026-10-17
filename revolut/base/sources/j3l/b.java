package j3l;

import bq.i;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import fsi.g;
import h3l.l;
import java.util.Set;
import yy0.f;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f171225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f171226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f171227c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f171228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f171229h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f171230j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f171231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f171232m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f171233n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f171234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f171235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f171236r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f171237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f171238t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f171239w;

    public b(c cVar, xoi.d dVar) {
        this.f171226b = cVar;
        this.f171225a = dVar;
        int i = 22;
        this.f171227c = e4m.b.b(new iwb.b(cVar, this, 0, i));
        this.d = e4m.b.b(new iwb.b(cVar, this, 1, i));
        this.e = e4m.b.b(new iwb.b(cVar, this, 3, i));
        this.f = e4m.b.b(new iwb.b(cVar, this, 2, i));
        this.f171228g = e4m.b.b(new iwb.b(cVar, this, 5, i));
        this.f171229h = e4m.b.b(new iwb.b(cVar, this, 7, i));
        this.i = e4m.b.b(new iwb.b(cVar, this, 6, i));
        this.f171230j = e4m.b.b(new iwb.b(cVar, this, 4, i));
        this.k = e4m.b.b(new iwb.b(cVar, this, 9, i));
        this.f171231l = e4m.b.b(new iwb.b(cVar, this, 8, i));
        this.f171232m = e4m.b.b(new iwb.b(cVar, this, 10, i));
        this.f171233n = e4m.b.b(new iwb.b(cVar, this, 12, i));
        this.o = e4m.b.b(new iwb.b(cVar, this, 11, i));
        this.f171234p = e4m.b.b(new iwb.b(cVar, this, 13, i));
        this.f171235q = e4m.b.b(new iwb.b(cVar, this, 14, i));
        this.f171236r = e4m.b.b(new iwb.b(cVar, this, 15, i));
        this.f171237s = e4m.b.b(new iwb.b(cVar, this, 16, i));
        this.f171238t = e4m.b.b(new iwb.b(cVar, this, 18, i));
        this.u = e4m.b.b(new iwb.b(cVar, this, 17, i));
        this.v = e4m.b.b(new iwb.b(cVar, this, 19, i));
        this.f171239w = e4m.b.b(new iwb.b(cVar, this, 20, i));
    }

    @Override // gsi.a
    public final f Q() {
        return i.j(this.f171225a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f171225a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f171225a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f171225a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f171225a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f171225a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f171225a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f171225a);
    }

    @Override // j3l.e
    public final l b() {
        return (l) this.f171239w.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f171225a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f171225a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f171225a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f171225a);
    }

    @Override // j3l.e
    public final h3l.e getState() {
        return (h3l.e) this.f171226b.f171247m.get();
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(17);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f171225a));
        builderBuilderWithExpectedSize.add(this.f171227c.get());
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f171230j.get());
        c cVar = this.f171226b;
        builderBuilderWithExpectedSize.add(new en.c((mm.d) cVar.f171246l.get(), ImmutableMap.of(mm.e.class, (mm.b) new mm.f(), h3l.c.class, (mm.b) cVar.f171248n.get(), h3l.d.class, (mm.b) cVar.o.get(), h3l.b.class, (mm.b) cVar.f171249p.get(), h3l.a.class, (mm.b) cVar.f171250q.get())));
        builderBuilderWithExpectedSize.add(this.f171231l.get());
        builderBuilderWithExpectedSize.add(this.f171232m.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        builderBuilderWithExpectedSize.add(this.f171234p.get());
        builderBuilderWithExpectedSize.add(this.f171235q.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.f171236r.get());
        builderBuilderWithExpectedSize.add(this.f171237s.get());
        builderBuilderWithExpectedSize.add(this.u.get());
        return j6.a.g(this.v, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f171225a);
    }
}
