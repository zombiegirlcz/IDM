package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.UploadScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class a7 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UploadScreenContract$InputData f118280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.c f118282c;
    public final e4m.e d;
    public final e4m.e e;
    public final t5 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t5 f118284h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118285j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t5 f118288n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118289p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118292s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118293t;

    public a7(c1 c1Var, l2 l2Var, ViewController viewController, UploadScreenContract$InputData uploadScreenContract$InputData) {
        this.f118281b = c1Var;
        this.f118280a = uploadScreenContract$InputData;
        e4m.c cVarA = e4m.c.a(viewController);
        this.f118282c = cVarA;
        this.d = e4m.b.b(cVarA);
        this.e = e4m.b.b(new t5(c1Var, l2Var, this, 2, 11));
        this.f = new t5(c1Var, l2Var, this, 3, 11);
        this.f118283g = e4m.b.b(new t5(c1Var, l2Var, this, 4, 11));
        this.f118284h = new t5(c1Var, l2Var, this, 5, 11);
        this.i = e4m.b.b(new t5(c1Var, l2Var, this, 6, 11));
        this.f118285j = e4m.b.b(this.f118282c);
        this.k = e4m.b.b(new t5(c1Var, l2Var, this, 7, 11));
        this.f118286l = e4m.b.b(new t5(c1Var, l2Var, this, 1, 11));
        this.f118287m = e4m.b.b(new t5(c1Var, l2Var, this, 0, 11));
        t5 t5Var = new t5(c1Var, l2Var, this, 9, 11);
        this.f118288n = t5Var;
        this.o = e4m.b.b(t5Var);
        this.f118289p = e4m.b.b(new t5(c1Var, l2Var, this, 8, 11));
        this.f118290q = e4m.b.b(new t5(c1Var, l2Var, this, 10, 11));
        this.f118291r = e4m.b.b(this.f118288n);
        this.f118292s = e4m.b.b(new t5(c1Var, l2Var, this, 12, 11));
        this.f118293t = e4m.b.b(new t5(c1Var, l2Var, this, 11, 11));
    }

    public final u96.b b() {
        l70.e eVar = this.f118281b.f118443h;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        vc.s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e c() {
        l70.e eVar = this.f118281b.f118443h;
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        t80.c cVar = (t80.c) this.f118283g.get();
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118290q.get(), (yji.n) this.f118291r.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118287m.get(), (yji.d) this.f118289p.get());
    }
}
