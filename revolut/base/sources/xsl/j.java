package xsl;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreenContract$InputData;
import i4h.p0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import xf6.t1;
import z0h.s1;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3h.b f308654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvestmentProjectionsScreenContract$InputData f308655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e3h.i f308656c;
    public final jsl.d d;
    public final a3h.h e;
    public final a3h.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f3h.a f308657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f308658h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f308659j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f308660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f308661m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f308662n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f308663p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f308664q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f308665r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f308666s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f308667t;
    public final e4m.e u;

    public j(p pVar, f3h.b bVar, f3h.a aVar, ViewController viewController, jsl.d dVar, InvestmentProjectionsScreenContract$InputData investmentProjectionsScreenContract$InputData, a3h.h hVar, a3h.e eVar, e3h.i iVar) {
        this.f308658h = pVar;
        this.f308654a = bVar;
        this.f308655b = investmentProjectionsScreenContract$InputData;
        this.f308656c = iVar;
        this.d = dVar;
        this.e = hVar;
        this.f = eVar;
        this.f308657g = aVar;
        int i = 26;
        this.i = e4m.b.b(new t1(pVar, this, 1, i));
        this.f308659j = e4m.b.b(new t1(pVar, this, 0, i));
        this.k = e4m.b.b(e4m.c.a(viewController));
        int i2 = 26;
        this.f308660l = e4m.b.b(new t1(pVar, this, 2, i2));
        this.f308661m = e4m.b.b(new t1(pVar, this, 3, i2));
        this.f308662n = e4m.b.b(new t1(pVar, this, 5, i2));
        this.o = e4m.b.b(new t1(pVar, this, 4, i2));
        this.f308663p = e4m.b.b(new t1(pVar, this, 7, i2));
        this.f308664q = e4m.b.b(new t1(pVar, this, 6, i2));
        this.f308665r = e4m.b.b(new t1(pVar, this, 10, i2));
        this.f308666s = e4m.b.b(new t1(pVar, this, 9, i2));
        this.f308667t = e4m.b.b(new t1(pVar, this, 11, i2));
        this.u = e4m.b.b(new t1(pVar, this, 8, i2));
    }

    @Override // xki.e
    public final Set f() {
        e3h.a extensions = (e3h.a) this.f308659j.get();
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        p0 controllerModelExtension = extensions.f122271b;
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        aah.h hVar = (aah.h) this.f308661m.get();
        a0k.b.n(hVar);
        return ImmutableSet.of((yji.n) controllerModelExtension, (yji.n) hVar, (yji.n) this.f308662n.get(), (yji.n) this.f308663p.get());
    }

    @Override // xki.e
    public final Set g() {
        yji.d dVarA = f0k.d.A(this.f308654a, (e3h.a) this.f308659j.get());
        aah.i iVarD = ((u8h.b) this.f308658h.f308703r).d();
        vc.s.j(iVarD);
        return ImmutableSet.of(dVarA, (yji.d) a0k.b.l(iVarD, (s1) this.f308660l.get(), (aah.h) this.f308661m.get()), (yji.d) this.o.get(), (yji.d) this.f308664q.get());
    }
}
