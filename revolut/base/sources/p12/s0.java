package p12;

import android.content.Context;
import androidx.appcompat.view.ContextThemeWrapper;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.data.network.AliasManagementService;
import com.revolut.feature.pix.impl.data.network.PixAuthorisationsService;
import com.revolut.feature.pix.impl.data.network.PixQrCodeService;
import com.revolut.feature.pix.impl.data.network.PixTransactionsService;
import com.revolut.feature.pix.impl.data.network.TrustedBeneficiariesService;
import com.revolut.retail.feature.payments.bank_transfer.impl.data.network.BankTransferService;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import dfj.b1;
import dw3.c1;
import et6.h1;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import n33.r2;
import n33.s2;
import om4.m4;
import p8a.l1;
import p8a.n1;
import p8a.s1;
import p8a.u1;
import p8a.y1;
import sgm.e3;

/* JADX INFO: loaded from: classes20.dex */
public final class s0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f231764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f231765c;

    public /* synthetic */ s0(Object obj2, int i, int i2) {
        this.f231763a = i2;
        this.f231765c = obj2;
        this.f231764b = i;
    }

    private final Object a() {
        p8a.c cVar = (p8a.c) this.f231765c;
        int i = this.f231764b;
        switch (i) {
            case 0:
                n8a.o oVar = (n8a.o) cVar.f233913s.get();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) cVar.e).c();
                vc.s.j(aVarC);
                return new s8a.e(oVar, aVarC);
            case 1:
                return new n8a.o((AliasManagementService) cVar.f233911q.get(), (ue0.c) cVar.f233912r.get(), new ne0.d());
            case 2:
                y1 y1Var = cVar.f233901a;
                AliasManagementService aliasManagementService = (AliasManagementService) a0.d.f((nj0.d) cVar.f233902b, "retrofit", AliasManagementService.class, "create(...)");
                vc.s.k(aliasManagementService);
                return aliasManagementService;
            case 3:
                le0.b gsonObjectMapperFactory = cVar.f233903c.c();
                vc.s.j(gsonObjectMapperFactory);
                kg.o baseGson = fe0.c.a();
                yk0.a databaseSessionProvider = cVar.d.b();
                vc.s.j(databaseSessionProvider);
                xe0.f storageFactory = cVar.f233903c.f();
                vc.s.j(storageFactory);
                u1.Companion.getClass();
                Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
                Intrinsics.checkNotNullParameter(baseGson, "baseGson");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "pix", gsonObjectMapperFactory.a(new kg.p(baseGson).b()), 1, zhm.f0.f322471a, 32);
            case 4:
                n8a.x xVar = (n8a.x) cVar.v.get();
                xua.a aVarA = cVar.f.a();
                vc.s.j(aVarA);
                return new s8a.f(xVar, aVarA);
            case 5:
                return new n8a.x((PixAuthorisationsService) cVar.u.get(), new ne0.d());
            case 6:
                y1 y1Var2 = cVar.f233901a;
                PixAuthorisationsService pixAuthorisationsService = (PixAuthorisationsService) a0.d.f((nj0.d) cVar.f233902b, "retrofit", PixAuthorisationsService.class, "create(...)");
                vc.s.k(pixAuthorisationsService);
                return pixAuthorisationsService;
            case 7:
                return new n8a.s((PixAuthorisationsService) cVar.u.get());
            case 8:
                return new n8a.b0((PixQrCodeService) cVar.f233917y.get(), new ne0.d(), new com.revolut.feature.pix.impl.domain.error.b(fe0.c.a()));
            case 9:
                y1 y1Var3 = cVar.f233901a;
                PixQrCodeService pixQrCodeService = (PixQrCodeService) a0.d.f((nj0.d) cVar.f233902b, "retrofit", PixQrCodeService.class, "create(...)");
                vc.s.k(pixQrCodeService);
                return pixQrCodeService;
            case 10:
                return new vca.i();
            case 11:
                return new uca.d();
            case 12:
                return new uca.f();
            case 13:
                return new tca.f((vca.i) cVar.A.get());
            case 14:
                return new s8a.m(new n8a.d0((PixTransactionsService) cVar.E.get(), ((c21.b) cVar.i).a()));
            case 15:
                y1 y1Var4 = cVar.f233901a;
                PixTransactionsService pixTransactionsService = (PixTransactionsService) a0.d.f((nj0.d) cVar.f233902b, "retrofit", PixTransactionsService.class, "create(...)");
                vc.s.k(pixTransactionsService);
                return pixTransactionsService;
            case 16:
                sf0.h hVarB = cVar.f233906j.b();
                vc.s.j(hVarB);
                return new uca.c(hVarB);
            case 17:
                return new s8a.n((n8a.f0) cVar.I.get());
            case 18:
                return new n8a.f0((TrustedBeneficiariesService) cVar.H.get(), (ue0.c) cVar.f233912r.get(), new ne0.d(), new k8a.d());
            case 19:
                y1 y1Var5 = cVar.f233901a;
                TrustedBeneficiariesService trustedBeneficiariesService = (TrustedBeneficiariesService) a0.d.f((nj0.d) cVar.f233902b, "retrofit", TrustedBeneficiariesService.class, "create(...)");
                vc.s.k(trustedBeneficiariesService);
                return trustedBeneficiariesService;
            case 20:
                return new s8a.c((n8a.o) cVar.f233913s.get(), new m8a.d());
            case 21:
                return new vca.g();
            case 22:
                lx1.d dVarB = ((ey1.e) cVar.k).b();
                vc.s.j(dVarB);
                cl3.a aVarD = cVar.f233907l.d();
                vc.s.j(aVarD);
                return new vca.d(dVarB, aVarD);
            case 23:
                return new sca.f();
            case 24:
                sri.m mVar = (sri.m) cVar.O.get();
                uw1.c cVarD = ((lz1.m) cVar.f233909n).d();
                vc.s.j(cVarD);
                gte.a aVarB = cVar.o.b();
                vc.s.j(aVarB);
                return new sca.e(mVar, cVarD, aVarB, cVar.f233910p.c());
            case 25:
                Context context = cVar.f233908m;
                s1.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return sri.o.c(context, null, null, 14);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        int i = this.f231764b;
        if (i == 0) {
            n1 n1Var = (n1) this.f231765c;
            return new uba.g(n1Var.f234037b, (cli.n) n1Var.f234038c.get());
        }
        if (i == 1) {
            return new uba.f();
        }
        throw new AssertionError(i);
    }

    private final Object c() {
        pa6.c cVar = (pa6.c) this.f231765c;
        int i = this.f231764b;
        if (i != 0) {
            if (i == 1) {
                return new ec6.n();
            }
            throw new AssertionError(i);
        }
        pa6.m mVar = cVar.f234351a;
        aa6.c cVar2 = (aa6.c) mVar.T.get();
        ppk.f fVarA = mVar.v.a();
        wsg.n nVarB = mVar.f234395m.b();
        xua.a aVarA = mVar.f234393j.a();
        vc.s.j(aVarA);
        sa6.b bVar = (sa6.b) mVar.c0.get();
        whf.b bVarA = mVar.f234402w.a();
        vc.s.j(bVarA);
        return new ec6.m(new dc6.c(cVar2, fVarA, nVarB, aVarA, bVar, bVarA, (sa6.h) mVar.f234389d0.get()), (jki.p) cVar.f234352b.get());
    }

    private final Object d() {
        pa6.v vVar = (pa6.v) this.f231765c;
        y96.f fVar = vVar.f234430a;
        int i = this.f231764b;
        if (i == 0) {
            return new b1(fVar.a(), vVar.f234431b.a());
        }
        if (i == 1) {
            return new c1g.v(fVar.a());
        }
        throw new AssertionError(i);
    }

    private final Object e() {
        e5f.a aVar = (e5f.a) this.f231765c;
        int i = this.f231764b;
        if (i == 0) {
            return new obh.d(aVar.f122817b.e());
        }
        if (i == 1) {
            return new obh.a(aVar.f122818c.s());
        }
        if (i == 2) {
            return new obh.c();
        }
        throw new AssertionError(i);
    }

    private final Object f() {
        pgf.e eVar = (pgf.e) this.f231765c;
        jge.j jVar = eVar.f235894a;
        int i = this.f231764b;
        if (i == 0) {
            return new rgf.y(new rgf.w(((jge.m) jVar.e).e(), jVar.a()), ((jge.m) jVar.e).e());
        }
        if (i == 1) {
            return new ogf.d();
        }
        if (i == 2) {
            return new ob8.a((sb8.a) ((rb8.a) eVar.D).f252984q.get(), new yb8.a());
        }
        throw new AssertionError(i);
    }

    @Override // phm.a
    public final Object get() {
        Object hVar;
        switch (this.f231763a) {
            case 0:
                int i = this.f231764b;
                if (i == 0) {
                    return new com.revolut.feature.apm.core.ui.impl.ui.topup_request.a(((t0) this.f231765c).f231768a);
                }
                if (i == 1) {
                    return new hx1.b();
                }
                throw new AssertionError(i);
            case 1:
                int i2 = this.f231764b;
                if (i2 == 0) {
                    x0 x0Var = (x0) this.f231765c;
                    return new x42.l(x0Var.f231819a, (cli.n) x0Var.f231820b.get());
                }
                if (i2 == 1) {
                    return new x42.m();
                }
                throw new AssertionError(i2);
            case 2:
                p28.a aVar = (p28.a) this.f231765c;
                int i3 = this.f231764b;
                if (i3 == 0) {
                    return new h28.j((h28.e) aVar.f232102b.get());
                }
                if (i3 == 1) {
                    return new h28.i(aVar.f232101a);
                }
                throw new AssertionError(i3);
            case 3:
                p28.b bVar = (p28.b) this.f231765c;
                int i5 = this.f231764b;
                switch (i5) {
                    case 0:
                        v28.f popularAssetsWidgetMapper = bVar.o();
                        t9h.a popularAssetsPresentationModel = bVar.p();
                        w28.g popularEtfsWidgetVariant = new w28.g(bVar.n());
                        u28.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(popularAssetsWidgetMapper, "popularAssetsWidgetMapper");
                        Intrinsics.checkNotNullParameter(popularAssetsPresentationModel, "popularAssetsPresentationModel");
                        Intrinsics.checkNotNullParameter(popularEtfsWidgetVariant, "popularEtfsWidgetVariant");
                        return new t28.e(popularAssetsWidgetMapper, popularAssetsPresentationModel, popularEtfsWidgetVariant);
                    case 1:
                        v28.f popularAssetsWidgetMapper2 = bVar.o();
                        t9h.a popularAssetsPresentationModel2 = bVar.p();
                        tzg.m mVarT = bVar.f232106b.t();
                        vc.s.j(mVarT);
                        w28.e popularCfdsWidgetVariant = new w28.e(mVarT);
                        u28.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(popularAssetsWidgetMapper2, "popularAssetsWidgetMapper");
                        Intrinsics.checkNotNullParameter(popularAssetsPresentationModel2, "popularAssetsPresentationModel");
                        Intrinsics.checkNotNullParameter(popularCfdsWidgetVariant, "popularCfdsWidgetVariant");
                        return new t28.e(popularAssetsWidgetMapper2, popularAssetsPresentationModel2, popularCfdsWidgetVariant);
                    case 2:
                        v28.f popularAssetsWidgetMapper3 = bVar.o();
                        t9h.a popularAssetsPresentationModel3 = bVar.p();
                        ybl.i iVarB = bVar.e.b();
                        vc.s.j(iVarB);
                        w28.b popularBondsWidgetVariant = new w28.b(iVarB);
                        u28.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(popularAssetsWidgetMapper3, "popularAssetsWidgetMapper");
                        Intrinsics.checkNotNullParameter(popularAssetsPresentationModel3, "popularAssetsPresentationModel");
                        Intrinsics.checkNotNullParameter(popularBondsWidgetVariant, "popularBondsWidgetVariant");
                        return new t28.e(popularAssetsWidgetMapper3, popularAssetsPresentationModel3, popularBondsWidgetVariant);
                    case 3:
                        f28.e0 e0Var = new f28.e0();
                        nwg.a factory = ((ewg.h) bVar.f).a();
                        g28.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        kwg.l lVarA = factory.a(gwg.a.TRADING);
                        gte.a aVarB = bVar.f232111g.b();
                        vc.s.j(aVarB);
                        ybl.l lVarF = bVar.f232106b.f();
                        wif.a aVarA = bVar.f232112h.a();
                        hbh.o oVar = (hbh.o) bVar.i.d.get();
                        vc.s.j(oVar);
                        return new f28.t(e0Var, lVarA, aVarB, lVarF, aVarA, oVar);
                    case 4:
                        n28.d dVarN = bVar.n();
                        l28.j jVar = new l28.j(((joh.w) bVar.f232114j).a());
                        ugl.c cVarD = bVar.k.d();
                        vc.s.j(cVarD);
                        hVar = new l28.h(dVarN, jVar, cVarD, bVar.f232106b.g());
                        break;
                    case 5:
                        whl.e eVar = bVar.f232116l;
                        l70.e eVar2 = bVar.f232118n;
                        yhl.d dVarA = eVar.a();
                        vc.s.j(dVarA);
                        ybl.b bVarB = bVar.f232117m.b();
                        vc.s.j(bVarB);
                        fkg.a aVar2 = new fkg.a(bVarB);
                        l80.e eVarH = eVar2.h();
                        vc.s.j(eVarH);
                        h8b.k kVar = new h8b.k(aVar2, eVarH, dVarA);
                        l80.e eVarH2 = eVar2.h();
                        vc.s.j(eVarH2);
                        j8b.f fVar = new j8b.f();
                        l80.e eVarH3 = eVar2.h();
                        vc.s.j(eVarH3);
                        hVar = new o28.f(kVar, new j8b.h(eVarH2, fVar, new j8b.e(eVarH3), new j8b.d(), new j8b.c()), bVar.f232106b.f());
                        break;
                    case 6:
                        q18.c cVarA = bVar.o.a();
                        a1k.b bVar2 = new a1k.b();
                        n28.d dVarN2 = bVar.n();
                        jt0.b bVarC = bVar.o.c();
                        gte.a aVarB2 = bVar.f232111g.b();
                        vc.s.j(aVarB2);
                        m0k.e eVar3 = (m0k.e) bVar.f232121p.H.get();
                        vc.s.j(eVar3);
                        ybl.k kVarD = bVar.e.d();
                        vc.s.j(kVarD);
                        hVar = new s28.h(cVarA, bVar2, dVarN2, new s28.f(bVarC, aVarB2, eVar3, kVarD));
                        break;
                    case 7:
                        v28.f fVarO = bVar.o();
                        t9h.a aVarP = bVar.p();
                        n28.d investWidgetAvailabilityProvider = bVar.n();
                        Intrinsics.checkNotNullParameter(investWidgetAvailabilityProvider, "investWidgetAvailabilityProvider");
                        uc.d dVar = new uc.d();
                        dVar.f278952a = investWidgetAvailabilityProvider;
                        dVar.f278953b = zel.f.STOCKS;
                        dVar.f278954c = new TextLocalisedClause(R$string.wealth_invest_widget_popular_stocks_error_title, null, null, 14);
                        hVar = new w28.h(fVarO, aVarP, dVar);
                        break;
                    case 8:
                        rul.e factory2 = bVar.f232122q.a();
                        jbh.e performanceAssetMapper = bVar.f232106b.C();
                        y28.a aVar3 = y28.b.Companion;
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        Intrinsics.checkNotNullParameter(performanceAssetMapper, "assetMapper");
                        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
                        v9h.c cVar = new v9h.c(performanceAssetMapper);
                        rul.e factory3 = bVar.f232122q.a();
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        v9h.f fVar2 = new v9h.f((e3) factory3.f257629a, (y2f.a) factory3.f257630b);
                        n28.d dVarN3 = bVar.n();
                        gte.a aVarB3 = bVar.f232111g.b();
                        vc.s.j(aVarB3);
                        hVar = new x28.j(cVar, fVar2, dVarN3, aVarB3);
                        break;
                    case 9:
                        zdl.f fVar3 = bVar.e;
                        ite.a aVar4 = bVar.f232111g;
                        ybl.i iVarB2 = fVar3.b();
                        vc.s.j(iVarB2);
                        h9h.a aVar5 = bVar.f232106b;
                        tzg.m mVarT2 = aVar5.t();
                        vc.s.j(mVarT2);
                        gte.a aVarB4 = aVar4.b();
                        vc.s.j(aVarB4);
                        z28.r rVar = new z28.r(iVarB2, mVarT2, aVarB4, aVar5.g());
                        gte.a aVarB5 = aVar4.b();
                        vc.s.j(aVarB5);
                        hVar = new z28.q(rVar, new z28.z(aVarB5), bVar.n());
                        break;
                    case 10:
                        hbh.o oVar2 = (hbh.o) bVar.i.d.get();
                        vc.s.j(oVar2);
                        h1h.d dVar2 = (h1h.d) bVar.i.e.get();
                        vc.s.j(dVar2);
                        hVar = new d38.g(oVar2, dVar2, bVar.n());
                        break;
                    case 11:
                        nih.a aVar6 = (nih.a) ((mkh.s) bVar.f232123r).u0.get();
                        vc.s.j(aVar6);
                        m28.g gVar = (m28.g) bVar.O.get();
                        tzg.m mVarT3 = bVar.f232106b.t();
                        vc.s.j(mVarT3);
                        hVar = new m28.e(aVar6, gVar, mVarT3);
                        break;
                    case 12:
                        jlh.y commoditiesSorter = (jlh.y) ((mkh.s) bVar.f232123r).f206427t0.get();
                        vc.s.j(commoditiesSorter);
                        Intrinsics.checkNotNullParameter(commoditiesSorter, "commoditiesSorter");
                        hVar = new m28.h();
                        break;
                    case 13:
                        n28.d dVarN4 = bVar.n();
                        ite.a aVar7 = bVar.f232111g;
                        gte.a aVarB6 = aVar7.b();
                        vc.s.j(aVarB6);
                        j28.m mVar = new j28.m(dVarN4, aVarB6);
                        gte.a aVarB7 = aVar7.b();
                        vc.s.j(aVarB7);
                        j28.b bVar3 = new j28.b(aVarB7);
                        gte.a aVarB8 = aVar7.b();
                        vc.s.j(aVarB8);
                        h9h.a aVar8 = bVar.f232106b;
                        j28.j jVar2 = new j28.j(aVarB8, aVar8.f());
                        gte.a aVarB9 = aVar7.b();
                        vc.s.j(aVarB9);
                        j28.g gVar2 = new j28.g(aVarB9);
                        j28.p pVar = new j28.p(bVar.n(), aVar8.q());
                        gte.a aVarB10 = aVar7.b();
                        vc.s.j(aVarB10);
                        ImmutableSet immutableSetOf = ImmutableSet.of((j28.r) mVar, (j28.r) bVar3, (j28.r) jVar2, (j28.r) gVar2, (j28.r) pVar, new j28.r(aVarB10, bVar.m()), (j28.r[]) new j28.e[0]);
                        n28.d dVarN5 = bVar.n();
                        gte.a aVarB11 = aVar7.b();
                        vc.s.j(aVarB11);
                        hVar = new i28.g(immutableSetOf, dVarN5, aVarB11);
                        break;
                    case 14:
                        tzg.m mVarT4 = bVar.f232106b.t();
                        vc.s.j(mVarT4);
                        ybl.i iVarB3 = bVar.e.b();
                        vc.s.j(iVarB3);
                        ybl.l lVarF2 = bVar.f232106b.f();
                        gte.a aVarB12 = bVar.f232111g.b();
                        vc.s.j(aVarB12);
                        hVar = new f38.c(mVarT4, iVarB3, lVarF2, aVarB12);
                        break;
                    case 15:
                        g3d.a factory4 = (g3d.a) bVar.f232125s.f180694p.get();
                        vc.s.j(factory4);
                        jpc.e widgetDataProvider = bVar.q();
                        f38.b watchlistWidgetConfigProvider = bVar.m();
                        r10.d symbolWidgetConfigProvider = new r10.d((f38.c) bVar.Q.get(), bVar.n());
                        com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.a assetSelectorScreenProvider = new com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.a();
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
                        Intrinsics.checkNotNullParameter(watchlistWidgetConfigProvider, "watchlistWidgetConfigProvider");
                        Intrinsics.checkNotNullParameter(symbolWidgetConfigProvider, "symbolWidgetConfigProvider");
                        Intrinsics.checkNotNullParameter(assetSelectorScreenProvider, "assetSelectorScreenProvider");
                        return g3d.a.a(widgetDataProvider, assetSelectorScreenProvider, symbolWidgetConfigProvider, watchlistWidgetConfigProvider);
                    case 16:
                        g3d.a factory5 = (g3d.a) bVar.f232125s.f180694p.get();
                        vc.s.j(factory5);
                        jpc.e widgetDataProvider2 = bVar.q();
                        f38.b watchlistWidgetConfigProvider2 = bVar.m();
                        r10.d symbolWidgetConfigProvider2 = new r10.d((f38.c) bVar.Q.get(), bVar.n());
                        com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.a assetSelectorScreenProvider2 = new com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.a();
                        Intrinsics.checkNotNullParameter(factory5, "factory");
                        Intrinsics.checkNotNullParameter(widgetDataProvider2, "widgetDataProvider");
                        Intrinsics.checkNotNullParameter(watchlistWidgetConfigProvider2, "watchlistWidgetConfigProvider");
                        Intrinsics.checkNotNullParameter(symbolWidgetConfigProvider2, "symbolWidgetConfigProvider");
                        Intrinsics.checkNotNullParameter(assetSelectorScreenProvider2, "assetSelectorScreenProvider");
                        return g3d.a.a(widgetDataProvider2, assetSelectorScreenProvider2, symbolWidgetConfigProvider2, watchlistWidgetConfigProvider2);
                    case 17:
                        s3d.l lVarB = bVar.f232125s.b();
                        vc.s.j(lVarB);
                        return vtc.p0.s(lVarB, bVar.q(), bVar.m());
                    case 18:
                        s3d.l lVarB2 = bVar.f232125s.b();
                        vc.s.j(lVarB2);
                        return vtc.p0.q(lVarB2, bVar.q(), bVar.m());
                    case 19:
                        s3d.l lVarB3 = bVar.f232125s.b();
                        vc.s.j(lVarB3);
                        return vtc.p0.A(lVarB3, bVar.q(), bVar.m());
                    case 20:
                        s3d.l lVarB4 = bVar.f232125s.b();
                        vc.s.j(lVarB4);
                        return vtc.p0.k(lVarB4, bVar.q(), bVar.m());
                    case 21:
                        ufm.d factory6 = bVar.f232127t.a();
                        zjh.j widgetDataProvider3 = new zjh.j(bVar.n());
                        c38.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory6, "factory");
                        Intrinsics.checkNotNullParameter(widgetDataProvider3, "widgetDataProvider");
                        return factory6.f(widgetDataProvider3);
                    case 22:
                        e84.e trendCollectionsWidgetFactory = ((th7.b) bVar.u).a();
                        e38.f trendCollectionWidgetAvailabilityProvider = bVar.k();
                        r28.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(trendCollectionsWidgetFactory, "trendCollectionsWidgetFactory");
                        Intrinsics.checkNotNullParameter(trendCollectionWidgetAvailabilityProvider, "trendCollectionWidgetAvailabilityProvider");
                        return trendCollectionsWidgetFactory.a(nh7.d.MOST_TRADED, trendCollectionWidgetAvailabilityProvider);
                    case 23:
                        e84.e trendCollectionsWidgetFactory2 = ((th7.b) bVar.u).a();
                        e38.f trendCollectionWidgetAvailabilityProvider2 = bVar.k();
                        Intrinsics.checkNotNullParameter(trendCollectionsWidgetFactory2, "trendCollectionsWidgetFactory");
                        Intrinsics.checkNotNullParameter(trendCollectionWidgetAvailabilityProvider2, "trendCollectionWidgetAvailabilityProvider");
                        return trendCollectionsWidgetFactory2.a(nh7.d.POPULAR_STARTER_CFDS, trendCollectionWidgetAvailabilityProvider2);
                    case 24:
                        e84.e trendCollectionsWidgetFactory3 = ((th7.b) bVar.u).a();
                        e38.f trendCollectionWidgetAvailabilityProvider3 = bVar.k();
                        Intrinsics.checkNotNullParameter(trendCollectionsWidgetFactory3, "trendCollectionsWidgetFactory");
                        Intrinsics.checkNotNullParameter(trendCollectionWidgetAvailabilityProvider3, "trendCollectionWidgetAvailabilityProvider");
                        return trendCollectionsWidgetFactory3.a(nh7.d.CFDS_PNL_DRIVERS, trendCollectionWidgetAvailabilityProvider3);
                    case 25:
                        e84.e trendCollectionsWidgetFactory4 = ((th7.b) bVar.u).a();
                        e38.f trendCollectionWidgetAvailabilityProvider4 = bVar.k();
                        Intrinsics.checkNotNullParameter(trendCollectionsWidgetFactory4, "trendCollectionsWidgetFactory");
                        Intrinsics.checkNotNullParameter(trendCollectionWidgetAvailabilityProvider4, "trendCollectionWidgetAvailabilityProvider");
                        return trendCollectionsWidgetFactory4.a(nh7.d.RECOMMENDED_BUYS, trendCollectionWidgetAvailabilityProvider4);
                    case 26:
                        e84.e trendCollectionsWidgetFactory5 = ((th7.b) bVar.u).a();
                        r28.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(trendCollectionsWidgetFactory5, "trendCollectionsWidgetFactory");
                        nh7.d widget = nh7.d.MOST_TRADED;
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        hVar = new cdh.a(widget);
                        break;
                    case 27:
                        k28.l topMoversWidgetCatalogueProvider = new k28.l();
                        c38.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(topMoversWidgetCatalogueProvider, "topMoversWidgetCatalogueProvider");
                        return topMoversWidgetCatalogueProvider;
                    case 28:
                        g3d.a factory7 = (g3d.a) bVar.f232125s.f180694p.get();
                        vc.s.j(factory7);
                        b38.b titleProvider = new b38.b();
                        Intrinsics.checkNotNullParameter(factory7, "factory");
                        Intrinsics.checkNotNullParameter(titleProvider, "titleProvider");
                        Intrinsics.checkNotNullParameter(titleProvider, "titleProvider");
                        return new f3d.a(titleProvider, 0);
                    case 29:
                        s3d.l lVarB5 = bVar.f232125s.b();
                        vc.s.j(lVarB5);
                        return vtc.p0.g(lVarB5, bVar.q(), bVar.m());
                    case 30:
                        s3d.l lVarB6 = bVar.f232125s.b();
                        vc.s.j(lVarB6);
                        return vtc.p0.z(lVarB6, new b38.b());
                    case 31:
                        Intrinsics.checkNotNullParameter(((th7.b) bVar.u).a(), "trendCollectionsWidgetFactory");
                        nh7.d widget2 = nh7.d.POPULAR_STARTER_CFDS;
                        Intrinsics.checkNotNullParameter(widget2, "widget");
                        hVar = new cdh.a(widget2);
                        break;
                    case 32:
                        Intrinsics.checkNotNullParameter(((th7.b) bVar.u).a(), "trendCollectionsWidgetFactory");
                        nh7.d widget3 = nh7.d.CFDS_PNL_DRIVERS;
                        Intrinsics.checkNotNullParameter(widget3, "widget");
                        hVar = new cdh.a(widget3);
                        break;
                    case 33:
                        Intrinsics.checkNotNullParameter(((th7.b) bVar.u).a(), "trendCollectionsWidgetFactory");
                        nh7.d widget4 = nh7.d.RECOMMENDED_BUYS;
                        Intrinsics.checkNotNullParameter(widget4, "widget");
                        hVar = new cdh.a(widget4);
                        break;
                    case 34:
                        return new k28.d();
                    case 35:
                        return new k28.k();
                    case 36:
                        return new k28.m();
                    case 37:
                        return new f28.u();
                    case 38:
                        return new k28.i();
                    case 39:
                        return new k28.f();
                    case 40:
                        return new k28.j();
                    case 41:
                        return new k28.h();
                    case 42:
                        return new k28.g();
                    case 43:
                        return new k28.c();
                    case 44:
                        return new k28.e();
                    case 45:
                        return new k28.b();
                    case 46:
                        return new k28.a();
                    case 47:
                        f4h.a widgetsInteractorFactory = bVar.f232104a.b();
                        csh.k widgetsDependenciesApi = (csh.k) bVar.y0.get();
                        Intrinsics.checkNotNullParameter(widgetsInteractorFactory, "widgetsInteractorFactory");
                        Intrinsics.checkNotNullParameter(widgetsDependenciesApi, "widgetsDependenciesApi");
                        return widgetsInteractorFactory.i(widgetsDependenciesApi);
                    case 48:
                        return new e28.b();
                    case 49:
                        return new q28.a();
                    default:
                        throw new AssertionError(i5);
                }
                return hVar;
            case 4:
                p2k.f fVar4 = (p2k.f) this.f231765c;
                c21.e eVar4 = fVar4.f232328c;
                int i6 = this.f231764b;
                if (i6 == 0) {
                    xua.a aVarA2 = fVar4.f232327b.a();
                    vc.s.j(aVarA2);
                    q2k.f fVar5 = (q2k.f) fVar4.f232331j.get();
                    wsg.n nVarB = fVar4.e.b();
                    z71.a aVarF = ((c21.b) eVar4).f();
                    vc.s.j(aVarF);
                    mri.w wVarA = ((ozl.a) fVar4.f).a();
                    vc.s.j(wVarA);
                    return new q2k.e(aVarA2, fVar5, nVarB, aVarF, wVarA, fVar4.f232329g.a());
                }
                if (i6 == 1) {
                    BankTransferService bankTransferService = (BankTransferService) fVar4.f232330h.get();
                    ne0.j jVar3 = (ne0.j) fVar4.i.get();
                    rga.c cVarB = fVar4.d.b();
                    vc.s.j(cVarB);
                    return new l2k.g(bankTransferService, jVar3, cVarB);
                }
                if (i6 != 2) {
                    if (i6 == 3) {
                        return new ne0.d();
                    }
                    throw new AssertionError(i6);
                }
                BankTransferService bankTransferService2 = (BankTransferService) v0.a.f((c21.b) eVar4, "retrofit", BankTransferService.class, "create(...)");
                vc.s.k(bankTransferService2);
                return bankTransferService2;
            case 5:
                int i21 = this.f231764b;
                if (i21 == 0) {
                    p2k.m mVar2 = (p2k.m) this.f231765c;
                    return new y2k.a(mVar2.f232394a, (jki.p) mVar2.f232396c.get());
                }
                if (i21 == 1) {
                    return new y2k.j();
                }
                throw new AssertionError(i21);
            case 6:
                p2k.n nVar = (p2k.n) this.f231765c;
                c21.e eVar5 = nVar.e;
                int i22 = this.f231764b;
                if (i22 == 0) {
                    xua.a aVarA3 = nVar.d.a();
                    vc.s.j(aVarA3);
                    q2k.f fVar6 = (q2k.f) nVar.f232408k0.get();
                    wsg.n nVarB2 = nVar.f.b();
                    z71.a aVarF2 = ((c21.b) eVar5).f();
                    vc.s.j(aVarF2);
                    mri.w wVarA2 = ((ozl.a) nVar.f232404g).a();
                    vc.s.j(wVarA2);
                    return new q2k.e(aVarA3, fVar6, nVarB2, aVarF2, wVarA2, nVar.f232405h.a());
                }
                if (i22 == 1) {
                    BankTransferService bankTransferService3 = (BankTransferService) nVar.i0.get();
                    ne0.j jVar4 = (ne0.j) nVar.j0.get();
                    rga.c cVarB2 = nVar.f232401c.b();
                    vc.s.j(cVarB2);
                    return new l2k.g(bankTransferService3, jVar4, cVarB2);
                }
                if (i22 == 2) {
                    BankTransferService bankTransferService4 = (BankTransferService) v0.a.f((c21.b) eVar5, "retrofit", BankTransferService.class, "create(...)");
                    vc.s.k(bankTransferService4);
                    return bankTransferService4;
                }
                if (i22 == 3) {
                    return new ne0.d();
                }
                if (i22 == 4) {
                    return new u5k.d(nVar.Z.a());
                }
                throw new AssertionError(i22);
            case 7:
                p2k.t tVar = (p2k.t) this.f231765c;
                bw9.a aVar9 = tVar.f232476b;
                ite.a aVar10 = tVar.f232475a;
                int i32 = this.f231764b;
                if (i32 == 0) {
                    gte.a aVarB13 = aVar10.b();
                    vc.s.j(aVarB13);
                    return new f5k.a(aVarB13, aVar9.a());
                }
                if (i32 != 1) {
                    throw new AssertionError(i32);
                }
                gte.a aVarB14 = aVar10.b();
                vc.s.j(aVarB14);
                cw9.d dVarA2 = aVar9.a();
                g3k.d dVarB = tVar.f232477c.b();
                vc.s.j(dVarB);
                return new g5k.c(aVarB14, dVarA2, new fkg.a(new f2k.e(dVarB, ((b3j.p) tVar.d).e())));
            case 8:
                p33.b bVar4 = (p33.b) this.f231765c;
                int i33 = this.f231764b;
                switch (i33) {
                    case 0:
                        hri.b bVar5 = bVar4.f232578a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar6 = bVar4.f232578a;
                        return new iri.j();
                    case 2:
                        return new s2();
                    case 3:
                        return new cn.e();
                    case 4:
                        return new um.c();
                    case 5:
                        bVar4.getClass();
                        return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 6:
                        return new ln.c();
                    case 7:
                        return new ym.d();
                    case 8:
                        return new mm.d();
                    case 9:
                        return rga.l.b(bVar4.f232582c, (ln.a) bVar4.Q.get(), (mm.d) bVar4.S.get(), bVar4.a());
                    case 10:
                        ai3.c cVar2 = bVar4.f232582c;
                        com.google.firebase.messaging.t tVarA = bVar4.a();
                        g3l.a aVar11 = (g3l.a) bVar4.U.get();
                        ln.a aVar12 = (ln.a) bVar4.Q.get();
                        rh3.d dVar3 = (rh3.d) bVar4.V.get();
                        sf0.h hVarB = bVar4.d.b();
                        vc.s.j(hVarB);
                        ym.d dVar4 = (ym.d) bVar4.R.get();
                        v60.e eVarA = bVar4.e.a();
                        vc.s.j(eVarA);
                        return rga.l.a(cVar2, tVarA, aVar11, aVar12, dVar3, hVarB, dVar4, eVarA);
                    case 11:
                        return new g3l.g();
                    case 12:
                        ai3.c api2 = bVar4.f232582c;
                        Intrinsics.checkNotNullParameter(api2, "api");
                        ((ai3.b) api2.f5179q.get()).getClass();
                        return new zh3.f();
                    case 13:
                        bi3.d dVar5 = bVar4.f;
                        ta9.m mVar3 = bVar4.f232585h;
                        sh3.a aVarA4 = dVar5.a();
                        vc.s.j(aVarA4);
                        l93.f fVarJ = bVar4.f232584g.j();
                        vc.s.j(fVarJ);
                        u89.a aVarB15 = mVar3.b();
                        vc.s.j(aVarB15);
                        q89.e eVarA2 = mVar3.a();
                        vc.s.j(eVarA2);
                        return cwi.u.b(bVar4.a(), fVarJ, t2d.c.c(bVar4.i.f271230a), eVarA2, aVarA4, aVarB15, ((oq8.a) bVar4.f232586j).c());
                    case 14:
                        return new sm.e();
                    case 15:
                        return new om.c();
                    case 16:
                        return rga.l.c(bVar4.f232582c, (ln.a) bVar4.Q.get(), (zh3.g) bVar4.f232579a0.get());
                    case 17:
                        ai3.c api3 = bVar4.f232582c;
                        rh3.d state = (rh3.d) bVar4.V.get();
                        Intrinsics.checkNotNullParameter(api3, "api");
                        Intrinsics.checkNotNullParameter(state, "state");
                        ((ai3.b) api3.f5179q.get()).getClass();
                        Intrinsics.checkNotNullParameter(state, "state");
                        return new zh3.g(state);
                    case 18:
                        jm4.r rVar2 = bVar4.k;
                        ei5.d dVar6 = bVar4.v;
                        efk.a aVar13 = bVar4.u;
                        da3.j jVar5 = bVar4.f232584g;
                        xmg.a aVar14 = bVar4.f232589n;
                        fy2.d dVar7 = bVar4.f232594t;
                        jm4.r rVar3 = bVar4.k;
                        al4.p pVarI = rVar2.i();
                        al4.j jVarC = rVar3.c();
                        bm4.a aVarE = rVar3.e();
                        al4.q qVarA = rVar3.a();
                        q89.e eVarA3 = bVar4.f232585h.a();
                        vc.s.j(eVarA3);
                        xh9.a aVarE2 = bVar4.f232587l.e();
                        vc.s.j(aVarE2);
                        fk3.a aVarA5 = bVar4.f232588m.a();
                        vc.s.j(aVarA5);
                        ang.f fVarE = aVar14.e();
                        n33.w wVar = (n33.w) bVar4.M.get();
                        sh3.a aVarA6 = bVar4.f.a();
                        vc.s.j(aVarA6);
                        wsg.n nVarB3 = bVar4.o.b();
                        l93.f fVarJ2 = jVar5.j();
                        vc.s.j(fVarJ2);
                        ha3.c cVar3 = (ha3.c) jVar5.F.get();
                        vc.s.j(cVar3);
                        gr6.e eVarA4 = bVar4.f232590p.a();
                        vc.s.j(eVarA4);
                        gr6.a aVarA7 = bVar4.f232591q.a();
                        vc.s.j(aVarA7);
                        gr6.h hVarK = bVar4.f232592r.k();
                        vc.s.j(hVarK);
                        g48.r0 r0VarC = bVar4.f232593s.c();
                        hy2.f fVarA = dVar7.a();
                        ffk.t tVarF = aVar13.f();
                        vc.s.j(tVarF);
                        xh5.a aVarA8 = dVar6.a();
                        vc.s.j(aVarA8);
                        l61.a aVarB16 = aVar14.b();
                        vc.s.j(aVarB16);
                        ang.f fVarE2 = aVar14.e();
                        hc5.a aVarA9 = ((gc5.c) bVar4.f232595w).a();
                        vc.s.j(aVarA9);
                        k18.c cVar4 = new k18.c(aVarB16, fVarE2, aVarA9);
                        sh5.d dVarF = dVar6.f();
                        vc.s.j(dVarF);
                        te8.c0 c0Var = (te8.c0) bVar4.f232596x.z.get();
                        vc.s.j(c0Var);
                        ld5.b bVarB2 = bVar4.f232597y.b();
                        vc.s.j(bVarB2);
                        ffk.t tVarF2 = aVar13.f();
                        vc.s.j(tVarF2);
                        jid.z zVar = new jid.z(tVarF2, dVar7.a());
                        mm.d dVar8 = (mm.d) bVar4.S.get();
                        hy2.f fVarA2 = dVar7.a();
                        k93.a aVar15 = (k93.a) bVar4.X.get();
                        yf8.a aVar16 = bVar4.z;
                        zf8.k kVarA = aVar16.a();
                        vc.s.j(kVarA);
                        wf8.c cVar5 = (wf8.c) aVar16.f313200l.get();
                        vc.s.j(cVar5);
                        b23.h hVar2 = new b23.h(dVar8, fVarA2, aVar15, kVarA, cVar5, ((oq8.a) bVar4.f232586j).c(), new i90.b());
                        jla.h hVarA = bVar4.A.a();
                        m4 m4VarD = rVar3.d();
                        al4.b bVarN = rVar3.n();
                        vc.s.j(bVarN);
                        return new n33.t0(pVarI, jVarC, aVarE, qVarA, eVarA3, aVarE2, aVarA5, fVarE, wVar, aVarA6, nVarB3, fVarJ2, cVar3, eVarA4, aVarA7, hVarK, r0VarC, fVarA, tVarF, aVarA8, cVar4, dVarF, c0Var, bVarB2, zVar, hVar2, hVarA, m4VarD, bVarN, (ifm.b) bVar4.K.get());
                    case 19:
                        l70.e eVar6 = bVar4.f232580b;
                        us6.q qVar = bVar4.f232592r;
                        t70.g gVarO = eVar6.o();
                        vc.s.j(gVarO);
                        c73.j jVar6 = bVar4.B;
                        f73.b bVar7 = new f73.b();
                        i4b.f fVar7 = new i4b.f(((w3e.a) jVar6.f21861c).a());
                        n33.r rVar4 = (n33.r) bVar4.c0.get();
                        n33.w wVar2 = (n33.w) bVar4.M.get();
                        mm.d dVar9 = (mm.d) bVar4.S.get();
                        cu8.r0 r0VarA = bVar4.C.a();
                        hr6.l lVarL = qVar.l();
                        vc.s.j(lVarL);
                        h1 h1VarN = qVar.n();
                        vc.s.j(h1VarN);
                        ffk.t tVarF3 = bVar4.u.f();
                        vc.s.j(tVarF3);
                        ic8.a aVar17 = (ic8.a) bVar4.D.f.get();
                        vc.s.j(aVar17);
                        mre.c cVarB3 = bVar4.E.b();
                        vc.s.j(cVarB3);
                        uq8.a aVarC = ((oq8.a) bVar4.f232586j).c();
                        gte.a aVarB17 = bVar4.F.b();
                        vc.s.j(aVarB17);
                        return new r2(gVarO, bVar7, fVar7, rVar4, wVar2, dVar9, r0VarA, lVarL, h1VarN, tVarF3, aVar17, cVarB3, aVarC, aVarB17, bVar4.G.a());
                    default:
                        throw new AssertionError(i33);
                }
            case 9:
                p41.b bVar8 = (p41.b) this.f231765c;
                l70.e eVar7 = bVar8.f232801a;
                int i43 = this.f231764b;
                if (i43 == 0) {
                    z70.a contextProvider = eVar7.f();
                    vc.s.j(contextProvider);
                    Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                    return new e80.i(contextProvider.getContext());
                }
                if (i43 == 1) {
                    Context context = (Context) bVar8.f232803c.get();
                    Intrinsics.checkNotNullParameter(context, "context");
                    return new c90.c(context);
                }
                if (i43 != 2) {
                    throw new AssertionError(i43);
                }
                z70.a contextProvider2 = eVar7.f();
                vc.s.j(contextProvider2);
                Intrinsics.checkNotNullParameter(contextProvider2, "contextProvider");
                return new ContextThemeWrapper(contextProvider2.getContext(), R.style.AppTheme);
            case 10:
                p49.a aVar18 = (p49.a) this.f231765c;
                int i59 = this.f231764b;
                if (i59 == 0) {
                    ftb.d mainScreenContainerDependencies = aVar18.f232857a;
                    Intrinsics.checkNotNullParameter(mainScreenContainerDependencies, "mainScreenContainerDependencies");
                    return ((nbb.a) mainScreenContainerDependencies).a().f214065w;
                }
                if (i59 != 1) {
                    throw new AssertionError(i59);
                }
                Context context2 = aVar18.f232859c;
                Intrinsics.checkNotNullParameter(context2, "context");
                return new ix0.p0(context2);
            case 11:
                p7c.n nVar2 = (p7c.n) this.f231765c;
                int i66 = this.f231764b;
                if (i66 == 0) {
                    return new i9c.k(nVar2.f233647a, (cli.n) nVar2.f233648b.get());
                }
                if (i66 != 1) {
                    throw new AssertionError(i66);
                }
                d9c.a payLaterInstalmentMapper = new d9c.a();
                Intrinsics.checkNotNullParameter(payLaterInstalmentMapper, "payLaterInstalmentMapper");
                i9c.e itemMapper = new i9c.e();
                Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
                return new i9c.j();
            case 12:
                int i74 = this.f231764b;
                if (i74 == 0) {
                    p7c.q qVar2 = (p7c.q) this.f231765c;
                    return new l9c.k(qVar2.f233662a, (jki.p) qVar2.f233663b.get());
                }
                if (i74 != 1) {
                    throw new AssertionError(i74);
                }
                dec.g paymentMethodIconMapper = new dec.g();
                lec.c fieldInputFilterProvider = new lec.c();
                Intrinsics.checkNotNullParameter(paymentMethodIconMapper, "paymentMethodIconMapper");
                Intrinsics.checkNotNullParameter(fieldInputFilterProvider, "fieldInputFilterProvider");
                return new l9c.j();
            case 13:
                int i92 = this.f231764b;
                if (i92 == 0) {
                    p7c.w wVar3 = (p7c.w) this.f231765c;
                    return new eec.k(wVar3.f233736a, (cli.n) wVar3.f233737b.get());
                }
                if (i92 == 1) {
                    return new eec.j();
                }
                throw new AssertionError(i92);
            case 14:
                int i96 = this.f231764b;
                if (i96 == 0) {
                    return new n9c.d((jki.p) ((p7c.t0) this.f231765c).f233710a.get());
                }
                if (i96 == 1) {
                    return new n9c.e();
                }
                throw new AssertionError(i96);
            case 15:
                p84.c cVar6 = (p84.c) this.f231765c;
                int i99 = this.f231764b;
                switch (i99) {
                    case 0:
                        hri.b bVar9 = cVar6.f233845a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar10 = cVar6.f233845a;
                        return new iri.j();
                    case 2:
                        return new cn.e();
                    case 3:
                        return new um.c();
                    case 4:
                        cVar6.getClass();
                        return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 5:
                        return new ln.c();
                    case 6:
                        return new ym.d();
                    case 7:
                        return new mm.d();
                    case 8:
                        return new sm.e();
                    case 9:
                        return new om.c();
                    case 10:
                        return new g3l.g();
                    case 11:
                        cVar6.getClass();
                        return new o84.a(new x94.u(new j64.c(new c84.f())));
                    case 12:
                        return new an.a();
                    case 13:
                        return new x94.k((x94.g) cVar6.f233857s.get(), (y94.c) cVar6.u.get());
                    case 14:
                        hw3.c interactor = (hw3.c) ((c1) cVar6.d).f118472s0.get();
                        vc.s.j(interactor);
                        Intrinsics.checkNotNullParameter(interactor, "interactor");
                        return new y94.c();
                    case 15:
                        return new x94.t((ln.a) cVar6.f233852m.get(), cVar6.e.e(), (x94.g) cVar6.f233857s.get(), ((c1) cVar6.d).b());
                    case 16:
                        return new rz3.b((x94.e) cVar6.f233859w.get(), (ln.a) cVar6.f233852m.get());
                    default:
                        throw new AssertionError(i99);
                }
            case 16:
                return a();
            case 17:
                int i100 = this.f231764b;
                if (i100 == 0) {
                    return new i9a.g((cli.n) ((p8a.p) this.f231765c).f234049a.get());
                }
                if (i100 == 1) {
                    return new i9a.h();
                }
                throw new AssertionError(i100);
            case 18:
                int i101 = this.f231764b;
                if (i101 == 0) {
                    return new m9a.g((cli.n) ((p8a.r) this.f231765c).f234072a.get());
                }
                if (i101 == 1) {
                    return new m9a.h();
                }
                throw new AssertionError(i101);
            case 19:
                int i102 = this.f231764b;
                if (i102 == 0) {
                    return new raa.h((cli.n) ((p8a.b0) this.f231765c).f233896b.get());
                }
                if (i102 == 1) {
                    return new raa.i();
                }
                throw new AssertionError(i102);
            case 20:
                p8a.n0 n0Var = (p8a.n0) this.f231765c;
                int i103 = this.f231764b;
                if (i103 == 0) {
                    return new bca.h((cli.n) n0Var.f234034b.get(), n0Var.f234033a);
                }
                if (i103 == 1) {
                    return new bca.i();
                }
                throw new AssertionError(i103);
            case 21:
                int i104 = this.f231764b;
                if (i104 == 0) {
                    l1 l1Var = (l1) this.f231765c;
                    return new oba.g(l1Var.f234019b, (cli.n) l1Var.f234020c.get());
                }
                if (i104 == 1) {
                    return new oba.f();
                }
                throw new AssertionError(i104);
            case 22:
                int i105 = this.f231764b;
                if (i105 == 0) {
                    l1 l1Var2 = (l1) this.f231765c;
                    return new oba.g(l1Var2.f234019b, (cli.n) l1Var2.f234020c.get());
                }
                if (i105 == 1) {
                    return new oba.f();
                }
                throw new AssertionError(i105);
            case 23:
                int i106 = this.f231764b;
                if (i106 == 0) {
                    n1 n1Var = (n1) this.f231765c;
                    return new uba.g(n1Var.f234037b, (cli.n) n1Var.f234038c.get());
                }
                if (i106 == 1) {
                    return new uba.f();
                }
                throw new AssertionError(i106);
            case 24:
                return b();
            case 25:
                return c();
            case 26:
                return d();
            case 27:
                return e();
            case 28:
                return f();
            default:
                pgf.g gVar3 = (pgf.g) this.f231765c;
                int i107 = this.f231764b;
                if (i107 == 0) {
                    return new tgf.l((cli.n) gVar3.f235915b.get(), gVar3.f235914a);
                }
                if (i107 == 1) {
                    return new tgf.m();
                }
                throw new AssertionError(i107);
        }
    }
}
