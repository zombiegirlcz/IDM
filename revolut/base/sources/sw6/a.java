package sw6;

import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.card.MultibancoExternalEnrollmentCardScreen;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.card.MultibancoExternalEnrollmentCardScreenContract$InputData;
import com.revolut.feature.apm.upi.impl.flow.intent_payment.screen.review.UpiIntentPaymentReviewScreen;
import com.revolut.feature.apm.upi.impl.flow.intent_payment.screen.review.UpiIntentPaymentReviewScreenContract$InputData;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$InputData;
import com.revolut.feature.apm.wero.impl.ui.flow.WeroFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.options.DocumentOptionsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.options.DocumentOptionsScreenContract$InputData;
import com.revolut.feature.crypto.remittance.impl.ui.multichain.info.CryptoMultichainInfoController;
import com.revolut.feature.crypto.remittance.impl.ui.multichain.info.CryptoMultichainInfoControllerContract$InputData;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.details.FreelancerPluginDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.details.FreelancerPluginDetailsScreenContract$InputData;
import com.revolut.feature.incentive_reward.impl.ui.incentive_reward.flow.IncentiveRewardFlow;
import com.revolut.feature.incentive_reward.impl.ui.incentive_reward.flow.IncentiveRewardFlowContract$InputData$Details;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_expenses.CFACClaimExpensesScreen;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_expenses.CFACClaimExpensesScreenContract$InputData;
import com.revolut.feature.junior_rewards.impl.ui.list.JuniorRewardsListScreen;
import com.revolut.feature.junior_rewards.impl.ui.list.JuniorRewardsListScreenContract$InputData;
import com.revolut.feature.junior_settings.api.navigation.JuniorSettingsKompotFeatureConfig;
import com.revolut.feature.onboarding.impl.revolut_card_ready.flow.RevolutCardReadyFlow;
import com.revolut.feature.onboarding.impl.revolut_card_ready.flow.RevolutCardReadyFlowContract$InputData;
import com.revolut.feature.profile.impl.ui.details.email.check_inbox.CheckInboxScreen;
import com.revolut.feature.profile.impl.ui.details.email.check_inbox.CheckInboxScreenContract$InputData;
import com.revolut.feature.standingordertopup.impl.ui.screen.edit_order.EditTopUpOrderScreen;
import com.revolut.feature.standingordertopup.impl.ui.screen.edit_order.EditTopUpOrderScreenContract$InputData;
import com.revolut.feature.store.impl.ui.brand_detail.screen.earn.StoreBrandDetailEarnScreen;
import com.revolut.feature.store.impl.ui.brand_detail.screen.earn.StoreBrandDetailEarnScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.qr_link.SubaccountQRLinkScreen;
import com.revolut.feature.subaccount.impl.ui.qr_link.SubaccountQRLinkScreenContract$InputData;
import com.revolut.feature.subscriptions.impl.block_future_payments.screen.BlockFuturePaymentsScreen;
import com.revolut.feature.subscriptions.impl.block_future_payments.screen.BlockFuturePaymentsScreenContract$InputData;
import com.revolut.feature.transaction_list.impl.ui.list.screen.filter.TransactionsFilterScreen;
import com.revolut.feature.transaction_list.impl.ui.list.screen.filter.TransactionsFilterScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlow;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlowContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.TravelHotelsLocationPickerScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.TravelHotelsLocationPickerScreenContract$InputData;
import com.revolut.feature.wealth.tax_advantage_account.impl.ui.tax_allowance_detail.TaxAllowanceDetailScreen;
import com.revolut.feature.wealth.tax_advantage_account.impl.ui.tax_allowance_detail.TaxAllowanceDetailScreenContract$InputData;
import com.revolut.feature_move_money.impl.amount.order_automations.OrderAutomationsScreen;
import com.revolut.feature_move_money.impl.amount.order_automations.OrderAutomationsScreenContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.AirportLoungeDetailsScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.AirportLoungeDetailsScreenContract$InputData;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.screen.account.IndiaWithdrawalChooseAccountScreen;
import cwi.a1;
import cwi.z0;
import dej.q3;
import dej.r3;
import dej.s3;
import dw3.b4;
import dw3.i2;
import f4g.g0;
import f4g.h0;
import g9g.y0;
import h30.q;
import i72.m;
import i72.n;
import i9e.i;
import i9e.j;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import r6e.o;
import r6e.r;
import tch.b0;
import tch.f0;
import tch.y;
import u7i.l;
import u7i.p;
import us6.h1;
import us6.l0;
import w4l.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f266111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f266112c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f266110a = i;
        this.f266111b = obj2;
        this.f266112c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v1, types: [b60.a] */
    /* JADX WARN: Type inference failed for: r5v44 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        String str2;
        String str3;
        int i = this.f266110a;
        int i2 = 0;
        int i3 = 1;
        Object obj2 = this.f266112c;
        Object obj3 = this.f266111b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = FreelancerPluginDetailsScreen.Q;
                qji.b bVarU2 = ((FreelancerPluginDetailsScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.ecommerce.manage.details.di.FreelancerPluginDetailsScreenInjector");
                h1 h1Var = (h1) bVarU2;
                return new l0(h1Var.f282563a, h1Var.f282564b, (FreelancerPluginDetailsScreenContract$InputData) obj2);
            case 1:
                KProperty[] kPropertyArr2 = EditTopUpOrderScreen.S;
                qji.b bVarU22 = ((EditTopUpOrderScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.standingordertopup.impl.ui.screen.edit_order.di.EditTopUpOrderScreenComponent.Injector");
                jxd.a aVar = (jxd.a) bVarU22;
                return new jxd.e(aVar.f179136b, aVar.f179137c, (EditTopUpOrderScreenContract$InputData) obj2);
            case 2:
                AirportLoungeDetailsScreen airportLoungeDetailsScreen = (AirportLoungeDetailsScreen) obj3;
                AirportLoungeDetailsScreenContract$InputData airportLoungeDetailsScreenContract$InputData = (AirportLoungeDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr3 = AirportLoungeDetailsScreen.f99103d0;
                qji.b bVarQ2 = airportLoungeDetailsScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.di.AirportLoungeScreenInjector");
                z0 z0Var = (z0) ((txi.a) bVarQ2).y().S(airportLoungeDetailsScreen);
                switch (z0Var.f109826a) {
                    case 0:
                        z0Var.d = airportLoungeDetailsScreenContract$InputData;
                        break;
                    default:
                        z0Var.d = airportLoungeDetailsScreenContract$InputData;
                        break;
                }
                return (a1) z0Var.mo3800build();
            case 3:
                StoreBrandDetailEarnScreen storeBrandDetailEarnScreen = (StoreBrandDetailEarnScreen) obj3;
                StoreBrandDetailEarnScreenContract$InputData storeBrandDetailEarnScreenContract$InputData = (StoreBrandDetailEarnScreenContract$InputData) obj2;
                q qVar = storeBrandDetailEarnScreen.K;
                qVar.getClass();
                storeBrandDetailEarnScreenContract$InputData.getClass();
                qVar.e = storeBrandDetailEarnScreenContract$InputData;
                qVar.d = storeBrandDetailEarnScreen;
                return (k2e.c) qVar.mo3783build();
            case 4:
                int i5 = IndiaWithdrawalChooseAccountScreen.U;
                qji.b bVarU23 = ((IndiaWithdrawalChooseAccountScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.screen.account.di.IndiaWithdrawalChooseAccountScreenInjector");
                p2k.d dVar = (p2k.d) bVarU23;
                return new p2k.b(dVar.f232299b, dVar.f232300c, (t2k.c) obj2);
            case 5:
                TravelFlightsDatesSelectionScreen travelFlightsDatesSelectionScreen = (TravelFlightsDatesSelectionScreen) obj3;
                TravelFlightsDatesSelectionScreenContract$InputData travelFlightsDatesSelectionScreenContract$InputData = (TravelFlightsDatesSelectionScreenContract$InputData) obj2;
                KProperty[] kPropertyArr4 = TravelFlightsDatesSelectionScreen.P;
                qji.b bVarU24 = travelFlightsDatesSelectionScreen.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.di.TravelFlightsDatesSelectionScreenInjector");
                g0 g0Var = (g0) ((u5g.a) bVarU24).b().mo3808a(travelFlightsDatesSelectionScreen);
                switch (g0Var.f132117a) {
                    case 0:
                        g0Var.d = travelFlightsDatesSelectionScreenContract$InputData;
                        break;
                    default:
                        g0Var.d = travelFlightsDatesSelectionScreenContract$InputData;
                        break;
                }
                return (h0) g0Var.mo3783build();
            case 6:
                OrderAutomationsScreenContract$InputData orderAutomationsScreenContract$InputData = (OrderAutomationsScreenContract$InputData) obj2;
                int i6 = OrderAutomationsScreen.U;
                phm.a aVar2 = (phm.a) ue0.e.j(((OrderAutomationsScreen) obj3).m2()).a().get(l.class);
                 = aVar2 != null ? (b60.a) aVar2.get() : 0;
                if ( != 0) {
                    return new p(((l) b()).f277829h0, orderAutomationsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
            case 7:
                MultibancoExternalEnrollmentCardScreen multibancoExternalEnrollmentCardScreen = (MultibancoExternalEnrollmentCardScreen) obj3;
                MultibancoExternalEnrollmentCardScreenContract$InputData multibancoExternalEnrollmentCardScreenContract$InputData = (MultibancoExternalEnrollmentCardScreenContract$InputData) obj2;
                phm.a aVar3 = (phm.a) ue0.e.j(multibancoExternalEnrollmentCardScreen.m2()).a().get(m.class);
                b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar4 != null) {
                    return new n(((m) aVar4.b()).A, multibancoExternalEnrollmentCardScreen, multibancoExternalEnrollmentCardScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
            case 8:
                ((t78.f) obj3).A2(new JuniorSettingsKompotFeatureConfig.SecurityAndPrivacyDestination((String) obj2));
                return Unit.f186387a;
            case 9:
                SubaccountQRLinkScreenContract$InputData subaccountQRLinkScreenContract$InputData = (SubaccountQRLinkScreenContract$InputData) obj2;
                phm.a aVar5 = (phm.a) ue0.e.j(((SubaccountQRLinkScreen) obj3).m2()).a().get(o.class);
                b60.a aVar6 = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar6 != null) {
                    return new r(((o) aVar6.b()).K, subaccountQRLinkScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
            case 10:
                BlockFuturePaymentsScreen blockFuturePaymentsScreen = (BlockFuturePaymentsScreen) obj3;
                KProperty[] kPropertyArr5 = BlockFuturePaymentsScreen.f89179d0;
                qji.b bVarQ22 = blockFuturePaymentsScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.subscriptions.impl.block_future_payments.screen.di.BlockFuturePaymentsScreenInjector");
                i iVar = (i) bVarQ22;
                return new j(iVar.f159682b, iVar.f159683c, blockFuturePaymentsScreen, (BlockFuturePaymentsScreenContract$InputData) obj2);
            case 11:
                TravelHotelsCheckoutFlowContract$InputData travelHotelsCheckoutFlowContract$InputData = (TravelHotelsCheckoutFlowContract$InputData) obj2;
                phm.a aVar7 = (phm.a) ue0.e.j(((TravelHotelsCheckoutFlow) obj3).m2()).a().get(g9g.d.class);
                b60.a aVar8 = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar8 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", g9g.d.class, " is not found"));
                }
                g9g.d dVar2 = ((g9g.d) aVar8.b()).L;
                travelHotelsCheckoutFlowContract$InputData.getClass();
                return new g9g.n(dVar2, travelHotelsCheckoutFlowContract$InputData);
            case 12:
                CharityDetailsScreen charityDetailsScreen = (CharityDetailsScreen) obj3;
                KProperty[] kPropertyArr6 = CharityDetailsScreen.c0;
                qji.b bVarU25 = charityDetailsScreen.U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.di.CharityDetailsScreenInjector");
                pa6.n nVar = (pa6.n) bVarU25;
                return new pa6.d(nVar.f234406b, nVar.f234407c, charityDetailsScreen, (CharityDetailsScreenContract$InputData) obj2);
            case 13:
                RevolutCardReadyFlowContract$InputData revolutCardReadyFlowContract$InputData = (RevolutCardReadyFlowContract$InputData) obj2;
                phm.a aVar9 = (phm.a) ue0.e.j(((RevolutCardReadyFlow) obj3).m2()).a().get(uc9.b.class);
                b60.a aVar10 = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar10 != null) {
                    return new uc9.a(((uc9.b) aVar10.b()).f279007c, revolutCardReadyFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", uc9.b.class, " is not found"));
            case 14:
                TravelHotelsLocationPickerScreen travelHotelsLocationPickerScreen = (TravelHotelsLocationPickerScreen) obj3;
                TravelHotelsLocationPickerScreenContract$InputData travelHotelsLocationPickerScreenContract$InputData = (TravelHotelsLocationPickerScreenContract$InputData) obj2;
                KProperty[] kPropertyArr7 = TravelHotelsLocationPickerScreen.S;
                qji.b bVarU26 = travelHotelsLocationPickerScreen.U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.di.TravelHotelsLocationPickerScreenInjector");
                y0 y0Var = (y0) ((ucg.a) bVarU26).D().mo3808a(travelHotelsLocationPickerScreen);
                switch (y0Var.f141858a) {
                    case 0:
                        y0Var.d = travelHotelsLocationPickerScreenContract$InputData;
                        break;
                    case 1:
                        y0Var.d = travelHotelsLocationPickerScreenContract$InputData;
                        break;
                    default:
                        y0Var.d = travelHotelsLocationPickerScreenContract$InputData;
                        break;
                }
                return (g9g.z0) y0Var.mo3783build();
            case 15:
                com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a aVar11 = (com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a) obj3;
                y parcel = (y) ((b0) obj2);
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                aVar11.l2(new sx2.r(aVar11, parcel, , 24), new f0(aVar11, 3));
                return Unit.f186387a;
            case 16:
                DocumentOptionsScreen documentOptionsScreen = (DocumentOptionsScreen) obj3;
                KProperty[] kPropertyArr8 = DocumentOptionsScreen.c0;
                qji.b bVarQ23 = documentOptionsScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.options.di.DocumentOptionsScreenInjector");
                b4 b4Var = (b4) bVarQ23;
                return new i2(b4Var.f118345c, b4Var.d, documentOptionsScreen, (DocumentOptionsScreenContract$InputData) obj2);
            case 17:
                UpiIntentPaymentReviewScreen upiIntentPaymentReviewScreen = (UpiIntentPaymentReviewScreen) obj3;
                KProperty[] kPropertyArr9 = UpiIntentPaymentReviewScreen.S;
                qji.b bVarU27 = upiIntentPaymentReviewScreen.U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.feature.apm.upi.impl.flow.intent_payment.screen.review.di.UpiIntentPaymentReviewScreenInjector");
                if2.i iVar2 = (if2.i) bVarU27;
                return new if2.j(iVar2.f160873b, iVar2.f160874c, upiIntentPaymentReviewScreen, (UpiIntentPaymentReviewScreenContract$InputData) obj2);
            case 18:
                IncentiveRewardFlowContract$InputData$Details incentiveRewardFlowContract$InputData$Details = (IncentiveRewardFlowContract$InputData$Details) obj2;
                phm.a aVar12 = (phm.a) ue0.e.j(((IncentiveRewardFlow) obj3).m2()).a().get(cf7.l.class);
                b60.a aVar13 = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar13 != null) {
                    return new cf7.d(((cf7.b) ((cf7.l) aVar13.b())).f23583r, incentiveRewardFlowContract$InputData$Details);
                }
                throw new IllegalStateException(a0.d.q("Api ", cf7.l.class, " is not found"));
            case 19:
                KProperty[] kPropertyArr10 = TransactionsFilterScreen.R;
                qji.b bVarU28 = ((TransactionsFilterScreen) obj3).U2();
                Intrinsics.i(bVarU28, "null cannot be cast to non-null type com.revolut.feature.transaction_list.impl.ui.list.screen.filter.di.TransactionsFilterScreenInjector");
                pgf.f fVar = (pgf.f) bVarU28;
                return new pgf.g(fVar.f235912b, fVar.f235913c, (TransactionsFilterScreenContract$InputData) obj2);
            case 20:
                WeroNavigation$InputData weroNavigation$InputData = (WeroNavigation$InputData) obj2;
                phm.a aVar14 = (phm.a) ue0.e.j(((WeroFlow) obj3).m2()).a().get(nh2.h.class);
                b60.a aVar15 = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar15 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", nh2.h.class, " is not found"));
                }
                nh2.o oVar = ((nh2.o) ((nh2.h) aVar15.b())).f215326t;
                weroNavigation$InputData.getClass();
                return new nh2.q(oVar, weroNavigation$InputData);
            case 21:
                TaxAllowanceDetailScreenContract$InputData taxAllowanceDetailScreenContract$InputData = (TaxAllowanceDetailScreenContract$InputData) obj2;
                int i21 = TaxAllowanceDetailScreen.T;
                phm.a aVar16 = (phm.a) ue0.e.j(((TaxAllowanceDetailScreen) obj3).m2()).a().get(fhh.b.class);
                b60.a aVar17 = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar17 != null) {
                    return new fhh.a(((fhh.b) aVar17.b()).e, taxAllowanceDetailScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", fhh.b.class, " is not found"));
            case 22:
                k kVar = (k) obj3;
                ti9.g gVar = (ti9.g) obj2;
                efm.r rVarO = gVar.o(kVar);
                efm.r rVarA = gVar.e.a(false);
                sfm.b bVarK = l93.f.k(gVar.d, null, b93.d.ALL, kVar instanceof w4l.i, 9);
                r10.a aVar18 = gVar.f271460h;
                return nim.a.w(mif.a.f(rVarO, rVarA, bVarK, nim.a.w(pd.b.r(nim.a.w(l93.f.k((l93.f) aVar18.f250811a, null, b93.d.RETAIL, false, 13), new hy2.k(i3)), new hw9.a(aVar18, 10)), new tfh.a(gVar, 17))), new tfh.a(gVar, 16));
            case 23:
                tif.q qVar2 = (tif.q) obj3;
                mif.o oVar2 = qVar2.f271519c;
                oVar2.getClass();
                ufm.c cVar = new ufm.c(new h4d.d(oVar2, 23), 2);
                Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                ufm.c cVar2 = new ufm.c(new tif.e(qVar2, i3, cVar, (BreadcrumbException) obj2), i2);
                Intrinsics.checkNotNullExpressionValue(cVar2, "defer(...)");
                return cVar2;
            case 24:
                tij.q qVar3 = (tij.q) obj3;
                s3 s3Var = (s3) obj2;
                qVar3.getClass();
                if (!(s3Var instanceof q3)) {
                    if (!(s3Var instanceof r3)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EsimGiftRecipient esimGiftRecipient = ((r3) s3Var).f113643a;
                    return tij.q.a(new TextClause(esimGiftRecipient.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), j6.a.q("giftRecipientSubheaderItem_", esimGiftRecipient.f100268a));
                }
                UserDevice userDevice = ((q3) s3Var).f113630a;
                boolean zJ = pd.b.j((userDevice == null || (str3 = userDevice.f71914a) == null) ? null : Boolean.valueOf(qVar3.f271567b.E(str3)));
                if (userDevice == null || (str = userDevice.e) == null) {
                    str = "unknown_device";
                }
                return tij.q.a(zJ ? new TextLocalisedClause(R$string.esim_device_selector_devices_this_device, null, null, 14) : (userDevice == null || (str2 = userDevice.e) == null) ? new TextLocalisedClause(R$string.esim_home_expired_subscriptions_unknown_device_title, null, null, 14) : new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), "subheaderItem_".concat(str));
            case 25:
                CryptoMultichainInfoControllerContract$InputData cryptoMultichainInfoControllerContract$InputData = (CryptoMultichainInfoControllerContract$InputData) obj2;
                KProperty[] kPropertyArr11 = CryptoMultichainInfoController.Q;
                phm.a aVar19 = (phm.a) ue0.e.j(((CryptoMultichainInfoController) obj3).m2()).a().get(ak5.a.class);
                b60.a aVar20 = aVar19 != null ? (b60.a) aVar19.get() : null;
                if (aVar20 != null) {
                    return new ak5.e(((ak5.i) ((ak5.a) aVar20.b())).f5692g, cryptoMultichainInfoControllerContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ak5.a.class, " is not found"));
            case 26:
                CFACClaimExpensesScreenContract$InputData cFACClaimExpensesScreenContract$InputData = (CFACClaimExpensesScreenContract$InputData) obj2;
                KProperty[] kPropertyArr12 = CFACClaimExpensesScreen.c0;
                qji.b bVarQ24 = ((CFACClaimExpensesScreen) obj3).Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_expenses.di.CFACClaimExpensesScreenInjector");
                nk7.r rVar = (nk7.r) bVarQ24;
                nk7.q qVar4 = rVar.f216721b;
                nk7.r rVar2 = rVar.f216722c;
                cFACClaimExpensesScreenContract$InputData.getClass();
                return new nk7.f(qVar4, rVar2, cFACClaimExpensesScreenContract$InputData);
            case 27:
                ((tkb.c) obj3).d3(((jjb.f) ((jjb.g) obj2)).f174812a);
                return Unit.f186387a;
            case 28:
                JuniorRewardsListScreen juniorRewardsListScreen = (JuniorRewardsListScreen) obj3;
                JuniorRewardsListScreenContract$InputData juniorRewardsListScreenContract$InputData = (JuniorRewardsListScreenContract$InputData) obj2;
                KProperty[] kPropertyArr13 = JuniorRewardsListScreen.R;
                phm.a aVar21 = (phm.a) ue0.e.j(juniorRewardsListScreen.m2()).a().get(nm8.e.class);
                b60.a aVar22 = aVar21 != null ? (b60.a) aVar21.get() : null;
                if (aVar22 != null) {
                    return new nm8.d(((nm8.e) aVar22.b()).f, juniorRewardsListScreen, juniorRewardsListScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", nm8.e.class, " is not found"));
            default:
                qji.b bVarU29 = ((CheckInboxScreen) obj3).U2();
                Intrinsics.i(bVarU29, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.details.email.check_inbox.di.CheckInboxScreenInjector");
                fma.i iVar3 = (fma.i) bVarU29;
                return new fma.d(iVar3.f136161b, iVar3.f136162c, (CheckInboxScreenContract$InputData) obj2);
        }
    }
}
