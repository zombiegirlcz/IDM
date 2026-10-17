package a0b;

import a7b.v;
import afj.b0;
import afj.c0;
import afj.e0;
import afj.n0;
import afj.t;
import afj.v0;
import afj.z;
import android.content.Context;
import au6.y3;
import com.revolut.feature.apm.bills.bpay.impl.screen.review.review.BPayReviewScreenContract$InputData;
import com.revolut.feature.corporate_events.impl.ui.screen.details.CorporateEventDetailsContract$InputData;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.preview.DirectDepositPreviewContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.TaxHubPaymentAssessmentScreenContract$InputData;
import com.revolut.feature.restricted_access.impl.ui.flow.FeatureNotAvailableFlowContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.mappers.CobrandedCardsCardFeesItemMapper;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.CobrandedCardsAdditionalValueScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.flow.InfoSheetFlowContract$InputData;
import com.revolut.feature.retail.savings.impl.core.product.presentation.rate_explanation.SavingsInterestRateExplanationContract$InputData;
import com.revolut.feature.retail.savings.impl.ui.add_money.SavingsAddMoneyFlowContract$InputData;
import com.revolut.feature.retail.savings.impl.ui.product_migration.flow.ProductMigrationFlowContract$InputData;
import com.revolut.feature.stock_lending.impl.ui.v2.screen.product.StockLendingProductScreenContract$InputData;
import com.revolut.feature_crypto_order_details.impl.ui.pager.CryptoOrderDetailsPagerFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.get_plan.EsimGetPlanFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.help.EsimHelpFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.business_details.EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData;
import dfj.q1;
import dfj.w;
import dfj.z0;
import dfj.z2;
import djb.u;
import gp3.r;
import h96.j;
import j96.n;
import kotlin.jvm.internal.Intrinsics;
import kxk.o;
import m1e.l;
import m1e.m;
import mp.p;
import so1.q;
import vc.s;
import wli.x;
import ybl.k;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xki.e f302c;

    public /* synthetic */ a(Object obj2, xki.e eVar, int i) {
        this.f300a = i;
        this.f301b = obj2;
        this.f302c = eVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f300a) {
            case 0:
                FeatureNotAvailableFlowContract$InputData featureNotAvailableFlowContract$InputData = ((b) this.f302c).f303a;
                f80.a aVarX = ((d) this.f301b).e.x();
                s.j(aVarX);
                return new com.revolut.feature.restricted_access.impl.ui.flow.a(featureNotAvailableFlowContract$InputData, aVarX);
            case 1:
                m mVar = new m();
                StockLendingProductScreenContract$InputData stockLendingProductScreenContract$InputData = ((a1e.f) this.f302c).f617a;
                a1e.b bVar = (a1e.b) this.f301b;
                k kVarD = bVar.k.d();
                s.j(kVarD);
                return new l(mVar, stockLendingProductScreenContract$InputData, kVarD, bVar.f589a.q());
            case 2:
                h96.k kVar = new h96.k();
                a96.e eVar = (a96.e) this.f302c;
                DirectDepositPreviewContract$InputData directDepositPreviewContract$InputData = eVar.f2347a;
                a96.c cVar = (a96.c) this.f301b;
                tqi.g gVarE = cVar.f.e();
                a96.c cVar2 = eVar.f2348b;
                vxd.b bVar2 = cVar2.d;
                zxd.b bVar3 = (zxd.b) ((eyd.b) bVar2).D.get();
                s.j(bVar3);
                b96.e eVarA = cVar2.a();
                zxd.c cVarA = ((eyd.b) bVar2).a();
                s.j(cVarA);
                l70.e eVar2 = cVar2.e;
                qd0.b bVarN = eVar2.n();
                s.j(bVarN);
                u80.m mVar2 = new u80.m(bVarN);
                l80.e eVarH = eVar2.h();
                s.j(eVarH);
                zk0.b bVarL = eVar2.l();
                s.j(bVarL);
                b96.h hVar = new b96.h(bVar3, eVarA, cVarA, mVar2, eVarH, bVarL, a96.l.a());
                ang.f fVarE = cVar.f2340b.e();
                t70.g gVarO = cVar.e.o();
                s.j(gVarO);
                return new j(kVar, directDepositPreviewContract$InputData, gVarE, hVar, fVarE, gVarO);
            case 3:
                a96.f fVar = (a96.f) this.f302c;
                d96.b bVar4 = new d96.b();
                a96.c cVar3 = fVar.f2350a;
                n nVar = new n(bVar4, cVar3.e.i());
                vxd.b bVar5 = cVar3.d;
                zxd.b bVar6 = (zxd.b) ((eyd.b) bVar5).D.get();
                s.j(bVar6);
                b96.e eVarA2 = cVar3.a();
                zxd.c cVarA2 = ((eyd.b) bVar5).a();
                s.j(cVarA2);
                l70.e eVar3 = cVar3.e;
                qd0.b bVarN2 = eVar3.n();
                s.j(bVarN2);
                u80.m mVar3 = new u80.m(bVarN2);
                l80.e eVarH2 = eVar3.h();
                s.j(eVarH2);
                zk0.b bVarL2 = eVar3.l();
                s.j(bVarL2);
                b96.h hVar2 = new b96.h(bVar6, eVarA2, cVarA2, mVar3, eVarH2, bVarL2, a96.l.a());
                qd0.b bVarN3 = ((a96.c) this.f301b).e.n();
                s.j(bVarN3);
                return new j96.l(nVar, hVar2, bVarN3);
            case 4:
                af5.d dVar = ((af5.c) this.f302c).f3890a;
                cf5.m mVar4 = new cf5.m();
                qud.c cVar4 = dVar.f3892a;
                cf5.j jVar = new cf5.j(mVar4, new cf5.i(cVar4.f249364b.h(), new cf5.a(), dVar.f3893b.a()));
                cf5.a currencyAccentColorMapper = new cf5.a();
                cf5.m stakeableAssetListModifier = new cf5.m();
                Intrinsics.checkNotNullParameter(currencyAccentColorMapper, "currencyAccentColorMapper");
                Intrinsics.checkNotNullParameter(stakeableAssetListModifier, "stakeableAssetListModifier");
                ef5.k kVar2 = new ef5.k(jVar, new cf5.c(), new cf5.g(cVar4.f249364b.h()), new cf5.n());
                af5.d dVar2 = (af5.d) this.f301b;
                p pVarA = dVar2.a();
                mu5.f fVarD = dVar2.f3895g.d();
                qud.c cVar5 = dVar2.f3892a;
                yud.g gVarD = cVar5.d();
                df5.b bVar7 = new df5.b(dVar2.f.e(), 0);
                gud.b bVarA = dVar2.f3896h.a();
                gud.a aVar = new gud.a();
                gud.c cVar6 = new gud.c();
                sh5.d dVarF = dVar2.i.f();
                s.j(dVarF);
                return new com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.a(kVar2, pVarA, fVarD, gVarD, bVar7, bVarA, aVar, cVar6, dVarF, cVar5.f());
            case 5:
                EsimGetPlanFlowContract$InputData esimGetPlanFlowContract$InputData = ((afj.j) this.f302c).f4293a;
                afj.b bVar8 = (afj.b) this.f301b;
                w wVar = (w) bVar8.f4135h0.get();
                gte.a aVarB = bVar8.f4120a.b();
                s.j(aVarB);
                return new com.revolut.retail.feature.esim.impl.ui.flows.get_plan.c(esimGetPlanFlowContract$InputData, wVar, aVarB, (cej.b) bVar8.X.get(), (z2) bVar8.Q0.get());
            case 6:
                EsimHelpFlowContract$InputData esimHelpFlowContract$InputData = ((afj.l) this.f302c).f4321a;
                gte.a aVarB2 = ((afj.b) this.f301b).f4120a.b();
                s.j(aVarB2);
                return new com.revolut.retail.feature.esim.impl.ui.flows.help.a(esimHelpFlowContract$InputData, aVarB2);
            case 7:
                t tVar = (t) this.f302c;
                o oVar = new o(tVar.f4445a, new zkj.c(new alj.a(), afj.b.b()), new alj.a());
                EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData esimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData = tVar.f4445a;
                afj.b bVar9 = (afj.b) this.f301b;
                return new vkj.n(oVar, esimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData, (q1) bVar9.f4130e1.get(), new alj.a(), new zkj.a(), new skj.a(), ((s41.a) bVar9.f4164w).d());
            case 8:
                z zVar = (z) this.f302c;
                EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData = zVar.f4544a;
                z80.b bVarS = zVar.f4545b.f4150p.s();
                s.j(bVarS);
                qhj.e eVar4 = new qhj.e(bVarS, 1);
                afj.b bVar10 = (afj.b) this.f301b;
                z0 z0Var = (z0) bVar10.G.get();
                gte.a aVarB3 = bVar10.f4120a.b();
                s.j(aVarB3);
                return new com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.b(esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData, eVar4, z0Var, aVarB3);
            case 9:
                b0 b0Var = (b0) this.f302c;
                EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData = b0Var.f4169a;
                z80.b bVarS2 = b0Var.f4170b.f4150p.s();
                s.j(bVarS2);
                qhj.e eVar5 = new qhj.e(bVarS2, 1);
                afj.b bVar11 = (afj.b) this.f301b;
                z0 z0Var2 = (z0) bVar11.G.get();
                gte.a aVarB4 = bVar11.f4120a.b();
                s.j(aVarB4);
                return new com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.b(esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData, eVar5, z0Var2, aVarB4);
            case 10:
                c0 c0Var = (c0) this.f302c;
                EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData = c0Var.f4185a;
                afj.b bVar12 = (afj.b) this.f301b;
                z0 z0Var3 = (z0) bVar12.G.get();
                z80.b bVarS3 = c0Var.f4186b.f4150p.s();
                s.j(bVarS3);
                qhj.e eVar6 = new qhj.e(bVarS3, 1);
                gte.a aVarB5 = bVar12.f4120a.b();
                s.j(aVarB5);
                return new com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b(esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData, z0Var3, eVar6, aVarB5, (q1) bVar12.f4130e1.get());
            case 11:
                e0 e0Var = (e0) this.f302c;
                EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData = e0Var.f4217a;
                z80.b bVarS4 = e0Var.f4218b.f4150p.s();
                s.j(bVarS4);
                qhj.e eVar7 = new qhj.e(bVarS4, 1);
                afj.b bVar13 = (afj.b) this.f301b;
                z0 z0Var4 = (z0) bVar13.G.get();
                gte.a aVarB6 = bVar13.f4120a.b();
                s.j(aVarB6);
                return new com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.b(esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData, eVar7, z0Var4, aVarB6);
            case 12:
                n0 n0Var = (n0) this.f302c;
                EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData = n0Var.f4354a;
                z80.b bVarS5 = n0Var.f4355b.f4150p.s();
                s.j(bVarS5);
                qhj.e eVar8 = new qhj.e(bVarS5, 1);
                afj.b bVar14 = (afj.b) this.f301b;
                z0 z0Var5 = (z0) bVar14.G.get();
                gte.a aVarB7 = bVar14.f4120a.b();
                s.j(aVarB7);
                return new com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.b(esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData, eVar8, z0Var5, aVarB7);
            case 13:
                return new com.revolut.retail.feature.esim.impl.ui.flows.share_qr_code.b(((v0) this.f302c).f4491a, (z2) ((afj.b) this.f301b).Q0.get());
            case 14:
                ProductMigrationFlowContract$InputData productMigrationFlowContract$InputData = ((anb.i) this.f302c).f6646a;
                til.m mVarA = ((anb.n) this.f301b).C.a();
                s.j(mVarA);
                return new com.revolut.feature.retail.savings.impl.ui.product_migration.flow.a(productMigrationFlowContract$InputData, mVarA);
            case 15:
                SavingsAddMoneyFlowContract$InputData savingsAddMoneyFlowContract$InputData = ((anb.m) this.f302c).f6660a;
                anb.n nVar2 = (anb.n) this.f301b;
                anb.s sVar = nVar2.i;
                djb.n nVarA = sVar.a();
                s.j(nVarA);
                u uVarD = sVar.d();
                s.j(uVarD);
                gob.h hVarB = nVar2.b();
                Context context = nVar2.f6662a;
                anb.b0.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                zfe.g.Companion.getClass();
                return new com.revolut.feature.retail.savings.impl.ui.add_money.b(savingsAddMoneyFlowContract$InputData, nVarA, uVarD, hVarB, zfe.f.a(context));
            case 16:
                ao1.f fVar2 = (ao1.f) this.f302c;
                BPayReviewScreenContract$InputData bPayReviewScreenContract$InputData = fVar2.f7885a;
                ao1.d dVar3 = (ao1.d) this.f301b;
                q12.a aVarG = dVar3.d.g();
                s.j(aVarG);
                xn1.b bVar15 = (xn1.b) dVar3.f7881s.get();
                l80.e eVarH3 = dVar3.e.h();
                s.j(eVarH3);
                wj0.a aVarI = ((nj0.d) dVar3.f7871c).i();
                s.j(aVarI);
                ao1.d dVar4 = fVar2.f7886b;
                zof.f fVarD2 = dVar4.f7873h.d();
                s.j(fVarD2);
                zjh.i iVar = new zjh.i(fVarD2);
                ko1.b bVar16 = new ko1.b();
                co9.b bVarB = dVar3.f7870b.b();
                s.j(bVarB);
                xua.a aVarA = dVar3.f7875l.a();
                s.j(aVarA);
                qpk.b bVar17 = new qpk.b();
                yof.k kVarG = dVar4.f7873h.g();
                s.j(kVarG);
                return new com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a(bPayReviewScreenContract$InputData, aVarG, bVar15, eVarH3, aVarI, iVar, bVar16, bVarB, aVarA, bVar17, new q(kVarG, new uo1.a(), new uo1.b(), new uo1.c()));
            case 17:
                ap3.c cVar7 = (ap3.c) this.f302c;
                CorporateEventDetailsContract$InputData corporateEventDetailsContract$InputData = cVar7.f8062a;
                ap3.h hVar3 = (ap3.h) this.f301b;
                yhl.d dVarA = hVar3.f8089c.a();
                s.j(dVarA);
                zdl.c cVar8 = hVar3.d;
                ybl.b bVarB2 = cVar8.b();
                s.j(bVarB2);
                ybl.b bVarB3 = cVar8.b();
                s.j(bVarB3);
                fkg.a aVar2 = new fkg.a(bVarB3);
                h8b.c cVarB = hVar3.b();
                f80.a aVarX2 = hVar3.e.x();
                s.j(aVarX2);
                return new com.revolut.feature.corporate_events.impl.ui.screen.details.a(corporateEventDetailsContract$InputData, dVarA, bVarB2, aVar2, cVarB, aVarX2, new r(cVar7.f8063b.b()));
            case 18:
                CryptoOrderDetailsPagerFlowContract$InputData cryptoOrderDetailsPagerFlowContract$InputData = ((ayh.c) this.f302c).f11203a;
                ayh.b bVar18 = (ayh.b) this.f301b;
                p0i.b bVarE = bVar18.e.e();
                s.j(bVarE);
                xua.a aVarA2 = bVar18.f11194b.a();
                s.j(aVarA2);
                t70.b bVarG = bVar18.o.g();
                s.j(bVarG);
                return new com.revolut.feature_crypto_order_details.impl.ui.pager.a(cryptoOrderDetailsPagerFlowContract$InputData, bVarE, aVarA2, bVarG, new hyh.g());
            case 19:
                return new e4j.c(((b3j.t) this.f301b).f12101l.a(), ((b3j.u) this.f302c).f12110a, new e4j.d());
            case 20:
                b6b.l lVar = (b6b.l) this.f302c;
                b6b.o oVar2 = lVar.f12634b;
                a3e.u uVar = new a3e.u(new a7b.b(new c7b.a(oVar2.d.g(), 0), new r6b.a(new nd7.d(new nd7.c())), new CobrandedCardsCardFeesItemMapper()));
                CobrandedCardsAdditionalValueScreenContract$InputData cobrandedCardsAdditionalValueScreenContract$InputData = lVar.f12633a;
                b6b.o oVar3 = (b6b.o) this.f301b;
                c6b.f fVar3 = (c6b.f) oVar3.f12651b.G.get();
                s.j(fVar3);
                x xVarD = ((s41.a) oVar3.f12653g).d();
                c7b.b bVar19 = new c7b.b();
                v vVar = new v(new c7b.a(oVar2.d.g(), 0));
                q5b.b bVarB4 = oVar2.f12651b.b();
                s.j(bVarB4);
                return new com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c(uVar, cobrandedCardsAdditionalValueScreenContract$InputData, fVar3, xVarD, bVar19, vVar, new r10.f(bVarB4, oVar2.e.a()));
            case 21:
                return new ca.d((aa.c) ((ba.a) this.f301b).f13855c.get(), new by5.a(6), ((ba.b) this.f302c).f13856a);
            case 22:
                InfoSheetFlowContract$InputData infoSheetFlowContract$InputData = ((blb.a) this.f302c).f16491a;
                ccd.a aVar3 = (ccd.a) ((xbd.b) ((blb.e) this.f301b).f16504c).o.get();
                s.j(aVar3);
                return new com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.flow.a(infoSheetFlowContract$InputData, aVar3);
            case 23:
                SavingsInterestRateExplanationContract$InputData savingsInterestRateExplanationContract$InputData = ((blb.f) this.f302c).f16516a;
                blb.e eVar9 = (blb.e) this.f301b;
                f80.a aVarX3 = eVar9.f16506h.x();
                s.j(aVarX3);
                x xVarD2 = ((s41.a) eVar9.f16507j).d();
                dcd.b formatter = new dcd.b();
                qlb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(formatter, "formatter");
                return new com.revolut.feature.retail.savings.impl.core.product.presentation.rate_explanation.a(savingsInterestRateExplanationContract$InputData, aVarX3, xVarD2, new plb.f(new plb.h(formatter)));
            case 24:
                bt6.b bVar20 = (bt6.b) this.f301b;
                zjh.i iVarE = bVar20.e();
                wj0.a aVarI2 = ((nj0.d) bVar20.f18299j).i();
                s.j(aVarI2);
                ppg.b bVarB5 = ((wpg.l) bVar20.f18297g).b();
                s.j(bVarB5);
                return new com.revolut.feature.freelancer.impl.ui.subaccount.create.flow.a(iVarE, aVarI2, bVarB5, ((bt6.a) this.f302c).f18288a);
            case 25:
                zjh.j jVar2 = new zjh.j((y3) ((bt6.b) this.f301b).D.get());
                l80.e eVarH4 = ((bt6.h) this.f302c).f18349a.i.h();
                s.j(eVarH4);
                return new com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a(jVar2, new g57.r(new d57.a(eVarH4), new d57.c()));
            case 26:
                bt6.b bVar21 = (bt6.b) this.f301b;
                gr6.e eVarA3 = bVar21.f18294a.a();
                s.j(eVarA3);
                bt6.l lVar2 = (bt6.l) this.f302c;
                return new com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.c(eVarA3, lVar2.f18360a, lVar2.f18361b, bVar21.a(), bVar21.f18301m.e());
            case 27:
                bt6.b bVar22 = (bt6.b) this.f301b;
                d3j.b bVarE2 = ((b3j.p) bVar22.o).e();
                bt6.m mVar5 = (bt6.m) this.f302c;
                TaxHubPaymentAssessmentScreenContract$InputData taxHubPaymentAssessmentScreenContract$InputData = mVar5.f18363a;
                zjh.f fVarB = bVar22.b();
                ang.f fVarE2 = bVar22.f18301m.e();
                f80.a aVarX4 = mVar5.f18364b.i.x();
                s.j(aVarX4);
                return new com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b(bVarE2, taxHubPaymentAssessmentScreenContract$InputData, fVarB, fVarE2, new k37.x(new m37.g(aVarX4)));
            case 28:
                bt6.n nVar3 = (bt6.n) this.f302c;
                bt6.b bVar23 = nVar3.f18367b;
                gr6.m mVarB = bVar23.f18302n.b();
                s.j(mVarB);
                ppg.b bVarB6 = ((wpg.l) bVar23.f18297g).b();
                s.j(bVarB6);
                kgm.i iVar2 = new kgm.i(mVarB, bVarB6);
                gr6.m mVarB2 = ((bt6.b) this.f301b).f18302n.b();
                s.j(mVarB2);
                return new com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow.d(iVar2, mVarB2, nVar3.f18366a);
            default:
                return new com.revolut.feature.freelancer.impl.ui.tax_hub.profile.flow.b(((bt6.q) this.f302c).f18373a, ((bt6.b) this.f301b).a());
        }
    }
}
