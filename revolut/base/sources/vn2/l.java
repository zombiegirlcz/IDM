package vn2;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultRegistry;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.bank_account_switching.impl.ui.form.phone_number_input.PhoneNumberInputScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.review.BankAccountSwitchingReviewScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.BankAccountSwitchingReviewOutScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.terms_and_conditions.TermsAndConditionsScreenContract$InputData;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.confirmation.CryptoWithdrawToAddressConfirmationActivity;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.confirmation.CryptoWithdrawToAddressConfirmationContract$Configuration;
import com.revolut.feature.rev_points.buying.impl.ui.screen.main.RevPointsBuyingControllerScreenContract$InputData;
import com.revolut.feature.security_hub.api.navigation.SecurityDelayInputData;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.host.LinkedWalletsScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.linked_wallets_tab_revamp.LinkedWalletsTabRevampScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.street_mode.flow.StreetModeFlowContract$InputData;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.wealth_protection.WealthProtectionScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreenContract$InputData;
import com.revolut.feature.selfserve.entity.config.shared.ui.help.EntityHelpScreenContract$InputData;
import com.revolut.feature.selfserve.entity.config.shared.ui.home.EntityHomeScreenContract$InputData;
import com.revolut.retail.common.ui.activity.delegate.keyboardsuggestions.KeyboardSuggestionsDelegate;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.adjust_analytics.impl.ui.AdjustAnalyticsContract$InputData;
import dfj.x2;
import i60.b;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import lp.l9;
import mga.h0;
import ozc.v0;
import rp0.g1;
import rp0.l0;
import rp0.p0;
import t80.e;
import vtc.f0;
import vtc.i0;
import vtc.k0;
import wtc.c1;
import wtc.g0;
import wtc.q0;
import wtc.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f290697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f290698c;
    public final Object d;

    public /* synthetic */ l(Object obj2, Object obj3, int i, int i2) {
        this.f290696a = i2;
        this.f290697b = obj2;
        this.d = obj3;
        this.f290698c = i;
    }

    private final Object a() {
        vtc.s sVar = (vtc.s) this.d;
        vtc.t tVar = (vtc.t) this.f290697b;
        afj.b bVar = tVar.B;
        int i = this.f290698c;
        if (i == 0) {
            cli.n nVar = (cli.n) sVar.f292055b.get();
            otc.b bVar2 = otc.b.RETAIL;
            vc.s.k(bVar2);
            l93.f fVarJ = tVar.e.j();
            vc.s.j(fVarJ);
            kdh.b bVarD = ((n86.d) tVar.u).d();
            wtc.j jVar = (wtc.j) tVar.j0.get();
            wtc.t tVar2 = new wtc.t();
            x2 x2Var = (x2) bVar.C0.get();
            vc.s.j(x2Var);
            return new com.revolut.feature.security_hub.impl.ui.secure_account.a(nVar, bVar2, fVarJ, bVarD, jVar, tVar2, x2Var);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        cej.b bVar3 = (cej.b) bVar.X.get();
        vc.s.j(bVar3);
        m93.d dVarF = sVar.f292054a.e.f();
        vc.s.j(dVarF);
        ivc.a aVar = new ivc.a(new ivc.b(new xtc.c(dVarF)), new ivc.m());
        ivc.g gVar = new ivc.g(new ivc.c(), new ivc.m());
        ivc.j titleMapper = new ivc.j();
        ivc.i subtitleMapper = new ivc.i();
        Intrinsics.checkNotNullParameter(titleMapper, "titleMapper");
        Intrinsics.checkNotNullParameter(subtitleMapper, "subtitleMapper");
        return new gvc.v(bVar3, aVar, gVar, new ivc.h(new ivc.f(), new ivc.m()));
    }

    private final Object b() {
        vtc.t tVar = (vtc.t) this.f290697b;
        int i = this.f290698c;
        if (i == 0) {
            return new com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow.b((cli.n) ((vtc.y) this.d).f292095a.get(), tVar.f292072n.e(), (q0) tVar.f0.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        cwc.a transactionsDayNightLimitsFlowDescriptionMapper = new cwc.a();
        Intrinsics.checkNotNullParameter(transactionsDayNightLimitsFlowDescriptionMapper, "transactionsDayNightLimitsFlowDescriptionMapper");
        return new com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow.c();
    }

    private final Object c() {
        vtc.t tVar = (vtc.t) this.f290697b;
        vtc.c0 c0Var = (vtc.c0) this.d;
        vtc.t tVar2 = c0Var.f291959b;
        int i = this.f290698c;
        if (i == 0) {
            return s2l.c.j((r60.b) c0Var.e.get());
        }
        if (i == 1) {
            return s2l.c.q((com.revolut.kompot.navigable.a) c0Var.f291960c.get(), (p0) c0Var.d.get(), kxa.j.o(new nji.b()));
        }
        if (i == 2) {
            return new p0();
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        wtc.k kVar = (wtc.k) tVar.g0.get();
        fwc.a aVar = new fwc.a((xtc.d) tVar2.l0.get());
        r60.b bVar = (r60.b) c0Var.e.get();
        iwc.b bVar2 = new iwc.b((wtc.k) tVar2.g0.get());
        com.revolut.feature.external_accounts.api.navigation.a aVarB = ((xf6.t) tVar.L).b();
        vc.s.j(aVarB);
        wli.x xVarD = ((s41.a) tVar.H).d();
        TransactionsLimitsScreenContract$InputData transactionsLimitsScreenContract$InputData = c0Var.f291958a;
        rwc.c securityHubImageProgressStyleMapper = new rwc.c();
        hwc.k transactionWalletLimitsItemsSubheaderMapper = new hwc.k();
        Intrinsics.checkNotNullParameter(securityHubImageProgressStyleMapper, "securityHubImageProgressStyleMapper");
        Intrinsics.checkNotNullParameter(transactionWalletLimitsItemsSubheaderMapper, "transactionWalletLimitsItemsSubheaderMapper");
        return new com.revolut.feature.security_hub.impl.ui.transactions_limits.a(kVar, aVar, bVar, bVar2, aVarB, xVarD, transactionsLimitsScreenContract$InputData, new ac4.g(new hwc.j(), new hwc.g(new hwc.c((xtc.d) tVar2.l0.get(), new rwc.c(), new hwc.e()))));
    }

    private final Object d() {
        vtc.t tVar = (vtc.t) this.f290697b;
        k0 k0Var = tVar.f292068j;
        f0 f0Var = (f0) this.d;
        WealthProtectionLimitChangeScreenContract$InputData wealthProtectionLimitChangeScreenContract$InputData = f0Var.f291972a;
        vtc.t tVar2 = f0Var.f291973b;
        int i = this.f290698c;
        if (i == 0) {
            return kxa.j.k((j60.a) f0Var.e.get());
        }
        if (i == 1) {
            return ehe.n.s((com.revolut.kompot.navigable.a) f0Var.f291974c.get(), (rp0.m) f0Var.d.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            if (i != 4) {
                throw new AssertionError(i);
            }
            otc.b bVar = otc.b.RETAIL;
            vc.s.k(bVar);
            onh.b bVar2 = new onh.b(bVar);
            g0 g0VarD = k0Var.d();
            qwc.c cVar = new qwc.c(new u80.o(), tVar2.a());
            gte.a aVarB = tVar2.k.b();
            vc.s.j(aVarB);
            return new pwc.r(wealthProtectionLimitChangeScreenContract$InputData, bVar2, g0VarD, cVar, new qwc.i(aVarB), new qwc.f());
        }
        cli.n nVar = (cli.n) f0Var.f291975g.get();
        ptc.a aVar = (ptc.a) tVar.Z.get();
        w80.b bVarA = tVar.a();
        qwc.d wealthProtectionLimitChangeDialogClauseMapper = new qwc.d();
        Intrinsics.checkNotNullParameter(wealthProtectionLimitChangeDialogClauseMapper, "wealthProtectionLimitChangeDialogClauseMapper");
        qwc.e eVar = new qwc.e();
        u0 u0Var = (u0) tVar.f292067h0.get();
        elb.b bVarE = ((blb.e) tVar.z).e();
        g6e.d dVarB = tVar.F.b();
        vc.s.j(dVarB);
        g0 g0VarD2 = k0Var.d();
        zja.a aVarA = ((ika.b) tVar.f292071m).a();
        vc.s.j(aVarA);
        r10.t tVar3 = new r10.t(tVar2.f292072n.e(), (q0) tVar2.f0.get());
        gte.a aVarB2 = tVar.k.b();
        vc.s.j(aVarB2);
        wtc.c0 c0Var = new wtc.c0();
        wtc.k0 k0Var2 = (wtc.k0) tVar.f292069k0.get();
        w39.b bVarA2 = tVar.i.a();
        vc.s.j(bVarA2);
        return new com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a(nVar, wealthProtectionLimitChangeScreenContract$InputData, aVar, bVarA, eVar, u0Var, bVarE, dVarB, g0VarD2, aVarA, tVar3, aVarB2, c0Var, k0Var2, bVarA2, new buc.h());
    }

    private final Object e() {
        vtc.t tVar = (vtc.t) this.f290697b;
        vtc.g0 g0Var = (vtc.g0) this.d;
        int i = this.f290698c;
        if (i == 0) {
            return kxa.j.k((j60.a) g0Var.e.get());
        }
        if (i == 1) {
            return ehe.n.s((com.revolut.kompot.navigable.a) g0Var.f291981c.get(), (rp0.m) g0Var.d.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        WealthProtectionScreenContract$InputData wealthProtectionScreenContract$InputData = g0Var.f291979a;
        elb.b bVarE = ((blb.e) tVar.z).e();
        u0 u0Var = (u0) tVar.f292067h0.get();
        c1 c1Var = (c1) tVar.i0.get();
        j60.a aVar = (j60.a) g0Var.e.get();
        r10.q qVarD = tVar.f292072n.d();
        g0 g0VarD = tVar.f292068j.d();
        rwc.c cVar = new rwc.c();
        nwc.r rVar = new nwc.r();
        vtc.t tVar2 = g0Var.f291980b;
        otc.b bVar = otc.b.RETAIL;
        vc.s.k(bVar);
        gte.a aVarB = tVar2.k.b();
        vc.s.j(aVarB);
        return new nwc.p(wealthProtectionScreenContract$InputData, bVarE, u0Var, c1Var, aVar, qVarD, g0VarD, new nwc.q(cVar, rVar, bVar, aVarB));
    }

    private final Object f() {
        i0 i0Var = (i0) this.d;
        k0 k0Var = (k0) this.f290697b;
        l70.e eVar = k0Var.e;
        int i = this.f290698c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            l80.e dateTimeProvider = eVar.h();
            vc.s.j(dateTimeProvider);
            Intrinsics.checkNotNullParameter(dateTimeProvider, "dateTimeProvider");
            return new tvc.l();
        }
        cli.n nVar = (cli.n) i0Var.f291991b.get();
        SecurityDelayInputData securityDelayInputData = i0Var.f291990a;
        w39.b bVarA = k0Var.f292003h.a();
        vc.s.j(bVarA);
        buc.a aVar = new buc.a();
        ufm.d dVarC = k0Var.c();
        l80.e eVarH = eVar.h();
        vc.s.j(eVarH);
        return new com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a(nVar, securityDelayInputData, bVarA, aVar, dVarC, eVarH);
    }

    private final Object g() {
        vub.b bVar = (vub.b) this.d;
        RevPointsBuyingControllerScreenContract$InputData revPointsBuyingControllerScreenContract$InputData = bVar.f292288a;
        vub.a aVar = (vub.a) this.f290697b;
        vub.f fVar = aVar.d;
        l70.e eVar = aVar.f292283b;
        int i = this.f290698c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            l80.e eVarH = eVar.h();
            vc.s.j(eVarH);
            jub.a aVarC = aVar.f292284c.c();
            vc.s.j(aVarC);
            return new bvb.w(revPointsBuyingControllerScreenContract$InputData, eVarH, aVarC);
        }
        cli.n nVar = (cli.n) bVar.f292289b.get();
        i90.b bVar2 = new i90.b();
        qub.a aVar2 = (qub.a) fVar.f292304m.get();
        vc.s.j(aVar2);
        nyb.i0 i0VarF = aVar.e.f();
        vc.s.j(i0VarF);
        wub.a aVarA = fVar.a();
        vc.s.j(aVarA);
        l80.e eVarH2 = eVar.h();
        vc.s.j(eVarH2);
        sf0.h hVarB = aVar.f.b();
        vc.s.j(hVarB);
        mre.c cVarB = aVar.f292285g.b();
        vc.s.j(cVarB);
        l61.a aVarB = aVar.f292286h.b();
        vc.s.j(aVarB);
        return new bvb.r(nVar, bVar2, revPointsBuyingControllerScreenContract$InputData, aVar2, i0VarF, aVarA, eVarH2, hVarB, cVarB, aVarB);
    }

    private final Object h() {
        vxc.e eVar = (vxc.e) this.d;
        vxc.d dVar = (vxc.d) this.f290697b;
        int i = this.f290698c;
        if (i != 0) {
            if (i == 1) {
                return new cyc.g();
            }
            throw new AssertionError(i);
        }
        bal.a aVarB = ((vxc.b) dVar.f293060a).b();
        vc.s.j(aVarB);
        EntityHelpScreenContract$InputData entityHelpScreenContract$InputData = eVar.f293063a;
        f80.a aVarX = dVar.f293061b.x();
        vc.s.j(aVarX);
        return new cyc.h(aVarB, entityHelpScreenContract$InputData, aVarX, (cli.n) eVar.f293064b.get());
    }

    private final Object i() {
        vxc.d dVar = (vxc.d) this.f290697b;
        vxc.i iVar = dVar.f293060a;
        vxc.f fVar = (vxc.f) this.d;
        int i = this.f290698c;
        if (i == 0) {
            com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) fVar.f293068c.get();
            i60.b.Companion.getClass();
            return b.a.a(aVar);
        }
        if (i == 1) {
            byc.k factory = ((vxc.b) iVar).a();
            vc.s.j(factory);
            Intrinsics.checkNotNullParameter(factory, "factory");
            return factory.a();
        }
        if (i == 2) {
            EntityHomeScreenContract$InputData entityHomeScreenContract$InputData = fVar.f293066a;
            bal.a aVarB = ((vxc.b) iVar).b();
            vc.s.j(aVarB);
            y9l.a aVar2 = (y9l.a) fVar.e.get();
            f80.a aVarX = dVar.f293061b.x();
            vc.s.j(aVarX);
            h60.d dVar2 = (h60.d) fVar.d.get();
            use.d dVarB = dVar.f293062c.b();
            vc.s.j(dVarB);
            l0 l0Var = (l0) fVar.f.get();
            yxc.l iconUiMapper = fVar.f293067b.d.a();
            vc.s.j(iconUiMapper);
            Intrinsics.checkNotNullParameter(iconUiMapper, "iconUiMapper");
            return new com.revolut.feature.selfserve.entity.config.shared.ui.home.b(entityHomeScreenContract$InputData, aVarB, aVar2, aVarX, dVar2, dVarB, l0Var, new eyc.c(), (cli.n) fVar.f293070h.get());
        }
        if (i == 3) {
            com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) fVar.f293068c.get();
            fyc.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            return new l0(controller.m2());
        }
        if (i == 4) {
            yxc.m mVar = (yxc.m) fVar.f293069g.get();
            z9l.g gVar = (z9l.g) ((vxc.b) iVar).f293054r.get();
            vc.s.j(gVar);
            return new eyc.r(mVar, gVar);
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        yxc.l iconUiMapper2 = dVar.d.a();
        vc.s.j(iconUiMapper2);
        Intrinsics.checkNotNullParameter(iconUiMapper2, "iconUiMapper");
        return new yxc.p();
    }

    private final Object j() {
        vzc.b bVar = (vzc.b) this.f290697b;
        vzc.a aVar = (vzc.a) this.d;
        int i = this.f290698c;
        switch (i) {
            case 0:
                ypi.h hVar = aVar.f293438b;
                fsi.g gVar = aVar.f293437a;
                return new ypi.e(hVar, bq.i.b(gVar), bq.i.o(gVar), bq.i.g(gVar));
            case 1:
                return new hqi.f(aVar.f293439c, bq.i.b(aVar.f293437a));
            case 2:
                return kpi.f.a();
            case 3:
                Context contextI = bq.i.i(aVar.f293437a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar.f293437a);
                t70.g gVarO = bVar.f293450b.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 4:
                return new tpi.i((rpi.c) aVar.f293442j.get(), gsi.c.a(aVar.f293437a));
            case 5:
                return new rpi.b(bq.i.b(aVar.f293437a));
            case 6:
                return new rpi.h(bq.i.b(aVar.f293437a));
            case 7:
                return new iri.g((iri.j) bVar.k.get(), (iri.m) bVar.f293455l.get(), bq.i.f(aVar.f293437a), bq.i.l(aVar.f293437a));
            case 8:
                return new iri.l((iri.m) bVar.f293455l.get(), bq.i.f(aVar.f293437a), (iri.d) aVar.f293445n.get());
            case 9:
                return new iri.d(bq.i.f(aVar.f293437a));
            case 10:
                return new opi.b(bq.i.f(aVar.f293437a));
            case 11:
                return new qi3.l(bq.i.l(aVar.f293437a), (f9b.f) aVar.f293447q.get(), (qi3.r) bVar.o.get(), (com.revolut.feature.chooser.c) bVar.f293457n.get(), aVar.d, (ypi.i) aVar.f.get(), (hqi.l) aVar.f293440g.get(), (opi.d) aVar.f293446p.get(), (tpi.j) aVar.k.get(), bq.i.o(aVar.f293437a));
            case 12:
                return bq.i.t(aVar.f293437a);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        vzc.b bVar = (vzc.b) this.f290697b;
        vzc.c cVar = (vzc.c) this.d;
        int i = this.f290698c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(cVar.f293466a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(cVar.f293466a);
                t70.g gVarO = bVar.f293450b.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) cVar.f.get(), gsi.c.a(cVar.f293466a));
            case 3:
                return new rpi.b(bq.i.b(cVar.f293466a));
            case 4:
                return new rpi.h(bq.i.b(cVar.f293466a));
            case 5:
                return new iri.g((iri.j) bVar.k.get(), (iri.m) bVar.f293458p.get(), bq.i.f(cVar.f293466a), bq.i.l(cVar.f293466a));
            case 6:
                return new iri.l((iri.m) bVar.f293458p.get(), bq.i.f(cVar.f293466a), (iri.d) cVar.f293471j.get());
            case 7:
                return new iri.d(bq.i.f(cVar.f293466a));
            case 8:
                return new opi.b(bq.i.f(cVar.f293466a));
            case 9:
                cVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar.f293459q.get(), bVar.a());
            case 10:
                um.c cVar2 = (um.c) bVar.f293460r.get();
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                vzc.b bVar2 = cVar.f293467b;
                hn.h hVar = (hn.h) bVar2.f293461s.get();
                t70.g gVarO2 = bVar2.f293450b.o();
                vc.s.j(gVarO2);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO2));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(bVar2.d());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(cVar.f293474n)));
                return new in.e(cVar2, builderBuilderWithExpectedSize.build(), bVar.a());
            case 11:
                return bq.i.t(cVar.f293466a);
            case 12:
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(cVar.f293475p.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(cVar.f293469g)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) bVar.u.get(), bVar.a());
            case 13:
                return new zm.a();
            case 14:
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(cVar.f293467b.d());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) bVar.f293461s.get(), (npi.f) cVar.e.get());
            case 15:
                return new en.c(ImmutableSet.of((ln.d) cVar.f293467b.f293462t.get()), bq.i.l(cVar.f293466a));
            case 16:
                return new gn.c((lpi.e) cVar.f293479t.get(), (sm.e) bVar.f293463w.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar.a());
            case 17:
                return new lpi.b(bq.i.i(cVar.f293466a), bq.i.j(cVar.f293466a));
            case 18:
                cVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar.f293464x.get(), bVar.a());
            case 19:
                cVar.getClass();
                return new xpi.c(xpi.f.d, bq.i.b(cVar.f293466a));
            case 20:
                cVar.getClass();
                xoi.d dVar = cVar.f293466a;
                return new ypi.e(ypi.h.d, bq.i.b(dVar), bq.i.o(dVar), bq.i.g(dVar));
            case 21:
                return new k3l.d(bq.i.b(cVar.f293466a));
            case 22:
                cVar.getClass();
                return new g3l.c(ImmutableSet.copyOf((Collection) g3l.f.a()), (g3l.g) bVar.A.get(), (k3l.b) cVar.f293482y.get(), bVar.a());
            case 23:
                Activity activityB = bq.i.b(cVar.f293466a);
                y80.b bVar3 = new y80.b();
                g60.a aVar = (g60.a) cVar.A.get();
                xoi.d dVar2 = cVar.f293466a;
                Activity activityB2 = bq.i.b(dVar2);
                t80.g gVar = (t80.g) cVar.B.get();
                BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(dVar2);
                d4m.a aVarA = e4m.b.a(cVar.C);
                nli.a aVarE = cVar.e();
                t80.g gVar2 = (t80.g) cVar.B.get();
                l70.e eVar = cVar.f293467b.f293450b;
                zk0.b bVarL = eVar.l();
                vc.s.j(bVarL);
                oli.c cVar3 = new oli.c(gVar2, bVarL, cVar.e(), (g60.a) cVar.A.get(), cVar.f());
                ComponentActivity componentActivityA = gmf.b.a(dVar2);
                ActivityResultRegistry activityResultRegistryA = pli.b.a(gmf.b.a(dVar2));
                ami.n nVar = new ami.n(e4m.b.a(cVar.E), 1);
                d4m.a aVarA2 = e4m.b.a(cVar.C);
                t80.g gVar3 = (t80.g) cVar.B.get();
                nli.a aVarE2 = cVar.e();
                i90.b bVar4 = new i90.b();
                z70.a aVarF = eVar.f();
                vc.s.j(aVarF);
                c70.b bVar5 = new c70.b(aVarF, 2);
                z70.a aVarF2 = eVar.f();
                vc.s.j(aVarF2);
                return new upi.b(activityB, bVar3, new t80.v(aVar, activityB2, gVar, baseDelegatesActivityF2, aVarA, aVarE, cVar3, new oli.g(componentActivityA, activityResultRegistryA, nVar, aVarA2, gVar3, aVarE2, bVar4, new u96.b(bVar5, new smd.s(aVarF2)), cVar.f()), cVar.f()));
            case 24:
                return new g60.a(bq.i.b(cVar.f293466a));
            case 25:
                l70.e eVar2 = bVar.f293450b;
                l70.e eVar3 = bVar.f293450b;
                f80.a aVarX = eVar2.x();
                vc.s.j(aVarX);
                l80.e eVarH = eVar3.h();
                vc.s.j(eVarH);
                zk0.b bVarL2 = eVar3.l();
                vc.s.j(bVarL2);
                return new t80.b(aVarX, eVarH, bVarL2);
            case 26:
                return pli.c.a(new ks0.n(bq.i.f(cVar.f293466a)));
            case 27:
                vzc.n.Companion.getClass();
                return new t80.c(new e.a(null), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
            case 28:
                return t96.a.a();
            case 29:
                ozc.d dVar3 = (ozc.d) bVar.f293465y.get();
                ozc.f fVar = (ozc.f) bVar.C.get();
                xoi.d dVar4 = cVar.f293466a;
                xoi.d dVar5 = cVar.f293466a;
                ozc.g0 g0Var = new ozc.g0(dVar3, fVar, bq.i.l(dVar4), (ozc.a) cVar.G.get(), (xpi.g) cVar.f293480w.get(), (ypi.i) cVar.f293481x.get(), (tpi.j) cVar.f293469g.get(), (bqi.d) cVar.H.get(), (k3l.b) cVar.f293482y.get(), bq.i.e(dVar5), (kpi.c) cVar.d.get(), (opi.d) cVar.f293472l.get());
                kli.a.p(g0Var, bq.i.d(dVar5));
                return g0Var;
            case 30:
                Context contextI2 = bq.i.i(cVar.f293466a);
                t70.b bVarG = bVar.f293450b.g();
                vc.s.j(bVarG);
                sf0.h hVarB = bVar.f293452g.b();
                vc.s.j(hVarB);
                v60.e eVarA = bVar.f293453h.a();
                vc.s.j(eVarA);
                return new ozc.k(contextI2, bVarG, hVarB, eVarA, bq.i.g(cVar.f293466a));
            case 31:
                return new bqi.c(bq.i.i(cVar.f293466a), bq.i.j(cVar.f293466a));
            case 32:
                return new v0();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        vzc.b bVar = (vzc.b) this.f290697b;
        vzc.e eVar = (vzc.e) this.d;
        int i = this.f290698c;
        if (i != 0) {
            if (i == 1) {
                return new tzc.f();
            }
            throw new AssertionError(i);
        }
        tzc.j jVar = new tzc.j((ozc.d) bVar.f293465y.get(), (ozc.f) bVar.C.get(), (tzc.b) eVar.f293487b.get());
        kli.a.p(jVar, bq.i.d(eVar.f293486a.f293466a));
        return jVar;
    }

    @Override // phm.a
    public final Object get() {
        int i = this.f290696a;
        int i2 = this.f290698c;
        Object obj2 = this.d;
        Object obj3 = this.f290697b;
        switch (i) {
            case 0:
                m mVar = (m) obj2;
                if (i2 == 0) {
                    return new oo2.p((cli.n) mVar.f290701c.get(), mVar.f290699a, new qo2.h((pn2.d) mVar.f290700b.o.get()));
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                l80.e eVarH = ((h) obj3).d.h();
                vc.s.j(eVarH);
                return new oo2.r(eVarH);
            case 1:
                n nVar = (n) obj2;
                if (i2 == 0) {
                    return new wo2.m((cli.n) nVar.f290704c.get(), nVar.f290702a, new yo2.c((pn2.d) nVar.f290703b.o.get()), ((s41.a) ((h) obj3).f290680h).d());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                kp2.a bankInformationStateMapper = new kp2.a();
                Intrinsics.checkNotNullParameter(bankInformationStateMapper, "bankInformationStateMapper");
                return new wo2.p();
            case 2:
                o oVar = (o) obj2;
                h hVar = oVar.f290706b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new up2.t(new kp2.a(), new kp2.c(hVar.f290679g.g()));
                    }
                    throw new AssertionError(i2);
                }
                cli.n nVar2 = (cli.n) oVar.f290707c.get();
                BankAccountSwitchingReviewOutScreenContract$InputData bankAccountSwitchingReviewOutScreenContract$InputData = oVar.f290705a;
                pn2.d dVar = (pn2.d) hVar.o.get();
                xua.a aVarA = hVar.i.a();
                vc.s.j(aVarA);
                su9.c cVar = new su9.c(dVar, aVarA);
                bp2.c cVar2 = new bp2.c((pn2.d) hVar.o.get());
                up2.u uVar = new up2.u();
                sf0.h hVarB = ((h) obj3).f290681j.b();
                vc.s.j(hVarB);
                return new com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a(nVar2, bankAccountSwitchingReviewOutScreenContract$InputData, cVar, cVar2, uVar, hVarB);
            case 3:
                h hVar2 = (h) obj3;
                p pVar = (p) obj2;
                h hVar3 = pVar.f290709b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new zo2.n(new kp2.a(), new kp2.c(hVar3.f290679g.g()));
                    }
                    throw new AssertionError(i2);
                }
                cli.n nVar3 = (cli.n) pVar.f290710c.get();
                BankAccountSwitchingReviewScreenContract$InputData bankAccountSwitchingReviewScreenContract$InputData = pVar.f290708a;
                bp2.d dVar2 = new bp2.d((pn2.d) hVar3.o.get(), 0);
                bp2.c cVar3 = new bp2.c((pn2.d) hVar3.o.get());
                l61.a aVarB = hVar2.f290677b.b();
                vc.s.j(aVarB);
                return new com.revolut.feature.bank_account_switching.impl.ui.review.b(nVar3, bankAccountSwitchingReviewScreenContract$InputData, dVar2, cVar3, aVarB, ((s41.a) hVar2.f290680h).d());
            case 4:
                q qVar = (q) obj2;
                if (i2 == 0) {
                    return new hp2.j((cli.n) qVar.f290713c.get(), qVar.f290711a, new f61.a((pn2.d) qVar.f290712b.o.get()));
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                l80.e eVarH2 = ((h) obj3).d.h();
                vc.s.j(eVarH2);
                return new hp2.m(eVarH2);
            case 5:
                y yVar = (y) obj2;
                h hVar4 = (h) obj3;
                l70.e eVar = hVar4.d;
                if (i2 == 0) {
                    cli.n nVar4 = (cli.n) yVar.f290732b.get();
                    PhoneNumberInputScreenContract$InputData phoneNumberInputScreenContract$InputData = yVar.f290731a;
                    e4m.e eVar2 = yVar.f290733c;
                    z80.b bVarS = eVar.s();
                    vc.s.j(bVarS);
                    return new ho2.j(nVar4, phoneNumberInputScreenContract$InputData, eVar2, bVarS);
                }
                if (i2 == 1) {
                    z80.b bVarS2 = eVar.s();
                    vc.s.j(bVarS2);
                    return new ho2.l(bVarS2);
                }
                if (i2 != 2) {
                    throw new AssertionError(i2);
                }
                n8b.b bVarB = hVar4.e.b();
                vc.s.j(bVarB);
                fk3.a aVarA2 = hVar4.f.a();
                vc.s.j(aVarA2);
                z80.b bVarS3 = eVar.s();
                vc.s.j(bVarS3);
                return new jo2.b(bVarB, aVarA2, bVarS3);
            case 6:
                h hVar5 = (h) obj3;
                d0 d0Var = (d0) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new gq2.o();
                    }
                    throw new AssertionError(i2);
                }
                cli.n nVar5 = (cli.n) d0Var.f290653b.get();
                TermsAndConditionsScreenContract$InputData termsAndConditionsScreenContract$InputData = d0Var.f290652a;
                pre.c cVarA = hVar5.k.a();
                vc.s.j(cVarA);
                return new gq2.n(nVar5, termsAndConditionsScreenContract$InputData, cVarA, ((nj0.d) hVar5.f290678c).j());
            case 7:
                vp5.d dVar3 = (vp5.d) obj3;
                vp5.c cVar4 = (vp5.c) obj2;
                switch (i2) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(cVar4.f291060a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(cVar4.f291060a);
                        t70.g gVarO = dVar3.f291079b.o();
                        vc.s.j(gVarO);
                        return new npi.c(contextI, baseDelegatesActivityF, gVarO);
                    case 2:
                        return new tpi.i((rpi.c) cVar4.f291064h.get(), gsi.c.a(cVar4.f291060a));
                    case 3:
                        return new rpi.b(bq.i.b(cVar4.f291060a));
                    case 4:
                        return new rpi.h(bq.i.b(cVar4.f291060a));
                    case 5:
                        return new iri.g((iri.j) dVar3.G.get(), (iri.m) dVar3.H.get(), bq.i.f(cVar4.f291060a), bq.i.l(cVar4.f291060a));
                    case 6:
                        return new iri.l((iri.m) dVar3.H.get(), bq.i.f(cVar4.f291060a), (iri.d) cVar4.f291066l.get());
                    case 7:
                        return new iri.d(bq.i.f(cVar4.f291060a));
                    case 8:
                        return new opi.b(bq.i.f(cVar4.f291060a));
                    case 9:
                        return new xpi.c(cVar4.f291061b, bq.i.b(cVar4.f291060a));
                    case 10:
                        return new en.c(ImmutableSet.of((ln.d) cVar4.e.I.get()), bq.i.l(cVar4.f291060a));
                    case 11:
                        cVar4.getClass();
                        return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) dVar3.J.get(), dVar3.h());
                    case 12:
                        um.c cVar5 = (um.c) dVar3.K.get();
                        cVar4.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(7);
                        vp5.d dVar4 = cVar4.e;
                        hn.h hVar6 = (hn.h) dVar4.L.get();
                        t70.g gVarO2 = dVar4.f291079b.o();
                        vc.s.j(gVarO2);
                        builderBuilderWithExpectedSize.add(new jn.a(hVar6, gVarO2));
                        builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize.add(dVar4.k());
                        builderBuilderWithExpectedSize.add(dVar4.R.get());
                        builderBuilderWithExpectedSize.add(dVar4.U.get());
                        builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(cVar4.f291071r)));
                        return new in.e(cVar5, builderBuilderWithExpectedSize.build(), dVar3.h());
                    case 13:
                        return bq.i.t(cVar4.f291060a);
                    case 14:
                        cVar4.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(4);
                        builderBuilderWithExpectedSize2.add(cVar4.e.V.get());
                        builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize2.add(cVar4.f291073t.get());
                        builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(cVar4.i)));
                        return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) dVar3.O.get(), dVar3.h());
                    case 15:
                        return new zm.a();
                    case 16:
                        cVar4.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize3.add(cVar4.e.k());
                        return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) dVar3.L.get(), (npi.f) cVar4.f291063g.get());
                    case 17:
                        return new gn.c((lpi.e) cVar4.f291074w.get(), (sm.e) dVar3.Y.get(), ImmutableSet.copyOf((Collection) gn.e.a()), dVar3.h());
                    case 18:
                        return new lpi.b(bq.i.i(cVar4.f291060a), bq.i.j(cVar4.f291060a));
                    case 19:
                        cVar4.getClass();
                        return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) dVar3.Z.get(), dVar3.h());
                    case 20:
                        cVar4.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(4);
                        builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                        vp5.d dVar5 = cVar4.e;
                        builderBuilderWithExpectedSize4.add(dVar5.W.get());
                        builderBuilderWithExpectedSize4.add(dVar5.U.get());
                        return new g3l.c(j6.a.g(dVar5.X, builderBuilderWithExpectedSize4), (g3l.g) dVar3.M.get(), (k3l.b) cVar4.z.get(), dVar3.h());
                    case 21:
                        return new k3l.d(bq.i.b(cVar4.f291060a));
                    case 22:
                        return new r3l.c((g1) cVar4.B.get());
                    case 23:
                        return l9.k(bq.i.b(cVar4.f291060a));
                    case 24:
                        return new wm.l((opi.d) cVar4.f291068n.get(), (wm.a) dVar3.f291078a0.get(), ImmutableSet.copyOf((Collection) xm.b.a()), dVar3.h());
                    case 25:
                        CryptoWithdrawToAddressConfirmationContract$Configuration cryptoWithdrawToAddressConfirmationContract$Configuration = cVar4.f291062c;
                        xoi.d dVar6 = cVar4.f291060a;
                        e4m.e eVar3 = dVar3.Q;
                        xmg.a aVar = dVar3.f291090r;
                        up5.b bVar = (up5.b) eVar3.get();
                        qp5.e eVar4 = (qp5.e) cVar4.E.get();
                        qp5.h hVar7 = (qp5.h) dVar3.S.get();
                        qp5.f fVar = (qp5.f) cVar4.F.get();
                        up5.b bVar2 = (up5.b) dVar3.Q.get();
                        ap5.b bVarE = ((yo5.w) dVar3.f291081c).e();
                        vc.s.j(bVarE);
                        smd.s sVar = new smd.s(bVar2, new zjh.j(bVarE));
                        opi.d dVar7 = (opi.d) cVar4.f291068n.get();
                        xpi.g gVar = (xpi.g) cVar4.o.get();
                        tri.c cVarE = bq.i.e(dVar6);
                        f9b.f fVar2 = (f9b.f) cVar4.f291071r.get();
                        pri.f fVarD = bq.i.d(dVar6);
                        kpi.c cVar6 = (kpi.c) cVar4.f.get();
                        mkd.e eVar5 = (mkd.e) cVar4.G.get();
                        gte.a aVarB2 = dVar3.f291083h.b();
                        vc.s.j(aVarB2);
                        irh.a aVar2 = (irh.a) ((krh.a) dVar3.v).f188873h.get();
                        vc.s.j(aVar2);
                        sh5.d dVarF = dVar3.B.f();
                        vc.s.j(dVarF);
                        ang.f fVarE = aVar.e();
                        l61.a aVarB3 = aVar.b();
                        vc.s.j(aVarB3);
                        hc5.a aVarA3 = ((gc5.c) dVar3.A).a();
                        vc.s.j(aVarA3);
                        return new qp5.c0(cryptoWithdrawToAddressConfirmationContract$Configuration, bVar, eVar4, hVar7, fVar, sVar, dVar7, gVar, cVarE, fVar2, fVarD, cVar6, eVar5, aVarB2, aVar2, dVarF, fVarE, aVarB3, aVarA3, new be5.e(), (msb.a) cVar4.H.get(), new se5.a(), (h0) cVar4.I.get(), (g1) cVar4.B.get(), dVar3.z.b(), (xq5.b) dVar3.T.get());
                    case 26:
                        return new sp5.f((up5.b) dVar3.Q.get(), (qp5.h) dVar3.S.get());
                    case 27:
                        ak5.a aVar3 = dVar3.f291082g;
                        go5.c cVar7 = dVar3.f291081c;
                        uj5.a aVarB4 = ((ak5.i) aVar3).b();
                        vc.s.j(aVarB4);
                        op5.e eVarF = ((yo5.w) cVar7).f();
                        vc.s.j(eVarF);
                        io5.b bVarA = ((yo5.w) cVar7).a();
                        vc.s.j(bVarA);
                        ic5.a aVar4 = new ic5.a();
                        xo5.d mapper = new xo5.d();
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        return new tp5.b(aVarB4, eVarF, bVarA, aVar4, mapper);
                    case 28:
                        CryptoWithdrawToAddressConfirmationActivity view = cVar4.d;
                        sri.m navigator = bq.i.l(cVar4.f291060a);
                        tpi.j progressView = (tpi.j) cVar4.i.get();
                        r3l.a shotView = (r3l.a) cVar4.C.get();
                        k3l.b statusDialogView = (k3l.b) cVar4.z.get();
                        rkd.n factory = (rkd.n) dVar3.f291094x.I.get();
                        vc.s.j(factory);
                        rp5.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(navigator, "navigator");
                        Intrinsics.checkNotNullParameter(progressView, "progressView");
                        Intrinsics.checkNotNullParameter(shotView, "shotView");
                        Intrinsics.checkNotNullParameter(statusDialogView, "statusDialogView");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.a(view, navigator, progressView, statusDialogView, shotView);
                    case 29:
                        return ms1.g.D(cVar4.f291060a);
                    case 30:
                        qga.b bVar3 = dVar3.C;
                        vn.a aVar5 = dVar3.D;
                        return n57.a.A(bVar3.c(), (ln.a) dVar3.I.get(), (wm.e) dVar3.f291078a0.get(), aVar5.c(), aVar5.a());
                    default:
                        throw new AssertionError(i2);
                }
            case 8:
                vp5.d dVar8 = (vp5.d) obj3;
                vp5.e eVar6 = (vp5.e) obj2;
                switch (i2) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI2 = bq.i.i(eVar6.f291096a);
                        BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(eVar6.f291096a);
                        t70.g gVarO3 = dVar8.f291079b.o();
                        vc.s.j(gVarO3);
                        return new npi.c(contextI2, baseDelegatesActivityF2, gVarO3);
                    case 2:
                        return new tpi.i((rpi.c) eVar6.e.get(), gsi.c.a(eVar6.f291096a));
                    case 3:
                        return new rpi.b(bq.i.b(eVar6.f291096a));
                    case 4:
                        return new rpi.h(bq.i.b(eVar6.f291096a));
                    case 5:
                        return new iri.g((iri.j) dVar8.G.get(), (iri.m) dVar8.H.get(), bq.i.f(eVar6.f291096a), bq.i.l(eVar6.f291096a));
                    case 6:
                        return new iri.l((iri.m) dVar8.H.get(), bq.i.f(eVar6.f291096a), (iri.d) eVar6.i.get());
                    case 7:
                        return new iri.d(bq.i.f(eVar6.f291096a));
                    case 8:
                        return new opi.b(bq.i.f(eVar6.f291096a));
                    case 9:
                        eVar6.getClass();
                        vpi.c cVar8 = vpi.d.Companion;
                        return new vpi.b(bq.i.b(eVar6.f291096a));
                    case 10:
                        return new en.c(ImmutableSet.of((ln.d) eVar6.f291097b.I.get()), bq.i.l(eVar6.f291096a));
                    case 11:
                        eVar6.getClass();
                        return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) dVar8.J.get(), dVar8.h());
                    case 12:
                        um.c cVar9 = (um.c) dVar8.K.get();
                        eVar6.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize5 = ImmutableSet.builderWithExpectedSize(7);
                        vp5.d dVar9 = eVar6.f291097b;
                        hn.h hVar8 = (hn.h) dVar9.L.get();
                        t70.g gVarO4 = dVar9.f291079b.o();
                        vc.s.j(gVarO4);
                        builderBuilderWithExpectedSize5.add(new jn.a(hVar8, gVarO4));
                        builderBuilderWithExpectedSize5.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize5.add(dVar9.k());
                        builderBuilderWithExpectedSize5.add(dVar9.R.get());
                        builderBuilderWithExpectedSize5.add(dVar9.U.get());
                        builderBuilderWithExpectedSize5.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize5.add(new jn.d(e4m.b.a(eVar6.o)));
                        return new in.e(cVar9, builderBuilderWithExpectedSize5.build(), dVar8.h());
                    case 13:
                        return bq.i.t(eVar6.f291096a);
                    case 14:
                        eVar6.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize6 = ImmutableSet.builderWithExpectedSize(4);
                        builderBuilderWithExpectedSize6.add(eVar6.f291097b.V.get());
                        builderBuilderWithExpectedSize6.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize6.add(eVar6.f291106q.get());
                        builderBuilderWithExpectedSize6.add(new kn.h(e4m.b.a(eVar6.f)));
                        return new kn.e(builderBuilderWithExpectedSize6.build(), (ym.d) dVar8.O.get(), dVar8.h());
                    case 15:
                        return new zm.a();
                    case 16:
                        eVar6.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize7 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize7.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize7.add(eVar6.f291097b.k());
                        return new hn.d(builderBuilderWithExpectedSize7.build(), (hn.h) dVar8.L.get(), (npi.f) eVar6.d.get());
                    case 17:
                        return new gn.c((lpi.e) eVar6.f291109t.get(), (sm.e) dVar8.Y.get(), ImmutableSet.copyOf((Collection) gn.e.a()), dVar8.h());
                    case 18:
                        return new lpi.b(bq.i.i(eVar6.f291096a), bq.i.j(eVar6.f291096a));
                    case 19:
                        eVar6.getClass();
                        return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) dVar8.Z.get(), dVar8.h());
                    case 20:
                        eVar6.getClass();
                        xoi.d dVar10 = eVar6.f291096a;
                        return new ypi.e(ypi.h.d, bq.i.b(dVar10), bq.i.o(dVar10), bq.i.g(dVar10));
                    case 21:
                        return new k3l.d(bq.i.b(eVar6.f291096a));
                    case 22:
                        return new wm.l((opi.d) eVar6.k.get(), (wm.a) dVar8.f291078a0.get(), ImmutableSet.copyOf((Collection) xm.b.a()), dVar8.h());
                    case 23:
                        return new KeyboardSuggestionsDelegate(bq.i.b(eVar6.f291096a));
                    case 24:
                        s3l.f fVar3 = (s3l.f) dVar8.f291080b0.get();
                        eVar6.getClass();
                        return new com.revolut.retail.retail_shot.mediator.a(fVar3, ImmutableSet.copyOf((Collection) s3l.e.a()), (r3l.a) eVar6.B.get(), dVar8.h());
                    case 25:
                        return new r3l.c((g1) eVar6.A.get());
                    case 26:
                        return l9.k(bq.i.b(eVar6.f291096a));
                    case 27:
                        up5.b bVar4 = (up5.b) dVar8.Q.get();
                        e4m.e eVar7 = eVar6.D;
                        xoi.d dVar11 = eVar6.f291096a;
                        wp5.g gVar2 = (wp5.g) eVar7.get();
                        wp5.h hVar9 = (wp5.h) eVar6.E.get();
                        wp5.j jVar = (wp5.j) dVar8.S.get();
                        up5.b bVar5 = (up5.b) dVar8.Q.get();
                        ap5.b bVarE2 = ((yo5.w) dVar8.f291081c).e();
                        vc.s.j(bVarE2);
                        smd.s sVar2 = new smd.s(bVar5, new zjh.j(bVarE2));
                        opi.d dVar12 = (opi.d) eVar6.k.get();
                        rpi.c cVar10 = (rpi.c) eVar6.e.get();
                        vpi.e eVar8 = (vpi.e) eVar6.f291102l.get();
                        tri.c cVarE2 = bq.i.e(dVar11);
                        ypi.i iVar = (ypi.i) eVar6.f291110w.get();
                        f9b.f fVar4 = (f9b.f) eVar6.o.get();
                        tpi.j jVar2 = (tpi.j) eVar6.f.get();
                        msb.a aVar6 = (msb.a) eVar6.F.get();
                        s3l.f fVar5 = (s3l.f) dVar8.f291080b0.get();
                        w80.b bVar6 = (w80.b) dVar8.P.get();
                        c90.c cVarH = gmf.b.h(dVar11);
                        kpi.c cVar11 = (kpi.c) eVar6.f291098c.get();
                        gte.a aVarB5 = dVar8.f291083h.b();
                        vc.s.j(aVarB5);
                        return new wp5.c1(bVar4, gVar2, hVar9, jVar, sVar2, dVar12, cVar10, eVar8, cVarE2, iVar, fVar4, jVar2, aVar6, fVar5, bVar6, cVarH, cVar11, aVarB5, dVar8.f291085l.a(), dVar8.f291094x.c(), bq.i.d(dVar11), (be5.d) eVar6.I.get(), dVar8.a(), dVar8.z.a());
                    case 28:
                        u80.o oVar2 = new u80.o();
                        mp5.a aVar7 = new mp5.a();
                        mo5.a aVarC = ((yo5.w) eVar6.f291097b.f291081c).c();
                        vc.s.j(aVarC);
                        bq5.c cryptoCreateBeneficiaryDialogProvider = new bq5.c(aVarC);
                        Intrinsics.checkNotNullParameter(cryptoCreateBeneficiaryDialogProvider, "cryptoCreateBeneficiaryDialogProvider");
                        op5.c cVar12 = new op5.c();
                        io5.b bVarA2 = ((yo5.w) dVar8.f291081c).a();
                        vc.s.j(bVarA2);
                        uj5.a aVarB6 = ((ak5.i) dVar8.f291082g).b();
                        vc.s.j(aVarB6);
                        return new yp5.f(oVar2, aVar7, cVar12, bVarA2, aVarB6);
                    case 29:
                        return new yp5.a();
                    case 30:
                        return ms1.g.D(eVar6.f291096a);
                    case 31:
                        ce5.b bVar7 = dVar8.f291095y;
                        be5.b factory2 = new be5.b();
                        ae5.d dialogPresenter = (ae5.d) eVar6.H.get();
                        xp5.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        Intrinsics.checkNotNullParameter(dialogPresenter, "dialogPresenter");
                        Intrinsics.checkNotNullParameter(dialogPresenter, "dialogPresenter");
                        return new be5.d();
                    case 32:
                        opi.d expandableDialogView = (opi.d) eVar6.k.get();
                        rpi.c keyboardView = (rpi.c) eVar6.e.get();
                        wp5.o reviewView = (wp5.o) eVar6.G.get();
                        wp5.j router = (wp5.j) dVar8.S.get();
                        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
                        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
                        Intrinsics.checkNotNullParameter(reviewView, "reviewView");
                        Intrinsics.checkNotNullParameter(router, "router");
                        return new wp5.d();
                    case 33:
                        ComponentCallbacks2 activity = bq.i.b(eVar6.f291096a);
                        xp5.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        return (wp5.o) activity;
                    case 34:
                        qd0.b bVarN = dVar8.f291079b.n();
                        vc.s.j(bVarN);
                        return new eq5.e0(bVarN);
                    default:
                        throw new AssertionError(i2);
                }
            case 9:
                vsi.c cVar13 = (vsi.c) obj3;
                l70.e eVar9 = cVar13.f291808a;
                vsi.d dVar13 = (vsi.d) obj2;
                if (i2 == 0) {
                    return kxa.j.k((j60.a) dVar13.e.get());
                }
                if (i2 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) dVar13.f291814c.get(), (rp0.m) dVar13.d.get());
                }
                if (i2 == 2) {
                    return new rp0.m();
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new AssertionError(i2);
                    }
                    qd0.b bVarN2 = eVar9.n();
                    vc.s.j(bVarN2);
                    w80.b bVarF = va.g.f(bVarN2);
                    thf.c cVarC = cVar13.f291809b.c();
                    vc.s.j(cVarC);
                    return new xsi.r(bVarF, cVarC, new u80.o());
                }
                cli.n nVar6 = (cli.n) dVar13.f291815g.get();
                AdjustAnalyticsContract$InputData adjustAnalyticsContract$InputData = dVar13.f291812a;
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) cVar13.f291810c).c();
                vc.s.j(aVarC2);
                qd0.b bVarN3 = eVar9.n();
                vc.s.j(bVarN3);
                w80.b bVarF2 = va.g.f(bVarN3);
                j60.a aVar8 = (j60.a) dVar13.e.get();
                tsi.b bVar8 = (tsi.b) cVar13.f291811g.get();
                eqj.g gVarG = ((dqj.r) cVar13.d).g();
                vc.s.j(gVarG);
                return new xsi.p(nVar6, adjustAnalyticsContract$InputData, aVarC2, bVarF2, aVar8, bVar8, gVarG);
            case 10:
                vtc.t tVar = (vtc.t) obj3;
                vtc.e eVar10 = (vtc.e) obj2;
                if (i2 == 0) {
                    return s2l.c.j((r60.b) eVar10.f291967c.get());
                }
                if (i2 == 1) {
                    return s2l.c.q((com.revolut.kompot.navigable.a) eVar10.f291965a.get(), (p0) eVar10.f291966b.get(), kxa.j.o(new nji.b()));
                }
                if (i2 == 2) {
                    return new p0();
                }
                if (i2 == 3) {
                    Object extension = (kuc.f) eVar10.e.get();
                    juc.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    yji.n nVar7 = (yji.n) extension;
                    vc.s.k(nVar7);
                    return nVar7;
                }
                if (i2 != 4) {
                    if (i2 == 5) {
                        return new iuc.f(new iuc.e(), (kuc.f) eVar10.e.get());
                    }
                    throw new AssertionError(i2);
                }
                r60.b bVar9 = (r60.b) eVar10.f291967c.get();
                k67.a aVar9 = (k67.a) tVar.A.i.get();
                vc.s.j(aVar9);
                return new kuc.l(bVar9, aVar9, tVar.f292066h.a());
            case 11:
                vtc.t tVar2 = (vtc.t) obj3;
                vtc.l lVar = (vtc.l) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new vuc.u();
                    }
                    throw new AssertionError(i2);
                }
                cli.n nVar8 = (cli.n) lVar.f292011c.get();
                LinkedWalletsScreenContract$InputData linkedWalletsScreenContract$InputData = lVar.f292009a;
                wtc.h hVar10 = (wtc.h) tVar2.U.get();
                vtc.t tVar3 = lVar.f292010b;
                wtc.h hVar11 = (wtc.h) tVar3.U.get();
                wtc.i iVar2 = new wtc.i();
                l93.f fVarJ = tVar3.e.j();
                vc.s.j(fVarJ);
                return new com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a(nVar8, linkedWalletsScreenContract$InputData, hVar10, new v60.g(hVar11, iVar2, fVarJ), tVar2.f292072n.e(), (q0) tVar2.f0.get());
            case 12:
                vtc.m mVar2 = (vtc.m) obj2;
                vtc.t tVar4 = (vtc.t) obj3;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    m93.d dVarF2 = mVar2.f292029b.e.f();
                    vc.s.j(dVarF2);
                    return new yuc.x(new xtc.c(dVarF2));
                }
                cli.n nVar9 = (cli.n) mVar2.f292030c.get();
                LinkedWalletsTabRevampScreenContract$InputData linkedWalletsTabRevampScreenContract$InputData = mVar2.f292028a;
                wtc.h hVar12 = (wtc.h) tVar4.U.get();
                l93.a aVar10 = (l93.a) tVar4.e.A.get();
                vc.s.j(aVar10);
                zja.a aVarA4 = ((ika.b) tVar4.f292071m).a();
                vc.s.j(aVarA4);
                ang.f fVarE2 = tVar4.f292072n.e();
                tla.d dVarB = tVar4.f292073p.b();
                vc.s.j(dVarB);
                return new yuc.u(nVar9, linkedWalletsTabRevampScreenContract$InputData, hVar12, aVar10, aVarA4, fVarE2, dVarB);
            case 13:
                if (i2 == 0) {
                    return new cvc.e((cli.n) ((vtc.p) obj2).f292038a.get());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                cej.b bVar10 = (cej.b) ((vtc.t) obj3).B.X.get();
                vc.s.j(bVar10);
                return new cvc.f(bVar10);
            case 14:
                vtc.t tVar5 = (vtc.t) obj3;
                vtc.q qVar2 = (vtc.q) obj2;
                if (i2 == 0) {
                    return s2l.c.j((r60.b) qVar2.d.get());
                }
                if (i2 == 1) {
                    return s2l.c.q((com.revolut.kompot.navigable.a) qVar2.f292041b.get(), (p0) qVar2.f292042c.get(), kxa.j.o(new nji.b()));
                }
                if (i2 == 2) {
                    return new p0();
                }
                if (i2 == 3) {
                    Object extension2 = (kuc.f) qVar2.f.get();
                    fvc.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension2, "extension");
                    yji.n nVar10 = (yji.n) extension2;
                    vc.s.k(nVar10);
                    return nVar10;
                }
                if (i2 != 4) {
                    if (i2 == 5) {
                        return new evc.n(new evc.k(qVar2.f292040a.f292066h.a()), (kuc.f) qVar2.f.get(), tVar5.f292080y.a());
                    }
                    throw new AssertionError(i2);
                }
                r60.b bVar11 = (r60.b) qVar2.d.get();
                k67.a aVar11 = (k67.a) tVar5.A.i.get();
                vc.s.j(aVar11);
                return new kuc.l(bVar11, aVar11, tVar5.f292066h.a());
            case 15:
                vtc.t tVar6 = (vtc.t) obj3;
                vtc.r rVar = (vtc.r) obj2;
                if (i2 == 0) {
                    return new rvc.n((cli.n) rVar.f292048b.get(), rVar.f292047a, tVar6.K.g(), tVar6.f292068j.d());
                }
                if (i2 == 1) {
                    return new rvc.o();
                }
                throw new AssertionError(i2);
            case 16:
                return a();
            case 17:
                vtc.x xVar = (vtc.x) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new pvc.a();
                    }
                    throw new AssertionError(i2);
                }
                w39.b bVarA3 = ((vtc.t) obj3).i.a();
                vc.s.j(bVarA3);
                pvc.a aVar12 = (pvc.a) xVar.d.get();
                StreetModeFlowContract$InputData streetModeFlowContract$InputData = xVar.f292092a;
                qvc.a aVar13 = new qvc.a();
                vtc.t tVar7 = xVar.f292093b;
                return new com.revolut.feature.security_hub.impl.ui.street_mode.flow.b(bVarA3, aVar12, streetModeFlowContract$InputData, aVar13, new r10.t(tVar7.f292072n.e(), (q0) tVar7.f0.get()));
            case 18:
                return b();
            case 19:
                return c();
            case 20:
                return d();
            case 21:
                return e();
            case 22:
                return f();
            case 23:
                return g();
            case 24:
                return h();
            case 25:
                return i();
            case 26:
                return j();
            case 27:
                return k();
            case 28:
                return l();
            default:
                vzc.b bVar12 = (vzc.b) obj3;
                vzc.i iVar3 = (vzc.i) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new c0d.f();
                    }
                    throw new AssertionError(i2);
                }
                c0d.k kVar = new c0d.k((ozc.d) bVar12.f293465y.get(), (ozc.f) bVar12.C.get(), (c0d.b) iVar3.f293499b.get());
                kli.a.p(kVar, bq.i.d(iVar3.f293498a.f293466a));
                return kVar;
        }
    }
}
