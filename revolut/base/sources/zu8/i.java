package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.choosedocument.review.DocumentReviewScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentReviewScreenContract$InputData f325285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f325286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.c f325287c;
    public final e4m.e d;
    public final e4m.e e;
    public final zpc.m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f325288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zpc.m f325289h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f325290j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f325291l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f325292m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f325293n;
    public final e4m.e o;

    public i(c0 c0Var, g0 g0Var, ViewController viewController, DocumentReviewScreenContract$InputData documentReviewScreenContract$InputData) {
        this.f325286b = c0Var;
        this.f325285a = documentReviewScreenContract$InputData;
        e4m.c cVarA = e4m.c.a(viewController);
        this.f325287c = cVarA;
        this.d = e4m.b.b(cVarA);
        this.e = e4m.b.b(new zpc.m(c0Var, this, 2, 10));
        this.f = new zpc.m(c0Var, this, 3, 10);
        this.f325288g = e4m.b.b(new zpc.m(c0Var, this, 4, 10));
        this.f325289h = new zpc.m(c0Var, this, 5, 10);
        this.i = e4m.b.b(new zpc.m(c0Var, this, 6, 10));
        this.f325290j = e4m.b.b(this.f325287c);
        this.k = e4m.b.b(new zpc.m(c0Var, this, 7, 10));
        this.f325291l = e4m.b.b(new zpc.m(c0Var, this, 1, 10));
        this.f325292m = e4m.b.b(new zpc.m(c0Var, this, 0, 10));
        this.f325293n = e4m.b.b(new zpc.m(c0Var, this, 8, 10));
        this.o = e4m.b.b(new zpc.m(c0Var, this, 9, 10));
    }

    public final u96.b b() {
        l70.e eVar = this.f325286b.f325244m;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        vc.s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e c() {
        l70.e eVar = this.f325286b.f325244m;
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        t80.c cVar = (t80.c) this.f325288g.get();
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f325293n.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f325292m.get());
    }
}
