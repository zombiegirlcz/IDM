package cwi;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.AirportDetailsScreenContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.filters.AirportLoungesPassActivityFiltersScreenContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.AirportLoungesPassListContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.modals.disclaimer_acceptance.AirportLoungesDisclaimerAcceptanceContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_passengers.AirportLoungePassPassengersContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.how_to_access.SchemeLoungesHowToAccessScreenContract$InputData;
import java.util.Collection;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import qgk.i3;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f109655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109656c;
    public final Object d;

    public /* synthetic */ d0(Object obj2, Object obj3, int i, int i2) {
        this.f109654a = i2;
        this.f109655b = obj2;
        this.d = obj3;
        this.f109656c = i;
    }

    private final Object a() {
        c1 c1Var = (c1) this.d;
        h0 h0Var = c1Var.f109650c;
        h0 h0Var2 = (h0) this.f109655b;
        poi.b bVar = h0Var2.f109697c;
        i3 i3Var = h0Var2.i;
        l70.e eVar = h0Var2.f;
        x xVar = h0Var2.f109695a;
        int i = this.f109656c;
        if (i == 0) {
            com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) c1Var.d.get();
            xvi.g gVar = new xvi.g(h0Var.f109696b);
            uo.q0 q0VarJ = bVar.j();
            uo.b bVarB = bVar.b();
            vc.s.j(bVarB);
            ho.t tVarC = h0Var.f109697c.c();
            vc.s.j(tVarC);
            return yf6.b.g(aVar, gVar, q0VarJ, bVarB, new xvi.b(tVarC));
        }
        if (i == 1) {
            com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) c1Var.d.get();
            gte.a aVarB = h0Var2.f109699h.b();
            vc.s.j(aVarB);
            return lu7.m0.y(aVar2, aVarB);
        }
        if (i == 2) {
            AirportLoungesPassListContract$InputData airportLoungesPassListContract$InputData = c1Var.f109649b;
            cli.n nVar = (cli.n) c1Var.i.get();
            dwi.a aVar3 = (dwi.a) h0Var.f109695a.v.get();
            vc.s.j(aVar3);
            gyi.u uVar = new gyi.u(aVar3);
            ffk.t tVarF = h0Var2.f109700j.f();
            vc.s.j(tVarF);
            qvi.d dVarD = xVar.d();
            vc.s.j(dVarD);
            dwi.a0 a0VarB = xVar.b();
            vc.s.j(a0VarB);
            hwi.x0 x0Var = (hwi.x0) xVar.T.get();
            vc.s.j(x0Var);
            return new gyi.d0(airportLoungesPassListContract$InputData, nVar, uVar, tVarF, dVarD, a0VarB, x0Var, ((s41.a) h0Var2.d).d());
        }
        if (i == 3) {
            gyi.n nVar2 = (gyi.n) c1Var.f109652h.get();
            gyi.f0 f0Var = new gyi.f0(new nd7.d(new nd7.c()));
            l80.e eVarH = h0Var.f.h();
            vc.s.j(eVarH);
            gyi.g0 g0Var = new gyi.g0(eVarH);
            egk.e eVarE = i3Var.e();
            vc.s.j(eVarE);
            return new ac4.g(nVar2, f0Var, g0Var, eVarE);
        }
        if (i != 4) {
            if (i == 5) {
                return hy1.g.v((com.revolut.kompot.navigable.a) c1Var.d.get());
            }
            throw new AssertionError(i);
        }
        fkg.a aVarD = eVar.d();
        c90.c cVar = (c90.c) c1Var.f109651g.get();
        egk.e eVarE2 = i3Var.e();
        vc.s.j(eVarE2);
        l80.e eVarH2 = eVar.h();
        vc.s.j(eVarH2);
        return new gyi.n(aVarD, cVar, eVarE2, eVarH2);
    }

    private final Object b() {
        c1 c1Var = (c1) this.d;
        h0 h0Var = c1Var.f109650c;
        h0 h0Var2 = (h0) this.f109655b;
        int i = this.f109656c;
        if (i == 0) {
            com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) c1Var.d.get();
            xvi.g gVar = new xvi.g(h0Var.f109696b);
            uo.q0 q0VarJ = h0Var2.f109697c.j();
            uo.b bVarB = h0Var2.f109697c.b();
            vc.s.j(bVarB);
            ho.t tVarC = h0Var.f109697c.c();
            vc.s.j(tVarC);
            return yf6.b.g(aVar, gVar, q0VarJ, bVarB, new xvi.b(tVarC));
        }
        if (i == 1) {
            com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) c1Var.d.get();
            gte.a aVarB = h0Var2.f109699h.b();
            vc.s.j(aVarB);
            return lu7.m0.y(aVar2, aVarB);
        }
        if (i == 2) {
            AirportLoungesPassListContract$InputData airportLoungesPassListContract$InputData = c1Var.f109649b;
            cli.n nVar = (cli.n) c1Var.i.get();
            dwi.a aVar3 = (dwi.a) h0Var.f109695a.v.get();
            vc.s.j(aVar3);
            gyi.u uVar = new gyi.u(aVar3);
            efk.a aVar4 = h0Var2.f109700j;
            x xVar = h0Var2.f109695a;
            ffk.t tVarF = aVar4.f();
            vc.s.j(tVarF);
            qvi.d dVarD = xVar.d();
            vc.s.j(dVarD);
            dwi.a0 a0VarB = xVar.b();
            vc.s.j(a0VarB);
            hwi.x0 x0Var = (hwi.x0) xVar.T.get();
            vc.s.j(x0Var);
            return new gyi.d0(airportLoungesPassListContract$InputData, nVar, uVar, tVarF, dVarD, a0VarB, x0Var, ((s41.a) h0Var2.d).d());
        }
        if (i == 3) {
            gyi.n nVar2 = (gyi.n) c1Var.f109652h.get();
            gyi.f0 f0Var = new gyi.f0(new nd7.d(new nd7.c()));
            l80.e eVarH = h0Var.f.h();
            vc.s.j(eVarH);
            gyi.g0 g0Var = new gyi.g0(eVarH);
            egk.e eVarE = h0Var2.i.e();
            vc.s.j(eVarE);
            return new ac4.g(nVar2, f0Var, g0Var, eVarE);
        }
        if (i != 4) {
            if (i == 5) {
                return hy1.g.v((com.revolut.kompot.navigable.a) c1Var.d.get());
            }
            throw new AssertionError(i);
        }
        fkg.a aVarD = h0Var2.f.d();
        c90.c cVar = (c90.c) c1Var.f109651g.get();
        egk.e eVarE2 = h0Var2.i.e();
        vc.s.j(eVarE2);
        l80.e eVarH2 = h0Var2.f.h();
        vc.s.j(eVarH2);
        return new gyi.n(aVarD, cVar, eVarE2, eVarH2);
    }

    private final Object c() {
        h1 h1Var = (h1) this.d;
        h0 h0Var = h1Var.f109713b;
        h0 h0Var2 = (h0) this.f109655b;
        poi.b bVar = h0Var2.f109697c;
        int i = this.f109656c;
        if (i == 0) {
            com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) h1Var.f109714c.get();
            xvi.g gVar = new xvi.g(h0Var.f109696b);
            uo.q0 q0VarJ = bVar.j();
            uo.b bVarB = bVar.b();
            vc.s.j(bVarB);
            ho.t tVarC = h0Var.f109697c.c();
            vc.s.j(tVarC);
            return yf6.b.g(aVar, gVar, q0VarJ, bVarB, new xvi.b(tVarC));
        }
        if (i == 1) {
            cli.n nVar = (cli.n) h1Var.e.get();
            dwi.s sVarA = h0Var2.f109695a.a();
            vc.s.j(sVarA);
            return new com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a(nVar, sVarA, new qwi.c());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        gte.a aVarB = h0Var2.f109699h.b();
        vc.s.j(aVarB);
        return new ryi.k(aVarB);
    }

    private final Object d() {
        h1 h1Var = (h1) this.d;
        h0 h0Var = h1Var.f109713b;
        h0 h0Var2 = (h0) this.f109655b;
        poi.b bVar = h0Var2.f109697c;
        int i = this.f109656c;
        if (i == 0) {
            com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) h1Var.f109714c.get();
            xvi.g gVar = new xvi.g(h0Var.f109696b);
            uo.q0 q0VarJ = bVar.j();
            uo.b bVarB = bVar.b();
            vc.s.j(bVarB);
            ho.t tVarC = h0Var.f109697c.c();
            vc.s.j(tVarC);
            return yf6.b.g(aVar, gVar, q0VarJ, bVarB, new xvi.b(tVarC));
        }
        if (i == 1) {
            cli.n nVar = (cli.n) h1Var.e.get();
            dwi.s sVarA = h0Var2.f109695a.a();
            vc.s.j(sVarA);
            return new com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a(nVar, sVarA, new qwi.c());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        gte.a aVarB = h0Var2.f109699h.b();
        vc.s.j(aVarB);
        return new ryi.k(aVarB);
    }

    private final Object e() {
        h1 h1Var = (h1) this.d;
        h0 h0Var = h1Var.f109713b;
        h0 h0Var2 = (h0) this.f109655b;
        poi.b bVar = h0Var2.f109697c;
        int i = this.f109656c;
        if (i == 0) {
            com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) h1Var.f109714c.get();
            xvi.g gVar = new xvi.g(h0Var.f109696b);
            uo.q0 q0VarJ = bVar.j();
            uo.b bVarB = bVar.b();
            vc.s.j(bVarB);
            ho.t tVarC = h0Var.f109697c.c();
            vc.s.j(tVarC);
            return yf6.b.g(aVar, gVar, q0VarJ, bVarB, new xvi.b(tVarC));
        }
        if (i == 1) {
            cli.n nVar = (cli.n) h1Var.e.get();
            dwi.s sVarA = h0Var2.f109695a.a();
            vc.s.j(sVarA);
            return new com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a(nVar, sVarA, new qwi.c());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        gte.a aVarB = h0Var2.f109699h.b();
        vc.s.j(aVarB);
        return new ryi.k(aVarB);
    }

    private final Object f() {
        h0 h0Var = (h0) this.f109655b;
        poi.b bVar = h0Var.f109697c;
        j1 j1Var = (j1) this.d;
        h0 h0Var2 = j1Var.f109731b;
        int i = this.f109656c;
        if (i == 0) {
            com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) j1Var.f109732c.get();
            xvi.g gVar = new xvi.g(h0Var2.f109696b);
            uo.q0 q0VarJ = bVar.j();
            uo.b bVarB = bVar.b();
            vc.s.j(bVarB);
            ho.t tVarC = h0Var2.f109697c.c();
            vc.s.j(tVarC);
            return yf6.b.g(aVar, gVar, q0VarJ, bVarB, new xvi.b(tVarC));
        }
        if (i == 1) {
            xyi.b impl = (xyi.b) j1Var.e.get();
            zyi.d.Companion.getClass();
            Intrinsics.checkNotNullParameter(impl, "impl");
            vc.s.k(impl);
            return impl;
        }
        if (i == 2) {
            return new xyi.b(((s41.a) h0Var.d).d());
        }
        if (i != 3) {
            if (i == 4) {
                return new yyi.m(h0Var.e.g());
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) j1Var.f109733g.get();
        xyi.b bVar2 = (xyi.b) j1Var.e.get();
        dwi.t0 t0Var = (dwi.t0) h0Var.f109695a.c0.get();
        vc.s.j(t0Var);
        return new com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.a(nVar, bVar2, t0Var);
    }

    private final Object g() {
        h0 h0Var = (h0) this.f109655b;
        j1 j1Var = (j1) this.d;
        h0 h0Var2 = j1Var.f109731b;
        int i = this.f109656c;
        if (i == 0) {
            com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) j1Var.f109732c.get();
            xvi.g gVar = new xvi.g(h0Var2.f109696b);
            uo.q0 q0VarJ = h0Var.f109697c.j();
            uo.b bVarB = h0Var.f109697c.b();
            vc.s.j(bVarB);
            ho.t tVarC = h0Var2.f109697c.c();
            vc.s.j(tVarC);
            return yf6.b.g(aVar, gVar, q0VarJ, bVarB, new xvi.b(tVarC));
        }
        if (i == 1) {
            xyi.b impl = (xyi.b) j1Var.e.get();
            zyi.d.Companion.getClass();
            Intrinsics.checkNotNullParameter(impl, "impl");
            vc.s.k(impl);
            return impl;
        }
        if (i == 2) {
            return new xyi.b(((s41.a) h0Var.d).d());
        }
        if (i != 3) {
            if (i == 4) {
                return new yyi.m(h0Var.e.g());
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) j1Var.f109733g.get();
        xyi.b bVar = (xyi.b) j1Var.e.get();
        dwi.t0 t0Var = (dwi.t0) h0Var.f109695a.c0.get();
        vc.s.j(t0Var);
        return new com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.a(nVar, bVar, t0Var);
    }

    private final Object h() {
        d03.b bVar = (d03.b) this.f109655b;
        d03.a aVar = (d03.a) this.d;
        int i = this.f109656c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(aVar.f110285a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar.f110285a);
                t70.g gVarO = bVar.f110303b.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) aVar.f.get(), gsi.c.a(aVar.f110285a));
            case 3:
                return new rpi.b(bq.i.b(aVar.f110285a));
            case 4:
                return new rpi.h(bq.i.b(aVar.f110285a));
            case 5:
                return new iri.g((iri.j) bVar.f.get(), (iri.m) bVar.f110305g.get(), bq.i.f(aVar.f110285a), bq.i.l(aVar.f110285a));
            case 6:
                return new iri.l((iri.m) bVar.f110305g.get(), bq.i.f(aVar.f110285a), (iri.d) aVar.f110290j.get());
            case 7:
                return new iri.d(bq.i.f(aVar.f110285a));
            case 8:
                return new opi.b(bq.i.f(aVar.f110285a));
            case 9:
                aVar.getClass();
                return new xpi.c(xpi.f.f307976c, bq.i.b(aVar.f110285a));
            case 10:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize.addAll((Iterable) pm.b.a());
                builderBuilderWithExpectedSize.add(new fn.d((ln.a) aVar.f110287c.i.get()));
                return new in.e(builderBuilderWithExpectedSize.build(), (om.c) bVar.f110306h.get(), bVar.a());
            case 11:
                aVar.getClass();
                xoi.d dVar = aVar.f110285a;
                return new ypi.e(ypi.h.d, bq.i.b(dVar), bq.i.o(dVar), bq.i.g(dVar));
            case 12:
                return new en.c(ImmutableSet.of((ln.d) aVar.f110287c.i.get()), bq.i.l(aVar.f110285a));
            case 13:
                aVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar.k.get(), bVar.a());
            case 14:
                um.c cVar = (um.c) bVar.f110307j.get();
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(5);
                d03.b bVar2 = aVar.f110287c;
                hn.h hVar = (hn.h) bVar2.f110308l.get();
                t70.g gVarO2 = bVar2.f110303b.o();
                vc.s.j(gVarO2);
                builderBuilderWithExpectedSize2.add(new jn.a(hVar, gVarO2));
                builderBuilderWithExpectedSize2.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize2.add(bVar2.b());
                builderBuilderWithExpectedSize2.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize2.add(new jn.d(e4m.b.a(aVar.f110296r)));
                return new in.e(cVar, builderBuilderWithExpectedSize2.build(), bVar.a());
            case 15:
                return bq.i.t(aVar.f110285a);
            case 16:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize3.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize3.add(aVar.f110298t.get());
                builderBuilderWithExpectedSize3.add(new kn.h(e4m.b.a(aVar.f110288g)));
                return new kn.e(builderBuilderWithExpectedSize3.build(), (ym.d) bVar.f110309m.get(), bVar.a());
            case 17:
                return new zm.a();
            case 18:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize4.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize4.add(aVar.f110287c.b());
                return new hn.d(builderBuilderWithExpectedSize4.build(), (hn.h) bVar.f110308l.get(), (npi.f) aVar.e.get());
            case 19:
                return new gn.c((lpi.e) aVar.f110299w.get(), (sm.e) bVar.o.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar.a());
            case 20:
                return new lpi.b(bq.i.i(aVar.f110285a), bq.i.j(aVar.f110285a));
            case 21:
                return new c03.l((xpi.g) aVar.f110292m.get(), (ypi.i) aVar.o.get(), (opi.d) aVar.f110291l.get(), (c03.m) bVar.f110311p.get(), (c03.q) aVar.f110301y.get(), new c03.o(), aVar.f110286b, (c03.w) bVar.f110312q.get());
            case 22:
                return new c03.r();
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f109654a) {
            case 0:
                h0 h0Var = (h0) this.f109655b;
                poi.b bVar = h0Var.f109697c;
                e0 e0Var = (e0) this.d;
                h0 h0Var2 = e0Var.f109662b;
                int i = this.f109656c;
                if (i != 0) {
                    if (i != 1) {
                        throw new AssertionError(i);
                    }
                    dwi.d dVar = (dwi.d) h0Var.f109695a.f109812y.get();
                    vc.s.j(dVar);
                    AirportLoungePassPassengersContract$InputData airportLoungePassPassengersContract$InputData = e0Var.f109661a;
                    return new lyi.m(dVar, airportLoungePassPassengersContract$InputData, new lyi.f(), new kxk.o(airportLoungePassPassengersContract$InputData, new nyi.a(), new nyi.b(), new nyi.c()));
                }
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) e0Var.f109663c.get();
                xvi.g gVar = new xvi.g(h0Var2.f109696b);
                uo.q0 q0VarJ = bVar.j();
                uo.b bVarB = bVar.b();
                vc.s.j(bVarB);
                ho.t tVarC = h0Var2.f109697c.c();
                vc.s.j(tVarC);
                return yf6.b.g(aVar, gVar, q0VarJ, bVarB, new xvi.b(tVarC));
            case 1:
                h0 h0Var3 = (h0) this.f109655b;
                poi.b bVar2 = h0Var3.f109697c;
                g0 g0Var = (g0) this.d;
                h0 h0Var4 = g0Var.f109690b;
                int i2 = this.f109656c;
                if (i2 == 0) {
                    com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) g0Var.f109691c.get();
                    xvi.g gVar2 = new xvi.g(h0Var4.f109696b);
                    uo.q0 q0VarJ2 = bVar2.j();
                    uo.b bVarB2 = bVar2.b();
                    vc.s.j(bVarB2);
                    ho.t tVarC2 = h0Var4.f109697c.c();
                    vc.s.j(tVarC2);
                    return yf6.b.g(aVar2, gVar2, q0VarJ2, bVarB2, new xvi.b(tVarC2));
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return new iyi.o(new nd7.d(new nd7.c()), new c7b.a(h0Var4.e.g(), 1));
                    }
                    throw new AssertionError(i2);
                }
                AirportLoungesDisclaimerAcceptanceContract$InputData airportLoungesDisclaimerAcceptanceContract$InputData = g0Var.f109689a;
                cli.n nVar = (cli.n) g0Var.e.get();
                wli.x xVarD = ((s41.a) h0Var3.d).d();
                dwi.a0 a0VarB = h0Var3.f109695a.b();
                vc.s.j(a0VarB);
                return new iyi.m(airportLoungesDisclaimerAcceptanceContract$InputData, nVar, xVarD, a0VarB);
            case 2:
                i0 i0Var = (i0) this.d;
                h0 h0Var5 = (h0) this.f109655b;
                int i3 = this.f109656c;
                switch (i3) {
                    case 0:
                        fd6.a aVar3 = (fd6.a) i0Var.e.get();
                        va.g.t(aVar3);
                        return aVar3;
                    case 1:
                        return va.g.s(((zc6.a) h0Var5.k).d(), (xc6.a) i0Var.d.get());
                    case 2:
                        return r6.b.k((zc6.a) h0Var5.k, "factory");
                    case 3:
                        return h7d.d.a(i0Var.f109715a, (i7d.o) i0Var.f109718g.get(), h0Var5.f109701l.d());
                    case 4:
                        return h7d.f.a(h0Var5.f109701l.d(), Optional.empty());
                    case 5:
                        e4m.e eVar = i0Var.i;
                        h0 h0Var6 = i0Var.f109717c;
                        com.revolut.kompot.navigable.a aVar4 = (com.revolut.kompot.navigable.a) eVar.get();
                        xvi.g gVar3 = new xvi.g(h0Var6.f109696b);
                        uo.q0 q0VarJ3 = h0Var5.f109697c.j();
                        uo.b bVarB3 = h0Var5.f109697c.b();
                        vc.s.j(bVarB3);
                        ho.t tVarC3 = h0Var6.f109697c.c();
                        vc.s.j(tVarC3);
                        return yf6.b.g(aVar4, gVar3, q0VarJ3, bVarB3, new xvi.b(tVarC3));
                    case 6:
                        return va.g.u((xc6.a) i0Var.d.get());
                    case 7:
                        mkd.g view = i0Var.f109716b;
                        rkd.m factory = h0Var5.f109702m.a();
                        vc.s.j(factory);
                        kxi.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.a(view);
                    case 8:
                        cli.n nVar2 = (cli.n) i0Var.f109722m.get();
                        xmg.a aVar5 = h0Var5.f109703n;
                        x xVar = h0Var5.f109695a;
                        ang.f fVarE = aVar5.e();
                        nyb.k kVarC = h0Var5.o.c();
                        vc.s.j(kVarC);
                        dwi.s sVarA = xVar.a();
                        vc.s.j(sVarA);
                        dwi.b0 b0VarC = xVar.c();
                        vc.s.j(b0VarC);
                        hwi.x0 x0Var = (hwi.x0) xVar.T.get();
                        vc.s.j(x0Var);
                        ffk.t tVarF = h0Var5.f109700j.f();
                        vc.s.j(tVarF);
                        s70.a aVarM = h0Var5.f.m();
                        vc.s.j(aVarM);
                        mkd.d dVar2 = (mkd.d) i0Var.f109721l.get();
                        qvi.d dVarD = xVar.d();
                        vc.s.j(dVarD);
                        i4b.f fVarB = ((zc6.a) h0Var5.k).b();
                        h0 h0Var7 = i0Var.f109717c;
                        zja.a aVarA = ((ika.b) h0Var7.f109704p).a();
                        vc.s.j(aVarA);
                        dwi.e0 e0Var2 = (dwi.e0) h0Var7.f109695a.Q.get();
                        vc.s.j(e0Var2);
                        owi.g gVar4 = new owi.g(aVarA, e0Var2);
                        i7d.o oVar = (i7d.o) i0Var.f109718g.get();
                        wli.x xVarD2 = ((s41.a) h0Var5.d).d();
                        dwi.c0 c0Var = (dwi.c0) xVar.f109797h0.get();
                        vc.s.j(c0Var);
                        gte.a aVarB = h0Var5.f109699h.b();
                        vc.s.j(aVarB);
                        return new com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c(nVar2, fVarE, kVarC, sVarA, b0VarC, x0Var, tVarF, aVarM, dVar2, dVarD, fVarB, gVar4, oVar, xVarD2, c0Var, aVarB);
                    case 9:
                        h0 h0Var8 = i0Var.f109717c;
                        rvi.b bVar3 = (rvi.b) h0Var8.f109695a.Y.get();
                        vc.s.j(bVar3);
                        lxi.d dVar3 = new lxi.d(new hxi.a());
                        gte.a aVarB2 = h0Var8.f109699h.b();
                        vc.s.j(aVarB2);
                        lxi.f fVar = new lxi.f(aVarB2, new hxi.l(new c7b.a(h0Var8.e.g(), 1)));
                        lxi.h hVar = new lxi.h();
                        lxi.a aVar6 = new lxi.a();
                        egk.e eVarE = h0Var8.i.e();
                        vc.s.j(eVarE);
                        return new i3g.k(new lxi.b(bVar3, dVar3, fVar, hVar, aVar6, eVarE, ((zc6.a) h0Var8.k).c(), new hxi.m()));
                    default:
                        throw new AssertionError(i3);
                }
            case 3:
                poi.b bVar4 = ((h0) this.f109655b).f109697c;
                j0 j0Var = (j0) this.d;
                h0 h0Var9 = j0Var.f109728b;
                AirportLoungesPassActivityFiltersScreenContract$InputData airportLoungesPassActivityFiltersScreenContract$InputData = j0Var.f109727a;
                int i5 = this.f109656c;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return new zxi.i((cli.n) j0Var.e.get(), airportLoungesPassActivityFiltersScreenContract$InputData);
                    }
                    if (i5 == 2) {
                        return new zxi.k(airportLoungesPassActivityFiltersScreenContract$InputData);
                    }
                    throw new AssertionError(i5);
                }
                com.revolut.kompot.navigable.a aVar7 = (com.revolut.kompot.navigable.a) j0Var.f109729c.get();
                xvi.g gVar5 = new xvi.g(h0Var9.f109696b);
                uo.q0 q0VarJ4 = bVar4.j();
                uo.b bVarB4 = bVar4.b();
                vc.s.j(bVarB4);
                ho.t tVarC4 = h0Var9.f109697c.c();
                vc.s.j(tVarC4);
                return yf6.b.g(aVar7, gVar5, q0VarJ4, bVarB4, new xvi.b(tVarC4));
            case 4:
                h0 h0Var10 = (h0) this.f109655b;
                poi.b bVar5 = h0Var10.f109697c;
                k0 k0Var = (k0) this.d;
                h0 h0Var11 = k0Var.f109735a;
                int i6 = this.f109656c;
                if (i6 == 0) {
                    com.revolut.kompot.navigable.a aVar8 = (com.revolut.kompot.navigable.a) k0Var.f109736b.get();
                    xvi.g gVar6 = new xvi.g(h0Var11.f109696b);
                    uo.q0 q0VarJ5 = bVar5.j();
                    uo.b bVarB5 = bVar5.b();
                    vc.s.j(bVarB5);
                    ho.t tVarC5 = h0Var11.f109697c.c();
                    vc.s.j(tVarC5);
                    return yf6.b.g(aVar8, gVar6, q0VarJ5, bVarB5, new xvi.b(tVarC5));
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        return new xxi.o(new hxi.l(new c7b.a(h0Var11.e.g(), 1)), new xxi.a());
                    }
                    throw new AssertionError(i6);
                }
                cli.n nVar3 = (cli.n) k0Var.d.get();
                dwi.c0 c0Var2 = (dwi.c0) h0Var10.f109695a.f109797h0.get();
                vc.s.j(c0Var2);
                dwi.c0 c0Var3 = (dwi.c0) h0Var11.f109695a.f109797h0.get();
                vc.s.j(c0Var3);
                return new com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.a(nVar3, c0Var2, new bbd.c(c0Var3));
            case 5:
                h0 h0Var12 = (h0) this.f109655b;
                poi.b bVar6 = h0Var12.f109697c;
                l0 l0Var = (l0) this.d;
                h0 h0Var13 = l0Var.f109741b;
                int i21 = this.f109656c;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new AssertionError(i21);
                    }
                    oyi.c cVar = l0Var.f109740a;
                    dwi.k kVar = (dwi.k) h0Var12.f109695a.A.get();
                    vc.s.j(kVar);
                    return new com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.c(cVar, kVar, new oyi.a(), new at.r(new qyi.a(), new qyi.c(), new qyi.b()));
                }
                com.revolut.kompot.navigable.a aVar9 = (com.revolut.kompot.navigable.a) l0Var.f109742c.get();
                xvi.g gVar7 = new xvi.g(h0Var13.f109696b);
                uo.q0 q0VarJ6 = bVar6.j();
                uo.b bVarB6 = bVar6.b();
                vc.s.j(bVarB6);
                ho.t tVarC6 = h0Var13.f109697c.c();
                vc.s.j(tVarC6);
                return yf6.b.g(aVar9, gVar7, q0VarJ6, bVarB6, new xvi.b(tVarC6));
            case 6:
                h0 h0Var14 = (h0) this.f109655b;
                poi.b bVar7 = h0Var14.f109697c;
                m0 m0Var = (m0) this.d;
                h0 h0Var15 = m0Var.f109745a;
                int i22 = this.f109656c;
                if (i22 != 0) {
                    if (i22 != 1) {
                        if (i22 == 2) {
                            return new vyi.s(new hxi.f(new ixi.b()));
                        }
                        throw new AssertionError(i22);
                    }
                    jki.p pVar = (jki.p) m0Var.d.get();
                    dwi.b0 b0VarC2 = h0Var14.f109695a.c();
                    vc.s.j(b0VarC2);
                    return new vyi.r(pVar, b0VarC2);
                }
                com.revolut.kompot.navigable.a aVar10 = (com.revolut.kompot.navigable.a) m0Var.f109746b.get();
                xvi.g gVar8 = new xvi.g(h0Var15.f109696b);
                uo.q0 q0VarJ7 = bVar7.j();
                uo.b bVarB7 = bVar7.b();
                vc.s.j(bVarB7);
                ho.t tVarC7 = h0Var15.f109697c.c();
                vc.s.j(tVarC7);
                return yf6.b.f(aVar10, gVar8, q0VarJ7, bVarB7, new xvi.b(tVarC7));
            case 7:
                h0 h0Var16 = (h0) this.f109655b;
                poi.b bVar8 = h0Var16.f109697c;
                n0 n0Var = (n0) this.d;
                h0 h0Var17 = n0Var.f109751a;
                int i32 = this.f109656c;
                if (i32 != 0) {
                    if (i32 != 1) {
                        if (i32 == 2) {
                            return new wwi.t(new hxi.a());
                        }
                        throw new AssertionError(i32);
                    }
                    jki.p pVar2 = (jki.p) n0Var.d.get();
                    dwi.b0 b0VarC3 = h0Var16.f109695a.c();
                    vc.s.j(b0VarC3);
                    return new wwi.q(pVar2, b0VarC3);
                }
                com.revolut.kompot.navigable.a aVar11 = (com.revolut.kompot.navigable.a) n0Var.f109752b.get();
                xvi.g gVar9 = new xvi.g(h0Var17.f109696b);
                uo.q0 q0VarJ8 = bVar8.j();
                uo.b bVarB8 = bVar8.b();
                vc.s.j(bVarB8);
                ho.t tVarC8 = h0Var17.f109697c.c();
                vc.s.j(tVarC8);
                return yf6.b.f(aVar11, gVar9, q0VarJ8, bVarB8, new xvi.b(tVarC8));
            case 8:
                h0 h0Var18 = (h0) this.f109655b;
                poi.b bVar9 = h0Var18.f109697c;
                cri.b bVar10 = h0Var18.d;
                s0 s0Var = (s0) this.d;
                h0 h0Var19 = s0Var.f109767b;
                int i33 = this.f109656c;
                if (i33 == 0) {
                    com.revolut.kompot.navigable.a aVar12 = (com.revolut.kompot.navigable.a) s0Var.f109768c.get();
                    xvi.g gVar10 = new xvi.g(h0Var19.f109696b);
                    uo.q0 q0VarJ9 = bVar9.j();
                    uo.b bVarB9 = bVar9.b();
                    vc.s.j(bVarB9);
                    ho.t tVarC9 = h0Var19.f109697c.c();
                    vc.s.j(tVarC9);
                    return yf6.b.g(aVar12, gVar10, q0VarJ9, bVarB9, new xvi.b(tVarC9));
                }
                if (i33 == 1) {
                    xyi.b impl = (xyi.b) s0Var.e.get();
                    bzi.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(impl, "impl");
                    vc.s.k(impl);
                    return impl;
                }
                if (i33 == 2) {
                    return new xyi.b(((s41.a) bVar10).d());
                }
                if (i33 != 3) {
                    if (i33 == 4) {
                        return new azi.l(h0Var18.e.g());
                    }
                    if (i33 != 5) {
                        throw new AssertionError(i33);
                    }
                    com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) s0Var.f109768c.get();
                    bzi.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller, "controller");
                    return rp0.x0.a(rp0.g1.Companion, controller.D2());
                }
                cli.n nVar4 = (cli.n) s0Var.f109769g.get();
                SchemeLoungesHowToAccessScreenContract$InputData schemeLoungesHowToAccessScreenContract$InputData = s0Var.f109766a;
                xyi.b bVar11 = (xyi.b) s0Var.e.get();
                c70.a aVarZ = h0Var19.f.z();
                vc.s.j(aVarZ);
                czi.e eVar2 = new czi.e(aVarZ, (rp0.g1) s0Var.f109770h.get());
                l93.f fVarJ = h0Var18.f109698g.j();
                vc.s.j(fVarJ);
                return new azi.j(nVar4, schemeLoungesHowToAccessScreenContract$InputData, bVar11, eVar2, fVarJ, ((s41.a) bVar10).d());
            case 9:
                h0 h0Var20 = (h0) this.f109655b;
                poi.b bVar12 = h0Var20.f109697c;
                x xVar2 = h0Var20.f109695a;
                u0 u0Var = (u0) this.d;
                h0 h0Var21 = u0Var.f109776c;
                int i43 = this.f109656c;
                if (i43 == 0) {
                    com.revolut.kompot.navigable.a aVar13 = (com.revolut.kompot.navigable.a) u0Var.d.get();
                    xvi.g gVar11 = new xvi.g(h0Var21.f109696b);
                    uo.q0 q0VarJ10 = bVar12.j();
                    uo.b bVarB10 = bVar12.b();
                    vc.s.j(bVarB10);
                    ho.t tVarC10 = h0Var21.f109697c.c();
                    vc.s.j(tVarC10);
                    return yf6.b.f(aVar13, gVar11, q0VarJ10, bVarB10, new xvi.b(tVarC10));
                }
                if (i43 != 1) {
                    if (i43 == 2) {
                        return new com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.b(u0Var.f109775b, new hxi.f(new ixi.b()));
                    }
                    throw new AssertionError(i43);
                }
                jki.p pVar3 = (jki.p) u0Var.f.get();
                AirportDetailsScreenContract$InputData airportDetailsScreenContract$InputData = u0Var.f109775b;
                dwi.b0 b0VarC4 = xVar2.c();
                vc.s.j(b0VarC4);
                dwi.s sVarA2 = xVar2.a();
                vc.s.j(sVarA2);
                return new uwi.u(pVar3, airportDetailsScreenContract$InputData, b0VarC4, sVarA2, h0Var20.f109705q.a());
            case 10:
                h0 h0Var22 = (h0) this.f109655b;
                poi.b bVar13 = h0Var22.f109697c;
                w0 w0Var = (w0) this.d;
                h0 h0Var23 = w0Var.f109786c;
                int i59 = this.f109656c;
                if (i59 != 0) {
                    if (i59 != 1) {
                        if (i59 == 2) {
                            return new ajd.u(new vxi.a(), new wxi.a());
                        }
                        throw new AssertionError(i59);
                    }
                    jki.p pVar4 = (jki.p) w0Var.f.get();
                    dwi.b0 b0VarC5 = h0Var22.f109695a.c();
                    vc.s.j(b0VarC5);
                    return new ywi.g(pVar4, b0VarC5, w0Var.f109785b);
                }
                com.revolut.kompot.navigable.a aVar14 = (com.revolut.kompot.navigable.a) w0Var.d.get();
                xvi.g gVar12 = new xvi.g(h0Var23.f109696b);
                uo.q0 q0VarJ11 = bVar13.j();
                uo.b bVarB11 = bVar13.b();
                vc.s.j(bVarB11);
                ho.t tVarC11 = h0Var23.f109697c.c();
                vc.s.j(tVarC11);
                return yf6.b.f(aVar14, gVar12, q0VarJ11, bVarB11, new xvi.b(tVarC11));
            case 11:
                h0 h0Var24 = (h0) this.f109655b;
                poi.b bVar14 = h0Var24.f109697c;
                x xVar3 = h0Var24.f109695a;
                u0 u0Var2 = (u0) this.d;
                h0 h0Var25 = u0Var2.f109776c;
                int i66 = this.f109656c;
                if (i66 == 0) {
                    com.revolut.kompot.navigable.a aVar15 = (com.revolut.kompot.navigable.a) u0Var2.d.get();
                    xvi.g gVar13 = new xvi.g(h0Var25.f109696b);
                    uo.q0 q0VarJ12 = bVar14.j();
                    uo.b bVarB12 = bVar14.b();
                    vc.s.j(bVarB12);
                    ho.t tVarC12 = h0Var25.f109697c.c();
                    vc.s.j(tVarC12);
                    return yf6.b.f(aVar15, gVar13, q0VarJ12, bVarB12, new xvi.b(tVarC12));
                }
                if (i66 != 1) {
                    if (i66 == 2) {
                        return new com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.b(u0Var2.f109775b, new hxi.f(new ixi.b()));
                    }
                    throw new AssertionError(i66);
                }
                jki.p pVar5 = (jki.p) u0Var2.f.get();
                AirportDetailsScreenContract$InputData airportDetailsScreenContract$InputData2 = u0Var2.f109775b;
                dwi.b0 b0VarC6 = xVar3.c();
                vc.s.j(b0VarC6);
                dwi.s sVarA3 = xVar3.a();
                vc.s.j(sVarA3);
                return new uwi.u(pVar5, airportDetailsScreenContract$InputData2, b0VarC6, sVarA3, h0Var24.f109705q.a());
            case 12:
                h0 h0Var26 = (h0) this.f109655b;
                poi.b bVar15 = h0Var26.f109697c;
                w0 w0Var2 = (w0) this.d;
                h0 h0Var27 = w0Var2.f109786c;
                int i74 = this.f109656c;
                if (i74 != 0) {
                    if (i74 != 1) {
                        if (i74 == 2) {
                            return new ajd.u(new vxi.a(), new wxi.a());
                        }
                        throw new AssertionError(i74);
                    }
                    jki.p pVar6 = (jki.p) w0Var2.f.get();
                    dwi.b0 b0VarC7 = h0Var26.f109695a.c();
                    vc.s.j(b0VarC7);
                    return new ywi.g(pVar6, b0VarC7, w0Var2.f109785b);
                }
                com.revolut.kompot.navigable.a aVar16 = (com.revolut.kompot.navigable.a) w0Var2.d.get();
                xvi.g gVar14 = new xvi.g(h0Var27.f109696b);
                uo.q0 q0VarJ13 = bVar15.j();
                uo.b bVarB13 = bVar15.b();
                vc.s.j(bVarB13);
                ho.t tVarC13 = h0Var27.f109697c.c();
                vc.s.j(tVarC13);
                return yf6.b.f(aVar16, gVar14, q0VarJ13, bVarB13, new xvi.b(tVarC13));
            case 13:
                poi.b bVar16 = ((h0) this.f109655b).f109697c;
                y0 y0Var = (y0) this.d;
                h0 h0Var28 = y0Var.f109821c;
                int i92 = this.f109656c;
                if (i92 != 0) {
                    if (i92 == 1) {
                        return new oxi.g((cli.n) y0Var.f.get());
                    }
                    if (i92 == 2) {
                        return new oxi.i(y0Var.f109820b, new qxi.a());
                    }
                    throw new AssertionError(i92);
                }
                com.revolut.kompot.navigable.a aVar17 = (com.revolut.kompot.navigable.a) y0Var.d.get();
                xvi.g gVar15 = new xvi.g(h0Var28.f109696b);
                uo.q0 q0VarJ14 = bVar16.j();
                uo.b bVarB14 = bVar16.b();
                vc.s.j(bVarB14);
                ho.t tVarC14 = h0Var28.f109697c.c();
                vc.s.j(tVarC14);
                return yf6.b.g(aVar17, gVar15, q0VarJ14, bVarB14, new xvi.b(tVarC14));
            case 14:
                poi.b bVar17 = ((h0) this.f109655b).f109697c;
                y0 y0Var2 = (y0) this.d;
                h0 h0Var29 = y0Var2.f109821c;
                int i96 = this.f109656c;
                if (i96 != 0) {
                    if (i96 == 1) {
                        return new oxi.g((cli.n) y0Var2.f.get());
                    }
                    if (i96 == 2) {
                        return new oxi.i(y0Var2.f109820b, new qxi.a());
                    }
                    throw new AssertionError(i96);
                }
                com.revolut.kompot.navigable.a aVar18 = (com.revolut.kompot.navigable.a) y0Var2.d.get();
                xvi.g gVar16 = new xvi.g(h0Var29.f109696b);
                uo.q0 q0VarJ15 = bVar17.j();
                uo.b bVarB15 = bVar17.b();
                vc.s.j(bVarB15);
                ho.t tVarC15 = h0Var29.f109697c.c();
                vc.s.j(tVarC15);
                return yf6.b.g(aVar18, gVar16, q0VarJ15, bVarB15, new xvi.b(tVarC15));
            case 15:
                h0 h0Var30 = (h0) this.f109655b;
                poi.b bVar18 = h0Var30.f109697c;
                x xVar4 = h0Var30.f109695a;
                a1 a1Var = (a1) this.d;
                h0 h0Var31 = a1Var.f109633c;
                int i99 = this.f109656c;
                if (i99 == 0) {
                    return kxa.j.l((j60.a) a1Var.f.get());
                }
                if (i99 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) a1Var.d.get(), (rp0.m) a1Var.e.get());
                }
                if (i99 == 2) {
                    return new rp0.m();
                }
                if (i99 == 3) {
                    com.revolut.kompot.navigable.a aVar19 = (com.revolut.kompot.navigable.a) a1Var.d.get();
                    xvi.g gVar17 = new xvi.g(h0Var31.f109696b);
                    uo.q0 q0VarJ16 = bVar18.j();
                    uo.b bVarB16 = bVar18.b();
                    vc.s.j(bVarB16);
                    ho.t tVarC16 = h0Var31.f109697c.c();
                    vc.s.j(tVarC16);
                    return yf6.b.f(aVar19, gVar17, q0VarJ16, bVarB16, new xvi.b(tVarC16));
                }
                if (i99 != 4) {
                    if (i99 == 5) {
                        return new com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.b(a1Var.f109632b, new vxi.a(), new wxi.a(), new vxi.b(new ixi.b()));
                    }
                    throw new AssertionError(i99);
                }
                jki.p pVar7 = (jki.p) a1Var.i.get();
                dwi.b0 b0VarC8 = xVar4.c();
                vc.s.j(b0VarC8);
                dwi.s sVarA4 = xVar4.a();
                vc.s.j(sVarA4);
                return new sxi.q(pVar7, b0VarC8, sVarA4, a1Var.f109632b, new uxi.a(), (j60.a) a1Var.f.get(), h0Var30.f109705q.a());
            case 16:
                h0 h0Var32 = (h0) this.f109655b;
                poi.b bVar19 = h0Var32.f109697c;
                x xVar5 = h0Var32.f109695a;
                a1 a1Var2 = (a1) this.d;
                h0 h0Var33 = a1Var2.f109633c;
                int i100 = this.f109656c;
                if (i100 == 0) {
                    return kxa.j.l((j60.a) a1Var2.f.get());
                }
                if (i100 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) a1Var2.d.get(), (rp0.m) a1Var2.e.get());
                }
                if (i100 == 2) {
                    return new rp0.m();
                }
                if (i100 == 3) {
                    com.revolut.kompot.navigable.a aVar20 = (com.revolut.kompot.navigable.a) a1Var2.d.get();
                    xvi.g gVar18 = new xvi.g(h0Var33.f109696b);
                    uo.q0 q0VarJ17 = bVar19.j();
                    uo.b bVarB17 = bVar19.b();
                    vc.s.j(bVarB17);
                    ho.t tVarC17 = h0Var33.f109697c.c();
                    vc.s.j(tVarC17);
                    return yf6.b.f(aVar20, gVar18, q0VarJ17, bVarB17, new xvi.b(tVarC17));
                }
                if (i100 != 4) {
                    if (i100 == 5) {
                        return new com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.b(a1Var2.f109632b, new vxi.a(), new wxi.a(), new vxi.b(new ixi.b()));
                    }
                    throw new AssertionError(i100);
                }
                jki.p pVar8 = (jki.p) a1Var2.i.get();
                dwi.b0 b0VarC9 = xVar5.c();
                vc.s.j(b0VarC9);
                dwi.s sVarA5 = xVar5.a();
                vc.s.j(sVarA5);
                return new sxi.q(pVar8, b0VarC9, sVarA5, a1Var2.f109632b, new uxi.a(), (j60.a) a1Var2.f.get(), h0Var32.f109705q.a());
            case 17:
                c1 c1Var = (c1) this.d;
                h0 h0Var34 = c1Var.f109650c;
                h0 h0Var35 = (h0) this.f109655b;
                poi.b bVar20 = h0Var35.f109697c;
                i3 i3Var = h0Var35.i;
                l70.e eVar3 = h0Var35.f;
                x xVar6 = h0Var35.f109695a;
                int i101 = this.f109656c;
                if (i101 == 0) {
                    com.revolut.kompot.navigable.a aVar21 = (com.revolut.kompot.navigable.a) c1Var.d.get();
                    xvi.g gVar19 = new xvi.g(h0Var34.f109696b);
                    uo.q0 q0VarJ18 = bVar20.j();
                    uo.b bVarB18 = bVar20.b();
                    vc.s.j(bVarB18);
                    ho.t tVarC18 = h0Var34.f109697c.c();
                    vc.s.j(tVarC18);
                    return yf6.b.g(aVar21, gVar19, q0VarJ18, bVarB18, new xvi.b(tVarC18));
                }
                if (i101 == 1) {
                    com.revolut.kompot.navigable.a aVar22 = (com.revolut.kompot.navigable.a) c1Var.d.get();
                    gte.a aVarB3 = h0Var35.f109699h.b();
                    vc.s.j(aVarB3);
                    return lu7.m0.y(aVar22, aVarB3);
                }
                if (i101 == 2) {
                    AirportLoungesPassListContract$InputData airportLoungesPassListContract$InputData = c1Var.f109649b;
                    cli.n nVar5 = (cli.n) c1Var.i.get();
                    dwi.a aVar23 = (dwi.a) h0Var34.f109695a.v.get();
                    vc.s.j(aVar23);
                    gyi.u uVar = new gyi.u(aVar23);
                    ffk.t tVarF2 = h0Var35.f109700j.f();
                    vc.s.j(tVarF2);
                    qvi.d dVarD2 = xVar6.d();
                    vc.s.j(dVarD2);
                    dwi.a0 a0VarB2 = xVar6.b();
                    vc.s.j(a0VarB2);
                    hwi.x0 x0Var2 = (hwi.x0) xVar6.T.get();
                    vc.s.j(x0Var2);
                    return new gyi.d0(airportLoungesPassListContract$InputData, nVar5, uVar, tVarF2, dVarD2, a0VarB2, x0Var2, ((s41.a) h0Var35.d).d());
                }
                if (i101 == 3) {
                    gyi.n nVar6 = (gyi.n) c1Var.f109652h.get();
                    gyi.f0 f0Var = new gyi.f0(new nd7.d(new nd7.c()));
                    l80.e eVarH = h0Var34.f.h();
                    vc.s.j(eVarH);
                    gyi.g0 g0Var2 = new gyi.g0(eVarH);
                    egk.e eVarE2 = i3Var.e();
                    vc.s.j(eVarE2);
                    return new ac4.g(nVar6, f0Var, g0Var2, eVarE2);
                }
                if (i101 != 4) {
                    if (i101 == 5) {
                        return hy1.g.v((com.revolut.kompot.navigable.a) c1Var.d.get());
                    }
                    throw new AssertionError(i101);
                }
                fkg.a aVarD = eVar3.d();
                c90.c cVar2 = (c90.c) c1Var.f109651g.get();
                egk.e eVarE3 = i3Var.e();
                vc.s.j(eVarE3);
                l80.e eVarH2 = eVar3.h();
                vc.s.j(eVarH2);
                return new gyi.n(aVarD, cVar2, eVarE3, eVarH2);
            case 18:
                c1 c1Var2 = (c1) this.d;
                h0 h0Var36 = c1Var2.f109650c;
                h0 h0Var37 = (h0) this.f109655b;
                poi.b bVar21 = h0Var37.f109697c;
                i3 i3Var2 = h0Var37.i;
                l70.e eVar4 = h0Var37.f;
                x xVar7 = h0Var37.f109695a;
                int i102 = this.f109656c;
                if (i102 == 0) {
                    com.revolut.kompot.navigable.a aVar24 = (com.revolut.kompot.navigable.a) c1Var2.d.get();
                    xvi.g gVar20 = new xvi.g(h0Var36.f109696b);
                    uo.q0 q0VarJ19 = bVar21.j();
                    uo.b bVarB19 = bVar21.b();
                    vc.s.j(bVarB19);
                    ho.t tVarC19 = h0Var36.f109697c.c();
                    vc.s.j(tVarC19);
                    return yf6.b.g(aVar24, gVar20, q0VarJ19, bVarB19, new xvi.b(tVarC19));
                }
                if (i102 == 1) {
                    com.revolut.kompot.navigable.a aVar25 = (com.revolut.kompot.navigable.a) c1Var2.d.get();
                    gte.a aVarB4 = h0Var37.f109699h.b();
                    vc.s.j(aVarB4);
                    return lu7.m0.y(aVar25, aVarB4);
                }
                if (i102 == 2) {
                    AirportLoungesPassListContract$InputData airportLoungesPassListContract$InputData2 = c1Var2.f109649b;
                    cli.n nVar7 = (cli.n) c1Var2.i.get();
                    dwi.a aVar26 = (dwi.a) h0Var36.f109695a.v.get();
                    vc.s.j(aVar26);
                    gyi.u uVar2 = new gyi.u(aVar26);
                    ffk.t tVarF3 = h0Var37.f109700j.f();
                    vc.s.j(tVarF3);
                    qvi.d dVarD3 = xVar7.d();
                    vc.s.j(dVarD3);
                    dwi.a0 a0VarB3 = xVar7.b();
                    vc.s.j(a0VarB3);
                    hwi.x0 x0Var3 = (hwi.x0) xVar7.T.get();
                    vc.s.j(x0Var3);
                    return new gyi.d0(airportLoungesPassListContract$InputData2, nVar7, uVar2, tVarF3, dVarD3, a0VarB3, x0Var3, ((s41.a) h0Var37.d).d());
                }
                if (i102 == 3) {
                    gyi.n nVar8 = (gyi.n) c1Var2.f109652h.get();
                    gyi.f0 f0Var2 = new gyi.f0(new nd7.d(new nd7.c()));
                    l80.e eVarH3 = h0Var36.f.h();
                    vc.s.j(eVarH3);
                    gyi.g0 g0Var3 = new gyi.g0(eVarH3);
                    egk.e eVarE4 = i3Var2.e();
                    vc.s.j(eVarE4);
                    return new ac4.g(nVar8, f0Var2, g0Var3, eVarE4);
                }
                if (i102 != 4) {
                    if (i102 == 5) {
                        return hy1.g.v((com.revolut.kompot.navigable.a) c1Var2.d.get());
                    }
                    throw new AssertionError(i102);
                }
                fkg.a aVarD2 = eVar4.d();
                c90.c cVar3 = (c90.c) c1Var2.f109651g.get();
                egk.e eVarE5 = i3Var2.e();
                vc.s.j(eVarE5);
                l80.e eVarH4 = eVar4.h();
                vc.s.j(eVarH4);
                return new gyi.n(aVarD2, cVar3, eVarE5, eVarH4);
            case 19:
                return a();
            case 20:
                return b();
            case 21:
                poi.b bVar22 = ((h0) this.f109655b).f109697c;
                f1 f1Var = (f1) this.d;
                h0 h0Var38 = f1Var.f109671b;
                int i103 = this.f109656c;
                if (i103 != 0) {
                    if (i103 == 1) {
                        return new syi.b((cli.n) f1Var.e.get());
                    }
                    if (i103 == 2) {
                        return new syi.c();
                    }
                    throw new AssertionError(i103);
                }
                com.revolut.kompot.navigable.a aVar27 = (com.revolut.kompot.navigable.a) f1Var.f109672c.get();
                xvi.g gVar21 = new xvi.g(h0Var38.f109696b);
                uo.q0 q0VarJ20 = bVar22.j();
                uo.b bVarB20 = bVar22.b();
                vc.s.j(bVarB20);
                ho.t tVarC20 = h0Var38.f109697c.c();
                vc.s.j(tVarC20);
                return yf6.b.g(aVar27, gVar21, q0VarJ20, bVarB20, new xvi.b(tVarC20));
            case 22:
                poi.b bVar23 = ((h0) this.f109655b).f109697c;
                f1 f1Var2 = (f1) this.d;
                h0 h0Var39 = f1Var2.f109671b;
                int i104 = this.f109656c;
                if (i104 != 0) {
                    if (i104 == 1) {
                        return new syi.b((cli.n) f1Var2.e.get());
                    }
                    if (i104 == 2) {
                        return new syi.c();
                    }
                    throw new AssertionError(i104);
                }
                com.revolut.kompot.navigable.a aVar28 = (com.revolut.kompot.navigable.a) f1Var2.f109672c.get();
                xvi.g gVar22 = new xvi.g(h0Var39.f109696b);
                uo.q0 q0VarJ21 = bVar23.j();
                uo.b bVarB21 = bVar23.b();
                vc.s.j(bVarB21);
                ho.t tVarC21 = h0Var39.f109697c.c();
                vc.s.j(tVarC21);
                return yf6.b.g(aVar28, gVar22, q0VarJ21, bVarB21, new xvi.b(tVarC21));
            case 23:
                return c();
            case 24:
                return d();
            case 25:
                return e();
            case 26:
                return f();
            case 27:
                return g();
            case 28:
                return h();
            default:
                lfc.b bVar24 = ((db1.b) this.f109655b).f112644a;
                db1.d dVar4 = (db1.d) this.d;
                int i105 = this.f109656c;
                if (i105 == 0) {
                    jki.p pVar9 = (jki.p) dVar4.f112651b.get();
                    xa1.a aVar29 = (xa1.a) bVar24.f194851j.get();
                    vc.s.j(aVar29);
                    return new ob1.o(pVar9, aVar29);
                }
                if (i105 != 1) {
                    throw new AssertionError(i105);
                }
                wa1.a cardReaderOrderStrings = dVar4.f112650a.f112644a.a();
                vc.s.j(cardReaderOrderStrings);
                Intrinsics.checkNotNullParameter(cardReaderOrderStrings, "cardReaderOrderStrings");
                ob1.b listItemFactory = new ob1.b();
                wa1.a cardReaderOrderStrings2 = bVar24.a();
                vc.s.j(cardReaderOrderStrings2);
                Intrinsics.checkNotNullParameter(listItemFactory, "listItemFactory");
                Intrinsics.checkNotNullParameter(cardReaderOrderStrings2, "cardReaderOrderStrings");
                return new ob1.p();
        }
    }
}
