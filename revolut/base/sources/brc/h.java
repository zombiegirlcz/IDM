package brc;

import androidx.room.util.DBUtil;
import aw0.n6;
import bs2.e;
import cli.y;
import com.revolut.core.ui_kit.delegates.ea;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.list.ApmRecipientListScreen;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block_disallowed.MerchantBlockDisallowedController;
import com.revolut.feature.business.referrals.ui.screens.referral_account.ReferralAccountScreen;
import com.revolut.feature.card_design.impl.card_limit_controller.CardLimitControllerScreen;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.payment_amount.CreditCardBoletoPaymentAmountScreen;
import com.revolut.feature.credit.card.impl.ui.settings.screen.CreditCardSettingsScreen;
import com.revolut.feature.credit.health.impl.ui.learn_more.LearnMoreScreen;
import com.revolut.feature.crypto_feed.impl.chat_widgets.crypto_tokens.list.CryptoTokensListScreen;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroup;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroupResponse;
import com.revolut.feature.rev_points.impl.ui.redeem.RevPointsRedeemScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.SalaryStatusScreen;
import com.revolut.feature.sca_prompt.api.models.TrustedCompanyBeneficiary;
import com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration_tax_id.TradeRevPointsAccountRegistrationTaxIdScreen;
import com.revolut.feature.trading_add_ons.domain.model.TradingAddOnsCloseAction;
import com.revolut.feature.trading_add_ons.navigation.TradingAddOnsDestination$AddOnsMainDestination;
import com.revolut.feature.transfer.core.impl.ui.troubleshooter.TransferTroubleshooterScreen;
import com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.PortfolioInsightsAssetIndicatorController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.AirportLoungePassDetailsScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.a;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.date_picker.TravelItineraryDatePickerScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.vendor_selection.VendorSelectionScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.modal_screens.expected_annual_return_chart_info.ExpectedAnnualReturnChartInfoScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book.StockOrderBookController;
import com.revolut.trading.orders.ui.flows.trading_asset_details.RecurringBuyAssetDetailsFlow;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import n38.b0;
import nii.n1;
import vkm.j2;
import x2h.b;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h((SalaryStatusScreen) this.v, continuation, 0);
            case 1:
                return new h((TransferTroubleshooterScreen) this.v, continuation, 1);
            case 2:
                return new h((MerchantBlockDisallowedController) this.v, continuation, 2);
            case 3:
                return new h((CryptoTokensListScreen) this.v, continuation, 3);
            case 4:
                return new h((bsc.b) this.v, continuation, 4);
            case 5:
                return new h((ReferralAccountScreen) this.v, continuation, 5);
            case 6:
                return new h((btk.k) this.v, continuation, 6);
            case 7:
                return new h((RecurringBuyAssetDetailsFlow) this.v, continuation, 7);
            case 8:
                return new h((CreditCardBoletoPaymentAmountScreen) this.v, continuation, 8);
            case 9:
                return new h((ExpectedAnnualReturnChartInfoScreen) this.v, continuation, 9);
            case 10:
                return new h((CreditCardSettingsScreen) this.v, continuation, 10);
            case 11:
                return new h((bva.d) this.v, continuation, 11);
            case 12:
                return new h((TravelItineraryDatePickerScreen) this.v, continuation, 12);
            case 13:
                return new h((bwb.p) this.v, continuation, 13);
            case 14:
                return new h((StockOrderBookController) this.v, continuation, 14);
            case 15:
                return new h((bxb.l) this.v, continuation, 15);
            case 16:
                return new h((PortfolioInsightsAssetIndicatorController) this.v, continuation, 16);
            case 17:
                return new h((CardLimitControllerScreen) this.v, continuation, 17);
            case 18:
                return new h((by9.j) this.v, continuation, 18);
            case 19:
                return new h((AirportLoungePassDetailsScreen) this.v, continuation, 19);
            case 20:
                return new h((RevPointsRedeemScreen) this.v, continuation, 20);
            case 21:
                return new h((com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.b) this.v, continuation, 21);
            case 22:
                return new h((LearnMoreScreen) this.v, continuation, 22);
            case 23:
                return new h((c1i.g) this.v, continuation, 23);
            case 24:
                return new h((com.revolut.feature.card_order_new.impl.kompot.c) this.v, continuation, 24);
            case 25:
                return new h((TradeRevPointsAccountRegistrationTaxIdScreen) this.v, continuation, 25);
            case 26:
                return new h((VendorSelectionScreen) this.v, continuation, 26);
            case 27:
                return new h((ApmRecipientListScreen) this.v, continuation, 27);
            case 28:
                return new h((c48.g) this.v, continuation, 28);
            default:
                return new h((c64.e) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((h) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((h) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((h) create((ea) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((h) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((h) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v101, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v112, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v124, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v134, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v81, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v10 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        tvb.e eVar;
        String str;
        int i = this.u;
        aii.q qVar = aii.q.f5292a;
        int i2 = 10;
        String str2 = 0;
        ArrayList arrayList = null;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a) ((SalaryStatusScreen) obj3).d()).B2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TransferTroubleshooterScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bs2.g gVar = (bs2.g) ((bs2.a) ((MerchantBlockDisallowedController) obj3).S.getValue());
                bs2.d dVar = (bs2.d) ((j2) gVar.o.f22677a).getValue();
                if (dVar instanceof bs2.b) {
                    str2 = ((bs2.b) dVar).f18025a.d.f188636b;
                } else if (!(dVar instanceof bs2.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (str2 != 0) {
                    gVar.C2(new bs2.f(str2));
                } else {
                    gVar.C2(e.a.f18028a);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((bs5.e) ((bs5.a) ((CryptoTokensListScreen) obj3).P.getValue())).B2();
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) p.a.j(asc.l.class, KTypeProjection.INSTANCE, List.class, ((bsc.b) obj3).f18158a, "CRYPTO_TRUSTED_BENEFICIARIES_STORAGE_KEY");
                if (list != null) {
                    List<asc.l> list2 = list;
                    arrayList = new ArrayList(zhm.w.t(list2, 10));
                    for (asc.l lVar : list2) {
                        Intrinsics.checkNotNullParameter(lVar, "<this>");
                        arrayList.add(new TrustedCompanyBeneficiary(lVar.f8925a));
                    }
                }
                return arrayList;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((bt2.k) ((ReferralAccountScreen) obj3).e3()).B2();
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                btk.k kVar = (btk.k) obj3;
                kVar.X2(kVar.f18642q, new a26.p(kVar, i2));
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.flows.trading_asset_details.a aVar9 = (com.revolut.trading.orders.ui.flows.trading_asset_details.a) ((btl.d) ((RecurringBuyAssetDetailsFlow) obj3).O.getValue());
                y yVar = aVar9.f106828t;
                gdh.a aVar10 = aVar9.f106825q;
                hdh.e eVar2 = (hdh.e) ((btl.c) ((j2) yVar.f22677a).getValue()).f18650a.getContent();
                if (eVar2 != null) {
                    x2h.b bVarA = aVar9.f106826r.a(eVar2);
                    if (bVarA instanceof x2h.a) {
                        if (((x2h.a) bVarA).f302570a) {
                            aVar10.b3(bfl.g.BUY, eVar2, true);
                        } else {
                            r6.b.D("If new BuySellActions parameter has been added it should be handled properly");
                        }
                    } else if (bVarA.equals(b.a.f302572a)) {
                        aVar10.b3(bfl.g.BUY, eVar2, true);
                    } else {
                        if (!bVarA.equals(b.C1676b.f302573a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        r6.b.D("If no actions are available button clicks shouldn't be handled");
                    }
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((bu4.m) ((CreditCardBoletoPaymentAmountScreen) obj3).N.getValue()).C2(bu4.b.f18672a);
                return Unit.f186387a;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((buk.a) ((ExpectedAnnualReturnChartInfoScreen) obj3).N.getValue()).C2(qVar);
                return Unit.f186387a;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((bv4.i) ((CreditCardSettingsScreen) obj3).R.getValue()).B2();
                return Unit.f186387a;
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object objT2 = ((bva.d) obj3).f18976b.T2("HIDDEN_PAYMENT_IDS", Set.class);
                if (objT2 instanceof Set) {
                    return (Set) objT2;
                }
                return null;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bvj.f fVar = (bvj.f) ((TravelItineraryDatePickerScreen) obj3).Q.getValue();
                LocalDate localDate = ((bvj.a) ((j2) fVar.o.f22677a).getValue()).f19131a;
                if (localDate != null) {
                    fVar.C2(new bvj.b(localDate));
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((bwb.p) obj3).f19306c;
                bwb.p.Companion.getClass();
                ewb.g gVar2 = (ewb.g) cVar.T2("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_RESPONSE_STORAGE_KEY", ewb.g.class);
                if (gVar2 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(gVar2, "<this>");
                List categories = gVar2.getCategories();
                List<ewb.f> groups = gVar2.getGroups();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(groups, 10));
                for (ewb.f fVar2 : groups) {
                    Intrinsics.checkNotNullParameter(fVar2, "<this>");
                    String id10 = fVar2.getId();
                    String source = fVar2.getSource();
                    tvb.e[] eVarArrValues = tvb.e.values();
                    int length = eVarArrValues.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            eVar = eVarArrValues[i3];
                            if (!a0.z(eVar.name(), source, true)) {
                                i3++;
                            }
                        } else {
                            eVar = null;
                        }
                    }
                    if (eVar == null) {
                        eVar = tvb.e.UNKNOWN;
                    }
                    tvb.e eVar3 = eVar;
                    String name = fVar2.getName();
                    String logoImageUrl = fVar2.getLogoImageUrl();
                    Double advertisedPointsAmount = fVar2.getAdvertisedPointsAmount();
                    arrayList2.add(new VoucherProductGroup(id10, eVar3, name, logoImageUrl, advertisedPointsAmount != null ? qvb.a.a(advertisedPointsAmount.doubleValue()) : null, fVar2.getBrandId(), fVar2.getCategory()));
                }
                return new VoucherProductGroupResponse(arrayList2, categories);
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bwk.m mVar = (bwk.m) ((bwk.f) ((StockOrderBookController) obj3).L.getValue());
                mVar.getClass();
                mVar.C1(new TradingAddOnsDestination$AddOnsMainDestination(TradingAddOnsCloseAction.GoBack.f91662a));
                return Unit.f186387a;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bxb.l lVar2 = (bxb.l) obj3;
                cwb.c cVar2 = (cwb.c) lVar2.f19654p.f178946a;
                ne0.j jVar = cVar2.f109600b;
                Set set = (Set) jVar.get("KEY_GIFTCARDS_CONFIG");
                if (set == null) {
                    set = (Set) cVar2.f109599a.v0(h0.f322473a, "KEY_GIFTCARDS_CONFIG", cwb.c.d);
                    jVar.f("KEY_GIFTCARDS_CONFIG", set);
                }
                return yji.l.a1(lVar2, vkm.q.q(vkm.q.I(zhm.v.k(new go.g(set, 2), cVar2.f109601c))), null, null, new bxb.j(lVar2, str2, 3), 3);
            case 16:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.a) ((PortfolioInsightsAssetIndicatorController) obj3).R2()).B2();
                return Unit.f186387a;
            case 17:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((by2.c) ((CardLimitControllerScreen) obj3).U.getValue()).C2(qVar);
                return Unit.f186387a;
            case 18:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cy9.b bVar = ((by9.j) obj3).f19790b;
                List list3 = (List) DBUtil.performBlocking(bVar.f110064a, true, false, new cw7.j(bVar, 15));
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(by9.b.a((dy9.b) it8.next()));
                }
                return arrayList3;
            case 19:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.b) ((byi.f) ((AirportLoungePassDetailsScreen) obj3).Q.getValue())).C2(a.C0607a.f99125a);
                return Unit.f186387a;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((RevPointsRedeemScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 21:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.b) obj3).f104217r);
                return Unit.f186387a;
            case 22:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((c15.e) ((LearnMoreScreen) obj3).Q.getValue()).B2();
                return Unit.f186387a;
            case 23:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return wp5.y.t(r0i.a.class, ((c1i.g) obj3).f20524b, "LAST_SHOWN_CRYPTO_BANNER");
            case 24:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.card_order_new.impl.kompot.c) obj3).a3(false);
                return Unit.f186387a;
            case 25:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c2f.l lVar3 = (c2f.l) ((c2f.h) ((TradeRevPointsAccountRegistrationTaxIdScreen) obj3).Q.getValue());
                u2f.d dVar2 = (u2f.d) ((c2f.d) ((j2) lVar3.f20779s.f22677a).getValue()).f20769a.getContent();
                if (dVar2 != null && (str = dVar2.f276624m.f276638a) != null) {
                    lVar3.l2(new btk.j(lVar3, str, str2, 13), new bzg.t(lVar3, 11));
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((VendorSelectionScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 27:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ApmRecipientListScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 28:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar3 = ((c48.g) obj3).f;
                c48.g.Companion.getClass();
                a48.h entity = (a48.h) cVar3.T2("PARTNER_LINKED_CARDS_CACHE_KEY", c48.g.f21107p);
                if (entity == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(entity, "entity");
                List<a48.f> cards = entity.getCards();
                ArrayList arrayList4 = new ArrayList(zhm.w.t(cards, 10));
                for (a48.f fVar3 : cards) {
                    String id11 = fVar3.getId();
                    List<a48.g> pockets = fVar3.getPockets();
                    ArrayList arrayList5 = new ArrayList(zhm.w.t(pockets, 10));
                    for (a48.g gVar3 : pockets) {
                        arrayList5.add(new b0(gVar3.getId(), gVar3.getType()));
                    }
                    String lastFour = fVar3.getLastFour();
                    String expiryDate = fVar3.getExpiryDate();
                    arrayList4.add(new n38.a0(id11, arrayList5, lastFour, expiryDate != null ? LocalDate.parse(expiryDate) : null, fVar3.getBrand(), fVar3.getDesign(), fVar3.getCardName()));
                }
                return arrayList4;
            default:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c84.t.J2((c64.e) obj3, false, null, null, 7);
                return Unit.f186387a;
        }
    }
}
