package yl6;

import aii.q;
import aw0.n6;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.details.ApmRecipientDetailsNewScreen;
import com.revolut.feature.backgroundpicker.impl.flow.themes_gallery.ThemesGalleryController;
import com.revolut.feature.credit.card.impl.ui.settings.due_date.CreditCardSelectDueDateScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.remaining_limit.CryptoSendRemainingLimitController;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_accounts_screen.LinkedAccountsConsentScreen;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.preview.FreelancerPluginPreviewScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.TaxHubAssessmentScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.car_type.MtaCarTypeScreen;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.insight_details.InsightDetailsBottomSheetScreen;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.search.RevPointsGiftcardsSearchScreen;
import com.revolut.feature.rev_points.impl.ui.trophy_room.highlights_sharing.RevPointsTrophyRoomHighlightsSharingScreen;
import com.revolut.feature.transactions.impl.ui.kompot.receipts.ReceiptsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.TravelExperiencesPriceBreakdownScreen;
import com.revolut.feature.wealth.analytics.ui.complex_analytics.v2.screen.totalvalue.sector.ComplexAnalyticsSectorAllocationController;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.AsftTimeSlotBookingScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.amenities.AirportLoungesAmenitiesScreen;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.overview.BudgetOverviewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.PlanPageScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_status.StudentStatusScreen;
import efm.r;
import gim.i;
import ihm.j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import tji.m;
import urj.n;
import xv.l;
import yhm.o;
import ynk.e;
import yo7.p;
import yv8.k;
import yxb.s;
import z0f.f0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function2 {
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
                return new b((LinkedAccountsConsentScreen) this.v, continuation, 0);
            case 1:
                return new b((ThemesGalleryController) this.v, continuation, 1);
            case 2:
                return new b((ym2.i) this.v, continuation, 2);
            case 3:
                return new b((ReceiptsScreen) this.v, continuation, 3);
            case 4:
                return new b((PlanPageScreen) this.v, continuation, 4);
            case 5:
                return new b((MtaCarTypeScreen) this.v, continuation, 5);
            case 6:
                return new b((StudentStatusScreen) this.v, continuation, 6);
            case 7:
                return new b((CryptoSendRemainingLimitController) this.v, continuation, 7);
            case 8:
                return new b((BudgetOverviewController) this.v, continuation, 8);
            case 9:
                return new b((CreditCardSelectDueDateScreen) this.v, continuation, 9);
            case 10:
                return new b((AsftTimeSlotBookingScreen) this.v, continuation, 10);
            case 11:
                return new b((com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.e) this.v, continuation, 11);
            case 12:
                return new b((k) this.v, continuation, 12);
            case 13:
                return new b((yvd.c) this.v, continuation, 13);
            case 14:
                return new b((FreelancerPluginPreviewScreen) this.v, continuation, 14);
            case 15:
                return new b((RevPointsGiftcardsSearchScreen) this.v, continuation, 15);
            case 16:
                return new b((AirportLoungesAmenitiesScreen) this.v, continuation, 16);
            case 17:
                return new b((yx8.c) this.v, continuation, 17);
            case 18:
                return new b((s) this.v, continuation, 18);
            case 19:
                return new b((ComplexAnalyticsSectorAllocationController) this.v, continuation, 19);
            case 20:
                return new b((yy.c) this.v, continuation, 20);
            case 21:
                return new b((com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.a) this.v, continuation, 21);
            case 22:
                return new b((RevPointsTrophyRoomHighlightsSharingScreen) this.v, continuation, 22);
            case 23:
                return new b((z0c.i) this.v, continuation, 23);
            case 24:
                return new b((f0) this.v, continuation, 24);
            case 25:
                return new b((InsightDetailsBottomSheetScreen) this.v, continuation, 25);
            case 26:
                return new b((TaxHubAssessmentScreen) this.v, continuation, 26);
            case 27:
                return new b((TravelExperiencesPriceBreakdownScreen) this.v, continuation, 27);
            case 28:
                return new b((com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.a) this.v, continuation, 28);
            default:
                return new b((ApmRecipientDetailsNewScreen) this.v, continuation, 29);
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
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((b) create((l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((b) create((m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v105, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v118, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v92, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 22;
        int i3 = 0;
        int i5 = 2;
        Continuation continuation = null;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_accounts_screen.a) ((f) ((LinkedAccountsConsentScreen) obj3).O.getValue())).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ym2.i) ((ym2.e) ((ThemesGalleryController) obj3).N.getValue())).B2();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ym2.i iVar = (ym2.i) obj3;
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ymf.k) ((ymf.f) ((ReceiptsScreen) obj3).N.getValue())).B2();
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                KProperty[] kPropertyArr = PlanPageScreen.X;
                ScreenContentRecyclerView screenContentRecyclerViewF3 = ((PlanPageScreen) obj3).f3();
                Intrinsics.checkNotNullParameter(screenContentRecyclerViewF3, "<this>");
                Intrinsics.checkNotNullParameter("benefit_category_header", "listIdPrefix");
                enk.h.b(screenContentRecyclerViewF3, enk.h.a(screenContentRecyclerViewF3, "benefit_category_header"));
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((MtaCarTypeScreen) obj3).m2().onBackPressed();
                break;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ynk.i) ((ynk.f) ((StudentStatusScreen) obj3).P.getValue())).C2(e.a.f315497a);
                break;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                yq5.c cVar = (yq5.c) ((yq5.b) ((CryptoSendRemainingLimitController) obj3).R.getValue());
                cVar.o.getClass();
                cVar.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("question.what-are-the-limits-on-crypto-withdrawal", 2))));
                break;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((n) ((BudgetOverviewController) obj3).R2()).B2();
                break;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                yu4.g gVar = (yu4.g) ((CreditCardSelectDueDateScreen) obj3).R.getValue();
                gVar.getClass();
                gVar.n2(new y7i.h(gVar, continuation, i2), new p(gVar, 27));
                break;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a) ((AsftTimeSlotBookingScreen) obj3).d()).B2();
                break;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.e eVar = (com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.e) obj3;
                eVar.H2(eVar.f64428r, new ysk.a(25));
                r map = r.intervalRange(1L, 7L, 1L, 1L, TimeUnit.SECONDS).map(new yua.h(new ysk.a(i2), 1)).map(new yua.h(new yv2.n(eVar, 1), i5));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                yji.l.a1(eVar, rd0.e.b(map), null, new com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.d(eVar, null), new yv2.p(eVar, continuation, i5), 1);
                break;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k) obj3).C2(yv8.f.f317144a);
                break;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List stakingPockets = ((yvd.c) obj3).f317164b.a();
                Intrinsics.checkNotNullParameter(stakingPockets, "stakingPockets");
                List<mud.a> list = stakingPockets;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (mud.a stakingPocketEntity : list) {
                    Intrinsics.checkNotNullParameter(stakingPocketEntity, "stakingPocketEntity");
                    arrayList.add(new zvd.b(stakingPocketEntity.f209017a, stakingPocketEntity.f209018b, hx7.a.v(stakingPocketEntity.f209019c), hx7.a.v(stakingPocketEntity.d), hx7.a.v(stakingPocketEntity.e)));
                }
                break;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((yw6.g) ((yw6.e) ((FreelancerPluginPreviewScreen) obj3).P.getValue())).B2();
                break;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ywb.m) ((RevPointsGiftcardsSearchScreen) obj3).R2()).B2();
                break;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((AirportLoungesAmenitiesScreen) obj3).m2().onBackPressed();
                break;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                om0.b bVar = ((yx8.c) obj3).f317597m;
                bVar.f226492c.init();
                j jVar = bVar.f226490a;
                Unit unit = Unit.f186387a;
                jVar.onNext(unit);
                break;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((yxg.i) ((yxg.d) ((ComplexAnalyticsSectorAllocationController) obj3).P.getValue())).B2();
                break;
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                yy.c cVar2 = (yy.c) obj3;
                sx.a aVar22 = cVar2.f317737n;
                long j2 = cVar2.f317740r.f266542a.get();
                cVar2.f317741s.getClass();
                ((sx.b) aVar22).k((System.currentTimeMillis() - j2) / ((double) 1000));
                break;
            case 21:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.D2(((com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.a) obj3).f83841r);
                break;
            case 22:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((z0c.i) ((z0c.e) ((RevPointsTrophyRoomHighlightsSharingScreen) obj3).P.getValue())).B2();
                break;
            case 23:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                z0c.i iVar2 = (z0c.i) obj3;
                iVar2.H2(iVar2.f318210p, new ua2.r(17, iVar2.o.b(false)));
                break;
            case 24:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f0 f0Var = (f0) obj3;
                break;
            case 25:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((z18.b) ((InsightDetailsBottomSheetScreen) obj3).T.getValue()).C2(q.f5292a);
                break;
            case 26:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f) ((TaxHubAssessmentScreen) obj3).d()).B2();
                break;
            case 27:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((TravelExperiencesPriceBreakdownScreen) obj3).m2().onBackPressed();
                break;
            case 28:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.a aVar31 = (com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.a) obj3;
                aVar31.H2(aVar31.f93110p, new xyh.n(((c1g.m) aVar31.o).a(), 18));
                break;
            default:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ApmRecipientDetailsNewScreen) obj3).m2().onBackPressed();
                break;
        }
        return Unit.f186387a;
    }
}
