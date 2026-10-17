package z4b;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import e4m.e;
import k7i.i;
import m1h.k;
import m1h.n;
import vc.s;
import zdl.f;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements ozg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f319362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9h.a f319363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f319364c = e4m.b.b(new a9i.b(0, 17));
    public final e d = e4m.b.b(new a9i.b(1, 17));
    public final e e = e4m.b.b(new a9i.b(2, 17));
    public final e f = e4m.b.b(new a9i.b(3, 17));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f319365g = e4m.b.b(new a9i.b(4, 17));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f319366h = e4m.b.b(new a9i.b(5, 17));

    public c(f fVar, h9h.a aVar) {
        this.f319362a = fVar;
        this.f319363b = aVar;
    }

    @Override // ozg.a
    public final AnalyticsProduct P() {
        return (AnalyticsProduct) this.e.get();
    }

    @Override // ozg.a
    public final m1h.c a() {
        return (m1h.c) this.f319364c.get();
    }

    @Override // ozg.a
    public final ozg.b b() {
        return (ozg.b) this.f.get();
    }

    @Override // ozg.a
    public final m1h.a c() {
        return new y4b.a();
    }

    @Override // ozg.a
    public final k d() {
        ybl.k kVarD = this.f319362a.d();
        s.j(kVarD);
        h9h.a aVar = this.f319363b;
        return new y4b.c(kVarD, new i(aVar.f150260c.b(), aVar.J()));
    }

    @Override // ozg.a
    public final ozg.c e() {
        return (ozg.c) this.f319365g.get();
    }

    @Override // ozg.a
    public final n f() {
        return (n) this.d.get();
    }

    @Override // ozg.a
    public final boolean g() {
        return ((Boolean) this.f319366h.get()).booleanValue();
    }
}
