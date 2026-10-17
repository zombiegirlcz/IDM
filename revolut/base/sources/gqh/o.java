package gqh;

import aii.q;
import android.os.Parcelable;
import aw0.n6;
import cli.y;
import com.google.gson.reflect.TypeToken;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.chat.ui.archive.ArchiveScreen;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.account_picker.AccountPickerScreen;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.EnrollmentDetailsScreen;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.consent.RecoveryPhraseConsentScreen;
import com.revolut.feature.direct_deposit.impl.R$string;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.preview.DirectDepositPreviewScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.document.text.SimpleTextDocumentScreen;
import com.revolut.feature.invest_feed.impl.widgets.analytics.screen.AnalyticsMethodScreen;
import com.revolut.feature.junior.isa.impl.ui.child_picker.JuniorIsaChildPickerScreen;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.retail.cfd.impl.screens.cash_balance.CfdCashBalanceController;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.RevPointsSpareChangeFullGridController;
import com.revolut.feature.shared.help_centre.impl.faq.screens.faqsearch.FaqSearchRev10Screen;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.TravelController;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.redeem_options.TradeRevPointsRedeemOptionsScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.TransferProgressScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.bookings.past.TravelFlightsPastBookingsScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.new_screener.SaveScreenerCollectionScreen;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.eligibility_criteria.EligibilityCriteriaController;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.confirm_edit_dates.TravelItineraryConfirmEditDatesContract$InputData;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.confirm_edit_dates.TravelItineraryConfirmEditDatesController;
import dsh.t;
import gsh.a0;
import gyi.d0;
import h3b.v;
import hb1.e;
import ip0.um0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.j0;
import nii.n1;
import nii.u1;
import nii.w1;
import nii.y0;
import vkm.j2;
import zh9.u0;
import zhm.h0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o((SaveScreenerCollectionScreen) this.v, continuation, 0);
            case 1:
                return new o((AddEditAssetController) this.v, continuation, 1);
            case 2:
                return new o((a0) this.v, continuation, 2);
            case 3:
                return new o((TravelController) this.v, continuation, 3);
            case 4:
                return new o((EligibilityCriteriaController) this.v, continuation, 4);
            case 5:
                return new o((SimpleTextDocumentScreen) this.v, continuation, 5);
            case 6:
                return new o((TravelItineraryConfirmEditDatesController) this.v, continuation, 6);
            case 7:
                return new o((d0) this.v, continuation, 7);
            case 8:
                return new o((gzj.d) this.v, continuation, 8);
            case 9:
                return new o((com.revolut.feature.topup_screen.impl.mcy.account_verification.c) this.v, continuation, 9);
            case 10:
                return new o((AnalyticsMethodScreen) this.v, continuation, 10);
            case 11:
                return new o((RevPointsSpareChangeFullGridController) this.v, continuation, 11);
            case 12:
                return new o((TradeRevPointsRedeemOptionsScreen) this.v, continuation, 12);
            case 13:
                return new o((h32.k) this.v, continuation, 13);
            case 14:
                return new o((CfdCashBalanceController) this.v, continuation, 14);
            case 15:
                return new o((ArchiveScreen) this.v, continuation, 15);
            case 16:
                return new o((h53.c) this.v, continuation, 16);
            case 17:
                return new o((h59.c) this.v, continuation, 17);
            case 18:
                return new o((TravelFlightsPastBookingsScreen) this.v, continuation, 18);
            case 19:
                return new o((RecoveryPhraseConsentScreen) this.v, continuation, 19);
            case 20:
                return new o((h7k.i) this.v, continuation, 20);
            case 21:
                return new o((FaqSearchRev10Screen) this.v, continuation, 21);
            case 22:
                return new o((EnrollmentDetailsScreen) this.v, continuation, 22);
            case 23:
                return new o((DirectDepositPreviewScreen) this.v, continuation, 23);
            case 24:
                return new o((JuniorIsaChildPickerScreen) this.v, continuation, 24);
            case 25:
                return new o((com.revolut.feature.wealth.impl.ui.flows.add_money.b) this.v, continuation, 25);
            case 26:
                return new o((AccountPickerScreen) this.v, continuation, 26);
            case 27:
                return new o((com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.e) this.v, continuation, 27);
            case 28:
                return new o((TransferProgressScreen) this.v, continuation, 28);
            default:
                return new o((com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((o) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((o) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((o) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((o) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((o) create((mzj.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((o) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((o) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((o) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((o) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((o) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((o) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((o) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((o) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((o) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((o) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((o) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((o) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((o) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((o) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((o) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((o) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((o) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((o) create((rp0.a0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((o) create((qy3.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((o) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v114, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v121, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v144, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v156, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        int i = 6;
        int i2 = 14;
        int i3 = 0;
        int i5 = 1;
        Continuation continuation = null;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVar = (e) ((SaveScreenerCollectionScreen) this.v).N.getValue();
                eVar.getClass();
                eVar.n2(new d(eVar, continuation, i3), new whi.b(i));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d) ((AddEditAssetController) this.v).R2()).B2();
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                try {
                    ue0.c cVar = ((a0) this.v).f146461a;
                    Type type = new TypeToken<Map<String, ? extends List<? extends gsh.a>>>() { // from class: com.revolut.feature.widgets.impl.data.WidgetsLocalRepositoryImpl$ensureLoaded$2$1$values$1
                    }.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    Map map = (Map) cVar.T2("widget_values", type);
                    if (map != null) {
                        a0 a0Var = (a0) this.v;
                        for (Map.Entry entry : map.entrySet()) {
                            String str = (String) entry.getKey();
                            List<gsh.a> list = (List) entry.getValue();
                            ArrayList arrayList = new ArrayList(w.t(list, 10));
                            for (gsh.a aVar4 : list) {
                                String widgetType = aVar4.getWidgetType();
                                t state = aVar4.getState();
                                if (state == null) {
                                    state = t.SEEN;
                                }
                                Map config = aVar4.getConfig();
                                if (config == null) {
                                    config = r0.g();
                                }
                                arrayList.add(new dsh.i(widgetType, i2b.a.c(config), state));
                            }
                            a0Var.c(str).d(arrayList);
                        }
                    }
                    break;
                } catch (Exception e) {
                    if (e instanceof CancellationException) {
                        throw e;
                    }
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
                ((a0) this.v).f146463c = true;
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TravelController) this.v).e3().B2();
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((guj.d) ((EligibilityCriteriaController) this.v).V.getValue()).B2();
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((gv7.e) ((SimpleTextDocumentScreen) this.v).R.getValue()).B2();
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gvj.b bVar = (gvj.b) ((TravelItineraryConfirmEditDatesController) this.v).S.getValue();
                TravelItineraryConfirmEditDatesContract$InputData travelItineraryConfirmEditDatesContract$InputData = bVar.o;
                puj.g gVar = new puj.g(travelItineraryConfirmEditDatesContract$InputData.d, travelItineraryConfirmEditDatesContract$InputData.e);
                bVar.l2(new gm6.j(bVar, gVar, continuation, 18), new gmk.j(bVar, 27));
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((d0) this.v).v.a();
                return Unit.f186387a;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((r60.d) ((gzj.d) this.v).f148148r).d.f256147a.c();
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.topup_screen.impl.mcy.account_verification.c) this.v).C1(u0.b(gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6)))));
                return Unit.f186387a;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                AnalyticsMethodScreen analyticsMethodScreen = (AnalyticsMethodScreen) this.v;
                analyticsMethodScreen.c3(new h28.f(analyticsMethodScreen.K));
                return Unit.f186387a;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a) ((RevPointsSpareChangeFullGridController) this.v).e3()).C2(RevPointsSpareChangeControllerApi$Result.Skipped.f84132a);
                return Unit.f186387a;
            case 12:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((h2f.c) ((TradeRevPointsRedeemOptionsScreen) this.v).U.getValue()).C2(q.f5292a);
                return Unit.f186387a;
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((h32.k) this.v).B2();
                return Unit.f186387a;
            case 14:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((v) ((CfdCashBalanceController) this.v).R2()).B2();
                return Unit.f186387a;
            case 15:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ArchiveScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 16:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar2 = ((h53.c) this.v).e;
                h53.c.Companion.getClass();
                return cVar2.T2("STORAGE_KEY_SUGGESTED_PROMPTS", h53.c.f149445g);
            case 17:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return j6.a.k(b59.d.class, ((h59.c) this.v).f149515b, "MARKET_ALERT_SETTINGS_STORAGE_KEY");
            case 18:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((h5g.e) ((TravelFlightsPastBookingsScreen) this.v).N.getValue()).B2();
                return Unit.f186387a;
            case 19:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h66.e eVar2 = (h66.e) ((RecoveryPhraseConsentScreen) this.v).T.getValue();
                y yVar = eVar2.f149601s;
                h66.a aVar22 = (h66.a) ((j2) yVar.f22677a).getValue();
                if (!aVar22.d && aVar22.f149593a && aVar22.f149594b && aVar22.f149595c) {
                    eVar2.H2(yVar, new h5i.b(i2));
                    eVar2.l2(new gvc.m(eVar2, continuation, 8), new yi5.b(26));
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j60.a.v(((h7k.i) this.v).f149915l, false, null, 3);
                return Unit.f186387a;
            case 21:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((h8d.v) ((FaqSearchRev10Screen) this.v).T2()).u2();
                return Unit.f186387a;
            case 22:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((EnrollmentDetailsScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 23:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h96.j jVar = (h96.j) ((DirectDepositPreviewScreen) this.v).O.getValue();
                int i6 = h96.h.f150182a[jVar.o.f71953a.ordinal()];
                if (i6 == 1) {
                    yji.l.a1(jVar, jVar.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.direct_deposit_shared_success_dialog_note, null, null, 14), (Clause) new TextLocalisedClause(R$string.direct_deposit_shared_success_dialog_message, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, new TextLocalisedClause(R$string.direct_deposit_shared_success_dialog_done, null, null, 14), new TextLocalisedClause(R$string.direct_deposit_shared_success_dialog_continue_editing, null, null, 14)), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4076), false, 5)), null, null, new h96.i(jVar, continuation, i5), 3);
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar.B2();
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((oki.h) ((ha8.f) ((JuniorIsaChildPickerScreen) this.v).Q.getValue())).B2();
                return Unit.f186387a;
            case 25:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.wealth.impl.ui.flows.add_money.b) this.v).f95539r);
                return Unit.f186387a;
            case 26:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((hb1.h) ((hb1.f) ((AccountPickerScreen) this.v).Z2().f112643g.get())).v2(e.a.f150552a);
                return Unit.f186387a;
            case 27:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.e eVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.e) this.v;
                eVar3.H2(eVar3.f67685r, new ha1.k(28));
                return Unit.f186387a;
            case 28:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TransferProgressScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vii.c cVar3 = ((com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a) this.v).u;
                Unit unit = Unit.f186387a;
                cVar3.b(unit);
                return unit;
        }
    }
}
