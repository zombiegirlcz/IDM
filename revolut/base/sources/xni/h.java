package xni;

import android.os.SystemClock;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.bugreport.api.R$string;
import com.revolut.feature.credit.card.impl.ui.revpoints_locked.CreditCardRevPointsLockedBottomDialogScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees.FreelancerAcquiringPaymentFeesScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.unplugged.TelematicsDeviceUnpluggedScreen;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.reward.ChallengeEditRewardScreen;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.AllReferralsController;
import com.revolut.feature.retail.savings.impl.ui.details.SavingsDetailsScreen;
import com.revolut.feature.revolut_x_balances.impl.fiat.RevolutXFiatBalancesDetailsScreen;
import com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.TrustedLocationsListScreen;
import com.revolut.feature.settings.preview.displayCurrency.DisplayCurrencyPreviewController;
import com.revolut.feature.topup_screen.impl.flows.topup.limits.TopUpLimitsBottomSheetController;
import com.revolut.feature.trading.impl.ui.holdings.information.entry.HoldingsInformationEntryController;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.retail.feature.adjust_analytics.impl.ui.AdjustAnalyticsController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.airport_search.AsftAirportSearchScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.AirportLoungesPassActivityScreen;
import com.revolut.sso.impl.ui.revolut_id.main.RevolutIDMainScreen;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k71.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o0;
import rp0.j;
import rp0.t;
import rp0.y;
import skm.a2;
import skm.e0;
import vkm.j2;
import w5b.u;
import w5b.u7;
import wim.z;
import xo8.h0;
import xo8.l;
import y3f.v;
import y5b.i0;
import y5b.p;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends i implements Function2 {
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
                return new h((g) this.v, continuation, 0);
            case 1:
                return new h((xo.d) this.v, continuation, 1);
            case 2:
                return new h((h0) this.v, continuation, 2);
            case 3:
                return new h((SavingsDetailsScreen) this.v, continuation, 3);
            case 4:
                return new h((ChallengeEditRewardScreen) this.v, continuation, 4);
            case 5:
                return new h((RevolutIDMainScreen) this.v, continuation, 5);
            case 6:
                return new h((TelematicsDeviceUnpluggedScreen) this.v, continuation, 6);
            case 7:
                return new h((xrg.d) this.v, continuation, 7);
            case 8:
                return new h((AdjustAnalyticsController) this.v, continuation, 8);
            case 9:
                return new h((AsftAirportSearchScreen) this.v, continuation, 9);
            case 10:
                return new h((CreditCardRevPointsLockedBottomDialogScreen) this.v, continuation, 10);
            case 11:
                return new h((FreelancerAcquiringPaymentFeesScreen) this.v, continuation, 11);
            case 12:
                return new h((xv5.g) this.v, continuation, 12);
            case 13:
                return new h((TrustedLocationsListScreen) this.v, continuation, 13);
            case 14:
                return new h((xvj.e) this.v, continuation, 14);
            case 15:
                return new h((xvl.e) this.v, continuation, 15);
            case 16:
                return new h((AirportLoungesPassActivityScreen) this.v, continuation, 16);
            case 17:
                return new h((AllReferralsController) this.v, continuation, 17);
            case 18:
                return new h((TopUpLimitsBottomSheetController) this.v, continuation, 18);
            case 19:
                return new h((vzh.d) this.v, continuation, 19);
            case 20:
                return new h((com.revolut.feature.card_management.impl.ui.change_pin.b) this.v, continuation, 20);
            case 21:
                return new h((com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.a) this.v, continuation, 21);
            case 22:
                return new h((com.revolut.feature.freelancer.impl.ui.sales.new_sale.a) this.v, continuation, 22);
            case 23:
                return new h((com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.d) this.v, continuation, 23);
            case 24:
                return new h((v) this.v, continuation, 24);
            case 25:
                return new h((RevolutXFiatBalancesDetailsScreen) this.v, continuation, 25);
            case 26:
                return new h((DisplayCurrencyPreviewController) this.v, continuation, 26);
            case 27:
                return new h((HoldingsInformationEntryController) this.v, continuation, 27);
            case 28:
                return new h((p) this.v, continuation, 28);
            default:
                return new h((i0) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v98, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        y yVar;
        TextLocalisedClause textLocalisedClause3;
        TextLocalisedClause textLocalisedClause4;
        int i = this.u;
        int i2 = 1;
        Continuation continuation = null;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVar = (g) obj3;
                gVar.X2(gVar.f307512m, new xlj.h(27));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                xo.d dVar = (xo.d) obj3;
                if (dVar.f307532p) {
                    return Unit.f186387a;
                }
                j jVar = dVar.k;
                dVar.f307530m.getClass();
                jVar.c(new rp0.i(new TextLocalisedClause(R$string.bug_reporting_banner_title, null, null, 14), new TextLocalisedClause(R$string.bug_reporting_banner_subtitle, null, null, 14), LayeredImage.Companion.p(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_bug, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorAccent, 8.0f, 40.0f), null), true);
                a2 a2Var = dVar.o;
                if (a2Var != null) {
                    e0.l(a2Var, "Restart auto dismiss timer", null);
                }
                dVar.o = e0.C(dVar, null, null, new xo.c(dVar, continuation, i2), 3);
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((h0) obj3).C2(l.f307720a);
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((SavingsDetailsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ChallengeEditRewardScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((RevolutIDMainScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((TelematicsDeviceUnpluggedScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                xrg.d dVar2 = (xrg.d) obj3;
                dVar2.o.getClass();
                return ((a80.h) dVar2.f308342m).m(zk0.a.INTERNAL_CACHE, p.a.n(SystemClock.elapsedRealtime(), "voice-message-", ".m4a"));
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                xsi.p pVar = (xsi.p) ((AdjustAnalyticsController) obj3).d();
                xsi.b bVar = (xsi.b) ((xsi.c) ((j2) pVar.u.f22677a).getValue()).f308526a.getContent();
                if (bVar != null) {
                    long j2 = bVar.f308524b;
                    long j3 = bVar.f308525c.f308520a;
                    boolean z = bVar.d;
                    if (z || j3 <= 0 || j3 == j2) {
                        tsi.b bVar2 = pVar.f308542s;
                        boolean Z = k.Z(bVar.f308523a);
                        if (!z && j3 >= j2) {
                            i2 = 0;
                        }
                        ((wsi.a) bVar2).getClass();
                        if (Z) {
                            if (i2 != 0) {
                                textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.feature.adjust_analytics.api.R$string.analytics_adjust_amount_recurrent_exclude_title, null, null, 14);
                                textLocalisedClause4 = new TextLocalisedClause(com.revolut.retail.feature.adjust_analytics.api.R$string.analytics_adjust_amount_recurrent_exclude_description, null, null, 14);
                            } else {
                                textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.feature.adjust_analytics.api.R$string.analytics_adjust_amount_recurrent_include_title, null, null, 14);
                                textLocalisedClause4 = new TextLocalisedClause(com.revolut.retail.feature.adjust_analytics.api.R$string.analytics_adjust_amount_recurrent_include_description, null, null, 14);
                            }
                            t tVar = new t(textLocalisedClause3, textLocalisedClause4, null, 28);
                            LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ALL_TRANSACTIONS_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.retail.feature.adjust_analytics.api.R$string.analytics_adjust_amount_recurrent_exclude_all, null, null, 14), false, null, null, null, null, 1000);
                            yp0.b.r(model, R$attr.uikit_dp8, 0, 0, 0, 14);
                            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("SINGLE_TRANSACTION_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.retail.feature.adjust_analytics.api.R$string.analytics_adjust_amount_recurrent_exclude_single, null, null, 14), false, null, null, null, null, 1000);
                            yp0.b.r(model2, 0, R$attr.uikit_dp24, 0, 0, 13);
                            yVar = new y(zhm.v.k(model, model2), tVar, null, null, null, null, 1020);
                        } else {
                            if (i2 != 0) {
                                textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.adjust_analytics.api.R$string.analytics_adjust_amount_recurrent_exclude_title, null, null, 14);
                                textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.adjust_analytics.api.R$string.analytics_adjust_amount_merchant_exclude_description, null, null, 14);
                            } else {
                                textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.adjust_analytics.api.R$string.analytics_adjust_amount_recurrent_include_title, null, null, 14);
                                textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.adjust_analytics.api.R$string.analytics_adjust_amount_merchant_include_description, null, null, 14);
                            }
                            t tVar2 = new t(textLocalisedClause, textLocalisedClause2, null, 28);
                            LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("ALL_TRANSACTIONS_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.retail.feature.adjust_analytics.api.R$string.analytics_adjust_amount_merchant_cta_all, null, null, 14), false, null, null, null, null, 1000);
                            yp0.b.r(model3, R$attr.uikit_dp8, 0, 0, 0, 14);
                            LargeActionButtonDelegate.Model model4 = new LargeActionButtonDelegate.Model("SINGLE_TRANSACTION_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.retail.feature.adjust_analytics.api.R$string.analytics_adjust_amount_recurrent_exclude_single, null, null, 14), false, null, null, null, null, 1000);
                            yp0.b.r(model4, 0, R$attr.uikit_dp24, 0, 0, 13);
                            yVar = new y(zhm.v.k(model3, model4), tVar2, null, null, null, null, 1020);
                        }
                        pVar.f308541r.x(yVar);
                    } else {
                        pVar.I2(false);
                    }
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((AsftAirportSearchScreen) obj3).R2().B2();
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                xu4.g gVar2 = (xu4.g) ((CreditCardRevPointsLockedBottomDialogScreen) obj3).P.getValue();
                gVar2.C2(new xu4.d(gVar2.o.f69628a));
                return Unit.f186387a;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees.a) ((xu6.e) ((FreelancerAcquiringPaymentFeesScreen) obj3).P.getValue())).B2();
                return Unit.f186387a;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((xv5.g) obj3).f309210a.G(Boolean.FALSE, "KEY_CURRENCY_DISPLAY_SHORTCUT_TIP", z.d(o0.b(Boolean.TYPE)));
                return Unit.f186387a;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.a) ((TrustedLocationsListScreen) obj3).d()).B2();
                return Unit.f186387a;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List listE = ((xvj.e) obj3).f309287a.e();
                ArrayList arrayList = new ArrayList(w.t(listE, 10));
                Iterator it8 = listE.iterator();
                while (it8.hasNext()) {
                    arrayList.add(hx7.e.v((svj.a) it8.next()));
                }
                return arrayList;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((xvl.e) obj3).d.b3();
                return Unit.f186387a;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.a) ((AirportLoungesPassActivityScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.b) ((AllReferralsController) obj3).R2()).B2();
                return Unit.f186387a;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((TopUpLimitsBottomSheetController) obj3).R.C2(ste.t.f265575a);
                return Unit.f186387a;
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((xyh.c) ((vzh.d) obj3).e).Z2();
                return Unit.f186387a;
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.card_management.impl.ui.change_pin.b) obj3).q2();
                return Unit.f186387a;
            case 21:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.a) obj3).f82080r.c3();
                return Unit.f186387a;
            case 22:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.D2(((com.revolut.feature.freelancer.impl.ui.sales.new_sale.a) obj3).f74160w);
                return Unit.f186387a;
            case 23:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.D2(((com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.d) obj3).f79912s);
                return Unit.f186387a;
            case 24:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                t3f.o oVar = (t3f.o) ((v) obj3).f310732h;
                if (((jte.d) oVar.e).c(FeatureWealthApi$Toggles.InvestTransactionsFullHistory.f95162c)) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.INFO, "TradingTransactionsLoader", "History loading requested", null, null, 16);
                    oVar.g();
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.VERBOSE, "TradingTransactionsLoader", "Loading request skipped: full history is disabled", null, null, 16);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.revolut_x_balances.impl.fiat.a) ((y4c.f) ((RevolutXFiatBalancesDetailsScreen) obj3).R.getValue())).B2();
                return Unit.f186387a;
            case 26:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((DisplayCurrencyPreviewController) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 27:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.trading.impl.ui.holdings.information.entry.a) ((HoldingsInformationEntryController) obj3).R2()).B2();
                return Unit.f186387a;
            case 28:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                u uVar = (u) ((p) obj3).f311058b.T2("KEY_BILLING", u.class);
                if (uVar != null) {
                    return x5b.a.a(uVar);
                }
                return null;
            default:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                u7 u7Var = (u7) ((i0) obj3).f311046b.T2("KEY_WIDGET", u7.class);
                if (u7Var != null) {
                    return x5b.i.a(u7Var);
                }
                return null;
        }
    }
}
