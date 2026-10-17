package az;

import adk.v0;
import aii.q;
import akg.n;
import aw0.n6;
import b4g.f0;
import b4g.m0;
import b97.l;
import beg.s;
import com.revolut.camerakit.revolut.ui.flow.steps.camera.terminal_ui.CameraKitTerminalCameraViewController;
import com.revolut.feature.apm.payid.impl.screen.settings.SettingsScreen;
import com.revolut.feature.card_screen.api.navigation.CardSelectionNavigationData$InputData;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.settings_info.InsightSettingsInfoBottomSheetScreen;
import com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.prompts.ChangePlayStoreCountryContract$OutputData;
import com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.prompts.ChangePlayStoreCountryController;
import com.revolut.feature.revolut_shop.ui.screen.dashboard.IppShopDashboardScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.troubleshooter.CardTroubleshooterScreen;
import com.revolut.feature.subaccount.impl.ui.details.screen.SubaccountDetailsScreen;
import com.revolut.feature.trading.impl.ui.holdings.information.section.info.HoldingsInformationSectionInfoController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance.ManagedPortfolioPerformanceExtensionContract$Action$ExploreInsights;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.AccountInformationScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.discount.TravelExperiencesPointsDiscountInfoScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.child_age.TravelHotelsChildAgePickerController;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.amendment.TravelHotelsRoomsSelectionAmendmentScreen;
import com.revolut.feature_crypto_order_flow.impl.order_summary.firm_price_deviance.FirmPriceDevianceBottomSheetController;
import com.revolut.retail.feature.airportlounges.api.model.SchemeAirportLoungesFooter;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.how_to_access.SchemeLoungesHowToAccessScreen;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import efm.r;
import ha3.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import le.u1;
import nii.n1;
import te0.w;
import vkm.j2;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes16.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i((CameraKitTerminalCameraViewController) this.v, continuation, 0);
            case 1:
                return new i((SchemeLoungesHowToAccessScreen) this.v, continuation, 1);
            case 2:
                return new i((FirmPriceDevianceBottomSheetController) this.v, continuation, 2);
            case 3:
                return new i((InsightSettingsInfoBottomSheetScreen) this.v, continuation, 3);
            case 4:
                return new i((TravelExperiencesPointsDiscountInfoScreen) this.v, continuation, 4);
            case 5:
                return new i((IppShopDashboardScreen) this.v, continuation, 5);
            case 6:
                return new i((m0) this.v, continuation, 6);
            case 7:
                return new i((com.revolut.feature.credit.application.plugins.impl.ui.akahu.b) this.v, continuation, 7);
            case 8:
                return new i((com.revolut.feature.joint.impl.ui.invite_flow.d) this.v, continuation, 8);
            case 9:
                return new i((HoldingsInformationSectionInfoController) this.v, continuation, 9);
            case 10:
                return new i((b6a.e) this.v, continuation, 10);
            case 11:
                return new i((com.revolut.feature_move_money.impl.amount.c) this.v, continuation, 11);
            case 12:
                return new i((b73.i) this.v, continuation, 12);
            case 13:
                return new i((com.revolut.feature.giro.impl.ui.form.b) this.v, continuation, 13);
            case 14:
                return new i((b7f.b) this.v, continuation, 14);
            case 15:
                return new i((FaqArticleScreen) this.v, continuation, 15);
            case 16:
                return new i((SubaccountDetailsScreen) this.v, continuation, 16);
            case 17:
                return new i((l) this.v, continuation, 17);
            case 18:
                return new i((CardTroubleshooterScreen) this.v, continuation, 18);
            case 19:
                return new i((AccountInformationScreen) this.v, continuation, 19);
            case 20:
                return new i((bb.b) this.v, continuation, 20);
            case 21:
                return new i((SettingsScreen) this.v, continuation, 21);
            case 22:
                return new i((ChangePlayStoreCountryController) this.v, continuation, 22);
            case 23:
                return new i((TravelHotelsAmendmentConfirmationScreen) this.v, continuation, 23);
            case 24:
                return new i((bcj.b) this.v, continuation, 24);
            case 25:
                return new i((TravelHotelsChildAgePickerController) this.v, continuation, 25);
            case 26:
                return new i((bdk.c) this.v, continuation, 26);
            case 27:
                return new i((bdk.f) this.v, continuation, 27);
            case 28:
                return new i((TravelHotelsRoomsSelectionAmendmentScreen) this.v, continuation, 28);
            default:
                return new i((bek.g) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((i) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((i) create((ManagedPortfolioPerformanceExtensionContract$Action$ExploreInsights) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((i) create((bcj.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((i) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v100, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v75, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v88, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r map;
        r rVarW;
        int i = this.u;
        int i2 = 29;
        int i3 = 0;
        Continuation continuation = null;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k) ((CameraKitTerminalCameraViewController) obj3).Q.getValue()).I2(b.f11273a);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                azi.j jVar = (azi.j) ((azi.d) ((SchemeLoungesHowToAccessScreen) obj3).Q.getValue());
                SchemeAirportLoungesFooter.Action action = ((azi.c) ((j2) jVar.f11474s.f22677a).getValue()).f11463b.f98940b;
                if (action != null) {
                    jVar.l2(new azi.i(jVar, action, null), new ax9.d(1, jVar, czi.c.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 3));
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                b0i.e eVar = (b0i.e) ((FirmPriceDevianceBottomSheetController) obj3).S.getValue();
                OrderQuote orderQuote = (OrderQuote) ((b0i.a) ((j2) eVar.f11678q.f22677a).getValue()).f11673b.getContent();
                if (orderQuote != null) {
                    eVar.C2(new nyh.b(orderQuote));
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((b28.b) ((InsightSettingsInfoBottomSheetScreen) obj3).U.getValue()).C2(q.f5292a);
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((b3g.d) ((TravelExperiencesPointsDiscountInfoScreen) obj3).O.getValue()).B2();
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                zji.d dVar = ((oki.h) ((IppShopDashboardScreen) obj3).R2()).f226129n;
                Unit unit = Unit.f186387a;
                dVar.a(unit);
                return unit;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return j6.a.k(String.class, ((m0) obj3).f12352c, "SEARCH_SESSION_ID_STORAGE_KEY");
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.akahu.b) obj3).f67029s.e(false);
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.D2(((com.revolut.feature.joint.impl.ui.invite_flow.d) obj3).D);
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((b5f.d) ((HoldingsInformationSectionInfoController) obj3).L.getValue()).B2();
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return j6.a.k(w5a.f.class, ((b6a.e) obj3).f12554c, "payments_migration_cache_key");
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature_move_money.impl.amount.c) obj3).B2();
                return Unit.f186387a;
            case 12:
                b73.i iVar = (b73.i) obj3;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                CardSelectionNavigationData$InputData cardSelectionNavigationData$InputData = iVar.o;
                int i5 = 26;
                if (cardSelectionNavigationData$InputData.f) {
                    rVarW = ((x) iVar.f12880s).z(b93.k.CREATED_DATE);
                } else {
                    List list = cardSelectionNavigationData$InputData.f65353g;
                    int i6 = 1;
                    if (list != null) {
                        map = r.just(list);
                        Intrinsics.checkNotNullExpressionValue(map, "just(...)");
                    } else {
                        n nVarC = iVar.f12878q.c();
                        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
                        r rVarDistinctUntilChanged = rd0.e.c(nVarC, gVar).filter(new b0a.h(24, new b73.h(i6))).map(new b0a.h(25, new b73.h(2))).distinctUntilChanged();
                        r rVarDistinctUntilChanged2 = rd0.e.c(bla.b.b(iVar.u, "YOUTH"), gVar).map(new b0a.h(i5, new b73.h(3))).flatMap(new b0a.h(19, new b73.g(iVar, i3))).distinctUntilChanged();
                        r rVarC = rd0.e.c(mo3.a.g(iVar.v.a(), null, null, 3), gVar);
                        Intrinsics.h(rVarDistinctUntilChanged);
                        Intrinsics.h(rVarDistinctUntilChanged2);
                        map = w.m(rVarDistinctUntilChanged, rVarDistinctUntilChanged2, rVarC).map(new b0a.h(20, new f0(27)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    }
                    r rVarFlatMap = map.flatMap(new b0a.h(23, new b73.g(iVar, i6)));
                    Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
                    rVarW = nim.a.w(rVarFlatMap, new b73.h(i3));
                }
                return yji.l.a1(iVar, rd0.e.b(w.l(u1.d(rVarW, iVar.f12877p.a(false)), n14.k.r(nim.a.w(rd0.e.c(iVar.f12881t.e(), kotlin.coroutines.g.f186406a), new f0(i5)), r0.g()))), null, null, new avk.i(iVar, continuation, i2), 3);
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.giro.impl.ui.form.b) obj3).B2();
                return Unit.f186387a;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                b7f.b bVar = (b7f.b) obj3;
                bVar.f.N(bVar.f13034g.f91337a);
                return Unit.f186387a;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.shared.help_centre.impl.faq.screens.article.c) ((FaqArticleScreen) obj3).T2()).u2();
                return Unit.f186387a;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((SubaccountDetailsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                int i21 = l.i;
                return ((l) obj3).d();
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((b9d.n) ((b9d.i) ((CardTroubleshooterScreen) obj3).f86321d0.getValue())).u2();
                return Unit.f186387a;
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((AccountInformationScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bb.b bVar2 = (bb.b) obj3;
                ab.f fVar = (ab.f) j6.a.k(ab.f.class, bVar2.f14119a, "USER_DETAILS_STORAGE_KEY");
                if (fVar == null) {
                    return null;
                }
                bVar2.f14120b.getClass();
                return cb.a.a(fVar);
            case 21:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.apm.payid.impl.screen.settings.a) ((SettingsScreen) obj3).R2()).L2(bb2.q.f14151a);
                return Unit.f186387a;
            case 22:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.prompts.a) ((bb9.a) ((ChangePlayStoreCountryController) obj3).O.getValue())).C2(ChangePlayStoreCountryContract$OutputData.Close.f78445a);
                return Unit.f186387a;
            case 23:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a) ((TravelHotelsAmendmentConfirmationScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 24:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bcj.f fVar2 = ((bcj.b) obj3).d;
                Intrinsics.i(fVar2, "null cannot be cast to non-null type com.revolut.retail.feature.crypto_deposits.impl.ui.overview.directdepositextension.CryptoDirectDepositControllerExtensionContract.InternalModel");
                bcj.l lVar = (bcj.l) ((bcj.e) fVar2);
                vki.a aVar26 = lVar.o;
                xi0.b bVar3 = ((bcj.d) ((j2) aVar26.f22677a).getValue()).f14453a;
                wk5.a aVar27 = ((bcj.d) ((j2) aVar26.f22677a).getValue()).f14454b;
                if (bVar3 != null && aVar27 != null) {
                    lVar.V2(new bcj.k(lVar, bVar3, aVar27, null), new yi5.b(i2));
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bdg.d dVar2 = (bdg.d) ((TravelHotelsChildAgePickerController) obj3).U.getValue();
                dVar2.C2(new bdg.b(((bdg.a) ((j2) dVar2.o.f22677a).getValue()).f14598a));
                return Unit.f186387a;
            case 26:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                adk.i iVar2 = (adk.i) j6.a.k(adk.i.class, ((bdk.c) obj3).f14610c, "MILESTONE_REWARDS_KEY");
                if (iVar2 != null) {
                    return x5d.b.x(iVar2);
                }
                return null;
            case 27:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                v0 v0Var = (v0) j6.a.k(v0.class, ((bdk.f) obj3).f14614c, "MONTHLY_DRAW_HUB_KEY");
                if (v0Var != null) {
                    return xam.a.w(v0Var);
                }
                return null;
            case 28:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((s) ((TravelHotelsRoomsSelectionAmendmentScreen) obj3).d()).B2();
                return Unit.f186387a;
            default:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List listA = ((bek.g) obj3).f14869b.a();
                ArrayList arrayList = new ArrayList(zhm.w.t(listA, 10));
                Iterator it8 = listA.iterator();
                while (it8.hasNext()) {
                    arrayList.add(eek.a.a((cek.b) it8.next()));
                }
                return arrayList;
        }
    }
}
