package hjg;

import aa0.y;
import ad0.p;
import ad0.t;
import ad0.w;
import ami.n;
import an.q;
import android.app.Activity;
import android.content.Context;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultRegistry;
import bq.i;
import c12.z;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration;
import com.revolut.feature.apm.bills.billers.api.navigation.BillerSearchNavigation$InputData;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoCodeDetailsInputData;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoFlowInputData;
import com.revolut.feature.apm.multibanco.impl.ui.home.area.MultibancoHomeAreaContract$InputData;
import com.revolut.feature.credit.help.impl.network.CreditHelpService;
import com.revolut.feature.credit.help.impl.ui.financial_difficulties.self_service.FinancialDifficultiesControllerContract$InputData;
import com.revolut.feature.kyc.vendors.shared.api.uae_pass.UaePassFlowConfiguration;
import com.revolut.feature.kyc.vendors.shared.impl.uaepass.UaePassScreenContract$InputData;
import com.revolut.feature.subscriptions.impl.block_card_subscription.accept_conditions.AcceptConditionsScreenContract$InputData;
import com.revolut.feature.transport.impl.ui.activation.flow.TransitTicketActivationFlowContract$InputData;
import com.revolut.feature.transport.impl.ui.hub.TransportHubFlowContract$InputData;
import com.revolut.feature.transport.impl.ui.hub.tickets.TransportHubTicketsScreenContract$InputData;
import com.revolut.feature.transport.impl.ui.hub.transit_section.TransitSectionScreenContract$InputData;
import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration;
import e4m.e;
import hvf.x;
import i72.b0;
import i72.u;
import iri.j;
import iri.l;
import iri.m;
import ish.a0;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kpi.f;
import om4.d0;
import qc0.i1;
import qc0.k;
import qc0.y0;
import qi3.r;
import rpi.h;
import t70.g;
import t80.v;
import vc.s;
import yc0.c0;
import yc0.f0;
import yc0.o;
import zc0.y2;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f152786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f152787c;
    public final Object d;

    public /* synthetic */ b(Object obj2, Object obj3, int i, int i2) {
        this.f152785a = i2;
        this.f152787c = obj2;
        this.d = obj3;
        this.f152786b = i;
    }

    private final Object a() {
        hzk.b bVar = (hzk.b) this.f152787c;
        hzk.a aVar = (hzk.a) this.d;
        int i = this.f152786b;
        switch (i) {
            case 0:
                return f.a();
            case 1:
                Context contextI = i.i(aVar.f157218a);
                BaseDelegatesActivity baseDelegatesActivityF = i.f(aVar.f157218a);
                g gVarO = bVar.f157236b.o();
                s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) aVar.f.get(), gsi.c.a(aVar.f157218a));
            case 3:
                return new rpi.b(i.b(aVar.f157218a));
            case 4:
                return new h(i.b(aVar.f157218a));
            case 5:
                return new iri.g((j) bVar.f157240j.get(), (m) bVar.k.get(), i.f(aVar.f157218a), i.l(aVar.f157218a));
            case 6:
                return new l((m) bVar.k.get(), i.f(aVar.f157218a), (iri.d) aVar.f157223j.get());
            case 7:
                return new iri.d(i.f(aVar.f157218a));
            case 8:
                return new opi.b(i.f(aVar.f157218a));
            case 9:
                return new en.c(ImmutableSet.of((ln.d) aVar.f157220c.f157241l.get()), i.l(aVar.f157218a));
            case 10:
                aVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar.f157242m.get(), bVar.d());
            case 11:
                um.c cVar = (um.c) bVar.f157243n.get();
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                hzk.b bVar2 = aVar.f157220c;
                hn.h hVar = (hn.h) bVar2.o.get();
                g gVarO2 = bVar2.f157236b.o();
                s.j(gVarO2);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO2));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(bVar2.k());
                builderBuilderWithExpectedSize.add(bVar2.f157245q.get());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(aVar.o)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), bVar.d());
            case 12:
                return i.t(aVar.f157218a);
            case 13:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(aVar.f157228q.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(aVar.f157221g)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) bVar.f157246r.get(), bVar.d());
            case 14:
                return new zm.a();
            case 15:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(aVar.f157220c.k());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) bVar.o.get(), (npi.f) aVar.e.get());
            case 16:
                return new gn.c((lpi.e) aVar.f157231t.get(), (sm.e) bVar.v.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar.d());
            case 17:
                return new lpi.b(i.i(aVar.f157218a), i.j(aVar.f157218a));
            case 18:
                aVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar.f157249w.get(), bVar.d());
            case 19:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                return new g3l.c(j6.a.g(aVar.f157220c.f157245q, builderBuilderWithExpectedSize4), (g3l.g) bVar.f157244p.get(), (k3l.b) aVar.f157232w.get(), bVar.d());
            case 20:
                return new k3l.d(i.b(aVar.f157218a));
            case 21:
                return new izk.b((gzk.d) bVar.f157250x.get(), aVar.f157219b);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        i0l.d dVar = (i0l.d) this.f152787c;
        i0l.a aVar = (i0l.a) this.d;
        int i = this.f152786b;
        switch (i) {
            case 0:
                ypi.h hVar = aVar.f157429b;
                fsi.g gVar = aVar.f157428a;
                return new ypi.e(hVar, i.b(gVar), i.o(gVar), i.g(gVar));
            case 1:
                return new hqi.f(aVar.f157430c, i.b(aVar.f157428a));
            case 2:
                return f.a();
            case 3:
                Context contextI = i.i(aVar.f157428a);
                BaseDelegatesActivity baseDelegatesActivityF = i.f(aVar.f157428a);
                g gVarO = dVar.f157461b.o();
                s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 4:
                return new tpi.i((rpi.c) aVar.f157433j.get(), gsi.c.a(aVar.f157428a));
            case 5:
                return new rpi.b(i.b(aVar.f157428a));
            case 6:
                return new h(i.b(aVar.f157428a));
            case 7:
                return new iri.g((j) dVar.f157477q.get(), (m) dVar.f157487x.get(), i.f(aVar.f157428a), i.l(aVar.f157428a));
            case 8:
                return new l((m) dVar.f157487x.get(), i.f(aVar.f157428a), (iri.d) aVar.f157436n.get());
            case 9:
                return new iri.d(i.f(aVar.f157428a));
            case 10:
                return new opi.b(i.f(aVar.f157428a));
            case 11:
                return new qi3.l(i.l(aVar.f157428a), (f9b.f) aVar.f157438q.get(), (r) dVar.f157488x0.get(), (com.revolut.feature.chooser.c) dVar.y0.get(), aVar.d, (ypi.i) aVar.f.get(), (hqi.l) aVar.f157431g.get(), (opi.d) aVar.f157437p.get(), (tpi.j) aVar.k.get(), i.o(aVar.f157428a));
            case 12:
                return i.t(aVar.f157428a);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        i0l.d dVar = (i0l.d) this.f152787c;
        i0l.c cVar = (i0l.c) this.d;
        int i = this.f152786b;
        switch (i) {
            case 0:
                cVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) dVar.f157478r.get(), dVar.d());
            case 1:
                um.c cVar2 = (um.c) dVar.f157480s.get();
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(7);
                i0l.d dVar2 = cVar.f;
                hn.h hVar = (hn.h) dVar2.f157482t.get();
                g gVarO = dVar2.f157461b.o();
                s.j(gVarO);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(dVar2.k());
                builderBuilderWithExpectedSize.add(new xc0.a((qc0.j) dVar2.f157465e0.get(), (qc0.h) dVar2.f157462b0.get()));
                builderBuilderWithExpectedSize.add(dVar2.g0.get());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(cVar.f157446h)));
                return new in.e(cVar2, builderBuilderWithExpectedSize.build(), dVar.d());
            case 2:
                return i.t(cVar.f157440a);
            case 3:
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(cVar.f157447j.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(cVar.f157448l)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) dVar.U.get(), dVar.d());
            case 4:
                return new zm.a();
            case 5:
                return new tpi.i((rpi.c) cVar.k.get(), gsi.c.a(cVar.f157440a));
            case 6:
                return new rpi.b(i.b(cVar.f157440a));
            case 7:
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(cVar.f.k());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) dVar.f157482t.get(), (npi.f) cVar.f157450n.get());
            case 8:
                Context contextI = i.i(cVar.f157440a);
                BaseDelegatesActivity baseDelegatesActivityF = i.f(cVar.f157440a);
                g gVarO2 = dVar.f157461b.o();
                s.j(gVarO2);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO2);
            case 9:
                i0l.d dVar3 = cVar.f;
                return new en.c(ImmutableSet.of((ln.d) dVar3.m0.get(), (ln.d) dVar3.u.get()), i.l(cVar.f157440a));
            case 10:
                return new gn.c((lpi.e) cVar.f157452q.get(), (sm.e) dVar.f157474n0.get(), ImmutableSet.copyOf((Collection) gn.e.a()), dVar.d());
            case 11:
                return new lpi.b(i.i(cVar.f157440a), i.j(cVar.f157440a));
            case 12:
                cVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) dVar.f157475o0.get(), dVar.d());
            case 13:
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                i0l.d dVar4 = cVar.f;
                builderBuilderWithExpectedSize4.add(new wc0.a((k) dVar4.v.get(), ((s41.a) dVar4.f157467h).d(), (ln.a) dVar4.u.get(), (qc0.j) dVar4.f157465e0.get(), (xl2.f) dVar4.S.get(), dVar4.a()));
                return new g3l.c(j6.a.g(dVar4.g0, builderBuilderWithExpectedSize4), (g3l.g) dVar.f0.get(), (k3l.b) cVar.f157455t.get(), dVar.d());
            case 14:
                return new k3l.d(i.b(cVar.f157440a));
            case 15:
                ypi.h hVar2 = cVar.f157442b;
                xoi.d dVar5 = cVar.f157440a;
                return new ypi.e(hVar2, i.b(dVar5), i.o(dVar5), i.g(dVar5));
            case 16:
                return new hqi.f(cVar.f157444c, i.b(cVar.f157440a));
            case 17:
                return new h(i.b(cVar.f157440a));
            case 18:
                return new iri.g((j) dVar.f157477q.get(), (m) dVar.v.get(), i.f(cVar.f157440a), i.l(cVar.f157440a));
            case 19:
                return new l((m) dVar.v.get(), i.f(cVar.f157440a), (iri.d) cVar.z.get());
            case 20:
                return new iri.d(i.f(cVar.f157440a));
            case 21:
                return new q((cqi.h) cVar.B.get(), (an.a) dVar.p0.get(), ImmutableSet.copyOf((Collection) bn.b.a()), dVar.d());
            case 22:
                return new cqi.j(i.f(cVar.f157440a));
            case 23:
                cVar.getClass();
                return new xpi.c(xpi.f.d, i.b(cVar.f157440a));
            case 24:
                return new com.revolut.retail.toast.mediator.a((d4l.a) dVar.q0.get(), (c4l.b) cVar.E.get());
            case 25:
                return new c4l.e(i.i(cVar.f157440a), i.g(cVar.f157440a));
            case 26:
                return new f5l.c((f5l.a) dVar.f157479r0.get(), i.b(cVar.f157440a));
            case 27:
                return new opi.b(i.f(cVar.f157440a));
            case 28:
                return new iqi.b(cVar.d, i.b(cVar.f157440a));
            case 29:
                Activity activityB = i.b(cVar.f157440a);
                y80.b bVar = new y80.b();
                g60.a aVar = (g60.a) cVar.J.get();
                xoi.d dVar6 = cVar.f157440a;
                Activity activityB2 = i.b(dVar6);
                t80.g gVar = (t80.g) cVar.K.get();
                BaseDelegatesActivity baseDelegatesActivityF2 = i.f(dVar6);
                d4m.a aVarA = e4m.b.a(cVar.L);
                nli.a aVarG = cVar.g();
                t80.g gVar2 = (t80.g) cVar.K.get();
                l70.e eVar = cVar.f.f157461b;
                zk0.b bVarL = eVar.l();
                s.j(bVarL);
                oli.c cVar3 = new oli.c(gVar2, bVarL, cVar.g(), (g60.a) cVar.J.get(), cVar.h());
                ComponentActivity componentActivityA = gmf.b.a(dVar6);
                ActivityResultRegistry activityResultRegistryA = pli.b.a(gmf.b.a(dVar6));
                n nVar = new n(e4m.b.a(cVar.M), 1);
                d4m.a aVarA2 = e4m.b.a(cVar.L);
                t80.g gVar3 = (t80.g) cVar.K.get();
                nli.a aVarG2 = cVar.g();
                eVar.getClass();
                i90.b bVar2 = new i90.b();
                z70.a aVarF = eVar.f();
                s.j(aVarF);
                c70.b bVar3 = new c70.b(aVarF, 2);
                z70.a aVarF2 = eVar.f();
                s.j(aVarF2);
                return new upi.b(activityB, bVar, new v(aVar, activityB2, gVar, baseDelegatesActivityF2, aVarA, aVarG, cVar3, new oli.g(componentActivityA, activityResultRegistryA, nVar, aVarA2, gVar3, aVarG2, bVar2, new u96.b(bVar3, new smd.s(aVarF2)), cVar.h()), cVar.h()));
            case 30:
                return new g60.a(i.b(cVar.f157440a));
            case 31:
                l70.e eVar2 = dVar.f157461b;
                l70.e eVar3 = dVar.f157461b;
                f80.a aVarX = eVar2.x();
                s.j(aVarX);
                l80.e eVarH = eVar3.h();
                s.j(eVarH);
                zk0.b bVarL2 = eVar3.l();
                s.j(bVarL2);
                return new t80.b(aVarX, eVarH, bVarL2);
            case 32:
                return pli.c.a(new ks0.n(i.f(cVar.f157440a)));
            case 33:
                return t96.a.a();
            case 34:
                return new aqi.d(i.b(cVar.f157440a), new y80.b());
            case 35:
                qc0.j jVar = (qc0.j) dVar.f157465e0.get();
                k kVar = (k) dVar.v.get();
                qc0.h hVar3 = (qc0.h) dVar.f157462b0.get();
                ypi.i iVar = (ypi.i) cVar.v.get();
                f9b.f fVar = (f9b.f) cVar.f157446h.get();
                tpi.j jVar2 = (tpi.j) cVar.f157448l.get();
                hqi.l lVar = (hqi.l) cVar.f157456w.get();
                BackendFlowContract$Configuration backendFlowContract$Configuration = (BackendFlowContract$Configuration) cVar.P.get();
                rpi.c cVar4 = (rpi.c) cVar.k.get();
                npi.a aVar2 = (npi.a) cVar.f157450n.get();
                pri.f fVarD = i.d(cVar.f157440a);
                k3l.b bVar4 = (k3l.b) cVar.f157455t.get();
                xpi.g gVar4 = (xpi.g) cVar.D.get();
                qc0.h hVar4 = (qc0.h) cVar.f.f157462b0.get();
                wpg.v.b(hVar4);
                ImmutableSet immutableSetOf = ImmutableSet.of(hVar4);
                mm.d dVar7 = (mm.d) dVar.c0.get();
                opi.d dVar8 = (opi.d) cVar.H.get();
                qd0.b bVarN = dVar.f157461b.n();
                s.j(bVarN);
                return new y0(jVar, kVar, hVar3, iVar, fVar, jVar2, lVar, backendFlowContract$Configuration, cVar4, aVar2, fVarD, bVar4, gVar4, immutableSetOf, dVar7, dVar8, bVarN);
            case 36:
                TradingOnboardingBackendFlowContract$Configuration configuration = cVar.e;
                l0l.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return new BackendFlowContract$Configuration(22, configuration.getF104226c().d, configuration.getF104226c().f51308a);
            case 37:
                zc0.g gVar5 = (zc0.g) cVar.R.get();
                e eVar4 = dVar.f157465e0;
                y90.e eVar5 = dVar.f157473n;
                qc0.j jVar3 = (qc0.j) eVar4.get();
                ypi.i iVar2 = (ypi.i) cVar.v.get();
                i0l.d dVar9 = cVar.f;
                l70.e eVar6 = dVar9.f157461b;
                w80.b bVarJ = eVar6.j();
                s.j(bVarJ);
                g gVarO3 = eVar6.o();
                s.j(gVarO3);
                zc0.c cVar5 = new zc0.c(bVarJ, gVarO3, (p80.a) cVar.S.get(), (y) dVar9.F.get(), cVar.f(), new yc0.j(new yc0.q(cVar.e()), cVar.e(), (yc0.g) dVar9.f157483t0.get(), (ad0.a) dVar9.T.get(), (p) cVar.X.get(), new yc0.p()), new o((yc0.g) dVar9.f157483t0.get()), (p) cVar.X.get(), (ad0.c) cVar.U.get(), new t(cVar.e(), new yc0.p()), new ad0.s(cVar.e(), new yc0.p()), new ad0.g(cVar.e()), new ad0.v(new yc0.q(cVar.e())), new ad0.o(), new yc0.q(cVar.e()), new yc0.p(), (yc0.y) dVar9.u0.get(), (bd0.a) dVar9.f157484v0.get(), (yc0.v) dVar9.f157486w0.get(), (c0) cVar.Y.get());
                npi.a aVar3 = (npi.a) cVar.f157450n.get();
                xpi.g gVar6 = (xpi.g) cVar.D.get();
                k3l.b bVar5 = (k3l.b) cVar.f157455t.get();
                rpi.c cVar6 = (rpi.c) cVar.k.get();
                zd7.b bVar6 = (zd7.b) cVar.f157441a0.get();
                tpi.j jVar4 = (tpi.j) cVar.f157448l.get();
                opi.d dVar10 = (opi.d) cVar.H.get();
                cqi.h hVar5 = (cqi.h) cVar.B.get();
                i1 i1VarB = eVar5.b();
                s.j(i1VarB);
                oc0.f fVarC = eVar5.c();
                s.j(fVarC);
                fc0.f fVarD2 = eVar5.d();
                s.j(fVarD2);
                oc0.m mVarE = eVar5.e();
                s.j(mVarE);
                t9l.g gVarA = dVar.f157472m.a();
                s.j(gVarA);
                oc0.k kVarA = eVar5.a();
                s.j(kVarA);
                return new y2(hVar5, eVar5.f(), fVarD2, bVar5, aVar3, fVarC, kVarA, mVarE, dVar10, jVar3, i1VarB, cVar6, gVarA, jVar4, gVar6, iVar2, cVar5, gVar5, bVar6);
            case 38:
                Context context = i.i(cVar.f157440a);
                l0l.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new p80.a(context);
            case 39:
                x90.c cVar7 = dVar.d;
                yc0.q qVar = new yc0.q(cVar.e());
                yc0.r rVar = (yc0.r) cVar.T.get();
                ad0.c cVar8 = (ad0.c) cVar.U.get();
                w wVarG = dVar.f157473n.g();
                s.j(wVarG);
                f0 f0Var = (f0) cVar.V.get();
                ad0.h hVar6 = (ad0.h) cVar.W.get();
                ad0.n nVarF = cVar.f();
                u9l.a aVarB = dVar.f157472m.b();
                s.j(aVarB);
                return wpg.v.o(cVar7, qVar, rVar, cVar8, wVarG, f0Var, hVar6, nVarF, aVarB);
            case 40:
                return wpg.v.n(dVar.d, cVar.e(), new yc0.p());
            case 41:
                x90.c cVar9 = dVar.d;
                return new ad0.d();
            case 42:
                x90.c cVar10 = dVar.d;
                hbl.d dVarC = dVar.f157472m.c();
                s.j(dVarC);
                return wpg.v.y(cVar10, dVarC);
            case 43:
                return wpg.v.a(dVar.d, cVar.f());
            case 44:
                return wpg.v.w(dVar.d, (yc0.r) cVar.T.get(), new yc0.p());
            case 45:
                return new ae7.i((upi.f) cVar.N.get(), (t80.c) dVar.f157481s0.get(), (d4l.a) dVar.q0.get(), (aqi.a) cVar.Z.get(), new ae7.j(), i.l(cVar.f157440a));
            case 46:
                return aqi.f.a(cVar.f157440a, (aqi.d) cVar.O.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        k39.b bVar = ((i39.b) this.d).f158129a;
        i39.a aVar = (i39.a) this.f152787c;
        afj.b bVar2 = aVar.k;
        aoj.a aVar2 = aVar.i;
        hsh.b bVar3 = aVar.f158112a;
        int i = this.f152786b;
        if (i == 0) {
            p69.b bVar4 = (p69.b) aVar.e.f212747c.get();
            s.j(bVar4);
            ash.d dVar = (ash.d) aVar.P.get();
            a0 a0VarC = bVar3.c();
            s.j(a0VarC);
            return kxa.j.x(bVar4, dVar, a0VarC);
        }
        if (i == 1) {
            doj.a aVarA = aVar2.a();
            s.j(aVarA);
            a0 a0VarC2 = bVar3.c();
            s.j(a0VarC2);
            fej.b bVarM = bVar2.m();
            s.j(bVarM);
            return hy1.g.q(aVarA, a0VarC2, bVarM, bVar, (ash.d) aVar.P.get());
        }
        if (i == 2) {
            doj.a aVarA2 = aVar2.a();
            s.j(aVarA2);
            a0 a0VarC3 = bVar3.c();
            s.j(a0VarC3);
            fej.b bVarM2 = bVar2.m();
            s.j(bVarM2);
            return hy1.g.o(aVarA2, a0VarC3, bVarM2, bVar, (ash.d) aVar.P.get());
        }
        if (i == 3) {
            l1c.a aVarA3 = aVar.f158121p.a();
            s.j(aVarA3);
            pyb.c cVar = new pyb.c(aVar.f158114c.e());
            nyb.k kVarC = aVar.f158113b.c();
            s.j(kVarC);
            a0 a0VarC4 = bVar3.c();
            s.j(a0VarC4);
            ash.d dVar2 = (ash.d) aVar.P.get();
            q06.l lVarA = aVar.u.a();
            s.j(lVarA);
            return olc.c.m(aVarA3, cVar, kVarC, a0VarC4, dVar2, lVarA);
        }
        if (i != 4) {
            if (i == 5) {
                return new m39.g((k39.a) aVar.P.get());
            }
            throw new AssertionError(i);
        }
        pvj.a factory = (pvj.a) aVar.f158124s.f309100n.get();
        s.j(factory);
        a0 widgetsUiInteractor = bVar3.c();
        s.j(widgetsUiInteractor);
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        return new ovj.e(widgetsUiInteractor);
    }

    private final Object e() {
        i72.m mVar = (i72.m) this.f152787c;
        i72.q qVar = (i72.q) this.d;
        i72.m mVar2 = qVar.f159150b;
        int i = this.f152786b;
        if (i == 0) {
            Object extension = (j72.a) qVar.f159151c.get();
            k72.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            s.k(nVar);
            return nVar;
        }
        if (i == 1) {
            sf0.h hVarB = mVar2.f159123a.b();
            s.j(hVarB);
            r10.w wVar = new r10.w(hVarB, fe0.c.a());
            v60.e eVarA = mVar2.f159124b.a();
            s.j(eVarA);
            r10.t tVar = new r10.t(wVar, eVarA);
            til.m mVarA = mVar.f159125c.a();
            s.j(mVarA);
            return new j72.b(tVar, mVarA);
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        MultibancoFlowInputData multibancoFlowInputData = qVar.f159149a;
        j72.a aVar = (j72.a) qVar.f159151c.get();
        d0 d0Var = new d0((c12.f) mVar2.C.get());
        p72.p pVar = new p72.p((z) mVar2.D.get());
        p72.l lVar = new p72.l(new zq.a((m72.a) mVar2.G.get(), (l72.f) mVar2.H.get()));
        gte.a aVarB = mVar.f159129l.b();
        s.j(aVarB);
        return new com.revolut.feature.apm.multibanco.impl.ui.a(multibancoFlowInputData, aVar, d0Var, pVar, lVar, aVarB, (d12.b) mVar.J.get());
    }

    private final Object f() {
        i72.m mVar = (i72.m) this.f152787c;
        i72.r rVar = (i72.r) this.d;
        int i = this.f152786b;
        switch (i) {
            case 0:
                Object extension = (y02.a) rVar.f.get();
                z02.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.d dVar = (yji.d) extension;
                s.k(dVar);
                return dVar;
            case 1:
                r12.a aVar = (r12.a) mVar.f159132p.f231711s.get();
                s.j(aVar);
                return yf6.b.k(aVar, rVar.f159152a, (y02.c) rVar.e.get());
            case 2:
                return yf6.b.l(rVar.f159152a);
            case 3:
                ry9.d extension2 = (ry9.d) rVar.f159156h.get();
                b82.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                s.k(extension2);
                return extension2;
            case 4:
                vy9.g factory = mVar.f159133q.b();
                s.j(factory);
                b82.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a();
            case 5:
                y62.b extension3 = (y62.b) rVar.f159157j.get();
                z62.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                y62.b bVar = extension3;
                s.k(bVar);
                return bVar;
            case 6:
                l80.e eVarH = mVar.k.h();
                s.j(eVarH);
                return new y62.b(eVarH);
            case 7:
                MultibancoHomeAreaContract$InputData multibancoHomeAreaContract$InputData = rVar.f159153b;
                i72.m mVar2 = rVar.d;
                h12.h hVarF = mVar2.f159132p.f();
                s.j(hVarF);
                l72.i iVar = (l72.i) mVar2.K.get();
                l72.c cVar = (l72.c) mVar2.I.get();
                whf.b bVarA = mVar2.f159134r.a();
                s.j(bVarA);
                q72.a aVar2 = new q72.a(bVarA);
                mt8.d dVarB = mVar2.f159135s.b();
                s.j(dVarB);
                z72.e eVar = new z72.e(hVarF, iVar, cVar, aVar2, dVarB);
                m72.a aVar3 = (m72.a) mVar.G.get();
                d0 d0Var = new d0((c12.f) mVar.C.get());
                p72.p pVar = new p72.p((z) mVar2.D.get());
                h12.a aVarD = mVar.f159132p.d();
                s.j(aVarD);
                pn3.a aVar4 = (pn3.a) mVar.L.get();
                vz1.j jVarI = ((lz1.m) mVar.f159136t).i();
                s.j(jVarI);
                return new com.revolut.feature.apm.multibanco.impl.ui.home.area.b(multibancoHomeAreaContract$InputData, eVar, aVar3, d0Var, pVar, aVarD, aVar4, jVarI, (e12.f) mVar.M.get(), (y62.b) rVar.f159157j.get(), (ry9.d) rVar.f159156h.get(), (cli.n) rVar.f159160n.get());
            case 8:
                p12.l lVar = mVar.f159132p;
                p12.l lVar2 = mVar.f159132p;
                a12.j jVarE = lVar.e();
                s.j(jVarE);
                a12.e eVarL = lVar2.l();
                s.j(eVarL);
                a12.o oVarM = lVar2.m();
                s.j(oVarM);
                rVar.getClass();
                c92.d withdrawalCodeMapper = new c92.d((my0.e) rVar.f159159m.get());
                Intrinsics.checkNotNullParameter(withdrawalCodeMapper, "withdrawalCodeMapper");
                c82.e eVar2 = new c82.e();
                c82.c cVar2 = new c82.c();
                da3.j jVar = rVar.d.f159130m;
                c82.b bVar2 = new c82.b(new ia3.f(jVar.b(), (m93.g) jVar.C.get()));
                a12.p pVar2 = (a12.p) lVar2.L.get();
                s.j(pVar2);
                ty9.b bVarC = mVar.f159133q.c();
                s.j(bVarC);
                return new a82.y(jVarE, eVarL, oVarM, eVar2, cVar2, bVar2, pVar2, bVarC);
            case 9:
                ari.b bVar3 = rVar.f159154c;
                my0.b composer = (my0.b) rVar.f159158l.get();
                Intrinsics.checkNotNullParameter(composer, "composer");
                return new my0.e(composer);
            case 10:
                ari.b bVar4 = rVar.f159154c;
                return new my0.b();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        i72.m mVar = (i72.m) this.f152787c;
        u uVar = (u) this.d;
        int i = this.f152786b;
        if (i == 0) {
            Object extension = (j72.a) uVar.d.get();
            k72.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            s.k(nVar);
            return nVar;
        }
        if (i != 1) {
            if (i == 2) {
                return new com.revolut.feature.apm.multibanco.impl.ui.pending.a(uVar.f159167a, (j72.a) uVar.d.get());
            }
            throw new AssertionError(i);
        }
        r10.t tVarA = mVar.a();
        til.m mVarA = mVar.f159125c.a();
        s.j(mVarA);
        return new j72.b(tVarA, mVarA);
    }

    private final Object h() {
        i72.w wVar = (i72.w) this.d;
        i72.m mVar = (i72.m) this.f152787c;
        int i = this.f152786b;
        if (i == 0) {
            d92.b extension = (d92.b) wVar.d.get();
            z82.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            s.k(extension);
            return extension;
        }
        if (i == 1) {
            return new d92.b(new s82.b(), new s82.d(), new q82.a());
        }
        if (i == 2) {
            Object extension2 = (j72.a) wVar.f.get();
            k72.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension2, "extension");
            yji.n nVar = (yji.n) extension2;
            s.k(nVar);
            return nVar;
        }
        if (i == 3) {
            r10.t tVarA = mVar.a();
            til.m mVarA = mVar.f159125c.a();
            s.j(mVarA);
            return new j72.b(tVarA, mVarA);
        }
        if (i == 4) {
            return new com.revolut.feature.apm.multibanco.impl.ui.withdrawal.a(wVar.f159172a, (j72.a) wVar.f.get());
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        qd0.b languageProvider = mVar.k.n();
        s.j(languageProvider);
        z82.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.b(languageProvider, false, false, 58);
    }

    private final Object i() {
        i72.m mVar = (i72.m) this.f152787c;
        pqi.a aVar = mVar.z;
        b0 b0Var = (b0) this.d;
        int i = this.f152786b;
        switch (i) {
            case 0:
                Object extension = (z) mVar.D.get();
                y82.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                s.k(nVar);
                return nVar;
            case 1:
                y62.b extension2 = (y62.b) b0Var.d.get();
                z62.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                y62.b bVar = extension2;
                s.k(bVar);
                return bVar;
            case 2:
                l80.e eVarH = mVar.k.h();
                s.j(eVarH);
                return new y62.b(eVarH);
            case 3:
                MultibancoCodeDetailsInputData multibancoCodeDetailsInputData = b0Var.f159060a;
                i72.m mVar2 = b0Var.f159061b;
                l72.i iVar = (l72.i) mVar2.K.get();
                whf.b bVarA = mVar2.f159134r.a();
                s.j(bVarA);
                return new com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a(multibancoCodeDetailsInputData, new tb4.t(iVar, bVarA), (y62.b) b0Var.d.get(), aVar.e(), new zj2.a(), aVar.g(), (cli.n) b0Var.f159064h.get());
            case 4:
                c92.d dVar = new c92.d((my0.e) b0Var.f159063g.get());
                whf.n nVarB = mVar.f159134r.b();
                s.j(nVarB);
                return new x82.r(dVar, nVarB);
            case 5:
                my0.b composer = (my0.b) b0Var.f.get();
                Intrinsics.checkNotNullParameter(composer, "composer");
                return new my0.e(composer);
            case 6:
                return new my0.b();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        i72.m mVar = (i72.m) this.f152787c;
        i72.c0 c0Var = (i72.c0) this.d;
        int i = this.f152786b;
        switch (i) {
            case 0:
                Object extension = (z) mVar.D.get();
                b92.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                s.k(nVar);
                return nVar;
            case 1:
                y62.b extension2 = (y62.b) c0Var.f159066b.get();
                z62.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                y62.b bVar = extension2;
                s.k(bVar);
                return bVar;
            case 2:
                l80.e eVarH = mVar.k.h();
                s.j(eVarH);
                return new y62.b(eVarH);
            case 3:
                return new a92.i((l72.i) mVar.K.get(), (y62.b) c0Var.f159066b.get(), (cli.n) c0Var.f.get());
            case 4:
                c92.d withdrawalCodeMapper = new c92.d((my0.e) c0Var.e.get());
                Intrinsics.checkNotNullParameter(withdrawalCodeMapper, "withdrawalCodeMapper");
                return new a92.k();
            case 5:
                my0.b composer = (my0.b) c0Var.d.get();
                Intrinsics.checkNotNullParameter(composer, "composer");
                return new my0.e(composer);
            case 6:
                return new my0.b();
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object dVar;
        Object iVar;
        Object aVar;
        Object fVar;
        Object cVar;
        Object fVar2;
        switch (this.f152785a) {
            case 0:
                d dVar2 = (d) this.f152787c;
                c cVar2 = (c) this.d;
                int i = this.f152786b;
                switch (i) {
                    case 0:
                        cVar2.getClass();
                        dVar = new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) dVar2.i.get(), dVar2.a());
                        return dVar;
                    case 1:
                        um.c cVar3 = (um.c) dVar2.f152810j.get();
                        cVar2.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                        d dVar3 = cVar2.f152789b;
                        hn.h hVar = (hn.h) dVar3.k.get();
                        g gVarO = dVar3.f152806b.o();
                        s.j(gVarO);
                        builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO));
                        builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize.add(dVar3.b());
                        builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(cVar2.d)));
                        dVar = new in.e(cVar3, builderBuilderWithExpectedSize.build(), dVar2.a());
                        return dVar;
                    case 2:
                        return i.t(cVar2.f152788a);
                    case 3:
                        cVar2.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize2.add(cVar2.f.get());
                        builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(cVar2.f152792h)));
                        dVar = new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) dVar2.f152812m.get(), dVar2.a());
                        return dVar;
                    case 4:
                        return new zm.a();
                    case 5:
                        iVar = new tpi.i((rpi.c) cVar2.f152791g.get(), gsi.c.a(cVar2.f152788a));
                        return iVar;
                    case 6:
                        iVar = new rpi.b(i.b(cVar2.f152788a));
                        return iVar;
                    case 7:
                        cVar2.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize3.add(cVar2.f152789b.b());
                        dVar = new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) dVar2.k.get(), (npi.f) cVar2.f152793j.get());
                        return dVar;
                    case 8:
                        Context contextI = i.i(cVar2.f152788a);
                        BaseDelegatesActivity baseDelegatesActivityF = i.f(cVar2.f152788a);
                        g gVarO2 = dVar2.f152806b.o();
                        s.j(gVarO2);
                        dVar = new npi.c(contextI, baseDelegatesActivityF, gVarO2);
                        return dVar;
                    case 9:
                        iVar = new en.c(ImmutableSet.of((ln.d) cVar2.f152789b.f152811l.get()), i.l(cVar2.f152788a));
                        return iVar;
                    case 10:
                        dVar = new gn.c((lpi.e) cVar2.f152795m.get(), (sm.e) dVar2.o.get(), ImmutableSet.copyOf((Collection) gn.e.a()), dVar2.a());
                        return dVar;
                    case 11:
                        iVar = new lpi.b(i.i(cVar2.f152788a), i.j(cVar2.f152788a));
                        return iVar;
                    case 12:
                        cVar2.getClass();
                        dVar = new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) dVar2.f152814p.get(), dVar2.a());
                        return dVar;
                    case 13:
                        return f.a();
                    case 14:
                        iVar = new h(i.b(cVar2.f152788a));
                        return iVar;
                    case 15:
                        dVar = new iri.g((j) dVar2.f152809h.get(), (m) dVar2.f152815q.get(), i.f(cVar2.f152788a), i.l(cVar2.f152788a));
                        return dVar;
                    case 16:
                        dVar = new l((m) dVar2.f152815q.get(), i.f(cVar2.f152788a), (iri.d) cVar2.f152800s.get());
                        return dVar;
                    case 17:
                        iVar = new iri.d(i.f(cVar2.f152788a));
                        return iVar;
                    case 18:
                        iVar = new opi.b(i.f(cVar2.f152788a));
                        return iVar;
                    case 19:
                        cVar2.getClass();
                        iVar = new xpi.c(xpi.f.f307976c, i.b(cVar2.f152788a));
                        return iVar;
                    case 20:
                        iVar = new k3l.d(i.b(cVar2.f152788a));
                        return iVar;
                    case 21:
                        gjg.a aVar2 = (gjg.a) dVar2.f152816r.get();
                        qjg.b bVar = (qjg.b) cVar2.f152803x.get();
                        gjg.b bVar2 = (gjg.b) dVar2.f152817s.get();
                        tpi.j jVar = (tpi.j) cVar2.f152792h.get();
                        f9b.f fVar3 = (f9b.f) cVar2.d.get();
                        opi.d dVar4 = (opi.d) cVar2.u.get();
                        k3l.b bVar3 = (k3l.b) cVar2.f152802w.get();
                        xpi.g gVar = (xpi.g) cVar2.v.get();
                        xig.b bVar4 = (xig.b) dVar2.f152807c.o.get();
                        s.j(bVar4);
                        dVar = new qjg.n(aVar2, bVar, bVar2, jVar, fVar3, dVar4, bVar3, gVar, bVar4);
                        return dVar;
                    case 22:
                        thf.c cVarC = dVar2.e.c();
                        s.j(cVarC);
                        return new qjg.g(cVarC);
                    default:
                        throw new AssertionError(i);
                }
            case 1:
                hm1.d dVar5 = (hm1.d) this.f152787c;
                hm1.c cVar4 = (hm1.c) this.d;
                BillerSearchNavigation$InputData billerSearchNavigation$InputData = cVar4.f153495a;
                int i2 = this.f152786b;
                if (i2 == 0) {
                    return new lm1.j(billerSearchNavigation$InputData, (cli.n) cVar4.f153496b.get(), (mm1.b) cVar4.f153497c.get());
                }
                if (i2 == 1) {
                    return new lm1.k();
                }
                if (i2 == 2) {
                    return new mm1.c(billerSearchNavigation$InputData, new yk0.d(), (im1.a) dVar5.f.get());
                }
                throw new AssertionError(i2);
            case 2:
                hm1.d dVar6 = (hm1.d) this.f152787c;
                hm1.f fVar4 = (hm1.f) this.d;
                int i3 = this.f152786b;
                if (i3 == 0) {
                    return kxa.j.k((j60.a) fVar4.d.get());
                }
                if (i3 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) fVar4.f153504b.get(), (rp0.m) fVar4.f153505c.get());
                }
                if (i3 == 2) {
                    return new rp0.m();
                }
                if (i3 == 3) {
                    return new km1.j(fVar4.f153503a, (im1.a) dVar6.f.get(), (cli.n) fVar4.f.get());
                }
                if (i3 != 4) {
                    throw new AssertionError(i3);
                }
                l80.e eVarH = dVar6.f153499b.h();
                s.j(eVarH);
                return new km1.i(eVarH);
            case 3:
                hvf.f fVar5 = (hvf.f) this.d;
                int i5 = this.f152786b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return new hwf.h(new nvf.c(new nvf.o(fVar5.f155899a.f155943c.d()), new ruf.k(), new nvf.a()));
                    }
                    throw new AssertionError(i5);
                }
                ouf.a aVarA = ((hvf.b) ((hvf.q) this.f152787c).f155941a).a();
                s.j(aVarA);
                return new hwf.g(aVarA, (cli.n) fVar5.f155900b.get());
            case 4:
                hvf.h hVar2 = (hvf.h) this.d;
                int i6 = this.f152786b;
                if (i6 == 0) {
                    return kxa.j.j((j60.a) hVar2.e.get());
                }
                if (i6 == 1) {
                    return v1.c.r((com.revolut.kompot.navigable.a) hVar2.f155908c.get(), (rp0.m) hVar2.d.get());
                }
                if (i6 == 2) {
                    return new rp0.m();
                }
                if (i6 == 3) {
                    ywf.g gVar2 = new ywf.g();
                    nvf.i iVar2 = new nvf.i();
                    j60.a aVar3 = (j60.a) hVar2.e.get();
                    l80.e eVarH2 = ((hvf.q) this.f152787c).f155943c.h();
                    s.j(eVarH2);
                    aVar = new com.revolut.feature.transport.impl.ui.transit_checkout.fields.a(gVar2, iVar2, aVar3, eVarH2);
                } else {
                    if (i6 != 4) {
                        if (i6 == 5) {
                            return new tyc.l(new nvf.i());
                        }
                        throw new AssertionError(i6);
                    }
                    aVar = new uwf.l((swf.b) hVar2.f155909g.get(), (cli.n) hVar2.f155910h.get(), hVar2.f155906a);
                }
                return aVar;
            case 5:
                hvf.q qVar = (hvf.q) this.f152787c;
                hvf.i iVar3 = (hvf.i) this.d;
                int i21 = this.f152786b;
                if (i21 == 0) {
                    jvf.f extension = (jvf.f) iVar3.f155913c.get();
                    kvf.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    jvf.f fVar6 = extension;
                    s.k(fVar6);
                    return fVar6;
                }
                if (i21 == 1) {
                    l80.e eVarH3 = qVar.f155943c.h();
                    s.j(eVarH3);
                    fVar = new jvf.f(eVarH3);
                } else {
                    if (i21 == 2) {
                        jvf.c extension2 = (jvf.c) iVar3.e.get();
                        kvf.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        jvf.c cVar5 = extension2;
                        s.k(cVar5);
                        return cVar5;
                    }
                    if (i21 != 3) {
                        if (i21 == 4) {
                            return new pwf.g(iVar3.f155911a, (jvf.c) iVar3.e.get(), new pwf.h());
                        }
                        throw new AssertionError(i21);
                    }
                    ouf.a aVarA2 = ((hvf.b) qVar.f155941a).a();
                    s.j(aVarA2);
                    fVar = new jvf.c(aVarA2);
                }
                return fVar;
            case 6:
                hvf.q qVar2 = (hvf.q) this.f152787c;
                hvf.j jVar2 = (hvf.j) this.d;
                int i22 = this.f152786b;
                switch (i22) {
                    case 0:
                        return kxa.j.s((j60.a) jVar2.e.get());
                    case 1:
                        return kxa.j.q((com.revolut.kompot.navigable.a) jVar2.f155917c.get(), (rp0.m) jVar2.d.get(), new j60.e());
                    case 2:
                        return new rp0.m();
                    case 3:
                        Object extension3 = (wwf.e) jVar2.f155918g.get();
                        xwf.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        yji.n nVar = (yji.n) extension3;
                        s.k(nVar);
                        return nVar;
                    case 4:
                        ouf.a aVarA3 = ((hvf.b) qVar2.f155941a).a();
                        s.j(aVarA3);
                        twf.a aVar4 = new twf.a();
                        l80.e eVarH4 = qVar2.f155943c.h();
                        s.j(eVarH4);
                        return new wwf.o(aVarA3, aVar4, eVarH4);
                    case 5:
                        jvf.f extension4 = (jvf.f) jVar2.i.get();
                        kvf.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension4, "extension");
                        jvf.f fVar7 = extension4;
                        s.k(fVar7);
                        return fVar7;
                    case 6:
                        l80.e eVarH5 = qVar2.f155943c.h();
                        s.j(eVarH5);
                        return new jvf.f(eVarH5);
                    case 7:
                        jvf.c extension5 = (jvf.c) jVar2.k.get();
                        kvf.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension5, "extension");
                        jvf.c cVar6 = extension5;
                        s.k(cVar6);
                        return cVar6;
                    case 8:
                        ouf.a aVarA4 = ((hvf.b) qVar2.f155941a).a();
                        s.j(aVarA4);
                        return new jvf.c(aVarA4);
                    case 9:
                        ywf.g gVar3 = new ywf.g();
                        nvf.i iVar4 = new nvf.i();
                        j60.a aVar5 = (j60.a) jVar2.e.get();
                        l80.e eVarH6 = qVar2.f155943c.h();
                        s.j(eVarH6);
                        return new com.revolut.feature.transport.impl.ui.transit_checkout.fields.a(gVar3, iVar4, aVar5, eVarH6);
                    case 10:
                        TransitCheckoutScreenContract$InputData transitCheckoutScreenContract$InputData = jVar2.f155915a;
                        ouf.a aVarA5 = ((hvf.b) qVar2.f155941a).a();
                        s.j(aVarA5);
                        ivf.h hVar3 = new ivf.h(jVar2.f155916b.f155946j.e());
                        q7c.m mVarD = qVar2.f155946j.d();
                        s.j(mVarD);
                        swf.b bVar5 = (swf.b) jVar2.f155922m.get();
                        wwf.e eVar = (wwf.e) jVar2.f155918g.get();
                        jvf.c cVar7 = (jvf.c) jVar2.k.get();
                        j60.a aVar6 = (j60.a) jVar2.e.get();
                        wj0.a aVarI = ((nj0.d) qVar2.i).i();
                        s.j(aVarI);
                        return new qwf.z(transitCheckoutScreenContract$InputData, aVarA5, hVar3, mVarD, bVar5, eVar, cVar7, aVar6, aVarI, (jki.p) jVar2.f155923n.get());
                    case 11:
                        twf.a aVar7 = new twf.a();
                        jVar2.getClass();
                        nvf.g gVar4 = new nvf.g(new nvf.k());
                        nvf.i iVar5 = new nvf.i();
                        twf.e eVar2 = new twf.e();
                        twf.b bVar6 = new twf.b();
                        dec.r rVar = new dec.r();
                        dec.g gVar5 = new dec.g();
                        dec.a aVar8 = new dec.a();
                        l80.e eVarH7 = jVar2.f155916b.f155943c.h();
                        s.j(eVarH7);
                        return new qwf.a0(aVar7, gVar4, iVar5, eVar2, bVar6, new twf.d(new dec.q(rVar, gVar5, aVar8, eVarH7)));
                    default:
                        throw new AssertionError(i22);
                }
            case 7:
                hvf.k kVar = (hvf.k) this.d;
                int i32 = this.f152786b;
                if (i32 == 0) {
                    TransitSectionScreenContract$InputData transitSectionScreenContract$InputData = kVar.f155924a;
                    ouf.a aVarA6 = ((hvf.b) ((hvf.q) this.f152787c).f155941a).a();
                    s.j(aVarA6);
                    return new lwf.g(transitSectionScreenContract$InputData, aVarA6, (jki.p) kVar.f155926c.get());
                }
                if (i32 != 1) {
                    throw new AssertionError(i32);
                }
                nvf.h ticketMapper = new nvf.h();
                Intrinsics.checkNotNullParameter(ticketMapper, "ticketMapper");
                return new lwf.h();
            case 8:
                hvf.l lVar = (hvf.l) this.d;
                hvf.q qVar3 = (hvf.q) this.f152787c;
                int i33 = this.f152786b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new AssertionError(i33);
                    }
                    l80.e eVarH8 = qVar3.f155943c.h();
                    s.j(eVarH8);
                    return new jvf.f(eVarH8);
                }
                TransitTicketActivationFlowContract$InputData transitTicketActivationFlowContract$InputData = lVar.f155927a;
                ouf.a aVarA7 = ((hvf.b) qVar3.f155941a).a();
                s.j(aVarA7);
                jvf.f fVar8 = (jvf.f) lVar.f155928b.get();
                nvf.d dVar7 = new nvf.d();
                wj0.a aVarI2 = ((nj0.d) qVar3.i).i();
                s.j(aVarI2);
                return new com.revolut.feature.transport.impl.ui.activation.flow.a(transitTicketActivationFlowContract$InputData, aVarA7, fVar8, dVar7, aVarI2);
            case 9:
                hvf.q qVar4 = (hvf.q) this.f152787c;
                l70.e eVar3 = qVar4.f155943c;
                int i43 = this.f152786b;
                if (i43 != 0) {
                    if (i43 == 1) {
                        return new xvf.n();
                    }
                    throw new AssertionError(i43);
                }
                ouf.a aVarA8 = ((hvf.b) qVar4.f155941a).a();
                s.j(aVarA8);
                c70.a aVarZ = eVar3.z();
                s.j(aVarZ);
                l80.e eVarH9 = eVar3.h();
                s.j(eVarH9);
                return new xvf.m(aVarA8, aVarZ, eVarH9, (cli.n) ((hvf.n) this.d).f155933b.get());
            case 10:
                hvf.q qVar5 = (hvf.q) this.f152787c;
                hvf.r rVar2 = (hvf.r) this.d;
                int i59 = this.f152786b;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new AssertionError(i59);
                    }
                    cwf.c.Companion.getClass();
                    return new cwf.a();
                }
                TransportHubFlowContract$InputData transportHubFlowContract$InputData = rVar2.f155950a;
                lvf.a aVar9 = (lvf.a) qVar5.f155948m.get();
                ouf.a aVarA9 = ((hvf.b) qVar5.f155941a).a();
                s.j(aVarA9);
                return new com.revolut.feature.transport.impl.ui.hub.a(transportHubFlowContract$InputData, aVar9, aVarA9, (cwf.a) rVar2.d.get(), new bwf.s());
            case 11:
                hvf.q qVar6 = (hvf.q) this.f152787c;
                hvf.s sVar = (hvf.s) this.d;
                int i66 = this.f152786b;
                switch (i66) {
                    case 0:
                        Object extension6 = (rvf.a) sVar.f.get();
                        svf.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension6, "extension");
                        yji.d dVar8 = (yji.d) extension6;
                        s.k(dVar8);
                        return dVar8;
                    case 1:
                        return new rvf.c((j60.a) sVar.d.get(), (rvf.d) sVar.e.get());
                    case 2:
                        BaseScreen screen = sVar.f155953a;
                        he2.b dialogHostFinder = ehe.n.r();
                        svf.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                        cVar = new j60.c(screen, new rp0.m(), dialogHostFinder);
                        return cVar;
                    case 3:
                        ouf.a aVarA10 = ((hvf.b) qVar6.f155941a).a();
                        s.j(aVarA10);
                        sf0.h hVarB = qVar6.d.b();
                        s.j(hVarB);
                        v60.e eVarA = qVar6.e.a();
                        s.j(eVarA);
                        cVar = new rvf.i(aVarA10, hVarB, eVarA, (j60.a) sVar.d.get());
                        return cVar;
                    case 4:
                        Object impl = (j60.a) sVar.d.get();
                        svf.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(impl, "impl");
                        yji.d dVar9 = (yji.d) impl;
                        s.k(dVar9);
                        return dVar9;
                    case 5:
                        Object extension7 = (rvf.d) sVar.e.get();
                        svf.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension7, "extension");
                        yji.n nVar2 = (yji.n) extension7;
                        s.k(nVar2);
                        return nVar2;
                    case 6:
                        jvf.f extension8 = (jvf.f) sVar.f155958j.get();
                        kvf.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension8, "extension");
                        jvf.f fVar9 = extension8;
                        s.k(fVar9);
                        return fVar9;
                    case 7:
                        l80.e eVarH10 = qVar6.f155943c.h();
                        s.j(eVarH10);
                        fVar2 = new jvf.f(eVarH10);
                        return fVar2;
                    case 8:
                        jvf.c extension9 = (jvf.c) sVar.f155959l.get();
                        kvf.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension9, "extension");
                        jvf.c cVar8 = extension9;
                        s.k(cVar8);
                        return cVar8;
                    case 9:
                        ouf.a aVarA11 = ((hvf.b) qVar6.f155941a).a();
                        s.j(aVarA11);
                        fVar2 = new jvf.c(aVarA11);
                        return fVar2;
                    case 10:
                        TransportHubTicketsScreenContract$InputData transportHubTicketsScreenContract$InputData = sVar.f155954b;
                        ouf.a aVarA12 = ((hvf.b) qVar6.f155941a).a();
                        s.j(aVarA12);
                        rvf.d dVar10 = (rvf.d) sVar.e.get();
                        jvf.c cVar9 = (jvf.c) sVar.f155959l.get();
                        hvf.q qVar7 = sVar.f155955c;
                        l70.e eVar4 = qVar7.f155943c;
                        z70.a aVarF = eVar4.f();
                        s.j(aVarF);
                        y80.a aVarR = eVar4.r();
                        s.j(aVarR);
                        l80.e eVarH11 = eVar4.h();
                        s.j(eVarH11);
                        Context context = qVar7.f;
                        s70.a aVarM = eVar4.m();
                        s.j(aVarM);
                        pvf.c cVar10 = new pvf.c(aVarF, aVarR, eVarH11, new pvf.b(context, aVarM), (ue0.c) qVar7.o.get());
                        l80.e eVarH12 = qVar6.f155943c.h();
                        s.j(eVarH12);
                        return new fwf.m(transportHubTicketsScreenContract$InputData, aVarA12, dVar10, cVar9, cVar10, eVarH12, (jki.p) sVar.f155961n.get());
                    case 11:
                        return new fwf.u(new nvf.c(new nvf.o(sVar.f155955c.f155943c.d()), new ruf.k(), new nvf.a()), new nvf.l());
                    default:
                        throw new AssertionError(i66);
                }
            case 12:
                hvf.q qVar8 = (hvf.q) this.f152787c;
                hvf.u uVar = (hvf.u) this.d;
                int i74 = this.f152786b;
                if (i74 == 0) {
                    n60.a aVar10 = (n60.a) uVar.f155967c.get();
                    o5k.i.k(aVar10);
                    return aVar10;
                }
                if (i74 == 1) {
                    return o5k.i.p((com.revolut.kompot.navigable.a) uVar.f155966b.get());
                }
                if (i74 != 2) {
                    if (i74 == 3) {
                        return new nwf.m();
                    }
                    throw new AssertionError(i74);
                }
                ouf.a aVarA13 = ((hvf.b) qVar8.f155941a).a();
                s.j(aVarA13);
                return new nwf.l(aVarA13, (lvf.a) qVar8.f155948m.get(), (n60.a) uVar.f155967c.get(), (jki.p) uVar.e.get());
            case 13:
                hvf.q qVar9 = (hvf.q) this.f152787c;
                int i92 = this.f152786b;
                if (i92 != 0) {
                    if (i92 == 1) {
                        return new owf.n();
                    }
                    throw new AssertionError(i92);
                }
                ouf.a aVarA14 = ((hvf.b) qVar9.f155941a).a();
                s.j(aVarA14);
                hk0.a aVarJ = ((nj0.d) qVar9.i).j();
                hvf.v vVar = (hvf.v) this.d;
                return new owf.m(aVarA14, aVarJ, vVar.f155968a, (cli.n) vVar.f155970c.get());
            case 14:
                hvf.q qVar10 = (hvf.q) this.f152787c;
                x xVar = (x) this.d;
                int i96 = this.f152786b;
                switch (i96) {
                    case 0:
                        Object extension10 = (rvf.a) xVar.f155977g.get();
                        svf.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension10, "extension");
                        yji.d dVar11 = (yji.d) extension10;
                        s.k(dVar11);
                        return dVar11;
                    case 1:
                        return new rvf.c((j60.a) xVar.e.get(), (rvf.d) xVar.f.get());
                    case 2:
                        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) xVar.d.get();
                        he2.b dialogHostFinder2 = ehe.n.r();
                        svf.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        Intrinsics.checkNotNullParameter(dialogHostFinder2, "dialogHostFinder");
                        return new j60.c(controller, new rp0.m(), dialogHostFinder2);
                    case 3:
                        ouf.a aVarA15 = ((hvf.b) qVar10.f155941a).a();
                        s.j(aVarA15);
                        sf0.h hVarB2 = qVar10.d.b();
                        s.j(hVarB2);
                        v60.e eVarA2 = qVar10.e.a();
                        s.j(eVarA2);
                        return new rvf.i(aVarA15, hVarB2, eVarA2, (j60.a) xVar.e.get());
                    case 4:
                        Object impl2 = (j60.a) xVar.e.get();
                        svf.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(impl2, "impl");
                        yji.d dVar12 = (yji.d) impl2;
                        s.k(dVar12);
                        return dVar12;
                    case 5:
                        Object extension11 = (rvf.d) xVar.f.get();
                        svf.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension11, "extension");
                        yji.n nVar3 = (yji.n) extension11;
                        s.k(nVar3);
                        return nVar3;
                    case 6:
                        jvf.f extension12 = (jvf.f) xVar.k.get();
                        kvf.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension12, "extension");
                        jvf.f fVar10 = extension12;
                        s.k(fVar10);
                        return fVar10;
                    case 7:
                        l80.e eVarH13 = qVar10.f155943c.h();
                        s.j(eVarH13);
                        return new jvf.f(eVarH13);
                    case 8:
                        jvf.c extension13 = (jvf.c) xVar.f155981m.get();
                        kvf.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension13, "extension");
                        jvf.c cVar11 = extension13;
                        s.k(cVar11);
                        return cVar11;
                    case 9:
                        ouf.a aVarA16 = ((hvf.b) qVar10.f155941a).a();
                        s.j(aVarA16);
                        return new jvf.c(aVarA16);
                    case 10:
                        ouf.a aVarA17 = ((hvf.b) qVar10.f155941a).a();
                        s.j(aVarA17);
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) qVar10.f155944g).c();
                        s.j(aVarC);
                        rvf.d dVar13 = (rvf.d) xVar.f.get();
                        jvf.c cVar12 = (jvf.c) xVar.f155981m.get();
                        ouf.a aVarA18 = ((hvf.b) xVar.f155976c.f155941a).a();
                        s.j(aVarA18);
                        ivf.e eVar5 = new ivf.e(aVarA18);
                        l80.e eVarH14 = qVar10.f155943c.h();
                        s.j(eVarH14);
                        return new com.revolut.feature.transport.impl.ui.hub.ticket_details.b(aVarA17, aVarC, dVar13, cVar12, eVar5, eVarH14, xVar.f155975b, (cli.n) xVar.o.get());
                    case 11:
                        thf.g gVarE = qVar10.f155945h.e();
                        s.j(gVarE);
                        xVar.getClass();
                        return new dwf.o(gVarE, new nvf.g(new nvf.k()), new nvf.k(), new nvf.a(), new nvf.o(xVar.f155976c.f155943c.d()), new ruf.k(), new nvf.l());
                    default:
                        throw new AssertionError(i96);
                }
            case 15:
                hvf.q qVar11 = (hvf.q) this.f152787c;
                x xVar2 = (x) this.d;
                int i99 = this.f152786b;
                switch (i99) {
                    case 0:
                        Object extension14 = (rvf.a) xVar2.f155977g.get();
                        svf.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension14, "extension");
                        yji.d dVar14 = (yji.d) extension14;
                        s.k(dVar14);
                        return dVar14;
                    case 1:
                        return new rvf.c((j60.a) xVar2.e.get(), (rvf.d) xVar2.f.get());
                    case 2:
                        com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) xVar2.d.get();
                        he2.b dialogHostFinder3 = ehe.n.r();
                        svf.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        Intrinsics.checkNotNullParameter(dialogHostFinder3, "dialogHostFinder");
                        return new j60.c(controller2, new rp0.m(), dialogHostFinder3);
                    case 3:
                        ouf.a aVarA19 = ((hvf.b) qVar11.f155941a).a();
                        s.j(aVarA19);
                        sf0.h hVarB3 = qVar11.d.b();
                        s.j(hVarB3);
                        v60.e eVarA3 = qVar11.e.a();
                        s.j(eVarA3);
                        return new rvf.i(aVarA19, hVarB3, eVarA3, (j60.a) xVar2.e.get());
                    case 4:
                        Object impl3 = (j60.a) xVar2.e.get();
                        svf.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(impl3, "impl");
                        yji.d dVar15 = (yji.d) impl3;
                        s.k(dVar15);
                        return dVar15;
                    case 5:
                        Object extension15 = (rvf.d) xVar2.f.get();
                        svf.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension15, "extension");
                        yji.n nVar4 = (yji.n) extension15;
                        s.k(nVar4);
                        return nVar4;
                    case 6:
                        jvf.f extension16 = (jvf.f) xVar2.k.get();
                        kvf.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension16, "extension");
                        jvf.f fVar11 = extension16;
                        s.k(fVar11);
                        return fVar11;
                    case 7:
                        l80.e eVarH15 = qVar11.f155943c.h();
                        s.j(eVarH15);
                        return new jvf.f(eVarH15);
                    case 8:
                        jvf.c extension17 = (jvf.c) xVar2.f155981m.get();
                        kvf.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension17, "extension");
                        jvf.c cVar13 = extension17;
                        s.k(cVar13);
                        return cVar13;
                    case 9:
                        ouf.a aVarA20 = ((hvf.b) qVar11.f155941a).a();
                        s.j(aVarA20);
                        return new jvf.c(aVarA20);
                    case 10:
                        ouf.a aVarA21 = ((hvf.b) qVar11.f155941a).a();
                        s.j(aVarA21);
                        com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) qVar11.f155944g).c();
                        s.j(aVarC2);
                        rvf.d dVar16 = (rvf.d) xVar2.f.get();
                        jvf.c cVar14 = (jvf.c) xVar2.f155981m.get();
                        ouf.a aVarA22 = ((hvf.b) xVar2.f155976c.f155941a).a();
                        s.j(aVarA22);
                        ivf.e eVar6 = new ivf.e(aVarA22);
                        l80.e eVarH16 = qVar11.f155943c.h();
                        s.j(eVarH16);
                        return new com.revolut.feature.transport.impl.ui.hub.ticket_details.b(aVarA21, aVarC2, dVar16, cVar14, eVar6, eVarH16, xVar2.f155975b, (cli.n) xVar2.o.get());
                    case 11:
                        thf.g gVarE2 = qVar11.f155945h.e();
                        s.j(gVarE2);
                        xVar2.getClass();
                        return new dwf.o(gVarE2, new nvf.g(new nvf.k()), new nvf.k(), new nvf.a(), new nvf.o(xVar2.f155976c.f155943c.d()), new ruf.k(), new nvf.l());
                    default:
                        throw new AssertionError(i99);
                }
            case 16:
                hy8.a aVar11 = (hy8.a) this.d;
                UaePassScreenContract$InputData inputData = aVar11.f156757a;
                hy8.b bVar7 = (hy8.b) this.f152787c;
                l70.e eVar7 = bVar7.f156761b;
                int i100 = this.f152786b;
                if (i100 == 0) {
                    zjh.i iVar6 = new zjh.i(aVar11.f156758b.f156762c.b());
                    om0.b bVarC = bVar7.d.c();
                    s.j(bVarC);
                    jy8.b.Companion.getClass();
                    by8.a aVar12 = new by8.a(false);
                    y80.a aVarR2 = eVar7.r();
                    s.j(aVarR2);
                    return new yx8.c(iVar6, bVarC, aVar12, aVarR2);
                }
                if (i100 != 1) {
                    if (i100 != 2) {
                        throw new AssertionError(i100);
                    }
                    jy8.b.Companion.getClass();
                    return new jy8.a();
                }
                iy8.p pVar = new iy8.p();
                yx8.a aVar13 = (yx8.a) aVar11.f156759c.get();
                jy8.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                iy8.d dVar17 = new iy8.d(inputData.f77915a.f77910c);
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                UaePassFlowConfiguration uaePassFlowConfiguration = inputData.f77915a;
                s.k(uaePassFlowConfiguration);
                iy8.r rVar3 = new iy8.r(uaePassFlowConfiguration);
                yp.b appStoreNavigationFactory = bVar7.e.a();
                Intrinsics.checkNotNullParameter(appStoreNavigationFactory, "appStoreNavigationFactory");
                xx8.a bVar8 = od0.a.c() == od0.l.MOCK ? xx8.d.f309408a : new xx8.b(appStoreNavigationFactory);
                xx8.f fVar12 = bVar7.f156760a;
                z70.a aVarF2 = eVar7.f();
                s.j(aVarF2);
                xx8.e eVarR = xhi.f.r(fVar12, aVarF2);
                wx8.b bVar9 = (wx8.b) bVar7.f156762c.f283910c.get();
                s.j(bVar9);
                return new iy8.o(pVar, aVar13, dVar17, rVar3, bVar8, eVarR, bVar9);
            case 17:
                return a();
            case 18:
                return b();
            case 19:
                return c();
            case 20:
                i15.e eVar8 = (i15.e) this.d;
                int i101 = this.f152786b;
                if (i101 != 0) {
                    if (i101 == 1) {
                        return new s15.m();
                    }
                    throw new AssertionError(i101);
                }
                wli.x xVarD = ((s41.a) ((i15.d) this.f152787c).f157557c).d();
                FinancialDifficultiesControllerContract$InputData financialDifficultiesControllerContract$InputData = eVar8.f157565a;
                i15.d dVar18 = eVar8.f157566b;
                p15.b bVar10 = new p15.b((CreditHelpService) dVar18.o.get(), (ne0.j) dVar18.i.get(), (ue0.c) dVar18.f157564p.get());
                xq3.j jVarH = dVar18.f157555a.h();
                s.j(jVarH);
                return new s15.l(xVarD, financialDifficultiesControllerContract$InputData, new k15.d(bVar10, jVarH, dVar18.f157556b.e()), (cli.n) eVar8.f157567c.get());
            case 21:
                i15.f fVar13 = (i15.f) this.d;
                int i102 = this.f152786b;
                if (i102 != 0) {
                    if (i102 == 1) {
                        return new r15.o();
                    }
                    throw new AssertionError(i102);
                }
                wli.x xVarD2 = ((s41.a) ((i15.d) this.f152787c).f157557c).d();
                i15.d dVar19 = fVar13.f157568a;
                p15.b bVar11 = new p15.b((CreditHelpService) dVar19.o.get(), (ne0.j) dVar19.i.get(), (ue0.c) dVar19.f157564p.get());
                xq3.j jVarH2 = dVar19.f157555a.h();
                s.j(jVarH2);
                return new r15.n(xVarD2, new k15.d(bVar11, jVarH2, dVar19.f157556b.e()), (jki.p) fVar13.f157569b.get());
            case 22:
                return d();
            case 23:
                return e();
            case 24:
                return f();
            case 25:
                return g();
            case 26:
                return h();
            case 27:
                return i();
            case 28:
                return j();
            default:
                i9e.g gVar6 = (i9e.g) this.d;
                int i103 = this.f152786b;
                if (i103 != 0) {
                    if (i103 == 1) {
                        return new k9e.j();
                    }
                    throw new AssertionError(i103);
                }
                jki.p pVar2 = (jki.p) gVar6.f159676b.get();
                AcceptConditionsScreenContract$InputData acceptConditionsScreenContract$InputData = gVar6.f159675a;
                xua.a aVarA23 = ((i9e.o) this.f152787c).f159703b.a();
                s.j(aVarA23);
                return new k9e.i(pVar2, acceptConditionsScreenContract$InputData, aVarA23);
        }
    }
}
