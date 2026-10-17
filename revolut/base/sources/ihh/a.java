package ihh;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import e4m.e;
import ghh.d;
import i72.j;
import k7i.i;
import m1h.n;
import u8h.c;
import vc.s;
import x98.b;
import ybl.k;
import ybl.l;
import zdl.f;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements ozg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f161408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9h.a f161409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ite.a f161410c;
    public final c d;
    public final b e;
    public final e f = e4m.b.b(new j(this, 1, 15));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f161411g = e4m.b.b(new j(this, 2, 15));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f161412h = e4m.b.b(new j(this, 3, 15));
    public final e i = e4m.b.b(new j(this, 0, 15));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f161413j = e4m.b.b(new j(this, 5, 15));
    public final e k = e4m.b.b(new j(this, 6, 15));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f161414l = e4m.b.b(new j(this, 7, 15));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f161415m = e4m.b.b(new j(this, 4, 15));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f161416n = e4m.b.b(new j(this, 8, 15));
    public final e o = e4m.b.b(new j(this, 9, 15));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f161417p = e4m.b.b(new j(this, 10, 15));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f161418q = e4m.b.b(new j(this, 11, 15));

    public a(ite.a aVar, h9h.a aVar2, c cVar, f fVar, b bVar) {
        this.f161408a = fVar;
        this.f161409b = aVar2;
        this.f161410c = aVar;
        this.d = cVar;
        this.e = bVar;
    }

    @Override // ozg.a
    public final AnalyticsProduct P() {
        return (AnalyticsProduct) this.f161416n.get();
    }

    @Override // ozg.a
    public final m1h.c a() {
        return (m1h.c) this.i.get();
    }

    @Override // ozg.a
    public final ozg.b b() {
        return (ozg.b) this.o.get();
    }

    @Override // ozg.a
    public final m1h.a c() {
        h9h.a aVar = this.f161409b;
        l lVarF = aVar.f();
        kpj.f fVar = new kpj.f(aVar.H());
        k kVarD = this.f161408a.d();
        s.j(kVarD);
        return new d(lVarF, fVar, kVarD);
    }

    @Override // ozg.a
    public final m1h.k d() {
        return h();
    }

    @Override // ozg.a
    public final ozg.c e() {
        return (ozg.c) this.f161417p.get();
    }

    @Override // ozg.a
    public final n f() {
        return (n) this.f161415m.get();
    }

    @Override // ozg.a
    public final boolean g() {
        return ((Boolean) this.f161418q.get()).booleanValue();
    }

    public final ghh.f h() {
        k kVarD = this.f161408a.d();
        s.j(kVarD);
        h9h.a aVar = this.f161409b;
        i iVar = new i(aVar.f150260c.b(), aVar.J());
        gte.a aVarB = this.f161410c.b();
        s.j(aVarB);
        return new ghh.f(kVarD, iVar, aVarB);
    }
}
