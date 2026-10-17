package yo5;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.expiring_cards_bottom_sheet.ExpiringCardsBottomSheetContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.reactivate.confirmation_bottom_sheet.ReactivateCardConfirmationBottomSheetContract$InputData;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.details.AccountDetailsControllerContract$InputData;
import com.revolut.feature.freelancer.impl.network.services.InvoiceTemplateService;
import com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect.screen.MerchantRedirectDialogControllerContract$InputData;
import com.revolut.feature.wealth.impl.ui.screens.pocket_picker.PocketPickerScreenContract$Input;
import com.revolut.shared.feature.market_data.impl.data.service.OrderQuoteService;
import g48.r0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f315577b;

    public /* synthetic */ r(Object obj2, int i) {
        this.f315576a = i;
        this.f315577b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f315576a) {
            case 0:
                return new com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingflow.a(((s) this.f315577b).f315578a);
            case 1:
                u uVar = (u) this.f315577b;
                return new com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.bridge.a(uVar.f315584a, new pp5.a(uVar.f315585b.f315598p.b()));
            case 2:
                fse.g gVar = new fse.g();
                yre.c cVar = (yre.c) this.f315577b;
                MerchantRedirectDialogControllerContract$InputData merchantRedirectDialogControllerContract$InputData = cVar.f316288a;
                l70.e eVar = cVar.f316289b.e;
                n80.d packageManagerResolver = eVar.a();
                vc.s.j(packageManagerResolver);
                f80.a uriHelper = eVar.x();
                vc.s.j(uriHelper);
                Intrinsics.checkNotNullParameter(packageManagerResolver, "packageManagerResolver");
                Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
                r10.a aVar = new r10.a();
                aVar.f250811a = packageManagerResolver;
                aVar.f250812b = uriHelper;
                return new fse.f(gVar, merchantRedirectDialogControllerContract$InputData, aVar);
            case 3:
                return new com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect.a(((yre.d) this.f315577b).f316291a);
            case 4:
                Retrofit retrofit = ((c21.b) ((ys6.a) this.f315577b).f316413a).i();
                vc.s.j(retrofit);
                ys6.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object objCreate = retrofit.create(InvoiceTemplateService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                InvoiceTemplateService invoiceTemplateService = (InvoiceTemplateService) objCreate;
                vc.s.k(invoiceTemplateService);
                return invoiceTemplateService;
            case 5:
                Context context = ((ysb.d) this.f315577b).f316444a;
                zsb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new xsb.d(sri.o.c(context, null, null, 14));
            case 6:
                eu2.i iVar = new eu2.i();
                yt2.g gVar2 = (yt2.g) this.f315577b;
                l70.e eVar2 = gVar2.d;
                y80.a aVarR = eVar2.r();
                vc.s.j(aVarR);
                s70.a aVarM = eVar2.m();
                vc.s.j(aVarM);
                return new com.revolut.feature.call_security_info.impl.ui.call_detection.b(iVar, aVarR, aVarM, (cu2.c) gVar2.f316623q.get(), new wt2.c());
            case 7:
                yt2.h hVar = (yt2.h) this.f315577b;
                return new ee6.f(hVar.f316625a, hVar.f316626b, hVar.f316627c, hVar.d, hVar.e, hVar.f, hVar.f316628g, hVar.f316629h, hVar.i, 13);
            case 8:
                yu2.d dVar = (yu2.d) this.f315577b;
                return new a16.b(dVar.f316863a, dVar.f316864b, 26);
            case 9:
                yvj.e eVar3 = (yvj.e) this.f315577b;
                return new c3d.d(eVar3.f317211a, eVar3.f317212b, 14);
            case 10:
                ywj.d dVar2 = (ywj.d) this.f315577b;
                return new ea2.s(dVar2.f317463a, dVar2.f317464b, dVar2.f317465c, dVar2.d, dVar2.e, dVar2.f, dVar2.f317466g, dVar2.f317467h, dVar2.i, dVar2.f317468j, dVar2.k, dVar2.f317469l, dVar2.f317470m, dVar2.f317471n, dVar2.o, 4);
            case 11:
                return new com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.flow.a(((yxj.b) this.f315577b).f317706a);
            case 12:
                z01.c cVar2 = (z01.c) this.f315577b;
                return new bo9.d(cVar2.f318169a, cVar2.f318170b, cVar2.f318171c, cVar2.d, cVar2.e, cVar2.f, 18);
            case 13:
                z06.a aVar2 = (z06.a) this.f315577b;
                return new a16.b(aVar2.f318184a, aVar2.f318185b, 0);
            case 14:
                z1e.a aVar3 = (z1e.a) this.f315577b;
                return new a2d.m(aVar3.f318791a, aVar3.f318792b, aVar3.f318793c, 2);
            case 15:
                z35.a aVar4 = (z35.a) this.f315577b;
                AccountDetailsControllerContract$InputData accountDetailsControllerContract$InputData = aVar4.f319161a;
                f90.b bVarT = aVar4.f319162b.f.t();
                vc.s.j(bVarT);
                return new g45.e(accountDetailsControllerContract$InputData, new g45.f(accountDetailsControllerContract$InputData, new ky4.c(bVarT)));
            case 16:
                z35.e eVar4 = (z35.e) this.f315577b;
                return new c21.f(eVar4.f319177a, eVar4.f319178b, eVar4.f319179c, eVar4.d, eVar4.e, eVar4.f, eVar4.f319180g, eVar4.f319181h, eVar4.i, eVar4.f319182j, eVar4.k);
            case 17:
                return new com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.b(((z3h.a) this.f315577b).f319263a, new qee.s(ImmutableSet.of(new x4h.a(new u4h.a(), new u4h.b()))), new u4h.c());
            case 18:
                return new g4h.d(new g4h.f(((z3h.c) this.f315577b).f319268a));
            case 19:
                fx1.a aVarF = ((lz1.m) ((z52.h) this.f315577b).f319429a).f();
                vc.s.j(aVarF);
                return new c62.i(aVarF);
            case 20:
                z5d.a aVar5 = (z5d.a) this.f315577b;
                return new a6d.a(aVar5.f319608c, aVar5.d, aVar5.e, aVar5.f, aVar5.f319609g, aVar5.f319606a, aVar5.f319607b);
            case 21:
                z60.a aVar6 = (z60.a) this.f315577b;
                return new vub.j(aVar6.f319649a, aVar6.f319650b, aVar6.f319651c, 3);
            case 22:
                z73.e eVar5 = (z73.e) this.f315577b;
                ExpiringCardsBottomSheetContract$InputData expiringCardsBottomSheetContract$InputData = eVar5.f319892a;
                m93.d dVarF = eVar5.f319893b.f319860c.f();
                vc.s.j(dVarF);
                return new d83.j(new d83.k(expiringCardsBottomSheetContract$InputData, dVarF));
            case 23:
                z73.f fVar = (z73.f) this.f315577b;
                ReactivateCardConfirmationBottomSheetContract$InputData reactivateCardConfirmationBottomSheetContract$InputData = fVar.f319895a;
                gte.a aVarB = fVar.f319896b.e.b();
                vc.s.j(aVarB);
                return new l83.j(new l83.m(reactivateCardConfirmationBottomSheetContract$InputData, aVarB), reactivateCardConfirmationBottomSheetContract$InputData);
            case 24:
                z7l.a aVar7 = (z7l.a) this.f315577b;
                kg.o baseGson = fe0.c.a();
                Retrofit baseRetrofit = ((nj0.d) aVar7.f320026a).f();
                x7l.a marketDataNetworkConfiguration = aVar7.f320027b;
                Intrinsics.checkNotNullParameter(baseGson, "baseGson");
                Intrinsics.checkNotNullParameter(baseRetrofit, "baseRetrofit");
                Intrinsics.checkNotNullParameter(marketDataNetworkConfiguration, "marketDataNetworkConfiguration");
                kg.p pVar = new kg.p(baseGson);
                he0.m mVarA = c8l.a.a();
                ArrayList arrayList = pVar.e;
                arrayList.add(mVarA);
                he0.m mVarB = he0.m.b(e8l.t.class, "status");
                mVarB.c(e8l.p.class, "AVAILABLE");
                mVarB.c(e8l.r.class, "UNAVAILABLE");
                mVarB.c(e8l.s.class, "FALLBACK_SUBTYPE_LABEL");
                Intrinsics.checkNotNullExpressionValue(mVarB, "registerFallbackSubtype(...)");
                arrayList.add(mVarB);
                kg.o oVarB = pVar.b();
                Retrofit.Builder builderNewBuilder = baseRetrofit.newBuilder();
                builderNewBuilder.converterFactories().clear();
                builderNewBuilder.addConverterFactory(GsonConverterFactory.create(oVarB));
                builderNewBuilder.baseUrl(marketDataNetworkConfiguration.getHostUrl());
                Object objCreate2 = builderNewBuilder.build().create(OrderQuoteService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                OrderQuoteService orderQuoteService = (OrderQuoteService) objCreate2;
                vc.s.k(orderQuoteService);
                lfm.c cVarB = ((g8b.a) aVar7.f320028c).b();
                vc.s.j(cVarB);
                CoroutineScope coroutineScopeA = aVar7.d.a();
                vc.s.j(coroutineScopeA);
                a8l.c quoteRetailEndpointEligibilityChecker = new a8l.c();
                Intrinsics.checkNotNullParameter(quoteRetailEndpointEligibilityChecker, "quoteRetailEndpointEligibilityChecker");
                return new b8l.f(orderQuoteService, cVarB, coroutineScopeA, new a8l.b());
            case 25:
                return new a7d.a(((z91.a) this.f315577b).f320296a, 1);
            case 26:
                z9c.a aVar8 = (z9c.a) this.f315577b;
                return new a1e.h(aVar8.f320324a, aVar8.f320325b, aVar8.f320326c, aVar8.d, aVar8.e, aVar8.f, aVar8.f320327g, aVar8.f320328h, aVar8.i, aVar8.f320329j, aVar8.k, 1);
            case 27:
                z9h.c cVar3 = (z9h.c) this.f315577b;
                oah.d dVar3 = cVar3.f320393a;
                fpc.a dependenciesApi = cVar3.f320394b;
                o1h.e flowInfo = cVar3.f320395c;
                pah.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(dependenciesApi, "dependenciesApi");
                Intrinsics.checkNotNullParameter(flowInfo, "flowInfo");
                nmc.d dVarD = dependenciesApi.f137083a.d();
                gte.a aVarB2 = dependenciesApi.f137084b.b();
                vc.s.j(aVarB2);
                nmc.a mapper = new nmc.a(dVarD, aVarB2);
                qmc.h portfolioInfoProvider = dependenciesApi.f137085c.a();
                ybl.k tradingAccountsInteractor = dependenciesApi.d.d();
                vc.s.j(tradingAccountsInteractor);
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
                Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
                Intrinsics.checkNotNullParameter(flowInfo, "flowInfo");
                epc.h hVar2 = new epc.h(flowInfo, portfolioInfoProvider, mapper, tradingAccountsInteractor);
                tzg.k kVar = (tzg.k) cVar3.d.f320396a.f150285x0.get();
                vc.s.j(kVar);
                kge.d dVar4 = new kge.d(kVar, dVar3);
                Intrinsics.checkNotNullParameter(dependenciesApi, "dependenciesApi");
                Intrinsics.checkNotNullParameter(flowInfo, "flowInfo");
                ybl.k tradingAccountsInteractor2 = dependenciesApi.d.d();
                vc.s.j(tradingAccountsInteractor2);
                gte.a featureToggleInteractor = dependenciesApi.f137084b.b();
                vc.s.j(featureToggleInteractor);
                zjh.f portfolioInteractor = dependenciesApi.f137083a.a();
                tul.b portfolioMetricsInteractor = dependenciesApi.e.n();
                Intrinsics.checkNotNullParameter(tradingAccountsInteractor2, "tradingAccountsInteractor");
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
                Intrinsics.checkNotNullParameter(portfolioMetricsInteractor, "portfolioMetricsInteractor");
                Intrinsics.checkNotNullParameter(flowInfo, "flowInfo");
                return new com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a(dVar3, hVar2, dVar4, new epc.c(flowInfo, tradingAccountsInteractor2, featureToggleInteractor, portfolioInteractor, portfolioMetricsInteractor));
            case 28:
                z9h.g gVar3 = (z9h.g) this.f315577b;
                PocketPickerScreenContract$Input pocketPickerScreenContract$Input = gVar3.f320427a;
                pch.g gVar4 = new pch.g(pocketPickerScreenContract$Input);
                z9h.d dVar5 = gVar3.f320428b;
                usg.a aVar9 = dVar5.d;
                wsg.b bVarA = aVar9.a();
                wsg.n nVarB = aVar9.b();
                ppg.b bVarB = ((wpg.l) dVar5.e).b();
                vc.s.j(bVarB);
                djb.n nVarA = dVar5.f.a();
                vc.s.j(nVarA);
                r0 r0VarC = dVar5.f320399g.c();
                gr6.m mVarB2 = dVar5.f320400h.b();
                vc.s.j(mVarB2);
                al4.n nVarS = dVar5.i.s();
                vc.s.j(nVarS);
                gte.a aVarB3 = dVar5.f320401j.b();
                vc.s.j(aVarB3);
                h9h.a aVar10 = dVar5.f320396a;
                wzg.a aVarE = aVar10.e();
                vc.s.j(aVarE);
                ybl.l lVarF = aVar10.f();
                cm4.a aVarI = dVar5.k.i();
                sbh.a aVar11 = new sbh.a(dVar5.a());
                r10.q qVarD = dVar5.f320402l.d();
                ybl.k kVarD = dVar5.f320403m.d();
                vc.s.j(kVarD);
                return new pch.h(gVar4, new rbh.r(bVarA, nVarB, bVarB, nVarA, r0VarC, mVarB2, nVarS, aVarB3, aVarE, lVarF, aVarI, aVar11, qVarD, kVarD, aVar10.J(), new rbh.s()), pocketPickerScreenContract$Input);
            default:
                return new add.b(((zcd.a) this.f315577b).f321262a, 0);
        }
    }
}
