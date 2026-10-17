package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrFlowInputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements xki.c, r32.a, y32.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QrFlowInputData f231643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f231644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f231645c = this;
    public final e4m.c d;
    public final e4m.e e;
    public final ove.w f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f231646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ove.w f231647h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f231648j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f231649l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f231650m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f231651n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f231652p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f231653q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f231654r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f231655s;

    public f(d dVar, ViewController viewController, QrFlowInputData qrFlowInputData) {
        this.f231644b = dVar;
        this.f231643a = qrFlowInputData;
        e4m.c cVarA = e4m.c.a(viewController);
        this.d = cVarA;
        this.e = e4m.b.b(cVarA);
        int i = 18;
        this.f = new ove.w(dVar, this, 2, i);
        this.f231646g = e4m.b.b(new ove.w(dVar, this, 3, i));
        this.f231647h = new ove.w(dVar, this, 4, i);
        this.i = e4m.b.b(new ove.w(dVar, this, 5, i));
        this.f231648j = e4m.b.b(this.d);
        this.k = e4m.b.b(new ove.w(dVar, this, 6, i));
        this.f231649l = e4m.b.b(new ove.w(dVar, this, 1, i));
        this.f231650m = e4m.b.b(new ove.w(dVar, this, 0, i));
        this.f231651n = e4m.b.b(new ove.w(dVar, this, 7, i));
        this.o = e4m.b.b(new ove.w(dVar, this, 9, i));
        this.f231652p = e4m.b.b(new ove.w(dVar, this, 8, i));
        this.f231653q = e4m.b.b(new ove.w(dVar, this, 10, i));
        this.f231654r = e4m.b.b(new ove.w(dVar, this, 11, i));
        this.f231655s = e4m.b.b(new ove.w(dVar, this, 12, i));
    }

    @Override // y32.a
    public final j b() {
        return new j(this.f231644b, this.f231645c, 1);
    }

    @Override // r32.a
    public final h c() {
        return new h(this.f231644b, this.f231645c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f231651n.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f231650m.get());
    }

    public final t80.b j() {
        l70.e eVar = this.f231644b.f231629a;
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        l80.e eVarH = eVar.h();
        vc.s.j(eVarH);
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        return new t80.b(aVarX, eVarH, bVarL);
    }

    public final u96.b q() {
        l70.e eVar = this.f231644b.f231629a;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        vc.s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e s() {
        l70.e eVar = this.f231644b.f231629a;
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        t80.c cVar = (t80.c) this.f231646g.get();
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }
}
