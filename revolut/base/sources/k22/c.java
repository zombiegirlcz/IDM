package k22;

import aw0.n6;
import com.revolut.feature.apm.bills.billers.impl.ui.chooser.BillersChooserScreen;
import com.revolut.feature.apm.core.ui.impl.ui.entry.ApmEntryController;
import com.revolut.feature.apm.payid.impl.screen.area.AreaScreen;
import com.revolut.feature.cashback.impl.ui.pocket.details.CashbackPocketDetailsScreen;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.category.EvidenceCategorySelectionScreen;
import com.revolut.feature.crypto.account.impl.model.CryptoAccountDto;
import com.revolut.feature.crypto.locked.balance.impl.ui.excluded_locked_balances.ExcludedLockedBalancesScreen;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.DeFiRecoveryPhraseScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.consents.BrazilConsentsScreen;
import com.revolut.feature.junior.accounts.impl.ui.total_wealth.dialog.YouthTotalWealthInfoScreen;
import com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.feed.RevolutFeedScreen;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer.NewTransferScreen;
import com.revolut.feature.revolutpay.shared.ui.bottom_sheet.expandable_disclaimer.ExpandableDisclaimerBottomSheetController;
import com.revolut.feature.structured_note.details.impl.ui.screens.note_insights.NoteInsightsScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.transfer_review_submit.TransferReviewSubmitScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreen;
import com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.TravelHotelTransfersHomeScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.FundPerformanceScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.PlanSingleOfferScreen;
import d7c.k;
import e7c.q0;
import ggk.i0;
import ggk.l0;
import gim.i;
import k3g.l;
import k3g.n;
import k3g.o;
import k3k.t0;
import k3k.z;
import k4a.u;
import k5e.m;
import k64.h;
import k79.r;
import k7c.y0;
import kaf.g;
import kkf.q;
import km1.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mri.w;
import nii.n1;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c((ApmEntryController) this.v, continuation, 0);
            case 1:
                return new c((TravelExperiencesSearchScreen) this.v, continuation, 1);
            case 2:
                return new c((o) this.v, continuation, 2);
            case 3:
                return new c((t0) this.v, continuation, 3);
            case 4:
                return new c((NewTransferScreen) this.v, continuation, 4);
            case 5:
                return new c((NoteInsightsScreen) this.v, continuation, 5);
            case 6:
                return new c((h) this.v, continuation, 6);
            case 7:
                return new c((com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a) this.v, continuation, 7);
            case 8:
                return new c((DeFiRecoveryPhraseScreen) this.v, continuation, 8);
            case 9:
                return new c((RevolutFeedScreen) this.v, continuation, 9);
            case 10:
                return new c((y0) this.v, continuation, 10);
            case 11:
                return new c((YouthTotalWealthInfoScreen) this.v, continuation, 11);
            case 12:
                return new c((com.revolut.feature.shared.help_centre.impl.faq.screens.list.b) this.v, continuation, 12);
            case 13:
                return new c((TravelHotelTransfersHomeScreen) this.v, continuation, 13);
            case 14:
                return new c((AreaScreen) this.v, continuation, 14);
            case 15:
                return new c((TransferReviewSubmitScreen) this.v, continuation, 15);
            case 16:
                return new c((EvidenceCategorySelectionScreen) this.v, continuation, 16);
            case 17:
                return new c((kc5.b) this.v, continuation, 17);
            case 18:
                return new c((CashbackPocketDetailsScreen) this.v, continuation, 18);
            case 19:
                return new c((ExpandableDisclaimerBottomSheetController) this.v, continuation, 19);
            case 20:
                return new c((FundPerformanceScreen) this.v, continuation, 20);
            case 21:
                return new c((ExcludedLockedBalancesScreen) this.v, continuation, 21);
            case 22:
                return new c((com.revolut.feature.checkout.impl.resume.flow.a) this.v, continuation, 22);
            case 23:
                return new c((com.revolut.feature.rewards.impl.ui.details.flow.b) this.v, continuation, 23);
            case 24:
                return new c((BrazilConsentsScreen) this.v, continuation, 24);
            case 25:
                return new c((q) this.v, continuation, 25);
            case 26:
                return new c((EsimMobilePlanMyNumbersScreen) this.v, continuation, 26);
            case 27:
                return new c((BillersChooserScreen) this.v, continuation, 27);
            case 28:
                return new c((kmk.f) this.v, continuation, 28);
            default:
                return new c((PlanSingleOfferScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v70, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v80, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        i0 i0Var;
        l0 l0Var;
        int i = this.u;
        aii.q qVar = aii.q.f5292a;
        int i2 = 26;
        Continuation continuation = null;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((f) ((ApmEntryController) obj3).T.getValue()).B2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o) ((l) ((TravelExperiencesSearchScreen) obj3).g0.getValue())).u2();
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) obj3;
                return oVar.l2(new n(oVar, continuation, 0), new yi5.b(i2));
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((t0) obj3).v2(z.f180811a);
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) ((NewTransferScreen) obj3).d()).C2(qVar);
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((m) ((k5e.d) ((NoteInsightsScreen) obj3).O.getValue())).B2();
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVar = (h) obj3;
                w.r0(hVar.f181632g, ((CreditApplicationPluginFlowContract$Configuration) hVar.f.n0().get()).f66892b);
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a) obj3).u);
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.a aVar10 = (com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.a) ((k66.f) ((DeFiRecoveryPhraseScreen) obj3).L.getValue());
                aVar10.I2();
                aVar10.B2();
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((r) ((RevolutFeedScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q0 q0Var = (q0) j6.a.k(q0.class, ((y0) obj3).f182024c, "WRAPPED_SHIPPING_CONTACTS_LIST_STORAGE_CACHE_ID");
                if (q0Var != null) {
                    return k.b(q0Var);
                }
                return null;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((YouthTotalWealthInfoScreen) obj3).c3(qVar);
                return Unit.f186387a;
            case 12:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.shared.help_centre.impl.faq.screens.list.b) obj3).u2();
                return Unit.f186387a;
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a) ((TravelHotelTransfersHomeScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 14:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.apm.payid.impl.screen.area.c) ((AreaScreen) obj3).d()).I2(ka2.q.f182403a);
                return Unit.f186387a;
            case 15:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((g) ((TransferReviewSubmitScreen) obj3).R.getValue()).B2();
                return Unit.f186387a;
            case 16:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((EvidenceCategorySelectionScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 17:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                CryptoAccountDto cryptoAccountDto = (CryptoAccountDto) j6.a.k(CryptoAccountDto.class, ((kc5.b) obj3).f182664a, "CRYPTO_ACCOUNT_STORAGE_KEY");
                if (cryptoAccountDto != null) {
                    return x5d.b.r(cryptoAccountDto);
                }
                return null;
            case 18:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((CashbackPocketDetailsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 19:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ExpandableDisclaimerBottomSheetController) obj3).O.C2(kdc.b.f182867a);
                return Unit.f186387a;
            case 20:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.a) ((FundPerformanceScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 21:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((kh5.g) ((kh5.b) ((ExcludedLockedBalancesScreen) obj3).U.getValue())).B2();
                return Unit.f186387a;
            case 22:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.checkout.impl.resume.flow.a) obj3).f65842t);
                return Unit.f186387a;
            case 23:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.rewards.impl.ui.details.flow.b) obj3).D);
                return Unit.f186387a;
            case 24:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.external_accounts.impl.ui.brazil.consents.a) ((kj6.g) ((BrazilConsentsScreen) obj3).P.getValue())).B2();
                return Unit.f186387a;
            case 25:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((q) obj3).f184896n.k();
                return Unit.f186387a;
            case 26:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a) ((EsimMobilePlanMyNumbersScreen) obj3).d()).B2();
                return Unit.f186387a;
            case 27:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((j) ((km1.e) ((BillersChooserScreen) obj3).N.getValue())).B2();
                return Unit.f186387a;
            case 28:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                kmk.f fVar = (kmk.f) obj3;
                fVar.e3(kmk.a.RUNNING);
                return fVar.r2().M0(new oii.e(fVar.f185905m));
            default:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a aVar32 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a) ((PlanSingleOfferScreen) obj3).d();
                ggk.f fVarL2 = aVar32.L2();
                if (fVarL2 != null && (i0Var = fVarL2.f143712b) != null && (l0Var = i0Var.f143729a) != null) {
                    aVar32.l2(new kb7.c(aVar32, l0Var, continuation, i2), new yi5.b(i2));
                }
                return Unit.f186387a;
        }
    }
}
