package se4;

import com.revolut.camerakit.revolut.ui.flow.steps.camera.CameraKitCameraScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.otp.OtpScreen;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v2.SelectAutopayMethodScreenV2;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingpicker.CryptoAddressHostingPickerController;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.institution_info.BrazilInstitutionInfoScreen;
import com.revolut.feature.external_accounts.impl.ui.india.upi.screen.applications.UpiApplicationsScreen;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.details.FreelancerPluginDetailsScreen;
import com.revolut.feature.payees.impl.ui.payees_overview.flow.PayeesOverviewFlow;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.rev_points.impl.ui.personalisation.RevPointsPersonalisationScreen;
import com.revolut.feature.robo.impl.ui.screen.settings.SettingsScreen;
import com.revolut.feature.selfserve.sot.impl.ui.document.list.DocumentSelectionController;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.bottom_sheet.rename_watchlist.RenameWatchlistController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details.CustomAssetDetailsController;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.smart_filters_info.TravelHotelsSmartFiltersInfoScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.account_registration_tax_id.TravelMilesAccountRegistrationTaxIdScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.about_refund.AirportLoungePassAboutRefundScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.refund_summary.EsimDataPlanRefundSummaryBottomSheetScreen;
import dmc.s;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sk4.b;
import snk.r;
import vkm.j2;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
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
                return new c((OtpScreen) this.v, continuation, 0);
            case 1:
                return new c((sef.k) this.v, continuation, 1);
            case 2:
                return new c((TravelHotelsSmartFiltersInfoScreen) this.v, continuation, 2);
            case 3:
                return new c((RenameWatchlistController) this.v, continuation, 3);
            case 4:
                return new c((TravelMilesAccountRegistrationTaxIdScreen) this.v, continuation, 4);
            case 5:
                return new c((BrazilInstitutionInfoScreen) this.v, continuation, 5);
            case 6:
                return new c((sjk.g) this.v, continuation, 6);
            case 7:
                return new c((SelectAutopayMethodScreenV2) this.v, continuation, 7);
            case 8:
                return new c((ska.e) this.v, continuation, 8);
            case 9:
                return new c((skd.j) this.v, continuation, 9);
            case 10:
                return new c((UpiApplicationsScreen) this.v, continuation, 10);
            case 11:
                return new c((PayeesOverviewFlow) this.v, continuation, 11);
            case 12:
                return new c((com.revolut.feature.profile.impl.ui.details.email.c) this.v, continuation, 12);
            case 13:
                return new c((EsimDataPlanRefundSummaryBottomSheetScreen) this.v, continuation, 13);
            case 14:
                return new c((SettingsScreen) this.v, continuation, 14);
            case 15:
                return new c((r) this.v, continuation, 15);
            case 16:
                return new c((spc.d) this.v, continuation, 16);
            case 17:
                return new c((CryptoAddressHostingPickerController) this.v, continuation, 17);
            case 18:
                return new c((CustomAssetDetailsController) this.v, continuation, 18);
            case 19:
                return new c((sre.k) this.v, continuation, 19);
            case 20:
                return new c((sth.e) this.v, continuation, 20);
            case 21:
                return new c((suf.h) this.v, continuation, 21);
            case 22:
                return new c((FreelancerPluginDetailsScreen) this.v, continuation, 22);
            case 23:
                return new c((swi.c) this.v, continuation, 23);
            case 24:
                return new c((com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b) this.v, continuation, 24);
            case 25:
                return new c((CameraKitCameraScreen) this.v, continuation, 25);
            case 26:
                return new c((com.revolut.feature.rev_points.impl.ui.c) this.v, continuation, 26);
            case 27:
                return new c((DocumentSelectionController) this.v, continuation, 27);
            case 28:
                return new c((AirportLoungePassAboutRefundScreen) this.v, continuation, 28);
            default:
                return new c((RevPointsPersonalisationScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v71, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v88, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v92, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        int i2 = 10;
        aii.q qVar = aii.q.f5292a;
        Continuation continuation = null;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o) ((OtpScreen) obj3).O.getValue()).J2(g.f262104a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((sef.k) obj3).v2(sef.g.f262190a);
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((seg.b) ((TravelHotelsSmartFiltersInfoScreen) obj3).S.getValue()).C2(qVar);
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sgd.f fVar = (sgd.f) ((RenameWatchlistController) obj3).S.getValue();
                fVar.getClass();
                fVar.n2(new s64.a(fVar, continuation, 18), new whi.b(6));
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sgg.j jVar = (sgg.j) ((sgg.f) ((TravelMilesAccountRegistrationTaxIdScreen) obj3).Q.getValue());
                jVar.getClass();
                jVar.l2(new s64.a(jVar, continuation, 19), new scl.e(jVar, 17));
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((sj6.f) ((sj6.d) ((BrazilInstitutionInfoScreen) obj3).P.getValue())).B2();
                break;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sjk.g gVar = (sjk.g) obj3;
                gVar.C2(new sjk.d((PricingPlanSubscription) zi0.c.I(((sjk.b) ((j2) gVar.f263741q.f22677a).getValue()).f263736a)));
                break;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((sk4.e) ((SelectAutopayMethodScreenV2) obj3).T2()).v2(b.a.f263767a);
                break;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((skd.j) obj3).f263838a.i();
                break;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((UpiApplicationsScreen) obj3).R2().B2();
                break;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.payees.impl.ui.payees_overview.flow.c) ((sm9.c) ((PayeesOverviewFlow) obj3).P.getValue())).B2();
                break;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.profile.impl.ui.details.email.c) obj3).f81389t);
                break;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((smj.b) ((EsimDataPlanRefundSummaryBottomSheetScreen) obj3).T.getValue()).B2();
                break;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((snc.k) ((s) ((SettingsScreen) obj3).c0.getValue()).o.get()).u2();
                break;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar = (r) obj3;
                rVar.H2(rVar.f264654w, new sl3.i(24));
                break;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j60.a.v((j60.a) ((spc.d) obj3).d.f22077m, false, null, 3);
                break;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((CryptoAddressHostingPickerController) obj3).m2().onBackPressed();
                break;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((srd.q) ((CustomAssetDetailsController) obj3).R2()).B2();
                break;
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((sre.k) obj3).f265204b;
                Type type = sre.k.e;
                Intrinsics.checkNotNullExpressionValue(type, "access$getUSER_DOCUMENTS_LIST_TYPE$cp(...)");
                List list = (List) cVar.T2("USER_DOCUMENTS_KEY", type);
                if (list != null) {
                }
                break;
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sth.e eVar = (sth.e) obj3;
                eVar.n2(new sth.d(eVar, null), new sl5.a(eVar, 16));
                break;
            case 21:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                suf.h hVar = (suf.h) obj3;
                LocalDateTime localDateTimeC = hVar.c();
                List listA = hVar.f265754b.a();
                ArrayList arrayList = new ArrayList(w.t(listA, 10));
                Iterator it8 = listA.iterator();
                while (it8.hasNext()) {
                    arrayList.add(vuf.b.c((vuf.e) it8.next(), localDateTimeC));
                }
                break;
            case 22:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((sw6.h) ((FreelancerPluginDetailsScreen) obj3).O.getValue()).B2();
                break;
            case 23:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                swi.c cVar2 = (swi.c) obj3;
                break;
            case 24:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b) obj3).v);
                break;
            case 25:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((CameraKitCameraScreen) obj3).m2().onBackPressed();
                break;
            case 26:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.rev_points.impl.ui.c) obj3).I2();
                break;
            case 27:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((DocumentSelectionController) obj3).m2().onBackPressed();
                break;
            case 28:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((syi.b) ((AirportLoungePassAboutRefundScreen) obj3).O.getValue()).C2(qVar);
                break;
            default:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((szb.j) ((RevPointsPersonalisationScreen) obj3).P.getValue()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
