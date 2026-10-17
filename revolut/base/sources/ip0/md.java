package ip0;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.delegates.PhotoBannerLargeDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileSendMoneyDelegate;
import com.revolut.core.ui_kit.delegates.WalletWidgetDelegate;
import com.revolut.core.ui_kit.views.NewRevolutCardView;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreen;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreenContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.CardExtraSecurityController;
import com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.CardExtraSecurityControllerContract$InputData;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.LinkCardDetailsReviewScreen;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.LinkCardDetailsReviewScreenContract$InputData;
import com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationController;
import com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationControllerContract$InputData;
import com.revolut.feature.corporate_events.impl.ui.screen.type_filter.CorporateEventsTypeFilterScreen;
import com.revolut.feature.corporate_events.impl.ui.screen.type_filter.CorporateEventsTypeFilterScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.details.flow.CreditCardPostPurchaseDetailsFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.details.flow.CreditCardPostPurchaseDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_financing.setup.CreditCardStatementFinancingSetupScreen;
import com.revolut.feature.credit.card.impl.ui.statement_financing.setup.CreditCardStatementFinancingSetupScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.profile.email_flow.edit_email.FreelancerEmailScreen;
import com.revolut.feature.freelancer.impl.ui.profile.email_flow.edit_email.FreelancerEmailScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.orders.OrderInitPageHistoryScreen;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.orders.OrderInitPageHistoryScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_options.PlanOptionsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_options.PlanOptionsScreenContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.voucher.TradeRevPointsAgentAllVouchersScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.voucher.TradeRevPointsAgentAllVouchersScreenContract$InputData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.ManualTransferReviewScreen;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.ManualTransferReviewScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlow;
import com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlowContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.home.TravelExperiencesHomeScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.home.TravelExperiencesHomeScreenContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.WidgetisedAnalyticsDashboardContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.WidgetisedAnalyticsDashboardScreen;
import com.revolut.feature_exchange.api.models.TakeProfitStopLossParams;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.ChartLimitPickerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.daily.WealthDailyNewsScreen;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.daily.WealthDailyNewsScreenContract$InputData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class md implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f165359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f165360c;

    public /* synthetic */ md(NewRevolutCardDelegate newRevolutCardDelegate, com.revolut.core.ui_kit.delegates.o9 o9Var, NewRevolutCardDelegate.Model model) {
        this.f165358a = 3;
        this.f165359b = o9Var;
        this.f165360c = model;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        int i = this.f165358a;
        Object obj2 = this.f165360c;
        Object obj3 = this.f165359b;
        switch (i) {
            case 0:
                ((CounterTextDelegate) obj3).f.onNext((CounterTextDelegate.Model) obj2);
                return Unit.f186387a;
            case 1:
                com.revolut.core.ui_kit.delegates.r5 r5Var = (com.revolut.core.ui_kit.delegates.r5) obj2;
                ad adVar = ((com.revolut.core.ui_kit.delegates.v5) obj3).o;
                if (adVar != null) {
                    adVar.invoke(r5Var);
                }
                return Unit.f186387a;
            case 2:
                LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{(GradientDrawable) ((pu) obj3).J.getValue()});
                layerDrawable.setLayerGravity(0, 80);
                Context context = ((View) obj2).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                layerDrawable.setLayerHeight(0, kli.a.k(context, 32.0f));
                return layerDrawable;
            case 3:
                NewRevolutCardDelegate.Model model = (NewRevolutCardDelegate.Model) obj2;
                NewRevolutCardView newRevolutCardView = ((com.revolut.core.ui_kit.delegates.o9) obj3).f54535h;
                model.d.getClass();
                newRevolutCardView.setBackPrimaryColor(-16777216);
                model.d.getClass();
                newRevolutCardView.setBackSecondaryColor(-7829368);
                return Unit.f186387a;
            case 4:
                NewRevolutCardView newRevolutCardView2 = (NewRevolutCardView) obj3;
                newRevolutCardView2.setVisibility(8);
                newRevolutCardView2.l();
                ((Function0) obj2).invoke();
                return Unit.f186387a;
            case 5:
                ((PhotoBannerLargeDelegate) obj3).f52902c.onNext((PhotoBannerLargeDelegate.Model) obj2);
                return Unit.f186387a;
            case 6:
                pa0 pa0Var = (pa0) obj3;
                la0 la0Var = (la0) obj2;
                TextView textView = pa0Var.f165801j;
                TextView textView2 = pa0Var.k;
                if (textView.getLayout() == null || textView.getLayout().getLineCount() <= 0 || textView.getLayout().getEllipsisCount(textView.getLineCount() - 1) <= 0) {
                    kli.a.b(textView2, null, ty0.f.f275450a);
                } else {
                    kli.a.b(textView2, la0Var.f165157h, ty0.f.f275450a);
                }
                return Boolean.TRUE;
            case 7:
                ((ScrollerDelegate) obj3).f53281h.onNext((com.revolut.core.ui_kit.delegates.hg) obj2);
                return Unit.f186387a;
            case 8:
                ((SmartTileSendMoneyDelegate) obj3).d.b((SmartTileSendMoneyDelegate.Model) obj2);
                return Unit.f186387a;
            case 9:
                LayerDrawable layerDrawable2 = new LayerDrawable(new GradientDrawable[]{(GradientDrawable) ((com.revolut.core.ui_kit.delegates.dj) obj3).F.getValue()});
                layerDrawable2.setLayerGravity(0, 80);
                Context context2 = ((View) obj2).getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                layerDrawable2.setLayerHeight(0, kli.a.k(context2, 32.0f));
                return layerDrawable2;
            case 10:
                ((WalletWidgetDelegate) obj3).f53629c.onNext((WalletWidgetDelegate.Model) obj2);
                return Unit.f186387a;
            case 11:
                CorporateEventsTypeFilterScreen corporateEventsTypeFilterScreen = (CorporateEventsTypeFilterScreen) obj3;
                KProperty[] kPropertyArr = CorporateEventsTypeFilterScreen.i0;
                qji.b bVarQ2 = corporateEventsTypeFilterScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.corporate_events.impl.ui.screen.type_filter.CorporateEventsTypeFilterScreenInjector");
                ap3.e eVar = (ap3.e) bVarQ2;
                return new ap3.g(eVar.f8068b, eVar.f8069c, corporateEventsTypeFilterScreen, (CorporateEventsTypeFilterScreenContract$InputData) obj2);
            case 12:
                KProperty[] kPropertyArr2 = PlanOptionsScreen.f75595d0;
                qji.b bVarQ22 = ((PlanOptionsScreen) obj3).Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_options.di.PlanOptionsScreenInjector");
                ql7.n nVar = (ql7.n) bVarQ22;
                return new ql7.z0(nVar.f247399b, nVar.f247400c, (PlanOptionsScreenContract$InputData) obj2);
            case 13:
                SelectPaymentToBlockScreen selectPaymentToBlockScreen = (SelectPaymentToBlockScreen) obj3;
                KProperty[] kPropertyArr3 = SelectPaymentToBlockScreen.f64258d0;
                qji.b bVarQ23 = selectPaymentToBlockScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.di.SelectPaymentToBlockScreenInjector");
                tr2.i iVar = (tr2.i) bVarQ23;
                return new tr2.q(iVar.f273638b, iVar.f273639c, selectPaymentToBlockScreen, (SelectPaymentToBlockScreenContract$InputData) obj2);
            case 14:
                CreditCardPostPurchaseDetailsFlowContract$InputData creditCardPostPurchaseDetailsFlowContract$InputData = (CreditCardPostPurchaseDetailsFlowContract$InputData) obj2;
                phm.a aVar2 = (phm.a) ue0.e.j(((CreditCardPostPurchaseDetailsFlow) obj3).m2()).a().get(jm4.a3.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new jm4.t1(((jm4.a3) aVar.b()).Y, creditCardPostPurchaseDetailsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", jm4.a3.class, " is not found"));
            case 15:
                ((isl.m) obj3).o.x((rp0.y) obj2);
                return Unit.f186387a;
            case 16:
                ManualTransferReviewScreen manualTransferReviewScreen = (ManualTransferReviewScreen) obj3;
                ManualTransferReviewScreenContract$InputData manualTransferReviewScreenContract$InputData = (ManualTransferReviewScreenContract$InputData) obj2;
                KProperty[] kPropertyArr4 = ManualTransferReviewScreen.f92480e0;
                qji.b bVarU2 = manualTransferReviewScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.di.ManualTransferReviewScreenInjector");
                ytf.b bVar = (ytf.b) bVarU2;
                ytf.e eVar2 = bVar.f316725b;
                ytf.b bVar2 = bVar.f316726c;
                manualTransferReviewScreenContract$InputData.getClass();
                return new ytf.c(eVar2, bVar2, manualTransferReviewScreen, manualTransferReviewScreenContract$InputData);
            case 17:
                CreditCardStatementFinancingSetupScreen creditCardStatementFinancingSetupScreen = (CreditCardStatementFinancingSetupScreen) obj3;
                KProperty[] kPropertyArr5 = CreditCardStatementFinancingSetupScreen.Z;
                qji.b bVarU22 = creditCardStatementFinancingSetupScreen.U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.statement_financing.setup.di.CreditCardStatementFinancingSetupScreenInjector");
                jm4.r2 r2Var = (jm4.r2) bVarU22;
                return new jm4.s2(r2Var.f176313b, r2Var.f176314c, creditCardStatementFinancingSetupScreen, (CreditCardStatementFinancingSetupScreenContract$InputData) obj2);
            case 18:
                WidgetisedAnalyticsDashboardScreen widgetisedAnalyticsDashboardScreen = (WidgetisedAnalyticsDashboardScreen) obj3;
                KProperty[] kPropertyArr6 = WidgetisedAnalyticsDashboardScreen.c0;
                qji.b bVarU23 = widgetisedAnalyticsDashboardScreen.U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.di.WidgetisedAnalyticsDashboardScreenInjector");
                ewg.k kVar = (ewg.k) bVarU23;
                return new ewg.j(kVar.d, kVar.e, widgetisedAnalyticsDashboardScreen, (WidgetisedAnalyticsDashboardContract$InputData) obj2, widgetisedAnalyticsDashboardScreen);
            case 19:
                KProperty[] kPropertyArr7 = FreelancerEmailScreen.f74046b0;
                qji.b bVarQ24 = ((FreelancerEmailScreen) obj3).Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.profile.email_flow.edit_email.di.FreelancerEmailScreenInjector");
                us6.x xVar = (us6.x) bVarQ24;
                return new us6.y(xVar.f282795b, xVar.f282796c, (FreelancerEmailScreenContract$InputData) obj2);
            case 20:
                TravelExperiencesHomeFlowContract$InputData travelExperiencesHomeFlowContract$InputData = (TravelExperiencesHomeFlowContract$InputData) obj2;
                phm.a aVar3 = (phm.a) ue0.e.j(((TravelExperiencesHomeFlow) obj3).m2()).a().get(z0g.b.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new z0g.j(((z0g.b) aVar.b()).B, travelExperiencesHomeFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", z0g.b.class, " is not found"));
            case 21:
                WealthDailyNewsScreen wealthDailyNewsScreen = (WealthDailyNewsScreen) obj3;
                KProperty[] kPropertyArr8 = WealthDailyNewsScreen.c0;
                qji.b bVarQ25 = wealthDailyNewsScreen.Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.retail.feature.marketnews.impl.ui.wealthnews.daily.di.WealthDailyNewsScreenComponentInjector");
                l0k.h hVar = (l0k.h) bVarQ25;
                return new l0k.f(hVar.f191295c, hVar.d, new o0h.b(), wealthDailyNewsScreen, (WealthDailyNewsScreenContract$InputData) obj2);
            case 22:
                OrderInitPageHistoryScreenContract$InputData orderInitPageHistoryScreenContract$InputData = (OrderInitPageHistoryScreenContract$InputData) obj2;
                KProperty[] kPropertyArr9 = OrderInitPageHistoryScreen.T;
                phm.a aVar4 = (phm.a) ue0.e.j(((OrderInitPageHistoryScreen) obj3).m2()).a().get(us6.q.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new us6.k1(((us6.q) aVar.b()).Q, orderInitPageHistoryScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
            case 23:
                KProperty[] kPropertyArr10 = TradeRevPointsAgentAllVouchersScreen.R;
                qji.b bVarU24 = ((TradeRevPointsAgentAllVouchersScreen) obj3).U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.voucher.di.TradeRevPointsAgentAllVouchersScreenInjector");
                t1f.e eVar3 = (t1f.e) bVarU24;
                return new t1f.d(eVar3.f267288b, eVar3.f267289c, (TradeRevPointsAgentAllVouchersScreenContract$InputData) obj2);
            case 24:
                TravelExperiencesHomeScreen travelExperiencesHomeScreen = (TravelExperiencesHomeScreen) obj3;
                TravelExperiencesHomeScreenContract$InputData travelExperiencesHomeScreenContract$InputData = (TravelExperiencesHomeScreenContract$InputData) obj2;
                KProperty[] kPropertyArr11 = TravelExperiencesHomeScreen.f93077a0;
                qji.b bVarU25 = travelExperiencesHomeScreen.U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.home.di.TravelExperiencesHomeScreenInjector");
                z0g.d0 d0Var = (z0g.d0) ((k2g.a) bVarU25).A().mo3808a(travelExperiencesHomeScreen);
                switch (d0Var.f318341a) {
                    case 0:
                        d0Var.d = travelExperiencesHomeScreenContract$InputData;
                        break;
                    default:
                        d0Var.d = travelExperiencesHomeScreenContract$InputData;
                        break;
                }
                return (z0g.e0) d0Var.mo3783build();
            case 25:
                CardExtraSecurityController.a aVar5 = CardExtraSecurityController.Companion;
                qji.b bVarU26 = ((CardExtraSecurityController) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.di.CardExtraSecurityControllerInjector");
                x13.q qVar = (x13.q) bVarU26;
                return new x13.m(qVar.f302174c, qVar.d, (CardExtraSecurityControllerContract$InputData) obj2);
            case 26:
                ChartLimitPickerController chartLimitPickerController = (ChartLimitPickerController) obj3;
                TakeProfitStopLossParams takeProfitStopLossParams = (TakeProfitStopLossParams) obj2;
                KProperty[] kPropertyArr12 = ChartLimitPickerController.U;
                phm.a aVar6 = (phm.a) ue0.e.j(chartLimitPickerController.m2()).a().get(v0i.b.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", v0i.b.class, " is not found"));
                }
                v0i.b bVar3 = ((v0i.b) aVar.b()).f284870t;
                takeProfitStopLossParams.getClass();
                return new v0i.a(bVar3, chartLimitPickerController, takeProfitStopLossParams);
            case 27:
                LinkCardDetailsReviewScreen linkCardDetailsReviewScreen = (LinkCardDetailsReviewScreen) obj3;
                LinkCardDetailsReviewScreenContract$InputData linkCardDetailsReviewScreenContract$InputData = (LinkCardDetailsReviewScreenContract$InputData) obj2;
                KProperty[] kPropertyArr13 = LinkCardDetailsReviewScreen.U;
                qji.b bVarU27 = linkCardDetailsReviewScreen.U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.di.LinkCardDetailsReviewScreenInjector");
                c43.n nVar2 = (c43.n) ((k43.a) bVarU27).c().mo3808a(linkCardDetailsReviewScreen);
                switch (nVar2.f21062a) {
                    case 0:
                        nVar2.d = linkCardDetailsReviewScreenContract$InputData;
                        break;
                    default:
                        nVar2.d = linkCardDetailsReviewScreenContract$InputData;
                        break;
                }
                return (c43.o) nVar2.mo3783build();
            case 28:
                CustomisationImageGenerationController customisationImageGenerationController = (CustomisationImageGenerationController) obj3;
                CustomisationImageGenerationControllerContract$InputData customisationImageGenerationControllerContract$InputData = (CustomisationImageGenerationControllerContract$InputData) obj2;
                CustomisationImageGenerationController.a aVar7 = CustomisationImageGenerationController.Companion;
                phm.a aVar8 = (phm.a) ue0.e.j(customisationImageGenerationController.m2()).a().get(e53.h.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar != null) {
                    return new e53.i(((e53.h) aVar.b()).f, customisationImageGenerationController, customisationImageGenerationControllerContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", e53.h.class, " is not found"));
            default:
                com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d dVar = (com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d) obj3;
                if (dVar.f67118t == ((ViewController) obj2)) {
                    dVar.f67118t = null;
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ md(Object obj2, Object obj3, int i) {
        this.f165358a = i;
        this.f165359b = obj2;
        this.f165360c = obj3;
    }
}
