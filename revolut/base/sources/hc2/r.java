package hc2;

import android.content.Context;
import com.revolut.feature.apm.bills.postal_check.api.navigation.PostalCheckNavigation$InputData;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.entry.MultibancoExternalEnrollmentEntryScreenContract$InputData;
import com.revolut.feature.apm.multibanco.impl.ui.home.MultibancoHomeFlowContract$InputData;
import com.revolut.feature.apm.multibanco.impl.ui.registration.MultibancoRegistrationFlowContract$InputData;
import com.revolut.feature.apm.upi.impl.flow.intent_payment.UpiIntentPaymentFlowContract$InputData;
import com.revolut.feature.crypto.locked.balance.api.navigation.CryptoBalanceBreakdownInputData;
import com.revolut.feature.html_viewer.impl.screen.HtmlViewerScreenContract$InputData;
import com.revolut.feature.payees.impl.ui.payees_confirmation_bottom_sheet.PayeesConfirmationBottomSheetScreenContract$InputData;
import com.revolut.feature.product_article.impl.ui.screen.details.ProductArticleDetailsControllerContract$InputData;
import com.revolut.feature.referrals.code.impl.referral_code.screen.ReferralCodeContract$InputData;
import com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.RevPointsGiftcardsHomePagerFlowContract$InputData;
import com.revolut.feature.subscriptions.impl.block_future_payments.BlockFuturePaymentsFlowContract$InputData;
import com.revolut.feature.subscriptions.impl.history.kompot.SubscriptionHistoryControllerContract$InputData;
import com.revolut.feature.subscriptions.impl.label.SubscriptionLabelScreenContract$InputData;
import com.revolut.feature.subscriptions.impl.list.CardSubscriptionListScreenContract$InputData;
import com.revolut.feature.tax_residency.impl.flows.edit.EditTaxResidenciesFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.TaxResidencyFlowContract$InputData;
import com.revolut.feature.transaction_details_pager.impl.ui.flow.TransactionDetailsPagerFlowContract$InputData;
import com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.TravelHotelTransfersHomeScreenContract$InputData;
import com.revolut.otp.input.flow.code.OtpCodeInputScreenContract$InputData;
import com.revolut.otp.input.flow.email.OtpEmailScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import no.j2;
import nyb.m0;
import pni.y;
import tnb.g0;
import xka.b0;
import xka.z;

/* JADX INFO: loaded from: classes20.dex */
public final class r implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f150827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qji.b f150828c;

    public /* synthetic */ r(Object obj2, qji.b bVar, int i) {
        this.f150826a = i;
        this.f150827b = obj2;
        this.f150828c = bVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f150826a) {
            case 0:
                sc2.c cVar = ((s) this.f150828c).f150829a;
                m mVar = (m) this.f150827b;
                cc2.a aVar = (cc2.a) mVar.d.e.get();
                vc.s.j(aVar);
                return new com.revolut.feature.apm.qvik.impl.ui.new_recipient.a(cVar, aVar, new mc2.g((c12.f) mVar.o.get()), b3j.p.f(), mVar.i.g());
            case 1:
                TransactionDetailsPagerFlowContract$InputData transactionDetailsPagerFlowContract$InputData = ((hgf.b) this.f150828c).f152178a;
                hgf.a aVar2 = (hgf.a) this.f150827b;
                return new igf.g(transactionDetailsPagerFlowContract$InputData, aVar2.f152175a.d(), aVar2.f152176b.b(), new igf.h());
            case 2:
                CryptoBalanceBreakdownInputData cryptoBalanceBreakdownInputData = ((hh5.a) this.f150828c).f152252a;
                oh5.d dVar = (oh5.d) ((hh5.b) this.f150827b).f152254a.e.get();
                vc.s.j(dVar);
                return new com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.a(cryptoBalanceBreakdownInputData, dVar, new ih5.d(cryptoBalanceBreakdownInputData));
            case 3:
                hm9.a aVar3 = (hm9.a) this.f150828c;
                dl3.f fVarC = aVar3.f153543b.f153547c.c();
                vc.s.j(fVarC);
                um9.l lVar = new um9.l(new km9.d(fVarC));
                um9.f fVar = aVar3.f153542a;
                lm9.a aVar4 = new lm9.a();
                jq8.a aVar5 = ((hm9.b) this.f150827b).f153548g;
                return new com.revolut.feature.payees.impl.ui.payees_overview.junior.a(lVar, fVar, aVar4, new ogm.i((wq8.c) ((oq8.a) aVar5).o.get()), ((oq8.a) aVar5).b());
            case 4:
                nm9.n nVar = new nm9.n();
                hm9.c cVar2 = (hm9.c) this.f150828c;
                PayeesConfirmationBottomSheetScreenContract$InputData payeesConfirmationBottomSheetScreenContract$InputData = cVar2.f153551a;
                hm9.b bVar = cVar2.f153552b;
                d3a.b bVarA = ((s3a.k) bVar.d).a();
                vc.s.j(bVarA);
                xx9.p pVarB = bVar.e.b();
                vc.s.j(pVarB);
                ay9.a aVarA = bVar.f.a();
                vc.s.j(aVarA);
                f4h.a aVar6 = new f4h.a(((oq8.a) bVar.f153548g).b());
                n8b.a aVarA2 = bVar.f153549h.a();
                vc.s.j(aVarA2);
                im9.i iVar = new im9.i(bVarA, pVarB, aVarA, aVar6, aVarA2);
                ay9.a aVarA3 = ((hm9.b) this.f150827b).f.a();
                vc.s.j(aVarA3);
                return new nm9.m(nVar, payeesConfirmationBottomSheetScreenContract$InputData, iVar, aVarA3);
            case 5:
                com.revolut.feature.payees.impl.ui.payees_overview.flow.d dVar2 = new com.revolut.feature.payees.impl.ui.payees_overview.flow.d();
                sm9.d dVar3 = ((hm9.g) this.f150828c).f153562a;
                mj8.b bVar2 = ((hm9.b) this.f150827b).i;
                return new com.revolut.feature.payees.impl.ui.payees_overview.flow.c(dVar2, dVar3, new k18.c((hj8.a) bVar2.f205950m.get(), bVar2.f205946g.a(), bVar2.f205947h.b()));
            case 6:
                kwa.j jVar = new kwa.j();
                ReferralCodeContract$InputData referralCodeContract$InputData = ((hwa.b) this.f150828c).f156114a;
                yva.a aVarA4 = ((hwa.a) this.f150827b).f156112a.a();
                vc.s.j(aVarA4);
                return new kwa.i(jVar, referralCodeContract$InputData, aVarA4);
            case 7:
                MultibancoExternalEnrollmentEntryScreenContract$InputData multibancoExternalEnrollmentEntryScreenContract$InputData = ((i72.o) this.f150828c).f159145a;
                i72.m mVar2 = (i72.m) this.f150827b;
                return new w72.j(multibancoExternalEnrollmentEntryScreenContract$InputData, (l72.e) mVar2.E.get(), (l72.c) mVar2.I.get());
            case 8:
                return new com.revolut.feature.apm.multibanco.impl.ui.enrollment.d(((i72.p) this.f150828c).f159147a, new y72.a(), (l72.c) ((i72.m) this.f150827b).I.get());
            case 9:
                MultibancoHomeFlowContract$InputData multibancoHomeFlowContract$InputData = ((i72.s) this.f150828c).f159161a;
                lx1.d dVarB = ((ey1.e) ((i72.m) this.f150827b).f).b();
                vc.s.j(dVarB);
                return new com.revolut.feature.apm.multibanco.impl.ui.home.a(multibancoHomeFlowContract$InputData, dVarB);
            case 10:
                return new com.revolut.feature.apm.multibanco.impl.ui.pay.a(((i72.t) this.f150828c).f159164a, (m72.a) ((i72.m) this.f150827b).G.get(), new x62.a());
            case 11:
                MultibancoRegistrationFlowContract$InputData multibancoRegistrationFlowContract$InputData = ((i72.v) this.f150828c).f159170a;
                i72.m mVar3 = (i72.m) this.f150827b;
                l72.c cVar3 = (l72.c) mVar3.I.get();
                pre.c cVarA = mVar3.f159131n.a();
                vc.s.j(cVarA);
                wj0.a aVarI = ((nj0.d) mVar3.o).i();
                vc.s.j(aVarI);
                return new com.revolut.feature.apm.multibanco.impl.ui.registration.a(multibancoRegistrationFlowContract$InputData, cVar3, cVarA, aVarI);
            case 12:
                i8g.b bVar3 = (i8g.b) this.f150828c;
                TravelHotelTransfersHomeScreenContract$InputData travelHotelTransfersHomeScreenContract$InputData = bVar3.f159528a;
                k8g.a aVar7 = new k8g.a();
                fub.k kVarD = bVar3.f159529b.f159526b.d();
                vc.s.j(kVarD);
                k8g.u uVar = new k8g.u(travelHotelTransfersHomeScreenContract$InputData, aVar7, kVarD);
                i8g.a aVar8 = (i8g.a) this.f150827b;
                t1f.h hVar = aVar8.f159527c;
                tsk.t tVarA = hVar.a();
                qr0.i iVarC = hVar.c();
                g0 g0Var = new g0(new k1f.k((ue0.c) hVar.C.get()));
                a29.b bVarA2 = aVar8.d.a();
                vc.s.j(bVarA2);
                m0 m0VarG = aVar8.e.g();
                vc.s.j(m0VarG);
                return new com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a(uVar, tVarA, iVarC, g0Var, bVarA2, m0VarG);
            case 13:
                BlockFuturePaymentsFlowContract$InputData blockFuturePaymentsFlowContract$InputData = ((i9e.i) this.f150828c).f159681a;
                c9e.c cVarB = ((i9e.o) this.f150827b).f159704c.b();
                vc.s.j(cVarB);
                return new com.revolut.feature.subscriptions.impl.block_future_payments.a(blockFuturePaymentsFlowContract$InputData, cVarB);
            case 14:
                i9e.s sVar = (i9e.s) this.f150828c;
                SubscriptionHistoryControllerContract$InputData subscriptionHistoryControllerContract$InputData = sVar.f159742a;
                thf.l lVarF = sVar.f159743b.f159708l.f();
                vc.s.j(lVarF);
                hae.n nVar2 = new hae.n(lVarF);
                i9e.o oVar = (i9e.o) this.f150827b;
                xua.a aVarA5 = oVar.f159703b.a();
                vc.s.j(aVarA5);
                whf.b bVarA3 = oVar.f159708l.a();
                vc.s.j(bVarA3);
                s71.c cVar4 = new s71.c();
                i9e.c cVar5 = (i9e.c) oVar.f159704c.f303681y.get();
                vc.s.j(cVar5);
                return new hae.l(subscriptionHistoryControllerContract$InputData, nVar2, aVarA5, bVarA3, cVar4, cVar5);
            case 15:
                SubscriptionLabelScreenContract$InputData subscriptionLabelScreenContract$InputData = ((i9e.t) this.f150828c).f159745a;
                kae.j jVar2 = new kae.j(subscriptionLabelScreenContract$InputData);
                xua.a aVarA6 = ((i9e.o) this.f150827b).f159703b.a();
                vc.s.j(aVarA6);
                return new kae.i(jVar2, subscriptionLabelScreenContract$InputData, aVarA6);
            case 16:
                i9e.u uVar2 = (i9e.u) this.f150828c;
                i9e.o oVar2 = uVar2.f159749c.f159753b;
                mae.p factory = oVar2.f159704c.e();
                vc.s.j(factory);
                f01.c uiKitResources = oVar2.d.g();
                t70.b currenciesLocalization = oVar2.e.g();
                vc.s.j(currenciesLocalization);
                dae.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
                mae.o oVarD = factory.d(uiKitResources, currenciesLocalization);
                m93.d dVarF = uVar2.f159748b.f.f();
                vc.s.j(dVarF);
                lae.r rVar = new lae.r(oVarD, dVarF, uVar2.f159747a);
                CardSubscriptionListScreenContract$InputData cardSubscriptionListScreenContract$InputData = uVar2.f159747a;
                i9e.o oVar3 = (i9e.o) this.f150827b;
                xua.a aVarA7 = oVar3.f159703b.a();
                vc.s.j(aVarA7);
                l93.f fVarJ = oVar3.f.j();
                vc.s.j(fVarJ);
                g6e.d dVarB2 = oVar3.f159705g.b();
                vc.s.j(dVarB2);
                c9e.c cVarB2 = oVar3.f159704c.b();
                vc.s.j(cVarB2);
                return new lae.n(rVar, cardSubscriptionListScreenContract$InputData, aVarA7, fVarJ, dVarB2, cVarB2);
            case 17:
                jd7.m mVar4 = new jd7.m();
                HtmlViewerScreenContract$InputData htmlViewerScreenContract$InputData = ((id7.b) this.f150828c).f160435a;
                id7.a aVar9 = (id7.a) this.f150827b;
                pre.c cVarA2 = aVar9.f160432a.a();
                vc.s.j(cVarA2);
                f80.a aVarX = aVar9.f160433b.x();
                vc.s.j(aVarX);
                return new jd7.l(mVar4, htmlViewerScreenContract$InputData, cVarA2, aVarX);
            case 18:
                UpiIntentPaymentFlowContract$InputData upiIntentPaymentFlowContract$InputData = ((if2.i) this.f150828c).f160872a;
                if2.f fVar2 = (if2.f) this.f150827b;
                b3a.a aVarA8 = fVar2.f160861q.a();
                vc.s.j(aVarA8);
                wj0.a aVarI2 = ((nj0.d) fVar2.e).i();
                vc.s.j(aVarI2);
                return new com.revolut.feature.apm.upi.impl.flow.intent_payment.a(upiIntentPaymentFlowContract$InputData, aVarA8, aVarI2);
            case 19:
                if2.k kVar = (if2.k) this.f150828c;
                return new com.revolut.feature.apm.upi.impl.flow.pending_payment.a(kVar.f160879a, kVar.b(), ((lz1.m) ((if2.f) this.f150827b).f160852b).g());
            case 20:
                ika.c cVar6 = (ika.c) this.f150828c;
                zka.h hVar2 = new zka.h();
                ika.b bVar4 = cVar6.f161927b;
                zka.c cVar7 = new zka.c(new zjh.i(bVar4.f.g()));
                zka.e eVar = new zka.e();
                zka.a aVar10 = new zka.a();
                zka.j jVar3 = new zka.j();
                zka.k kVar2 = new zka.k();
                zka.i iVar2 = new zka.i();
                zka.h heroItemMapper = new zka.h();
                Intrinsics.checkNotNullParameter(heroItemMapper, "heroItemMapper");
                zka.b bVar5 = new zka.b();
                zka.f fVar3 = new zka.f((fka.a) bVar4.i.get());
                zja.b bVar6 = (zja.b) bVar4.f161914b.e.get();
                vc.s.j(bVar6);
                b0 b0Var = new b0(hVar2, cVar7, eVar, aVar10, jVar3, kVar2, iVar2, bVar5, fVar3, bVar6);
                ProductArticleDetailsControllerContract$InputData productArticleDetailsControllerContract$InputData = cVar6.f161926a;
                ika.b bVar7 = (ika.b) this.f150827b;
                kka.a aVar11 = (kka.a) bVar7.f161924r.get();
                wli.x xVarD = ((s41.a) bVar7.f161916g).d();
                f80.a aVarX2 = bVar7.e.x();
                vc.s.j(aVarX2);
                fdb.b bVar8 = bVar7.f161914b;
                gdb.b bVar9 = (gdb.b) bVar8.d.get();
                vc.s.j(bVar9);
                xka.b bVar10 = new xka.b(cVar6.f161926a, (kka.a) bVar4.f161924r.get());
                zja.b bVar11 = (zja.b) bVar8.e.get();
                vc.s.j(bVar11);
                return new z(b0Var, productArticleDetailsControllerContract$InputData, aVar11, xVarD, aVarX2, bVar9, bVar10, bVar11);
            case 21:
                ika.d dVar4 = (ika.d) this.f150828c;
                return new wka.h(dVar4.f161929a, dVar4.f161930b.booleanValue(), dVar4.f161931c.booleanValue(), (kka.a) ((ika.b) this.f150827b).f161924r.get());
            case 22:
                return new com.revolut.feature.contacts_chooser.impl.bridge.b(((in3.f) this.f150828c).f162626a, (mn3.a) ((in3.e) this.f150827b).f162625j.get());
            case 23:
                EditTaxResidenciesFlowContract$InputData editTaxResidenciesFlowContract$InputData = ((ine.e) this.f150828c).f162847a;
                gte.a aVarB = ((ine.o) this.f150827b).e.b();
                vc.s.j(aVarB);
                return new com.revolut.feature.tax_residency.impl.flows.edit.a(editTaxResidenciesFlowContract$InputData, aVarB);
            case 24:
                ine.q qVar = (ine.q) this.f150828c;
                TaxResidencyFlowContract$InputData taxResidencyFlowContract$InputData = qVar.f162895a;
                ine.o oVar4 = qVar.f162896b;
                jpe.d dVar5 = new jpe.d((joe.b) oVar4.f162888p.get());
                jvh.a aVarA9 = ((ine.o) this.f150827b).k.a();
                vc.s.j(aVarA9);
                je0.d dVarB3 = oVar4.f162880b.b();
                vc.s.j(dVarB3);
                sf0.h hVarB = oVar4.f162883h.b();
                vc.s.j(hVarB);
                a61.a aVar12 = new a61.a(dVarB3, hVarB);
                v60.e eVarA = oVar4.f162882g.a();
                vc.s.j(eVarA);
                sf0.h hVarB2 = oVar4.f162883h.b();
                vc.s.j(hVarB2);
                return new com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a(taxResidencyFlowContract$InputData, dVar5, aVarA9, aVar12, new lpe.d(new e1l.a(hVarB2, eVarA)));
            case 25:
                ini.c cVar8 = (ini.c) this.f150828c;
                OtpCodeInputScreenContract$InputData otpCodeInputScreenContract$InputData = cVar8.f162958a;
                ini.f fVar4 = (ini.f) this.f150827b;
                mni.a aVar13 = (mni.a) fVar4.e.get();
                ji0.a aVarG = fVar4.f162965a.g();
                vc.s.j(aVarG);
                jni.v vVar = new jni.v(cVar8.f162958a);
                j2 j2VarH = fVar4.f162966b.h();
                vc.s.j(j2VarH);
                return new jni.s(otpCodeInputScreenContract$InputData, aVar13, aVarG, vVar, j2VarH);
            case 26:
                y yVar = new y();
                ini.e eVar2 = (ini.e) this.f150828c;
                OtpEmailScreenContract$InputData otpEmailScreenContract$InputData = eVar2.f162962a;
                mni.a aVar14 = (mni.a) ((ini.f) this.f150827b).e.get();
                Context context = eVar2.f162963b.f162967c;
                sni.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new pni.x(yVar, otpEmailScreenContract$InputData, aVar14, new iki.c(context));
            case 27:
                PostalCheckNavigation$InputData postalCheckNavigation$InputData = ((ir1.f) this.f150828c).f167971a;
                ir1.e eVar3 = (ir1.e) this.f150827b;
                zja.a aVarA10 = ((ika.b) eVar3.f167962a).a();
                vc.s.j(aVarA10);
                g12.l lVar2 = (g12.l) eVar3.o.get();
                kr1.g gVar = new kr1.g();
                jr1.e eVarA2 = eVar3.a();
                ir1.k.Companion.getClass();
                xi0.b.Companion.getClass();
                xi0.b bVar12 = xi0.b.o;
                vc.s.k(bVar12);
                return new com.revolut.feature.apm.bills.postal_check.impl.ui.b(postalCheckNavigation$InputData, aVarA10, lVar2, gVar, eVarA2, bVar12);
            case 28:
                com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.d dVar6 = new com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.d();
                RevPointsGiftcardsHomePagerFlowContract$InputData revPointsGiftcardsHomePagerFlowContract$InputData = ((iwb.h) this.f150828c).f169031a;
                iwb.e eVar4 = (iwb.e) this.f150827b;
                nyb.k kVarC = eVar4.d.c();
                vc.s.j(kVarC);
                ffk.t tVarF = eVar4.i.f();
                vc.s.j(tVarF);
                jwb.a aVar15 = (jwb.a) eVar4.f169015a.f169073s.get();
                vc.s.j(aVar15);
                zja.a aVarA11 = ((ika.b) eVar4.f169025q).a();
                vc.s.j(aVarA11);
                return new com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.c(dVar6, revPointsGiftcardsHomePagerFlowContract$InputData, kVarC, tVarF, aVar15, aVarA11);
            default:
                return new vv2.m(new vv2.n(), ((iwh.h) this.f150828c).f169103a, (rv2.a) ((iwh.c) this.f150827b).f169092g.get());
        }
    }
}
