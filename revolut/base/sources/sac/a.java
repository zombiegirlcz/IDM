package sac;

import aa0.a0;
import aa0.b0;
import aa0.c0;
import aa0.d0;
import aa0.e0;
import aa0.f0;
import aa0.g0;
import aa0.i0;
import aa0.i1;
import aa0.j0;
import aa0.k0;
import aa0.l0;
import aa0.t;
import aa0.y;
import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.backend_flow.ui.BackendFlowSnapshotsCompressor;
import com.revolut.feature.apm.bills.boleto.impl.finder.onboarding.data.network.ProductFeatureOnboardingService;
import com.revolut.feature.backend_flow.domain.models.ExternalValidation;
import com.revolut.feature.backend_flow.domain.models.MaxAmountValidation;
import com.revolut.feature.backend_flow.domain.models.MaxLengthValidation;
import com.revolut.feature.backend_flow.domain.models.MinAmountValidation;
import com.revolut.feature.backend_flow.domain.models.MinLengthValidation;
import com.revolut.feature.backend_flow.domain.models.RegexValidation;
import com.revolut.feature.backend_flow.domain.models.WidgetProgressionItem;
import com.revolut.feature.instruments.trend.collections.impl.network.InstrumentsTrendCollectionsService;
import com.revolut.feature.pay_with_smile.impl.data.network.BiometricPaymentsSettingsService;
import com.revolut.feature.paynow.impl.data.network.PayNowQrService;
import com.revolut.feature.pro.accounts.impl.add_new_product.ProSubaccountAddNewProductCategoryItemMapper;
import com.revolut.feature.product.onboarding.data.ProductOnboardingService;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.tab.invest.impl.data.service.TradingBannersService;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.shared.feature.user_declarations.api.navigation.NameControllerDescriptor$InputData;
import com.youTransactor.uCube.rpc.Constants;
import dw3.c1;
import dwi.x;
import e4m.e;
import eob.h;
import g25.l;
import gr6.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import ne0.d;
import ne0.j;
import okhttp3.OkHttpClient;
import qc0.g1;
import qja.r;
import qw7.u;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import sf1.n;
import skm.p0;
import te8.v;
import te8.z;
import tf1.o;
import tf1.q;
import tfb.i;
import tzg.m;
import vc.s;
import w38.g;
import w38.k;
import xe0.f;
import xq3.w;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f261365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f261366c;

    public /* synthetic */ a(Object obj2, int i, int i2) {
        this.f261364a = i2;
        this.f261366c = obj2;
        this.f261365b = i;
    }

    private final Object a() {
        Object obj2;
        n nVar = (n) this.f261366c;
        jdi.a aVar = nVar.u;
        r68.b bVar = nVar.f262282j;
        ee0.a aVar2 = nVar.f262278b;
        sha.b bVar2 = nVar.k;
        b7e.a aVar3 = nVar.f262280g;
        qgk.a aVar4 = nVar.f262292x;
        aje.a aVar5 = nVar.z;
        gjb.a aVar6 = nVar.f262284m;
        vhh.a aVar7 = nVar.f262285n;
        lp3.a aVar8 = nVar.f262283l;
        int i = this.f261365b;
        switch (i) {
            case 0:
                sf1.c.Companion.getClass();
                return new d();
            case 1:
                yk0.a databaseSessionProvider = nVar.f262277a.b();
                s.j(databaseSessionProvider);
                me0.a jsonObjectMapperFactory = aVar2.e();
                s.j(jsonObjectMapperFactory);
                f storageFactory = aVar2.f();
                s.j(storageFactory);
                Json featureJson = (Json) nVar.I.get();
                sf1.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(jsonObjectMapperFactory, "jsonObjectMapperFactory");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                Intrinsics.checkNotNullParameter(featureJson, "featureJson");
                return f.c(storageFactory, databaseSessionProvider, "ADD_NEW_PRODUCT_STORAGE", jsonObjectMapperFactory.a(featureJson), 3, 16);
            case 2:
                aVar2.getClass();
                Json baseJson = fe0.d.a();
                sf1.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                return ue0.e.b(baseJson, new se0.a(11));
            case 3:
                wy5.a aVar9 = new wy5.a();
                i iVar = new i();
                g gVar = new g();
                y6e.a aVar10 = new y6e.a();
                y6e.a aVar11 = new y6e.a();
                y6e.a aVar12 = new y6e.a();
                lrj.a aVar13 = new lrj.a();
                hnd.a aVar14 = new hnd.a();
                yn2.a aVar15 = new yn2.a();
                yg6.d dVar = new yg6.d();
                e88.a aVar16 = new e88.a();
                wha.a aVar17 = new wha.a();
                ProSubaccountAddNewProductCategoryItemMapper proSubaccountAddNewProductCategoryItemMapper = new ProSubaccountAddNewProductCategoryItemMapper();
                ProSubaccountAddNewProductCategoryItemMapper proSubaccountAddNewProductCategoryItemMapper2 = new ProSubaccountAddNewProductCategoryItemMapper();
                h88.a aVar18 = new h88.a();
                t15.d dVar2 = (t15.d) aVar8;
                c35.e eVar = new c35.e(dVar2.f267159c.f175963a.g(), dVar2.a(), new l(), new b35.g(), ((c1) dVar2.i).h());
                t15.d dVar3 = (t15.d) aVar8;
                c35.a aVar19 = new c35.a(dVar3.a(), new b35.g(), ((c1) dVar3.i).h(), 1);
                t15.d dVar4 = (t15.d) aVar8;
                c35.a aVar20 = new c35.a(dVar4.a(), new b35.g(), ((c1) dVar4.i).h(), 2);
                t15.d dVar5 = (t15.d) aVar8;
                c35.a aVar21 = new c35.a(dVar5.a(), ((c1) dVar5.i).h());
                b35.e eVarB = ((t15.d) aVar8).b();
                b35.e eVarB2 = ((t15.d) aVar8).b();
                b35.e eVarB3 = ((t15.d) aVar8).b();
                b35.e eVarB4 = ((t15.d) nVar.f262283l).b();
                b35.e eVarB5 = ((t15.d) nVar.f262283l).b();
                b35.e eVarB6 = ((t15.d) nVar.f262283l).b();
                b35.e eVarB7 = ((t15.d) nVar.f262283l).b();
                ((fob.a) aVar6).getClass();
                eob.i iVar2 = new eob.i(new dcd.b());
                ((fob.a) aVar6).getClass();
                eob.i iVar3 = new eob.i(new dcd.b());
                ((fob.a) aVar6).getClass();
                eob.i iVar4 = new eob.i(new dcd.b());
                plh.c cVarG = ((mkh.s) nVar.f262285n).g();
                plh.c cVarG2 = ((mkh.s) nVar.f262285n).g();
                plh.c cVarG3 = ((mkh.s) nVar.f262285n).g();
                plh.c cVarG4 = ((mkh.s) nVar.f262285n).g();
                plh.c cVarG5 = ((mkh.s) nVar.f262285n).g();
                plh.c cVarG6 = ((mkh.s) nVar.f262285n).g();
                plh.c cVarG7 = ((mkh.s) nVar.f262285n).g();
                plh.c cVarG8 = ((mkh.s) nVar.f262285n).g();
                plh.c cVarG9 = ((mkh.s) nVar.f262285n).g();
                plh.c cVarG10 = ((mkh.s) nVar.f262285n).g();
                plh.c cVarG11 = ((mkh.s) nVar.f262285n).g();
                plh.c cVarG12 = ((mkh.s) nVar.f262285n).g();
                plh.c cVarG13 = ((mkh.s) nVar.f262285n).g();
                nVar.o.getClass();
                jfg.a aVar22 = new jfg.a();
                nVar.f262286p.getClass();
                s8g.a aVar23 = new s8g.a();
                nVar.f262287q.getClass();
                wvi.a aVar24 = new wvi.a();
                nVar.f262288r.getClass();
                fti.a aVar25 = new fti.a();
                nVar.f262289s.getClass();
                tyf.a aVar26 = new tyf.a();
                nVar.f262290t.getClass();
                uvf.a aVar27 = new uvf.a();
                aVar.getClass();
                fdi.a aVar28 = new fdi.a();
                nVar.v.getClass();
                vhd.a aVar29 = new vhd.a();
                nVar.f262291w.getClass();
                xvb.a aVar30 = new xvb.a();
                aVar4.getClass();
                skk.a partnerOfferNavigationCommandProvider = new skk.a();
                Intrinsics.checkNotNullParameter(partnerOfferNavigationCommandProvider, "partnerOfferNavigationCommandProvider");
                njk.a aVar31 = new njk.a();
                nVar.f262293y.getClass();
                rw7.a aVar32 = new rw7.a();
                ((jje.c) nVar.z).getClass();
                sje.d dVar6 = new sje.d();
                ((jje.c) nVar.z).getClass();
                sje.d dVar7 = new sje.d();
                ((jje.c) nVar.z).getClass();
                sje.d dVar8 = new sje.d();
                ((jje.c) nVar.z).getClass();
                sje.d dVar9 = new sje.d();
                ((jje.c) nVar.z).getClass();
                sje.d dVar10 = new sje.d();
                nVar.A.getClass();
                tc6.a aVar33 = new tc6.a();
                nVar.B.getClass();
                tej.a aVar34 = new tej.a();
                aVar4.getClass();
                return s2l.c.y(aVar9, iVar, gVar, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, dVar, aVar16, aVar17, proSubaccountAddNewProductCategoryItemMapper, proSubaccountAddNewProductCategoryItemMapper2, aVar18, eVar, aVar19, aVar20, aVar21, eVarB, eVarB2, eVarB3, eVarB4, eVarB5, eVarB6, eVarB7, iVar2, iVar3, iVar4, cVarG, cVarG2, cVarG3, cVarG4, cVarG5, cVarG6, cVarG7, cVarG8, cVarG9, cVarG10, cVarG11, cVarG12, cVarG13, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, dVar6, dVar7, dVar8, dVar9, dVar10, aVar33, aVar34, new njk.d());
            case 4:
                return new q((xf1.a) nVar.M.get(), nVar.D.a());
            case 5:
                return new xf1.c((j) nVar.H.get(), (ue0.c) nVar.J.get(), (Map) nVar.L.get());
            case 6:
                yy5.b bVar3 = (yy5.b) nVar.d;
                fdi.c currencyAccountsDataSource = new fdi.c(bVar3.f317834n.e(), bVar3.f317840w.e());
                fti.b switchSalaryDataSource = new fti.b((rfb.b) ((wfb.i) nVar.e).H.get());
                q38.b bVar4 = (q38.b) nVar.f;
                k jointAccountDataSource = new k((r38.b) bVar4.f241880x.get(), bVar4.f241868g.e(), bVar4.f241875q.e());
                g6e.d subaccountInteractor = aVar3.f12998a.b();
                s.j(subaccountInteractor);
                b7e.b bVar5 = b7e.c.Companion;
                bVar5.getClass();
                Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
                h personalPocketDataSource = new h(subaccountInteractor, qf1.f.PERSONAL_POCKET.getId(), SubaccountType.Personal.f88963a, "ACCOUNT.pockets");
                g6e.d subaccountInteractor2 = aVar3.f12998a.b();
                s.j(subaccountInteractor2);
                bVar5.getClass();
                Intrinsics.checkNotNullParameter(subaccountInteractor2, "subaccountInteractor");
                h groupPocketDataSource = new h(subaccountInteractor2, qf1.f.GROUP_POCKET.getId(), SubaccountType.Group.f88960a, "ACCOUNT.group_pockets");
                g6e.d dVarB = aVar3.f12998a.b();
                s.j(dVarB);
                fdi.c jointPocketDataSource = new fdi.c(dVarB, aVar3.f13008q.c());
                lrj.c budgetDataSource = new lrj.c((pzi.a) nVar.f262281h.B.get());
                hnd.b incomeSorterDataSource = new hnd.b();
                on2.b bVarA = nVar.i.f323664a.a();
                s.j(bVarA);
                fti.b accountSwitchDataSource = new fti.b(bVarA);
                yg6.e linkedAccountDataSource = new yg6.e();
                k78.b bVar6 = (k78.b) bVar;
                gte.a aVarB = bVar6.e.b();
                s.j(aVarB);
                se8.a aVar35 = bVar6.f181874t;
                kbb.c cVarF = aVar35.f();
                hj8.a aVarA = bVar6.f181872s.a();
                s.j(aVarA);
                usg.a aVar36 = bVar6.f181853b;
                wsg.b bVarA2 = aVar36.a();
                z zVarE = aVar35.e();
                s.j(zVarE);
                e88.e juniorAccountDataSource = new e88.e(aVarB, cVarF, aVarA, bVarA2, zVarE, aVar36.b());
                yha.a aVar37 = (yha.a) bVar2;
                gr6.a aVarA2 = aVar37.f.a();
                s.j(aVarA2);
                gr6.h hVarK = aVar37.f313888b.k();
                s.j(hVarK);
                wha.e proAccountDataSource = new wha.e(aVarA2, hVarK, aVar37.d());
                yha.a aVar38 = (yha.a) bVar2;
                gr6.a freelancerAccountDetailsInteractor = aVar38.f.a();
                s.j(freelancerAccountDetailsInteractor);
                p freelancerProductArticleInteractor = (p) aVar38.f313888b.L0.get();
                s.j(freelancerProductArticleInteractor);
                g6e.d subaccountInteractor3 = aVar38.f313896p.b();
                s.j(subaccountInteractor3);
                yha.b bVar7 = yha.c.Companion;
                bVar7.getClass();
                Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
                Intrinsics.checkNotNullParameter(freelancerProductArticleInteractor, "freelancerProductArticleInteractor");
                Intrinsics.checkNotNullParameter(subaccountInteractor3, "subaccountInteractor");
                wha.l proPocketDataSource = new wha.l(SubaccountType.Pro.f88964a, freelancerAccountDetailsInteractor, freelancerProductArticleInteractor, subaccountInteractor3);
                yha.a aVar39 = (yha.a) bVar2;
                gr6.a freelancerAccountDetailsInteractor2 = aVar39.f.a();
                s.j(freelancerAccountDetailsInteractor2);
                p freelancerProductArticleInteractor2 = (p) aVar39.f313888b.L0.get();
                s.j(freelancerProductArticleInteractor2);
                g6e.d subaccountInteractor4 = aVar39.f313896p.b();
                s.j(subaccountInteractor4);
                bVar7.getClass();
                Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor2, "freelancerAccountDetailsInteractor");
                Intrinsics.checkNotNullParameter(freelancerProductArticleInteractor2, "freelancerProductArticleInteractor");
                Intrinsics.checkNotNullParameter(subaccountInteractor4, "subaccountInteractor");
                wha.l proTaxPocketDataSource = new wha.l(SubaccountType.ProTax.f88965a, freelancerAccountDetailsInteractor2, freelancerProductArticleInteractor2, subaccountInteractor4);
                k78.b bVar8 = (k78.b) bVar;
                zf8.k kVarA = bVar8.f181858g.a();
                s.j(kVarA);
                v vVarD = bVar8.f181874t.d();
                s.j(vVarD);
                h88.d juniorPocketDataSource = new h88.d(new k7i.i(kVarA, vVarD));
                t15.d dVar11 = (t15.d) aVar8;
                w wVarL = dVar11.f267157a.l();
                s.j(wVarL);
                c35.f creditCardDataSource = new c35.f(wVarL, (k25.a) dVar11.B.get());
                t15.d dVar12 = (t15.d) aVar8;
                w wVarL2 = dVar12.f267157a.l();
                s.j(wVarL2);
                c35.c securedCreditCardTransferDataSource = new c35.c(wVarL2, dVar12.f267158b.j(), (k25.a) dVar12.B.get());
                t15.d dVar13 = (t15.d) aVar8;
                w wVarL3 = dVar13.f267157a.l();
                s.j(wVarL3);
                c35.c creditBuilderCardDataSource = new c35.c(wVarL3, dVar13.f267158b.g(), (k25.a) dVar13.B.get());
                t15.d dVar14 = (t15.d) aVar8;
                w wVarL4 = dVar14.f267157a.l();
                s.j(wVarL4);
                c35.c balanceTransferDataSource = new c35.c(wVarL4, dVar14.f267158b.i(), (k25.a) dVar14.B.get());
                t15.d dVar15 = (t15.d) aVar8;
                w entryPointsInteractor = dVar15.f267157a.l();
                s.j(entryPointsInteractor);
                u25.a loanProductContract = (u25.a) dVar15.C.get();
                Intrinsics.checkNotNullParameter(entryPointsInteractor, "entryPointsInteractor");
                Intrinsics.checkNotNullParameter(loanProductContract, "loanProductContract");
                d35.a loansDataSource = new d35.a(entryPointsInteractor, loanProductContract, 1);
                t15.d dVar16 = (t15.d) aVar8;
                w entryPointsInteractor2 = dVar16.f267157a.l();
                s.j(entryPointsInteractor2);
                u25.a loanProductContract2 = (u25.a) dVar16.C.get();
                Intrinsics.checkNotNullParameter(entryPointsInteractor2, "entryPointsInteractor");
                Intrinsics.checkNotNullParameter(loanProductContract2, "loanProductContract");
                d35.a refinancingLoansDataSource = new d35.a(entryPointsInteractor2, loanProductContract2, 3);
                t15.d dVar17 = (t15.d) aVar8;
                w entryPointsInteractor3 = dVar17.f267157a.l();
                s.j(entryPointsInteractor3);
                u25.a productContract = (u25.a) dVar17.C.get();
                Intrinsics.checkNotNullParameter(entryPointsInteractor3, "entryPointsInteractor");
                Intrinsics.checkNotNullParameter(productContract, "productContract");
                d35.a homeImprovementsLoansDataSource = new d35.a(entryPointsInteractor3, productContract, 0);
                t15.d dVar18 = (t15.d) aVar8;
                w entryPointsInteractor4 = dVar18.f267157a.l();
                s.j(entryPointsInteractor4);
                u25.a productContract2 = (u25.a) dVar18.C.get();
                Intrinsics.checkNotNullParameter(entryPointsInteractor4, "entryPointsInteractor");
                Intrinsics.checkNotNullParameter(productContract2, "productContract");
                d35.a mortgagesDataSource = new d35.a(entryPointsInteractor4, productContract2, 2);
                t15.d dVar19 = (t15.d) aVar8;
                w entryPointsInteractor5 = dVar19.f267157a.l();
                s.j(entryPointsInteractor5);
                u25.a productContract3 = (u25.a) dVar19.C.get();
                Intrinsics.checkNotNullParameter(entryPointsInteractor5, "entryPointsInteractor");
                Intrinsics.checkNotNullParameter(productContract3, "productContract");
                d35.a refinancingMortgagesDataSource = new d35.a(entryPointsInteractor5, productContract3, 4);
                t15.d dVar20 = (t15.d) aVar8;
                w wVarL5 = dVar20.f267157a.l();
                s.j(wVarL5);
                c35.f payLaterDataSource = new c35.f(wVarL5, (y25.a) dVar20.E.get());
                t15.d dVar21 = (t15.d) aVar8;
                w wVarL6 = dVar21.f267157a.l();
                s.j(wVarL6);
                c35.f overdraftDataSource = new c35.f(wVarL6, (x25.a) dVar21.D.get());
                fob.a aVar40 = (fob.a) aVar6;
                slb.a aVarA3 = aVar40.f136899x.a();
                blb.e eVar2 = (blb.e) aVar40.e;
                ijb.a aVarG = eVar2.g();
                s.j(aVarG);
                h personalSavingsDataSource = new h(aVarA3, aVarG, new eob.j(), eVar2.e(), aVar40.f136889j.e());
                fob.a aVar41 = (fob.a) aVar6;
                slb.a aVarA4 = aVar41.f136899x.a();
                blb.e eVar3 = (blb.e) aVar41.e;
                ijb.a aVarG2 = eVar3.g();
                s.j(aVarG2);
                eob.b jointSavingsDataSource = new eob.b(aVarA4, aVarG2, aVar41.d.c(), new eob.j(), eVar3.e(), aVar41.f136889j.e());
                fob.a aVar42 = (fob.a) aVar6;
                zf8.k kVarA2 = aVar42.f136887g.a();
                s.j(kVarA2);
                eob.j jVar = new eob.j();
                an8.b bVarA3 = aVar42.z.a();
                s.j(bVarA3);
                eob.f juniorSavingsDataSource = new eob.f(kVarA2, jVar, bVarA3, aVar42.f136889j.e());
                mkh.s sVar = (mkh.s) aVar7;
                h9h.a aVar43 = sVar.d;
                m wealthAccountsInteractor = aVar43.t();
                s.j(wealthAccountsInteractor);
                ybl.l tradingConfigInteractor = aVar43.f();
                x8h.m etpProductAvailabilityInteractor = aVar43.g();
                ybl.i tradingAccountProductGroupAvailabilityInteractor = sVar.f.b();
                s.j(tradingAccountProductGroupAvailabilityInteractor);
                qlh.a aVar44 = qlh.b.Companion;
                aVar44.getClass();
                Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
                Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
                Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor, "etpProductAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(tradingAccountProductGroupAvailabilityInteractor, "tradingAccountProductGroupAvailabilityInteractor");
                plh.g investSecuritiesAccountDataSource = new plh.g(wealthAccountsInteractor, tradingConfigInteractor, etpProductAvailabilityInteractor, tih.d.SECURITIES, tradingAccountProductGroupAvailabilityInteractor);
                mkh.s sVar2 = (mkh.s) aVar7;
                h9h.a aVar45 = sVar2.d;
                m wealthAccountsInteractor2 = aVar45.t();
                s.j(wealthAccountsInteractor2);
                ybl.l tradingConfigInteractor2 = aVar45.f();
                x8h.m etpProductAvailabilityInteractor2 = aVar45.g();
                ybl.i tradingAccountProductGroupAvailabilityInteractor2 = sVar2.f.b();
                s.j(tradingAccountProductGroupAvailabilityInteractor2);
                aVar44.getClass();
                Intrinsics.checkNotNullParameter(wealthAccountsInteractor2, "wealthAccountsInteractor");
                Intrinsics.checkNotNullParameter(tradingConfigInteractor2, "tradingConfigInteractor");
                Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor2, "etpProductAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(tradingAccountProductGroupAvailabilityInteractor2, "tradingAccountProductGroupAvailabilityInteractor");
                plh.g investTaaIsaAccountDataSource = new plh.g(wealthAccountsInteractor2, tradingConfigInteractor2, etpProductAvailabilityInteractor2, tih.d.TAA_ISA, tradingAccountProductGroupAvailabilityInteractor2);
                mkh.s sVar3 = (mkh.s) aVar7;
                h9h.a aVar46 = sVar3.d;
                m wealthAccountsInteractor3 = aVar46.t();
                s.j(wealthAccountsInteractor3);
                ybl.l tradingConfigInteractor3 = aVar46.f();
                x8h.m etpProductAvailabilityInteractor3 = aVar46.g();
                ybl.i tradingAccountProductGroupAvailabilityInteractor3 = sVar3.f.b();
                s.j(tradingAccountProductGroupAvailabilityInteractor3);
                aVar44.getClass();
                Intrinsics.checkNotNullParameter(wealthAccountsInteractor3, "wealthAccountsInteractor");
                Intrinsics.checkNotNullParameter(tradingConfigInteractor3, "tradingConfigInteractor");
                Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor3, "etpProductAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(tradingAccountProductGroupAvailabilityInteractor3, "tradingAccountProductGroupAvailabilityInteractor");
                plh.g investTaaCustodianJIsaAccountDataSource = new plh.g(wealthAccountsInteractor3, tradingConfigInteractor3, etpProductAvailabilityInteractor3, tih.d.TAA_CUSTODIAN_JISA, tradingAccountProductGroupAvailabilityInteractor3);
                mkh.s sVar4 = (mkh.s) aVar7;
                h9h.a aVar47 = sVar4.d;
                m wealthAccountsInteractor4 = aVar47.t();
                s.j(wealthAccountsInteractor4);
                ybl.l tradingConfigInteractor4 = aVar47.f();
                x8h.m etpProductAvailabilityInteractor4 = aVar47.g();
                ybl.i tradingAccountProductGroupAvailabilityInteractor4 = sVar4.f.b();
                s.j(tradingAccountProductGroupAvailabilityInteractor4);
                aVar44.getClass();
                Intrinsics.checkNotNullParameter(wealthAccountsInteractor4, "wealthAccountsInteractor");
                Intrinsics.checkNotNullParameter(tradingConfigInteractor4, "tradingConfigInteractor");
                Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor4, "etpProductAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(tradingAccountProductGroupAvailabilityInteractor4, "tradingAccountProductGroupAvailabilityInteractor");
                plh.g investTaaPersonalJIsaAccountDataSource = new plh.g(wealthAccountsInteractor4, tradingConfigInteractor4, etpProductAvailabilityInteractor4, tih.d.TAA_PERSONAL_JISA, tradingAccountProductGroupAvailabilityInteractor4);
                mkh.s sVar5 = (mkh.s) aVar7;
                h9h.a aVar48 = sVar5.d;
                m wealthAccountsInteractor5 = aVar48.t();
                s.j(wealthAccountsInteractor5);
                ybl.l tradingConfigInteractor5 = aVar48.f();
                x8h.m etpProductAvailabilityInteractor5 = aVar48.g();
                ybl.i tradingAccountProductGroupAvailabilityInteractor5 = sVar5.f.b();
                s.j(tradingAccountProductGroupAvailabilityInteractor5);
                aVar44.getClass();
                Intrinsics.checkNotNullParameter(wealthAccountsInteractor5, "wealthAccountsInteractor");
                Intrinsics.checkNotNullParameter(tradingConfigInteractor5, "tradingConfigInteractor");
                Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor5, "etpProductAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(tradingAccountProductGroupAvailabilityInteractor5, "tradingAccountProductGroupAvailabilityInteractor");
                plh.g investTaaPeaAccountDataSource = new plh.g(wealthAccountsInteractor5, tradingConfigInteractor5, etpProductAvailabilityInteractor5, tih.d.TAA_PEA, tradingAccountProductGroupAvailabilityInteractor5);
                mkh.s sVar6 = (mkh.s) aVar7;
                h9h.a aVar49 = sVar6.d;
                m wealthAccountsInteractor6 = aVar49.t();
                s.j(wealthAccountsInteractor6);
                ybl.l tradingConfigInteractor6 = aVar49.f();
                x8h.m etpProductAvailabilityInteractor6 = aVar49.g();
                ybl.i tradingAccountProductGroupAvailabilityInteractor6 = sVar6.f.b();
                s.j(tradingAccountProductGroupAvailabilityInteractor6);
                aVar44.getClass();
                Intrinsics.checkNotNullParameter(wealthAccountsInteractor6, "wealthAccountsInteractor");
                Intrinsics.checkNotNullParameter(tradingConfigInteractor6, "tradingConfigInteractor");
                Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor6, "etpProductAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(tradingAccountProductGroupAvailabilityInteractor6, "tradingAccountProductGroupAvailabilityInteractor");
                plh.g investRoboAccountDataSource = new plh.g(wealthAccountsInteractor6, tradingConfigInteractor6, etpProductAvailabilityInteractor6, tih.d.ROBO, tradingAccountProductGroupAvailabilityInteractor6);
                mkh.s sVar7 = (mkh.s) aVar7;
                h9h.a aVar50 = sVar7.d;
                m wealthAccountsInteractor7 = aVar50.t();
                s.j(wealthAccountsInteractor7);
                ybl.l tradingConfigInteractor7 = aVar50.f();
                x8h.m etpProductAvailabilityInteractor7 = aVar50.g();
                ybl.i tradingAccountProductGroupAvailabilityInteractor7 = sVar7.f.b();
                s.j(tradingAccountProductGroupAvailabilityInteractor7);
                aVar44.getClass();
                Intrinsics.checkNotNullParameter(wealthAccountsInteractor7, "wealthAccountsInteractor");
                Intrinsics.checkNotNullParameter(tradingConfigInteractor7, "tradingConfigInteractor");
                Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor7, "etpProductAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(tradingAccountProductGroupAvailabilityInteractor7, "tradingAccountProductGroupAvailabilityInteractor");
                plh.g investJointAccountDataSource = new plh.g(wealthAccountsInteractor7, tradingConfigInteractor7, etpProductAvailabilityInteractor7, tih.d.JOINT_SECURITIES, tradingAccountProductGroupAvailabilityInteractor7);
                mkh.s sVar8 = (mkh.s) aVar7;
                h9h.a aVar51 = sVar8.d;
                m wealthAccountsInteractor8 = aVar51.t();
                s.j(wealthAccountsInteractor8);
                ybl.l tradingConfigInteractor8 = aVar51.f();
                x8h.m etpProductAvailabilityInteractor8 = aVar51.g();
                ybl.i tradingAccountProductGroupAvailabilityInteractor8 = sVar8.f.b();
                s.j(tradingAccountProductGroupAvailabilityInteractor8);
                aVar44.getClass();
                Intrinsics.checkNotNullParameter(wealthAccountsInteractor8, "wealthAccountsInteractor");
                Intrinsics.checkNotNullParameter(tradingConfigInteractor8, "tradingConfigInteractor");
                Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor8, "etpProductAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(tradingAccountProductGroupAvailabilityInteractor8, "tradingAccountProductGroupAvailabilityInteractor");
                plh.g investMarginAccountDataSource = new plh.g(wealthAccountsInteractor8, tradingConfigInteractor8, etpProductAvailabilityInteractor8, tih.d.MARGIN, tradingAccountProductGroupAvailabilityInteractor8);
                mkh.s sVar9 = (mkh.s) aVar7;
                h9h.a aVar52 = sVar9.d;
                m wealthAccountsInteractor9 = aVar52.t();
                s.j(wealthAccountsInteractor9);
                ybl.l tradingConfigInteractor9 = aVar52.f();
                x8h.m etpProductAvailabilityInteractor9 = aVar52.g();
                ybl.i tradingAccountProductGroupAvailabilityInteractor9 = sVar9.f.b();
                s.j(tradingAccountProductGroupAvailabilityInteractor9);
                aVar44.getClass();
                Intrinsics.checkNotNullParameter(wealthAccountsInteractor9, "wealthAccountsInteractor");
                Intrinsics.checkNotNullParameter(tradingConfigInteractor9, "tradingConfigInteractor");
                Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor9, "etpProductAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(tradingAccountProductGroupAvailabilityInteractor9, "tradingAccountProductGroupAvailabilityInteractor");
                plh.g investGiaMarginAccountDataSource = new plh.g(wealthAccountsInteractor9, tradingConfigInteractor9, etpProductAvailabilityInteractor9, tih.d.GIA_MARGIN, tradingAccountProductGroupAvailabilityInteractor9);
                mkh.s sVar10 = (mkh.s) aVar7;
                h9h.a aVar53 = sVar10.d;
                m wealthAccountsInteractor10 = aVar53.t();
                s.j(wealthAccountsInteractor10);
                ybl.l tradingConfigInteractor10 = aVar53.f();
                x8h.m etpProductAvailabilityInteractor10 = aVar53.g();
                ybl.i tradingAccountProductGroupAvailabilityInteractor10 = sVar10.f.b();
                s.j(tradingAccountProductGroupAvailabilityInteractor10);
                aVar44.getClass();
                Intrinsics.checkNotNullParameter(wealthAccountsInteractor10, "wealthAccountsInteractor");
                Intrinsics.checkNotNullParameter(tradingConfigInteractor10, "tradingConfigInteractor");
                Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor10, "etpProductAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(tradingAccountProductGroupAvailabilityInteractor10, "tradingAccountProductGroupAvailabilityInteractor");
                plh.g investCommoditiesAccountDataSource = new plh.g(wealthAccountsInteractor10, tradingConfigInteractor10, etpProductAvailabilityInteractor10, tih.d.COMMODITIES, tradingAccountProductGroupAvailabilityInteractor10);
                mkh.s sVar11 = (mkh.s) aVar7;
                h9h.a aVar54 = sVar11.d;
                m wealthAccountsInteractor11 = aVar54.t();
                s.j(wealthAccountsInteractor11);
                ybl.l tradingConfigInteractor11 = aVar54.f();
                x8h.m etpProductAvailabilityInteractor11 = aVar54.g();
                ybl.i tradingAccountProductGroupAvailabilityInteractor11 = sVar11.f.b();
                s.j(tradingAccountProductGroupAvailabilityInteractor11);
                aVar44.getClass();
                Intrinsics.checkNotNullParameter(wealthAccountsInteractor11, "wealthAccountsInteractor");
                Intrinsics.checkNotNullParameter(tradingConfigInteractor11, "tradingConfigInteractor");
                Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor11, "etpProductAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(tradingAccountProductGroupAvailabilityInteractor11, "tradingAccountProductGroupAvailabilityInteractor");
                plh.g investBondsAccountDataSource = new plh.g(wealthAccountsInteractor11, tradingConfigInteractor11, etpProductAvailabilityInteractor11, tih.d.BONDS, tradingAccountProductGroupAvailabilityInteractor11);
                mkh.s sVar12 = (mkh.s) aVar7;
                h9h.a aVar55 = sVar12.d;
                m wealthAccountsInteractor12 = aVar55.t();
                s.j(wealthAccountsInteractor12);
                ybl.l tradingConfigInteractor12 = aVar55.f();
                x8h.m etpProductAvailabilityInteractor12 = aVar55.g();
                ybl.i tradingAccountProductGroupAvailabilityInteractor12 = sVar12.f.b();
                s.j(tradingAccountProductGroupAvailabilityInteractor12);
                aVar44.getClass();
                Intrinsics.checkNotNullParameter(wealthAccountsInteractor12, "wealthAccountsInteractor");
                Intrinsics.checkNotNullParameter(tradingConfigInteractor12, "tradingConfigInteractor");
                Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor12, "etpProductAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(tradingAccountProductGroupAvailabilityInteractor12, "tradingAccountProductGroupAvailabilityInteractor");
                plh.g investEtfsAccountDataSource = new plh.g(wealthAccountsInteractor12, tradingConfigInteractor12, etpProductAvailabilityInteractor12, tih.d.ETFS, tradingAccountProductGroupAvailabilityInteractor12);
                mkh.s sVar13 = (mkh.s) aVar7;
                h9h.a aVar56 = sVar13.d;
                m wealthAccountsInteractor13 = aVar56.t();
                s.j(wealthAccountsInteractor13);
                ybl.l tradingConfigInteractor13 = aVar56.f();
                x8h.m etpProductAvailabilityInteractor13 = aVar56.g();
                ybl.i tradingAccountProductGroupAvailabilityInteractor13 = sVar13.f.b();
                s.j(tradingAccountProductGroupAvailabilityInteractor13);
                aVar44.getClass();
                Intrinsics.checkNotNullParameter(wealthAccountsInteractor13, "wealthAccountsInteractor");
                Intrinsics.checkNotNullParameter(tradingConfigInteractor13, "tradingConfigInteractor");
                Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor13, "etpProductAvailabilityInteractor");
                Intrinsics.checkNotNullParameter(tradingAccountProductGroupAvailabilityInteractor13, "tradingAccountProductGroupAvailabilityInteractor");
                plh.g investPrivateMarketsAccountDataSource = new plh.g(wealthAccountsInteractor13, tradingConfigInteractor13, etpProductAvailabilityInteractor13, tih.d.PRIVATE_MARKETS, tradingAccountProductGroupAvailabilityInteractor13);
                vfg.g gVar2 = (vfg.g) nVar.o.f279768a.f279774c.get();
                s.j(gVar2);
                fti.b travelMilesDataSource = new fti.b(gVar2);
                p8g.c cVarB = nVar.f262286p.f141735a.b();
                s.j(cVarB);
                fti.b travelStaysDataSource = new fti.b(cVarB);
                x xVar = (x) nVar.f262287q.f109778a.f109801m.get();
                s.j(xVar);
                fti.b travelLoungesDataSource = new fti.b(xVar);
                mti.h hVar = (mti.h) nVar.f262288r.f189532a.f189544p.get();
                s.j(hVar);
                fti.b travelAsftDataSource = new fti.b(hVar);
                hyf.a aVarA5 = nVar.f262289s.f318439a.a();
                s.j(aVarA5);
                fti.b travelExperiencesDataSource = new fti.b(aVarA5);
                quf.b bVar9 = (quf.b) ((hvf.b) nVar.f262290t.f155876a).k.get();
                s.j(bVar9);
                fti.b transportDataSource = new fti.b(bVar9);
                jdi.m mVar = aVar.f173076a;
                ldi.a aVar57 = (ldi.a) mVar.f173122n.get();
                s.j(aVar57);
                ldi.f fVarA = mVar.a();
                s.j(fVarA);
                fdi.c revPointsPocketDataSource = new fdi.c(aVar57, fVarA);
                fti.b shopsDataSource = new fti.b(nVar.v.f115053a.b());
                svb.a aVarA6 = nVar.f262291w.f169060a.a();
                s.j(aVarA6);
                fti.b giftCardsDataSource = new fti.b(aVarA6);
                a61.a aVarH = aVar4.f245862a.h();
                bgc.e eVarC = aVar4.f245863b.c();
                s.j(eVarC);
                fdi.c lifestylePartnersDataSource = new fdi.c(aVarH, eVarC);
                kw7.c cVar = (kw7.c) nVar.f262293y.f249789a.k.get();
                s.j(cVar);
                fti.b lifestyleInsurancesDataSource = new fti.b(cVar);
                jje.c cVar2 = (jje.c) aVar5;
                yud.g stakingInteractor = cVar2.f174825a.d();
                jla.h productCatalogueInteractor = cVar2.f174827b.a();
                kje.a aVar58 = kje.b.Companion;
                aVar58.getClass();
                Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
                Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
                sje.h tradingDataSource = new sje.h("EXCHANGE.crypto", qf1.f.CRYPTO_TRADING.getId(), stakingInteractor, productCatalogueInteractor);
                jje.c cVar3 = (jje.c) aVar5;
                yud.g stakingInteractor2 = cVar3.f174825a.d();
                jla.h productCatalogueInteractor2 = cVar3.f174827b.a();
                aVar58.getClass();
                Intrinsics.checkNotNullParameter(stakingInteractor2, "stakingInteractor");
                Intrinsics.checkNotNullParameter(productCatalogueInteractor2, "productCatalogueInteractor");
                sje.h earnDataSource = new sje.h("CRYPTO_STAKING", qf1.f.CRYPTO_EARN.getId(), stakingInteractor2, productCatalogueInteractor2);
                jje.c cVar4 = (jje.c) aVar5;
                jla.h productCatalogueInteractor3 = cVar4.f174827b.a();
                myj.e learnFeatureStateChecker = (myj.e) ((nyj.c) cVar4.f174829c).K.get();
                s.j(learnFeatureStateChecker);
                aVar58.getClass();
                Intrinsics.checkNotNullParameter(productCatalogueInteractor3, "productCatalogueInteractor");
                Intrinsics.checkNotNullParameter(learnFeatureStateChecker, "learnFeatureStateChecker");
                sje.b learnDataSource = new sje.b(qf1.f.CRYPTO_LEARN.getId(), productCatalogueInteractor3, learnFeatureStateChecker);
                jje.c cVar5 = (jje.c) aVar5;
                yud.g stakingInteractor3 = cVar5.f174825a.d();
                jla.h productCatalogueInteractor4 = cVar5.f174827b.a();
                aVar58.getClass();
                Intrinsics.checkNotNullParameter(stakingInteractor3, "stakingInteractor");
                Intrinsics.checkNotNullParameter(productCatalogueInteractor4, "productCatalogueInteractor");
                sje.h strategiesDataSource = new sje.h("EXCHANGE.crypto", qf1.f.CRYPTO_STRATEGIES.getId(), stakingInteractor3, productCatalogueInteractor4);
                jje.c cVar6 = (jje.c) aVar5;
                yud.g stakingInteractor4 = cVar6.f174825a.d();
                jla.h productCatalogueInteractor5 = cVar6.f174827b.a();
                aVar58.getClass();
                Intrinsics.checkNotNullParameter(stakingInteractor4, "stakingInteractor");
                Intrinsics.checkNotNullParameter(productCatalogueInteractor5, "productCatalogueInteractor");
                sje.h revolutXDataSource = new sje.h("REVX_CRYPTO_EXCHANGE", qf1.f.CRYPTO_REVOLUT_X.getId(), stakingInteractor4, productCatalogueInteractor5);
                fdi.c donationsDataSource = new fdi.c(nVar.A.f234429a.a());
                cej.a aVarL = nVar.B.f4107a.l();
                s.j(aVarL);
                fti.b esimDataSource = new fti.b(aVarL);
                cha.c cVarJ = aVar4.f245862a.j();
                s.j(cVarJ);
                gte.a aVarB2 = aVar4.f245864c.b();
                s.j(aVarB2);
                njk.f studentDataSource = new njk.f(cVarJ, aVarB2);
                sf1.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(currencyAccountsDataSource, "currencyAccountsDataSource");
                Intrinsics.checkNotNullParameter(switchSalaryDataSource, "switchSalaryDataSource");
                Intrinsics.checkNotNullParameter(jointAccountDataSource, "jointAccountDataSource");
                Intrinsics.checkNotNullParameter(personalPocketDataSource, "personalPocketDataSource");
                Intrinsics.checkNotNullParameter(groupPocketDataSource, "groupPocketDataSource");
                Intrinsics.checkNotNullParameter(jointPocketDataSource, "jointPocketDataSource");
                Intrinsics.checkNotNullParameter(budgetDataSource, "budgetDataSource");
                Intrinsics.checkNotNullParameter(incomeSorterDataSource, "incomeSorterDataSource");
                Intrinsics.checkNotNullParameter(accountSwitchDataSource, "accountSwitchDataSource");
                Intrinsics.checkNotNullParameter(linkedAccountDataSource, "linkedAccountDataSource");
                Intrinsics.checkNotNullParameter(juniorAccountDataSource, "juniorAccountDataSource");
                Intrinsics.checkNotNullParameter(proAccountDataSource, "proAccountDataSource");
                Intrinsics.checkNotNullParameter(proPocketDataSource, "proPocketDataSource");
                Intrinsics.checkNotNullParameter(proTaxPocketDataSource, "proTaxPocketDataSource");
                Intrinsics.checkNotNullParameter(juniorPocketDataSource, "juniorPocketDataSource");
                Intrinsics.checkNotNullParameter(creditCardDataSource, "creditCardDataSource");
                Intrinsics.checkNotNullParameter(securedCreditCardTransferDataSource, "securedCreditCardTransferDataSource");
                Intrinsics.checkNotNullParameter(creditBuilderCardDataSource, "creditBuilderCardDataSource");
                Intrinsics.checkNotNullParameter(balanceTransferDataSource, "balanceTransferDataSource");
                Intrinsics.checkNotNullParameter(loansDataSource, "loansDataSource");
                Intrinsics.checkNotNullParameter(refinancingLoansDataSource, "refinancingLoansDataSource");
                Intrinsics.checkNotNullParameter(homeImprovementsLoansDataSource, "homeImprovementsLoansDataSource");
                Intrinsics.checkNotNullParameter(mortgagesDataSource, "mortgagesDataSource");
                Intrinsics.checkNotNullParameter(refinancingMortgagesDataSource, "refinancingMortgagesDataSource");
                Intrinsics.checkNotNullParameter(payLaterDataSource, "payLaterDataSource");
                Intrinsics.checkNotNullParameter(overdraftDataSource, "overdraftDataSource");
                Intrinsics.checkNotNullParameter(personalSavingsDataSource, "personalSavingsDataSource");
                Intrinsics.checkNotNullParameter(jointSavingsDataSource, "jointSavingsDataSource");
                Intrinsics.checkNotNullParameter(juniorSavingsDataSource, "juniorSavingsDataSource");
                Intrinsics.checkNotNullParameter(investSecuritiesAccountDataSource, "investSecuritiesAccountDataSource");
                Intrinsics.checkNotNullParameter(investTaaIsaAccountDataSource, "investTaaIsaAccountDataSource");
                Intrinsics.checkNotNullParameter(investTaaCustodianJIsaAccountDataSource, "investTaaCustodianJIsaAccountDataSource");
                Intrinsics.checkNotNullParameter(investTaaPersonalJIsaAccountDataSource, "investTaaPersonalJIsaAccountDataSource");
                Intrinsics.checkNotNullParameter(investTaaPeaAccountDataSource, "investTaaPeaAccountDataSource");
                Intrinsics.checkNotNullParameter(investRoboAccountDataSource, "investRoboAccountDataSource");
                Intrinsics.checkNotNullParameter(investJointAccountDataSource, "investJointAccountDataSource");
                Intrinsics.checkNotNullParameter(investMarginAccountDataSource, "investMarginAccountDataSource");
                Intrinsics.checkNotNullParameter(investGiaMarginAccountDataSource, "investGiaMarginAccountDataSource");
                Intrinsics.checkNotNullParameter(investCommoditiesAccountDataSource, "investCommoditiesAccountDataSource");
                Intrinsics.checkNotNullParameter(investBondsAccountDataSource, "investBondsAccountDataSource");
                Intrinsics.checkNotNullParameter(investEtfsAccountDataSource, "investEtfsAccountDataSource");
                Intrinsics.checkNotNullParameter(investPrivateMarketsAccountDataSource, "investPrivateMarketsAccountDataSource");
                Intrinsics.checkNotNullParameter(travelMilesDataSource, "travelMilesDataSource");
                Intrinsics.checkNotNullParameter(travelStaysDataSource, "travelStaysDataSource");
                Intrinsics.checkNotNullParameter(travelLoungesDataSource, "travelLoungesDataSource");
                Intrinsics.checkNotNullParameter(travelAsftDataSource, "travelAsftDataSource");
                Intrinsics.checkNotNullParameter(travelExperiencesDataSource, "travelExperiencesDataSource");
                Intrinsics.checkNotNullParameter(transportDataSource, "transportDataSource");
                Intrinsics.checkNotNullParameter(revPointsPocketDataSource, "revPointsPocketDataSource");
                Intrinsics.checkNotNullParameter(shopsDataSource, "shopsDataSource");
                Intrinsics.checkNotNullParameter(giftCardsDataSource, "giftCardsDataSource");
                Intrinsics.checkNotNullParameter(lifestylePartnersDataSource, "lifestylePartnersDataSource");
                Intrinsics.checkNotNullParameter(lifestyleInsurancesDataSource, "lifestyleInsurancesDataSource");
                Intrinsics.checkNotNullParameter(tradingDataSource, "tradingDataSource");
                Intrinsics.checkNotNullParameter(earnDataSource, "earnDataSource");
                Intrinsics.checkNotNullParameter(learnDataSource, "learnDataSource");
                Intrinsics.checkNotNullParameter(strategiesDataSource, "strategiesDataSource");
                Intrinsics.checkNotNullParameter(revolutXDataSource, "revolutXDataSource");
                Intrinsics.checkNotNullParameter(donationsDataSource, "donationsDataSource");
                Intrinsics.checkNotNullParameter(esimDataSource, "esimDataSource");
                Intrinsics.checkNotNullParameter(studentDataSource, "studentDataSource");
                EnumEntries enumEntriesA = qf1.f.a();
                int iB = q0.b(zhm.w.t(enumEntriesA, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : enumEntriesA) {
                    switch (sf1.e.f262260a[((qf1.f) obj3).ordinal()]) {
                        case 1:
                            obj2 = currencyAccountsDataSource;
                            break;
                        case 2:
                            obj2 = switchSalaryDataSource;
                            break;
                        case 3:
                            obj2 = jointAccountDataSource;
                            break;
                        case 4:
                            obj2 = personalPocketDataSource;
                            break;
                        case 5:
                            obj2 = groupPocketDataSource;
                            break;
                        case 6:
                            obj2 = jointPocketDataSource;
                            break;
                        case 7:
                            obj2 = budgetDataSource;
                            break;
                        case 8:
                            obj2 = incomeSorterDataSource;
                            break;
                        case 9:
                            obj2 = accountSwitchDataSource;
                            break;
                        case 10:
                            obj2 = linkedAccountDataSource;
                            break;
                        case 11:
                            obj2 = juniorAccountDataSource;
                            break;
                        case 12:
                            obj2 = personalSavingsDataSource;
                            break;
                        case 13:
                            obj2 = jointSavingsDataSource;
                            break;
                        case 14:
                            obj2 = juniorSavingsDataSource;
                            break;
                        case 15:
                            obj2 = proAccountDataSource;
                            break;
                        case 16:
                            obj2 = proPocketDataSource;
                            break;
                        case 17:
                            obj2 = proTaxPocketDataSource;
                            break;
                        case 18:
                            obj2 = juniorPocketDataSource;
                            break;
                        case 19:
                            obj2 = creditCardDataSource;
                            break;
                        case 20:
                            obj2 = securedCreditCardTransferDataSource;
                            break;
                        case 21:
                            obj2 = creditBuilderCardDataSource;
                            break;
                        case 22:
                            obj2 = balanceTransferDataSource;
                            break;
                        case 23:
                            obj2 = loansDataSource;
                            break;
                        case 24:
                            obj2 = refinancingLoansDataSource;
                            break;
                        case 25:
                            obj2 = homeImprovementsLoansDataSource;
                            break;
                        case 26:
                            obj2 = mortgagesDataSource;
                            break;
                        case 27:
                            obj2 = refinancingMortgagesDataSource;
                            break;
                        case 28:
                            obj2 = overdraftDataSource;
                            break;
                        case 29:
                            obj2 = payLaterDataSource;
                            break;
                        case 30:
                            obj2 = investSecuritiesAccountDataSource;
                            break;
                        case 31:
                            obj2 = investTaaIsaAccountDataSource;
                            break;
                        case 32:
                            obj2 = investTaaCustodianJIsaAccountDataSource;
                            break;
                        case 33:
                            obj2 = investTaaPersonalJIsaAccountDataSource;
                            break;
                        case 34:
                            obj2 = investTaaPeaAccountDataSource;
                            break;
                        case 35:
                            obj2 = investRoboAccountDataSource;
                            break;
                        case 36:
                            obj2 = investJointAccountDataSource;
                            break;
                        case 37:
                            obj2 = investMarginAccountDataSource;
                            break;
                        case 38:
                            obj2 = investGiaMarginAccountDataSource;
                            break;
                        case 39:
                            obj2 = investCommoditiesAccountDataSource;
                            break;
                        case 40:
                            obj2 = investBondsAccountDataSource;
                            break;
                        case 41:
                            obj2 = investEtfsAccountDataSource;
                            break;
                        case 42:
                            obj2 = investPrivateMarketsAccountDataSource;
                            break;
                        case 43:
                            obj2 = travelMilesDataSource;
                            break;
                        case 44:
                            obj2 = travelStaysDataSource;
                            break;
                        case 45:
                            obj2 = travelLoungesDataSource;
                            break;
                        case 46:
                            obj2 = travelAsftDataSource;
                            break;
                        case 47:
                            obj2 = travelExperiencesDataSource;
                            break;
                        case 48:
                            obj2 = transportDataSource;
                            break;
                        case 49:
                            obj2 = revPointsPocketDataSource;
                            break;
                        case 50:
                            obj2 = shopsDataSource;
                            break;
                        case 51:
                            obj2 = giftCardsDataSource;
                            break;
                        case 52:
                            obj2 = lifestylePartnersDataSource;
                            break;
                        case 53:
                            obj2 = lifestyleInsurancesDataSource;
                            break;
                        case 54:
                            obj2 = tradingDataSource;
                            break;
                        case 55:
                            obj2 = earnDataSource;
                            break;
                        case 56:
                            obj2 = learnDataSource;
                            break;
                        case 57:
                            obj2 = strategiesDataSource;
                            break;
                        case 58:
                            obj2 = revolutXDataSource;
                            break;
                        case 59:
                            obj2 = donationsDataSource;
                            break;
                        case 60:
                            obj2 = esimDataSource;
                            break;
                        case 61:
                            obj2 = studentDataSource;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    linkedHashMap.put(obj3, obj2);
                }
                return linkedHashMap;
            case 7:
                return new o(nVar.E.e(), ((blb.e) nVar.F).e());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        t64.c cVar = (t64.c) this.f261366c;
        int i = this.f261365b;
        switch (i) {
            case 0:
                hri.b bVar = cVar.f268206a;
                return new ifm.b();
            case 1:
                hri.b bVar2 = cVar.f268206a;
                return new iri.j();
            case 2:
                return new cn.e();
            case 3:
                return new um.c();
            case 4:
                cVar.getClass();
                return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
            case 5:
                return new ln.c();
            case 6:
                cVar.getClass();
                return new p54.n(new g1(new com.revolut.feature.chooser.e(), new tc0.c(), new onh.b(new BackendFlowSnapshotsCompressor())), new c84.f());
            case 7:
                e eVar = cVar.f268229t;
                l70.e eVar2 = cVar.f268208b;
                r54.d dVar = cVar.f;
                ln.a aVar = (ln.a) eVar.get();
                p54.e eVar3 = (p54.e) cVar.u.get();
                qc0.h hVar = (qc0.h) cVar.Y.get();
                dcl.q qVar = new dcl.q(new aa0.i(), u.i(dVar));
                am2.a aVarA = cVar.f268214h.a();
                t70.b bVarG = eVar2.g();
                s.j(bVarG);
                xl2.f fVarI = u.i(dVar);
                mm.d dVar2 = (mm.d) cVar.Z.get();
                wli.x xVarD = ((s41.a) cVar.i).d();
                s70.a aVarM = eVar2.m();
                s.j(aVarM);
                return new s64.b(aVar, eVar3, hVar, qVar, aVarA, bVarG, fVarI, dVar2, xVarD, aVarM, (yc0.a) cVar.f268207a0.get());
            case 8:
                qc0.k kVar = (qc0.k) cVar.u.get();
                wl2.f fVar = (wl2.f) cVar.v.get();
                ifm.b bVar3 = (ifm.b) cVar.o.get();
                com.revolut.feature.chooser.a aVar2 = new com.revolut.feature.chooser.a((com.revolut.feature.chooser.d) cVar.f268232w.get(), (qi3.o) cVar.f268234x.get());
                yc0.k kVar2 = (yc0.k) cVar.f268236y.get();
                f0 f0Var = (f0) cVar.z.get();
                w80.b bVarJ = cVar.f268208b.j();
                s.j(bVarJ);
                aa0.z zVar = new aa0.z(bVarJ);
                aa0.b bVar4 = (aa0.b) cVar.A.get();
                c0 c0Var = (c0) cVar.B.get();
                k0 k0Var = (k0) cVar.C.get();
                i0 i0Var = new i0();
                b0 b0Var = (b0) cVar.F.get();
                aa0.h hVar2 = (aa0.h) cVar.G.get();
                aa0.n nVar = (aa0.n) cVar.H.get();
                aa0.d dVar3 = (aa0.d) cVar.I.get();
                aa0.p pVar = (aa0.p) cVar.J.get();
                aa0.l lVar = (aa0.l) cVar.K.get();
                aa0.m mVar = (aa0.m) cVar.L.get();
                a0 a0Var = (a0) cVar.M.get();
                i1 i1Var = (i1) cVar.N.get();
                l0 l0Var = (l0) cVar.O.get();
                e0 e0Var = (e0) cVar.P.get();
                j0 j0Var = (j0) cVar.Q.get();
                aa0.j jVar = new aa0.j();
                t tVar = new t();
                dcl.q qVar2 = new dcl.q(new aa0.i(), u.i(cVar.f));
                aa0.s sVar = new aa0.s((ad0.a) cVar.R.get(), 1);
                aa0.f fVar2 = new aa0.f();
                aa0.g gVar = new aa0.g();
                aa0.u uVar = new aa0.u();
                g0 g0Var = new g0();
                aa0.q qVar3 = new aa0.q((ad0.a) cVar.R.get());
                aa0.s sVar2 = new aa0.s((ad0.a) cVar.R.get(), 0);
                aa0.k kVar3 = new aa0.k();
                aa0.a aVar3 = new aa0.a();
                d0 d0Var = new d0();
                com.google.firebase.messaging.t tVarH = cVar.h();
                eli.j jVarA = cVar.f268213g.a();
                ca0.a aVar4 = new ca0.a();
                bd0.d dVar4 = (bd0.d) cVar.T.get();
                yc0.f fVar3 = (yc0.f) cVar.W.get();
                ad0.a aVar5 = (ad0.a) cVar.R.get();
                aa0.o oVar = new aa0.o();
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(6);
                builderBuilderWithExpectedSize.put(ExternalValidation.class, new ed0.d((wl2.a) cVar.X.get()));
                builderBuilderWithExpectedSize.put(MaxLengthValidation.class, new ed0.f());
                builderBuilderWithExpectedSize.put(MinLengthValidation.class, new ed0.h());
                builderBuilderWithExpectedSize.put(RegexValidation.class, new ed0.i((zzl.b) cVar.D.get()));
                builderBuilderWithExpectedSize.put(MinAmountValidation.class, new ed0.g());
                builderBuilderWithExpectedSize.put(MaxAmountValidation.class, new ed0.e());
                return new qc0.j0(kVar, fVar, bVar3, aVar2, kVar2, f0Var, zVar, bVar4, c0Var, k0Var, i0Var, b0Var, hVar2, nVar, dVar3, pVar, lVar, mVar, a0Var, i1Var, l0Var, e0Var, j0Var, jVar, tVar, qVar2, sVar, fVar2, gVar, uVar, g0Var, qVar3, sVar2, kVar3, aVar3, d0Var, tVarH, jVarA, aVar4, dVar4, fVar3, aVar5, oVar, new dd0.c(builderBuilderWithExpectedSize.build()), new cd0.d());
            case 9:
                pw3.b bVar5 = (pw3.b) ((c1) cVar.f268210c).N1.get();
                s.j(bVar5);
                return new b1e.a(bVar5, (p54.e) cVar.u.get());
            case 10:
                x90.c cVar2 = cVar.d;
                qc0.k state = (qc0.k) cVar.u.get();
                Intrinsics.checkNotNullParameter(state, "state");
                s.k(state);
                return state;
            case 11:
                x90.c cVar3 = cVar.d;
                qi3.b modelsProvider = new qi3.b((com.revolut.feature.chooser.d) cVar.f268232w.get());
                Intrinsics.checkNotNullParameter(modelsProvider, "modelsProvider");
                return modelsProvider;
            case 12:
                x90.c cVar4 = cVar.d;
                l80.e eVarH = cVar.f268208b.h();
                s.j(eVarH);
                return wpg.v.l(cVar4, eVarH);
            case 13:
                x90.c cVar5 = cVar.d;
                return new f0();
            case 14:
                x90.c cVar6 = cVar.d;
                return new aa0.b();
            case 15:
                x90.c cVar7 = cVar.d;
                return new c0();
            case 16:
                x90.c cVar8 = cVar.d;
                return new k0();
            case 17:
                x90.c cVar9 = cVar.d;
                z80.b bVarS = cVar.f268208b.s();
                s.j(bVarS);
                return wpg.v.g(cVar9, bVarS, (y) cVar.E.get());
            case 18:
                return wpg.v.i(cVar.d, (zzl.b) cVar.D.get());
            case 19:
                r54.e eVar4 = cVar.e;
                return new zzl.c();
            case 20:
                x90.c cVar10 = cVar.d;
                return new aa0.h();
            case 21:
                x90.c cVar11 = cVar.d;
                return new aa0.n();
            case 22:
                return wpg.v.h(cVar.d, (y) cVar.E.get());
            case 23:
                x90.c cVar12 = cVar.d;
                return new aa0.p();
            case 24:
                x90.c cVar13 = cVar.d;
                return new aa0.l();
            case 25:
                x90.c cVar14 = cVar.d;
                return new aa0.m();
            case 26:
                x90.c cVar15 = cVar.d;
                return new a0();
            case 27:
                x90.c cVar16 = cVar.d;
                return new i1();
            case 28:
                x90.c cVar17 = cVar.d;
                return new l0();
            case 29:
                x90.c cVar18 = cVar.d;
                return new e0();
            case 30:
                x90.c cVar19 = cVar.d;
                return new j0();
            case 31:
                x90.c cVar20 = cVar.d;
                return new ad0.b();
            case 32:
                return new ym.d();
            case 33:
                x90.c cVar21 = cVar.d;
                return new bd0.e();
            case 34:
                return wpg.v.s(cVar.d, (yc0.b0) cVar.V.get());
            case 35:
                return wpg.v.u(cVar.d, (qc0.k) cVar.u.get(), new smd.s((la0.c) cVar.U.get()));
            case 36:
                return wpg.v.e(cVar.d, (qc0.k) cVar.u.get());
            case 37:
                x90.c cVar22 = cVar.d;
                aa0.w legacyBackendFlowAdapterInteractor = new aa0.w((wl2.f) cVar.v.get(), cVar.f268214h.b());
                Intrinsics.checkNotNullParameter(legacyBackendFlowAdapterInteractor, "legacyBackendFlowAdapterInteractor");
                return legacyBackendFlowAdapterInteractor;
            case 38:
                return new mm.d();
            case 39:
                return wpg.v.c(cVar.d, (yc0.b0) cVar.V.get());
            case 40:
                return new vc0.a((qc0.j) cVar.f268209b0.get(), (qc0.k) cVar.u.get(), (ln.a) cVar.f268229t.get(), u.i(cVar.f), (mm.d) cVar.Z.get(), cVar.h());
            case 41:
                return new vc0.b((ln.a) cVar.f268229t.get());
            case 42:
                return new vc0.c((qc0.k) cVar.u.get(), (qc0.j) cVar.f268209b0.get(), (wl2.f) cVar.v.get(), cVar.f268213g.a(), new ca0.a(), cVar.h());
            case 43:
                h3l.e eVar5 = (h3l.e) cVar.f0.get();
                ln.a aVar6 = (ln.a) cVar.f268229t.get();
                ho.t tVarC = cVar.f268216j.c();
                s.j(tVarC);
                return new i3l.b(eVar5, aVar6, tVarC, 0);
            case 44:
                return new h3l.m();
            case 45:
                h3l.e eVar6 = (h3l.e) cVar.f0.get();
                ln.a aVar7 = (ln.a) cVar.f268229t.get();
                ho.t tVarC2 = cVar.f268216j.c();
                s.j(tVarC2);
                return new i3l.b(eVar6, aVar7, tVarC2, 1);
            case 46:
                return new i3l.a((h3l.e) cVar.f0.get(), (ln.a) cVar.f268229t.get(), 1);
            case 47:
                return new i3l.a((h3l.e) cVar.f0.get(), (ln.a) cVar.f268229t.get(), 0);
            case 48:
                x90.c cVar23 = cVar.d;
                qc0.j router = (qc0.j) cVar.f268209b0.get();
                Intrinsics.checkNotNullParameter(router, "router");
                s.k(router);
                return router;
            case 49:
                return new sm.e();
            case 50:
                return new om.c();
            case 51:
                return new g3l.g();
            case 52:
                return new an.a();
            case 53:
                return new d4l.a();
            case 54:
                x90.c cVar24 = cVar.d;
                qc0.h state2 = (qc0.h) cVar.Y.get();
                Intrinsics.checkNotNullParameter(state2, "state");
                s.k(state2);
                return state2;
            case 55:
                return u.t(cVar.e);
            case 56:
                return wpg.v.d(cVar.d, (qc0.k) cVar.u.get(), (la0.c) cVar.U.get(), ImmutableMap.of(WidgetProgressionItem.class, new z90.b()));
            case 57:
                return wpg.v.t(cVar.d, (bd0.d) cVar.T.get());
            case 58:
                x90.c cVar25 = cVar.d;
                z70.a aVarF = cVar.f268208b.f();
                s.j(aVarF);
                return wpg.v.p(cVar25, aVarF);
            case 59:
                x90.c cVar26 = cVar.d;
                return new yc0.w();
            case 60:
                x90.c cVar27 = cVar.d;
                qc0.j router2 = (qc0.j) cVar.f268209b0.get();
                Intrinsics.checkNotNullParameter(router2, "router");
                s.k(router2);
                return router2;
            case 61:
                x90.c cVar28 = cVar.d;
                qc0.h state3 = (qc0.h) cVar.Y.get();
                Intrinsics.checkNotNullParameter(state3, "state");
                s.k(state3);
                return state3;
            case 62:
                return new h3l.h((h3l.e) cVar.f0.get());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object hVar;
        Object iVar;
        OkHttpClient okHttpClient;
        Object iVar2;
        Object oVar;
        int i = this.f261364a;
        l70.e eVar = null;
        int i2 = this.f261365b;
        Object obj2 = this.f261366c;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                a31.a aVar = bVar.f261368b;
                a31.a aVar2 = bVar.o;
                a31.a aVar3 = bVar.d;
                ecm.q qVar = bVar.f261367a;
                if (i2 == 0) {
                    hVar = new pbk.h(qVar, aVar, bVar.f261369c, aVar3, bVar.e, bVar.f261377q, bVar.f261372j, bVar.k, bVar.f261373l, bVar.f261374m, bVar.f261375n, aVar2);
                } else {
                    if (i2 == 1) {
                        vac.a aVar4 = (vac.a) ((vac.b) bVar.f261376p.get()).b();
                        s.k(aVar4);
                        return aVar4;
                    }
                    if (i2 != 2) {
                        if (i2 == 3) {
                            return new ezj.h(qVar, aVar3, bVar.f261377q, aVar2, 5);
                        }
                        throw new AssertionError(i2);
                    }
                    hVar = new vac.b(aVar, bVar.f, bVar.f261370g, bVar.f261371h, aVar3, bVar.i, qVar);
                }
                return hVar;
            case 1:
                sc9.b bVar2 = (sc9.b) obj2;
                switch (i2) {
                    case 0:
                        hri.b bVar3 = bVar2.f261679a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar4 = bVar2.f261679a;
                        return new iri.j();
                    case 2:
                        sc9.d.Companion.getClass();
                        return new iri.b();
                    case 3:
                        return new ln.c();
                    case 4:
                        return new cn.e();
                    case 5:
                        return new um.c();
                    case 6:
                        bVar2.getClass();
                        return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 7:
                        return new ym.d();
                    case 8:
                        return new mm.d();
                    case 9:
                        return new sm.e();
                    case 10:
                        return new om.c();
                    case 11:
                        return new ks2.d();
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                return a();
            case 3:
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new vf1.b();
                    }
                    throw new AssertionError(i2);
                }
                gte.a aVarB = ((sf1.q) obj2).f262304a.b();
                s.j(aVarB);
                return new tf1.p(aVarB);
            case 4:
                sfh.a aVar5 = (sfh.a) obj2;
                a31.a aVar6 = aVar5.f262485n;
                a31.a aVar7 = aVar5.i;
                if (i2 == 0) {
                    return new ku5.a(aVar5.f262477a, aVar5.f262478b, aVar5.f262479c, aVar5.d, aVar5.e, aVar5.f, aVar5.f262480g, aVar5.f262481h, aVar7, aVar5.f262482j, aVar5.k, aVar5.f262483l, aVar5.f262484m, aVar6, aVar5.o, aVar5.f262486p, aVar5.f262487q, aVar5.f262488r, 2);
                }
                if (i2 == 1) {
                    return new s5d.b(aVar7, aVar6, 4);
                }
                throw new AssertionError(i2);
            case 5:
                nng.i iVar3 = (nng.i) obj2;
                sja.a aVar8 = (sja.a) iVar3.f217656g;
                NameControllerDescriptor$InputData nameControllerDescriptor$InputData = iVar3.f217654b;
                if (i2 == 0) {
                    cli.n nVar = (cli.n) iVar3.e.get();
                    zzl.b bVar5 = (zzl.b) iVar3.f217655c.get();
                    gte.a aVarB2 = aVar8.f263694g.b();
                    s.j(aVarB2);
                    iVar = new zng.i(nameControllerDescriptor$InputData, nVar, new r10.v(bVar5, agk.b.o(aVarB2, nameControllerDescriptor$InputData)));
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return aog.e.a();
                        }
                        if (i2 == 3) {
                            return aog.f.a();
                        }
                        throw new AssertionError(i2);
                    }
                    cog.c cVar = new cog.c((zzl.b) iVar3.f217655c.get(), (f0m.a) iVar3.d.get());
                    cog.g gVar = new cog.g();
                    gte.a aVarB3 = aVar8.f263694g.b();
                    s.j(aVarB3);
                    iVar = new zng.l(new cog.a(cVar, gVar, agk.b.o(aVarB3, nameControllerDescriptor$InputData)));
                }
                return iVar;
            case 6:
                sja.a aVar9 = (sja.a) obj2;
                switch (i2) {
                    case 0:
                        return new nja.a();
                    case 1:
                        return new tja.a((oja.a) aVar9.o.get());
                    case 2:
                        return new oja.a((ProductOnboardingService) aVar9.f263698m.get(), (pja.a) aVar9.f263699n.get());
                    case 3:
                        Retrofit retrofit = (Retrofit) aVar9.f263697l.get();
                        sja.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(ProductOnboardingService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        ProductOnboardingService productOnboardingService = (ProductOnboardingService) objCreate;
                        s.k(productOnboardingService);
                        return productOnboardingService;
                    case 4:
                        Retrofit retrofit3 = ((nj0.d) aVar9.f263691a).f();
                        kg.o gson = (kg.o) aVar9.k.get();
                        sja.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                        Intrinsics.checkNotNullParameter(gson, "gson");
                        return j6.a.B(retrofit3.newBuilder(), gson, "build(...)");
                    case 5:
                        kg.o gson2 = fe0.c.a();
                        sja.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(gson2, "gson");
                        Intrinsics.checkNotNullParameter(gson2, "gson");
                        kg.p pVar = new kg.p(gson2);
                        he0.m mVar = new he0.m("type", r.class, true, false);
                        mVar.c(qja.n.class, "DECLARATION");
                        mVar.c(qja.o.class, "FORM");
                        mVar.c(qja.q.class, "WORKFLOW");
                        mVar.c(qja.p.class, "TERMINAL");
                        ArrayList arrayList = pVar.e;
                        arrayList.add(mVar);
                        he0.m mVar2 = new he0.m("declarationType", qja.e.class, true, false);
                        mVar2.c(qja.d.class, "LEGAL_NAME");
                        mVar2.c(qja.b.class, "CITIZENSHIP");
                        mVar2.c(qja.c.class, "DATE_OF_BIRTH");
                        mVar2.c(qja.a.class, "RESIDENTIAL_ADDRESS");
                        arrayList.add(mVar2);
                        he0.m mVar3 = new he0.m("type", qja.j.class, true, false);
                        mVar3.c(qja.i.class, "LEGAL_NAME");
                        mVar3.c(qja.g.class, "CITIZENSHIP");
                        mVar3.c(qja.h.class, "DATE_OF_BIRTH");
                        mVar3.c(qja.f.class, "RESIDENTIAL_ADDRESS");
                        arrayList.add(mVar3);
                        kg.o oVarB = pVar.b();
                        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
                        return oVarB;
                    case 6:
                        return new pja.b();
                    default:
                        throw new AssertionError(i2);
                }
            case 7:
                ske.c cVar2 = (ske.c) obj2;
                switch (i2) {
                    case 0:
                        tla.e eVarA = cVar2.f263860a.a();
                        s.j(eVarA);
                        n63.h hVar2 = (n63.h) cVar2.f263862b.f319904a.get();
                        s.j(hVar2);
                        c87.b bVar6 = (c87.b) cVar2.f263864c.f311373s.get();
                        s.j(bVar6);
                        j30.d dVarU = ((h30.n) cVar2.d).u();
                        s.j(dVarU);
                        return new kke.c(eVarA, hVar2, bVar6, dVarU, (vqi.a) cVar2.f263863b0.get());
                    case 1:
                        ske.g.Companion.getClass();
                        return new vqi.a();
                    case 2:
                        sri.m mVar4 = (sri.m) cVar2.f263865d0.get();
                        nlh.b bVarA = cVar2.f.a();
                        s.j(bVarA);
                        ybl.i iVarB = cVar2.f263867g.b();
                        s.j(iVarB);
                        return new yke.h(mVar4, bVarA, iVarB);
                    case 3:
                        Context context = cVar2.e;
                        tke.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        return sri.o.c(context, null, null, 14);
                    case 4:
                        xoj.a aVarA = cVar2.f263868h.a();
                        s.j(aVarA);
                        m mVarT = cVar2.i.t();
                        s.j(mVarT);
                        return new uke.a(aVarA, mVarT);
                    case 5:
                        return new yke.a((sri.m) cVar2.f263865d0.get());
                    case 6:
                        sri.m mVar5 = (sri.m) cVar2.f263865d0.get();
                        kbb.r rVarA = cVar2.f263870j.a();
                        s.j(rVarA);
                        return new yke.b(mVar5, rVarA);
                    case 7:
                        tke.b.Companion.getClass();
                        return rd0.e.a(p0.f264002b);
                    case 8:
                        return new d();
                    case 9:
                        le0.b gsonObjectMapperFactory = cVar2.k.c();
                        s.j(gsonObjectMapperFactory);
                        yk0.a databaseSessionProvider = cVar2.f263872l.b();
                        s.j(databaseSessionProvider);
                        f storageFactory = cVar2.k.f();
                        s.j(storageFactory);
                        mke.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        Object value = lke.a.f196363a.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return f.f(storageFactory, databaseSessionProvider, "trading_banners", gsonObjectMapperFactory.a((kg.o) value), 0, null, 56);
                    case 10:
                        return new uke.b((pke.d) cVar2.f263875n0.get());
                    case 11:
                        return new pke.d((TradingBannersService) cVar2.m0.get(), (j) cVar2.j0.get(), (ue0.c) cVar2.f263871k0.get());
                    case 12:
                        Retrofit retrofit4 = (Retrofit) cVar2.l0.get();
                        mke.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                        Object objCreate2 = retrofit4.create(TradingBannersService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                        TradingBannersService tradingBannersService = (TradingBannersService) objCreate2;
                        s.k(tradingBannersService);
                        return tradingBannersService;
                    case 13:
                        Retrofit retrofit5 = ((nj0.d) cVar2.C).f();
                        mke.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit5, "retrofit");
                        Retrofit.Builder builderNewBuilder = retrofit5.newBuilder();
                        builderNewBuilder.converterFactories().clear();
                        Object value2 = lke.a.f196363a.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        builderNewBuilder.addConverterFactory(GsonConverterFactory.create((kg.o) value2));
                        Retrofit retrofitBuild = builderNewBuilder.build();
                        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                        s.k(retrofitBuild);
                        return retrofitBuild;
                    case 14:
                        ske.g.Companion.getClass();
                        return new ble.c();
                    case 15:
                        kla.a productIntroToggleResolver = cVar2.S.a();
                        mp.r productIntroInteractor = cVar2.X.b();
                        ske.g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(productIntroToggleResolver, "productIntroToggleResolver");
                        Intrinsics.checkNotNullParameter(productIntroInteractor, "productIntroInteractor");
                        return new ble.b(productIntroToggleResolver, productIntroInteractor);
                    default:
                        throw new AssertionError(i2);
                }
            case 8:
                sm1.d dVar = (sm1.d) obj2;
                nf0.a aVar10 = dVar.e;
                if (i2 == 0) {
                    return new qm1.a();
                }
                if (i2 == 1) {
                    Retrofit retrofit6 = ((nj0.d) dVar.f264309a).f();
                    sm1.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(retrofit6, "retrofit");
                    Object objCreate3 = retrofit6.create(ProductFeatureOnboardingService.class);
                    Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                    ProductFeatureOnboardingService productFeatureOnboardingService = (ProductFeatureOnboardingService) objCreate3;
                    s.k(productFeatureOnboardingService);
                    zjh.c cVar3 = new zjh.c(productFeatureOnboardingService);
                    pre.c cVarA = dVar.f264310b.a();
                    s.j(cVarA);
                    return new en1.a(cVar3, cVarA);
                }
                if (i2 == 2) {
                    return new qm1.c();
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new AssertionError(i2);
                    }
                    sf0.h hVarB = aVar10.b();
                    s.j(hVarB);
                    return new qm1.h(hVarB);
                }
                wo1.b bVarB = ((up1.e) dVar.f264311c).b();
                s.j(bVarB);
                xua.a aVarA2 = dVar.d.a();
                s.j(aVarA2);
                sf0.h hVarB2 = aVar10.b();
                s.j(hVarB2);
                return new qm1.f(bVarB, aVarA2, hVarB2);
            case 9:
                if (i2 == 0) {
                    sm1.e eVar2 = (sm1.e) obj2;
                    return new kn1.f(eVar2.f264319a, (cli.n) eVar2.f264320b.get());
                }
                if (i2 == 1) {
                    return new kn1.e();
                }
                throw new AssertionError(i2);
            case 10:
                if (i2 == 0) {
                    return new ym1.j((cli.n) ((sm1.k) obj2).f264337a.get());
                }
                if (i2 == 1) {
                    return new ym1.i();
                }
                throw new AssertionError(i2);
            case 11:
                f5b.a aVar11 = (f5b.a) obj2;
                if (i2 == 0) {
                    return new rmc.g(((dmc.c) aVar11.f132296g).a(), new nmc.k(), aVar11.f132294b.e());
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return new rmc.f();
                    }
                    throw new AssertionError(i2);
                }
                nmc.d dVarD = ((dmc.a) aVar11.f132297h).d();
                gte.a aVarB4 = aVar11.f132295c.b();
                s.j(aVarB4);
                return new rmc.c(new rmc.b(new yoc.m(dVarD, aVarB4)));
            case 12:
                ssh.b bVar7 = (ssh.b) obj2;
                csh.k kVar = bVar7.f265401c;
                osh.a aVar12 = bVar7.f265399a;
                if (i2 == 0) {
                    return olc.c.C(aVar12, bVar7.f265400b, kVar);
                }
                if (i2 == 1) {
                    return olc.c.B(aVar12, kVar);
                }
                throw new AssertionError(i2);
            case 13:
                sw.c cVar4 = (sw.c) obj2;
                Context context2 = cVar4.f266045a;
                switch (i2) {
                    case 0:
                        return new tw.a(new om4.d0(cVar4, 19));
                    case 1:
                        xw.a fileSignatureCalculator = (xw.a) cVar4.d.get();
                        sw.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(fileSignatureCalculator, "fileSignatureCalculator");
                        return new zw.e(context2, fileSignatureCalculator, new zw.c());
                    case 2:
                        return new xw.b();
                    case 3:
                        sw.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        return new mw.a(context2, new zw.c());
                    case 4:
                        c10.g gVar2 = (c10.g) cVar4.f266046b.d.get();
                        s.j(gVar2);
                        return new bw.v(gVar2);
                    case 5:
                        return new qw.a();
                    case 6:
                        return new nw.c();
                    case 7:
                        return new nw.a();
                    case 8:
                        return new vw.p();
                    default:
                        throw new AssertionError(i2);
                }
            case 14:
                sy2.b bVar8 = (sy2.b) obj2;
                switch (i2) {
                    case 0:
                        return new ifm.b();
                    case 1:
                        return new iri.j();
                    case 2:
                        return new jy2.n();
                    case 3:
                        return new ln.c();
                    case 4:
                        f73.c cVar5 = new f73.c();
                        li0.b bVarC = t2d.c.c(bVar8.f266594c.f271230a);
                        ln.a aVar13 = (ln.a) bVar8.f266598l.get();
                        s70.a aVarM = bVar8.f266593b.m();
                        s.j(aVarM);
                        return new ry2.d(cVar5, bVarC, aVar13, aVarM);
                    case 5:
                        l93.f fVarJ = bVar8.d.j();
                        s.j(fVarJ);
                        jy2.k kVar2 = (jy2.k) bVar8.k.get();
                        sf0.h hVarB3 = bVar8.e.b();
                        s.j(hVarB3);
                        v60.e eVarA2 = bVar8.f.a();
                        s.j(eVarA2);
                        return new py2.c(fVarJ, kVar2, hVarB3, eVarA2, new com.google.firebase.messaging.t((cn.e) bVar8.f266600n.get(), (ym.d) bVar8.o.get(), (um.c) bVar8.f266601p.get(), (ifm.b) bVar8.i.get()), 1);
                    case 6:
                        return new cn.e();
                    case 7:
                        return new ym.d();
                    case 8:
                        return new um.c();
                    default:
                        throw new AssertionError(i2);
                }
            case 15:
                sz5.f fVar = (sz5.f) obj2;
                ee0.a aVar14 = (ee0.a) fVar.f266765a;
                nj0.a aVar15 = (nj0.a) fVar.f266767c;
                switch (i2) {
                    case 0:
                        return new qz5.d((j) ((e) fVar.d).get(), (ue0.c) ((e) fVar.e).get());
                    case 1:
                        return new d();
                    case 2:
                        je0.d objectMapper = aVar14.b();
                        s.j(objectMapper);
                        f storageFactory2 = aVar14.f();
                        s.j(storageFactory2);
                        yk0.a databaseSessionProvider2 = ((an0.c) fVar.f266766b).b();
                        s.j(databaseSessionProvider2);
                        sz5.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                        return f.f(storageFactory2, databaseSessionProvider2, "storage_customer_present_network.pref", objectMapper, 0, null, 56);
                    case 3:
                        OkHttpClient okHttpClient2 = (OkHttpClient) ((e) fVar.f266768g).get();
                        ik0.b retrofitFactory = ((nj0.d) aVar15).m();
                        s.j(retrofitFactory);
                        sz5.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(okHttpClient2, "okHttpClient");
                        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                        Retrofit retrofitA = ik0.b.a(retrofitFactory, okHttpClient2, "https://pos.revolut.com/", null, null, 28);
                        s.k(retrofitA);
                        return retrofitA;
                    case 4:
                        xj0.i okHttpClientFactory = ((nj0.d) aVar15).l();
                        s.j(okHttpClientFactory);
                        nz5.e networkExceptionDiagnosticsInterceptor = new nz5.e(new pz5.h());
                        qz5.d registeredIdentityIdInteractor = (qz5.d) ((e) fVar.f).get();
                        sz5.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(okHttpClientFactory, "okHttpClientFactory");
                        Intrinsics.checkNotNullParameter(networkExceptionDiagnosticsInterceptor, "networkExceptionDiagnosticsInterceptor");
                        Intrinsics.checkNotNullParameter(registeredIdentityIdInteractor, "registeredIdentityIdInteractor");
                        OkHttpClient.a aVarA3 = xj0.i.a(okHttpClientFactory, null, true, false, zhm.v.k(new nz5.a(zhm.v.k(new pz5.a(), new pz5.h())), new nz5.c(registeredIdentityIdInteractor)), null, null, Constants.TAG_F5).a();
                        nz5.f.a(aVarA3, networkExceptionDiagnosticsInterceptor);
                        okHttpClient = new OkHttpClient(aVarA3);
                        break;
                    case 5:
                        OkHttpClient okHttpClient3 = (OkHttpClient) ((e) fVar.f266769h).get();
                        ik0.b retrofitFactory2 = ((nj0.d) aVar15).m();
                        s.j(retrofitFactory2);
                        sz5.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(okHttpClient3, "okHttpClient");
                        Intrinsics.checkNotNullParameter(retrofitFactory2, "retrofitFactory");
                        Retrofit retrofitA2 = ik0.b.a(retrofitFactory2, okHttpClient3, "https://pos.revolut.com/", null, null, 28);
                        s.k(retrofitA2);
                        return retrofitA2;
                    case 6:
                        xj0.i okHttpClientFactory2 = ((nj0.d) aVar15).l();
                        s.j(okHttpClientFactory2);
                        nz5.e networkExceptionDiagnosticsInterceptor2 = new nz5.e(new pz5.h());
                        qz5.d registeredIdentityIdInteractor2 = (qz5.d) ((e) fVar.f).get();
                        sz5.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(okHttpClientFactory2, "okHttpClientFactory");
                        Intrinsics.checkNotNullParameter(networkExceptionDiagnosticsInterceptor2, "networkExceptionDiagnosticsInterceptor");
                        Intrinsics.checkNotNullParameter(registeredIdentityIdInteractor2, "registeredIdentityIdInteractor");
                        OkHttpClient.a aVarA4 = xj0.i.a(okHttpClientFactory2, null, true, false, zhm.v.k(new nz5.a(zhm.v.k(new pz5.a(), new pz5.h())), new nz5.c(registeredIdentityIdInteractor2)), null, null, Constants.TAG_F5).a();
                        nz5.f.a(aVarA4, networkExceptionDiagnosticsInterceptor2);
                        ulm.b authenticator = ulm.d.f281081a;
                        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
                        aVarA4.f226074h = authenticator;
                        okHttpClient = new OkHttpClient(aVarA4);
                        break;
                    case 7:
                        OkHttpClient okHttpClient4 = (OkHttpClient) ((e) fVar.f266768g).get();
                        ik0.b retrofitFactory3 = ((nj0.d) aVar15).m();
                        s.j(retrofitFactory3);
                        sz5.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(okHttpClient4, "okHttpClient");
                        Intrinsics.checkNotNullParameter(retrofitFactory3, "retrofitFactory");
                        Retrofit retrofitA3 = ik0.b.a(retrofitFactory3, okHttpClient4, "https://avatar.revolut.com/", null, null, 28);
                        s.k(retrofitA3);
                        return retrofitA3;
                    default:
                        throw new AssertionError(i2);
                }
                return okHttpClient;
            case 16:
                if (i2 == 0) {
                    t0b.o oVar2 = (t0b.o) obj2;
                    return new b1b.k(oVar2.f266989a, (cli.n) oVar2.f266990b.get());
                }
                if (i2 == 1) {
                    return new b1b.l();
                }
                throw new AssertionError(i2);
            case 17:
                t1f.a aVar16 = (t1f.a) obj2;
                if (i2 == 0) {
                    return new q2f.e((cli.n) aVar16.f267277b.get());
                }
                if (i2 == 1) {
                    return new q2f.f(aVar16.f267276a, new v1f.c());
                }
                throw new AssertionError(i2);
            case 18:
                t1f.k kVar3 = (t1f.k) obj2;
                TradeRevPointsTransferBreakdownScreenContract$InputData tradeRevPointsTransferBreakdownScreenContract$InputData = kVar3.f267319a;
                if (i2 == 0) {
                    return new com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.a((cli.n) kVar3.f267321c.get(), tradeRevPointsTransferBreakdownScreenContract$InputData, new m2f.a());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                v1f.c cVar6 = new v1f.c();
                qd0.b bVarN = kVar3.f267320b.f267306p.n();
                s.j(bVarN);
                return new n2f.e(tradeRevPointsTransferBreakdownScreenContract$InputData, cVar6, new m2f.c(bVarN));
            case 19:
                return b();
            case 20:
                t6a.b bVar9 = (t6a.b) obj2;
                if (i2 == 0) {
                    return new v6a.a((PayNowQrService) bVar9.f.get());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                Retrofit retrofit7 = ((nj0.d) bVar9.f268275b).f();
                w6a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit7, "retrofit");
                Object objCreate4 = retrofit7.create(PayNowQrService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate4, "create(...)");
                PayNowQrService payNowQrService = (PayNowQrService) objCreate4;
                s.k(payNowQrService);
                return payNowQrService;
            case 21:
                if (i2 == 0) {
                    t6a.f fVar2 = (t6a.f) obj2;
                    return new anb.c0(fVar2.f268285a, fVar2.f268286b, fVar2.f268287c, fVar2.d, 28);
                }
                if (i2 == 1) {
                    return new t6a.g();
                }
                throw new AssertionError(i2);
            case 22:
                t81.a aVar17 = (t81.a) obj2;
                ecm.q qVar2 = aVar17.f268794a;
                if (i2 == 0) {
                    return new v81.a(aVar17.f268795b, qVar2);
                }
                if (i2 == 1) {
                    return new ezj.h(qVar2, aVar17.f, aVar17.f268796c, aVar17.d, 6);
                }
                if (i2 != 2) {
                    throw new AssertionError(i2);
                }
                v81.d dVar2 = (v81.d) ((v81.a) aVar17.e.get()).b();
                s.k(dVar2);
                return dVar2;
            case 23:
                t83.d dVar3 = (t83.d) obj2;
                if (i2 == 0) {
                    return new w83.e((cli.n) dVar3.f268822b.get(), dVar3.f268821a);
                }
                if (i2 == 1) {
                    return new w83.j();
                }
                throw new AssertionError(i2);
            case 24:
                nng.i iVar4 = (nng.i) obj2;
                ta9.m mVar6 = (ta9.m) iVar4.f217656g;
                NameControllerDescriptor$InputData nameControllerDescriptor$InputData2 = iVar4.f217654b;
                if (i2 == 0) {
                    cli.n nVar2 = (cli.n) iVar4.e.get();
                    zzl.b bVar10 = (zzl.b) iVar4.f217655c.get();
                    gte.a aVarB5 = mVar6.f269248n.b();
                    s.j(aVarB5);
                    iVar2 = new zng.i(nameControllerDescriptor$InputData2, nVar2, new r10.v(bVar10, agk.b.o(aVarB5, nameControllerDescriptor$InputData2)));
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return aog.e.a();
                        }
                        if (i2 == 3) {
                            return aog.f.a();
                        }
                        throw new AssertionError(i2);
                    }
                    cog.c cVar7 = new cog.c((zzl.b) iVar4.f217655c.get(), (f0m.a) iVar4.d.get());
                    cog.g gVar3 = new cog.g();
                    gte.a aVarB6 = mVar6.f269248n.b();
                    s.j(aVarB6);
                    iVar2 = new zng.l(new cog.a(cVar7, gVar3, agk.b.o(aVarB6, nameControllerDescriptor$InputData2)));
                }
                return iVar2;
            case 25:
                th7.b bVar11 = (th7.b) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new d();
                    }
                    throw new AssertionError(i2);
                }
                d dVar4 = new d();
                nj0.d dVar5 = (nj0.d) bVar11.f271312a;
                ik0.b retrofitFactory4 = dVar5.m();
                s.j(retrofitFactory4);
                ek.a converterFactory = dVar5.d();
                th7.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory4, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate5 = ik0.b.a(retrofitFactory4, null, null, converterFactory, null, 27).create(InstrumentsTrendCollectionsService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate5, "create(...)");
                InstrumentsTrendCollectionsService instrumentsTrendCollectionsService = (InstrumentsTrendCollectionsService) objCreate5;
                s.k(instrumentsTrendCollectionsService);
                return new di7.e(dVar4, instrumentsTrendCollectionsService, bVar11.d());
            case 26:
                tie.a aVar18 = (tie.a) obj2;
                switch (i2) {
                    case 0:
                        return new uie.q(aVar18.f271481a);
                    case 1:
                        oVar = new uie.o(aVar18.f271482b, aVar18.f271483c, aVar18.f271486j, aVar18.f271487l, aVar18.e, aVar18.f, aVar18.f271484g);
                        break;
                    case 2:
                        qie.b bVar12 = (qie.b) ((uie.q) aVar18.i.get()).b();
                        s.k(bVar12);
                        return bVar12;
                    case 3:
                        qie.a aVar19 = (qie.a) ((uie.p) aVar18.k.get()).b();
                        s.k(aVar19);
                        return aVar19;
                    case 4:
                        oVar = new uie.p(aVar18.d, aVar18.e);
                        break;
                    case 5:
                        oVar = new uie.d(aVar18.d, aVar18.f271489n);
                        break;
                    case 6:
                        uie.l lVar = (uie.l) ((uie.o) aVar18.f271488m.get()).b();
                        s.k(lVar);
                        return lVar;
                    case 7:
                        oVar = new uie.c(aVar18.f271490p, aVar18.f271489n, 0);
                        break;
                    case 8:
                        uie.j jVar = (uie.j) ((uie.d) aVar18.o.get()).b();
                        s.k(jVar);
                        return jVar;
                    case 9:
                        return new add.b(aVar18.f271485h, 13);
                    default:
                        throw new AssertionError(i2);
                }
                return oVar;
            case 27:
                tii.b bVar13 = (tii.b) obj2;
                BaseFlow flow = bVar13.f271532b;
                if (i2 == 0) {
                    return new com.revolut.kompot.common.flow.permissions.c(bVar13.f271531a, (uii.b) bVar13.e.get(), (s70.a) bVar13.f.get());
                }
                if (i2 == 1) {
                    return new uii.b(flow, (uii.a) bVar13.d.get());
                }
                if (i2 == 2) {
                    return new uii.a();
                }
                if (i2 != 3) {
                    throw new AssertionError(i2);
                }
                tii.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(flow, "flow");
                try {
                    eVar = (l70.e) ue0.e.i(ue0.e.j(flow.m2()), l70.e.class);
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
                if (eVar == null) {
                    eVar = (l70.e) l70.c.Companion.c();
                }
                s70.a aVarM2 = eVar.m();
                s.k(aVarM2);
                return aVarM2;
            case 28:
                lti.u uVar = (lti.u) obj2;
                if (i2 == 0) {
                    return new fji.r((cli.n) uVar.f199960c.get(), uVar.f199959b);
                }
                if (i2 == 1) {
                    return new fji.s();
                }
                throw new AssertionError(i2);
            default:
                tl9.c cVar8 = (tl9.c) obj2;
                ee0.a aVar20 = cVar8.f272027c;
                if (i2 == 0) {
                    nj0.d dVar6 = (nj0.d) cVar8.f272025a;
                    ek.a converterFactory2 = dVar6.d();
                    ik0.b retrofitFactory5 = dVar6.m();
                    s.j(retrofitFactory5);
                    tl9.i.Companion.getClass();
                    Intrinsics.checkNotNullParameter(converterFactory2, "converterFactory");
                    Intrinsics.checkNotNullParameter(retrofitFactory5, "retrofitFactory");
                    Object objCreate6 = ik0.b.a(retrofitFactory5, null, null, converterFactory2, null, 27).create(BiometricPaymentsSettingsService.class);
                    Intrinsics.checkNotNullExpressionValue(objCreate6, "create(...)");
                    BiometricPaymentsSettingsService biometricPaymentsSettingsService = (BiometricPaymentsSettingsService) objCreate6;
                    s.k(biometricPaymentsSettingsService);
                    return new ql9.d(biometricPaymentsSettingsService, cVar8.f272026b.b(), (j) cVar8.f272031l.get(), (ue0.c) cVar8.f272032m.get());
                }
                if (i2 == 1) {
                    tl9.i.Companion.getClass();
                    return new d();
                }
                if (i2 != 2) {
                    throw new AssertionError(i2);
                }
                je0.d mapper = aVar20.d();
                s.j(mapper);
                yk0.a databaseSessionProvider3 = cVar8.d.b();
                s.j(databaseSessionProvider3);
                f storageFactory3 = aVar20.f();
                s.j(storageFactory3);
                tl9.i.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                return f.f(storageFactory3, databaseSessionProvider3, "pay_with_smile_settings", mapper, 0, null, 56);
        }
    }
}
