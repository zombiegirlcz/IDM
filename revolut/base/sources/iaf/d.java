package iaf;

import c84.t;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.atm.impl.ui.redesign.fees.AtmFeesBottomSheetController;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.list.ValuatorsListScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.BrazilConsentDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.customer.details.FreelancerCustomerDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.orders.OrderInitPageHistoryScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.view_driver.ViewDriverScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.documents.preview.InsuranceDocumentsPreviewScreen;
import com.revolut.feature.retail.savings.impl.ui.info.protection.ProtectionAndSafetyScreen;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.rev_points_earned.RentAndBillsRevPointsEarnedScreen;
import com.revolut.feature.security_hub.impl.ui.gambling_block.GamblingBlockScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.selected_assets.SelectedAssetsListScreen;
import com.revolut.feature.transfer.core.impl.ui.reason.chooser_v2.ReasonForTransferChooserScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.additional_information.TravelHotelsBookingAdditionalInformationScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.TravelHotelsRoomsSelectionScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.EsimPickerScreen;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.home.RewardsHubHomeScreen;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.daily.WealthDailyNewsScreen;
import com.revolut.retail.feature.pod_nominees.impl.details.PodNomineeDetailsScreen;
import com.revolut.sso.impl.ui.choose_challenge.ChooseChallengeController;
import iyg.b0;
import iyg.d0;
import iyg.u;
import iyg.v;
import iyg.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import uo.u0;
import wim.z;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d((SelectedAssetsListScreen) this.v, continuation, 0);
            case 1:
                return new d((TravelHotelsBookingAdditionalInformationScreen) this.v, continuation, 1);
            case 2:
                return new d((ic4.a) this.v, continuation, 2);
            case 3:
                return new d((TravelHotelsRoomsSelectionScreen) this.v, continuation, 3);
            case 4:
                return new d((PodNomineeDetailsScreen) this.v, continuation, 4);
            case 5:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.spinner.b) this.v, continuation, 5);
            case 6:
                return new d((com.revolut.feature.shops.impl.flow.session.c) this.v, continuation, 6);
            case 7:
                return new d((ValuatorsListScreen) this.v, continuation, 7);
            case 8:
                return new d((BrazilConsentDetailsScreen) this.v, continuation, 8);
            case 9:
                return new d((RentAndBillsRevPointsEarnedScreen) this.v, continuation, 9);
            case 10:
                return new d((AtmFeesBottomSheetController) this.v, continuation, 10);
            case 11:
                return new d((EsimPickerScreen) this.v, continuation, 11);
            case 12:
                return new d((ChooseChallengeController) this.v, continuation, 12);
            case 13:
                return new d((img.d) this.v, continuation, 13);
            case 14:
                return new d((in6.l) this.v, continuation, 14);
            case 15:
                return new d((io.f) this.v, continuation, 15);
            case 16:
                return new d((ViewDriverScreen) this.v, continuation, 16);
            case 17:
                return new d((ProtectionAndSafetyScreen) this.v, continuation, 17);
            case 18:
                return new d((ReasonForTransferChooserScreen) this.v, continuation, 18);
            case 19:
                return new d((GamblingBlockScreen) this.v, continuation, 19);
            case 20:
                return new d((RewardsHubHomeScreen) this.v, continuation, 20);
            case 21:
                return new d((iv5.i) this.v, continuation, 21);
            case 22:
                return new d((InsuranceDocumentsPreviewScreen) this.v, continuation, 22);
            case 23:
                return new d((ivg.b) this.v, continuation, 23);
            case 24:
                return new d((com.revolut.feature.credit.card.impl.ui.statement_financing.setup.b) this.v, continuation, 24);
            case 25:
                return new d((FreelancerCustomerDetailsScreen) this.v, continuation, 25);
            case 26:
                return new d((com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a) this.v, continuation, 26);
            case 27:
                return new d((com.revolut.feature.travel.experiences.impl.ui.flow.home.b) this.v, continuation, 27);
            case 28:
                return new d((WealthDailyNewsScreen) this.v, continuation, 28);
            default:
                return new d((OrderInitPageHistoryScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r13v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v73, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        char c2 = 1;
        int i2 = 7;
        Continuation continuation = null;
        int i3 = 0;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((SelectedAssetsListScreen) obj3).m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ibg.h) ((ibg.e) ((TravelHotelsBookingAdditionalInformationScreen) obj3).P.getValue())).B2();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t.J2((ic4.a) obj3, false, null, null, 7);
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b) ((TravelHotelsRoomsSelectionScreen) obj3).R2()).B2();
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PodNomineeDetailsScreen) obj3).m2().onBackPressed();
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.spinner.b) obj3).K2(null);
                break;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.shops.impl.flow.session.c) obj3).f87121s);
                break;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ValuatorsListScreen) obj3).m2().onBackPressed();
                break;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((BrazilConsentDetailsScreen) obj3).m2().onBackPressed();
                break;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ijc.k) ((ijc.h) ((RentAndBillsRevPointsEarnedScreen) obj3).O.getValue())).C2(ijc.d.f161759a);
                break;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ik2.b) ((ik2.c) ((AtmFeesBottomSheetController) obj3).S.getValue())).C2(aii.q.f5292a);
                break;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ilj.g) ((EsimPickerScreen) obj3).Q.getValue()).B2();
                break;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ChooseChallengeController) obj3).m2().onBackPressed();
                break;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((in6.l) obj3).C2(in6.f.f162671a);
                break;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.analytics.tracking.v3.f fVar = (com.revolut.analytics.tracking.v3.f) ((com.revolut.analytics.tracking.v3.d) ((io.f) obj3).f162985b.get());
                u0 u0VarA = fVar.f50320l.a();
                if (u0VarA != null) {
                    com.revolut.analytics.tracking.v3.f.g(fVar, AnalyticsProduct.Shared.MobilePlatform.f, null, null, new nmm.h(u0VarA, 4), 14);
                }
                break;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ViewDriverScreen) obj3).m2().onBackPressed();
                break;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ProtectionAndSafetyScreen) obj3).m2().onBackPressed();
                break;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ReasonForTransferChooserScreen) obj3).e3().C2(iqf.b.f167827a);
                break;
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((iuc.f) ((GamblingBlockScreen) obj3).P.getValue()).B2();
                break;
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((RewardsHubHomeScreen) obj3).m2().onBackPressed();
                break;
            case 21:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((iv5.i) obj3).k.Z2();
                break;
            case 22:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((InsuranceDocumentsPreviewScreen) obj3).m2().onBackPressed();
                break;
            case 23:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xe0.e eVar = ((ivg.b) obj3).f168860a;
                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                KType kTypeB = o0.b(fvg.c.class);
                companion.getClass();
                break;
            case 24:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 25:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((iw6.m) ((iw6.f) ((FreelancerCustomerDetailsScreen) obj3).Q.getValue())).B2();
                break;
            case 26:
                com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a aVar27 = (com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a) obj3;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar27.D.getClass();
                int i5 = 3;
                aVar27.l2(new d0(i5, aVar27, continuation), new yi5.b(26));
                int i6 = 2;
                yji.l.a1(aVar27, mo3.a.g(vkm.q.Q(aVar27.u.d(), new y(i3, aVar27, continuation)), null, null, 3), null, null, new v(i6, aVar27, continuation), 3);
                cli.y yVar = aVar27.P;
                yji.l.a1(aVar27, vkm.q.Q(new b0(yVar.B(new iwk.b(13)), i3), new u(i6, aVar27, continuation)), null, null, new v(i2, aVar27, continuation), 3);
                tyg.m mVar = aVar27.f95067s;
                yji.l.a1(aVar27, new tse.c(ue0.e.R(mVar.f275583a, "WIDGETISED_TIMESTAMP_KEY", z.d(o0.b(vyg.c.class))), mVar, i2), null, null, new v(9, aVar27, continuation), 3);
                yji.l.a1(aVar27, vkm.q.Q(yVar.B(new iwk.b(14)), new u(c2 == true ? 1 : 0, aVar27, continuation)), null, null, new v(i5, aVar27, continuation), 3);
                break;
            case 27:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.travel.experiences.impl.ui.flow.home.b) obj3).u);
                break;
            case 28:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((WealthDailyNewsScreen) obj3).m2().onBackPressed();
                break;
            default:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((j27.j) ((OrderInitPageHistoryScreen) obj3).R2()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
