package mta;

import aii.q;
import aw0.n6;
import com.revolut.feature.card.verification.impl.screen.transaction_code.TransactionCodeScreen;
import com.revolut.feature.credit.card.impl.ui.repay.spei_details.CreditCardRepaySpeiDetailsScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentslist.LoanRepaymentsListScreen;
import com.revolut.feature.crypto.exchange.fees.impl.model.CryptoExchangeFeesFacadeV2;
import com.revolut.feature.donations.impl.ui.kompot.flow.overview.CharitiesOverviewFlow;
import com.revolut.feature.junior_consent.impl.ui.screen.blank_card_delivery.JuniorBlankCardDeliveryConsentScreen;
import com.revolut.feature.learn.shared.impl.ui.home.LearnHomeScreen;
import com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.profile.ProfileScreen;
import com.revolut.feature.payments.splitbill.impl.ui.view_itemized_split_bill_lines.ViewItemizedSplitBillLinesController;
import com.revolut.feature.payments_migration.impl.ui.screen.payment_selection.PaymentSelectionController;
import com.revolut.feature.raffle.impl.screen.share_raffle.ShareRaffleScreen;
import com.revolut.feature.rev_points.impl.ui.learn.RevPointsLearnScreen;
import com.revolut.feature.rev_points.impl.ui.transactions.details.RevPointsTransactionDetailsScreen;
import com.revolut.feature.rev_points.models.SpareChangeRefundQuote;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.refund.RevPointsSpareChangeRefundController;
import com.revolut.feature.store.impl.ui.orders.see_all.StoreOrdersSeeAllScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_price_update.screens.assets_price_update.AssetsPriceUpdateScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.booking_details.TravelExperiencesBookingDetailsScreen;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.borrowing_interest.WealthMarginBorrowingInterestScreen;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.leaf.PriceTargetsFaqLeafScreen;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.TravelItineraryRemoveEventScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.TechnicalInsightsController;
import com.revolut.trading.orders.ui.invest.placement.security_asset_balance_breakdown.SecurityAssetBalanceBreakdownScreen;
import ip0.x60;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import l8a.z0;
import n09.m0;
import n5k.p;
import n8a.f0;
import nfj.y;
import nii.n1;
import vkm.j2;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
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
                return new c((ShareRaffleScreen) this.v, continuation, 0);
            case 1:
                return new c((CreditCardRepaySpeiDetailsScreen) this.v, continuation, 1);
            case 2:
                return new c((TechnicalInsightsController) this.v, continuation, 2);
            case 3:
                return new c((SecurityAssetBalanceBreakdownScreen) this.v, continuation, 3);
            case 4:
                return new c((TransactionCodeScreen) this.v, continuation, 4);
            case 5:
                return new c((TravelItineraryRemoveEventScreen) this.v, continuation, 5);
            case 6:
                return new c((RevPointsLearnScreen) this.v, continuation, 6);
            case 7:
                return new c((LearnHomeScreen) this.v, continuation, 7);
            case 8:
                return new c((m0) this.v, continuation, 8);
            case 9:
                return new c((RevPointsTransactionDetailsScreen) this.v, continuation, 9);
            case 10:
                return new c((ViewItemizedSplitBillLinesController) this.v, continuation, 10);
            case 11:
                return new c((TravelExperiencesBookingDetailsScreen) this.v, continuation, 11);
            case 12:
                return new c((RevPointsSpareChangeRefundController) this.v, continuation, 12);
            case 13:
                return new c((n2c.d) this.v, continuation, 13);
            case 14:
                return new c((TradeRevPointsTransferBreakdownScreen) this.v, continuation, 14);
            case 15:
                return new c((StoreOrdersSeeAllScreen) this.v, continuation, 15);
            case 16:
                return new c((p) this.v, continuation, 16);
            case 17:
                return new c((PaymentSelectionController) this.v, continuation, 17);
            case 18:
                return new c((WealthMarginBorrowingInterestScreen) this.v, continuation, 18);
            case 19:
                return new c((ProfileScreen) this.v, continuation, 19);
            case 20:
                return new c((LoanRepaymentsListScreen) this.v, continuation, 20);
            case 21:
                return new c((f0) this.v, continuation, 21);
            case 22:
                return new c((AssetsPriceUpdateScreen) this.v, continuation, 22);
            case 23:
                return new c((CharitiesOverviewFlow) this.v, continuation, 23);
            case 24:
                return new c((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a) this.v, continuation, 24);
            case 25:
                return new c((JuniorBlankCardDeliveryConsentScreen) this.v, continuation, 25);
            case 26:
                return new c((PriceTargetsFaqLeafScreen) this.v, continuation, 26);
            case 27:
                return new c((nf5.d) this.v, continuation, 27);
            case 28:
                return new c((nfj.g) this.v, continuation, 28);
            default:
                return new c((y) this.v, continuation, 29);
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
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c) create((n09.f0[]) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((c) create((x60) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v102, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v119, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v138, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v73, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v89, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v95, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) ((f) ((ShareRaffleScreen) this.v).O.getValue())).B2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((mu4.g) ((CreditCardRepaySpeiDetailsScreen) this.v).R.getValue()).B2();
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.a) ((muk.g) ((TechnicalInsightsController) this.v).R.getValue())).B2();
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((mul.j) ((SecurityAssetBalanceBreakdownScreen) this.v).S.getValue()).B2();
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((TransactionCodeScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                mvj.b bVar = (mvj.b) ((TravelItineraryRemoveEventScreen) this.v).S.getValue();
                bVar.getClass();
                bVar.l2(new mci.e(bVar, objArr == true ? 1 : 0, 23), new mqi.a(bVar, 15));
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((RevPointsLearnScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((LearnHomeScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((m0) this.v).f210961t = true;
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.rev_points.impl.ui.transactions.details.b) ((RevPointsTransactionDetailsScreen) this.v).R2()).B2();
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ViewItemizedSplitBillLinesController) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((TravelExperiencesBookingDetailsScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                n2c.d dVar = (n2c.d) ((RevPointsSpareChangeRefundController) this.v).S.getValue();
                SpareChangeRefundQuote spareChangeRefundQuote = ((n2c.b) ((j2) dVar.f211518q.f22677a).getValue()).f211515b;
                if (spareChangeRefundQuote == null) {
                    dVar.B2();
                    Unit unit = Unit.f186387a;
                } else if (spareChangeRefundQuote.f84094b.f115082a <= 0) {
                    dVar.B2();
                } else {
                    dVar.l2(new mpd.p(dVar, spareChangeRefundQuote, objArr2 == true ? 1 : 0, 25), new yi5.b(26));
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((n2c.d) this.v).B2();
                return Unit.f186387a;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.a) ((n2f.d) ((TradeRevPointsTransferBreakdownScreen) this.v).T.getValue())).C2(q.f5292a);
                return Unit.f186387a;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.store.impl.ui.orders.see_all.a) ((StoreOrdersSeeAllScreen) this.v).d()).B2();
                return Unit.f186387a;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j60.a.v(((p) this.v).f212652r, false, null, 3);
                return Unit.f186387a;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((n6a.g) ((PaymentSelectionController) this.v).T.getValue()).C2(n6a.a.f212748a);
                return Unit.f186387a;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.wealth.gia.margin_trading.impl.ui.borrowing_interest.a) ((n6h.e) ((WealthMarginBorrowingInterestScreen) this.v).U.getValue())).B2();
                return Unit.f186387a;
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((n79.c) ((ProfileScreen) this.v).O.getValue()).B2();
                return Unit.f186387a;
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((LoanRepaymentsListScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 21:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list = (List) p.a.j(z0.class, KTypeProjection.INSTANCE, List.class, ((f0) this.v).f213316b, "PIX_TRUSTED_ACCOUNTS_KEY");
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(k8a.d.a((z0) it8.next()));
                    }
                }
                return arrayList;
            case 22:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((naf.k) ((naf.g) ((AssetsPriceUpdateScreen) this.v).P.getValue())).B2();
                return Unit.f186387a;
            case 23:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.donations.impl.ui.kompot.flow.overview.b) ((CharitiesOverviewFlow) this.v).e3()).B2();
                return Unit.f186387a;
            case 24:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a) this.v).K2(null);
                return Unit.f186387a;
            case 25:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((JuniorBlankCardDeliveryConsentScreen) this.v).d().B2();
                return Unit.f186387a;
            case 26:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ndj.d) ((PriceTargetsFaqLeafScreen) this.v).X.getValue()).u2();
                return Unit.f186387a;
            case 27:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return j6.a.k(CryptoExchangeFeesFacadeV2.class, ((nf5.d) this.v).f214832a, "CURRENT_CRYPTO_EXCHANGE_FEES_KEY");
            case 28:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar = ((nfj.g) this.v).d;
                nfj.g.Companion.getClass();
                kfj.h hVar = (kfj.h) cVar.T2("CONFIGURATION_KEY", nfj.g.f);
                if (hVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(hVar, "<this>");
                return new dej.i(hVar.getAutoRenewalExpirationInDays(), hVar.getPartnerTermsUrl(), hVar.getAutoRenewalDefaultState(), hVar.getOnlyManualInstallationAvailable());
            default:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((y) this.v).f215072c, "ESIM_GIFTING_ENTRY_POINT_SEEN_KEY", Boolean.TRUE);
                return Unit.f186387a;
        }
    }
}
