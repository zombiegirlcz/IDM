package yf3;

import bjl.p0;
import c1g.k;
import com.revolut.feature.apm.iris.impl.ui.registration.IrisRegistrationFlowContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.cards_list.CardsListFlowContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.reactivate.ReactivateCardScreenContract$InputData;
import com.revolut.feature.credit.loan.autopay.api.account_selector.AccountSelectorV2$InputData;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoFeeBreakdownDialogInput;
import com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.AccountActivationDeeplinkFlowContract$InputData;
import com.revolut.feature.junior.account_activation.impl.ui.screen.terms_conditions.TermsAndConditionsDetailsScreenContract$InputData;
import com.revolut.feature.kyc.impl.choosedocument.kompot.ChooseDocumentScreenContract$InputData;
import com.revolut.feature.kyc.impl.cmd.flow.CmdFlowContract$InputData;
import com.revolut.feature.kyc.impl.screens.addressconfirmation.AddressConfirmationScreenContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.brazil.flow.SalarySwitchBrFlowContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.review_details.ReviewDetailsScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlowContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.flow.tabs.TravelExperiencesTabsFlowContract$InputData;
import com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.AccountClosureFlowContract$InputData;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.consent.AccountClosureConsentScreenContract$InputData;
import com.revolut.feature.wealth.api.ui.invest.transactions.details.pager.InvestTransactionDetailsPagerContract$InputData;
import com.revolut.retail.feature.impl.userauth.screen.revolut_sso.RetailRevolutSsoFlowContract$InputData;
import com.revolut.sso.impl.network.services.TokenExchangeService;
import fg3.i;
import fg3.j;
import fwj.p;
import h45.l;
import iug.n;
import java.time.Clock;
import java.util.List;
import java.util.Optional;
import k1g.o;
import kotlin.jvm.internal.Intrinsics;
import ljl.q0;
import ljl.q1;
import ljl.t1;
import retrofit2.Retrofit;
import rh8.o0;
import vc.s;
import yo5.w;
import z0g.q;
import z52.m;
import zhm.u;
import zo5.r;
import zu8.c0;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f313160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f313161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qji.b f313162c;

    public /* synthetic */ d(Object obj2, qji.b bVar, int i) {
        this.f313160a = i;
        this.f313161b = obj2;
        this.f313162c = bVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f313160a) {
            case 0:
                dg3.c cVar = ((e) this.f313162c).f313163a;
                y80.a aVarR = ((c) this.f313161b).f313155a.r();
                s.j(aVarR);
                return new com.revolut.feature.check_topup.impl.ui_kompot.flow.a(cVar, aVarR);
            case 1:
                fg3.b bVar = ((f) this.f313162c).f313166a;
                j jVar = new j();
                c cVar2 = (c) this.f313161b;
                return new i(bVar, jVar, (zf3.a) cVar2.f313159h.get(), (jg3.a) cVar2.i.get());
            case 2:
                ywj.b bVar2 = (ywj.b) this.f313161b;
                x60.a aVar = (x60.a) bVar2.f317455g.d.get();
                s.j(aVar);
                RetailRevolutSsoFlowContract$InputData retailRevolutSsoFlowContract$InputData = ((ywj.c) this.f313162c).f317461a;
                q1 q1Var = bVar2.f317453b;
                nkl.b bVarI = ((q0) q1Var).i();
                xjl.i iVar = (xjl.i) ((q0) q1Var).Z.get();
                s.j(iVar);
                p pVarA = bVar2.f317456h.a();
                s.j(pVarA);
                com.revolut.retail.feature.api.userauth.navigation.a aVarA = bVar2.i.a();
                s.j(aVarA);
                mli.e eVarB = ((j51.a) bVar2.f317457j).b();
                s.j(eVarB);
                yva.a aVarA2 = bVar2.k.a();
                s.j(aVarA2);
                c6b.j jVar2 = (c6b.j) bVar2.f317458l.f12604m.get();
                s.j(jVar2);
                zm0.b bVarI2 = bVar2.f317459m.i();
                s.j(bVarI2);
                owj.b bVar3 = new owj.b();
                q0 q0Var = (q0) q1Var;
                p0 revolutSsoDependenciesProvider = (p0) q0Var.H.get();
                Retrofit retrofit = (Retrofit) q0Var.K.get();
                t1.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object objCreate = retrofit.create(TokenExchangeService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                TokenExchangeService tokenExchangeService = (TokenExchangeService) objCreate;
                s.k(tokenExchangeService);
                Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
                Intrinsics.checkNotNullParameter(tokenExchangeService, "tokenExchangeService");
                r10.a aVar2 = new r10.a();
                aVar2.f250811a = revolutSsoDependenciesProvider;
                aVar2.f250812b = tokenExchangeService;
                fh8.a aVar3 = new fh8.a(bVar2.f317460n.a());
                gte.a aVarB = bVar2.f317452a.b();
                s.j(aVarB);
                return new com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c(aVar, retailRevolutSsoFlowContract$InputData, bVarI, iVar, pVarA, aVarA, eVarB, aVarA2, jVar2, bVarI2, bVar3, aVar2, aVar3, aVarB);
            case 3:
                z0g.j jVar3 = (z0g.j) this.f313162c;
                TravelExperiencesHomeFlowContract$InputData travelExperiencesHomeFlowContract$InputData = jVar3.f318385a;
                z0g.b bVar4 = (z0g.b) this.f313161b;
                k kVar = (k) bVar4.Z.get();
                z0g.b bVar5 = jVar3.f318386b;
                hyf.a aVarA3 = bVar5.f318307h.a();
                s.j(aVarA3);
                nyb.k kVarC = bVar5.i.c();
                s.j(kVarC);
                f1g.d dVar = new f1g.d(aVarA3, kVarC);
                zja.a aVarA4 = ((ika.b) bVar4.f318309j).a();
                s.j(aVarA4);
                eub.e eVar = (eub.e) bVar4.i.V.get();
                s.j(eVar);
                return new com.revolut.feature.travel.experiences.impl.ui.flow.home.b(travelExperiencesHomeFlowContract$InputData, kVar, dVar, aVarA4, eVar);
            case 4:
                TravelExperiencesTabsFlowContract$InputData travelExperiencesTabsFlowContract$InputData = ((q) this.f313162c).f318440a;
                z0g.b bVar6 = (z0g.b) this.f313161b;
                hyf.a aVarA5 = bVar6.f318307h.a();
                s.j(aVarA5);
                j0g.j jVar4 = (j0g.j) bVar6.Q.get();
                nyb.k kVarC2 = bVar6.i.c();
                s.j(kVarC2);
                return new com.revolut.feature.travel.experiences.impl.ui.flow.tabs.a(travelExperiencesTabsFlowContract$InputData, aVarA5, jVar4, kVarC2, new o());
            case 5:
                return new com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.a(((z35.c) this.f313161b).b(), new l(((z35.b) this.f313162c).f319164a, new i45.a()));
            case 6:
                z35.d dVar2 = (z35.d) this.f313162c;
                AccountSelectorV2$InputData accountSelectorV2$InputData = dVar2.f319174a;
                z35.c cVar3 = (z35.c) this.f313161b;
                m2j.j jVarC = cVar3.f319170h.c();
                b45.h hVarB = cVar3.b();
                ang.f fVarE = cVar3.f319167b.e();
                zja.a aVarA6 = ((ika.b) cVar3.i).a();
                s.j(aVarA6);
                return new com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b(accountSelectorV2$InputData, jVarC, hVarB, fVarE, new wx4.b(aVarA6), new j45.o(dVar2.f319174a, dVar2.f319175b.f319170h.e(), new c45.b()));
            case 7:
                z3h.b bVar7 = (z3h.b) this.f313162c;
                return new n4h.k(new kxk.o(bVar7.f319266b, new n4h.f(new n4h.b(new n4h.d(), new kpj.f(bVar7.f319267c.f319284j.H())))), ((z3h.g) this.f313161b).f319284j.f());
            case 8:
                return new q62.h(((z52.k) this.f313162c).f319446a, (c62.d) ((m) this.f313161b).f319459l.get(), new q62.i());
            case 9:
                z52.p pVar = (z52.p) this.f313162c;
                IrisRegistrationFlowContract$InputData irisRegistrationFlowContract$InputData = pVar.f319465a;
                wj0.a aVarI = ((nj0.d) ((z52.j) this.f313161b).f319433a).i();
                s.j(aVarI);
                c62.e eVar2 = (c62.e) pVar.f319466b.f319434b.f319430b.get();
                s.j(eVar2);
                return new com.revolut.feature.apm.iris.impl.ui.registration.a(irisRegistrationFlowContract$InputData, aVarI, new f62.i(irisRegistrationFlowContract$InputData, eVar2));
            case 10:
                AccountActivationDeeplinkFlowContract$InputData accountActivationDeeplinkFlowContract$InputData = ((z58.e) this.f313162c).f319557a;
                z58.j jVar5 = (z58.j) this.f313161b;
                q58.a aVar4 = (q58.a) jVar5.e.f319539q.get();
                s.j(aVar4);
                hj8.a aVarA7 = jVar5.f319579l.a();
                s.j(aVarA7);
                return new com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.c(accountActivationDeeplinkFlowContract$InputData, aVar4, aVarA7, jVar5.f319581n.a());
            case 11:
                o0 o0Var = (o0) ((z58.j) this.f313161b).f319575c.f246500m.get();
                s.j(o0Var);
                z58.k kVar2 = (z58.k) this.f313162c;
                TermsAndConditionsDetailsScreenContract$InputData termsAndConditionsDetailsScreenContract$InputData = kVar2.f319582a;
                lh8.a aVar5 = (lh8.a) kVar2.f319583b.f319575c.o.get();
                s.j(aVar5);
                return new p68.i(o0Var, new i3g.k(termsAndConditionsDetailsScreenContract$InputData, aVar5));
            case 12:
                CardsListFlowContract$InputData cardsListFlowContract$InputData = ((z73.c) this.f313162c).f319875a;
                z73.b bVar8 = (z73.b) this.f313161b;
                li0.b bVarC = t2d.c.c(bVar8.f319858a.f271230a);
                cge.h hVarA = bVar8.f319859b.a();
                l93.f fVarJ = bVar8.f319860c.j();
                s.j(fVarJ);
                zj2.a aVar6 = new zj2.a();
                gte.a aVarB2 = bVar8.e.b();
                s.j(aVarB2);
                return new com.revolut.feature.card_screen.impl.kompot.cards_list.c(cardsListFlowContract$InputData, bVarC, hVarA, fVarJ, aVar6, aVarB2);
            case 13:
                z73.g gVar = (z73.g) this.f313162c;
                z73.b bVar9 = gVar.f319899b;
                m93.d dVarF = bVar9.f319860c.f();
                s.j(dVarF);
                gte.a aVarB3 = bVar9.e.b();
                s.j(aVarB3);
                n83.b.Companion.getClass();
                Clock clockSystemDefaultZone = Clock.systemDefaultZone();
                Intrinsics.checkNotNullExpressionValue(clockSystemDefaultZone, "systemDefaultZone(...)");
                s.k(clockSystemDefaultZone);
                i83.p pVar2 = new i83.p(dVarF, aVarB3, clockSystemDefaultZone);
                ReactivateCardScreenContract$InputData reactivateCardScreenContract$InputData = gVar.f319898a;
                l93.f fVarJ2 = ((z73.b) this.f313161b).f319860c.j();
                s.j(fVarJ2);
                return new com.revolut.feature.card_screen.impl.kompot.reactivate.b(pVar2, reactivateCardScreenContract$InputData, fVarJ2);
            case 14:
                z9h.e eVar3 = (z9h.e) this.f313162c;
                InvestTransactionDetailsPagerContract$InputData inputData = eVar3.f320411a;
                abh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                String id10 = inputData.f95357a.getId();
                zah.e eVar4 = zah.g.Companion;
                List listC = u.c(inputData.f95357a);
                eVar4.getClass();
                zah.b bVar10 = new zah.b(null, null, id10, zah.e.a(listC));
                zah.i iVar2 = new zah.i();
                zah.h hVar = new zah.h();
                InvestTransactionDetailsPagerContract$InputData investTransactionDetailsPagerContract$InputData = eVar3.f320411a;
                h9h.a aVar7 = ((z9h.d) this.f313161b).f320396a;
                return new zah.g(bVar10, iVar2, hVar, investTransactionDetailsPagerContract$InputData, aVar7.z(), aVar7.i());
            case 15:
                he8.c cVar4 = ((zd8.b) this.f313162c).f321333a;
                zd8.f fVar = (zd8.f) this.f313161b;
                a5h.g gVarB = fVar.f321340a.b();
                gte.a aVarB4 = fVar.f.b();
                s.j(aVarB4);
                return new com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a(cVar4, gVarB, aVarB4, fVar.f321343g.a(), fVar.f321344h.a());
            case 16:
                zm8.a aVar8 = (zm8.a) this.f313162c;
                dn8.l lVar = new dn8.l(new dcd.b());
                dn8.b bVar11 = aVar8.f323387a;
                zm8.b bVar12 = (zm8.b) this.f313161b;
                hj8.a aVarA8 = bVar12.f323389a.a();
                s.j(aVarA8);
                xcd.a aVarA9 = bVar12.f323390b.a();
                s.j(aVarA9);
                return new dn8.f(lVar, bVar11, aVarA8, aVarA9, bVar12.f323392g.e(), (an8.b) bVar12.f323395l.get());
            case 17:
                mq5.k kVar3 = new mq5.k();
                CryptoFeeBreakdownDialogInput cryptoFeeBreakdownDialogInput = ((r) this.f313162c).f323945b;
                Optional optionalEmpty = Optional.empty();
                no5.b bVar13 = (no5.b) ((w) ((zo5.d) this.f313161b).f323886b).z.get();
                s.j(bVar13);
                return new com.revolut.feature.crypto.withdraw.impl.ui_v3.fee_breakdown_dialog.a(kVar3, cryptoFeeBreakdownDialogInput, optionalEmpty, bVar13, new mq5.i());
            case 18:
                return new com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.a(new pqc.l(), ((zpc.b) this.f313162c).f324234a, new pqc.a(), (aqc.j) ((zpc.k) this.f313161b).J.get());
            case 19:
                return new rqc.h(new rqc.i(), ((zpc.c) this.f313162c).f324236a, (aqc.j) ((zpc.k) this.f313161b).J.get());
            case 20:
                xqc.i iVar3 = new xqc.i();
                ReviewDetailsScreenContract$InputData reviewDetailsScreenContract$InputData = ((zpc.f) this.f313162c).f324243a;
                zpc.k kVar4 = (zpc.k) this.f313161b;
                return new xqc.h(iVar3, reviewDetailsScreenContract$InputData, kVar4.f324265t.f233894a.a(), (aqc.j) kVar4.J.get());
            case 21:
                return new tqc.e(new tqc.f(), ((zpc.g) this.f313162c).f324245a, (aqc.a) ((zpc.k) this.f313161b).L.get());
            case 22:
                zpc.k kVar5 = (zpc.k) this.f313161b;
                return new com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a((aqc.a) kVar5.L.get(), ((zpc.i) this.f313162c).f324248a, new brc.d(), (aqc.j) kVar5.J.get(), new brc.w(new brc.b()));
            case 23:
                SalarySwitchBrFlowContract$InputData salarySwitchBrFlowContract$InputData = ((zpc.l) this.f313162c).f324269a;
                zpc.k kVar6 = (zpc.k) this.f313161b;
                aqc.j jVar6 = (aqc.j) kVar6.J.get();
                zja.a aVarA10 = ((ika.b) kVar6.f324264s).a();
                s.j(aVarA10);
                return new com.revolut.feature.salary_switch.impl.ui.brazil.flow.b(salarySwitchBrFlowContract$InputData, jVar6, aVarA10);
            case 24:
                ztg.b bVar14 = (ztg.b) this.f313162c;
                fug.d dVar3 = new fug.d();
                gte.a aVarB5 = bVar14.f325119b.k.b();
                s.j(aVarB5);
                AccountClosureConsentScreenContract$InputData accountClosureConsentScreenContract$InputData = bVar14.f325118a;
                return new iug.k(new n(dVar3, aVarB5, accountClosureConsentScreenContract$InputData), accountClosureConsentScreenContract$InputData, ((ztg.n) this.f313161b).f325154l.f());
            case 25:
                AccountClosureFlowContract$InputData accountClosureFlowContract$InputData = ((ztg.h) this.f313162c).f325133a;
                ztg.n nVar = (ztg.n) this.f313161b;
                ktg.a aVar9 = (ktg.a) nVar.f325162w.get();
                zdl.f fVar2 = nVar.i;
                ybl.k kVarD = fVar2.d();
                s.j(kVarD);
                ybl.i iVarB = fVar2.b();
                s.j(iVarB);
                ybl.d dVarH = nVar.f325152h.h();
                s.j(dVarH);
                vrl.g gVarB2 = nVar.f325153j.b();
                s.j(gVarB2);
                return new com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b(accountClosureFlowContract$InputData, aVar9, kVarD, iVarB, dVarH, gVarB2, new bvg.a());
            case 26:
                zug.k kVar7 = new zug.k();
                zug.j jVar7 = new zug.j();
                zug.b bVar15 = ((ztg.m) this.f313162c).f325146a;
                zdl.c cVar5 = ((ztg.n) this.f313161b).f325152h;
                vdl.f repository = (vdl.f) cVar5.K0.get();
                ybl.d portfolioInteractor = (ybl.d) cVar5.l0.get();
                ybl.b instrumentTickerInteractor = (ybl.b) cVar5.f321560r0.get();
                Intrinsics.checkNotNullParameter(repository, "repository");
                Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
                Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
                r10.r rVar = new r10.r();
                rVar.f250851a = repository;
                rVar.f250852b = portfolioInteractor;
                rVar.f250853c = instrumentTickerInteractor;
                return new zug.i(kVar7, jVar7, bVar15, rVar);
            case 27:
                AddressConfirmationScreenContract$InputData addressConfirmationScreenContract$InputData = ((zu8.b) this.f313162c).f325229a;
                c0 c0Var = (c0) this.f313161b;
                ang.f fVarE2 = c0Var.f.e();
                w39.b bVarA = c0Var.u.a();
                s.j(bVarA);
                return new com.revolut.feature.kyc.impl.screens.addressconfirmation.a(addressConfirmationScreenContract$InputData, fVarE2, bVarA, new ww8.m());
            case 28:
                zu8.c cVar6 = (zu8.c) this.f313162c;
                ChooseDocumentScreenContract$InputData chooseDocumentScreenContract$InputData = cVar6.f325234a;
                n8b.a aVarA11 = cVar6.f325235b.o.a();
                s.j(aVarA11);
                ac4.g gVar2 = new ac4.g(chooseDocumentScreenContract$InputData, aVarA11);
                ChooseDocumentScreenContract$InputData chooseDocumentScreenContract$InputData2 = cVar6.f325234a;
                c0 c0Var2 = (c0) this.f313161b;
                ot8.a aVar10 = (ot8.a) c0Var2.f325238b.f218990q.get();
                s.j(aVar10);
                l70.e eVar5 = c0Var2.f325244m;
                qd0.b bVarN = eVar5.n();
                s.j(bVarN);
                f80.a aVarX = eVar5.x();
                s.j(aVarX);
                return new ku8.h(gVar2, chooseDocumentScreenContract$InputData2, aVar10, bVarN, aVarX);
            default:
                CmdFlowContract$InputData cmdFlowContract$InputData = ((zu8.f) this.f313162c).f325269a;
                ou8.a aVar11 = new ou8.a();
                f80.a aVarX2 = ((c0) this.f313161b).f325244m.x();
                s.j(aVarX2);
                return new com.revolut.feature.kyc.impl.cmd.flow.b(cmdFlowContract$InputData, aVar11, aVarX2);
        }
    }
}
