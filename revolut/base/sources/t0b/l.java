package t0b;

import aa0.y;
import ad0.p;
import ad0.t;
import ad0.w;
import an.q;
import android.app.Activity;
import android.content.Context;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultRegistry;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_screen.impl.prompts.location_security.AskLocationSecurityPromptScreenContract$InputData;
import com.revolut.feature.card_screen.impl.prompts.switch_to_credit_card.SwitchToNewCreditCardPromptScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.backendflow.CreditBackendFlowContract$Configuration;
import com.revolut.feature.credit.impl.ui.entry_points.CreditEntryPointsControllerContract$InputData;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFees;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode;
import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.country.screen.CountryResidenceScreenContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.risk_check.RiskCheckScreenContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.WaitingListAwaitingScreenContract$InputData;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestActionNavigation$InputData;
import com.revolut.feature.paynow.impl.screens.qr.PayNowQrScreenContract$InputData;
import com.revolut.feature.retail.advanced_charts.api.extension.AdvancedChartExtensionContract$InputData;
import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import com.revolut.feature.retail.advanced_charts.models.ChartTimeFrameDisplayType;
import com.revolut.feature.retail.advanced_charts.models.LockPolicy;
import com.revolut.feature.retail.advanced_charts.models.OverlayPolicy;
import com.revolut.feature.trade_rev_points.impl.data.network.TradeRevPointsService;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.TradeRevPointsAgentDetailsScreenContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.voucher.TradeRevPointsAgentAllVouchersScreenContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.TradeRevPointsTransferScreenContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.screen.unlinking.TradeRevPointsAccountUnlinkingScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.MoneyRequestDetailsContract$InputData;
import dw3.c1;
import e2f.j0;
import fb7.i0;
import fb7.k0;
import ish.a0;
import java.util.Collection;
import kl.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import lu7.m0;
import m2f.e0;
import qc0.i1;
import qgk.k3;
import qw7.u;
import rp0.l0;
import t80.v;
import ta9.z;
import tf1.d0;
import ts6.z0;
import vc.s;
import vtc.p0;
import wli.x;
import yc0.c0;
import yc0.f0;
import yc0.r;
import zc0.y2;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f266977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f266978c;
    public final Object d;

    public /* synthetic */ l(Object obj2, Object obj3, int i, int i2) {
        this.f266976a = i2;
        this.f266978c = obj2;
        this.d = obj3;
        this.f266977b = i;
    }

    private final Object a() {
        t64.c cVar = (t64.c) this.f266978c;
        t64.b bVar = (t64.b) this.d;
        int i = this.f266977b;
        switch (i) {
            case 0:
                bVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) cVar.f268224q.get(), cVar.k());
            case 1:
                um.c cVar2 = (um.c) cVar.f268225r.get();
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                t64.c cVar3 = bVar.f268192g;
                hn.h hVar = (hn.h) cVar3.f268227s.get();
                t70.g gVarO = cVar3.f268208b.o();
                s.j(gVarO);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(cVar3.l());
                builderBuilderWithExpectedSize.add(new xc0.a((qc0.j) cVar3.f268209b0.get(), (qc0.h) cVar3.Y.get()));
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(bVar.i)));
                return new in.e(cVar2, builderBuilderWithExpectedSize.build(), cVar.k());
            case 2:
                return bq.i.t(bVar.f268187a);
            case 3:
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(bVar.k.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(bVar.f268196m)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) cVar.S.get(), cVar.k());
            case 4:
                return new zm.a();
            case 5:
                return new tpi.i((rpi.c) bVar.f268195l.get(), gsi.c.a(bVar.f268187a));
            case 6:
                return new rpi.b(bq.i.b(bVar.f268187a));
            case 7:
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(bVar.f268192g.l());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) cVar.f268227s.get(), (npi.f) bVar.o.get());
            case 8:
                Context contextI = bq.i.i(bVar.f268187a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(bVar.f268187a);
                t70.g gVarO2 = cVar.f268208b.o();
                s.j(gVarO2);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO2);
            case 9:
                t64.c cVar4 = bVar.f268192g;
                return new en.c(ImmutableSet.of((ln.d) cVar4.f268217k0.get(), (ln.d) cVar4.f268229t.get()), bq.i.l(bVar.f268187a));
            case 10:
                return new gn.c((lpi.e) bVar.f268200r.get(), (sm.e) cVar.l0.get(), ImmutableSet.copyOf((Collection) gn.e.a()), cVar.k());
            case 11:
                return new lpi.b(bq.i.i(bVar.f268187a), bq.i.j(bVar.f268187a));
            case 12:
                bVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) cVar.m0.get(), cVar.k());
            case 13:
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                t64.c cVar5 = bVar.f268192g;
                builderBuilderWithExpectedSize4.add(new wc0.a((qc0.k) cVar5.u.get(), ((s41.a) cVar5.i).d(), (ln.a) cVar5.f268229t.get(), (qc0.j) cVar5.f268209b0.get(), u.i(cVar5.f), cVar5.h()));
                return new g3l.c(builderBuilderWithExpectedSize4.build(), (g3l.g) cVar.f268221n0.get(), (k3l.b) bVar.u.get(), cVar.k());
            case 14:
                return new k3l.d(bq.i.b(bVar.f268187a));
            case 15:
                ypi.h hVar2 = bVar.f268189b;
                fsi.g gVar = bVar.f268187a;
                return new ypi.e(hVar2, bq.i.b(gVar), bq.i.o(gVar), bq.i.g(gVar));
            case 16:
                return new hqi.f(bVar.f268191c, bq.i.b(bVar.f268187a));
            case 17:
                return new rpi.h(bq.i.b(bVar.f268187a));
            case 18:
                return new iri.g((iri.j) cVar.f268223p.get(), (iri.m) cVar.u.get(), bq.i.f(bVar.f268187a), bq.i.l(bVar.f268187a));
            case 19:
                return new iri.l((iri.m) cVar.u.get(), bq.i.f(bVar.f268187a), (iri.d) bVar.A.get());
            case 20:
                return new iri.d(bq.i.f(bVar.f268187a));
            case 21:
                return new q((cqi.h) bVar.C.get(), (an.a) cVar.f268222o0.get(), ImmutableSet.copyOf((Collection) bn.b.a()), cVar.k());
            case 22:
                return new cqi.j(bq.i.f(bVar.f268187a));
            case 23:
                return new xpi.c(bVar.d, bq.i.b(bVar.f268187a));
            case 24:
                return new com.revolut.retail.toast.mediator.a((d4l.a) cVar.p0.get(), (c4l.b) bVar.F.get());
            case 25:
                return new c4l.e(bq.i.i(bVar.f268187a), bq.i.g(bVar.f268187a));
            case 26:
                return new f5l.c((f5l.a) cVar.q0.get(), bq.i.b(bVar.f268187a));
            case 27:
                Activity activityB = bq.i.b(bVar.f268187a);
                y80.b bVar2 = new y80.b();
                g60.a aVar = (g60.a) bVar.I.get();
                fsi.g gVar2 = bVar.f268187a;
                Activity activityB2 = bq.i.b(gVar2);
                t80.g gVar3 = (t80.g) bVar.J.get();
                BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(gVar2);
                d4m.a aVarA = e4m.b.a(bVar.K);
                nli.a aVarG = bVar.g();
                t80.g gVar4 = (t80.g) bVar.J.get();
                l70.e eVar = bVar.f268192g.f268208b;
                zk0.b bVarL = eVar.l();
                s.j(bVarL);
                oli.c cVar6 = new oli.c(gVar4, bVarL, bVar.g(), (g60.a) bVar.I.get(), bVar.h());
                ComponentActivity componentActivityA = gmf.b.a(gVar2);
                ActivityResultRegistry activityResultRegistryA = pli.b.a(gmf.b.a(gVar2));
                ami.n nVar = new ami.n(e4m.b.a(bVar.L), 1);
                d4m.a aVarA2 = e4m.b.a(bVar.K);
                t80.g gVar5 = (t80.g) bVar.J.get();
                nli.a aVarG2 = bVar.g();
                i90.b bVar3 = new i90.b();
                z70.a aVarF = eVar.f();
                s.j(aVarF);
                c70.b bVar4 = new c70.b(aVarF, 2);
                z70.a aVarF2 = eVar.f();
                s.j(aVarF2);
                return new upi.b(activityB, bVar2, new v(aVar, activityB2, gVar3, baseDelegatesActivityF2, aVarA, aVarG, cVar6, new oli.g(componentActivityA, activityResultRegistryA, nVar, aVarA2, gVar5, aVarG2, bVar3, new u96.b(bVar4, new smd.s(aVarF2)), bVar.h()), bVar.h()));
            case 28:
                return new g60.a(bq.i.b(bVar.f268187a));
            case 29:
                l70.e eVar2 = cVar.f268208b;
                l70.e eVar3 = cVar.f268208b;
                f80.a aVarX = eVar2.x();
                s.j(aVarX);
                l80.e eVarH = eVar3.h();
                s.j(eVarH);
                zk0.b bVarL2 = eVar3.l();
                s.j(bVarL2);
                return new t80.b(aVarX, eVarH, bVarL2);
            case 30:
                return pli.c.a(new ks0.n(bq.i.f(bVar.f268187a)));
            case 31:
                return t96.a.a();
            case 32:
                return new aqi.d(bq.i.b(bVar.f268187a), new y80.b());
            case 33:
                return kpi.f.a();
            case 34:
                return new opi.b(bq.i.f(bVar.f268187a));
            case 35:
                return new iqi.b(bVar.e, bq.i.b(bVar.f268187a));
            case 36:
                fsi.g gVar6 = bVar.f268187a;
                fsi.g gVar7 = bVar.f268187a;
                c90.c cVarH = gmf.b.h(gVar6);
                CreditBackendFlowContract$Configuration creditBackendFlowContract$Configuration = bVar.f;
                kpi.c cVar7 = (kpi.c) bVar.O.get();
                rz3.c cVarG = ((c1) cVar.f268210c).g();
                s.j(cVarG);
                sri.m mVarL = bq.i.l(gVar7);
                qc0.h hVar3 = (qc0.h) cVar.Y.get();
                qc0.j jVar = (qc0.j) cVar.f268209b0.get();
                qc0.k kVar = (qc0.k) cVar.u.get();
                ypi.i iVar = (ypi.i) bVar.f268203w.get();
                f9b.f fVar = (f9b.f) bVar.i.get();
                tpi.j jVar2 = (tpi.j) bVar.f268196m.get();
                hqi.l lVar = (hqi.l) bVar.f268204x.get();
                npi.a aVar2 = (npi.a) bVar.o.get();
                pri.f fVarD = bq.i.d(gVar7);
                k3l.b bVar5 = (k3l.b) bVar.u.get();
                xpi.g gVar8 = (xpi.g) bVar.E.get();
                rpi.c cVar8 = (rpi.c) bVar.f268195l.get();
                qc0.h hVar4 = (qc0.h) bVar.f268192g.Y.get();
                wpg.v.b(hVar4);
                ImmutableSet immutableSetOf = ImmutableSet.of(hVar4);
                mm.d dVar = (mm.d) cVar.Z.get();
                opi.d dVar2 = (opi.d) bVar.P.get();
                qd0.b bVarN = cVar.f268208b.n();
                s.j(bVarN);
                return new p54.j(cVarH, creditBackendFlowContract$Configuration, cVar7, cVarG, mVarL, hVar3, jVar, kVar, iVar, fVar, jVar2, lVar, aVar2, fVarD, bVar5, gVar8, cVar8, immutableSetOf, dVar, dVar2, bVarN);
            case 37:
                e4m.e eVar4 = cVar.Y;
                y90.e eVar5 = cVar.f268219m;
                zc0.g gVar9 = (zc0.g) eVar4.get();
                qc0.j jVar3 = (qc0.j) cVar.f268209b0.get();
                ypi.i iVar2 = (ypi.i) bVar.f268203w.get();
                t64.c cVar9 = bVar.f268192g;
                w80.b bVarJ = cVar9.f268208b.j();
                s.j(bVarJ);
                t70.g gVarO3 = cVar9.f268208b.o();
                s.j(gVarO3);
                zc0.c cVar10 = new zc0.c(bVarJ, gVarO3, (p80.a) bVar.S.get(), (y) cVar9.E.get(), bVar.f(), new yc0.j(new yc0.q(bVar.e()), bVar.e(), (yc0.g) cVar9.f268228s0.get(), (ad0.a) cVar9.R.get(), (p) bVar.X.get(), new yc0.p()), new yc0.o((yc0.g) cVar9.f268228s0.get()), (p) bVar.X.get(), (ad0.c) bVar.U.get(), new t(bVar.e(), new yc0.p()), new ad0.s(bVar.e(), new yc0.p()), new ad0.g(bVar.e()), new ad0.v(new yc0.q(bVar.e())), new ad0.o(), new yc0.q(bVar.e()), new yc0.p(), (yc0.y) cVar9.f268230t0.get(), (bd0.a) cVar9.u0.get(), (yc0.v) cVar9.f268231v0.get(), (c0) bVar.Y.get());
                npi.a aVar3 = (npi.a) bVar.o.get();
                xpi.g gVar10 = (xpi.g) bVar.E.get();
                k3l.b bVar6 = (k3l.b) bVar.u.get();
                rpi.c cVar11 = (rpi.c) bVar.f268195l.get();
                zd7.b bVar7 = (zd7.b) bVar.f268188a0.get();
                tpi.j jVar4 = (tpi.j) bVar.f268196m.get();
                opi.d dVar3 = (opi.d) bVar.P.get();
                cqi.h hVar5 = (cqi.h) bVar.C.get();
                i1 i1VarB = eVar5.b();
                s.j(i1VarB);
                oc0.f fVarC = eVar5.c();
                s.j(fVarC);
                fc0.f fVarD2 = eVar5.d();
                s.j(fVarD2);
                oc0.m mVarE = eVar5.e();
                s.j(mVarE);
                t9l.g gVarA = cVar.f268218l.a();
                s.j(gVarA);
                oc0.k kVarA = eVar5.a();
                s.j(kVarA);
                return new y2(hVar5, eVar5.f(), fVarD2, bVar6, aVar3, fVarC, kVarA, mVarE, dVar3, jVar3, i1VarB, cVar11, gVarA, jVar4, gVar10, iVar2, cVar10, gVar9, bVar7);
            case 38:
                Context context = bq.i.i(bVar.f268187a);
                t64.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new p80.a(context);
            case 39:
                x90.c cVar12 = cVar.d;
                yc0.q qVar = new yc0.q(bVar.e());
                r rVar = (r) bVar.T.get();
                ad0.c cVar13 = (ad0.c) bVar.U.get();
                w wVarG = cVar.f268219m.g();
                s.j(wVarG);
                f0 f0Var = (f0) bVar.V.get();
                ad0.h hVar6 = (ad0.h) bVar.W.get();
                ad0.n nVarF = bVar.f();
                u9l.a aVarB = cVar.f268218l.b();
                s.j(aVarB);
                return wpg.v.o(cVar12, qVar, rVar, cVar13, wVarG, f0Var, hVar6, nVarF, aVarB);
            case 40:
                return wpg.v.n(cVar.d, bVar.e(), new yc0.p());
            case 41:
                x90.c cVar14 = cVar.d;
                return new ad0.d();
            case 42:
                x90.c cVar15 = cVar.d;
                hbl.d dVarC = cVar.f268218l.c();
                s.j(dVarC);
                return wpg.v.y(cVar15, dVarC);
            case 43:
                return wpg.v.a(cVar.d, bVar.f());
            case 44:
                return wpg.v.w(cVar.d, (r) bVar.T.get(), new yc0.p());
            case 45:
                return new ae7.i((upi.f) bVar.M.get(), (t80.c) cVar.f268226r0.get(), (d4l.a) cVar.p0.get(), (aqi.a) bVar.Z.get(), new ae7.j(), bq.i.l(bVar.f268187a));
            case 46:
                return aqi.f.a(bVar.f268187a, (aqi.d) bVar.N.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        t83.c cVar = (t83.c) this.f266978c;
        t83.a aVar = (t83.a) this.d;
        int i = this.f266977b;
        if (i != 0) {
            if (i == 1) {
                return new u83.l();
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) aVar.f268813b.get();
        AskLocationSecurityPromptScreenContract$InputData askLocationSecurityPromptScreenContract$InputData = aVar.f268812a;
        l93.f fVarJ = cVar.f268818a.j();
        s.j(fVarJ);
        y80.a aVarR = cVar.f268819b.r();
        s.j(aVarR);
        return new u83.g(nVar, askLocationSecurityPromptScreenContract$InputData, fVarJ, aVarR);
    }

    private final Object c() {
        t83.e eVar = (t83.e) this.d;
        t83.c cVar = (t83.c) this.f266978c;
        da3.j jVar = cVar.f268818a;
        int i = this.f266977b;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            m93.g gVarI = jVar.i();
            s.j(gVarI);
            return new com.revolut.feature.card_screen.impl.prompts.switch_to_credit_card.c(gVarI);
        }
        cli.n nVar = (cli.n) eVar.f268825b.get();
        SwitchToNewCreditCardPromptScreenContract$InputData switchToNewCreditCardPromptScreenContract$InputData = eVar.f268824a;
        l93.f fVarJ = jVar.j();
        s.j(fVarJ);
        xua.a aVarA = cVar.f268820c.a();
        s.j(aVarA);
        return new com.revolut.feature.card_screen.impl.prompts.switch_to_credit_card.b(nVar, switchToNewCreditCardPromptScreenContract$InputData, fVarJ, aVarA);
    }

    private final Object d() {
        ta7.j jVar = (ta7.j) this.d;
        ta7.d dVar = jVar.f269138c;
        ta7.d dVar2 = (ta7.d) this.f266978c;
        ta7.a aVar = dVar2.f269119a;
        jge.j jVar2 = dVar2.f269120b;
        g2j.f fVar = dVar2.f269121c;
        int i = this.f266977b;
        if (i == 0) {
            return new i0(new a3e.u(new ib7.j(ImmutableMap.of("ACCOUNTS", (l) jVar.e, "BALANCE", (l) jVar.f), 0), new k0(), new ib7.l(), new ib7.n()), jVar.f269137b, new r10.t(ImmutableMap.of("ACCOUNTS", (l) jVar.f269139g), dVar.f269119a.i()), new dsh.h(ImmutableMap.of("ACCOUNTS", (l) jVar.f269140h, "BALANCE", (l) jVar.i), 1), aVar.i(), new ib7.d(), new r10.d(dVar.f269120b.a(), new jb7.f()));
        }
        if (i == 1) {
            return new ib7.b(((jge.m) jVar2.e).a());
        }
        if (i == 2) {
            return new ib7.c(fVar.e());
        }
        if (i == 3) {
            return new hb7.a();
        }
        if (i == 4) {
            return new jb7.b(jVar2.a(), aVar.i(), new jb7.f());
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        return new jb7.c(new r10.v(dVar.f269121c.c(), dVar.f269119a.i(), new za7.c()), fVar.a());
    }

    private final Object e() {
        ta7.j jVar = (ta7.j) this.d;
        ta7.d dVar = jVar.f269138c;
        ta7.d dVar2 = (ta7.d) this.f266978c;
        ta7.a aVar = dVar2.f269119a;
        jge.j jVar2 = dVar2.f269120b;
        g2j.f fVar = dVar2.f269121c;
        int i = this.f266977b;
        if (i == 0) {
            return new i0(new a3e.u(new ib7.j(ImmutableMap.of("ACCOUNTS", (l) jVar.e, "BALANCE", (l) jVar.f), 0), new k0(), new ib7.l(), new ib7.n()), jVar.f269137b, new r10.t(ImmutableMap.of("ACCOUNTS", (l) jVar.f269139g), dVar.f269119a.i()), new dsh.h(ImmutableMap.of("ACCOUNTS", (l) jVar.f269140h, "BALANCE", (l) jVar.i), 1), aVar.i(), new ib7.d(), new r10.d(dVar.f269120b.a(), new jb7.f()));
        }
        if (i == 1) {
            return new ib7.b(((jge.m) jVar2.e).a());
        }
        if (i == 2) {
            return new ib7.c(fVar.e());
        }
        if (i == 3) {
            return new hb7.a();
        }
        if (i == 4) {
            return new jb7.b(jVar2.a(), aVar.i(), new jb7.f());
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        return new jb7.c(new r10.v(dVar.f269121c.c(), dVar.f269119a.i(), new za7.c()), fVar.a());
    }

    private final Object f() {
        ta9.i iVar = (ta9.i) this.d;
        ta9.m mVar = (ta9.m) this.f266978c;
        q8b.a aVar = mVar.f269245j;
        jk3.c cVar = mVar.f269240c;
        int i = this.f266977b;
        if (i == 0) {
            CountryResidenceScreenContract$InputData countryResidenceScreenContract$InputData = iVar.f269228a;
            qa9.y yVar = new qa9.y(iVar.f269229b.M.b());
            qa9.w wVarA = mVar.M.a();
            fk3.a aVarA = cVar.a();
            s.j(aVarA);
            dl0.a aVar2 = (dl0.a) mVar.N.f127229c.get();
            s.j(aVar2);
            return new com.revolut.feature.onboarding.impl.onboarding.country.screen.a(countryResidenceScreenContract$InputData, yVar, wVarA, aVarA, aVar2, iVar.f269230c, new hb9.a());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        fk3.a aVarA2 = cVar.a();
        s.j(aVarA2);
        n8b.a aVarA3 = aVar.a();
        s.j(aVarA3);
        n8b.b bVarB = aVar.b();
        s.j(bVarB);
        return new qa9.d(aVarA2, aVarA3, bVarB);
    }

    private final Object g() {
        nng.e eVar = (nng.e) this.d;
        l70.e eVar2 = ((ta9.m) this.f266978c).i;
        int i = this.f266977b;
        if (i == 0) {
            return new sng.i(eVar.f217642b, (cli.n) eVar.d.get());
        }
        if (i == 1) {
            l80.e eVarH = eVar2.h();
            s.j(eVarH);
            return new sng.j(eVarH, (ung.b) eVar.f217643c.get());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        l80.e eVarH2 = eVar2.h();
        s.j(eVarH2);
        return new ung.c(eVarH2);
    }

    private final Object h() {
        ta9.o oVar = (ta9.o) this.d;
        ta9.m mVar = (ta9.m) this.f266978c;
        oai.i0 i0Var = mVar.f269250q;
        ite.a aVar = mVar.f269248n;
        zvj.a aVar2 = mVar.f269249p;
        int i = this.f266977b;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            ang.f fVarE = mVar.A.e();
            fwj.p pVarA = aVar2.a();
            s.j(pVarA);
            return new ub9.b(fVarE, pVarA);
        }
        OnboardingFlowContract$InputData onboardingFlowContract$InputData = oVar.f269259a;
        fk3.a aVarA = mVar.f269240c.a();
        s.j(aVarA);
        fne.b bVar = (fne.b) mVar.f269244h.f162890r.get();
        s.j(bVar);
        z80.b bVarS = mVar.i.s();
        s.j(bVarS);
        s89.a aVar3 = (s89.a) mVar.Y.get();
        yva.a aVarA2 = mVar.f269246l.a();
        s.j(aVarA2);
        eb9.a aVar4 = new eb9.a();
        q89.e eVar = (q89.e) mVar.P.get();
        j89.a aVar5 = (j89.a) mVar.f269247m.u.get();
        s.j(aVar5);
        gte.a aVarB = aVar.b();
        s.j(aVarB);
        ga9.a aVar6 = new ga9.a();
        z0 z0Var = (z0) mVar.o.f282515p.get();
        s.j(z0Var);
        fwj.p pVarA2 = aVar2.a();
        s.j(pVarA2);
        aci.a aVar7 = (aci.a) i0Var.u.get();
        s.j(aVar7);
        ta9.m mVar2 = oVar.f269260b;
        v60.e eVarA = mVar2.k.a();
        s.j(eVarA);
        sf0.h hVarB = mVar2.f269251r.b();
        s.j(hVarB);
        utk.f fVar = new utk.f(eVarA, hVarB, (fb9.b) mVar2.Z.get());
        yp.b bVarA = mVar.f269253t.a();
        n8b.a aVarA3 = mVar.f269245j.a();
        s.j(aVarA3);
        jte.c cVarA = aVar.a();
        s.j(cVarA);
        xoj.a aVarA4 = mVar.u.a();
        s.j(aVarA4);
        fn2.c cVarB = mVar.v.b();
        wl0.c cVarA2 = mVar.f269254w.a();
        mri.w wVarA = ((ozl.a) mVar.f269255x).a();
        s.j(wVarA);
        xai.a aVar8 = (xai.a) i0Var.f223715y.get();
        s.j(aVar8);
        xa9.d dVar = (xa9.d) mVar.W.get();
        jb9.h hVar = new jb9.h();
        i1b.e eVar2 = (i1b.e) mVar.f269256y.f180201r.get();
        s.j(eVar2);
        fwj.d dVar2 = (fwj.d) mVar.z.f10791b.get();
        s.j(dVar2);
        return new com.revolut.feature.onboarding.impl.onboarding.v(onboardingFlowContract$InputData, aVarA, bVar, bVarS, aVar3, aVarA2, aVar4, eVar, aVar5, aVarB, aVar6, z0Var, pVarA2, aVar7, fVar, bVarA, aVarA3, cVarA, aVarA4, cVarB, cVarA2, wVarA, aVar8, dVar, hVar, eVar2, dVar2);
    }

    private final Object i() {
        int i = this.f266977b;
        if (i == 0) {
            ta9.u uVar = (ta9.u) this.d;
            return new com.revolut.feature.onboarding.impl.onboarding.passcode.a(uVar.f269277a, (cli.n) uVar.f269278b.get(), (hzl.e) ((ta9.m) this.f266978c).f269242e0.get());
        }
        if (i == 1) {
            return new com.revolut.feature.onboarding.impl.onboarding.passcode.b();
        }
        throw new AssertionError(i);
    }

    private final Object j() {
        ta9.m mVar = (ta9.m) this.f266978c;
        int i = this.f266977b;
        if (i != 0) {
            if (i == 1) {
                return new rb9.j();
            }
            throw new AssertionError(i);
        }
        ta9.w wVar = (ta9.w) this.d;
        RiskCheckScreenContract$InputData riskCheckScreenContract$InputData = wVar.f269281a;
        cli.n nVar = (cli.n) wVar.f269282b.get();
        fwj.p pVarA = mVar.f269249p.a();
        s.j(pVarA);
        sf0.h hVarB = mVar.f269251r.b();
        s.j(hVarB);
        return new rb9.i(riskCheckScreenContract$InputData, nVar, pVarA, hVarB);
    }

    private final Object k() {
        z zVar = (z) this.d;
        ta9.m mVar = (ta9.m) this.f266978c;
        l70.e eVar = mVar.i;
        q8b.a aVar = mVar.f269245j;
        int i = this.f266977b;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            WaitingListAwaitingScreenContract$InputData waitingListAwaitingScreenContract$InputData = zVar.f269289a;
            n8b.a aVarA = aVar.a();
            s.j(aVarA);
            return new xb9.o(waitingListAwaitingScreenContract$InputData, aVarA);
        }
        cli.n nVar = (cli.n) zVar.f269290b.get();
        WaitingListAwaitingScreenContract$InputData waitingListAwaitingScreenContract$InputData2 = zVar.f269289a;
        n8b.a aVarA2 = aVar.a();
        s.j(aVarA2);
        c70.a aVarZ = eVar.z();
        s.j(aVarZ);
        r70.c cVarA = eVar.A();
        s.j(cVarA);
        return new com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a(nVar, waitingListAwaitingScreenContract$InputData2, aVarA2, aVarZ, cVarA, mVar.B.a(), mVar.C.a(), (db9.f) mVar.c0.get(), (f01.a) mVar.f269241d0.get());
    }

    private final Object l() {
        tc7.e eVar = (tc7.e) this.d;
        tc7.d dVar = (tc7.d) this.f266978c;
        int i = this.f266977b;
        switch (i) {
            case 0:
                r2d.g factory = (r2d.g) dVar.f269644y.o.get();
                s.j(factory);
                r2d.r presenterDelegate = eVar.a();
                kc7.c widgetConfigProvider = dVar.k();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(presenterDelegate, "presenterDelegate");
                Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
                Intrinsics.checkNotNullParameter(presenterDelegate, "presenterDelegate");
                Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
                return new r2d.f(presenterDelegate, factory.f251106a, widgetConfigProvider);
            case 1:
                r2d.g factory2 = (r2d.g) dVar.f269644y.o.get();
                s.j(factory2);
                r2d.r presenterDelegate2 = eVar.a();
                kc7.c widgetConfigProvider2 = dVar.k();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(presenterDelegate2, "presenterDelegate");
                Intrinsics.checkNotNullParameter(widgetConfigProvider2, "widgetConfigProvider");
                Intrinsics.checkNotNullParameter(presenterDelegate2, "presenterDelegate");
                Intrinsics.checkNotNullParameter(widgetConfigProvider2, "widgetConfigProvider");
                return new r2d.f(presenterDelegate2, factory2.f251106a, widgetConfigProvider2);
            case 2:
                doj.a aVarA = dVar.L.a();
                s.j(aVarA);
                a0 a0VarC = dVar.f269585b.c();
                s.j(a0VarC);
                fej.b bVarM = dVar.N.m();
                s.j(bVarM);
                return hy1.g.q(aVarA, a0VarC, bVarM, eVar.f269648a, (ash.d) dVar.U2.get());
            case 3:
                doj.a aVarA2 = dVar.L.a();
                s.j(aVarA2);
                a0 a0VarC2 = dVar.f269585b.c();
                s.j(a0VarC2);
                fej.b bVarM2 = dVar.N.m();
                s.j(bVarM2);
                return hy1.g.o(aVarA2, a0VarC2, bVarM2, eVar.f269648a, (ash.d) dVar.U2.get());
            case 4:
                s3d.m mVarC = dVar.A.c();
                s.j(mVarC);
                fd7.a aVar = new fd7.a();
                ash.d dVar2 = (ash.d) dVar.U2.get();
                m3d.j jVarA = dVar.f269629s0.a();
                s.j(jVarA);
                gd7.b.Companion.getClass();
                return p0.t(mVarC, aVar, dVar2, jVarA, null);
            case 5:
                s3d.m mVarC2 = dVar.A.c();
                s.j(mVarC2);
                fd7.a aVar2 = new fd7.a();
                ash.d dVar3 = (ash.d) dVar.U2.get();
                m3d.j jVarA2 = dVar.f269629s0.a();
                s.j(jVarA2);
                gd7.b.Companion.getClass();
                return p0.r(mVarC2, aVar2, dVar3, jVarA2, null);
            case 6:
                s3d.m mVarC3 = dVar.A.c();
                s.j(mVarC3);
                fd7.a aVar3 = new fd7.a();
                ash.d dVar4 = (ash.d) dVar.U2.get();
                m3d.j jVarA3 = dVar.f269629s0.a();
                s.j(jVarA3);
                gd7.b.Companion.getClass();
                return p0.B(mVarC3, aVar3, dVar4, jVarA3, null);
            case 7:
                s3d.m mVarC4 = dVar.A.c();
                s.j(mVarC4);
                fd7.a aVar4 = new fd7.a();
                ash.d dVar5 = (ash.d) dVar.U2.get();
                m3d.j jVarA4 = dVar.f269629s0.a();
                s.j(jVarA4);
                gd7.b.Companion.getClass();
                return p0.l(mVarC4, aVar4, dVar5, jVarA4, null);
            case 8:
                p69.b bVar = (p69.b) dVar.f269591d0.f212747c.get();
                s.j(bVar);
                ash.d dVar6 = (ash.d) dVar.U2.get();
                a0 a0VarC3 = dVar.f269585b.c();
                s.j(a0VarC3);
                return kxa.j.x(bVar, dVar6, a0VarC3);
            case 9:
                rtj.g gVar = dVar.g0;
                luj.a factory3 = new luj.a();
                ash.d widgetsCommonEventDispatcher = (ash.d) dVar.U2.get();
                a0 widgetsUiInteractor = dVar.f269585b.c();
                s.j(widgetsUiInteractor);
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
                return new kuj.f(widgetsCommonEventDispatcher, widgetsUiInteractor);
            case 10:
                l1c.a aVarA3 = dVar.D.a();
                s.j(aVarA3);
                pyb.c cVar = new pyb.c(dVar.f269632t0.e());
                nyb.k kVarC = dVar.v.c();
                s.j(kVarC);
                a0 a0VarC4 = dVar.f269585b.c();
                s.j(a0VarC4);
                ash.d dVar7 = (ash.d) dVar.U2.get();
                q06.l lVarA = dVar.u0.a();
                s.j(lVarA);
                return olc.c.m(aVarA3, cVar, kVarC, a0VarC4, dVar7, lVarA);
            case 11:
                qw4.g factory4 = (qw4.g) dVar.d.k.get();
                s.j(factory4);
                uc7.a homeFeedWidgetsEventDispatcher = (uc7.a) dVar.U2.get();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
                return new qw4.d(factory4.f249772c, homeFeedWidgetsEventDispatcher);
            case 12:
                pw4.g factory5 = (pw4.g) dVar.d.u.get();
                s.j(factory5);
                uc7.a homeFeedWidgetsEventDispatcher2 = (uc7.a) dVar.U2.get();
                Intrinsics.checkNotNullParameter(factory5, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher2, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher2, "homeFeedWidgetsEventDispatcher");
                return new pw4.f(factory5.f240330c, homeFeedWidgetsEventDispatcher2, factory5.e);
            case 13:
                uw4.h factory6 = (uw4.h) dVar.d.f176288w.get();
                s.j(factory6);
                Intrinsics.checkNotNullParameter(factory6, "factory");
                return new uw4.g(factory6.f283555c, factory6.e, factory6.f283556g, factory6.f);
            case 14:
                tw4.f factory7 = (tw4.f) dVar.d.f176282n.get();
                s.j(factory7);
                uc7.a homeFeedWidgetsEventDispatcher3 = (uc7.a) dVar.U2.get();
                Intrinsics.checkNotNullParameter(factory7, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher3, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher3, "homeFeedWidgetsEventDispatcher");
                return new tw4.e(factory7.f274911c, homeFeedWidgetsEventDispatcher3);
            case 15:
                ww4.g factory8 = (ww4.g) dVar.d.f176283p.get();
                s.j(factory8);
                Intrinsics.checkNotNullParameter(factory8, "factory");
                return new com.revolut.feature.credit.card.impl.widget.statement.a(factory8.f300608c, factory8.d);
            case 16:
                vw4.g factory9 = (vw4.g) dVar.d.f176286s.get();
                s.j(factory9);
                Intrinsics.checkNotNullParameter(factory9, "factory");
                return new vw4.f(factory9.d, factory9.e, factory9.f292635b);
            case 17:
                sw4.j factory10 = (sw4.j) dVar.d.f176289x.get();
                s.j(factory10);
                Intrinsics.checkNotNullParameter(factory10, "factory");
                return new sw4.i(factory10.f266108c, factory10.d);
            case 18:
                gm4.d factory11 = ((rw4.l) dVar.f269589c).a();
                s.j(factory11);
                nsh.p expandableDialogActionDispatcher = eVar.f269650b;
                nsh.p expandableDialogEventProvider = eVar.f269652c;
                Intrinsics.checkNotNullParameter(factory11, "factory");
                Intrinsics.checkNotNullParameter(expandableDialogActionDispatcher, "expandableDialogActionDispatcher");
                Intrinsics.checkNotNullParameter(expandableDialogEventProvider, "expandableDialogEventProvider");
                rw4.k kVar = (rw4.k) factory11;
                Intrinsics.checkNotNullParameter(expandableDialogActionDispatcher, "expandableDialogActionDispatcher");
                Intrinsics.checkNotNullParameter(expandableDialogEventProvider, "expandableDialogEventProvider");
                return new rw4.j(kVar.d, expandableDialogActionDispatcher, expandableDialogEventProvider, kVar.e);
            case 19:
                e15.a factory12 = dVar.X.a();
                s.j(factory12);
                Intrinsics.checkNotNullParameter(factory12, "factory");
                return new e15.f(factory12.d, factory12.e);
            case 20:
                r57.b factory13 = dVar.f269618o0.a();
                s.j(factory13);
                uc7.a homeFeedWidgetsEventDispatcher4 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor2 = dVar.f269585b.c();
                s.j(widgetsUiInteractor2);
                Intrinsics.checkNotNullParameter(factory13, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher4, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor2, "widgetsUiInteractor");
                return r57.b.a(widgetsUiInteractor2, "ProCashback", homeFeedWidgetsEventDispatcher4);
            case 21:
                r57.b factory14 = dVar.f269618o0.a();
                s.j(factory14);
                uc7.a homeFeedWidgetsEventDispatcher5 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor3 = dVar.f269585b.c();
                s.j(widgetsUiInteractor3);
                Intrinsics.checkNotNullParameter(factory14, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher5, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor3, "widgetsUiInteractor");
                return r57.b.a(widgetsUiInteractor3, "ProPockets", homeFeedWidgetsEventDispatcher5);
            case 22:
                r57.b factory15 = dVar.f269618o0.a();
                s.j(factory15);
                uc7.a homeFeedWidgetsEventDispatcher6 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor4 = dVar.f269585b.c();
                s.j(widgetsUiInteractor4);
                Intrinsics.checkNotNullParameter(factory15, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher6, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor4, "widgetsUiInteractor");
                return r57.b.a(widgetsUiInteractor4, "ProPocketsSmall", homeFeedWidgetsEventDispatcher6);
            case 23:
                r57.b factory16 = dVar.f269618o0.a();
                s.j(factory16);
                uc7.a homeFeedWidgetsEventDispatcher7 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor5 = dVar.f269585b.c();
                s.j(widgetsUiInteractor5);
                Intrinsics.checkNotNullParameter(factory16, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher7, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor5, "widgetsUiInteractor");
                return r57.b.a(widgetsUiInteractor5, "ProSales", homeFeedWidgetsEventDispatcher7);
            case 24:
                r57.b factory17 = dVar.f269618o0.a();
                s.j(factory17);
                uc7.a homeFeedWidgetsEventDispatcher8 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor6 = dVar.f269585b.c();
                s.j(widgetsUiInteractor6);
                Intrinsics.checkNotNullParameter(factory17, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher8, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor6, "widgetsUiInteractor");
                return r57.b.a(widgetsUiInteractor6, "ProSalesAnalytics", homeFeedWidgetsEventDispatcher8);
            case 25:
                r57.b factory18 = dVar.f269618o0.a();
                s.j(factory18);
                uc7.a homeFeedWidgetsEventDispatcher9 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor7 = dVar.f269585b.c();
                s.j(widgetsUiInteractor7);
                Intrinsics.checkNotNullParameter(factory18, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher9, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor7, "widgetsUiInteractor");
                return r57.b.a(widgetsUiInteractor7, "ProSalesAnalyticsSmall", homeFeedWidgetsEventDispatcher9);
            case 26:
                r57.b factory19 = dVar.f269618o0.a();
                s.j(factory19);
                uc7.a homeFeedWidgetsEventDispatcher10 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor8 = dVar.f269585b.c();
                s.j(widgetsUiInteractor8);
                Intrinsics.checkNotNullParameter(factory19, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher10, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor8, "widgetsUiInteractor");
                return r57.b.a(widgetsUiInteractor8, "ProToolbox", homeFeedWidgetsEventDispatcher10);
            case 27:
                r57.b factory20 = dVar.f269618o0.a();
                s.j(factory20);
                uc7.a homeFeedWidgetsEventDispatcher11 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor9 = dVar.f269585b.c();
                s.j(widgetsUiInteractor9);
                Intrinsics.checkNotNullParameter(factory20, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher11, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor9, "widgetsUiInteractor");
                return r57.b.a(widgetsUiInteractor9, "ProVATReminder", homeFeedWidgetsEventDispatcher11);
            case 28:
                r57.b factory21 = dVar.f269618o0.a();
                s.j(factory21);
                uc7.a homeFeedWidgetsEventDispatcher12 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor10 = dVar.f269585b.c();
                s.j(widgetsUiInteractor10);
                Intrinsics.checkNotNullParameter(factory21, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher12, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor10, "widgetsUiInteractor");
                return r57.b.a(widgetsUiInteractor10, "ProTaxHub", homeFeedWidgetsEventDispatcher12);
            case 29:
                r57.b factory22 = dVar.f269618o0.a();
                s.j(factory22);
                uc7.a homeFeedWidgetsEventDispatcher13 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor11 = dVar.f269585b.c();
                s.j(widgetsUiInteractor11);
                Intrinsics.checkNotNullParameter(factory22, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher13, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor11, "widgetsUiInteractor");
                return r57.b.a(widgetsUiInteractor11, "ProPerks", homeFeedWidgetsEventDispatcher13);
            case 30:
                l88.a factory23 = ((k78.b) dVar.o).d();
                s.j(factory23);
                uc7.a homeFeedWidgetsEventDispatcher14 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor12 = dVar.f269585b.c();
                s.j(widgetsUiInteractor12);
                Intrinsics.checkNotNullParameter(factory23, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher14, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor12, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher14, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor12, "widgetsUiInteractor");
                return new m88.h(widgetsUiInteractor12, homeFeedWidgetsEventDispatcher14);
            case 31:
                l88.a factory24 = ((k78.b) dVar.o).d();
                s.j(factory24);
                uc7.a homeFeedWidgetsEventDispatcher15 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor13 = dVar.f269585b.c();
                s.j(widgetsUiInteractor13);
                Intrinsics.checkNotNullParameter(factory24, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher15, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor13, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher15, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor13, "widgetsUiInteractor");
                return new v88.f(widgetsUiInteractor13, homeFeedWidgetsEventDispatcher15);
            case 32:
                l88.a factory25 = ((k78.b) dVar.o).d();
                s.j(factory25);
                uc7.a homeFeedWidgetsEventDispatcher16 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor14 = dVar.f269585b.c();
                s.j(widgetsUiInteractor14);
                Intrinsics.checkNotNullParameter(factory25, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher16, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor14, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher16, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor14, "widgetsUiInteractor");
                return new v88.f(widgetsUiInteractor14, homeFeedWidgetsEventDispatcher16);
            case 33:
                l88.a factory26 = ((k78.b) dVar.o).d();
                s.j(factory26);
                uc7.a homeFeedWidgetsEventDispatcher17 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor15 = dVar.f269585b.c();
                s.j(widgetsUiInteractor15);
                Intrinsics.checkNotNullParameter(factory26, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher17, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor15, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher17, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor15, "widgetsUiInteractor");
                return new o88.d(widgetsUiInteractor15, homeFeedWidgetsEventDispatcher17);
            case 34:
                l88.a factory27 = ((k78.b) dVar.o).d();
                s.j(factory27);
                uc7.a homeFeedWidgetsEventDispatcher18 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor16 = dVar.f269585b.c();
                s.j(widgetsUiInteractor16);
                Intrinsics.checkNotNullParameter(factory27, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher18, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor16, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher18, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor16, "widgetsUiInteractor");
                return new n88.c(widgetsUiInteractor16, homeFeedWidgetsEventDispatcher18);
            case 35:
                l88.a factory28 = ((k78.b) dVar.o).d();
                s.j(factory28);
                uc7.a homeFeedWidgetsEventDispatcher19 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor17 = dVar.f269585b.c();
                s.j(widgetsUiInteractor17);
                Intrinsics.checkNotNullParameter(factory28, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher19, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor17, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher19, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor17, "widgetsUiInteractor");
                return new s88.f(widgetsUiInteractor17, homeFeedWidgetsEventDispatcher19);
            case 36:
                l88.a factory29 = ((k78.b) dVar.o).d();
                s.j(factory29);
                uc7.a homeFeedWidgetsEventDispatcher20 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor18 = dVar.f269585b.c();
                s.j(widgetsUiInteractor18);
                Intrinsics.checkNotNullParameter(factory29, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher20, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor18, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher20, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor18, "widgetsUiInteractor");
                return new r88.n(homeFeedWidgetsEventDispatcher20, widgetsUiInteractor18, factory29.f192807a);
            case 37:
                qxj.e factory30 = ((k78.b) dVar.o).f181851a.c();
                uc7.a homeFeedWidgetsEventDispatcher21 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor19 = dVar.f269585b.c();
                s.j(widgetsUiInteractor19);
                Intrinsics.checkNotNullParameter(factory30, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher21, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor19, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher21, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor19, "widgetsUiInteractor");
                return new qxj.d(widgetsUiInteractor19, homeFeedWidgetsEventDispatcher21);
            case 38:
                m6e.a dependency = dVar.f269615n0.a();
                s.j(dependency);
                uc7.a homeFeedWidgetsEventDispatcher22 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor20 = dVar.f269585b.c();
                s.j(widgetsUiInteractor20);
                Intrinsics.checkNotNullParameter(dependency, "dependency");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher22, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor20, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher22, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor20, "widgetsUiInteractor");
                return new k7e.h(widgetsUiInteractor20, homeFeedWidgetsEventDispatcher22);
            case 39:
                m6e.a dependency2 = dVar.f269615n0.a();
                s.j(dependency2);
                uc7.a homeFeedWidgetsEventDispatcher23 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor21 = dVar.f269585b.c();
                s.j(widgetsUiInteractor21);
                Intrinsics.checkNotNullParameter(dependency2, "dependency");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher23, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor21, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher23, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor21, "widgetsUiInteractor");
                return new m7e.f(widgetsUiInteractor21, homeFeedWidgetsEventDispatcher23);
            case 40:
                m6e.a dependency3 = dVar.f269615n0.a();
                s.j(dependency3);
                uc7.a homeFeedWidgetsEventDispatcher24 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor22 = dVar.f269585b.c();
                s.j(widgetsUiInteractor22);
                Intrinsics.checkNotNullParameter(dependency3, "dependency");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher24, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor22, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher24, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor22, "widgetsUiInteractor");
                return new j7e.f(widgetsUiInteractor22, homeFeedWidgetsEventDispatcher24);
            case 41:
                m6e.a dependency4 = dVar.f269615n0.a();
                s.j(dependency4);
                uc7.a homeFeedWidgetsEventDispatcher25 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor23 = dVar.f269585b.c();
                s.j(widgetsUiInteractor23);
                c70.a clipboard = dVar.R.z();
                s.j(clipboard);
                Intrinsics.checkNotNullParameter(dependency4, "dependency");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher25, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor23, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(clipboard, "clipboard");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher25, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor23, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(clipboard, "clipboard");
                return new l7e.h(homeFeedWidgetsEventDispatcher25, widgetsUiInteractor23, clipboard, ((g7e.a) dependency4).o);
            case 42:
                m6e.a dependency5 = dVar.f269615n0.a();
                s.j(dependency5);
                k39.b navigationCommandDispatcher = eVar.f269648a;
                Intrinsics.checkNotNullParameter(dependency5, "dependency");
                Intrinsics.checkNotNullParameter(navigationCommandDispatcher, "navigationCommandDispatcher");
                Intrinsics.checkNotNullParameter(navigationCommandDispatcher, "navigationCommandDispatcher");
                return new i7e.e(navigationCommandDispatcher);
            case 43:
                uc7.a homeFeedWidgetsEventDispatcher26 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor24 = dVar.f269585b.c();
                s.j(widgetsUiInteractor24);
                qjb.i factory31 = ((fob.a) dVar.Y).f();
                s.j(factory31);
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher26, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor24, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(factory31, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher26, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor24, "widgetsUiInteractor");
                return new qpb.h(((ppb.a) factory31).f238312c, widgetsUiInteractor24, homeFeedWidgetsEventDispatcher26);
            case 44:
                k39.b navigationCommandsDispatcher = eVar.f269648a;
                uc7.a homeFeedWidgetsEventDispatcher27 = (uc7.a) dVar.U2.get();
                qjb.i factory32 = ((fob.a) dVar.Y).f();
                s.j(factory32);
                Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher27, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(factory32, "factory");
                Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher27, "homeFeedWidgetsEventDispatcher");
                return new spb.m(((ppb.a) factory32).k, navigationCommandsDispatcher, homeFeedWidgetsEventDispatcher27);
            case 45:
                uc7.a homeFeedWidgetsEventDispatcher28 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor25 = dVar.f269585b.c();
                s.j(widgetsUiInteractor25);
                qjb.i factory33 = ((fob.a) dVar.Y).f();
                s.j(factory33);
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher28, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor25, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(factory33, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher28, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor25, "widgetsUiInteractor");
                return new zpb.e(widgetsUiInteractor25, homeFeedWidgetsEventDispatcher28);
            case 46:
                uc7.a homeFeedWidgetsEventDispatcher29 = (uc7.a) dVar.U2.get();
                a0 widgetsUiInteractor26 = dVar.f269585b.c();
                s.j(widgetsUiInteractor26);
                qjb.i factory34 = ((fob.a) dVar.Y).f();
                s.j(factory34);
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher29, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor26, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(factory34, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher29, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor26, "widgetsUiInteractor");
                return new upb.f(widgetsUiInteractor26, homeFeedWidgetsEventDispatcher29);
            case 47:
                a0 widgetsUiInteractor27 = dVar.f269585b.c();
                s.j(widgetsUiInteractor27);
                uc7.a homeFeedWidgetsEventDispatcher30 = (uc7.a) dVar.U2.get();
                qjb.i factory35 = ((fob.a) dVar.Y).f();
                s.j(factory35);
                Intrinsics.checkNotNullParameter(widgetsUiInteractor27, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher30, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(factory35, "factory");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor27, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher30, "homeFeedWidgetsEventDispatcher");
                return new tpb.e(widgetsUiInteractor27, ((ppb.a) factory35).i, homeFeedWidgetsEventDispatcher30);
            case 48:
                k39.b navigationCommandsDispatcher2 = eVar.f269648a;
                a0 widgetsUiInteractor28 = dVar.f269585b.c();
                s.j(widgetsUiInteractor28);
                uc7.a homeFeedWidgetsEventDispatcher31 = (uc7.a) dVar.U2.get();
                qjb.i factory36 = ((fob.a) dVar.Y).f();
                s.j(factory36);
                Intrinsics.checkNotNullParameter(navigationCommandsDispatcher2, "navigationCommandsDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor28, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher31, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(factory36, "factory");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor28, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(navigationCommandsDispatcher2, "navigationCommandsDispatcher");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher31, "homeFeedWidgetsEventDispatcher");
                return new ypb.e(widgetsUiInteractor28, ((ppb.a) factory36).i, homeFeedWidgetsEventDispatcher31);
            case 49:
                a0 widgetsUiInteractor29 = dVar.f269585b.c();
                s.j(widgetsUiInteractor29);
                uc7.a homeFeedWidgetsEventDispatcher32 = (uc7.a) dVar.U2.get();
                qjb.i factory37 = ((fob.a) dVar.Y).f();
                s.j(factory37);
                Intrinsics.checkNotNullParameter(widgetsUiInteractor29, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher32, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(factory37, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher32, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor29, "widgetsUiInteractor");
                return new jkb.d(widgetsUiInteractor29, homeFeedWidgetsEventDispatcher32);
            case 50:
                qjb.i factory38 = ((fob.a) dVar.Y).f();
                s.j(factory38);
                Intrinsics.checkNotNullParameter(factory38, "factory");
                return new wpb.b();
            case 51:
                uc7.a homeFeedWidgetsEventDispatcher33 = (uc7.a) dVar.U2.get();
                qjb.i factory39 = ((fob.a) dVar.Y).f();
                s.j(factory39);
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher33, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(factory39, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher33, "homeFeedWidgetsEventDispatcher");
                return new vpb.b(((ppb.a) factory39).i, homeFeedWidgetsEventDispatcher33);
            case 52:
                f61.a factory40 = new f61.a(((h30.n) dVar.f269602h0).p0);
                kgm.c callback = new kgm.c((uc7.a) dVar.U2.get());
                Intrinsics.checkNotNullParameter(factory40, "factory");
                Intrinsics.checkNotNullParameter(callback, "callback");
                Intrinsics.checkNotNullParameter(callback, "callback");
                return new k40.f(callback);
            case 53:
                ou5.b factory41 = dVar.i0.a();
                uc7.a homeFeedWidgetsEventDispatcher34 = (uc7.a) dVar.U2.get();
                Intrinsics.checkNotNullParameter(factory41, "factory");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher34, "homeFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher34, "homeFeedWidgetsEventDispatcher");
                return new vbc.g((a0) factory41.e, homeFeedWidgetsEventDispatcher34);
            case 54:
                d0 d0Var = (d0) ((sf1.s) dVar.e).O.get();
                s.j(d0Var);
                k39.b bVar2 = eVar.f269648a;
                ash.i iVar = (ash.i) dVar.S2.get();
                a0 a0VarC5 = dVar.f269585b.c();
                s.j(a0VarC5);
                uc7.a aVar5 = (uc7.a) dVar.U2.get();
                q06.l lVarA2 = dVar.u0.a();
                s.j(lVarA2);
                return new jc7.e(d0Var, bVar2, iVar, a0VarC5, aVar5, lVarA2);
            case 55:
                return new mc7.e((uc7.a) dVar.U2.get());
            case 56:
                return new mc7.h((uc7.a) dVar.U2.get());
            case 57:
                return new zc7.c(eVar.f269648a, dVar.f269640x.i(), (uc7.a) dVar.U2.get());
            case 58:
                k39.b bVar3 = eVar.f269648a;
                fx9.a aVarA4 = dVar.f269598g.a();
                s.j(aVarA4);
                y8k.b bVarA = dVar.f269635v0.a();
                x2k.e eVar2 = new x2k.e();
                rq9.a aVarA5 = dVar.f269638w0.a();
                s.j(aVarA5);
                oy1.b bVarB = dVar.f269641x0.b();
                un9.a aVarD = dVar.y0.d();
                s.j(aVarD);
                return new sc7.j(bVar3, aVarA4, bVarA, eVar2, aVarA5, bVarB, aVarD, dVar.z0.a(), (uc7.a) dVar.U2.get());
            case 59:
                k39.b bVar4 = eVar.f269648a;
                a0 a0VarC6 = dVar.f269585b.c();
                s.j(a0VarC6);
                return new vc7.d(bVar4, a0VarC6);
            case 60:
                k39.b bVar5 = eVar.f269648a;
                u68.i iVarQ = ((k78.b) dVar.o).q();
                s.j(iVarQ);
                a0 a0VarC7 = dVar.f269585b.c();
                s.j(a0VarC7);
                return new yc7.m(bVar5, iVarQ, a0VarC7, (uc7.a) dVar.U2.get(), dVar.A0.a());
            case 61:
                k39.b bVar6 = eVar.f269648a;
                tc7.d dVar8 = eVar.d;
                z8e.a aVarD2 = dVar8.O.d();
                s.j(aVarD2);
                lb5.b bVarA2 = dVar8.W.a();
                s.j(bVarA2);
                return new com.revolut.feature.home_feed.impl.widgets.scheduled_payments.c(bVar6, new hc7.d(aVarD2, bVarA2), dVar.H.c());
            case 62:
                uc7.a aVar6 = (uc7.a) dVar.U2.get();
                a0 a0VarC8 = dVar.f269585b.c();
                s.j(a0VarC8);
                return new pc7.e(aVar6, a0VarC8, new zj2.a());
            case 63:
                k39.b bVar7 = eVar.f269648a;
                x xVarD = ((s41.a) dVar.B0).d();
                fn2.c cVarA = dVar.f269594e0.a();
                gkc.b bVar8 = (gkc.b) dVar.f269628s.f196354m.get();
                s.j(bVar8);
                a0 a0VarC9 = dVar.f269585b.c();
                s.j(a0VarC9);
                return new ed7.k(bVar7, xVarD, cVarA, bVar8, a0VarC9, new xn.c(), (ash.d) dVar.U2.get());
            case 64:
                k39.b bVar9 = eVar.f269648a;
                nt8.a aVar7 = dVar.G;
                cf7.l lVar = dVar.I;
                mt8.d dVarB = aVar7.b();
                s.j(dVarB);
                a0 a0VarC10 = dVar.f269585b.c();
                s.j(a0VarC10);
                uc7.a aVar8 = (uc7.a) dVar.U2.get();
                lg3.a aVarA6 = ((og3.e) ((cf7.b) lVar).i).a();
                s.j(aVarA6);
                pf7.b bVar10 = new pf7.b(aVarA6);
                lg3.a aVarA7 = ((og3.e) ((cf7.b) lVar).i).a();
                s.j(aVarA7);
                return new qc7.h(bVar9, dVarB, a0VarC10, aVar8, bVar10, new pf7.a(aVarA7));
            case 65:
                k39.b bVar11 = eVar.f269648a;
                com.revolut.feature.rev_points.api.navigation.a aVarA8 = dVar.f269632t0.a();
                s.j(aVarA8);
                a0 a0VarC11 = dVar.f269585b.c();
                s.j(a0VarC11);
                return new bd7.d(bVar11, aVarA8, a0VarC11);
            case 66:
                return new nc7.c(dVar.f269640x.j(), (uc7.a) dVar.U2.get());
            case 67:
                uc7.a aVar9 = (uc7.a) dVar.U2.get();
                a0 a0VarC12 = dVar.f269585b.c();
                s.j(a0VarC12);
                return new wc7.g(a0VarC12, aVar9);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        tf5.f fVar = (tf5.f) this.d;
        tf5.e eVar = (tf5.e) this.f266978c;
        int i = this.f266977b;
        if (i != 0) {
            if (i == 1) {
                return new com.revolut.feature.crypto.exchange.fees.impl.ui.d(((k3) eVar.e).b());
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) fVar.f270241c.get();
        lf5.b bVar = fVar.f270239a;
        CryptoExchangeFeesMode cryptoExchangeFeesMode = fVar.f270240b;
        vf5.d dVar = (vf5.d) ((tf5.l) eVar.f).f270262n.get();
        s.j(dVar);
        zja.a aVarA = ((ika.b) eVar.f270230g).a();
        s.j(aVarA);
        ffk.t tVarF = eVar.f270231h.f();
        s.j(tVarF);
        sh5.d dVarF = eVar.f270229c.f();
        s.j(dVarF);
        sd5.c cVarA = eVar.i.a();
        s.j(cVarA);
        return new com.revolut.feature.crypto.exchange.fees.impl.ui.c(nVar, bVar, cryptoExchangeFeesMode, dVar, aVarA, tVarF, dVarF, cVarA);
    }

    private final Object n() {
        tf5.g gVar = (tf5.g) this.d;
        tf5.e eVar = (tf5.e) this.f266978c;
        int i = this.f266977b;
        if (i == 0) {
            mkd.g view = gVar.f270242a;
            rkd.m factory = eVar.f270232j.a();
            s.j(factory);
            cg5.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(factory, "factory");
            return factory.a(view);
        }
        if (i != 1) {
            if (i == 2) {
                return new bg5.i();
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) gVar.e.get();
        CryptoExchangeFees cryptoExchangeFees = gVar.f270243b;
        CryptoExchangeFeesMode cryptoExchangeFeesMode = gVar.f270244c;
        mkd.d dVar = (mkd.d) gVar.d.get();
        jr5.a aVar = (jr5.a) eVar.k.f218531b.get();
        s.j(aVar);
        gte.a aVarB = eVar.f270233l.b();
        s.j(aVarB);
        sd5.c cVarA = eVar.i.a();
        s.j(cVarA);
        return new bg5.h(nVar, cryptoExchangeFees, cryptoExchangeFeesMode, dVar, aVar, aVarB, cVarA);
    }

    @Override // phm.a
    public final Object get() {
        cli.n nVar;
        Object aVar;
        m60.b bVar;
        int i = this.f266976a;
        int i2 = this.f266977b;
        Object obj2 = this.d;
        Object obj3 = this.f266978c;
        switch (i) {
            case 0:
                k kVar = (k) obj3;
                m mVar = (m) obj2;
                y0b.g screenInputData = mVar.f266979a;
                ViewController controller = mVar.d;
                switch (i2) {
                    case 0:
                        j0b.c factory = mVar.c();
                        j0b.b delegatesProvider = (j0b.b) mVar.f.get();
                        j0b.a controllerModelExtension = (j0b.a) mVar.f266982g.get();
                        z0b.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(delegatesProvider, "delegatesProvider");
                        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                        return factory.c(delegatesProvider, controllerModelExtension);
                    case 1:
                        j0b.c factory2 = mVar.c();
                        z0b.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return factory2.d();
                    case 2:
                        j0b.c factory3 = mVar.c();
                        z0b.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        return factory3.b();
                    case 3:
                        return new x0b.b(mVar.f266980b, mVar.f266981c, (g0b.d) mVar.i.get());
                    case 4:
                        i0b.d dVarB = mVar.b();
                        tb4.t tVarA = kVar.a();
                        v0b.d dVarB2 = kVar.b();
                        z0b.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(screenInputData, "screenInputData");
                        c1b.h hVar = screenInputData.f310178b;
                        c1b.c cVar = screenInputData.f310177a;
                        AdvancedChartSymbol advancedChartSymbol = screenInputData.f310179c;
                        c1b.d dVar = screenInputData.d;
                        ChartTimeFrameDisplayType chartTimeFrameDisplayType = screenInputData.e;
                        OverlayPolicy.INSTANCE.getClass();
                        OverlayPolicy overlayPolicy = OverlayPolicy.f82090b;
                        LockPolicy.INSTANCE.getClass();
                        return new x0b.g(dVarB, tVarA, dVarB2, new AdvancedChartExtensionContract$InputData(hVar, cVar, advancedChartSymbol, dVar, chartTimeFrameDisplayType, overlayPolicy, LockPolicy.f82087c, false));
                    case 5:
                        ImmutableMap destinationProviders = ImmutableMap.of(c1b.c.STOCKS, (x8b.a) new srb.a(), c1b.c.CRYPTO, new x8b.a());
                        s.j(destinationProviders);
                        z0b.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(screenInputData, "inputData");
                        Intrinsics.checkNotNullParameter(destinationProviders, "destinationProviders");
                        i0b.c cVar2 = (i0b.c) destinationProviders.get(screenInputData.f310177a);
                        if (cVar2 == null) {
                            throw new IllegalStateException("Cannot find AdvancedChartsControllerProvider for " + screenInputData.f310177a);
                        }
                        i0b.d dVarB3 = mVar.b();
                        g0b.d dVar2 = (g0b.d) mVar.i.get();
                        j0b.a aVar2 = (j0b.a) mVar.f266982g.get();
                        j0b.c factory4 = mVar.c();
                        z0b.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        j0b.d dVarA = factory4.a();
                        f80.a uriHelper = mVar.e.f266971b.x();
                        s.j(uriHelper);
                        i.Companion.getClass();
                        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
                        nd.l advancedChartMapperFactory = new nd.l();
                        c90.c uiResources = (c90.c) mVar.k.get();
                        f01.a uiKitResources = (f01.a) mVar.f266985l.get();
                        Intrinsics.checkNotNullParameter(advancedChartMapperFactory, "advancedChartMapperFactory");
                        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
                        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
                        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                        return new com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.a(cVar2, dVarB3, dVar2, aVar2, new y0b.p(dVarA, new x0b.l(uiResources, uiKitResources, uriHelper)), mVar.f266979a);
                    case 6:
                        z0b.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        return new c90.c(controller.m2());
                    case 7:
                        z0b.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        return new f01.c(controller.m2());
                    default:
                        throw new AssertionError(i2);
                }
            case 1:
                t15.c cVar3 = (t15.c) obj2;
                t15.d dVar3 = (t15.d) obj3;
                switch (i2) {
                    case 0:
                        oqk.l transactionsWidgetActionExtensionProvider = dVar3.f267162j.b();
                        s.j(transactionsWidgetActionExtensionProvider);
                        j60.a bottomDialogExtension = cVar3.f267148a;
                        l0 popupMenuDialogDisplayer = cVar3.f267149b;
                        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtensionProvider, "transactionsWidgetActionExtensionProvider");
                        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
                        return transactionsWidgetActionExtensionProvider.a(bottomDialogExtension, popupMenuDialogDisplayer);
                    case 1:
                        ssi.m extension = (ssi.m) cVar3.f267150c.get();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        s.k(extension);
                        return extension;
                    case 2:
                        Object extension2 = (f15.a) cVar3.e.get();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        yji.n nVar2 = (yji.n) extension2;
                        s.k(nVar2);
                        return nVar2;
                    case 3:
                        j15.e provider = dVar3.f267171w.a();
                        s.j(provider);
                        Intrinsics.checkNotNullParameter(provider, "provider");
                        return provider.a();
                    case 4:
                        Object extension3 = (di9.c) cVar3.f267151g.get();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        yji.n nVar3 = (yji.n) extension3;
                        s.k(nVar3);
                        return nVar3;
                    case 5:
                        ij9.a provider2 = dVar3.f267166p.k();
                        s.j(provider2);
                        Intrinsics.checkNotNullParameter(provider2, "provider");
                        return provider2.a();
                    case 6:
                        Object extension4 = (di9.d) cVar3.i.get();
                        Intrinsics.checkNotNullParameter(extension4, "extension");
                        yji.n nVar4 = (yji.n) extension4;
                        s.k(nVar4);
                        return nVar4;
                    case 7:
                        ij9.a provider3 = dVar3.f267166p.k();
                        s.j(provider3);
                        j60.a bottomDialogExtension2 = cVar3.f267148a;
                        di9.c payLaterModeActivationExtension = (di9.c) cVar3.f267151g.get();
                        Intrinsics.checkNotNullParameter(provider3, "provider");
                        Intrinsics.checkNotNullParameter(bottomDialogExtension2, "dialogControllerExtension");
                        Intrinsics.checkNotNullParameter(payLaterModeActivationExtension, "payLaterModeActivationExtension");
                        Intrinsics.checkNotNullParameter(bottomDialogExtension2, "bottomDialogExtension");
                        Intrinsics.checkNotNullParameter(payLaterModeActivationExtension, "payLaterModeActivationExtension");
                        return new ij9.i(bottomDialogExtension2, provider3.f161734a, provider3.f161735b, provider3.f161736c, provider3.e, payLaterModeActivationExtension);
                    case 8:
                        Object extension5 = (di9.a) cVar3.k.get();
                        Intrinsics.checkNotNullParameter(extension5, "extension");
                        yji.n nVar5 = (yji.n) extension5;
                        s.k(nVar5);
                        return nVar5;
                    case 9:
                        ij9.a provider4 = dVar3.f267166p.k();
                        s.j(provider4);
                        Intrinsics.checkNotNullParameter(provider4, "provider");
                        return new oj9.e(provider4.f);
                    case 10:
                        Object extension6 = (di9.b) cVar3.f267155m.get();
                        Intrinsics.checkNotNullParameter(extension6, "extension");
                        yji.n nVar6 = (yji.n) extension6;
                        s.k(nVar6);
                        return nVar6;
                    case 11:
                        ij9.a provider5 = dVar3.f267166p.k();
                        s.j(provider5);
                        f15.a getCreditHelpExtension = (f15.a) cVar3.e.get();
                        Intrinsics.checkNotNullParameter(provider5, "provider");
                        Intrinsics.checkNotNullParameter(getCreditHelpExtension, "getCreditHelpExtension");
                        return provider5.b(getCreditHelpExtension);
                    case 12:
                        lx4.a aVarE = dVar3.e.e();
                        return new kx4.a(aVarE, com.revolut.data.database.models.openbanking.d.v(aVarE), ((s41.a) dVar3.f267172x).d());
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                t15.d dVar4 = (t15.d) obj3;
                t15.e eVar = (t15.e) obj2;
                CreditEntryPointsControllerContract$InputData creditEntryPointsControllerContract$InputData = eVar.f267174a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new g35.n(creditEntryPointsControllerContract$InputData);
                    }
                    throw new AssertionError(i2);
                }
                a35.n nVar7 = (a35.n) dVar4.G.get();
                uq3.b bVar2 = dVar4.f267157a;
                xq3.j jVarG = bVar2.g();
                s.j(jVarG);
                xq3.w wVarL = bVar2.l();
                s.j(wVarL);
                return new com.revolut.feature.credit.impl.ui.entry_points.a(creditEntryPointsControllerContract$InputData, new g35.o(nVar7, jVarG, wVarL, dVar4.f267158b.i(), dVar4.f267161h.e(), new g35.r(), new g35.a(dVar4.f267159c.f175963a.g()), new g35.p(), new g35.u(), new g35.q(), new g35.s(), new g35.t()), ((c1) dVar4.i).h(), (cli.n) eVar.f267175b.get());
            case 3:
                if (i2 == 0) {
                    t15.f fVar = (t15.f) obj2;
                    return new i35.g(((t15.d) obj3).z.b(), fVar.f267177a, (cli.n) fVar.f267178b.get());
                }
                if (i2 == 1) {
                    return new i35.h();
                }
                throw new AssertionError(i2);
            case 4:
                t1f.c cVar4 = (t1f.c) obj2;
                TradeRevPointsAccountUnlinkingScreenContract$InputData tradeRevPointsAccountUnlinkingScreenContract$InputData = cVar4.f267281a;
                if (i2 == 0) {
                    return new s2f.d((cli.n) cVar4.f267282b.get(), tradeRevPointsAccountUnlinkingScreenContract$InputData, ((t1f.h) obj3).a());
                }
                if (i2 == 1) {
                    return new s2f.e(tradeRevPointsAccountUnlinkingScreenContract$InputData);
                }
                throw new AssertionError(i2);
            case 5:
                t1f.d dVar5 = (t1f.d) obj2;
                t1f.h hVar2 = (t1f.h) obj3;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    l80.e dateProvider = hVar2.f267306p.h();
                    s.j(dateProvider);
                    Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                    return new j2f.r();
                }
                cli.n nVar8 = (cli.n) dVar5.f267285b.get();
                TradeRevPointsAgentAllVouchersScreenContract$InputData tradeRevPointsAgentAllVouchersScreenContract$InputData = dVar5.f267284a;
                qr0.i iVarC = hVar2.c();
                jwb.e eVarB = hVar2.k.b();
                s.j(eVarB);
                return new j2f.o(nVar8, tradeRevPointsAgentAllVouchersScreenContract$InputData, iVarC, eVarB);
            case 6:
                t1f.h hVar3 = (t1f.h) obj3;
                zxb.k0 k0Var = hVar3.f267301h;
                t1f.f fVar2 = (t1f.f) obj2;
                TradeRevPointsAgentDetailsScreenContract$InputData inputData = fVar2.f267290a;
                t1f.h hVar4 = fVar2.f267291b;
                switch (i2) {
                    case 0:
                        Object extension7 = (mub.b) fVar2.f267292c.get();
                        Intrinsics.checkNotNullParameter(extension7, "extension");
                        yji.n nVar9 = (yji.n) extension7;
                        s.k(nVar9);
                        return nVar9;
                    case 1:
                        return m0.z(k0Var.h());
                    case 2:
                        cli.n nVar10 = (cli.n) fVar2.f267294h.get();
                        qr0.i iVarC2 = hVar3.c();
                        mub.b bVar3 = (mub.b) fVar2.f267292c.get();
                        jwb.e eVarB2 = hVar3.k.b();
                        s.j(eVarB2);
                        tsk.t tVarA2 = hVar3.a();
                        nne.b bVar4 = (nne.b) hVar3.f267303l.o.get();
                        s.j(bVar4);
                        sf0.h hVarB = hVar4.f267304m.b();
                        s.j(hVarB);
                        b0 b0Var = new b0(hVarB);
                        nyb.m0 m0VarG = k0Var.g();
                        s.j(m0VarG);
                        k18.c cVarA = hVar3.e.a();
                        mre.c cVarB = hVar3.f267305n.b();
                        s.j(cVarB);
                        return new com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b(nVar10, inputData, iVarC2, bVar3, eVarB2, tVarA2, bVar4, b0Var, m0VarG, cVarA, cVarB);
                    case 3:
                        d4m.a genericMapper = e4m.b.a(fVar2.e);
                        d4m.a milesMapper = e4m.b.a(fVar2.f);
                        d4m.a trainsMapper = e4m.b.a(fVar2.f267293g);
                        f2f.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        Intrinsics.checkNotNullParameter(genericMapper, "genericMapper");
                        Intrinsics.checkNotNullParameter(milesMapper, "milesMapper");
                        Intrinsics.checkNotNullParameter(trainsMapper, "trainsMapper");
                        int i3 = f2f.a.f131780a[inputData.f91138b.ordinal()];
                        if (i3 == 1) {
                            Object obj4 = milesMapper.get();
                            Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                            nVar = (cli.n) obj4;
                        } else if (i3 == 2) {
                            Object obj5 = trainsMapper.get();
                            Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                            nVar = (cli.n) obj5;
                        } else {
                            if (i3 != 3 && i3 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Object obj6 = genericMapper.get();
                            Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                            nVar = (cli.n) obj6;
                        }
                        cli.n nVar11 = nVar;
                        s.k(nVar11);
                        return nVar11;
                    case 4:
                        return new e2f.i0(new g2f.h(new v1f.c()), new by5.a(new g2f.l()), new g2f.e(), new g2f.j(hVar4.i.g()), new g2f.a(), new g2f.d());
                    case 5:
                        g2f.h hVar5 = new g2f.h(new v1f.c());
                        by5.a aVar3 = new by5.a(new g2f.l());
                        g2f.e eVar2 = new g2f.e();
                        g2f.j jVar = new g2f.j(hVar4.i.g());
                        v1f.c clauseFormatter = new v1f.c();
                        Intrinsics.checkNotNullParameter(clauseFormatter, "clauseFormatter");
                        return new e2f.b(hVar5, aVar3, eVar2, jVar, new g2f.q(), new g2f.r(), new g2f.d());
                    case 6:
                        g2f.h hVar6 = new g2f.h(new v1f.c());
                        fub.k kVarD = hVar4.f267302j.d();
                        s.j(kVarD);
                        return new j0(hVar6, new g2f.k(kVarD), new by5.a(new g2f.l()), new g2f.e(), new g2f.j(hVar4.i.g()), new g2f.a(), new g2f.f(), new g2f.d());
                    default:
                        throw new AssertionError(i2);
                }
            case 7:
                t1f.l lVar = (t1f.l) obj2;
                t1f.h hVar7 = lVar.f267323b;
                t1f.h hVar8 = (t1f.h) obj3;
                zxb.k0 k0Var2 = hVar8.f267301h;
                if (i2 == 0) {
                    n60.a aVar4 = (n60.a) lVar.d.get();
                    o5k.i.l(aVar4);
                    return aVar4;
                }
                if (i2 == 1) {
                    return o5k.i.q((com.revolut.kompot.navigable.a) lVar.f267324c.get());
                }
                if (i2 == 2) {
                    Object extension8 = (a6c.g) lVar.f.get();
                    p2f.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension8, "extension");
                    yji.n nVar12 = (yji.n) extension8;
                    s.k(nVar12);
                    return nVar12;
                }
                if (i2 == 3) {
                    o8c.a factory5 = (o8c.a) hVar8.o.f233669a0.get();
                    s.j(factory5);
                    p2f.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory5, "factory");
                    return factory5.a();
                }
                if (i2 != 4) {
                    if (i2 == 5) {
                        return new u1f.g(new fmc.z((TradeRevPointsService) hVar8.v.get()), hVar8.e.a(), (a6c.g) lVar.f.get());
                    }
                    throw new AssertionError(i2);
                }
                v1f.c pointsClauseFormatter = new v1f.c();
                m2f.a pointsCalculator = new m2f.a();
                Intrinsics.checkNotNullParameter(pointsClauseFormatter, "pointsClauseFormatter");
                Intrinsics.checkNotNullParameter(pointsCalculator, "pointsCalculator");
                e0 e0Var = new e0();
                i90.b bVar5 = new i90.b();
                TradeRevPointsTransferScreenContract$InputData tradeRevPointsTransferScreenContract$InputData = lVar.f267322a;
                nyb.k kVarC = k0Var2.c();
                s.j(kVarC);
                qr0.i iVarC3 = hVar8.c();
                tsk.t tVarA3 = hVar8.a();
                u1f.b bVar6 = (u1f.b) lVar.f267326h.get();
                qd0.b bVarN = hVar7.f267306p.n();
                s.j(bVarN);
                m2f.c cVar5 = new m2f.c(bVarN);
                wj0.a aVarI = ((nj0.d) hVar8.f267297a).i();
                s.j(aVarI);
                n60.a aVar5 = (n60.a) lVar.d.get();
                m2f.a aVar6 = new m2f.a();
                wub.a aVarA = hVar8.f267307q.a();
                s.j(aVarA);
                nyb.i0 i0VarF = k0Var2.f();
                s.j(i0VarF);
                nyb.m0 m0VarG2 = k0Var2.g();
                s.j(m0VarG2);
                ffk.t tVarF = hVar8.f267308r.f();
                s.j(tVarF);
                sf0.h hVarB2 = hVar7.f267304m.b();
                s.j(hVarB2);
                b0 b0Var2 = new b0(hVarB2);
                CoroutineScope coroutineScopeA = hVar8.f267309s.a();
                s.j(coroutineScopeA);
                return new com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a(e0Var, bVar5, tradeRevPointsTransferScreenContract$InputData, kVarC, iVarC3, tVarA3, bVar6, cVar5, aVarI, aVar5, aVar6, aVarA, i0VarF, m0VarG2, tVarF, b0Var2, coroutineScopeA);
            case 8:
                t64.c cVar6 = (t64.c) obj3;
                t64.a aVar7 = (t64.a) obj2;
                switch (i2) {
                    case 0:
                        ypi.h hVar9 = aVar7.f268176b;
                        fsi.g gVar = aVar7.f268175a;
                        return new ypi.e(hVar9, bq.i.b(gVar), bq.i.o(gVar), bq.i.g(gVar));
                    case 1:
                        return new hqi.f(aVar7.f268177c, bq.i.b(aVar7.f268175a));
                    case 2:
                        return kpi.f.a();
                    case 3:
                        Context contextI = bq.i.i(aVar7.f268175a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar7.f268175a);
                        t70.g gVarO = cVar6.f268208b.o();
                        s.j(gVarO);
                        return new npi.c(contextI, baseDelegatesActivityF, gVarO);
                    case 4:
                        return new tpi.i((rpi.c) aVar7.f268180j.get(), gsi.c.a(aVar7.f268175a));
                    case 5:
                        return new rpi.b(bq.i.b(aVar7.f268175a));
                    case 6:
                        return new rpi.h(bq.i.b(aVar7.f268175a));
                    case 7:
                        return new iri.g((iri.j) cVar6.f268223p.get(), (iri.m) cVar6.f268232w.get(), bq.i.f(aVar7.f268175a), bq.i.l(aVar7.f268175a));
                    case 8:
                        return new iri.l((iri.m) cVar6.f268232w.get(), bq.i.f(aVar7.f268175a), (iri.d) aVar7.f268183n.get());
                    case 9:
                        return new iri.d(bq.i.f(aVar7.f268175a));
                    case 10:
                        return new opi.b(bq.i.f(aVar7.f268175a));
                    case 11:
                        return new qi3.l(bq.i.l(aVar7.f268175a), (f9b.f) aVar7.f268185q.get(), (qi3.r) cVar6.f268233w0.get(), (com.revolut.feature.chooser.c) cVar6.f268235x0.get(), aVar7.d, (ypi.i) aVar7.f.get(), (hqi.l) aVar7.f268178g.get(), (opi.d) aVar7.f268184p.get(), (tpi.j) aVar7.k.get(), bq.i.o(aVar7.f268175a));
                    case 12:
                        return bq.i.t(aVar7.f268175a);
                    default:
                        throw new AssertionError(i2);
                }
            case 9:
                return a();
            case 10:
                t64.c cVar7 = (t64.c) obj3;
                t64.d dVar6 = (t64.d) obj2;
                switch (i2) {
                    case 0:
                        return new k3l.d(bq.i.b(dVar6.f268237a));
                    case 1:
                        dVar6.getClass();
                        return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) cVar7.f268224q.get(), cVar7.k());
                    case 2:
                        um.c cVar8 = (um.c) cVar7.f268225r.get();
                        dVar6.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                        t64.c cVar9 = dVar6.f268238b;
                        hn.h hVar10 = (hn.h) cVar9.f268227s.get();
                        t70.g gVarO2 = cVar9.f268208b.o();
                        s.j(gVarO2);
                        builderBuilderWithExpectedSize.add(new jn.a(hVar10, gVarO2));
                        builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize.add(cVar9.l());
                        builderBuilderWithExpectedSize.add(new xc0.a((qc0.j) cVar9.f268209b0.get(), (qc0.h) cVar9.Y.get()));
                        builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(dVar6.e)));
                        return new in.e(cVar8, builderBuilderWithExpectedSize.build(), cVar7.k());
                    case 3:
                        return bq.i.t(dVar6.f268237a);
                    case 4:
                        dVar6.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize2.add(dVar6.f268240g.get());
                        builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(dVar6.i)));
                        return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) cVar7.S.get(), cVar7.k());
                    case 5:
                        return new zm.a();
                    case 6:
                        return new tpi.i((rpi.c) dVar6.f268241h.get(), gsi.c.a(dVar6.f268237a));
                    case 7:
                        return new rpi.b(bq.i.b(dVar6.f268237a));
                    case 8:
                        dVar6.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize3.add(dVar6.f268238b.l());
                        return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) cVar7.f268227s.get(), (npi.f) dVar6.k.get());
                    case 9:
                        Context contextI2 = bq.i.i(dVar6.f268237a);
                        BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(dVar6.f268237a);
                        t70.g gVarO3 = cVar7.f268208b.o();
                        s.j(gVarO3);
                        return new npi.c(contextI2, baseDelegatesActivityF2, gVarO3);
                    case 10:
                        t64.c cVar10 = dVar6.f268238b;
                        return new en.c(ImmutableSet.of((ln.d) cVar10.f268217k0.get(), (ln.d) cVar10.f268229t.get()), bq.i.l(dVar6.f268237a));
                    case 11:
                        return new gn.c((lpi.e) dVar6.f268245n.get(), (sm.e) cVar7.l0.get(), ImmutableSet.copyOf((Collection) gn.e.a()), cVar7.k());
                    case 12:
                        return new lpi.b(bq.i.i(dVar6.f268237a), bq.i.j(dVar6.f268237a));
                    case 13:
                        dVar6.getClass();
                        return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) cVar7.m0.get(), cVar7.k());
                    case 14:
                        return kpi.f.a();
                    case 15:
                        return new rpi.h(bq.i.b(dVar6.f268237a));
                    case 16:
                        return new iri.g((iri.j) cVar7.f268223p.get(), (iri.m) cVar7.f0.get(), bq.i.f(dVar6.f268237a), bq.i.l(dVar6.f268237a));
                    case 17:
                        return new iri.l((iri.m) cVar7.f0.get(), bq.i.f(dVar6.f268237a), (iri.d) dVar6.f268250t.get());
                    case 18:
                        return new iri.d(bq.i.f(dVar6.f268237a));
                    case 19:
                        return new opi.b(bq.i.f(dVar6.f268237a));
                    case 20:
                        return new h3l.l((h3l.h) cVar7.y0.get(), (k3l.b) dVar6.f268239c.get(), bq.i.e(dVar6.f268237a), (mm.d) cVar7.Z.get());
                    default:
                        throw new AssertionError(i2);
                }
            case 11:
                t6a.a aVar8 = (t6a.a) obj2;
                if (i2 == 0) {
                    return new b7a.r((w80.b) aVar8.f268273c.get(), aVar8.f268271a, (cli.n) aVar8.d.get());
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new AssertionError(i2);
                    }
                    return new b7a.q(new u80.o(), (w80.b) aVar8.f268273c.get());
                }
                qd0.b languageProvider = ((t6a.b) obj3).f268274a.n();
                s.j(languageProvider);
                c7a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
            case 12:
                t6a.d dVar7 = (t6a.d) obj2;
                t6a.b bVar7 = dVar7.f268281b;
                t6a.b bVar8 = (t6a.b) obj3;
                pqi.a aVar9 = bVar8.f268276c;
                l70.e eVar3 = bVar8.f268274a;
                if (i2 == 0) {
                    PayNowQrScreenContract$InputData payNowQrScreenContract$InputData = dVar7.f268280a;
                    c70.a aVarZ = eVar3.z();
                    s.j(aVarZ);
                    r70.c cVarA2 = eVar3.A();
                    s.j(cVarA2);
                    aVar = new com.revolut.feature.paynow.impl.screens.qr.a(payNowQrScreenContract$InputData, aVarZ, cVarA2, new tsk.t((v6a.a) bVar7.f268277g.get()), new f7a.c((yy0.f) dVar7.d.get(), bVar7.f268276c.f()), (f7a.e) dVar7.e.get(), eVar3.d(), new n80.b(), aVar9.e(), bVar8.d.e(), (cli.n) dVar7.f.get());
                } else {
                    if (i2 == 1) {
                        com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) dVar7.f268282c.get();
                        e7a.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        yy0.f fVarQ = jh.d.f(controller2.m2()).Q();
                        s.k(fVarQ);
                        return fVarQ;
                    }
                    if (i2 != 2) {
                        if (i2 == 3) {
                            return new d7a.v(dVar7.f268280a, new f7a.c((yy0.f) dVar7.d.get(), bVar7.f268276c.f()));
                        }
                        throw new AssertionError(i2);
                    }
                    zk0.b fileSystemRepository = eVar3.l();
                    s.j(fileSystemRepository);
                    ContextThemeWrapper context = aVar9.f();
                    e7a.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
                    Intrinsics.checkNotNullParameter(context, "context");
                    skm.p0 p0Var = skm.p0.f264001a;
                    aVar = new f7a.e(fileSystemRepository, context, elm.f.f127540b);
                }
                return aVar;
            case 13:
                t6k.c cVar11 = (t6k.c) obj3;
                l70.e eVar4 = cVar11.f268370c;
                nj0.a aVar10 = cVar11.f268369b;
                if (i2 == 0) {
                    wj0.a idempotencyKeyHolder = ((nj0.d) aVar10).i();
                    s.j(idempotencyKeyHolder);
                    l80.e dateProvider2 = eVar4.h();
                    s.j(dateProvider2);
                    y6k.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                    Intrinsics.checkNotNullParameter(dateProvider2, "dateProvider");
                    bVar = new m60.b(idempotencyKeyHolder, dateProvider2, "payments_money_request");
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new AssertionError(i2);
                        }
                        t6k.a aVar11 = (t6k.a) obj2;
                        MoneyRequestActionNavigation$InputData moneyRequestActionNavigation$InputData = aVar11.f268358a;
                        wv9.c cVarD = ((s6k.b) aVar11.f268359b.d).d();
                        s.j(cVarD);
                        x6k.a aVar12 = new x6k.a(cVarD);
                        vv9.a aVarA2 = ((s6k.b) cVar11.d).a();
                        s.j(aVarA2);
                        return new com.revolut.retail.feature.payments.money_request.impl.ui_kompot.action_dialog.a(moneyRequestActionNavigation$InputData, aVar12, aVarA2);
                    }
                    wj0.a idempotencyKeyHolder2 = ((nj0.d) aVar10).i();
                    s.j(idempotencyKeyHolder2);
                    l80.e dateProvider3 = eVar4.h();
                    s.j(dateProvider3);
                    y6k.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(idempotencyKeyHolder2, "idempotencyKeyHolder");
                    Intrinsics.checkNotNullParameter(dateProvider3, "dateProvider");
                    bVar = new m60.b(idempotencyKeyHolder2, dateProvider3, "payments_apm_money_request");
                }
                return bVar;
            case 14:
                t6k.c cVar12 = (t6k.c) obj3;
                t6k.b bVar9 = (t6k.b) obj2;
                t6k.c cVar13 = bVar9.f268362b;
                switch (i2) {
                    case 0:
                        g6k.e eVar5 = (g6k.e) bVar9.f268364g.get();
                        gsi.d.a(eVar5);
                        return eVar5;
                    case 1:
                        return new g6k.e((j60.a) bVar9.d.get(), (g6k.f) bVar9.f.get());
                    case 2:
                        return gsi.d.D((com.revolut.kompot.navigable.a) bVar9.f268363c.get(), kxa.j.o(new nji.b()));
                    case 3:
                        ytf.a aVar13 = cVar12.e;
                        pqi.a aVar14 = cVar12.f268372h;
                        tv9.a aVar15 = cVar12.d;
                        utf.a aVarA3 = aVar13.a();
                        s.j(aVarA3);
                        vv9.a aVarA4 = ((s6k.b) aVar15).a();
                        s.j(aVarA4);
                        vv9.b bVarB = ((s6k.b) aVar15).b();
                        s.j(bVarB);
                        wv9.c cVarD2 = ((s6k.b) aVar15).d();
                        s.j(cVarD2);
                        bqf.g gVarF = cVar12.f.f();
                        zof.f fVarD = cVar12.f268371g.d();
                        s.j(fVarD);
                        i5k.a aVar16 = (i5k.a) bVar9.e.get();
                        gte.a aVarB = cVar12.f268368a.b();
                        s.j(aVarB);
                        return new g6k.r(aVarA3, aVarA4, bVarB, cVarD2, gVarF, fVarD, aVar16, aVarB, aVar14.e(), (j60.a) bVar9.d.get(), aVar14.g());
                    case 4:
                        l80.h hVarV = cVar12.f268370c.v();
                        s.j(hVarV);
                        return new i5k.d(hVarV);
                    case 5:
                        return gsi.d.h((j60.a) bVar9.d.get());
                    case 6:
                        return gsi.d.b((g6k.f) bVar9.f.get());
                    case 7:
                        i5k.a aVar17 = (i5k.a) bVar9.e.get();
                        j5k.b.a(aVar17);
                        return aVar17;
                    case 8:
                        MoneyRequestDetailsContract$InputData moneyRequestDetailsContract$InputData = bVar9.f268361a;
                        vv9.c cVarC = ((s6k.b) cVar13.d).c();
                        s.j(cVarC);
                        ang.f fVarE = cVar13.i.e();
                        lx1.d dVarB4 = ((ey1.e) cVar13.f268373j).b();
                        s.j(dVarB4);
                        d3j.b bVarE = ((b3j.p) cVar13.k).e();
                        vv9.c cVarC2 = ((s6k.b) cVar13.d).c();
                        s.j(cVarC2);
                        m1a.i iVarA = cVar13.f268374l.a();
                        gte.a aVarB2 = cVar13.f268368a.b();
                        s.j(aVarB2);
                        com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.a aVar18 = new com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.a(moneyRequestDetailsContract$InputData, cVarC, fVarE, dVarB4, bVarE, new z6k.o(cVarC2, iVarA, aVarB2));
                        g6k.a aVar19 = (g6k.a) bVar9.f.get();
                        c70.a aVarZ2 = cVar12.f268370c.z();
                        s.j(aVarZ2);
                        r70.c cVarA3 = cVar12.f268370c.A();
                        s.j(cVarA3);
                        MoneyRequestDetailsContract$InputData moneyRequestDetailsContract$InputData2 = bVar9.f268361a;
                        wv9.c cVarD3 = ((s6k.b) cVar13.d).d();
                        s.j(cVarD3);
                        return new com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b(aVar18, aVar19, aVarZ2, cVarA3, moneyRequestDetailsContract$InputData2, new bof.r(new b7k.e(cVarD3, bVar9.b()), bVar9.b(), cVar13.f268374l.b()), cVar12.f268374l.b());
                    default:
                        throw new AssertionError(i2);
                }
            case 15:
                t6k.c cVar14 = (t6k.c) obj3;
                t6k.d dVar8 = (t6k.d) obj2;
                if (i2 == 0) {
                    n60.b bVar10 = (n60.b) dVar8.f268379c.get();
                    o5k.i.n(bVar10);
                    return bVar10;
                }
                if (i2 == 1) {
                    return o5k.i.s((com.revolut.kompot.navigable.a) dVar8.f268378b.get());
                }
                if (i2 == 2) {
                    n60.a aVar20 = (n60.a) dVar8.e.get();
                    o5k.i.k(aVar20);
                    return aVar20;
                }
                if (i2 == 3) {
                    return o5k.i.p((com.revolut.kompot.navigable.a) dVar8.f268378b.get());
                }
                if (i2 != 4) {
                    if (i2 == 5) {
                        return new c7k.e(cVar14.f268372h.g());
                    }
                    throw new AssertionError(i2);
                }
                vv9.a aVarA5 = ((s6k.b) cVar14.d).a();
                s.j(aVarA5);
                return new c7k.j(aVarA5, new e7k.a(), (jki.p) dVar8.f268380g.get(), dVar8.f268377a);
            case 16:
                return b();
            case 17:
                return c();
            case 18:
                return d();
            case 19:
                return e();
            case 20:
                return f();
            case 21:
                return g();
            case 22:
                return h();
            case 23:
                return i();
            case 24:
                return j();
            case 25:
                return k();
            case 26:
                return l();
            case 27:
                return m();
            case 28:
                return n();
            default:
                tf5.e eVar6 = (tf5.e) obj3;
                tf5.h hVar11 = (tf5.h) obj2;
                if (i2 == 0) {
                    return kxa.j.k((j60.a) hVar11.d.get());
                }
                if (i2 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) hVar11.f270246b.get(), (rp0.m) hVar11.f270247c.get());
                }
                if (i2 == 2) {
                    return new rp0.m();
                }
                if (i2 == 3) {
                    cli.n nVar13 = (cli.n) hVar11.f.get();
                    vf5.d dVar9 = (vf5.d) ((tf5.l) eVar6.f).f270262n.get();
                    s.j(dVar9);
                    sd5.c cVarA4 = eVar6.i.a();
                    s.j(cVarA4);
                    return new ag5.h(nVar13, dVar9, cVarA4, hVar11.f270245a);
                }
                if (i2 != 4) {
                    throw new AssertionError(i2);
                }
                sf0.h hVarB3 = eVar6.f270234m.b();
                s.j(hVarB3);
                v60.e eVarA = eVar6.f270235n.a();
                s.j(eVarA);
                return new ag5.j(hVarB3, eVarA);
        }
    }
}
