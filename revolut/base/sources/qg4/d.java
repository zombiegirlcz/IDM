package qg4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.atm.impl.ui.redesign.limits_exception.screen.AtmLimitsExceptionController;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeScreen;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method.SelectAutopayMethodScreen;
import com.revolut.feature.credit.card.impl.ui.credit_cards.CreditCardsController;
import com.revolut.feature.credit.card.impl.ui.fee_waiver.FeeWaiverBottomDialogScreen;
import com.revolut.feature.credit.card.impl.ui.statement.hub.CreditCardStatementHubScreen;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.chooser.FreelancerPluginChooserScreen;
import com.revolut.feature.freelancer.impl.ui.profile.tax.screen.dates.FreelancerTaxDatesScreen;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.result.LotteryResultController;
import com.revolut.feature.junior_rewards.impl.ui.details_dialog.JuniorRewardDetailsDialogScreen;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.payinstore.impl.R$string;
import com.revolut.feature.profile.impl.ui.profile.screens.app_interface.AppInterfaceScreen;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.review_email.ReviewEmailBottomSheetController;
import com.revolut.feature.rev_points.impl.ui.opt_in.screen.RevPointsOptInScreen;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.robo.impl.ui.screen.risk_metrics_details.RiskMetricsDetailsScreen;
import com.revolut.feature.security_hub.impl.ui.learn_about_security.LearnAboutSecurityScreen;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.bottom_sheet.new_watchlist.NewWatchlistController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.GroupDetailsScreen;
import com.revolut.feature.teen_dashboard.impl.ui.details.TeenDetailsScreen;
import com.revolut.feature.transport.models.transit.TransitTicketRevPointOption;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.c0;
import nii.y0;
import qg7.g;
import qg7.u;
import qg7.v;
import qk4.b;
import qn9.p;
import qn9.q;
import qqe.j;
import qv4.n;
import qwf.w;
import qwf.z;
import skm.a2;
import vkm.v1;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function2 {
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
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.a) this.v, continuation, 0);
            case 1:
                return new d((LotteryResultController) this.v, continuation, 1);
            case 2:
                return new d((NewWatchlistController) this.v, continuation, 2);
            case 3:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.rollee.c) this.v, continuation, 3);
            case 4:
                return new d((RolleeScreen) this.v, continuation, 4);
            case 5:
                return new d((ReviewEmailBottomSheetController) this.v, continuation, 5);
            case 6:
                return new d((TravelMilesTransferBreakdownScreen) this.v, continuation, 6);
            case 7:
                return new d((AtmLimitsExceptionController) this.v, continuation, 7);
            case 8:
                return new d((qk2.g) this.v, continuation, 8);
            case 9:
                return new d((SelectAutopayMethodScreen) this.v, continuation, 9);
            case 10:
                return new d((com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.a) this.v, continuation, 10);
            case 11:
                return new d((JuniorRewardDetailsDialogScreen) this.v, continuation, 11);
            case 12:
                return new d((com.revolut.feature.profile.impl.ui.details.address.flow.c) this.v, continuation, 12);
            case 13:
                return new d((q) this.v, continuation, 13);
            case 14:
                return new d((AppInterfaceScreen) this.v, continuation, 14);
            case 15:
                return new d((RiskMetricsDetailsScreen) this.v, continuation, 15);
            case 16:
                return new d((GroupDetailsScreen) this.v, continuation, 16);
            case 17:
                return new d((com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a) this.v, continuation, 17);
            case 18:
                return new d((CreditCardsController) this.v, continuation, 18);
            case 19:
                return new d((TeenDetailsScreen) this.v, continuation, 19);
            case 20:
                return new d((FeeWaiverBottomDialogScreen) this.v, continuation, 20);
            case 21:
                return new d((LearnAboutSecurityScreen) this.v, continuation, 21);
            case 22:
                return new d((CreditCardStatementHubScreen) this.v, continuation, 22);
            case 23:
                return new d((qw1.g) this.v, continuation, 23);
            case 24:
                return new d((FreelancerPluginChooserScreen) this.v, continuation, 24);
            case 25:
                return new d((z) this.v, continuation, 25);
            case 26:
                return new d((com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e) this.v, continuation, 26);
            case 27:
                return new d((com.revolut.feature.kyc.impl.web_id.web_id_portal.a) this.v, continuation, 27);
            case 28:
                return new d((RevPointsOptInScreen) this.v, continuation, 28);
            default:
                return new d((FreelancerTaxDatesScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 26:
                ((d) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
        }
        return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v103, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v139, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v75, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v80, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v85, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v90, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v96, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dj0.d dVarU;
        TransitTicketRevPointOption transitTicketRevPointOption;
        int i = this.u;
        aii.q qVar = aii.q.f5292a;
        int i2 = 9;
        int i3 = 6;
        int i5 = 4;
        Continuation continuation = null;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.a) obj3).C1(new BridgeDestination(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6)))));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((u) ((LotteryResultController) obj3).R2()).C2(g.a.f245669a);
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                qgd.f fVar = (qgd.f) ((NewWatchlistController) obj3).S.getValue();
                fVar.getClass();
                fVar.n2(new qc8.b(fVar, continuation, i5), new whi.b(i3));
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                qh4.d dVar = com.revolut.feature.credit.application.plugins.impl.ui.rollee.c.Companion;
                ((com.revolut.feature.credit.application.plugins.impl.ui.rollee.c) obj3).P2();
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((RolleeScreen) obj3).R2().B2();
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                qhb.f fVar2 = (qhb.f) ((ReviewEmailBottomSheetController) obj3).V.getValue();
                fVar2.getClass();
                fVar2.A1(new qhb.e(fVar2, continuation, 1), new yi5.b(25));
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.a) ((qig.c) ((TravelMilesTransferBreakdownScreen) obj3).S.getValue())).C2(qVar);
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((qk2.g) ((AtmLimitsExceptionController) obj3).R.getValue()).B2();
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((qk2.g) obj3).B2();
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((qk4.g) ((qk4.c) ((SelectAutopayMethodScreen) obj3).c0.getValue())).v2(b.a.f246962a);
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.a aVar12 = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.a) obj3;
                aVar12.H2(aVar12.f72788p, new v(28));
                return Unit.f186387a;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                qm8.d dVar2 = (qm8.d) ((qm8.c) ((JuniorRewardDetailsDialogScreen) obj3).S.getValue());
                dVar2.getClass();
                dVar2.n2(new qc8.b(dVar2, continuation, 10), new whi.b(i3));
                return Unit.f186387a;
            case 12:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.D2(((com.revolut.feature.profile.impl.ui.details.address.flow.c) obj3).v);
                return Unit.f186387a;
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                q qVar2 = (q) obj3;
                qVar2.f247896t.getClass();
                qVar2.X1(new y0("PENDING_PAYMENT_DIALOG_ID", new c0(new TextLocalisedClause(R$string.retail_pay_in_store_flow_payment_screen_payment_status_loading_title, null, null, 14), new TextLocalisedClause(R$string.retail_pay_in_store_flow_payment_screen_payment_status_loading_subtitle, null, null, 14), null, false, null, false, false, null, 1916), false, 4));
                dj0.d amount = new dj0.d(((qn9.f) qVar2.t2()).f247880b, ((qn9.f) qVar2.t2()).f247879a);
                ln9.a aVar16 = qVar2.f247894r;
                String orderId = qVar2.f247892p.f79047a;
                ln9.c cVar = (ln9.c) aVar16;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(orderId, "orderId");
                Intrinsics.checkNotNullParameter(amount, "amount");
                return l.b1(qVar2, vkm.q.Q(new v1(new ln9.b(cVar, orderId, amount, null)), new li2.f(continuation, cVar, i5)), null, new p(qVar2, continuation, 3), 3);
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((AppInterfaceScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((RiskMetricsDetailsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 16:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((GroupDetailsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 17:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a aVar21 = (com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.a) obj3;
                aVar21.H2(aVar21.A, new qpb.i(i2));
                return Unit.f186387a;
            case 18:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((qq4.e) ((CreditCardsController) obj3).U.getValue()).C2(qq4.d.f248485a);
                return Unit.f186387a;
            case 19:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) ((TeenDetailsScreen) obj3).N.getValue()).B2();
                return Unit.f186387a;
            case 20:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((qr4.e) ((FeeWaiverBottomDialogScreen) obj3).Q.getValue()).B2();
                return Unit.f186387a;
            case 21:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((quc.g) ((quc.d) ((LearnAboutSecurityScreen) obj3).P.getValue())).B2();
                return Unit.f186387a;
            case 22:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((n) ((CreditCardStatementHubScreen) obj3).S.getValue()).B2();
                return Unit.f186387a;
            case 23:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((qw1.g) obj3).C2(qVar);
                return Unit.f186387a;
            case 24:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((qw6.i) ((FreelancerPluginChooserScreen) obj3).O.getValue()).C2(qw6.e.f249786a);
                return Unit.f186387a;
            case 25:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                z zVar = (z) obj3;
                a2 a2Var = zVar.f249944x;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                zVar.f249944x = null;
                zVar.x2(new qwd.o(i2));
                qwf.o oVar = (qwf.o) zVar.t2();
                qwf.p pVar = (qwf.p) oVar.f249919g.getContent();
                if (pVar == null || (transitTicketRevPointOption = pVar.f249923b) == null || (dVarU = transitTicketRevPointOption.getFiatAmount()) == null) {
                    dVarU = pyd.c.U(oVar.f249916a.k, oVar.f249917b);
                }
                Object content = ((qwf.o) zVar.t2()).f249920h.getContent();
                if (content == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ivf.f fVar3 = content instanceof ivf.f ? (ivf.f) content : null;
                PaymentMethod.Pocket pocket = fVar3 != null ? fVar3.f168845a : null;
                if (pocket != null) {
                    dj0.d dVar3 = pocket.i;
                    if (!Intrinsics.f(pocket.f84381j.f115083b, dVar3.f115083b)) {
                        zVar.f249944x = l.a1(zVar, zVar.f249940r.a(dVarU.f115082a, dVar3.f115083b, dVarU.f115083b), null, null, new w(zVar, continuation, 2), 3);
                    }
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e.I2((com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e) obj3);
                return Boolean.FALSE;
            case 27:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.kyc.impl.web_id.web_id_portal.a) obj3).J2(qx8.h.f250037a);
                return Unit.f186387a;
            case 28:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((RevPointsOptInScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((r07.h) ((FreelancerTaxDatesScreen) obj3).P.getValue()).B2();
                return Unit.f186387a;
        }
    }
}
