package fa0;

import android.app.Activity;
import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.services.ideal.impl.ui.accounts.IDealAccountsListControllerContract$InputData;
import com.revolut.feature.apm.services.ideal.impl.ui.auth.IdealAuthScreenContract$InputData;
import com.revolut.feature.apm.services.ideal.impl.ui.confirmation.IDealPaymentConfirmedScreenContract$InputData;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.market_alert_settings.impl.data.network.MarketAlertSettingsService;
import com.revolut.feature.profile.api.DocumentsPage;
import com.revolut.feature.profile.impl.ui.details.email.check_inbox.CheckInboxScreenContract$InputData;
import com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector.DocumentSelectorScreenContract$InputData;
import com.revolut.feature.profile.impl.ui.profile.ProfileFlowContract$InputData;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.NotificationSettingDetailsContract$InputData;
import com.revolut.feature.raffle.impl.screen.raffle.RaffleScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.documents.presentation.documents.ProductDocumentsContract$InputData;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.AddAssetRev10ScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$InputData;
import com.revolut.feature.wealth.tax_advantage_account.impl.ui.tax_allowance_detail.TaxAllowanceDetailScreenContract$InputData;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.details.PriceTargetsDetailsScreen;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.details.PriceTargetsDetailsScreenContract$InputData;
import dkk.a0;
import fma.c0;
import fma.d0;
import i60.b;
import ina.b0;
import ina.e0;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import l3d.h0;
import rp0.g1;
import rp0.x0;
import zxb.k0;

/* JADX INFO: loaded from: classes19.dex */
public final class q implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f133129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f133130c;
    public final Object d;

    public /* synthetic */ q(Object obj2, Object obj3, int i, int i2) {
        this.f133128a = i2;
        this.f133129b = obj2;
        this.d = obj3;
        this.f133130c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a() {
        zc6.b bVar = ((c0) this.f133129b).f136058h;
        fma.v vVar = (fma.v) this.d;
        DocumentSelectorScreenContract$InputData inputData = vVar.f136225a;
        int i = this.f133130c;
        if (i == 0) {
            fd6.a aVar = (fd6.a) vVar.d.get();
            va.g.t(aVar);
            return aVar;
        }
        if (i == 1) {
            return va.g.s(((zc6.a) bVar).d(), (xc6.a) vVar.f136227c.get());
        }
        if (i == 2) {
            return r6.b.k((zc6.a) bVar, "factory");
        }
        if (i == 3) {
            return va.g.u((xc6.a) vVar.f136227c.get());
        }
        if (i != 4) {
            if (i == 5) {
                return new gna.h(new gna.j(), inputData, (ina.k) vVar.f136228g.get());
            }
            throw new AssertionError(i);
        }
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(11);
        fna.h hVarC = vVar.c();
        fna.i iVar = new fna.i();
        c0 c0Var = vVar.f136226b;
        h9h.a aVar2 = c0Var.o;
        kpj.f fVar = new kpj.f(aVar2.H());
        eyd.b bVar2 = (eyd.b) c0Var.f136060j;
        vyd.b bVar3 = new vyd.b();
        zc6.a aVar3 = (zc6.a) c0Var.f136058h;
        i4b.f fVarB = aVar3.b();
        zjh.j jVarC = aVar3.c();
        mre.c cVarB = c0Var.f136073t.b();
        vc.s.j(cVarB);
        sla.h hVarB = c0Var.f136067p.f136166b.b();
        ite.a aVar4 = c0Var.e;
        gte.a aVarB = aVar4.b();
        vc.s.j(aVarB);
        builderBuilderWithExpectedSize.put(DocumentsPage.DocumentList.class, new ina.j(hVarC, iVar, fVar, bVar3, fVarB, jVarC, cVarB, hVarB, aVarB, new sr7.i(c0Var.f136076w.g())));
        fna.h hVarC2 = vVar.c();
        zxd.c cVarA = bVar2.a();
        vc.s.j(cVarA);
        zxd.a aVar5 = (zxd.a) bVar2.C.get();
        vc.s.j(aVar5);
        gte.a aVarB2 = aVar4.b();
        vc.s.j(aVarB2);
        ij0.a aVar6 = ((nj0.d) c0Var.f136078x).f216295c;
        builderBuilderWithExpectedSize.put(DocumentsPage.Personal.class, new ina.w(hVarC2, cVarA, aVar5, aVarB2, aVar6, new vyd.a(), new fna.i(), vVar.b()));
        fna.h hVarC3 = vVar.c();
        zxd.c cVarA2 = bVar2.a();
        vc.s.j(cVarA2);
        zxd.a aVar7 = (zxd.a) bVar2.C.get();
        vc.s.j(aVar7);
        gte.a aVarB3 = aVar4.b();
        vc.s.j(aVarB3);
        builderBuilderWithExpectedSize.put(DocumentsPage.Joint.class, new ina.t(hVarC3, cVarA2, aVar7, aVarB3, c0Var.k.c(), aVar6, new vyd.a(), new fna.i(), vVar.b()));
        fna.i iVar2 = new fna.i();
        fna.h hVarC4 = vVar.c();
        zxd.c cVarA3 = bVar2.a();
        vc.s.j(cVarA3);
        builderBuilderWithExpectedSize.put(DocumentsPage.General.class, new ina.n(iVar2, hVarC4, cVarA3, aVar6, new vyd.a()));
        zxd.c cVarA4 = bVar2.a();
        vc.s.j(cVarA4);
        builderBuilderWithExpectedSize.put(DocumentsPage.FinancialSummary.class, new ina.m(cVarA4, new fna.i(), aVar6, new vyd.a()));
        zxd.c cVarA5 = bVar2.a();
        vc.s.j(cVarA5);
        builderBuilderWithExpectedSize.put(DocumentsPage.AnnualAverage.class, new ina.b(cVarA5, new fna.i(), aVar6, new vyd.a()));
        builderBuilderWithExpectedSize.put(DocumentsPage.Savings.class, new b0(new fna.i(), ((fnb.b) c0Var.f136080y).a(), ((blb.e) c0Var.f136064n).e()));
        zxd.a aVar8 = (zxd.a) bVar2.C.get();
        vc.s.j(aVar8);
        gte.a aVarB4 = aVar4.b();
        vc.s.j(aVarB4);
        gr6.m mVarB = c0Var.f136068q.b();
        vc.s.j(mVarB);
        builderBuilderWithExpectedSize.put(DocumentsPage.Pro.class, new ina.x(aVar8, aVarB4, mVarB, new fna.i(), vVar.b()));
        zxd.c cVarA6 = bVar2.a();
        vc.s.j(cVarA6);
        builderBuilderWithExpectedSize.put(DocumentsPage.IncomeTaxStatement.class, new ina.q(cVarA6, new fna.i(), aVar6, new vyd.a()));
        xqe.b bVarA = c0Var.u.a();
        vc.s.j(bVarA);
        fna.h hVarC5 = vVar.c();
        wsg.b bVarA2 = c0Var.z.a();
        zxd.a aVar9 = (zxd.a) bVar2.C.get();
        vc.s.j(aVar9);
        zxd.c cVarA7 = bVar2.a();
        vc.s.j(cVarA7);
        builderBuilderWithExpectedSize.put(DocumentsPage.Teen.class, new e0(bVarA, inputData, hVarC5, bVarA2, aVar9, cVarA7, aVar6, new vyd.a(), new fna.i()));
        builderBuilderWithExpectedSize.put(DocumentsPage.GeneralInvestments.class, new ina.o(new fna.i(), new kpj.f(aVar2.H())));
        ImmutableMap extensions = builderBuilderWithExpectedSize.build();
        hna.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        V v = extensions.get(inputData.f81412a.getClass());
        if (v != 0) {
            return (ina.k) v;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final Object b() {
        c0 c0Var = (c0) this.f133129b;
        ore.b bVar = c0Var.f136073t;
        ite.a aVar = c0Var.e;
        fma.j jVar = c0Var.f136067p;
        int i = this.f133130c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            gte.a aVarB = aVar.b();
            vc.s.j(aVarB);
            return new joa.l(aVarB);
        }
        jki.p pVar = (jki.p) ((fma.b0) this.d).f136046a.get();
        ang.f fVarE = c0Var.i.e();
        mt8.d dVarB = c0Var.f136075v0.b();
        vc.s.j(dVarB);
        tla.d dVarB2 = c0Var.f136054c.b();
        vc.s.j(dVarB2);
        jma.f fVarA = c0Var.f136077w0.a();
        mre.c cVarB = bVar.b();
        vc.s.j(cVarB);
        sla.h hVarB = jVar.f136166b.b();
        pre.c cVarA = bVar.a();
        vc.s.j(cVarA);
        am2.a aVarI = jVar.f136165a.i();
        xoj.a aVarA = c0Var.f136079x0.a();
        vc.s.j(aVarA);
        lek.a aVar2 = (lek.a) c0Var.p0.f183121p.get();
        vc.s.j(aVar2);
        f80.a aVarX = c0Var.f136052b.x();
        vc.s.j(aVarX);
        gte.a aVarB2 = aVar.b();
        vc.s.j(aVarB2);
        til.m mVarA = c0Var.f136057g.a();
        vc.s.j(mVarA);
        pa.a aVar3 = (pa.a) c0Var.y0.f287092r.get();
        vc.s.j(aVar3);
        smd.s sVarE = jVar.f136167c.e();
        on2.b bVarA = c0Var.z0.a();
        vc.s.j(bVarA);
        sf0.h hVarB2 = c0Var.F.b();
        vc.s.j(hVarB2);
        v60.e eVarA = c0Var.G.a();
        vc.s.j(eVarA);
        return new joa.i(pVar, fVarE, dVarB, dVarB2, fVarA, cVarB, hVarB, cVarA, aVarI, aVarA, aVar2, aVarX, aVarB2, mVarA, aVar3, sVarE, bVarA, hVarB2, eVarA);
    }

    private final Object c() {
        d0 d0Var = (d0) this.d;
        c0 c0Var = (c0) this.f133129b;
        int i = this.f133130c;
        if (i == 0) {
            ProfileFlowContract$InputData profileFlowContract$InputData = d0Var.f136084a;
            pre.c cVarA = c0Var.f136073t.a();
            vc.s.j(cVarA);
            return new com.revolut.feature.profile.impl.ui.profile.a(profileFlowContract$InputData, cVarA);
        }
        if (i == 1) {
            com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) d0Var.e.get();
            nna.a.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            return new f01.c(controller.m2());
        }
        if (i == 2) {
            return new ln.c();
        }
        if (i == 3) {
            com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) d0Var.e.get();
            nna.a.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller2, "controller");
            return x0.a(g1.Companion, controller2.D2());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        ioa.b bVar = new ioa.b();
        y21.c cVarC = ((c21.b) c0Var.A0).c();
        am2.a aVarI = c0Var.f136067p.f136165a.i();
        toa.a aVarA = c0Var.B0.a();
        vc.s.j(aVarA);
        xh5.a aVarA2 = c0Var.H.a();
        vc.s.j(aVarA2);
        jla.h hVarA = c0Var.C0.a();
        gte.a aVarB = c0Var.e.b();
        vc.s.j(aVarB);
        return new hma.s(bVar, cVarC, aVarI, aVarA, aVarA2, hVarA, aVarB);
    }

    private final Object d() {
        c0 c0Var = (c0) this.f133129b;
        int i = this.f133130c;
        if (i != 0) {
            if (i == 1) {
                return new loa.m();
            }
            throw new AssertionError(i);
        }
        jki.p pVar = (jki.p) ((fma.e0) this.d).f136091a.get();
        gte.a aVarB = c0Var.e.b();
        vc.s.j(aVarB);
        ImmutableSet immutableSetOf = ImmutableSet.of();
        jvh.a aVarA = c0Var.f.a();
        vc.s.j(aVarA);
        til.m mVarA = c0Var.f136057g.a();
        vc.s.j(mVarA);
        return new loa.l(pVar, aVarB, immutableSetOf, aVarA, mVarA);
    }

    private final Object e() {
        fnb.c cVar = (fnb.c) this.d;
        fnb.e eVar = (fnb.e) this.f133129b;
        tib.b bVar = eVar.f136607b;
        int i = this.f133130c;
        if (i == 0) {
            clb.c extension = (clb.c) cVar.f136602b.get();
            knb.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            vc.s.k(extension);
            return extension;
        }
        if (i == 1) {
            a0 savingsErrorHandlingApiFactory = ((blb.e) bVar).d();
            knb.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(savingsErrorHandlingApiFactory, "savingsErrorHandlingApiFactory");
            return savingsErrorHandlingApiFactory.a();
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        jnb.m mVar = new jnb.m();
        ProductDocumentsContract$InputData productDocumentsContract$InputData = cVar.f136601a;
        gnb.b bVarA = ((fnb.b) eVar.f136606a).a();
        ijb.a aVarG = ((blb.e) bVar).g();
        vc.s.j(aVarG);
        return new jnb.p(mVar, productDocumentsContract$InputData, bVarA, aVarG);
    }

    private final Object f() {
        fsg.d dVar = (fsg.d) this.f133129b;
        int i = this.f133130c;
        if (i != 0) {
            if (i == 1) {
                return new hsg.c();
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) ((fsg.b) this.d).f137672a.get();
        y70.a aVarC = dVar.f137684n.c();
        vc.s.j(aVarC);
        return new hsg.b(nVar, aVarC, dVar.o.b());
    }

    private final Object g() {
        vxc.i iVar = ((fsg.d) this.f133129b).f137679g;
        int i = this.f133130c;
        if (i == 0) {
            jki.p pVar = (jki.p) ((fsg.c) this.d).f137674a.get();
            bal.a aVarB = ((vxc.b) iVar).b();
            vc.s.j(aVarB);
            return new ksg.k(pVar, new gsg.d(aVarB));
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        z9l.g gVar = (z9l.g) ((vxc.b) iVar).f293054r.get();
        vc.s.j(gVar);
        return new ksg.l(gVar);
    }

    @Override // phm.a
    public final Object get() {
        Object gVar;
        Object jVar;
        switch (this.f133128a) {
            case 0:
                k kVar = (k) this.f133129b;
                r rVar = (r) this.d;
                int i = this.f133130c;
                switch (i) {
                    case 0:
                        return kxa.j.k((j60.a) rVar.f133135h.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) rVar.f.get(), (rp0.m) rVar.f133134g.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return f0k.d.p((e60.a) rVar.f133141q.get());
                    case 4:
                        com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) rVar.f.get();
                        g60.a aVarA = f60.v.a((com.revolut.kompot.navigable.a) rVar.f.get());
                        Activity activityA = f60.t.a((com.revolut.kompot.navigable.a) rVar.f.get());
                        t80.g gVar2 = (t80.g) rVar.f133136j.get();
                        com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) rVar.f.get();
                        f60.y.a(aVar2);
                        d4m.a aVarA2 = e4m.b.a(rVar.k);
                        nli.a aVar3 = new nli.a((t80.c) rVar.f133137l.get(), f60.t.a((com.revolut.kompot.navigable.a) rVar.f.get()));
                        t80.g gVar3 = (t80.g) rVar.f133136j.get();
                        zk0.b bVarL = rVar.f133133c.f133103c.l();
                        vc.s.j(bVarL);
                        return v1.c.q(aVar, new t80.v(aVarA, activityA, gVar2, aVar2, aVarA2, aVar3, new oli.c(gVar3, bVarL, new nli.a((t80.c) rVar.f133137l.get(), f60.t.a((com.revolut.kompot.navigable.a) rVar.f.get())), f60.v.a((com.revolut.kompot.navigable.a) rVar.f.get()), rVar.c()), new oli.g(f60.u.a(f60.t.a((com.revolut.kompot.navigable.a) rVar.f.get())), v1.c.e((com.revolut.kompot.navigable.a) rVar.f.get()), new ami.n(e4m.b.a(rVar.f133138m), 1), e4m.b.a(rVar.k), (t80.g) rVar.f133136j.get(), new nli.a((t80.c) rVar.f133137l.get(), f60.t.a((com.revolut.kompot.navigable.a) rVar.f.get())), new i90.b(), rVar.b(), rVar.c()), rVar.c()), f60.x.a(), (rp0.m) rVar.f133139n.get(), (e60.t) rVar.f133140p.get());
                    case 5:
                        l70.e eVar = kVar.f133103c;
                        l70.e eVar2 = kVar.f133103c;
                        f80.a aVarX = eVar.x();
                        vc.s.j(aVarX);
                        l80.e eVarH = eVar2.h();
                        vc.s.j(eVarH);
                        zk0.b bVarL2 = eVar2.l();
                        vc.s.j(bVarL2);
                        return new t80.b(aVarX, eVarH, bVarL2);
                    case 6:
                        com.revolut.kompot.navigable.a aVar4 = (com.revolut.kompot.navigable.a) rVar.f.get();
                        f60.y.a(aVar4);
                        return pli.c.a(new ks0.n(aVar4));
                    case 7:
                        return nb0.f.a();
                    case 8:
                        return t96.a.a();
                    case 9:
                        return f60.z.a();
                    case 10:
                        aii.o oVar = (aii.o) rVar.o.get();
                        y80.a aVarR = kVar.f133103c.r();
                        vc.s.j(aVarR);
                        return new e60.y(oVar, aVarR, rVar.b(), Optional.empty());
                    case 11:
                        e60.t tVar = (e60.t) rVar.f133140p.get();
                        f60.w.a(tVar);
                        return tVar;
                    default:
                        throw new AssertionError(i);
                }
            case 1:
                k kVar2 = (k) this.f133129b;
                s sVar = (s) this.d;
                int i2 = this.f133130c;
                switch (i2) {
                    case 0:
                        return kxa.j.k((j60.a) sVar.f133148h.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) sVar.f.get(), (rp0.m) sVar.f133147g.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return f0k.d.p((e60.a) sVar.f133154q.get());
                    case 4:
                        com.revolut.kompot.navigable.a aVar5 = (com.revolut.kompot.navigable.a) sVar.f.get();
                        g60.a aVarA3 = f60.v.a((com.revolut.kompot.navigable.a) sVar.f.get());
                        Activity activityA2 = f60.t.a((com.revolut.kompot.navigable.a) sVar.f.get());
                        t80.g gVar4 = (t80.g) sVar.f133149j.get();
                        com.revolut.kompot.navigable.a aVar6 = (com.revolut.kompot.navigable.a) sVar.f.get();
                        f60.y.a(aVar6);
                        d4m.a aVarA4 = e4m.b.a(sVar.k);
                        nli.a aVar7 = new nli.a((t80.c) sVar.f133150l.get(), f60.t.a((com.revolut.kompot.navigable.a) sVar.f.get()));
                        t80.g gVar5 = (t80.g) sVar.f133149j.get();
                        zk0.b bVarL3 = sVar.f133146c.f133103c.l();
                        vc.s.j(bVarL3);
                        return v1.c.q(aVar5, new t80.v(aVarA3, activityA2, gVar4, aVar6, aVarA4, aVar7, new oli.c(gVar5, bVarL3, new nli.a((t80.c) sVar.f133150l.get(), f60.t.a((com.revolut.kompot.navigable.a) sVar.f.get())), f60.v.a((com.revolut.kompot.navigable.a) sVar.f.get()), sVar.c()), new oli.g(f60.u.a(f60.t.a((com.revolut.kompot.navigable.a) sVar.f.get())), v1.c.e((com.revolut.kompot.navigable.a) sVar.f.get()), new ami.n(e4m.b.a(sVar.f133151m), 1), e4m.b.a(sVar.k), (t80.g) sVar.f133149j.get(), new nli.a((t80.c) sVar.f133150l.get(), f60.t.a((com.revolut.kompot.navigable.a) sVar.f.get())), new i90.b(), sVar.b(), sVar.c()), sVar.c()), f60.x.a(), (rp0.m) sVar.f133152n.get(), (e60.t) sVar.f133153p.get());
                    case 5:
                        l70.e eVar3 = kVar2.f133103c;
                        l70.e eVar4 = kVar2.f133103c;
                        f80.a aVarX2 = eVar3.x();
                        vc.s.j(aVarX2);
                        l80.e eVarH2 = eVar4.h();
                        vc.s.j(eVarH2);
                        zk0.b bVarL4 = eVar4.l();
                        vc.s.j(bVarL4);
                        return new t80.b(aVarX2, eVarH2, bVarL4);
                    case 6:
                        com.revolut.kompot.navigable.a aVar8 = (com.revolut.kompot.navigable.a) sVar.f.get();
                        f60.y.a(aVar8);
                        return pli.c.a(new ks0.n(aVar8));
                    case 7:
                        return nb0.f.a();
                    case 8:
                        return t96.a.a();
                    case 9:
                        return f60.z.a();
                    case 10:
                        aii.o oVar2 = (aii.o) sVar.o.get();
                        y80.a aVarR2 = kVar2.f133103c.r();
                        vc.s.j(aVarR2);
                        return new e60.y(oVar2, aVarR2, sVar.b(), Optional.empty());
                    case 11:
                        e60.t tVar2 = (e60.t) sVar.f133153p.get();
                        f60.w.a(tVar2);
                        return tVar2;
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                k kVar3 = (k) this.f133129b;
                w wVar = (w) this.d;
                int i3 = this.f133130c;
                if (i3 == 0) {
                    return kxa.j.k((j60.a) wVar.f.get());
                }
                if (i3 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) wVar.d.get(), (rp0.m) wVar.e.get());
                }
                if (i3 == 2) {
                    return new rp0.m();
                }
                if (i3 == 3) {
                    dc0.f extension = (dc0.f) wVar.f133170h.get();
                    zb0.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    vc.s.k(extension);
                    return extension;
                }
                if (i3 != 4) {
                    throw new AssertionError(i3);
                }
                FormScreen formScreen = wVar.f133167b;
                BackendFlow backendFlow = ((j) wVar.f133171j).f133070a;
                fc0.i iVar = (fc0.i) wVar.f133168c.f133104g.f311715l.get();
                vc.s.j(iVar);
                r10.q qVar = new r10.q(backendFlow, formScreen, iVar);
                l80.e eVarH3 = kVar3.f133103c.h();
                vc.s.j(eVarH3);
                return new dc0.f(formScreen, qVar, eVarH3, new yk0.d());
            case 3:
                k kVar4 = (k) this.f133129b;
                w wVar2 = (w) this.d;
                int i5 = this.f133130c;
                if (i5 == 0) {
                    return kxa.j.k((j60.a) wVar2.f.get());
                }
                if (i5 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) wVar2.d.get(), (rp0.m) wVar2.e.get());
                }
                if (i5 == 2) {
                    return new rp0.m();
                }
                if (i5 == 3) {
                    dc0.f extension2 = (dc0.f) wVar2.f133170h.get();
                    zb0.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension2, "extension");
                    vc.s.k(extension2);
                    return extension2;
                }
                if (i5 != 4) {
                    throw new AssertionError(i5);
                }
                FormScreen formScreen2 = wVar2.f133167b;
                BackendFlow backendFlow2 = ((h) wVar2.f133171j).f133036a;
                fc0.i iVar2 = (fc0.i) wVar2.f133168c.f133104g.f311715l.get();
                vc.s.j(iVar2);
                r10.q qVar2 = new r10.q(backendFlow2, formScreen2, iVar2);
                l80.e eVarH4 = kVar4.f133103c.h();
                vc.s.j(eVarH4);
                return new dc0.f(formScreen2, qVar2, eVarH4, new yk0.d());
            case 4:
                fae.b bVar = (fae.b) this.f133129b;
                fae.a aVar9 = (fae.a) this.d;
                fae.b bVar2 = aVar9.f133291c;
                xoi.d dVar = aVar9.f133289a;
                int i6 = this.f133130c;
                switch (i6) {
                    case 0:
                        return new xpi.c(xpi.f.d, bq.i.b(dVar));
                    case 1:
                        return new en.c(ImmutableSet.of((ln.d) bVar2.f133298g.get()), bq.i.l(dVar));
                    case 2:
                        gVar = new iri.g((iri.j) bVar.f.get(), (iri.m) bVar.f133299h.get(), bq.i.f(dVar), bq.i.l(dVar));
                        break;
                    case 3:
                        return new iri.l((iri.m) bVar.f133299h.get(), bq.i.f(dVar), (iri.d) aVar9.f133292g.get());
                    case 4:
                        return new iri.d(bq.i.f(dVar));
                    case 5:
                        gae.f fVar = (gae.f) bVar.f133298g.get();
                        xpi.g gVar6 = (xpi.g) aVar9.d.get();
                        thf.l lVarF = bVar2.f133295a.f();
                        vc.s.j(lVarF);
                        gVar = new eae.h(fVar, gVar6, new jae.a(lVarF), (f9b.f) aVar9.i.get(), aVar9.f133290b, (gae.c) bVar.i.get());
                        break;
                    case 6:
                        return bq.i.t(dVar);
                    default:
                        throw new AssertionError(i6);
                }
                return gVar;
            case 5:
                fc4.c cVar = (fc4.c) this.f133129b;
                fc4.b bVar3 = (fc4.b) this.d;
                int i21 = this.f133130c;
                switch (i21) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(bVar3.f133628a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(bVar3.f133628a);
                        t70.g gVarO = cVar.f133638b.o();
                        vc.s.j(gVarO);
                        return new npi.c(contextI, baseDelegatesActivityF, gVarO);
                    case 2:
                        return new tpi.i((rpi.c) bVar3.f.get(), gsi.c.a(bVar3.f133628a));
                    case 3:
                        return new rpi.b(bq.i.b(bVar3.f133628a));
                    case 4:
                        return new rpi.h(bq.i.b(bVar3.f133628a));
                    case 5:
                        iri.j jVar2 = (iri.j) cVar.f.get();
                        e4m.e eVar5 = bVar3.i;
                        fsi.g gVar7 = bVar3.f133628a;
                        return new iri.g(jVar2, (iri.m) eVar5.get(), bq.i.f(gVar7), bq.i.l(gVar7));
                    case 6:
                        return new iri.b();
                    case 7:
                        return new iri.l((iri.m) bVar3.i.get(), bq.i.f(bVar3.f133628a), (iri.d) bVar3.k.get());
                    case 8:
                        return new iri.d(bq.i.f(bVar3.f133628a));
                    case 9:
                        return new opi.b(bq.i.f(bVar3.f133628a));
                    case 10:
                        sri.m mVarL = bq.i.l(bVar3.f133628a);
                        WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration = bVar3.f133629b;
                        fc4.c cVar2 = bVar3.f133630c;
                        pgi.l lVar = (pgi.l) ((e4m.e) cVar2.i).get();
                        wli.x xVarD = ((s41.a) cVar2.d).d();
                        sri.m mVarL2 = bq.i.l(bVar3.f133628a);
                        f80.a aVarX3 = cVar2.f133638b.x();
                        vc.s.j(aVarX3);
                        pgi.s sVar2 = new pgi.s(webViewContract$WebViewConfiguration, lVar, xVarD, mVarL2, aVarX3);
                        f80.a aVarX4 = cVar.f133638b.x();
                        vc.s.j(aVarX4);
                        return new ec4.c(mVarL, sVar2, aVarX4);
                    default:
                        throw new AssertionError(i21);
                }
            case 6:
                fd2.g gVar8 = (fd2.g) this.f133129b;
                fd2.h hVar = (fd2.h) this.d;
                int i22 = this.f133130c;
                if (i22 != 0) {
                    if (i22 == 1) {
                        return new gd2.k();
                    }
                    throw new AssertionError(i22);
                }
                IDealAccountsListControllerContract$InputData iDealAccountsListControllerContract$InputData = hVar.f133872a;
                ad2.a aVar10 = (ad2.a) gVar8.d.f133865j.get();
                vc.s.j(aVar10);
                f80.a aVarX5 = gVar8.f133868a.x();
                vc.s.j(aVarX5);
                return new gd2.j(iDealAccountsListControllerContract$InputData, aVar10, aVarX5, (cli.n) hVar.f133873b.get());
            case 7:
                fd2.g gVar9 = (fd2.g) this.f133129b;
                fd2.k kVar5 = (fd2.k) this.d;
                IDealPaymentConfirmedScreenContract$InputData iDealPaymentConfirmedScreenContract$InputData = kVar5.f133880a;
                int i32 = this.f133130c;
                if (i32 != 0) {
                    if (i32 == 1) {
                        return new com.revolut.feature.apm.services.ideal.impl.ui.confirmation.c(iDealPaymentConfirmedScreenContract$InputData);
                    }
                    throw new AssertionError(i32);
                }
                f80.a aVarX6 = gVar9.f133868a.x();
                vc.s.j(aVarX6);
                return new com.revolut.feature.apm.services.ideal.impl.ui.confirmation.b(iDealPaymentConfirmedScreenContract$InputData, aVarX6, (sri.m) gVar9.f133871g.get(), (cli.n) kVar5.f133881b.get());
            case 8:
                fd2.m mVar = (fd2.m) this.d;
                int i33 = this.f133130c;
                if (i33 != 0) {
                    if (i33 == 1) {
                        return new hd2.f();
                    }
                    throw new AssertionError(i33);
                }
                IdealAuthScreenContract$InputData idealAuthScreenContract$InputData = mVar.f133886a;
                f80.a aVarX7 = ((fd2.g) this.f133129b).f133868a.x();
                vc.s.j(aVarX7);
                return new hd2.c(idealAuthScreenContract$InputData, aVarX7, (cli.n) mVar.f133887b.get());
            case 9:
                fdj.a aVar11 = (fdj.a) this.f133129b;
                fdj.c cVar3 = (fdj.c) this.d;
                int i43 = this.f133130c;
                switch (i43) {
                    case 0:
                        jpc.e factory = aVar11.b();
                        pcj.f viewDelegate = (pcj.f) cVar3.f133957g.get();
                        pcj.a controllerModelExtension = (pcj.a) cVar3.f.get();
                        j60.a bottomExpandableDialogControllerExtension = (j60.a) cVar3.f133959j.get();
                        qcj.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
                        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                        Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
                        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                        return new o9h.f(viewDelegate, controllerModelExtension, bottomExpandableDialogControllerExtension, (rdj.a) factory.d);
                    case 1:
                        jpc.e factory2 = aVar11.b();
                        pcj.e view = (pcj.e) cVar3.d.get();
                        pcj.a router = (pcj.a) cVar3.f.get();
                        pcj.d presentationModel = (pcj.d) cVar3.e.get();
                        qcj.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(router, "router");
                        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
                        Intrinsics.checkNotNullParameter(router, "router");
                        jVar = new rdj.j(view, presentationModel, router);
                        break;
                    case 2:
                        BaseScreen screen = cVar3.f133954a;
                        mdj.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        return (PriceTargetsDetailsScreen) screen;
                    case 3:
                        jpc.e factory3 = aVar11.b();
                        pcj.d presentationModel2 = (pcj.d) cVar3.e.get();
                        od0.i overrideInitialState = cVar3.f133955b;
                        qcj.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        Intrinsics.checkNotNullParameter(presentationModel2, "presentationModel");
                        Intrinsics.checkNotNullParameter(overrideInitialState, "overrideInitialState");
                        Intrinsics.checkNotNullParameter(presentationModel2, "presentationModel");
                        Intrinsics.checkNotNullParameter(overrideInitialState, "overrideInitialState");
                        jVar = new tdj.c(presentationModel2, overrideInitialState);
                        break;
                    case 4:
                        jpc.e factory4 = aVar11.b();
                        qcj.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        return new rdj.h((a61.a) factory4.f177257c, (l80.e) factory4.f177256b);
                    case 5:
                        return h30.l.p((com.revolut.kompot.navigable.a) cVar3.f133958h.get(), (rp0.m) cVar3.i.get());
                    case 6:
                        return new rp0.m();
                    case 7:
                        return kxa.j.l((j60.a) cVar3.f133959j.get());
                    case 8:
                        a61.a aVarA5 = aVar11.a();
                        pcj.a aVar12 = (pcj.a) cVar3.f.get();
                        PriceTargetsDetailsScreenContract$InputData priceTargetsDetailsScreenContract$InputData = cVar3.f133956c;
                        z0h.d dVarC = ((u8h.b) aVar11.f133943h).c();
                        vc.s.j(dVarC);
                        return new ldj.f(aVarA5, aVar12, priceTargetsDetailsScreenContract$InputData, dVarC, (jki.p) cVar3.f133962n.get());
                    case 9:
                        jVar = new ldj.i((pcj.c) cVar3.f133961m.get());
                        break;
                    case 10:
                        jpc.e factory5 = aVar11.b();
                        qcj.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory5, "factory");
                        return new rdj.c((l80.e) factory5.f177256b);
                    default:
                        throw new AssertionError(i43);
                }
                return jVar;
            case 10:
                fe5.b bVar4 = (fe5.b) this.d;
                fe5.a aVar13 = (fe5.a) this.f133129b;
                int i59 = this.f133130c;
                if (i59 == 0) {
                    return new je5.q((cli.n) bVar4.f134448b.get(), bVar4.f134447a, (ge5.a) bVar4.f134449c.get());
                }
                if (i59 == 1) {
                    return new je5.r();
                }
                if (i59 != 2) {
                    throw new AssertionError(i59);
                }
                fk3.a aVarA6 = aVar13.f134444a.a();
                vc.s.j(aVarA6);
                td0.b bVarA = vd0.d.a();
                nw5.j jVarD = aVar13.f134445b.d();
                vc.s.j(jVarD);
                return new ge5.g(aVarA6, bVarA, jVarD, aVar13.f134446c.b());
            case 11:
                fgd.b bVar5 = (fgd.b) this.d;
                int i66 = this.f133130c;
                if (i66 == 0) {
                    return kxa.j.l((j60.a) bVar5.e.get());
                }
                if (i66 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) bVar5.f135036c.get(), (rp0.m) bVar5.d.get());
                }
                if (i66 == 2) {
                    return new rp0.m();
                }
                if (i66 == 3) {
                    return new bgd.h(bVar5.f135035b, (jki.p) bVar5.f135037g.get(), (ghd.c) bVar5.f135038h.get(), (j60.a) bVar5.e.get());
                }
                if (i66 == 4) {
                    return new bgd.i();
                }
                if (i66 != 5) {
                    throw new AssertionError(i66);
                }
                ifd.h hVarB = ((fgd.d) this.f133129b).e.b();
                vc.s.j(hVarB);
                return new ghd.d(hVarB);
            case 12:
                fgd.d dVar2 = (fgd.d) this.f133129b;
                fgd.g gVar10 = (fgd.g) this.d;
                int i74 = this.f133130c;
                if (i74 == 0) {
                    return trl.f.i((t60.b) gVar10.d.get());
                }
                if (i74 == 1) {
                    return trl.f.r(gVar10.f135050a);
                }
                if (i74 != 2) {
                    if (i74 == 3) {
                        return new jgd.y();
                    }
                    throw new AssertionError(i74);
                }
                d3d.g gVar11 = (d3d.g) ((c3d.c) dVar2.f135042a).f20934c.get();
                vc.s.j(gVar11);
                SharedConverterScreenContract$InputData sharedConverterScreenContract$InputData = gVar10.f135051b;
                w80.b bVarJ = dVar2.f135044c.j();
                vc.s.j(bVarJ);
                return new jgd.x(gVar11, sharedConverterScreenContract$InputData, bVarJ, (jki.p) gVar10.f.get());
            case 13:
                fgd.d dVar3 = (fgd.d) this.f133129b;
                y2d.b bVar6 = dVar3.f135043b;
                fgd.i iVar3 = (fgd.i) this.d;
                SharedFavouritesAddAssetScreenContract$InputData sharedFavouritesAddAssetScreenContract$InputData = iVar3.f135058b;
                int i92 = this.f133130c;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new AssertionError(i92);
                    }
                    ifd.d dVar4 = (ifd.d) bVar6.i.get();
                    vc.s.j(dVar4);
                    return new com.revolut.feature.shared_separate_favourites.common.screen.add_asset.b(sharedFavouritesAddAssetScreenContract$InputData, dVar4);
                }
                m3d.d dVar5 = (m3d.d) dVar3.d.d.get();
                vc.s.j(dVar5);
                n3d.c cVarA = bVar6.a();
                vc.s.j(cVarA);
                return new yfd.w(sharedFavouritesAddAssetScreenContract$InputData, dVar5, cVarA, (jki.p) iVar3.f135059c.get());
            case 14:
                fhd.b bVar7 = (fhd.b) this.f133129b;
                fhd.a aVar14 = (fhd.a) this.d;
                AddAssetRev10ScreenContract$InputData addAssetRev10ScreenContract$InputData = aVar14.f135202a;
                int i96 = this.f133130c;
                if (i96 == 0) {
                    jki.p pVar = (jki.p) aVar14.f135203b.get();
                    m3d.d dVar6 = (m3d.d) bVar7.d.d.get();
                    vc.s.j(dVar6);
                    return new com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.a(pVar, dVar6, addAssetRev10ScreenContract$InputData);
                }
                if (i96 != 1) {
                    throw new AssertionError(i96);
                }
                ifd.d dVar7 = (ifd.d) bVar7.f135206b.i.get();
                vc.s.j(dVar7);
                return new com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.b(dVar7, addAssetRev10ScreenContract$InputData);
            case 15:
                fhd.c cVar4 = (fhd.c) this.d;
                fhd.b bVar8 = (fhd.b) this.f133129b;
                k3d.b bVar9 = bVar8.f135207c;
                int i99 = this.f133130c;
                if (i99 != 0) {
                    if (i99 == 1) {
                        return new phd.a();
                    }
                    throw new AssertionError(i99);
                }
                WatchlistAddAssetFlowContract$InputData watchlistAddAssetFlowContract$InputData = cVar4.f135208a;
                ifd.d dVar8 = (ifd.d) cVar4.f135209b.f135206b.i.get();
                vc.s.j(dVar8);
                com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.e eVar6 = new com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.e(dVar8);
                h0 h0VarB = bVar9.b();
                vc.s.j(h0VarB);
                l3d.r rVarA = bVar9.a();
                vc.s.j(rVarA);
                z2d.c cVar5 = (z2d.c) bVar8.f135206b.f310627g.get();
                vc.s.j(cVar5);
                return new com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.h(watchlistAddAssetFlowContract$InputData, eVar6, h0VarB, rVarA, cVar5, (phd.a) cVar4.d.get());
            case 16:
                fhh.a aVar15 = (fhh.a) this.d;
                int i100 = this.f133130c;
                if (i100 != 0) {
                    if (i100 == 1) {
                        return new thh.f();
                    }
                    throw new AssertionError(i100);
                }
                cli.n nVar = (cli.n) aVar15.f135231b.get();
                TaxAllowanceDetailScreenContract$InputData taxAllowanceDetailScreenContract$InputData = aVar15.f135230a;
                ybl.k kVarD = ((fhh.b) this.f133129b).f135233a.d();
                vc.s.j(kVarD);
                return new thh.d(nVar, taxAllowanceDetailScreenContract$InputData, kVarD);
            case 17:
                fma.d dVar9 = (fma.d) this.d;
                int i101 = this.f133130c;
                if (i101 != 0) {
                    if (i101 == 1) {
                        return new vma.a();
                    }
                    throw new AssertionError(i101);
                }
                CheckInboxScreenContract$InputData checkInboxScreenContract$InputData = dVar9.f136081a;
                tma.m mVar2 = new tma.m();
                l80.h hVarV = ((fma.h) this.f133129b).o.v();
                vc.s.j(hVarV);
                return new tma.l(checkInboxScreenContract$InputData, mVar2, hVarV, (vma.a) dVar9.f136082b.get());
            case 18:
                c0 c0Var = (c0) this.f133129b;
                ckg.a aVar16 = c0Var.f136050a;
                l70.e eVar7 = c0Var.f136052b;
                fma.s sVar3 = (fma.s) this.d;
                int i102 = this.f133130c;
                if (i102 == 0) {
                    return kxa.j.k((j60.a) sVar3.f136220c.get());
                }
                if (i102 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) sVar3.f136218a.get(), (rp0.m) sVar3.f136219b.get());
                }
                if (i102 == 2) {
                    return new rp0.m();
                }
                if (i102 != 3) {
                    if (i102 != 4) {
                        throw new AssertionError(i102);
                    }
                    vjg.g gVarA = aVar16.a();
                    vc.s.j(gVarA);
                    return new rna.k(gVarA);
                }
                cli.n nVar2 = (cli.n) sVar3.e.get();
                qd0.b bVarN = eVar7.n();
                vc.s.j(bVarN);
                ekg.g gVarB = aVar16.b();
                j60.a aVar17 = (j60.a) sVar3.f136220c.get();
                s70.a aVarM = eVar7.m();
                vc.s.j(aVarM);
                return new rna.i(nVar2, bVarN, gVarB, aVar17, aVarM, eVar7.f);
            case 19:
                fma.t tVar3 = (fma.t) this.d;
                c0 c0Var2 = (c0) this.f133129b;
                l70.e eVar8 = c0Var2.f136052b;
                ckg.a aVar18 = c0Var2.f136050a;
                int i103 = this.f133130c;
                if (i103 == 0) {
                    return kxa.j.l((j60.a) tVar3.f136223c.get());
                }
                if (i103 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) tVar3.f136221a.get(), (rp0.m) tVar3.f136222b.get());
                }
                if (i103 == 2) {
                    return new rp0.m();
                }
                if (i103 != 3) {
                    if (i103 != 4) {
                        throw new AssertionError(i103);
                    }
                    fkg.c cVar6 = new fkg.c(new fkg.a(aVar18.f24834a));
                    vjg.g gVarA2 = aVar18.a();
                    vc.s.j(gVarA2);
                    l80.e eVarH5 = eVar8.h();
                    vc.s.j(eVarH5);
                    return new tna.u(cVar6, gVarA2, eVarH5);
                }
                jki.p pVar2 = (jki.p) tVar3.e.get();
                ekg.g gVarB2 = aVar18.b();
                rla.c cVar7 = (rla.c) c0Var2.f136054c.C.get();
                vc.s.j(cVar7);
                u7l.c cVar8 = (u7l.c) c0Var2.d.f260868g.get();
                vc.s.j(cVar8);
                j60.a aVar19 = (j60.a) tVar3.f136223c.get();
                l80.e eVarH6 = eVar8.h();
                vc.s.j(eVarH6);
                k70.a aVar20 = (k70.a) eVar8.v.get();
                vc.s.j(aVar20);
                return new tna.r(pVar2, gVarB2, cVar7, cVar8, aVar19, eVarH6, aVar20);
            case 20:
                return a();
            case 21:
                c0 c0Var3 = (c0) this.f133129b;
                int i104 = this.f133130c;
                if (i104 == 0) {
                    return new com.revolut.feature.profile.impl.ui.documents_redesigned.flow.a(((fma.w) this.d).f136230a);
                }
                if (i104 != 1) {
                    if (i104 == 2) {
                        return new fna.j(c0Var3.B.a());
                    }
                    throw new AssertionError(i104);
                }
                rpg.a provider = (rpg.a) ((wpg.l) c0Var3.A).Y.get();
                vc.s.j(provider);
                lna.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                Intrinsics.checkNotNullParameter("VaultsCurrencyPickerInteractor", "key");
                Object obj2 = provider.f256385a.get("VaultsCurrencyPickerInteractor");
                Intrinsics.h(obj2);
                return (a8a.d) obj2;
            case 22:
                fma.a0 a0Var = (fma.a0) this.d;
                c0 c0Var4 = a0Var.f136038b;
                c0 c0Var5 = (c0) this.f133129b;
                k0 k0Var = c0Var5.f136053b0;
                int i105 = this.f133130c;
                if (i105 == 0) {
                    foa.w handler = (foa.w) a0Var.d.get();
                    goa.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(handler, "handler");
                    vc.s.k(handler);
                    return handler;
                }
                if (i105 == 1) {
                    return new foa.w();
                }
                if (i105 == 2) {
                    prl.e factory6 = c0Var5.E0.b();
                    z08.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory6, "factory");
                    return new s18.e((mk0.a) factory6.f239325b, (gte.a) factory6.f239326c, (toa.a) factory6.d, (ybl.k) factory6.e);
                }
                if (i105 != 3) {
                    if (i105 != 4) {
                        throw new AssertionError(i105);
                    }
                    eoa.b bVar10 = new eoa.b();
                    eub.a aVarA7 = c0Var4.f136053b0.a();
                    vc.s.j(aVarA7);
                    gte.a aVarB = c0Var4.e.b();
                    vc.s.j(aVarB);
                    r10.d dVar10 = new r10.d(aVarA7, aVarB);
                    eub.a aVarA8 = k0Var.a();
                    vc.s.j(aVarA8);
                    eub.k kVar6 = (eub.k) k0Var.Q.get();
                    vc.s.j(kVar6);
                    gte.a aVarB2 = c0Var4.e.b();
                    vc.s.j(aVarB2);
                    return new foa.o(bVar10, dVar10, aVarA8, kVar6, new hoa.b(aVarB2));
                }
                NotificationSettingDetailsContract$InputData notificationSettingDetailsContract$InputData = a0Var.f136037a;
                foa.b bVar11 = (foa.b) a0Var.f136040g.get();
                foa.w wVar3 = (foa.w) a0Var.d.get();
                mre.c cVarB = c0Var5.f136073t.b();
                vc.s.j(cVarB);
                toa.a notificationSettingsInteractor = (toa.a) a0Var.f136039c.i.get();
                pp3.b creditCollectionInteractor = (pp3.b) ((t15.d) c0Var4.D0).U.get();
                vc.s.j(creditCollectionInteractor);
                Intrinsics.checkNotNullParameter(notificationSettingsInteractor, "notificationSettingsInteractor");
                Intrinsics.checkNotNullParameter(creditCollectionInteractor, "creditCollectionInteractor");
                r10.w wVar4 = new r10.w();
                wVar4.f250865a = notificationSettingsInteractor;
                wVar4.f250866b = creditCollectionInteractor;
                e59.b bVar12 = c0Var5.F0;
                h59.c repository = new h59.c((MarketAlertSettingsService) bVar12.e.get(), (ue0.c) bVar12.f.get(), (ne0.j) bVar12.f122793g.get());
                gte.a featureToggleInteractor = bVar12.d.b();
                vc.s.j(featureToggleInteractor);
                Intrinsics.checkNotNullParameter(repository, "repository");
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                r10.a aVar21 = new r10.a();
                aVar21.f250811a = repository;
                aVar21.f250812b = featureToggleInteractor;
                eub.k kVar7 = (eub.k) k0Var.Q.get();
                vc.s.j(kVar7);
                l61.a aVarB3 = c0Var5.i.b();
                vc.s.j(aVarB3);
                gte.a aVarB4 = c0Var5.e.b();
                vc.s.j(aVarB4);
                return new com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.a(notificationSettingDetailsContract$InputData, bVar11, wVar3, cVarB, wVar4, aVar21, kVar7, aVarB3, aVarB4, (y08.a) a0Var.f.get());
            case 23:
                return b();
            case 24:
                return c();
            case 25:
                return d();
            case 26:
                return e();
            case 27:
                return f();
            case 28:
                return g();
            default:
                fta.b bVar13 = (fta.b) this.f133129b;
                l70.e eVar9 = bVar13.f;
                fta.d dVar11 = (fta.d) this.d;
                int i106 = this.f133130c;
                if (i106 == 0) {
                    com.revolut.kompot.navigable.a aVar22 = (com.revolut.kompot.navigable.a) dVar11.f137993c.get();
                    i60.b.Companion.getClass();
                    return b.a.a(aVar22);
                }
                if (i106 == 1) {
                    ii5.a aVarD = bVar13.f137975b.d();
                    vc.s.j(aVarD);
                    return w40.c.j(aVarD);
                }
                if (i106 != 2) {
                    if (i106 != 3) {
                        throw new AssertionError(i106);
                    }
                    g80.c cVarY = eVar9.y();
                    vc.s.j(cVarY);
                    return new jta.w(cVarY, new lta.b(dVar11.f137992b.f137977g.g()));
                }
                cli.n nVar3 = (cli.n) dVar11.f.get();
                RaffleScreenContract$InputData raffleScreenContract$InputData = dVar11.f137991a;
                zsa.d dVar12 = new zsa.d((cta.c) bVar13.v.get());
                wli.x xVarD2 = ((s41.a) bVar13.i).d();
                h60.d dVar13 = (h60.d) dVar11.d.get();
                vh5.a aVar23 = (vh5.a) dVar11.e.get();
                s70.a aVarM2 = eVar9.m();
                vc.s.j(aVarM2);
                return new jta.v(nVar3, raffleScreenContract$InputData, dVar12, xVarD2, dVar13, aVar23, aVarM2);
        }
    }
}
