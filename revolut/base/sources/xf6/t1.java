package xf6;

import android.app.Activity;
import android.content.Context;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultRegistry;
import com.google.common.collect.ImmutableSet;
import com.revolut.data.model.Data;
import com.revolut.feature.atm.impl.ui.redesign.limits.AtmWithdrawalLimitsBottomSheetScreenContract$InputData;
import com.revolut.feature.credit.application.close.ui.legacy.CreditApplicationCloseLegacyContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.backendflow.CreditBackendFlowContract$Configuration;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.MandateSetupBottomSheetContract$InputData;
import com.revolut.feature.external_accounts.impl.mandate.mandate_details.MandateDetailsScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.mandate.mandate_result.MandateResultScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.OpenBankingAuthAccountsFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.funds_confirmation.OpenBankingFundsConfirmationScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.ConsentsListScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.InactiveConsentsListScreenContract$InputData;
import com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.revolutoauth.api.RevolutOAuthRetailFeatureApi$Toggles$RevolutOAuthConnectedApps;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.trading.orders.ui.invest.placement.account.selector.screen.InvestAccountSelectorScreenContract$InputData;
import com.revolut.trading.orders.ui.invest.placement.models.TargetPriceInputValue;
import com.revolut.trading.orders.ui.invest.placement.screens.review.provider.NoteOrderPlacementDialogProvider;
import com.revolut.trading.orders.ui.invest.placement.target_price.TargetPriceScreenContract$InputData;
import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreenContract$InputData;
import java.math.BigDecimal;
import java.time.Clock;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* JADX INFO: loaded from: classes3.dex */
public final class t1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f305093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f305094c;
    public final Object d;

    public /* synthetic */ t1(Object obj2, Object obj3, int i, int i2) {
        this.f305092a = i2;
        this.f305093b = obj2;
        this.d = obj3;
        this.f305094c = i;
    }

    private final Object a() {
        xg4.d dVar = (xg4.d) this.f305093b;
        xg4.c cVar = (xg4.c) this.d;
        int i = this.f305094c;
        switch (i) {
            case 0:
                cVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) dVar.f305563s.get(), dVar.k());
            case 1:
                um.c cVar2 = (um.c) dVar.f305565t.get();
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(11);
                xg4.d dVar2 = cVar.f305528g;
                hn.h hVar = (hn.h) dVar2.u.get();
                t70.g gVarO = dVar2.f305544b.o();
                vc.s.j(gVarO);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(dVar2.l());
                builderBuilderWithExpectedSize.add(new xc0.a((qc0.j) dVar2.f305551h0.get(), (qc0.h) dVar2.f305548e0.get()));
                builderBuilderWithExpectedSize.add(new yg4.j(dVar2.h()));
                builderBuilderWithExpectedSize.add(new yg4.l(dVar2.h()));
                builderBuilderWithExpectedSize.add(new yg4.f(dVar2.h()));
                builderBuilderWithExpectedSize.add(new yg4.c(dVar2.h()));
                builderBuilderWithExpectedSize.add(new yg4.h(dVar2.h()));
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(cVar.i)));
                return new in.e(cVar2, builderBuilderWithExpectedSize.build(), dVar.k());
            case 2:
                return bq.i.t(cVar.f305523a);
            case 3:
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(cVar.k.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(cVar.f305532m)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) dVar.Y.get(), dVar.k());
            case 4:
                return new zm.a();
            case 5:
                return new tpi.i((rpi.c) cVar.f305531l.get(), gsi.c.a(cVar.f305523a));
            case 6:
                return new rpi.b(bq.i.b(cVar.f305523a));
            case 7:
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(cVar.f305528g.l());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) dVar.u.get(), (npi.f) cVar.o.get());
            case 8:
                Context contextI = bq.i.i(cVar.f305523a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(cVar.f305523a);
                t70.g gVarO2 = dVar.f305544b.o();
                vc.s.j(gVarO2);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO2);
            case 9:
                xg4.d dVar3 = cVar.f305528g;
                return new en.c(ImmutableSet.of((ln.d) dVar3.p0.get(), (ln.d) dVar3.v.get()), bq.i.l(cVar.f305523a));
            case 10:
                return new gn.c((lpi.e) cVar.f305536r.get(), (sm.e) dVar.q0.get(), ImmutableSet.copyOf((Collection) gn.e.a()), dVar.k());
            case 11:
                return new lpi.b(bq.i.i(cVar.f305523a), bq.i.j(cVar.f305523a));
            case 12:
                cVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) dVar.f305562r0.get(), dVar.k());
            case 13:
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                xg4.d dVar4 = cVar.f305528g;
                builderBuilderWithExpectedSize4.add(new wc0.a((qc0.k) dVar4.f305568w.get(), ((s41.a) dVar4.k).d(), (ln.a) dVar4.v.get(), (qc0.j) dVar4.f305551h0.get(), qw7.u.i(dVar4.f305550h), dVar4.d()));
                return new g3l.c(j6.a.g(dVar4.f305558o0, builderBuilderWithExpectedSize4), (g3l.g) dVar.i0.get(), (k3l.b) cVar.u.get(), dVar.k());
            case 14:
                return new k3l.d(bq.i.b(cVar.f305523a));
            case 15:
                ypi.h hVar2 = cVar.f305525b;
                fsi.g gVar = cVar.f305523a;
                return new ypi.e(hVar2, bq.i.b(gVar), bq.i.o(gVar), bq.i.g(gVar));
            case 16:
                return new hqi.f(cVar.f305527c, bq.i.b(cVar.f305523a));
            case 17:
                return new rpi.h(bq.i.b(cVar.f305523a));
            case 18:
                return new iri.g((iri.j) dVar.f305561r.get(), (iri.m) dVar.f305568w.get(), bq.i.f(cVar.f305523a), bq.i.l(cVar.f305523a));
            case 19:
                return new iri.l((iri.m) dVar.f305568w.get(), bq.i.f(cVar.f305523a), (iri.d) cVar.A.get());
            case 20:
                return new iri.d(bq.i.f(cVar.f305523a));
            case 21:
                cqi.h hVar3 = (cqi.h) cVar.C.get();
                an.a aVar = (an.a) dVar.m0.get();
                ImmutableSet.Builder builderBuilderWithExpectedSize5 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize5.add(cVar.f305528g.f305558o0.get());
                builderBuilderWithExpectedSize5.addAll((Iterable) bn.b.a());
                return new an.q(hVar3, aVar, builderBuilderWithExpectedSize5.build(), dVar.k());
            case 22:
                return new cqi.j(bq.i.f(cVar.f305523a));
            case 23:
                return new xpi.c(cVar.d, bq.i.b(cVar.f305523a));
            case 24:
                return new com.revolut.retail.toast.mediator.a((d4l.a) dVar.f305564s0.get(), (c4l.b) cVar.F.get());
            case 25:
                return new c4l.e(bq.i.i(cVar.f305523a), bq.i.g(cVar.f305523a));
            case 26:
                return new f5l.c((f5l.a) dVar.f305566t0.get(), bq.i.b(cVar.f305523a));
            case 27:
                Activity activityB = bq.i.b(cVar.f305523a);
                y80.b bVar = new y80.b();
                g60.a aVar2 = (g60.a) cVar.I.get();
                fsi.g gVar2 = cVar.f305523a;
                Activity activityB2 = bq.i.b(gVar2);
                t80.g gVar3 = (t80.g) cVar.J.get();
                BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(gVar2);
                d4m.a aVarA = e4m.b.a(cVar.K);
                nli.a aVarG = cVar.g();
                t80.g gVar4 = (t80.g) cVar.J.get();
                l70.e eVar = cVar.f305528g.f305544b;
                zk0.b bVarL = eVar.l();
                vc.s.j(bVarL);
                oli.c cVar3 = new oli.c(gVar4, bVarL, cVar.g(), (g60.a) cVar.I.get(), cVar.h());
                ComponentActivity componentActivityA = gmf.b.a(gVar2);
                ActivityResultRegistry activityResultRegistryA = pli.b.a(gmf.b.a(gVar2));
                ami.n nVar = new ami.n(e4m.b.a(cVar.L), 1);
                d4m.a aVarA2 = e4m.b.a(cVar.K);
                t80.g gVar5 = (t80.g) cVar.J.get();
                nli.a aVarG2 = cVar.g();
                i90.b bVar2 = new i90.b();
                z70.a aVarF = eVar.f();
                vc.s.j(aVarF);
                c70.b bVar3 = new c70.b(aVarF, 2);
                z70.a aVarF2 = eVar.f();
                vc.s.j(aVarF2);
                return new upi.b(activityB, bVar, new t80.v(aVar2, activityB2, gVar3, baseDelegatesActivityF2, aVarA, aVarG, cVar3, new oli.g(componentActivityA, activityResultRegistryA, nVar, aVarA2, gVar5, aVarG2, bVar2, new u96.b(bVar3, new smd.s(aVarF2)), cVar.h()), cVar.h()));
            case 28:
                return new g60.a(bq.i.b(cVar.f305523a));
            case 29:
                l70.e eVar2 = dVar.f305544b;
                l70.e eVar3 = dVar.f305544b;
                f80.a aVarX = eVar2.x();
                vc.s.j(aVarX);
                l80.e eVarH = eVar3.h();
                vc.s.j(eVarH);
                zk0.b bVarL2 = eVar3.l();
                vc.s.j(bVarL2);
                return new t80.b(aVarX, eVarH, bVarL2);
            case 30:
                return pli.c.a(new ks0.n(bq.i.f(cVar.f305523a)));
            case 31:
                return t96.a.a();
            case 32:
                return new aqi.d(bq.i.b(cVar.f305523a), new y80.b());
            case 33:
                return kpi.f.a();
            case 34:
                return new opi.b(bq.i.f(cVar.f305523a));
            case 35:
                return new iqi.b(cVar.e, bq.i.b(cVar.f305523a));
            case 36:
                fsi.g gVar6 = cVar.f305523a;
                fsi.g gVar7 = cVar.f305523a;
                c90.c cVarH = gmf.b.h(gVar6);
                CreditBackendFlowContract$Configuration creditBackendFlowContract$Configuration = cVar.f;
                kpi.c cVar4 = (kpi.c) cVar.O.get();
                rz3.c cVarG = ((dw3.c1) dVar.d).g();
                vc.s.j(cVarG);
                sri.m mVarL = bq.i.l(gVar7);
                qc0.h hVar4 = (qc0.h) dVar.f305548e0.get();
                qc0.j jVar = (qc0.j) dVar.f305551h0.get();
                qc0.k kVar = (qc0.k) dVar.f305568w.get();
                ypi.i iVar = (ypi.i) cVar.f305539w.get();
                f9b.f fVar = (f9b.f) cVar.i.get();
                tpi.j jVar2 = (tpi.j) cVar.f305532m.get();
                hqi.l lVar = (hqi.l) cVar.f305540x.get();
                npi.a aVar3 = (npi.a) cVar.o.get();
                pri.f fVarD = bq.i.d(gVar7);
                k3l.b bVar4 = (k3l.b) cVar.u.get();
                xpi.g gVar8 = (xpi.g) cVar.E.get();
                rpi.c cVar5 = (rpi.c) cVar.f305531l.get();
                qc0.h hVar5 = (qc0.h) cVar.f305528g.f305548e0.get();
                wpg.v.b(hVar5);
                ImmutableSet immutableSetOf = ImmutableSet.of(hVar5);
                mm.d dVar5 = (mm.d) dVar.f0.get();
                opi.d dVar6 = (opi.d) cVar.P.get();
                qd0.b bVarN = dVar.f305544b.n();
                vc.s.j(bVarN);
                return new p54.j(cVarH, creditBackendFlowContract$Configuration, cVar4, cVarG, mVarL, hVar4, jVar, kVar, iVar, fVar, jVar2, lVar, aVar3, fVarD, bVar4, gVar8, cVar5, immutableSetOf, dVar5, dVar6, bVarN);
            case 37:
                e4m.e eVar4 = dVar.f305568w;
                y90.e eVar5 = dVar.f305556n;
                jt0.b bVar5 = new jt0.b((qc0.k) eVar4.get(), (p54.e) dVar.f305568w.get(), qw7.u.i(dVar.f305550h));
                p54.e eVar6 = (p54.e) dVar.f305568w.get();
                xpi.g gVar9 = (xpi.g) cVar.E.get();
                zc0.g gVar10 = (zc0.g) dVar.f305548e0.get();
                qc0.j jVar3 = (qc0.j) dVar.f305551h0.get();
                ypi.i iVar2 = (ypi.i) cVar.f305539w.get();
                xg4.d dVar7 = cVar.f305528g;
                w80.b bVarJ = dVar7.f305544b.j();
                vc.s.j(bVarJ);
                t70.g gVarO3 = dVar7.f305544b.o();
                vc.s.j(gVarO3);
                zc0.c cVar6 = new zc0.c(bVarJ, gVarO3, (p80.a) cVar.S.get(), (aa0.y) dVar7.K.get(), cVar.f(), new yc0.j(new yc0.q(cVar.e()), cVar.e(), (yc0.g) dVar7.f305567v0.get(), (ad0.a) dVar7.X.get(), (ad0.p) cVar.X.get(), new yc0.p()), new yc0.o((yc0.g) dVar7.f305567v0.get()), (ad0.p) cVar.X.get(), (ad0.c) cVar.U.get(), new ad0.t(cVar.e(), new yc0.p()), new ad0.s(cVar.e(), new yc0.p()), new ad0.g(cVar.e()), new ad0.v(new yc0.q(cVar.e())), new ad0.o(), new yc0.q(cVar.e()), new yc0.p(), (yc0.y) dVar7.f305569w0.get(), (bd0.a) dVar7.f305571x0.get(), (yc0.v) dVar7.y0.get(), (yc0.c0) cVar.Y.get());
                npi.a aVar4 = (npi.a) cVar.o.get();
                k3l.b bVar6 = (k3l.b) cVar.u.get();
                rpi.c cVar7 = (rpi.c) cVar.f305531l.get();
                zd7.b bVar7 = (zd7.b) cVar.f305524a0.get();
                tpi.j jVar4 = (tpi.j) cVar.f305532m.get();
                opi.d dVar8 = (opi.d) cVar.P.get();
                cqi.h hVar6 = (cqi.h) cVar.C.get();
                qc0.i1 i1VarB = eVar5.b();
                vc.s.j(i1VarB);
                oc0.f fVarC = eVar5.c();
                vc.s.j(fVarC);
                fc0.f fVarD2 = eVar5.d();
                vc.s.j(fVarD2);
                oc0.m mVarE = eVar5.e();
                vc.s.j(mVarE);
                t9l.g gVarA = dVar.f305555m.a();
                vc.s.j(gVarA);
                oc0.k kVarA = eVar5.a();
                vc.s.j(kVarA);
                return new p54.o(bVar5, eVar6, gVar9, gVar10, jVar3, iVar2, cVar6, aVar4, bVar6, cVar7, bVar7, jVar4, dVar8, hVar6, i1VarB, fVarC, fVarD2, mVarE, gVarA, kVarA, eVar5.f());
            case 38:
                Context context = bq.i.i(cVar.f305523a);
                r54.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new p80.a(context);
            case 39:
                x90.c cVar8 = dVar.f;
                yc0.q qVar = new yc0.q(cVar.e());
                yc0.r rVar = (yc0.r) cVar.T.get();
                ad0.c cVar9 = (ad0.c) cVar.U.get();
                ad0.w wVarG = dVar.f305556n.g();
                vc.s.j(wVarG);
                yc0.f0 f0Var = (yc0.f0) cVar.V.get();
                ad0.h hVar7 = (ad0.h) cVar.W.get();
                ad0.n nVarF = cVar.f();
                u9l.a aVarB = dVar.f305555m.b();
                vc.s.j(aVarB);
                return wpg.v.o(cVar8, qVar, rVar, cVar9, wVarG, f0Var, hVar7, nVarF, aVarB);
            case 40:
                return wpg.v.n(dVar.f, cVar.e(), new yc0.p());
            case 41:
                x90.c cVar10 = dVar.f;
                return new ad0.d();
            case 42:
                x90.c cVar11 = dVar.f;
                hbl.d dVarC = dVar.f305555m.c();
                vc.s.j(dVarC);
                return wpg.v.y(cVar11, dVarC);
            case 43:
                return wpg.v.a(dVar.f, cVar.f());
            case 44:
                return wpg.v.w(dVar.f, (yc0.r) cVar.T.get(), new yc0.p());
            case 45:
                return new ae7.i((upi.f) cVar.M.get(), (t80.c) dVar.u0.get(), (d4l.a) dVar.f305564s0.get(), (aqi.a) cVar.Z.get(), new ae7.j(), bq.i.l(cVar.f305523a));
            case 46:
                return aqi.f.a(cVar.f305523a, (aqi.d) cVar.N.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        xsl.p pVar = (xsl.p) this.f305093b;
        u8h.c cVar = pVar.f308703r;
        xsl.b bVar = (xsl.b) this.d;
        xsl.p pVar2 = bVar.f308580c;
        int i = this.f305094c;
        if (i == 0) {
            return a10.b.f((u8h.b) cVar, "factory");
        }
        if (i != 1) {
            if (i == 2) {
                return new rtl.x(new stl.c(pVar2.K.g()), new stl.d(pVar2.f.f(), pVar2.K.g()), new stl.b(pVar2.K.g()), bVar.f308579b, (z0h.q1) bVar.e.get());
            }
            if (i == 3) {
                return a10.b.g((u8h.b) cVar, "factory");
            }
            if (i == 4) {
                return new rtl.v();
            }
            throw new AssertionError(i);
        }
        InvestAccountSelectorScreenContract$InputData investAccountSelectorScreenContract$InputData = bVar.f308579b;
        rtl.q qVar = (rtl.q) bVar.f.get();
        rtl.o oVar = (rtl.o) bVar.f308581g.get();
        ybl.b bVarB = pVar.e.b();
        vc.s.j(bVarB);
        zdl.f fVar = pVar2.f308696h;
        zdl.c cVar2 = pVar2.e;
        ybl.k kVarD = fVar.d();
        vc.s.j(kVarD);
        ybl.b bVarB2 = cVar2.b();
        vc.s.j(bVarB2);
        ybl.d dVarH = cVar2.h();
        vc.s.j(dVarH);
        wsg.n nVarB = pVar2.f308695g.b();
        tv5.b bVarC = pVar2.L.c();
        vc.s.j(bVarC);
        return new rtl.u(investAccountSelectorScreenContract$InputData, qVar, oVar, bVarB, new rtl.c0(kVarD, bVarB2, dVarH, nVarB, bVarC), (aah.h) bVar.d.get());
    }

    private final Object c() {
        xsl.p pVar = (xsl.p) this.f305093b;
        xsl.d dVar = (xsl.d) this.d;
        int i = this.f305094c;
        switch (i) {
            case 0:
                n60.a aVar = (n60.a) dVar.f308592m.get();
                o5k.i.l(aVar);
                return aVar;
            case 1:
                return o5k.i.q((com.revolut.kompot.navigable.a) dVar.f308591l.get());
            case 2:
                return kxa.j.k((j60.a) dVar.f308594p.get());
            case 3:
                return ehe.n.s((com.revolut.kompot.navigable.a) dVar.f308591l.get(), (rp0.m) dVar.o.get());
            case 4:
                return new rp0.m();
            case 5:
                return efk.j.d((dtl.a) dVar.f308597s.get());
            case 6:
                return efk.j.q(pVar.C.a(), dVar.f308585a, (dtl.b) dVar.f308596r.get());
            case 7:
                return efk.j.r(pVar.C.a());
            case 8:
                return h7d.d.a(dVar.f308586b, (i7d.o) dVar.u.get(), pVar.D.d());
            case 9:
                return h7d.f.a(pVar.D.d(), Optional.empty());
            case 10:
                return new psl.c(dVar.f308587c, (psl.p) dVar.f308601y.get());
            case 11:
                InvestOrderDetailsContract$InputData investOrderDetailsContract$InputData = dVar.d;
                trl.a aVar2 = pVar.k;
                trl.a aVar3 = pVar.k;
                vrl.g gVarB = aVar2.b();
                vc.s.j(gVarB);
                vrl.u0 u0VarI = aVar3.i();
                vc.s.j(u0VarI);
                ybl.b bVarB = pVar.e.b();
                vc.s.j(bVarB);
                kgm.c cVarD = pVar.f308698l.d();
                ybl.l lVarF = pVar.i.f();
                ybl.k kVarD = pVar.f308696h.d();
                vc.s.j(kVarD);
                jdf.e eVar = (jdf.e) dVar.f308599w.get();
                hsl.q qVar = (hsl.q) aVar3.S.get();
                vc.s.j(qVar);
                h1h.b bVar = (h1h.b) dVar.f308600x.get();
                ndf.f fVarC = aVar3.c();
                vc.s.j(fVarC);
                j60.a aVar4 = (j60.a) dVar.f308594p.get();
                ang.f fVarE = pVar.F.e();
                gte.a aVarB = pVar.f308692a.b();
                vc.s.j(aVarB);
                xsl.p pVar2 = dVar.k;
                fxk.a tradingHoursInteractor = pVar2.z.a();
                vc.s.j(tradingHoursInteractor);
                ybl.b instrumentTickerInteractor = pVar2.e.b();
                vc.s.j(instrumentTickerInteractor);
                df0.b syncedDateProvider = pVar2.A.a();
                vc.s.j(syncedDateProvider);
                qsl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(tradingHoursInteractor, "tradingHoursInteractor");
                Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
                Intrinsics.checkNotNullParameter(syncedDateProvider, "syncedDateProvider");
                return new psl.n(investOrderDetailsContract$InputData, gVarB, u0VarI, bVarB, cVarD, lVarF, kVarD, eVar, qVar, bVar, fVarC, aVar4, fVarE, aVarB, new ydf.b(tradingHoursInteractor, instrumentTickerInteractor, syncedDateProvider, new ydf.c()));
            case 12:
                hsl.h factory = (hsl.h) pVar.k.R.get();
                vc.s.j(factory);
                kdf.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return new hsl.g();
            case 13:
                hbh.j jVarA = pVar.E.a();
                vc.s.j(jVarA);
                return hy1.g.l(jVarA);
            case 14:
                return new lsl.a(dVar.e, (lsl.h) dVar.A.get());
            case 15:
                InvestOrderDetailsContract$InputData investOrderDetailsContract$InputData2 = dVar.d;
                vrl.g gVarB2 = pVar.k.b();
                vc.s.j(gVarB2);
                return new lsl.f(investOrderDetailsContract$InputData2, gVarB2, pVar.f308698l.d(), new lsl.n(), (h1h.b) dVar.f308600x.get());
            case 16:
                return new nsl.b(dVar.f, (nsl.p) dVar.C.get());
            case 17:
                InvestOrderDetailsContract$InputData investOrderDetailsContract$InputData3 = dVar.d;
                vrl.g gVarB3 = pVar.k.b();
                vc.s.j(gVarB3);
                ybl.b bVarB2 = pVar.e.b();
                vc.s.j(bVarB2);
                kgm.c cVarD2 = pVar.f308698l.d();
                vrl.u0 u0VarI2 = pVar.k.i();
                vc.s.j(u0VarI2);
                ybl.k kVarD2 = pVar.f308696h.d();
                vc.s.j(kVarD2);
                return new nsl.i(investOrderDetailsContract$InputData3, gVarB3, bVarB2, cVarD2, u0VarI2, kVarD2, pVar.i.f(), new pfh.b());
            case 18:
                return new osl.b(dVar.f308588g, (osl.l) dVar.E.get());
            case 19:
                InvestOrderDetailsContract$InputData investOrderDetailsContract$InputData4 = dVar.d;
                vrl.g gVarB4 = pVar.k.b();
                vc.s.j(gVarB4);
                ybl.b bVarB3 = pVar.e.b();
                vc.s.j(bVarB3);
                kgm.c cVarD3 = pVar.f308698l.d();
                vrl.u0 u0VarI3 = pVar.k.i();
                vc.s.j(u0VarI3);
                ybl.k kVarD3 = pVar.f308696h.d();
                vc.s.j(kVarD3);
                return new osl.i(investOrderDetailsContract$InputData4, gVarB4, bVarB3, cVarD3, u0VarI3, kVarD3, pVar.i.f());
            case 20:
                return new rsl.a(dVar.f308589h, (rsl.j) dVar.G.get());
            case 21:
                InvestOrderDetailsContract$InputData investOrderDetailsContract$InputData5 = dVar.d;
                trl.a aVar5 = pVar.k;
                zdl.c cVar = pVar.e;
                vrl.g gVarB5 = aVar5.b();
                vc.s.j(gVarB5);
                vrl.u0 u0VarI4 = pVar.k.i();
                vc.s.j(u0VarI4);
                ybl.b bVarB4 = cVar.b();
                vc.s.j(bVarB4);
                kgm.c cVarD4 = pVar.f308698l.d();
                ybl.l lVarF2 = pVar.i.f();
                ybl.k kVarD4 = pVar.f308696h.d();
                vc.s.j(kVarD4);
                ang.f fVarE2 = pVar.F.e();
                ael.d0 d0VarK = cVar.k();
                vc.s.j(d0VarK);
                return new rsl.h(investOrderDetailsContract$InputData5, gVarB5, u0VarI4, bVarB4, cVarD4, lVarF2, kVarD4, fVarE2, d0VarK, new NoteOrderPlacementDialogProvider(), new pfh.b());
            case 22:
                hsl.h hVar = (hsl.h) pVar.k.R.get();
                vc.s.j(hVar);
                return ka1.c.l(hVar, dVar.i, (jdf.e) dVar.f308599w.get());
            case 23:
                hbh.j jVarA2 = pVar.E.a();
                vc.s.j(jVarA2);
                return hy1.g.k(jVarA2, dVar.f308590j, (h1h.b) dVar.f308600x.get());
            case 24:
                f1h.c cVarA = pVar.G.a();
                vc.s.j(cVarA);
                return fp8.c.s(cVarA, (f1h.f) dVar.K.get(), (f1h.b) dVar.L.get());
            case 25:
                f1h.c cVarA2 = pVar.G.a();
                vc.s.j(cVarA2);
                return fp8.c.t(cVarA2);
            case 26:
                return efk.j.e((dtl.b) dVar.f308596r.get());
            case 27:
                return ImmutableSet.of((jsl.e0) dVar.f308601y.get(), (jsl.e0) dVar.A.get(), (jsl.e0) dVar.C.get(), (jsl.e0) dVar.E.get(), (jsl.e0) dVar.G.get());
            case 28:
                return new jsl.u0(dVar.d, (jsl.d0) dVar.P.get(), new bul.o(ImmutableSet.of((jsl.e0) dVar.f308601y.get(), (jsl.e0) dVar.A.get(), (jsl.e0) dVar.C.get(), (jsl.e0) dVar.E.get(), (jsl.e0) dVar.G.get()), 2), (dtl.b) dVar.f308596r.get(), (j60.a) dVar.f308594p.get(), (i7d.o) dVar.u.get());
            case 29:
                xsl.p pVar3 = dVar.k;
                xsl.p pVar4 = dVar.k;
                trl.a aVar6 = pVar3.k;
                ndf.f fVarC2 = aVar6.c();
                vc.s.j(fVarC2);
                msl.a aVar7 = new msl.a();
                ndf.f fVarC3 = aVar6.c();
                vc.s.j(fVarC3);
                ssl.c cVar2 = new ssl.c(aVar7, fVarC3);
                jdf.g gVar = (jdf.g) aVar6.T.get();
                vc.s.j(gVar);
                kbb.c cVar3 = new kbb.c(fVarC2, cVar2, gVar);
                msl.a aVar8 = new msl.a();
                trl.a aVar9 = pVar4.k;
                lsl.q qVar2 = new lsl.q(aVar9.k());
                gte.a aVarB2 = pVar4.f308692a.b();
                vc.s.j(aVarB2);
                ndf.f fVarC4 = aVar9.c();
                vc.s.j(fVarC4);
                lsl.l lVar = new lsl.l(aVar8, qVar2, aVarB2, fVarC4);
                msl.a aVar10 = new msl.a();
                nsl.k kVar = new nsl.k();
                trl.a aVar11 = pVar4.k;
                ndf.f fVarC5 = aVar11.c();
                vc.s.j(fVarC5);
                nbh.a aVar12 = new nbh.a();
                wul.o oVarK = aVar11.k();
                xul.l lVarH = aVar11.h();
                vc.s.j(lVarH);
                nsl.s sVar = new nsl.s(aVar10, kVar, fVarC5, aVar12, oVarK, lVarH);
                msl.a aVar13 = new msl.a();
                osl.j jVar = new osl.j();
                trl.a aVar14 = pVar4.k;
                ndf.f fVarC6 = aVar14.c();
                vc.s.j(fVarC6);
                nbh.a aVar15 = new nbh.a();
                wul.o oVarK2 = aVar14.k();
                xul.l lVarH2 = aVar14.h();
                vc.s.j(lVarH2);
                osl.o oVar = new osl.o(aVar13, jVar, fVarC6, aVar15, oVarK2, lVarH2);
                msl.a aVar16 = new msl.a();
                trl.a aVar17 = pVar4.k;
                xul.l lVarH3 = aVar17.h();
                vc.s.j(lVarH3);
                return new jsl.z0(cVar3, lVar, sVar, oVar, new rsl.s(aVar16, lVarH3, new nbh.a(), aVar17.k()));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        xsl.f fVar = (xsl.f) this.d;
        xsl.p pVar = (xsl.p) this.f305093b;
        int i = this.f305094c;
        if (i == 0) {
            o7.b orderQuoteInteractor = pVar.f308693b.a();
            usc.a fiatExchangeOrderQuoteInteractor = pVar.f308694c.a();
            bul.a convertedInputAmountProvider = new bul.a();
            xtl.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
            Intrinsics.checkNotNullParameter(fiatExchangeOrderQuoteInteractor, "fiatExchangeOrderQuoteInteractor");
            Intrinsics.checkNotNullParameter(convertedInputAmountProvider, "convertedInputAmountProvider");
            skm.p0 p0Var = skm.p0.f264001a;
            return new ytl.d(zkm.o.f323119a.e, orderQuoteInteractor, fiatExchangeOrderQuoteInteractor, convertedInputAmountProvider);
        }
        if (i == 1) {
            return new com.revolut.trading.orders.ui.invest.placement.flow.a(fVar.f308619a, pVar.d.b());
        }
        if (i != 2) {
            if (i != 3) {
                throw new AssertionError(i);
            }
            xtl.b.Companion.getClass();
            return new lvl.b();
        }
        kvl.f autoTopUpMapper = (kvl.f) fVar.f.get();
        wul.j scheduleSettingsMapper = pVar.k.f();
        xtl.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(autoTopUpMapper, "autoTopUpMapper");
        Intrinsics.checkNotNullParameter(scheduleSettingsMapper, "scheduleSettingsMapper");
        return new csl.i(autoTopUpMapper, scheduleSettingsMapper);
    }

    private final Object e() {
        xsl.i iVar = (xsl.i) this.d;
        xsl.p pVar = (xsl.p) this.f305093b;
        int i = this.f305094c;
        switch (i) {
            case 0:
                return a10.b.f((u8h.b) pVar.f308703r, "factory");
            case 1:
                return efk.j.d((dtl.a) iVar.i.get());
            case 2:
                return efk.j.q(pVar.C.a(), iVar.f308644b, (dtl.b) iVar.f308647h.get());
            case 3:
                return efk.j.r(pVar.C.a());
            case 4:
                return kii.e.j((u8h.b) pVar.f308703r, "factory");
            case 5:
                return ige.d.m(pVar.H.b(), iVar.d, (htl.d) iVar.f308649l.get());
            case 6:
                return ige.d.n(pVar.H.b());
            case 7:
                return efk.j.e((dtl.b) iVar.f308647h.get());
            case 8:
                InvestOrdersListFeatureContract$InputData investOrdersListFeatureContract$InputData = iVar.e;
                xsl.p pVar2 = iVar.f;
                InvestOrdersListFeatureContract$InputData investOrdersListFeatureContract$InputData2 = iVar.e;
                ntl.b.Companion.getClass();
                mtl.a aVar = new mtl.a(0);
                InvestOrdersListFeatureContract$InputData investOrdersListFeatureContract$InputData3 = iVar.e;
                ktl.a aVar2 = pVar2.H;
                ite.a aVar3 = pVar2.f308692a;
                htl.f fVarA = aVar2.a();
                z0h.q1 q1Var = (z0h.q1) iVar.o.get();
                d1h.h hVar = (d1h.h) iVar.f308652p.get();
                gte.a aVarB = aVar3.b();
                vc.s.j(aVarB);
                otl.a aVar4 = new otl.a(investOrdersListFeatureContract$InputData2, q1Var, hVar, aVarB);
                gte.a aVarB2 = aVar3.b();
                vc.s.j(aVarB2);
                mtl.r rVar = new mtl.r(investOrdersListFeatureContract$InputData3, fVarA, aVar4, aVarB2, new ks0.n(investOrdersListFeatureContract$InputData2));
                trl.a aVar5 = pVar.k;
                h9h.a aVar6 = pVar.i;
                vrl.g gVarB = aVar5.b();
                vc.s.j(gVarB);
                ybl.l lVarF = aVar6.f();
                aah.h hVar2 = (aah.h) iVar.f308646g.get();
                dtl.b bVar = (dtl.b) iVar.f308647h.get();
                ybl.q qVarW = aVar6.w();
                ks0.n nVar = new ks0.n(investOrdersListFeatureContract$InputData2);
                z5j.d dVarA = pVar.J.a();
                d1h.e eVar = (d1h.e) iVar.k.get();
                gte.a aVarB3 = pVar.f308692a.b();
                vc.s.j(aVarB3);
                tzg.m mVarT = pVar2.i.t();
                vc.s.j(mVarT);
                return new mtl.p(investOrdersListFeatureContract$InputData, aVar, rVar, gVarB, lVarF, hVar2, bVar, qVarW, nVar, dVarA, eVar, aVarB3, new ptl.a(mVarT));
            case 9:
                return a10.b.g((u8h.b) pVar.f308703r, "factory");
            case 10:
                return kii.e.k((u8h.b) pVar.f308703r);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        xsl.p pVar = (xsl.p) this.f305093b;
        xsl.j jVar = (xsl.j) this.d;
        int i = this.f305094c;
        switch (i) {
            case 0:
                return f0k.d.g(jVar.f308654a, ((z3h.g) pVar.M).h(), (e3h.d) jVar.i.get(), jVar.f308656c);
            case 1:
                InvestmentProjectionsScreenContract$InputData inputData = jVar.f308655b;
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                bvl.a provider = new bvl.a();
                avl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                String str = inputData.f107031a;
                eel.c cVar = eel.c.ONE_DAY;
                List listK = zhm.v.k(cVar, eel.c.ONE_WEEK, eel.c.ONE_MONTH, eel.c.SIX_MONTHS, eel.c.ONE_YEAR, eel.c.FIVE_YEAR, eel.c.ALL);
                TradingAccountType[] elements = {TradingAccountType.Gia.f105270a, TradingAccountType.Taa.f105275a};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new e3h.d(str, listK, cVar, kotlin.collections.d.y0(elements), false, null, true, false, false, null, NewHope.SENDA_BYTES);
            case 2:
                yji.o controller = (com.revolut.kompot.navigable.a) jVar.k.get();
                Intrinsics.checkNotNullParameter(controller, "controller");
                z0h.s1 s1Var = (z0h.s1) controller;
                vc.s.k(s1Var);
                return s1Var;
            case 3:
                return a10.b.f((u8h.b) pVar.f308703r, "factory");
            case 4:
                hsl.h hVar = (hsl.h) pVar.k.R.get();
                vc.s.j(hVar);
                return ka1.c.l(hVar, jVar.d, (jdf.e) jVar.f308662n.get());
            case 5:
                hsl.h factory = (hsl.h) pVar.k.R.get();
                vc.s.j(factory);
                kdf.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return new hsl.g();
            case 6:
                return agk.b.g(((z3h.g) pVar.M).f(), jVar.e, (a3h.c) jVar.f308663p.get());
            case 7:
                return agk.b.h(((z3h.g) pVar.M).f(), jVar.f);
            case 8:
                InvestmentProjectionsScreenContract$InputData investmentProjectionsScreenContract$InputData = jVar.f308655b;
                zul.n0 n0Var = (zul.n0) jVar.f308666s.get();
                zul.p pVar2 = (zul.p) jVar.f308667t.get();
                jdf.e eVar = (jdf.e) jVar.f308662n.get();
                trl.a aVar = pVar.k;
                zdl.c cVar2 = pVar.e;
                hsl.q qVar = (hsl.q) aVar.S.get();
                vc.s.j(qVar);
                nil.c cVarA = pVar.f308702q.a();
                vc.s.j(cVarA);
                ybl.b bVarB = cVar2.b();
                vc.s.j(bVarB);
                ybl.l lVarF = pVar.i.f();
                z0h.d dVarC = ((u8h.b) pVar.f308703r).c();
                vc.s.j(dVarC);
                ael.d0 d0VarK = cVar2.k();
                vc.s.j(d0VarK);
                zul.a aVar2 = new zul.a();
                a3h.c cVar3 = (a3h.c) jVar.f308663p.get();
                gte.a aVarB = pVar.f308692a.b();
                vc.s.j(aVarB);
                e3h.a extensions = (e3h.a) jVar.f308659j.get();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                return new com.revolut.trading.orders.ui.screens.investment_plan.projection.a(investmentProjectionsScreenContract$InputData, n0Var, pVar2, eVar, qVar, cVarA, bVarB, lVarF, dVarC, d0VarK, aVar2, cVar3, aVarB, extensions.f122271b);
            case 9:
                xsl.p pVar3 = jVar.f308658h;
                zul.m0 m0Var = new zul.m0(new nbh.a());
                zul.h0 h0Var = new zul.h0();
                xsl.p pVar4 = jVar.f308658h;
                trl.a aVar3 = pVar4.k;
                m2h.b bVar = pVar4.M;
                ite.a aVar4 = pVar4.f308692a;
                jdf.g gVar = (jdf.g) aVar3.T.get();
                vc.s.j(gVar);
                ruk.a0 a0Var = new ruk.a0((z0h.q1) jVar.f308665r.get());
                x3h.a aVar5 = new x3h.a();
                gte.a aVarB2 = aVar4.b();
                vc.s.j(aVarB2);
                z3h.g gVar2 = (z3h.g) bVar;
                e4h.h hVarG = gVar2.g();
                e3h.f fVarN = f0k.d.n(jVar.f308657g, gVar2.h());
                gte.a aVarB3 = aVar4.b();
                vc.s.j(aVarB3);
                return new zul.n0(m0Var, h0Var, new zul.k0(gVar, a0Var, aVar5, aVarB2, hVarG, fVarN, new zul.g0(aVarB3)));
            case 10:
                return a10.b.g((u8h.b) pVar.f308703r, "factory");
            case 11:
                return new zul.f0();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        jdh.b bVar = ((xsl.p) this.f305093b).N;
        xsl.k kVar = (xsl.k) this.d;
        int i = this.f305094c;
        if (i == 0) {
            gdh.a aVar = (gdh.a) kVar.f308669b.get();
            f9f.b.e(aVar);
            return aVar;
        }
        if (i == 1) {
            kbb.c factory = bVar.a();
            Intrinsics.checkNotNullParameter(factory, "factory");
            return factory.s();
        }
        if (i == 2) {
            return f9f.b.j((gdh.a) kVar.f308669b.get());
        }
        if (i == 3) {
            return new com.revolut.trading.orders.ui.flows.trading_asset_details.a(new btl.f(new d4h.b()), kVar.f308668a, bVar.b(), (gdh.a) kVar.f308669b.get(), new d4h.b());
        }
        throw new AssertionError(i);
    }

    private final Object h() {
        xsl.p pVar = (xsl.p) this.f305093b;
        u8h.c cVar = pVar.f308703r;
        xsl.n nVar = (xsl.n) this.d;
        xsl.p pVar2 = nVar.d;
        odf.f inputData = nVar.f308680c;
        int i = this.f305094c;
        if (i == 0) {
            return a10.b.f((u8h.b) cVar, "factory");
        }
        if (i == 1) {
            return kii.e.j((u8h.b) cVar, "factory");
        }
        if (i != 2) {
            if (i == 3) {
                return a10.b.g((u8h.b) cVar, "factory");
            }
            if (i == 4) {
                return kii.e.k((u8h.b) cVar);
            }
            throw new AssertionError(i);
        }
        dvl.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        odf.b bVar = inputData.e;
        cvl.l lVar = new cvl.l(8190, bVar != null ? bVar.f224458b : null);
        cvl.v vVar = new cvl.v(pVar2.k.g(), (z0h.q1) nVar.f308681g.get());
        cvl.j jVar = new cvl.j();
        ddf.a sourcePocketInteractor = (ddf.a) pVar2.k.f273811b0.get();
        vc.s.j(sourcePocketInteractor);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sourcePocketInteractor, "sourcePocketInteractor");
        r10.a aVar = new r10.a();
        aVar.f250811a = inputData;
        aVar.f250812b = sourcePocketInteractor;
        ybl.b bVarB = pVar2.e.b();
        vc.s.j(bVarB);
        fvl.m mVar = new fvl.m(inputData, bVarB, (aah.h) nVar.e.get());
        fvl.e eVar = new fvl.e(inputData);
        fvl.l lVar2 = new fvl.l(inputData);
        d1h.e eVar2 = (d1h.e) nVar.f.get();
        gte.a aVarB = pVar.f308692a.b();
        vc.s.j(aVarB);
        return new com.revolut.trading.orders.ui.screens.pocket_picker.b(lVar, vVar, jVar, aVar, mVar, eVar, lVar2, eVar2, aVarB, new fvl.h((d1h.h) nVar.f308682h.get()), new fvl.k());
    }

    @Override // phm.a
    public final Object get() {
        Object cVar;
        Object a0Var;
        BigDecimal bigDecimal;
        switch (this.f305092a) {
            case 0:
                u1 u1Var = (u1) this.d;
                y1 y1Var = (y1) this.f305093b;
                r1 r1Var = y1Var.f305171a;
                int i = this.f305094c;
                if (i == 0) {
                    return kxa.j.l((j60.a) u1Var.d.get());
                }
                if (i == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) u1Var.f305105b.get(), (rp0.m) u1Var.f305106c.get());
                }
                if (i == 2) {
                    return new rp0.m();
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return new hh6.c();
                        }
                        throw new AssertionError(i);
                    }
                    bh6.c cVar2 = (bh6.c) y1Var.f305176j.get();
                    bh6.h hVar = (bh6.h) y1Var.k.get();
                    je6.h hVarC = ((t) y1Var.f305175h).c();
                    vc.s.j(hVarC);
                    return new hh6.q(cVar2, hVar, hVarC);
                }
                jki.p pVar = (jki.p) u1Var.f.get();
                MandateDetailsScreenContract$InputData mandateDetailsScreenContract$InputData = u1Var.f305104a;
                bh6.a aVar = (bh6.a) y1Var.f305177l.get();
                xg6.x xVarA = r1Var.a();
                vc.s.j(xVarA);
                bh6.j jVar = (bh6.j) y1Var.f305178m.get();
                j60.a aVar2 = (j60.a) u1Var.d.get();
                hh6.b bVar = (hh6.b) u1Var.f305107g.get();
                oe6.j jVar2 = (oe6.j) r1Var.f305031w.get();
                vc.s.j(jVar2);
                wj0.a aVarI = ((nj0.d) y1Var.f305174g).i();
                vc.s.j(aVarI);
                return new hh6.p(pVar, mandateDetailsScreenContract$InputData, aVar, xVarA, jVar, aVar2, bVar, jVar2, aVarI);
            case 1:
                v1 v1Var = (v1) this.d;
                int i2 = this.f305094c;
                if (i2 == 0) {
                    return new fh6.k((cli.n) v1Var.f305120c.get(), v1Var.f305118a);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                u80.o oVar = new u80.o();
                w80.b bVarJ = ((y1) this.f305093b).d.j();
                vc.s.j(bVarJ);
                return new fh6.m(oVar, bVarJ);
            case 2:
                w1 w1Var = (w1) this.d;
                y1 y1Var2 = (y1) this.f305093b;
                r1 r1Var2 = y1Var2.f305171a;
                int i3 = this.f305094c;
                if (i3 != 0) {
                    if (i3 == 1) {
                        return new jh6.b();
                    }
                    throw new AssertionError(i3);
                }
                MandateResultScreenContract$InputData mandateResultScreenContract$InputData = w1Var.f305131a;
                xg6.x xVarA2 = r1Var2.a();
                vc.s.j(xVarA2);
                oe6.j jVar3 = (oe6.j) r1Var2.f305031w.get();
                vc.s.j(jVar3);
                jh6.a aVar3 = (jh6.a) w1Var.f305132b.get();
                wj0.a aVarI2 = ((nj0.d) y1Var2.f305174g).i();
                vc.s.j(aVarI2);
                return new jh6.g(mandateResultScreenContract$InputData, xVarA2, jVar3, aVar3, aVarI2);
            case 3:
                x1 x1Var = (x1) this.d;
                y1 y1Var3 = (y1) this.f305093b;
                int i5 = this.f305094c;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return new com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.c((bh6.h) y1Var3.k.get());
                    }
                    if (i5 == 2) {
                        return new ch6.p();
                    }
                    throw new AssertionError(i5);
                }
                cli.n nVar = (cli.n) x1Var.f305159b.get();
                MandateSetupBottomSheetContract$InputData mandateSetupBottomSheetContract$InputData = x1Var.f305158a;
                xg6.x xVarA3 = y1Var3.f305171a.a();
                vc.s.j(xVarA3);
                ch6.o oVar2 = (ch6.o) x1Var.f305160c.get();
                bh6.j jVar4 = (bh6.j) y1Var3.f305178m.get();
                fk3.a aVarA = y1Var3.f.a();
                vc.s.j(aVarA);
                wj0.a aVarI3 = ((nj0.d) y1Var3.f305174g).i();
                vc.s.j(aVarI3);
                return new com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.b(nVar, mandateSetupBottomSheetContract$InputData, xVarA3, oVar2, jVar4, aVarA, aVarI3);
            case 4:
                z1 z1Var = (z1) this.d;
                y1 y1Var4 = (y1) this.f305093b;
                int i6 = this.f305094c;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            return new lh6.c();
                        }
                        throw new AssertionError(i6);
                    }
                    UpdateLimitsScreenContract$InputData updateLimitsScreenContract$InputData = z1Var.f305188a;
                    bh6.h hVar2 = (bh6.h) y1Var4.k.get();
                    qd0.b bVarN = y1Var4.d.n();
                    vc.s.j(bVarN);
                    return new lh6.n(updateLimitsScreenContract$InputData, hVar2, bVarN, (lh6.b) z1Var.f305190c.get());
                }
                cli.n nVar2 = (cli.n) z1Var.d.get();
                UpdateLimitsScreenContract$InputData updateLimitsScreenContract$InputData2 = z1Var.f305188a;
                xg6.x xVarA4 = y1Var4.f305171a.a();
                vc.s.j(xVarA4);
                bh6.j jVar5 = (bh6.j) y1Var4.f305178m.get();
                fk3.a aVarA2 = y1Var4.f.a();
                vc.s.j(aVarA2);
                wj0.a aVarI4 = ((nj0.d) y1Var4.f305174g).i();
                vc.s.j(aVarI4);
                return new com.revolut.feature.external_accounts.impl.mandate.update_limits.a(nVar2, updateLimitsScreenContract$InputData2, xVarA4, jVar5, aVarA2, aVarI4);
            case 5:
                w2 w2Var = (w2) this.f305093b;
                b2 b2Var = (b2) this.d;
                w2 w2Var2 = b2Var.f304799b;
                int i21 = this.f305094c;
                if (i21 != 0) {
                    if (i21 == 1) {
                        return new aj6.y((hi6.o) b2Var.f304800c.get());
                    }
                    if (i21 != 2) {
                        throw new AssertionError(i21);
                    }
                    hi6.k kVar = new hi6.k(b2Var.b());
                    hi6.d dVar = new hi6.d(b2Var.b());
                    hi6.i iVar = new hi6.i(b2Var.b());
                    hi6.b bVarB = b2Var.b();
                    gte.a aVarB = w2Var2.f305145p.b();
                    vc.s.j(aVarB);
                    c91.a aVarA3 = w2Var2.u.a();
                    vc.s.j(aVarA3);
                    hi6.g gVar = new hi6.g(bVarB, aVarB, aVarA3);
                    bj6.b.Companion.getClass();
                    Clock clockSystemDefaultZone = Clock.systemDefaultZone();
                    Intrinsics.checkNotNullExpressionValue(clockSystemDefaultZone, "systemDefaultZone(...)");
                    vc.s.k(clockSystemDefaultZone);
                    return new hi6.p(kVar, dVar, iVar, gVar, clockSystemDefaultZone);
                }
                cli.n nVar3 = (cli.n) b2Var.d.get();
                aj6.l lVar = b2Var.f304798a;
                g6e.d dVarB = w2Var2.v.b();
                vc.s.j(dVarB);
                wsg.n nVarB = w2Var2.f305144n.b();
                al4.n nVarS = w2Var2.f305150w.s();
                vc.s.j(nVarS);
                g48.r0 r0VarC = w2Var2.f305148s.c();
                ang.f fVarE = w2Var2.f305151x.e();
                bd3.a aVarA4 = w2Var2.f305152y.a();
                vc.s.j(aVarA4);
                twg.c cVarA = w2Var2.z.a();
                hj8.a aVarA5 = w2Var2.A.a();
                vc.s.j(aVarA5);
                y45.i iVarI = w2Var2.f305149t.i();
                djb.n nVarA = w2Var2.B.a();
                vc.s.j(nVarA);
                psi.a aVarA6 = w2Var2.C.a();
                vc.s.j(aVarA6);
                gte.a aVarB2 = w2Var2.f305145p.b();
                vc.s.j(aVarB2);
                fi6.h hVar3 = new fi6.h(dVarB, nVarB, nVarS, r0VarC, fVarE, aVarA4, cVarA, aVarA5, iVarI, nVarA, aVarA6, aVarB2);
                r10.a aVar4 = new r10.a(w2Var2.D.a(), w2Var2.f305144n.b());
                oe6.m mVarF = ((t) w2Var.f305139g).f();
                vc.s.j(mVarF);
                return new aj6.x(nVar3, lVar, hVar3, aVar4, mVarF, (xg6.b) w2Var.U.get(), ((blb.e) w2Var.H).e());
            case 6:
                je6.g gVar2 = ((w2) this.f305093b).f305139g;
                c2 c2Var = (c2) this.d;
                w2 w2Var3 = c2Var.f304811b;
                int i22 = this.f305094c;
                if (i22 != 0) {
                    if (i22 == 1) {
                        return new qee.s((hi6.o) c2Var.f304812c.get());
                    }
                    if (i22 != 2) {
                        throw new AssertionError(i22);
                    }
                    hi6.k kVar2 = new hi6.k(c2Var.b());
                    hi6.d dVar2 = new hi6.d(c2Var.b());
                    hi6.i iVar2 = new hi6.i(c2Var.b());
                    hi6.b bVarB2 = c2Var.b();
                    gte.a aVarB3 = w2Var3.f305145p.b();
                    vc.s.j(aVarB3);
                    c91.a aVarA7 = w2Var3.u.a();
                    vc.s.j(aVarA7);
                    hi6.g gVar3 = new hi6.g(bVarB2, aVarB3, aVarA7);
                    xi6.b.Companion.getClass();
                    Clock clockSystemDefaultZone2 = Clock.systemDefaultZone();
                    Intrinsics.checkNotNullExpressionValue(clockSystemDefaultZone2, "systemDefaultZone(...)");
                    vc.s.k(clockSystemDefaultZone2);
                    return new hi6.p(kVar2, dVar2, iVar2, gVar3, clockSystemDefaultZone2);
                }
                cli.n nVar4 = (cli.n) c2Var.d.get();
                wi6.i iVar3 = c2Var.f304810a;
                g6e.d dVarB2 = w2Var3.v.b();
                vc.s.j(dVarB2);
                wsg.n nVarB2 = w2Var3.f305144n.b();
                al4.n nVarS2 = w2Var3.f305150w.s();
                vc.s.j(nVarS2);
                g48.r0 r0VarC2 = w2Var3.f305148s.c();
                ang.f fVarE2 = w2Var3.f305151x.e();
                bd3.a aVarA8 = w2Var3.f305152y.a();
                vc.s.j(aVarA8);
                twg.c cVarA2 = w2Var3.z.a();
                hj8.a aVarA9 = w2Var3.A.a();
                vc.s.j(aVarA9);
                y45.i iVarI2 = w2Var3.f305149t.i();
                djb.n nVarA2 = w2Var3.B.a();
                vc.s.j(nVarA2);
                psi.a aVarA10 = w2Var3.C.a();
                vc.s.j(aVarA10);
                gte.a aVarB4 = w2Var3.f305145p.b();
                vc.s.j(aVarB4);
                fi6.h hVar4 = new fi6.h(dVarB2, nVarB2, nVarS2, r0VarC2, fVarE2, aVarA8, cVarA2, aVarA9, iVarI2, nVarA2, aVarA10, aVarB4);
                r10.a aVar5 = new r10.a(w2Var3.D.a(), w2Var3.f305144n.b());
                oe6.m mVarF2 = ((t) gVar2).f();
                vc.s.j(mVarF2);
                xg6.d dVar3 = (xg6.d) ((t) gVar2).f305078r0.get();
                vc.s.j(dVar3);
                return new wi6.t(nVar4, iVar3, hVar4, aVar5, mVarF2, dVar3);
            case 7:
                w2 w2Var4 = (w2) this.f305093b;
                mjl.q qVar = w2Var4.E;
                i2 i2Var = (i2) this.d;
                int i32 = this.f305094c;
                if (i32 == 0) {
                    jpl.b extension = (jpl.b) i2Var.d.get();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    vc.s.k(extension);
                    return extension;
                }
                if (i32 == 1) {
                    gjl.b modelExtension = (gjl.b) i2Var.f304891c.get();
                    r10.q factory = ((mjl.m) qVar).a();
                    Intrinsics.checkNotNullParameter(modelExtension, "controllerModelExtension");
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
                    return new jpl.b(modelExtension);
                }
                if (i32 == 2) {
                    r10.q factory2 = ((mjl.m) qVar).a();
                    gte.a featureToggleInteractor = w2Var4.f305145p.b();
                    vc.s.j(featureToggleInteractor);
                    Intrinsics.checkNotNullParameter(factory2, "factory");
                    Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                    return new jpl.d((akl.f0) factory2.f250849b, (akl.o0) factory2.f250850c, ((jte.d) featureToggleInteractor).c(RevolutOAuthRetailFeatureApi$Toggles$RevolutOAuthConnectedApps.f104445c), (rqk.m) factory2.d);
                }
                if (i32 == 3) {
                    Object extension2 = (gjl.b) i2Var.f304891c.get();
                    Intrinsics.checkNotNullParameter(extension2, "extension");
                    yji.n nVar5 = (yji.n) extension2;
                    vc.s.k(nVar5);
                    return nVar5;
                }
                if (i32 == 4) {
                    cli.n nVar6 = (cli.n) i2Var.f304892g.get();
                    oe6.m mVarF3 = ((t) w2Var4.f305139g).f();
                    vc.s.j(mVarF3);
                    uw1.c cVarD = ((lz1.m) w2Var4.F).d();
                    vc.s.j(cVarD);
                    return new com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.b(nVar6, mVarF3, cVarD, w2Var4.f305148s.c(), ((c21.b) w2Var4.G).c(), (gjl.b) i2Var.f304891c.get(), i2Var.f304889a);
                }
                if (i32 != 5) {
                    throw new AssertionError(i32);
                }
                r10.q factory3 = ((mjl.m) i2Var.f304890b.E).a();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                jpl.f connectedAppsListItemsMapper = new jpl.f();
                Intrinsics.checkNotNullParameter(connectedAppsListItemsMapper, "connectedAppsListItemsMapper");
                return new hl6.z();
            case 8:
                k2 k2Var = (k2) this.d;
                ConsentsListScreenContract$InputData consentsListScreenContract$InputData = k2Var.f304916a;
                int i33 = this.f305094c;
                if (i33 != 0) {
                    if (i33 == 1) {
                        return new ql6.v(consentsListScreenContract$InputData);
                    }
                    throw new AssertionError(i33);
                }
                oe6.m mVarF4 = ((t) ((w2) this.f305093b).f305139g).f();
                vc.s.j(mVarF4);
                return new com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.a(mVarF4, (cli.n) k2Var.f304917b.get(), consentsListScreenContract$InputData);
            case 9:
                n2 n2Var = (n2) this.d;
                InactiveConsentsListScreenContract$InputData inactiveConsentsListScreenContract$InputData = n2Var.f304966a;
                int i43 = this.f305094c;
                if (i43 != 0) {
                    if (i43 == 1) {
                        return new tl6.m(inactiveConsentsListScreenContract$InputData);
                    }
                    throw new AssertionError(i43);
                }
                cli.n nVar7 = (cli.n) n2Var.f304967b.get();
                oe6.m mVarF5 = ((t) ((w2) this.f305093b).f305139g).f();
                vc.s.j(mVarF5);
                return new com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.a(nVar7, mVarF5, inactiveConsentsListScreenContract$InputData);
            case 10:
                q2 q2Var = (q2) this.d;
                w2 w2Var5 = q2Var.f305009b;
                int i59 = this.f305094c;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new AssertionError(i59);
                    }
                    je0.d dVarD = w2Var5.f305136b.d();
                    vc.s.j(dVarD);
                    return new pi6.g(new tnb.g0(dVarD));
                }
                OpenBankingAuthAccountsFlowContract$InputData openBankingAuthAccountsFlowContract$InputData = q2Var.f305008a;
                pi6.d dVar4 = (pi6.d) q2Var.d.get();
                oe6.m mVarF6 = ((t) ((w2) this.f305093b).f305139g).f();
                vc.s.j(mVarF6);
                sf0.h hVarB = w2Var5.i.b();
                vc.s.j(hVarB);
                v60.e eVarA = w2Var5.f305141j.a();
                vc.s.j(eVarA);
                return new com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.a(openBankingAuthAccountsFlowContract$InputData, dVar4, mVarF6, new e52.c(hVarB, eVarA, 1));
            case 11:
                r2 r2Var = (r2) this.d;
                w2 w2Var6 = r2Var.f305035b;
                w2 w2Var7 = (w2) this.f305093b;
                int i66 = this.f305094c;
                if (i66 == 0) {
                    wj0.a idempotencyKeyHolder = ((nj0.d) w2Var7.d).i();
                    vc.s.j(idempotencyKeyHolder);
                    l80.e dateProvider = w2Var7.e.h();
                    vc.s.j(dateProvider);
                    qi6.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                    Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                    return new m60.b(idempotencyKeyHolder, dateProvider, "OPEN_BANKING_OUTBOUND_IDEMPOTENCY_KEY");
                }
                if (i66 == 1) {
                    r10.f factory4 = w2Var7.f.a();
                    qi6.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory4, "factory");
                    return factory4.d();
                }
                if (i66 != 2) {
                    if (i66 == 3) {
                        return new pi6.u();
                    }
                    if (i66 != 4) {
                        throw new AssertionError(i66);
                    }
                    je0.d dVarD2 = w2Var6.f305136b.d();
                    vc.s.j(dVarD2);
                    return new pi6.g(new tnb.g0(dVarD2));
                }
                pi6.k kVar3 = r2Var.f305034a;
                oe6.m mVarF7 = ((t) w2Var7.f305139g).f();
                vc.s.j(mVarF7);
                ad2.a aVar6 = (ad2.a) w2Var7.f305140h.f133865j.get();
                vc.s.j(aVar6);
                pi6.u uVar = (pi6.u) r2Var.f.get();
                pi6.d dVar5 = (pi6.d) r2Var.f305037g.get();
                sf0.h hVarB2 = w2Var6.i.b();
                vc.s.j(hVarB2);
                v60.e eVarA2 = w2Var6.f305141j.a();
                vc.s.j(eVarA2);
                return new com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d(kVar3, mVarF7, aVar6, uVar, dVar5, new e52.c(hVarB2, eVarA2, 1), new fj6.f(), w2Var7.k.c());
            case 12:
                u2 u2Var = (u2) this.d;
                w2 w2Var8 = (w2) this.f305093b;
                int i74 = this.f305094c;
                if (i74 == 0) {
                    wj0.a idempotencyKeyHolder2 = ((nj0.d) w2Var8.d).i();
                    vc.s.j(idempotencyKeyHolder2);
                    l80.e dateProvider2 = w2Var8.e.h();
                    vc.s.j(dateProvider2);
                    gk6.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(idempotencyKeyHolder2, "idempotencyKeyHolder");
                    Intrinsics.checkNotNullParameter(dateProvider2, "dateProvider");
                    return new m60.b(idempotencyKeyHolder2, dateProvider2, "OPEN_BANKING_OUTBOUND_IDEMPOTENCY_KEY");
                }
                if (i74 == 1) {
                    r10.f factory5 = w2Var8.f.a();
                    gk6.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory5, "factory");
                    return factory5.d();
                }
                if (i74 == 2) {
                    return new com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d((com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a) w2Var8.Y.get(), new lk6.g0(), u2Var.f305109a, (wj6.m) u2Var.f.get(), (hk6.k) u2Var.f305112g.get());
                }
                if (i74 == 3) {
                    return new wj6.m();
                }
                if (i74 == 4) {
                    return new hk6.k();
                }
                throw new AssertionError(i74);
            case 13:
                w2 w2Var9 = (w2) this.f305093b;
                int i92 = this.f305094c;
                if (i92 != 0) {
                    if (i92 == 1) {
                        return new com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.funds_confirmation.a(((y2) this.d).f305179a);
                    }
                    throw new AssertionError(i92);
                }
                wj0.a idempotencyKeyHolder3 = ((nj0.d) w2Var9.d).i();
                vc.s.j(idempotencyKeyHolder3);
                l80.e dateProvider3 = w2Var9.e.h();
                vc.s.j(dateProvider3);
                oi6.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(idempotencyKeyHolder3, "idempotencyKeyHolder");
                Intrinsics.checkNotNullParameter(dateProvider3, "dateProvider");
                return new m60.b(idempotencyKeyHolder3, dateProvider3, "OPEN_BANKING_OUTBOUND_IDEMPOTENCY_KEY");
            case 14:
                z2 z2Var = (z2) this.d;
                w2 w2Var10 = z2Var.f305192b;
                int i96 = this.f305094c;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new AssertionError(i96);
                    }
                    l70.e eVar = w2Var10.e;
                    qd0.b bVarN2 = eVar.n();
                    vc.s.j(bVarN2);
                    u80.m mVar = new u80.m(bVarN2);
                    t70.b bVarG = eVar.g();
                    vc.s.j(bVarG);
                    ei6.b bVar2 = new ei6.b(mVar, bVarG);
                    t70.g gVarO = eVar.o();
                    vc.s.j(gVarO);
                    return new a3e.u(new ri6.f(bVar2, gVarO));
                }
                cli.n nVar8 = (cli.n) z2Var.f305193c.get();
                OpenBankingFundsConfirmationScreenContract$InputData openBankingFundsConfirmationScreenContract$InputData = z2Var.f305191a;
                oe6.m mVarF8 = ((t) ((w2) this.f305093b).f305139g).f();
                vc.s.j(mVarF8);
                oe6.m mVarF9 = ((t) w2Var10.f305139g).f();
                vc.s.j(mVarF9);
                ri6.c cVar3 = new ri6.c(mVarF9, w2Var10.f305144n.b(), w2Var10.f305148s.c());
                sf0.h hVarB3 = w2Var10.i.b();
                vc.s.j(hVarB3);
                v60.e eVarA3 = w2Var10.f305141j.a();
                vc.s.j(eVarA3);
                return new cj6.n(nVar8, openBankingFundsConfirmationScreenContract$InputData, mVarF8, cVar3, new e52.c(hVarB3, eVarA3, 1));
            case 15:
                xg4.d dVar6 = (xg4.d) this.f305093b;
                xg4.a aVar7 = (xg4.a) this.d;
                int i99 = this.f305094c;
                switch (i99) {
                    case 0:
                        ypi.h hVar5 = aVar7.f305498b;
                        fsi.g gVar4 = aVar7.f305497a;
                        return new ypi.e(hVar5, bq.i.b(gVar4), bq.i.o(gVar4), bq.i.g(gVar4));
                    case 1:
                        return new hqi.f(aVar7.f305499c, bq.i.b(aVar7.f305497a));
                    case 2:
                        return kpi.f.a();
                    case 3:
                        Context contextI = bq.i.i(aVar7.f305497a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar7.f305497a);
                        t70.g gVarO2 = dVar6.f305544b.o();
                        vc.s.j(gVarO2);
                        cVar = new npi.c(contextI, baseDelegatesActivityF, gVarO2);
                        break;
                    case 4:
                        return new tpi.i((rpi.c) aVar7.f305502j.get(), gsi.c.a(aVar7.f305497a));
                    case 5:
                        return new rpi.b(bq.i.b(aVar7.f305497a));
                    case 6:
                        return new rpi.h(bq.i.b(aVar7.f305497a));
                    case 7:
                        cVar = new iri.g((iri.j) dVar6.f305561r.get(), (iri.m) dVar6.C.get(), bq.i.f(aVar7.f305497a), bq.i.l(aVar7.f305497a));
                        break;
                    case 8:
                        cVar = new iri.l((iri.m) dVar6.C.get(), bq.i.f(aVar7.f305497a), (iri.d) aVar7.f305505n.get());
                        break;
                    case 9:
                        return new iri.d(bq.i.f(aVar7.f305497a));
                    case 10:
                        return new opi.b(bq.i.f(aVar7.f305497a));
                    case 11:
                        return new qi3.l(bq.i.l(aVar7.f305497a), (f9b.f) aVar7.f305507q.get(), (qi3.r) dVar6.z0.get(), (com.revolut.feature.chooser.c) dVar6.A0.get(), aVar7.d, (ypi.i) aVar7.f.get(), (hqi.l) aVar7.f305500g.get(), (opi.d) aVar7.f305506p.get(), (tpi.j) aVar7.k.get(), bq.i.o(aVar7.f305497a));
                    case 12:
                        return bq.i.t(aVar7.f305497a);
                    default:
                        throw new AssertionError(i99);
                }
                return cVar;
            case 16:
                xg4.d dVar7 = (xg4.d) this.f305093b;
                xg4.b bVar3 = (xg4.b) this.d;
                int i100 = this.f305094c;
                switch (i100) {
                    case 0:
                        return bq.i.u(bVar3.e());
                    case 1:
                        return bq.i.B(bVar3.e());
                    case 2:
                        return bq.i.q(bVar3.e());
                    case 3:
                        return hsi.b.v(bVar3.e());
                    case 4:
                        return h7d.a.l(bVar3.e());
                    case 5:
                        return bq.i.w(bVar3.e());
                    case 6:
                        return hsi.b.A(bVar3.e());
                    case 7:
                        return new opi.b(bVar3.f());
                    case 8:
                        return new iri.g((iri.j) dVar7.f305561r.get(), (iri.m) bVar3.f305514j.get(), bVar3.f(), (sri.m) bVar3.k.get());
                    case 9:
                        return new iri.b();
                    case 10:
                        Activity activityE = bVar3.e();
                        gq3.a aVar8 = gq3.b.Companion;
                        xoi.d coreActivityApi = bVar3.f305509a;
                        aVar8.getClass();
                        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
                        return bq.i.c(activityE, coreActivityApi.f307857a.f146538b);
                    case 11:
                        return new iri.l((iri.m) bVar3.f305514j.get(), bVar3.f(), (iri.d) bVar3.f305516m.get());
                    case 12:
                        return new iri.d(bVar3.f());
                    case 13:
                        return hsi.b.B(bVar3.e());
                    case 14:
                        return hsi.b.y(bVar3.e());
                    case 15:
                        return bq.i.y(bVar3.e());
                    case 16:
                        return h7d.a.n(bVar3.e());
                    case 17:
                        return h7d.a.r(bVar3.e());
                    case 18:
                        return h7d.a.g(bVar3.e());
                    case 19:
                        CreditApplicationCloseLegacyContract$Configuration creditApplicationCloseLegacyContract$Configuration = bVar3.f305510b;
                        sri.m mVar2 = (sri.m) bVar3.k.get();
                        dq3.a aVar9 = (dq3.a) dVar7.B0.get();
                        opi.d dVar8 = (opi.d) bVar3.i.get();
                        eq3.b bVar4 = (eq3.b) dVar7.f305557n0.get();
                        mri.w wVarA = ((ozl.a) dVar7.f305554l).a();
                        vc.s.j(wVarA);
                        wli.x xVarD = ((s41.a) dVar7.k).d();
                        hw3.c cVar4 = (hw3.c) ((dw3.c1) dVar7.d).f118472s0.get();
                        vc.s.j(cVar4);
                        return new fq3.j(creditApplicationCloseLegacyContract$Configuration, mVar2, aVar9, dVar8, bVar4, wVarA, xVarD, cVar4);
                    default:
                        throw new AssertionError(i100);
                }
            case 17:
                return a();
            case 18:
                int i101 = this.f305094c;
                if (i101 != 0) {
                    if (i101 == 1) {
                        return new qk2.j();
                    }
                    throw new AssertionError(i101);
                }
                cli.n nVar9 = (cli.n) ((xj2.h) this.d).f306463a.get();
                l93.f fVarJ = ((xj2.n) this.f305093b).f306484m.j();
                vc.s.j(fVarJ);
                return new qk2.g(nVar9, fVarJ);
            case 19:
                xj2.n nVar10 = (xj2.n) this.f305093b;
                efk.a aVar10 = nVar10.k;
                int i102 = this.f305094c;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new AssertionError(i102);
                    }
                    egk.e eVarE = nVar10.f306481h.e();
                    vc.s.j(eVarE);
                    return new ck2.h(eVarE);
                }
                cli.n nVar11 = (cli.n) ((xj2.l) this.d).f306472a.get();
                ffk.t tVarF = aVar10.f();
                vc.s.j(tVarF);
                ffk.j jVarG = aVar10.g();
                vc.s.j(jVarG);
                return new ck2.d(nVar11, tVarF, jVarG);
            case 20:
                xj2.m mVar3 = (xj2.m) this.d;
                xj2.n nVar12 = (xj2.n) this.f305093b;
                int i103 = this.f305094c;
                if (i103 != 0) {
                    if (i103 == 1) {
                        return new nk2.i();
                    }
                    throw new AssertionError(i103);
                }
                cli.n nVar13 = (cli.n) mVar3.f306475b.get();
                AtmWithdrawalLimitsBottomSheetScreenContract$InputData atmWithdrawalLimitsBottomSheetScreenContract$InputData = mVar3.f306474a;
                l93.f fVarJ2 = nVar12.f306484m.j();
                vc.s.j(fVarJ2);
                jla.h hVarA = nVar12.f306486p.a();
                l61.a aVarB5 = nVar12.f306479c.b();
                vc.s.j(aVarB5);
                return new nk2.d(nVar13, atmWithdrawalLimitsBottomSheetScreenContract$InputData, fVarJ2, hVarA, new bk2.b(aVarB5));
            case 21:
                xsl.a aVar11 = (xsl.a) this.d;
                int i104 = this.f305094c;
                switch (i104) {
                    case 0:
                        return kxa.j.k((j60.a) aVar11.e.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) aVar11.f308573c.get(), (rp0.m) aVar11.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        ttl.o oVar3 = aVar11.f308571a;
                        ttl.a0 a0Var2 = (ttl.a0) aVar11.f308575h.get();
                        ttl.q qVar2 = (ttl.q) aVar11.i.get();
                        ttl.s sVar = (ttl.s) aVar11.f308576j.get();
                        j60.a aVar12 = (j60.a) aVar11.e.get();
                        ybl.b bVarB3 = ((xsl.p) this.f305093b).e.b();
                        vc.s.j(bVarB3);
                        nvl.j jVar6 = (nvl.j) aVar11.k.get();
                        l80.e eVarH = aVar11.f308572b.f308697j.h();
                        vc.s.j(eVarH);
                        return new ttl.x(oVar3, a0Var2, qVar2, sVar, aVar12, bVarB3, new v60.g(jVar6, eVarH), new vtl.a());
                    case 4:
                        a0Var = new ttl.a0((nvl.b) aVar11.f308574g.get());
                        break;
                    case 5:
                        return new nvl.i();
                    case 6:
                        return new ttl.y();
                    case 7:
                        a0Var = new ttl.s((nvl.b) aVar11.f308574g.get());
                        break;
                    case 8:
                        return new nvl.j();
                    default:
                        throw new AssertionError(i104);
                }
                return a0Var;
            case 22:
                return b();
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
                xsl.p pVar2 = (xsl.p) this.f305093b;
                xsl.o oVar4 = (xsl.o) this.d;
                int i105 = this.f305094c;
                switch (i105) {
                    case 0:
                        return kxa.j.k((j60.a) oVar4.f.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) oVar4.d.get(), (rp0.m) oVar4.e.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        n60.a aVar13 = (n60.a) oVar4.f308687h.get();
                        o5k.i.l(aVar13);
                        return aVar13;
                    case 4:
                        return o5k.i.q((com.revolut.kompot.navigable.a) oVar4.d.get());
                    case 5:
                        TargetPriceScreenContract$InputData inputData = oVar4.f308683a;
                        xsl.p pVar3 = oVar4.f308685c;
                        kge.d targetPriceInputValueBuilder = new kge.d((vdf.d) pVar3.Q.get(), new l4i.a());
                        pul.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        Intrinsics.checkNotNullParameter(targetPriceInputValueBuilder, "targetPriceInputValueBuilder");
                        bfl.g gVar5 = inputData.f106997b;
                        k4l.r0 r0Var = inputData.f106998c;
                        Amount amount = inputData.d;
                        if (amount == null || (bigDecimal = amount.f104717a) == null) {
                            bigDecimal = BigDecimal.ZERO;
                        }
                        Intrinsics.h(bigDecimal);
                        oul.k kVar4 = new oul.k(gVar5, r0Var, new TargetPriceInputValue(bigDecimal, (Boolean) null, amount != null, 6), true, new Data(null, null, false, 7, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
                        oul.n nVar14 = (oul.n) oVar4.k.get();
                        oul.l lVar2 = (oul.l) oVar4.f308689l.get();
                        qul.e eVar2 = (qul.e) oVar4.f308690m.get();
                        ybl.b bVarB4 = pVar2.e.b();
                        vc.s.j(bVarB4);
                        zjh.f fVarC = pVar2.e.c();
                        j60.a aVar14 = (j60.a) oVar4.f.get();
                        n60.a aVar15 = (n60.a) oVar4.f308687h.get();
                        kge.d dVar9 = new kge.d((vdf.d) pVar3.Q.get(), new l4i.a());
                        bsl.c cVarE = pVar3.k.e();
                        f7j.p pVarC = oVar4.c();
                        ogm.i iVarB = oVar4.b();
                        rul.b bVar5 = new rul.b();
                        l4i.a amountConverter = new l4i.a();
                        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
                        return new com.revolut.trading.orders.ui.invest.placement.target_price.b(inputData, kVar4, nVar14, lVar2, eVar2, bVarB4, fVarC, aVar14, aVar15, dVar9, new kgm.i(cVarE, pVarC, iVarB, bVar5, new rul.d()), new pak.h(oVar4.c()), oVar4.b(), new rul.e(pVar3.k.e(), oVar4.c(), oVar4.b(), new l4i.a()));
                    case 6:
                        oul.j jVar7 = oVar4.f308684b;
                        xsl.p pVar4 = oVar4.f308685c;
                        qul.m mVar4 = new qul.m(jVar7, new qul.l(pVar4.k.k()), new qul.j());
                        u80.o oVar5 = new u80.o();
                        trl.a aVar16 = pVar4.k;
                        return new oul.g0(mVar4, new qul.b(oVar5, new l4i.a(), (vdf.d) pVar4.Q.get(), oVar4.c(), new bul.o(ImmutableSet.of((qul.i) new qul.d((pvl.a) oVar4.f308688j.get(), oVar4.c(), oVar4.b(), aVar16.k(), new qul.c()), new qul.i((pvl.a) oVar4.f308688j.get(), oVar4.c(), new l4i.a())), 1), new qul.f(aVar16.k())), new jid.z((dsl.a) pVar4.R.get(), oVar4.b()));
                    case 7:
                        return new pvl.c();
                    case 8:
                        return new oul.f0();
                    case 9:
                        return new qul.e((pvl.a) oVar4.f308688j.get());
                    default:
                        throw new AssertionError(i105);
                }
        }
    }
}
