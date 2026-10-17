package q43;

import com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.EnrollmentListScreen;
import com.revolut.feature.apm.qvik.impl.ui.home.area.QvikHomeAreaScreen;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.SelectorScreen;
import com.revolut.feature.card_screen.api.navigation.CardsListFeatureConfig;
import com.revolut.feature.cash_topup.impl.ui.select_store.CashTopUpSelectStoreScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.OutstandingDebtsFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.evidence_holder_selection.EvidenceHolderSelectionScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentController;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectautopay.LoanSelectAutopayScreen;
import com.revolut.feature.crypto.documents.impl.ui.crypto_documents_screen.CryptoDocumentsScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.transactions.CharityTransactionsScreen;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.search.PaymentsSearchScreen;
import com.revolut.feature.retail.restaurants.impl.ui.reservationdetails.ReservationDetailsScreen;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.list.RevolutPayPromotedMerchantsController;
import com.revolut.feature.shared.branding.impl.ui.preview.PaymentLinkPreviewScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.quick_help.all.QuickHelpSeeAllScreen;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.WealthMarginMinimumRequirementScreen;
import com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.TransactionCountriesScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.crypto.newlyadded.impl.ui.controller.NewlyAddedCryptoController;
import com.revolut.retail.feature.plan_rewards.impl.presentation.monthly_draw_hub.screen.MonthlyDrawHubScreen;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import n8i.b1;
import nii.k1;
import nii.n1;
import qc3.g;
import qc4.e;
import qdk.w0;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m((SelectorScreen) this.v, continuation, 0);
            case 1:
                return new m((PaymentsSearchScreen) this.v, continuation, 1);
            case 2:
                return new m((q4h.d) this.v, continuation, 2);
            case 3:
                return new m((q53.c) this.v, continuation, 3);
            case 4:
                return new m((PaymentLinkPreviewScreen) this.v, continuation, 4);
            case 5:
                return new m((WealthMarginMinimumRequirementScreen) this.v, continuation, 5);
            case 6:
                return new m((LoanPartialRepaymentController) this.v, continuation, 6);
            case 7:
                return new m((com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a) this.v, continuation, 7);
            case 8:
                return new m((q7c.q) this.v, continuation, 8);
            case 9:
                return new m((OutstandingDebtsFlowController) this.v, continuation, 9);
            case 10:
                return new m((LoanSelectAutopayScreen) this.v, continuation, 10);
            case 11:
                return new m((QuickHelpSeeAllScreen) this.v, continuation, 11);
            case 12:
                return new m((EnrollmentListScreen) this.v, continuation, 12);
            case 13:
                return new m((qac.i) this.v, continuation, 13);
            case 14:
                return new m((NewlyAddedCryptoController) this.v, continuation, 14);
            case 15:
                return new m((qb0.b) this.v, continuation, 15);
            case 16:
                return new m((EvidenceHolderSelectionScreen) this.v, continuation, 16);
            case 17:
                return new m((qb9.b) this.v, continuation, 17);
            case 18:
                return new m((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.a) this.v, continuation, 18);
            case 19:
                return new m((QvikHomeAreaScreen) this.v, continuation, 19);
            case 20:
                return new m((CashTopUpSelectStoreScreen) this.v, continuation, 20);
            case 21:
                return new m((qc4.j) this.v, continuation, 21);
            case 22:
                return new m((CharityTransactionsScreen) this.v, continuation, 22);
            case 23:
                return new m((RevolutPayPromotedMerchantsController) this.v, continuation, 23);
            case 24:
                return new m((TransactionCountriesScreen) this.v, continuation, 24);
            case 25:
                return new m((qd8.f) this.v, continuation, 25);
            case 26:
                return new m((MonthlyDrawHubScreen) this.v, continuation, 26);
            case 27:
                return new m((CryptoDocumentsScreen) this.v, continuation, 27);
            case 28:
                return new m((ReservationDetailsScreen) this.v, continuation, 28);
            default:
                return new m((com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((m) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((m) create((dj0.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((m) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((m) create((rp0.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((m) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((m) create((rp0.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((m) create((tji.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((k1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v58, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v65, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o0) ((SelectorScreen) obj3).T2()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PaymentsSearchScreen) obj3).m2().onBackPressed();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q4h.d dVar = (q4h.d) obj3;
                dVar.X2(dVar.f242166p, new b1(dVar, 21));
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((q53.c) obj3).f242291c;
                uz5.a.INSTANCE.getClass();
                uz5.a aVar5 = (uz5.a) cVar.v0(uz5.a.f284591c, "KEY_SALES_TIPS_SETTINGS", wim.z.d(kotlin.jvm.internal.o0.b(uz5.a.class)));
                Intrinsics.checkNotNullParameter(aVar5, "<this>");
                break;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((q6d.d) ((PaymentLinkPreviewScreen) obj3).Y.getValue()).u2();
                break;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a) ((WealthMarginMinimumRequirementScreen) obj3).d()).B2();
                break;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((LoanPartialRepaymentController) obj3).m2().onBackPressed();
                break;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a aVar10 = (com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a) obj3;
                aVar10.H2(aVar10.f70503y, new q75.n(1));
                break;
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j60.a.v(((com.revolut.feature.credit.application.plugins.impl.ui.debts.c) ((q84.d) ((OutstandingDebtsFlowController) obj3).P.getValue())).f67437t, false, null, 3);
                break;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((LoanSelectAutopayScreen) obj3).m2().onBackPressed();
                break;
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((q8d.p) ((QuickHelpSeeAllScreen) obj3).Z.getValue()).u2();
                break;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((EnrollmentListScreen) obj3).m2().onBackPressed();
                break;
            case 13:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((qac.i) obj3).d, "TRACKING_WIDGET_TIP_DISMISSED_KEY", Boolean.TRUE);
                break;
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((qaj.g) ((NewlyAddedCryptoController) obj3).R2()).B2();
                break;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qb0.b bVar = (qb0.b) obj3;
                bVar.T2(new xa0.a(bVar, continuation, i2), new yi5.b(27));
                break;
            case 16:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((qb4.h) ((EvidenceHolderSelectionScreen) obj3).O.getValue()).C2(qb4.d.f244111a);
                break;
            case 17:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ib9.g gVar = (ib9.g) j6.a.k(ib9.g.class, ((qb9.b) obj3).f244138c, "onboarding_countries_storage_key");
                if (gVar != null) {
                }
                break;
            case 18:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.a) obj3).B2();
                break;
            case 19:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((QvikHomeAreaScreen) obj3).m2().onBackPressed();
                break;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((qc3.k) ((qc3.i) ((CashTopUpSelectStoreScreen) obj3).Q.getValue())).C2(g.a.f244543a);
                break;
            case 21:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((qc4.j) obj3).C2(e.a.f244556a);
                break;
            case 22:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((qc6.j) ((qc6.b) ((CharityTransactionsScreen) obj3).M.getValue())).B2();
                break;
            case 23:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((RevolutPayPromotedMerchantsController) obj3).m2().onBackPressed();
                break;
            case 24:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.a) ((TransactionCountriesScreen) obj3).R2()).B2();
                break;
            case 25:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((qd8.f) obj3).B2();
                break;
            case 26:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((w0) ((MonthlyDrawHubScreen) obj3).d()).C2(qdk.c0.f244959a);
                break;
            case 27:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((CryptoDocumentsScreen) obj3).m2().onBackPressed();
                break;
            case 28:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.retail.restaurants.impl.ui.reservationdetails.a) ((ReservationDetailsScreen) obj3).R2()).B2();
                break;
            default:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a aVar33 = (com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a) obj3;
                aVar33.f89442w.getClass();
                aVar33.C1(u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new CardsListFeatureConfig.CardsList(null)))));
                break;
        }
        return Unit.f186387a;
    }
}
