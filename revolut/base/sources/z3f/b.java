package z3f;

import aii.q;
import com.revolut.feature.apm.aani.impl.ui.settings.AaniSettingsScreen;
import com.revolut.feature.apm.wero.impl.ui.home.payment_area.WeroPaymentAreaScreen;
import com.revolut.feature.business.referrals.ui.screens.invite_contacts.InviteContactsScreen;
import com.revolut.feature.cashback.impl.ui.yourcashback.split_by_source.SplitBySourceScreen;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.CreditCardBoletoDetailsScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListController;
import com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.BrazilLinkedAccountsScreen;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.options.PaymentOptionsController;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.modal.card_termination.CobrandedCardsCardTerminationInfoScreen;
import com.revolut.feature.revolutpay.shared.ui.order_summary.OrderSummaryScreen;
import com.revolut.feature.robo.impl.ui.screen.transaction_details.RoboTransactionDetailsController;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.SalaryRequestsScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.all.AllCardsScreen;
import com.revolut.feature.spending_analytics.impl.ui.budget.upcoming_payments.BudgetUpcomingPaymentsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthController;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.disclosure.AdditionalInfoDisclosureScreen;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceController;
import com.revolut.retail.feature.crypto.disclaimer.impl.retail_revolut_x_difference.RetailRevolutXDifferenceScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_freeze_info.EsimMobilePlanEsimFreezeInfoScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation.e;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.modal_screens.expected_annual_return.ExpectedAnnualReturnInfoScreen;
import gim.i;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import oki.h;
import wim.z;
import yhm.o;
import z8d.j;
import za0.g;
import zhm.h0;
import znc.n;

/* JADX INFO: loaded from: classes8.dex */
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
                return new b((d) this.v, continuation, 0);
            case 1:
                return new b((LoanAccountDetailsScreen) this.v, continuation, 1);
            case 2:
                return new b((CobrandedCardsCardTerminationInfoScreen) this.v, continuation, 2);
            case 3:
                return new b((AllCardsScreen) this.v, continuation, 3);
            case 4:
                return new b((RetailRevolutXDifferenceScreen) this.v, continuation, 4);
            case 5:
                return new b((g) this.v, continuation, 5);
            case 6:
                return new b((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a) this.v, continuation, 6);
            case 7:
                return new b((zb8.b) this.v, continuation, 7);
            case 8:
                return new b((com.revolut.feature.apm.spin.impl.ui.transfer.b) this.v, continuation, 8);
            case 9:
                return new b((SplitBySourceScreen) this.v, continuation, 9);
            case 10:
                return new b((String) this.v, continuation, 10);
            case 11:
                return new b((OrderSummaryScreen) this.v, continuation, 11);
            case 12:
                return new b((e) this.v, continuation, 12);
            case 13:
                return new b((WeroPaymentAreaScreen) this.v, continuation, 13);
            case 14:
                return new b((zh6.c) this.v, continuation, 14);
            case 15:
                return new b((BrazilLinkedAccountsScreen) this.v, continuation, 15);
            case 16:
                return new b((PaymentOptionsController) this.v, continuation, 16);
            case 17:
                return new b((CashBalanceController) this.v, continuation, 17);
            case 18:
                return new b((EsimMobilePlanEsimFreezeInfoScreen) this.v, continuation, 18);
            case 19:
                return new b((AaniSettingsScreen) this.v, continuation, 19);
            case 20:
                return new b((BudgetUpcomingPaymentsController) this.v, continuation, 20);
            case 21:
                return new b((RoboTransactionDetailsController) this.v, continuation, 21);
            case 22:
                return new b((com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b) this.v, continuation, 22);
            case 23:
                return new b((CryptoSendWalletsListController) this.v, continuation, 23);
            case 24:
                return new b((SalaryRequestsScreen) this.v, continuation, 24);
            case 25:
                return new b((TotalWealthController) this.v, continuation, 25);
            case 26:
                return new b((InviteContactsScreen) this.v, continuation, 26);
            case 27:
                return new b((AdditionalInfoDisclosureScreen) this.v, continuation, 27);
            case 28:
                return new b((CreditCardBoletoDetailsScreen) this.v, continuation, 28);
            default:
                return new b((ExpectedAnnualReturnInfoScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v81, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v86, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v91, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e4f.c cVar = (e4f.c) j6.a.k(e4f.c.class, ((d) obj3).f319260a, "TRADING_TRANSACTIONS_SYNC_STATE");
                if (cVar == null) {
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((LoanAccountDetailsScreen) obj3).m2().onBackPressed();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((CobrandedCardsCardTerminationInfoScreen) obj3).Q.C2(q.f5292a);
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) ((AllCardsScreen) obj3).f86308a0.getValue()).u2();
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((z9j.e) ((RetailRevolutXDifferenceScreen) obj3).O.getValue()).B2();
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVar = (g) obj3;
                gVar.T2(new xa0.a(gVar, continuation, i2), new yi5.b(27));
                break;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a) obj3).f93813t.a("stays-booking-amendment-confirmation");
                break;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list = (List) p.a.j(wb8.g.class, KTypeProjection.INSTANCE, List.class, ((zb8.b) obj3).f320841a, "ALLOWANCE_RECURRING_PAYMENTS_KEY");
                if (list != null) {
                }
                break;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h.D2(((com.revolut.feature.apm.spin.impl.ui.transfer.b) obj3).f62894s);
                break;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((SplitBySourceScreen) obj3).m2().onBackPressed();
                break;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((zdc.i) ((OrderSummaryScreen) obj3).L.getValue()).B2();
                break;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h.D2(((e) obj3).v);
                break;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((WeroPaymentAreaScreen) obj3).m2().onBackPressed();
                break;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                try {
                    ff6.a aVar16 = (ff6.a) ((zh6.c) obj3).f322240b.T2("NET_BANKING_STORAGE_KEY", z.d(o0.b(ff6.a.class)));
                    if (aVar16 != null) {
                    }
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    return null;
                }
                break;
            case 15:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.a) ((zj6.h) ((BrazilLinkedAccountsScreen) obj3).P.getValue())).B2();
                break;
            case 16:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.pay_later.impl.ui.paymentoptions.options.a) ((zj9.g) ((PaymentOptionsController) obj3).R.getValue())).B2();
                break;
            case 17:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.wealth.ui.impl.cash_balance.b) ((CashBalanceController) obj3).k3()).B2();
                break;
            case 18:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((zjj.b) ((EsimMobilePlanEsimFreezeInfoScreen) obj3).T.getValue()).B2();
                break;
            case 19:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.apm.aani.impl.ui.settings.a) ((AaniSettingsScreen) obj3).d3()).I2(zl1.c.f323159a);
                break;
            case 20:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((BudgetUpcomingPaymentsController) obj3).e3().B2();
                break;
            case 21:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((n) ((RoboTransactionDetailsController) obj3).R.getValue()).B2();
                break;
            case 22:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b) obj3).B2();
                break;
            case 23:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((CryptoSendWalletsListController) obj3).m2().onBackPressed();
                break;
            case 24:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.a) ((SalaryRequestsScreen) obj3).e3()).B2();
                break;
            case 25:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a) ((TotalWealthController) obj3).e3()).B2();
                break;
            case 26:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((InviteContactsScreen) obj3).m2().onBackPressed();
                break;
            case 27:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((zsf.g) ((zsf.e) ((AdditionalInfoDisclosureScreen) obj3).O.getValue())).C2(zsf.d.f324914a);
                break;
            case 28:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a) ((zt4.e) ((CreditCardBoletoDetailsScreen) obj3).P.getValue())).C2(zt4.c.f325070a);
                break;
            default:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ztk.h) ((ExpectedAnnualReturnInfoScreen) obj3).M.getValue()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
