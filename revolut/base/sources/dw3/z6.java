package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.UploadDocumentsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class z6 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UploadDocumentsScreenContract$InputData f120302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f120303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.c f120304c;
    public final e4m.e d;
    public final e4m.e e;
    public final t5 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t5 f120306h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f120307j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f120308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f120309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f120310n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f120311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t5 f120312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f120313r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f120314s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f120315t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f120316w;

    public z6(c1 c1Var, b4 b4Var, ViewController viewController, UploadDocumentsScreenContract$InputData uploadDocumentsScreenContract$InputData) {
        this.f120303b = c1Var;
        this.f120302a = uploadDocumentsScreenContract$InputData;
        e4m.c cVarA = e4m.c.a(viewController);
        this.f120304c = cVarA;
        this.d = e4m.b.b(cVarA);
        this.e = e4m.b.b(new t5(c1Var, b4Var, this, 2, 10));
        this.f = new t5(c1Var, b4Var, this, 3, 10);
        this.f120305g = e4m.b.b(new t5(c1Var, b4Var, this, 4, 10));
        this.f120306h = new t5(c1Var, b4Var, this, 5, 10);
        this.i = e4m.b.b(new t5(c1Var, b4Var, this, 6, 10));
        this.f120307j = e4m.b.b(this.f120304c);
        this.k = e4m.b.b(new t5(c1Var, b4Var, this, 7, 10));
        this.f120308l = e4m.b.b(new t5(c1Var, b4Var, this, 1, 10));
        this.f120309m = e4m.b.b(new t5(c1Var, b4Var, this, 0, 10));
        this.f120310n = e4m.b.b(new t5(c1Var, b4Var, this, 10, 10));
        this.o = e4m.b.b(new t5(c1Var, b4Var, this, 9, 10));
        this.f120311p = e4m.b.b(new t5(c1Var, b4Var, this, 8, 10));
        t5 t5Var = new t5(c1Var, b4Var, this, 12, 10);
        this.f120312q = t5Var;
        this.f120313r = e4m.b.b(t5Var);
        this.f120314s = e4m.b.b(new t5(c1Var, b4Var, this, 11, 10));
        this.f120315t = e4m.b.b(new t5(c1Var, b4Var, this, 13, 10));
        this.u = e4m.b.b(this.f120312q);
        this.v = e4m.b.b(new t5(c1Var, b4Var, this, 15, 10));
        this.f120316w = e4m.b.b(new t5(c1Var, b4Var, this, 14, 10));
    }

    public final u96.b b() {
        l70.e eVar = this.f120303b.f118443h;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        vc.s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e c() {
        l70.e eVar = this.f120303b.f118443h;
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        t80.c cVar = (t80.c) this.f120305g.get();
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f120315t.get(), (yji.n) this.u.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f120309m.get(), (yji.d) this.f120311p.get(), (yji.d) this.f120314s.get());
    }
}
