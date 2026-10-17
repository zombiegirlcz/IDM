package ev7;

import c84.t;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.tax_rates.TaxRatesScreen;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.OrderNewCardFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.single_selection.SingleSelectionBottomSheetController;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.OfferContentScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.document.details.AllPolicyDocumentsScreen;
import com.revolut.feature.rev_points.impl.ui.challenges.home.RevPointsChallengesHomeScreen;
import com.revolut.feature.rev_points.impl.ui.wrapped.cards.RevPointsWrappedCardsScreen;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change.RevPointsSpareChangeFullBannerGridController;
import com.revolut.feature.security_hub.impl.ui.manage_merchants.ManageMerchantsScreen;
import com.revolut.feature.selfserve.entity.config.shared.ui.home.EntityHomeScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.faq_entries.FaqEntriesScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.UpcomingTransactionTroubleshooterScreen;
import com.revolut.feature.shared.invoices.impl.ui.language_selector.InvoiceLanguageSelectorScreen;
import com.revolut.feature.statements.impl.ui.documents_hub.product_selector.DocumentsHubProductSelectorScreen;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list.InboundTransactionListScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.compare.ManagedPortfoliosCompareController;
import com.revolut.feature.travel.flights.impl.ui.screen.self_transfer.TravelFlightsSelfTransferScreen;
import com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowController;
import com.revolut.feature.wealth.mutual_funds.impl.ui.mutual_fund_details.MutualFundDetailsScreen;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTimeSlot;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.time_slot_picker.AsftTimeSlotPickerScreen;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.time_picker.TravelItineraryTimePickerScreen;
import evc.n;
import ex2.l;
import f2c.p;
import f9d.m;
import fag.y;
import ff4.b0;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b((AllPolicyDocumentsScreen) this.v, continuation, 0);
            case 1:
                return new b((ManageMerchantsScreen) this.v, continuation, 1);
            case 2:
                return new b((AsftTimeSlotPickerScreen) this.v, continuation, 2);
            case 3:
                return new b((TravelItineraryTimePickerScreen) this.v, continuation, 3);
            case 4:
                return new b((com.revolut.feature.card_add_to_googlepay.impl.a) this.v, continuation, 4);
            case 5:
                return new b((ew6.g) this.v, continuation, 5);
            case 6:
                return new b((com.revolut.feature.topup_screen.impl.flow.external_card_details.e) this.v, continuation, 6);
            case 7:
                return new b((l) this.v, continuation, 7);
            case 8:
                return new b((com.revolut.feature.selfserve.entity.config.shared.ui.home.b) this.v, continuation, 8);
            case 9:
                return new b((RevPointsChallengesHomeScreen) this.v, continuation, 9);
            case 10:
                return new b((DocumentsHubProductSelectorScreen) this.v, continuation, 10);
            case 11:
                return new b((RevPointsWrappedCardsScreen) this.v, continuation, 11);
            case 12:
                return new b((OrderNewCardFlow) this.v, continuation, 12);
            case 13:
                return new b((RevPointsSpareChangeFullBannerGridController) this.v, continuation, 13);
            case 14:
                return new b((AssetSelectionFlowController) this.v, continuation, 14);
            case 15:
                return new b((ManagedPortfoliosCompareController) this.v, continuation, 15);
            case 16:
                return new b((com.revolut.feature.credit.application.plugins.impl.ui.consents.v1.a) this.v, continuation, 16);
            case 17:
                return new b((TravelFlightsSelfTransferScreen) this.v, continuation, 17);
            case 18:
                return new b((FaqEntriesScreen) this.v, continuation, 18);
            case 19:
                return new b((UpcomingTransactionTroubleshooterScreen) this.v, continuation, 19);
            case 20:
                return new b((com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.b) this.v, continuation, 20);
            case 21:
                return new b((fa7.e) this.v, continuation, 21);
            case 22:
                return new b((InvoiceLanguageSelectorScreen) this.v, continuation, 22);
            case 23:
                return new b((y) this.v, continuation, 23);
            case 24:
                return new b((com.revolut.feature.pix.impl.flow.refund.a) this.v, continuation, 24);
            case 25:
                return new b((SingleSelectionBottomSheetController) this.v, continuation, 25);
            case 26:
                return new b((InboundTransactionListScreen) this.v, continuation, 26);
            case 27:
                return new b((MutualFundDetailsScreen) this.v, continuation, 27);
            case 28:
                return new b((TaxRatesScreen) this.v, continuation, 28);
            default:
                return new b((OfferContentScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v58, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v72, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v80, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v84, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v88, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String f51434a;
        int i = this.u;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((AllPolicyDocumentsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((n) ((ManageMerchantsScreen) obj3).P.getValue()).B2();
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                evi.g gVar = (evi.g) ((AsftTimeSlotPickerScreen) obj3).Q.getValue();
                AsftTimeSlot asftTimeSlot = ((evi.d) ((j2) gVar.f129968s.f22677a).getValue()).f129961c;
                if (asftTimeSlot != null) {
                    gVar.C2(new evi.e(asftTimeSlot));
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                evj.i iVar = (evj.i) ((evj.c) ((TravelItineraryTimePickerScreen) obj3).Q.getValue());
                iVar.C2(new evj.b(((evj.a) ((j2) iVar.o.f22677a).getValue()).f129969a));
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.card_add_to_googlepay.impl.a aVar6 = (com.revolut.feature.card_add_to_googlepay.impl.a) obj3;
                aVar6.K2(aVar6.o.f64456c);
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ew6.g) obj3).u2();
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.D2(((com.revolut.feature.topup_screen.impl.flow.external_card_details.e) obj3).f90618x);
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) obj3;
                if (lVar.o.e) {
                    lVar.B2();
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.selfserve.entity.config.shared.ui.home.b bVar = (com.revolut.feature.selfserve.entity.config.shared.ui.home.b) obj3;
                if (bVar.o instanceof EntityHomeScreenContract$InputData.Params) {
                    bVar.K2();
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((RevPointsChallengesHomeScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((f0e.d) ((DocumentsHubProductSelectorScreen) obj3).Q.getValue()).B2();
                return Unit.f186387a;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((RevPointsWrappedCardsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 12:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((OrderNewCardFlow) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change.a aVar16 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change.a) ((RevPointsSpareChangeFullBannerGridController) obj3).e3();
                int i2 = p.f131507a[aVar16.o.f84141b.ordinal()];
                if (i2 == 1) {
                    aVar16.C2(RevPointsSpareChangeControllerApi$Result.Skipped.f84132a);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar16.B2();
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.wealth.asset.selection.impl.ui.flow.a aVar18 = (com.revolut.feature.wealth.asset.selection.impl.ui.flow.a) ((AssetSelectionFlowController) obj3).e3();
                e2h.b bVar2 = aVar18.f95397p;
                Iterable iterable = (Iterable) bVar2.f122098c.f290128a.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : iterable) {
                    if (((Set) bVar2.d.f290128a.getValue()).contains(((y1h.c) obj4).getId())) {
                        arrayList.add(obj4);
                    }
                }
                aVar18.C2(new y1h.d(d0.i1(arrayList)));
                return Unit.f186387a;
            case 15:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((f6f.d) ((ManagedPortfoliosCompareController) obj3).L.getValue()).B2();
                return Unit.f186387a;
            case 16:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                t.J2((com.revolut.feature.credit.application.plugins.impl.ui.consents.v1.a) obj3, false, null, null, 7);
                return Unit.f186387a;
            case 17:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((f7g.d) ((TravelFlightsSelfTransferScreen) obj3).N.getValue()).B2();
                return Unit.f186387a;
            case 18:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((FaqEntriesScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 19:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.b) ((m) ((UpcomingTransactionTroubleshooterScreen) obj3).i0.getValue())).u2();
                return Unit.f186387a;
            case 20:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.b bVar3 = (com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.b) obj3;
                FaqNodeBase faqNodeBase = bVar3.f86362r.f86357a;
                bVar3.v2((faqNodeBase == null || (f51434a = faqNodeBase.getF51434a()) == null) ? f9d.k.f132931a : new f9d.j(f51434a));
                return Unit.f186387a;
            case 21:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                fa7.e eVar = (fa7.e) obj3;
                ea7.b bVar4 = (ea7.b) wp5.y.t(ea7.b.class, eVar.f133247c, "PRODUCT_SUGGESTIONS_CACHE_KEY");
                return bVar4 != null ? fa7.e.a(eVar, bVar4) : r0.g();
            case 22:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((fad.g) ((InvoiceLanguageSelectorScreen) obj3).P.getValue()).B2();
                return Unit.f186387a;
            case 23:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((y) obj3).f133400a.G(Boolean.TRUE, "IS_DISCOVER_BANNER_CLOSED_KEY", Boolean.TYPE);
                return Unit.f186387a;
            case 24:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.D2(((com.revolut.feature.pix.impl.flow.refund.a) obj3).f80735p);
                return Unit.f186387a;
            case 25:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((fe4.j) ((SingleSelectionBottomSheetController) obj3).S.getValue()).I2(fe4.b.f134435a);
                return Unit.f186387a;
            case 26:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((fee.l) ((InboundTransactionListScreen) obj3).N.getValue()).B2();
                return Unit.f186387a;
            case 27:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((feh.m) ((feh.h) ((MutualFundDetailsScreen) obj3).S.getValue())).B2();
                return Unit.f186387a;
            case 28:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((TaxRatesScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((b0) ((OfferContentScreen) obj3).e3()).J2();
                return Unit.f186387a;
        }
    }
}
