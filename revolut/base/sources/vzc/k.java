package vzc;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements gsi.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoi.d f293504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f293505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f293506c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f293507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f293508h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f293509j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f293510l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f293511m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f293512n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f293513p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f293514q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f293515r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f293516s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f293517t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f293518w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f293519x;

    public k(b bVar, xoi.d dVar) {
        wpi.c cVar = wpi.d.Companion;
        this.f293505b = bVar;
        this.f293504a = dVar;
        int i = 0;
        this.f293506c = e4m.b.b(new j(bVar, this, i, i));
        this.d = e4m.b.b(new j(bVar, this, 1, i));
        this.e = e4m.b.b(new j(bVar, this, 3, i));
        this.f = e4m.b.b(new j(bVar, this, 2, i));
        this.f293507g = e4m.b.b(new j(bVar, this, 4, i));
        this.f293508h = e4m.b.b(new j(bVar, this, 5, i));
        this.i = e4m.b.b(new j(bVar, this, 7, i));
        this.f293509j = e4m.b.b(new j(bVar, this, 6, i));
        this.k = e4m.b.b(new j(bVar, this, 8, i));
        this.f293510l = e4m.b.b(new j(bVar, this, 9, i));
        this.f293511m = e4m.b.b(new j(bVar, this, 11, i));
        this.f293512n = e4m.b.b(new j(bVar, this, 10, i));
        this.o = e4m.b.b(new j(bVar, this, 13, i));
        this.f293513p = e4m.b.b(new j(bVar, this, 12, i));
        this.f293514q = e4m.b.b(new j(bVar, this, 14, i));
        this.f293515r = e4m.b.b(new j(bVar, this, 15, i));
        this.f293516s = e4m.b.b(new j(bVar, this, 17, i));
        this.f293517t = e4m.b.b(new j(bVar, this, 16, i));
        this.u = e4m.b.b(new j(bVar, this, 18, i));
        this.v = e4m.b.b(new j(bVar, this, 19, i));
        this.f293518w = e4m.b.b(new j(bVar, this, 21, i));
        this.f293519x = e4m.b.b(new j(bVar, this, 20, i));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return bq.i.j(this.f293504a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f293504a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f293504a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f293504a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f293504a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f293504a);
    }

    @Override // gsi.h
    public final fsi.g a() {
        return this.f293504a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f293504a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f293504a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f293504a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f293504a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f293504a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(17);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f293504a));
        builderBuilderWithExpectedSize.add(this.f293506c.get());
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f293507g.get());
        builderBuilderWithExpectedSize.add(this.f293508h.get());
        builderBuilderWithExpectedSize.add(this.f293509j.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f293510l.get());
        builderBuilderWithExpectedSize.add(this.f293512n.get());
        builderBuilderWithExpectedSize.add(this.f293513p.get());
        builderBuilderWithExpectedSize.add(new en.c((mm.d) this.f293505b.v.get(), com.google.android.gms.internal.mlkit_vision_face.a.e(mm.e.class)));
        builderBuilderWithExpectedSize.add(this.f293514q.get());
        builderBuilderWithExpectedSize.add(this.f293515r.get());
        builderBuilderWithExpectedSize.add(this.f293517t.get());
        builderBuilderWithExpectedSize.add(this.u.get());
        return j6.a.g(this.v, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f293504a);
    }
}
