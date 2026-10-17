package co7;

import aii.q;
import auc.d0;
import auc.n;
import auc.s;
import com.revolut.feature.apm.breb.impl.ui.keys.occupied_dialog.BrebOccupiedDialogController;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.status.ApmAliasClaimStatusScreen;
import com.revolut.feature.bank_account_switching.impl.ui.review.ltd_dialog.LtdConfirmationController;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.expiring_cards_bottom_sheet.ExpiringCardsBottomSheetScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.decline.MtaDeclineScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.SchemeInsuranceDetailsScreen;
import com.revolut.feature.licenses.impl.ui.licenses.LicensesController;
import com.revolut.feature.pix.impl.flow.pix_area.screens.trusted_list.PixTrustedListScreen;
import com.revolut.feature.pix.impl.flow.qr_request.screen.request.PixQrRequestScreen;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_categories.NotificationCategoriesViewController;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.deliveries.DeliveriesScreen;
import com.revolut.feature.spending_analytics.impl.ui.rev10.settings.SettingsController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details.PerformanceDetailsScreen;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.main_screen.TradingAddOnsMainScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.meta_collection.ScreenerMetaCollectionScreen;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.retail.feature.crypto.asset_details.common.api.ui.BaseCryptoAssetDetailsScreen;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.collection.RewardsHubCollectionScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.suspicious_recipient.SuspiciousRecipientController;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreen;
import cq6.k;
import csj.u;
import cuc.e0;
import cuc.r;
import cuc.t;
import cuc.z;
import d83.j;
import dcf.i0;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
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
                return new c((MtaDeclineScreen) this.v, continuation, 0);
            case 1:
                return new c((NotificationCategoriesViewController) this.v, continuation, 1);
            case 2:
                return new c((LtdConfirmationController) this.v, continuation, 2);
            case 3:
                return new c((ScreenerMetaCollectionScreen) this.v, continuation, 3);
            case 4:
                return new c((SettingsController) this.v, continuation, 4);
            case 5:
                return new c((u) this.v, continuation, 5);
            case 6:
                return new c((cuc.d) this.v, continuation, 6);
            case 7:
                return new c((r) this.v, continuation, 7);
            case 8:
                return new c((t) this.v, continuation, 8);
            case 9:
                return new c((z) this.v, continuation, 9);
            case 10:
                return new c((e0) this.v, continuation, 10);
            case 11:
                return new c((RewardsHubCollectionScreen) this.v, continuation, 11);
            case 12:
                return new c((InvestOrderEditScreen) this.v, continuation, 12);
            case 13:
                return new c((BrebOccupiedDialogController) this.v, continuation, 13);
            case 14:
                return new c((SchemeInsuranceDetailsScreen) this.v, continuation, 14);
            case 15:
                return new c((com.revolut.feature.topup_screen.impl.flow.add_card.b) this.v, continuation, 15);
            case 16:
                return new c((com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) this.v, continuation, 16);
            case 17:
                return new c((LicensesController) this.v, continuation, 17);
            case 18:
                return new c((ApmAliasClaimStatusScreen) this.v, continuation, 18);
            case 19:
                return new c((com.revolut.feature.travel.experiences.impl.ui.screen.questions.b) this.v, continuation, 19);
            case 20:
                return new c((PerformanceDetailsScreen) this.v, continuation, 20);
            case 21:
                return new c((ExpiringCardsBottomSheetScreen) this.v, continuation, 21);
            case 22:
                return new c((BaseCryptoAssetDetailsScreen) this.v, continuation, 22);
            case 23:
                return new c((d90.f) this.v, continuation, 23);
            case 24:
                return new c((db4.i) this.v, continuation, 24);
            case 25:
                return new c((PixTrustedListScreen) this.v, continuation, 25);
            case 26:
                return new c((DeliveriesScreen) this.v, continuation, 26);
            case 27:
                return new c((SuspiciousRecipientController) this.v, continuation, 27);
            case 28:
                return new c((PixQrRequestScreen) this.v, continuation, 28);
            default:
                return new c((TradingAddOnsMainScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v73, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v78, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IOException {
        int i = this.u;
        Continuation continuation = null;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((MtaDeclineScreen) obj3).m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((NotificationCategoriesViewController) obj3).m2().onBackPressed();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cp2.d dVar = (cp2.d) ((cp2.e) ((LtdConfirmationController) obj3).U.getValue());
                dVar.getClass();
                dVar.C1(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData("https://help.revolut.com/help/security-logging-in/how-does-revolut-keep-my-money-safe/", WebViewScreenTitleSource.Html.f98166a, false)), null, true));
                dVar.C2(cp2.g.f107774a);
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.wealth_discovery.impl.screener.screens.meta_collection.a) ((cqh.f) ((ScreenerMetaCollectionScreen) obj3).T.getValue())).B2();
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.spending_analytics.impl.ui.rev10.settings.a) ((SettingsController) obj3).d()).B2();
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((u) obj3).x2(new cs.a(6));
                break;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                s sVar = (s) j6.a.k(s.class, ((r) obj3).f108968a, "WEALTH_PROTECTION_SECURITY_DELAY_INFO_KEY");
                if (sVar != null) {
                }
                break;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list = (List) p.a.j(n.class, KTypeProjection.INSTANCE, List.class, ((z) obj3).f108982a, "TRANSACTIONS_DAY_NIGHT_LIMITS_KEY");
                if (list != null) {
                }
                break;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d0 d0Var = (d0) j6.a.k(d0.class, ((e0) obj3).f108953a, "STREET_MODE_INFO_KEY");
                if (d0Var != null) {
                }
                break;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((oki.h) ((RewardsHubCollectionScreen) obj3).d()).B2();
                break;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) ((InvestOrderEditScreen) obj3).d()).B2();
                break;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((cw1.d) ((BrebOccupiedDialogController) obj3).U.getValue()).C2(q.f5292a);
                break;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((SchemeInsuranceDetailsScreen) obj3).m2().onBackPressed();
                break;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.D2(((com.revolut.feature.topup_screen.impl.flow.add_card.b) obj3).f90600r);
                break;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) obj3).u.a("TOPUP_IDEMPOTENCY_TAG");
                break;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((LicensesController) obj3).m2().onBackPressed();
                break;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ApmAliasClaimStatusScreen) obj3).m2().onBackPressed();
                break;
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.travel.experiences.impl.ui.screen.questions.b) obj3).u = null;
                break;
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details.a) ((d7f.g) ((PerformanceDetailsScreen) obj3).O.getValue())).B2();
                break;
            case 21:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) ((ExpiringCardsBottomSheetScreen) obj3).T.getValue()).I2(d83.e.f112116a);
                break;
            case 22:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((BaseCryptoAssetDetailsScreen) obj3).f3().onBackPressed();
                break;
            case 23:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((d90.f) obj3).f112327a.prepare();
                break;
            case 24:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                db4.i iVar = (db4.i) obj3;
                iVar.l2(new k(iVar, continuation, 13), new yi5.b(26));
                break;
            case 25:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((PixTrustedListScreen) obj3).R2().B2();
                break;
            case 26:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((dbc.k) ((dbc.e) ((DeliveriesScreen) obj3).Q.getValue())).B2();
                break;
            case 27:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                dbl.e eVar = (dbl.e) ((SuspiciousRecipientController) obj3).P.getValue();
                v9l.a aVar29 = (v9l.a) ((dbl.a) ((j2) eVar.f112772r.f22677a).getValue()).f112765a.getContent();
                if (aVar29 == null || Intrinsics.f(aVar29.f287078a.f272611s, "suspicious_transaction_no_user_action_required")) {
                    eVar.B2();
                } else {
                    eVar.C1(((ife.b) eVar.f112770p).a(eVar.o.f105016a, false));
                }
                break;
            case 28:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((PixQrRequestScreen) obj3).m2().onBackPressed();
                break;
            default:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((i0) ((TradingAddOnsMainScreen) obj3).T2()).u2();
                break;
        }
        return Unit.f186387a;
    }
}
