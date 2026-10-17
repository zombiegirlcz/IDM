package apc;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import dmc.r;
import k7i.i;
import m1h.n;
import prk.u;
import vc.s;
import ybl.k;
import ybl.l;
import zoc.h;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements ykc.a, ozg.a, w2f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9h.a f8144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zdl.f f8145c;
    public final l70.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f8146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f8147h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f8148j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f8149l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f8150m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f8151n;

    public b(l70.e eVar, h9h.a aVar, zdl.c cVar, zdl.f fVar) {
        this.f8143a = 1;
        this.f8148j = cVar;
        this.f8144b = aVar;
        this.f8145c = fVar;
        this.d = eVar;
        this.e = e4m.b.b(new u(this, 1, 5));
        this.f = e4m.b.b(new u(this, 2, 5));
        this.f8146g = e4m.b.b(new u(this, 3, 5));
        this.f8147h = e4m.b.b(new u(this, 0, 5));
        this.i = e4m.b.b(new u(this, 4, 5));
        this.k = e4m.b.b(new u(this, 5, 5));
        this.f8149l = e4m.b.b(new u(this, 6, 5));
        this.f8150m = e4m.b.b(new u(this, 7, 5));
        this.f8151n = e4m.b.b(new u(this, 8, 5));
    }

    @Override // ozg.a
    public final AnalyticsProduct P() {
        switch (this.f8143a) {
            case 0:
                return (AnalyticsProduct) this.f8146g.get();
            default:
                return (AnalyticsProduct) ((e4m.e) this.k).get();
        }
    }

    @Override // ozg.a
    public final m1h.c a() {
        switch (this.f8143a) {
            case 0:
                return (m1h.c) this.e.get();
            default:
                return (m1h.c) this.f8147h.get();
        }
    }

    @Override // ozg.a
    public final ozg.b b() {
        switch (this.f8143a) {
            case 0:
                return new h(((dmc.a) this.f8148j).a(), this.f8144b.n());
            default:
                return (ozg.b) ((e4m.e) this.f8149l).get();
        }
    }

    @Override // ozg.a
    public final m1h.a c() {
        switch (this.f8143a) {
            case 0:
                qmc.h hVarA = ((dmc.c) this.f8150m).a();
                nmc.d dVarD = ((dmc.a) this.f8148j).d();
                gte.a aVarB = ((ite.a) this.f8151n).b();
                s.j(aVarB);
                nmc.a aVar = new nmc.a(dVarD, aVarB);
                k kVarD = this.f8145c.d();
                s.j(kVarD);
                return new zoc.e(hVarA, aVar, kVarD);
            default:
                h9h.a aVar2 = this.f8144b;
                l lVarF = aVar2.f();
                kpj.f fVar = new kpj.f(aVar2.H());
                k kVarD2 = this.f8145c.d();
                s.j(kVarD2);
                return new p4f.e(lVarF, fVar, kVarD2);
        }
    }

    @Override // ozg.a
    public final m1h.k d() {
        switch (this.f8143a) {
            case 0:
                return h();
            default:
                ybl.d dVarH = ((zdl.c) this.f8148j).h();
                s.j(dVarH);
                h9h.a aVar = this.f8144b;
                return new p4f.f(dVarH, new i(aVar.f150260c.b(), aVar.J()), aVar.L());
        }
    }

    @Override // ozg.a
    public final ozg.c e() {
        switch (this.f8143a) {
            case 0:
                return (ozg.c) this.f8147h.get();
            default:
                return (ozg.c) ((e4m.e) this.f8150m).get();
        }
    }

    @Override // ozg.a
    public final n f() {
        switch (this.f8143a) {
            case 0:
                return (n) this.f.get();
            default:
                return (n) this.i.get();
        }
    }

    @Override // ozg.a
    public final boolean g() {
        switch (this.f8143a) {
            case 0:
                return ((Boolean) this.i.get()).booleanValue();
            default:
                return ((Boolean) ((e4m.e) this.f8151n).get()).booleanValue();
        }
    }

    public zoc.f h() {
        zjh.f fVarA = ((dmc.a) this.f8148j).a();
        h9h.a aVar = this.f8144b;
        t1j.b bVarG = aVar.G();
        l80.e eVarH = this.d.h();
        s.j(eVarH);
        return new zoc.f(fVarA, bVarG, eVarH, ((r) this.k).f(), new rul.e(((usg.a) this.f8149l).b(), aVar.J(), new zoc.i()));
    }

    public b(ite.a aVar, dmc.a aVar2, r rVar, dmc.c cVar, h9h.a aVar3, zdl.f fVar, l70.e eVar, usg.a aVar4) {
        this.f8143a = 0;
        this.f8148j = aVar2;
        this.f8144b = aVar3;
        this.d = eVar;
        this.k = rVar;
        this.f8149l = aVar4;
        this.f8150m = cVar;
        this.f8151n = aVar;
        this.f8145c = fVar;
        int i = 0;
        this.e = e4m.b.b(new a(this, 0, i));
        this.f = e4m.b.b(new a(this, 1, i));
        this.f8146g = e4m.b.b(new a(this, 2, i));
        this.f8147h = e4m.b.b(new a(this, 3, i));
        this.i = e4m.b.b(new a(this, 4, i));
    }
}
