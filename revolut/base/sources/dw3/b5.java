package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.PhotosUploadFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class b5 implements xki.c, iq3.d {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PhotosUploadFlowContract$InputData f118361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118362c;
    public final b5 d = this;
    public final e4m.c e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118364h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118365j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118366l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118367m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118368n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118369p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118370q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118371r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118372s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g3 f118373t;
    public final e4m.e u;
    public final g3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f118374w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f118375x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f118376y;
    public final e4m.e z;

    public b5(c1 c1Var, iq3.a aVar, ViewController viewController, PhotosUploadFlowContract$InputData photosUploadFlowContract$InputData) {
        this.f118362c = c1Var;
        this.f118360a = aVar;
        this.f118361b = photosUploadFlowContract$InputData;
        e4m.c cVarA = e4m.c.a(viewController);
        this.e = cVarA;
        this.f = e4m.b.b(cVarA);
        int i = 27;
        this.f118363g = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f118364h = e4m.b.b(new g3(c1Var, this, 1, i));
        this.i = e4m.b.b(new g3(c1Var, this, 0, i));
        this.f118365j = e4m.b.b(e4m.c.a(photosUploadFlowContract$InputData));
        int i2 = 27;
        this.k = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.f118366l = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f118367m = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f118368n = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.f118369p = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f118370q = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f118371r = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f118372s = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f118373t = new g3(c1Var, this, 14, i2);
        this.u = e4m.b.b(new g3(c1Var, this, 15, i2));
        this.v = new g3(c1Var, this, 16, i2);
        this.f118374w = e4m.b.b(new g3(c1Var, this, 17, i2));
        this.f118375x = e4m.b.b(this.e);
        this.f118376y = e4m.b.b(new g3(c1Var, this, 18, i2));
        this.z = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.A = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.B = e4m.b.b(new g3(c1Var, this, 19, i2));
        this.C = e4m.b.b(new g3(c1Var, this, 20, i2));
        this.D = e4m.b.b(new g3(c1Var, this, 21, i2));
        this.E = e4m.b.b(new g3(c1Var, this, 22, i2));
    }

    public final t80.b b() {
        l70.e eVar = this.f118362c.f118443h;
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        l80.e eVarH = eVar.h();
        vc.s.j(eVarH);
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        return new t80.b(aVarX, eVarH, bVarL);
    }

    public final u96.b c() {
        l70.e eVar = this.f118362c.f118443h;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        vc.s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.B.get(), (yji.n) this.C.get(), (yji.n) this.D.get(), (yji.n) this.f118370q.get(), (yji.n) this.f118366l.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.i.get(), (yji.d) this.f118372s.get(), (yji.d) this.A.get());
    }

    public final nli.e j() {
        l70.e eVar = this.f118362c.f118443h;
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        t80.c cVar = (t80.c) this.u.get();
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f118362c, this.d, 2);
    }
}
