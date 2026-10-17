package r0e;

import com.revolut.chat.ui.outage.OngoingOutageScreen;
import com.revolut.feature.apm.swish.impl.ui.home.transaction_limit.SwishTransactionLimitScreen;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreen;
import com.revolut.feature.credit.help.impl.ui.financial_difficulties.legacy.FinancialDifficultiesScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.TaxHubPaymentTypePickerScreen;
import com.revolut.feature.pay_later.impl.ui.linkedplans.PayLaterLinkedPlansController;
import com.revolut.feature.retail.cfd.impl.screens.home.CfdTradingHomeScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.details.CobrandedCardsPlanHubTransactionDetailsScreen;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.ShippingTrackingScreen;
import com.revolut.feature.shared.branding.impl.ui.preview_auto.PaymentLinkAutoPreviewScreen;
import com.revolut.feature.statements.impl.ui.tax_certificate.TaxCertificateScreen;
import com.revolut.feature.store.impl.ui.search.StoreSearchScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.PayoutScenarioScreen;
import com.revolut.feature.subaccount.impl.ui.members.screen.GroupMembersScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.target_allocations.TargetAllocationsController;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.screens.new_transfer_account_selector.NewTransferAccountSelectorScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid.TravelHotelsFavoritesGridScreen;
import com.revolut.feature.wealth.impl.ui.screens.popularassets.PopularAssetsController;
import com.revolut.feature_web_view.presentation.screen.WebViewScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.expired_subscriptions.EsimExpiredSubscriptionsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_choose_number.EsimMobilePlanChooseNumberScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import r40.x0;
import r40.y0;
import rcg.q;
import rg3.o;
import skm.a2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
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
                return new c((TaxCertificateScreen) this.v, continuation, 0);
            case 1:
                return new c((r12.g) this.v, continuation, 1);
            case 2:
                return new c((FinancialDifficultiesScreen) this.v, continuation, 2);
            case 3:
                return new c((TaxHubPaymentTypePickerScreen) this.v, continuation, 3);
            case 4:
                return new c((CfdTradingHomeScreen) this.v, continuation, 4);
            case 5:
                return new c((StoreSearchScreen) this.v, continuation, 5);
            case 6:
                return new c((x0) this.v, continuation, 6);
            case 7:
                return new c((OngoingOutageScreen) this.v, continuation, 7);
            case 8:
                return new c((r5c.b) this.v, continuation, 8);
            case 9:
                return new c((PayoutScenarioScreen) this.v, continuation, 9);
            case 10:
                return new c((PaymentLinkAutoPreviewScreen) this.v, continuation, 10);
            case 11:
                return new c((CobrandedCardsPlanHubTransactionDetailsScreen) this.v, continuation, 11);
            case 12:
                return new c((r7b.l) this.v, continuation, 12);
            case 13:
                return new c((GroupMembersScreen) this.v, continuation, 13);
            case 14:
                return new c((TargetAllocationsController) this.v, continuation, 14);
            case 15:
                return new c((NewTransferAccountSelectorScreen) this.v, continuation, 15);
            case 16:
                return new c((rb6.m) this.v, continuation, 16);
            case 17:
                return new c((ShippingTrackingScreen) this.v, continuation, 17);
            case 18:
                return new c((com.revolut.feature.retail.privacy.impl.ui.flow.screen.extensions.discoverability.b) this.v, continuation, 18);
            case 19:
                return new c((TravelHotelsFavoritesGridScreen) this.v, continuation, 19);
            case 20:
                return new c((PopularAssetsController) this.v, continuation, 20);
            case 21:
                return new c((SwishTransactionLimitScreen) this.v, continuation, 21);
            case 22:
                return new c((o) this.v, continuation, 22);
            case 23:
                return new c((WebViewScreen) this.v, continuation, 23);
            case 24:
                return new c((EsimExpiredSubscriptionsScreen) this.v, continuation, 24);
            case 25:
                return new c((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b) this.v, continuation, 25);
            case 26:
                return new c((com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.a) this.v, continuation, 26);
            case 27:
                return new c((PayLaterLinkedPlansController) this.v, continuation, 27);
            case 28:
                return new c((EsimMobilePlanChooseNumberScreen) this.v, continuation, 28);
            default:
                return new c((ESignOtpScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 6:
                ((c) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
        }
        return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v69, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v90, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TaxCertificateScreen) obj3).m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((r12.g) obj3).d.E1();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((r15.n) ((r15.i) ((FinancialDifficultiesScreen) obj3).f70007a0.getValue())).u2();
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.a) ((r37.g) ((TaxHubPaymentTypePickerScreen) obj3).P.getValue())).B2();
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.retail.cfd.impl.screens.home.a) ((CfdTradingHomeScreen) obj3).R2()).B2();
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.store.impl.ui.search.a) ((StoreSearchScreen) obj3).R2()).B2();
                break;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((x0) obj3).x2(new r2d.d(29));
                break;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((r50.f) ((OngoingOutageScreen) obj3).T.getValue()).C2(r50.d.f251525a);
                break;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r5c.b bVar = (r5c.b) obj3;
                t5c.c cVar = (t5c.c) bVar.f251579b.T2("CRYPTO_EXCHANGE_ELIGIBILITY_KEY", t5c.c.class);
                if (cVar != null) {
                    bVar.f251580c.getClass();
                }
                break;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.a) ((r5e.g) ((PayoutScenarioScreen) obj3).N.getValue())).B2();
                break;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((r6d.g) ((PaymentLinkAutoPreviewScreen) obj3).P.getValue()).B2();
                break;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((r7b.l) ((CobrandedCardsPlanHubTransactionDetailsScreen) obj3).d()).B2();
                break;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r7b.l lVar = (r7b.l) obj3;
                lVar.H2(lVar.f252076s, new y0(27));
                break;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((GroupMembersScreen) obj3).m2().onBackPressed();
                break;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((r8f.f) ((TargetAllocationsController) obj3).O.getValue()).B2();
                break;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((raf.n) ((raf.h) ((NewTransferAccountSelectorScreen) obj3).Q.getValue())).B2();
                break;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((rb6.m) obj3).u2();
                break;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.a aVar19 = (com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.a) ((ShippingTrackingScreen) obj3).d();
                if (((rbc.g) ((j2) aVar19.u.f22677a).getValue()).f253012b) {
                    aVar19.C2(rbc.m.f253018a);
                } else {
                    aVar19.C2(rbc.k.f253016a);
                }
                break;
            case 18:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a2 a2Var = ((com.revolut.feature.retail.privacy.impl.ui.flow.screen.extensions.discoverability.b) obj3).f82791q;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                break;
            case 19:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((q) ((TravelHotelsFavoritesGridScreen) obj3).k3()).B2();
                break;
            case 20:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.impl.ui.screens.popularassets.a) ((rch.d) ((PopularAssetsController) obj3).O.getValue())).B2();
                break;
            case 21:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                re2.i iVar = (re2.i) ((SwishTransactionLimitScreen) obj3).R.getValue();
                iVar.getClass();
                iVar.l2(new rbh.k(iVar, continuation, 2), new yi5.b(26));
                break;
            case 22:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 23:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((WebViewScreen) obj3).m2().onBackPressed();
                break;
            case 24:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((rhj.l) ((EsimExpiredSubscriptionsScreen) obj3).R2()).B2();
                break;
            case 25:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b bVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b) obj3;
                break;
            case 26:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.a) obj3).f103270q);
                break;
            case 27:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PayLaterLinkedPlansController) obj3).m2().onBackPressed();
                break;
            case 28:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((rjj.h) ((rjj.f) ((EsimMobilePlanChooseNumberScreen) obj3).Q.getValue())).B2();
                break;
            default:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ESignOtpScreen) obj3).m2().onBackPressed();
                break;
        }
        return Unit.f186387a;
    }
}
