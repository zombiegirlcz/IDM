package j2c;

import aw0.n6;
import com.google.gson.reflect.TypeToken;
import com.revolut.core.backend_flow.impl.ui.entities_selection.EntitiesSelectionController;
import com.revolut.feature.address.common.impl.flow.screen.find.AddressSearchScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.upsell.OfferUpsellScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.LoanManageRepaymentsController;
import com.revolut.feature.crypto.currency_pair.picker.impl.ui.currency_pair_picker.CryptoCurrencyPairPickerScreen;
import com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.amount.DeFiToCeFiAmountScreen;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.setup.DirectDepositSetupScreen;
import com.revolut.feature.html_viewer.impl.screen.HtmlViewerScreen;
import com.revolut.feature.pay_later.impl.ui.accountdetails.PayLaterAccountDetailsScreen;
import com.revolut.feature.retail.cfd.impl.screens.cash_trade.CfdCashTradeDetailsController;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_hub.CobrandedCardsPlanHubFlow;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.datepicker.ReservationDatePickerScreen;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreen;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.RevPointsSpareChangeFullListController;
import com.revolut.feature.shared.help_centre.impl.faq.screens.form_chooser.FaqFormChooserScreen;
import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.voucher.TradeRevPointsAgentAllVouchersScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.chat_redirect.TravelFlightsChatRedirectScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.additional_details.TravelHotelsAdditionalDetailsScreen;
import com.revolut.feature.travel.miles.impl.ui.flow.main.TravelMilesMainFlow;
import com.revolut.feature.travel.miles.impl.ui.screen.reward_flights.TravelMilesRewardFlightsScreen;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.details.TrustedMerchantDetailsController;
import ff4.b0;
import ft3.g1;
import ft3.j1;
import ib5.a;
import ip0.yc0;
import j2g.y;
import j82.j;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import le.u1;
import nii.n1;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
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
                return new b((RevPointsSpareChangeFullListController) this.v, continuation, 0);
            case 1:
                return new b((TradeRevPointsAgentAllVouchersScreen) this.v, continuation, 1);
            case 2:
                return new b((y) this.v, continuation, 2);
            case 3:
                return new b((j36.e) this.v, continuation, 3);
            case 4:
                return new b((CfdCashTradeDetailsController) this.v, continuation, 4);
            case 5:
                return new b((DeFiToCeFiAmountScreen) this.v, continuation, 5);
            case 6:
                return new b((TravelFlightsChatRedirectScreen) this.v, continuation, 6);
            case 7:
                return new b((CobrandedCardsPlanHubFlow) this.v, continuation, 7);
            case 8:
                return new b((LoanManageRepaymentsController) this.v, continuation, 8);
            case 9:
                return new b((j82.s) this.v, continuation, 9);
            case 10:
                return new b((j87.l) this.v, continuation, 10);
            case 11:
                return new b((FaqFormChooserScreen) this.v, continuation, 11);
            case 12:
                return new b((DirectDepositSetupScreen) this.v, continuation, 12);
            case 13:
                return new b((EntitiesSelectionController) this.v, continuation, 13);
            case 14:
                return new b((jb5.a) this.v, continuation, 14);
            case 15:
                return new b((jd3.c) this.v, continuation, 15);
            case 16:
                return new b((HtmlViewerScreen) this.v, continuation, 16);
            case 17:
                return new b((TravelHotelsAdditionalDetailsScreen) this.v, continuation, 17);
            case 18:
                return new b((com.revolut.feature.apm.swish.impl.ui.a) this.v, continuation, 18);
            case 19:
                return new b((CryptoCurrencyPairPickerScreen) this.v, continuation, 19);
            case 20:
                return new b((ReservationDatePickerScreen) this.v, continuation, 20);
            case 21:
                return new b((OfferUpsellScreen) this.v, continuation, 21);
            case 22:
                return new b((ReverywhereWebAppScreen) this.v, continuation, 22);
            case 23:
                return new b((SharedConverterScreen) this.v, continuation, 23);
            case 24:
                return new b((TravelMilesMainFlow) this.v, continuation, 24);
            case 25:
                return new b((AddressSearchScreen) this.v, continuation, 25);
            case 26:
                return new b((TravelMilesRewardFlightsScreen) this.v, continuation, 26);
            case 27:
                return new b((PayLaterAccountDetailsScreen) this.v, continuation, 27);
            case 28:
                return new b((TrustedMerchantDetailsController) this.v, continuation, 28);
            default:
                return new b((jk5.i) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((b) create((j87.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((b) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((mii.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v113, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v128, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v86, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v97, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
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
                ((com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a) ((RevPointsSpareChangeFullListController) obj3).e3()).C2(RevPointsSpareChangeControllerApi$Result.Skipped.f84132a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((j2f.o) ((j2f.k) ((TradeRevPointsAgentAllVouchersScreen) obj3).Q.getValue())).B2();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar = (y) obj3;
                k0g.c cVar = yVar.f170888r.f20493a;
                cVar.getClass();
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) p.a.j(i36.c.class, KTypeProjection.INSTANCE, List.class, ((j36.e) obj3).f170978b, "KEY_TOP_DEFI_CURRENCIES");
                if (list != null) {
                }
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((j3b.j) ((CfdCashTradeDetailsController) obj3).P.getValue()).B2();
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((j56.e) ((DeFiToCeFiAmountScreen) obj3).O.getValue()).B2();
                break;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j5g.d dVar = (j5g.d) ((TravelFlightsChatRedirectScreen) obj3).P.getValue();
                dVar.getClass();
                dVar.l2(new j5g.c(dVar, null), new yc0(1, dVar, j5g.d.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 5));
                break;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((j6b.j) ((CobrandedCardsPlanHubFlow) obj3).P.getValue()).B2();
                break;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.a) ((j75.g) ((LoanManageRepaymentsController) obj3).S.getValue())).B2();
                break;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((j82.s) obj3).C2(j.b.f172092a);
                break;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((j87.l) obj3).d.b3();
                break;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((j8d.g) ((FaqFormChooserScreen) obj3).Z.getValue()).u2();
                break;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j96.l lVar = (j96.l) ((DirectDepositSetupScreen) obj3).R2();
                lVar.getClass();
                h96.d dVar2 = h96.d.SHARE;
                cli.y yVar2 = lVar.f172305q;
                lVar.C2(new j96.b(dVar2, ((j96.a) ((j2) yVar2.f22677a).getValue()).f172290a, ((j96.a) ((j2) yVar2.f22677a).getValue()).f172291b));
                break;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((gb0.f) ((jb0.i) ((EntitiesSelectionController) obj3).R2()).f172543s).Z2();
                break;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ve0.c cVar2 = ((jb5.a) obj3).f172597c;
                Type type = new TypeToken<List<? extends ib5.a>>() { // from class: com.revolut.feature.credit.tiles.impl.repositories.CreditTilesRepositoryImpl$creditOnboardingStatusesTilesDod$4$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                List list2 = (List) cVar2.T2("credit-onboarding-statuses-tiles-key", type);
                if (list2 != null) {
                    List<ib5.a> list3 = list2;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                    for (ib5.a aVar16 : list3) {
                        Object obj4 = hb5.a.f150612a;
                        Intrinsics.checkNotNullParameter(aVar16, "<this>");
                        String strA = aVar16.getApplicationId();
                        j1 j1Var = g1.a(aVar16.getProductType()).f137810a;
                        String strH = aVar16.getTitle();
                        String strC = aVar16.getDescription();
                        jo3.b bVarB = aVar16.getCreditLimit();
                        dj0.d dVarV = bVarB != null ? hx7.a.v(bVarB) : null;
                        bb5.a aVar17 = (bb5.a) u1.v(aVar16.getStatus(), hb5.a.f150612a);
                        if (aVar17 == null) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "creditOnboardingStatusTileStatus", p.a.p("Can't support status=", aVar16.getStatus(), " for creditOnboardingStatusTileStatus"), null, h0Var);
                            aVar17 = bb5.a.UNKNOWN;
                        }
                        bb5.a aVar18 = aVar17;
                        Boolean boolJ = aVar16.getIsDashboardAvailable();
                        boolean zBooleanValue = boolJ != null ? boolJ.booleanValue() : false;
                        a.C0916a c0916aI = aVar16.getValue();
                        bb5.b bVar = c0916aI != null ? new bb5.b(c0916aI.getPrimary(), c0916aI.getSecondary()) : null;
                        String strF = aVar16.getSourceFacilityId();
                        it3.j jVar = it3.k.Companion;
                        String strD = aVar16.getProductMetadataType();
                        jVar.getClass();
                        arrayList.add(new bb5.c(strA, j1Var, strH, strC, dVarV, aVar18, zBooleanValue, strF, bVar, it3.j.a(strD)));
                    }
                }
                break;
            case 15:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 16:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((HtmlViewerScreen) obj3).m2().onBackPressed();
                break;
            case 17:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((jdg.e) ((TravelHotelsAdditionalDetailsScreen) obj3).O.getValue()).B2();
                break;
            case 18:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.apm.swish.impl.ui.a) obj3).f62919r);
                break;
            case 19:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((CryptoCurrencyPairPickerScreen) obj3).m2().onBackPressed();
                break;
            case 20:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((jeb.f) ((ReservationDatePickerScreen) obj3).P.getValue()).B2();
                break;
            case 21:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((b0) ((OfferUpsellScreen) obj3).R2()).J2();
                break;
            case 22:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = ReverywhereWebAppScreen.g0;
                ((ReverywhereWebAppScreen) obj3).h3().evaluateJavascript("javascript:errorHandler && errorHandler.invalidURL && errorHandler.invalidURL()", null);
                break;
            case 23:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((SharedConverterScreen) obj3).m2().onBackPressed();
                break;
            case 24:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.travel.miles.impl.ui.flow.main.a) ((jgg.c) ((TravelMilesMainFlow) obj3).O.getValue())).B2();
                break;
            case 25:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((AddressSearchScreen) obj3).m2().onBackPressed();
                break;
            case 26:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TravelMilesRewardFlightsScreen) obj3).m2().onBackPressed();
                break;
            case 27:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PayLaterAccountDetailsScreen) obj3).m2().onBackPressed();
                break;
            case 28:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.trusted_merchants.impl.ui.kompot.details.a) ((jjg.a) ((TrustedMerchantDetailsController) obj3).Q.getValue())).B2();
                break;
            default:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((jk5.i) obj3).B2();
                break;
        }
        return Unit.f186387a;
    }
}
