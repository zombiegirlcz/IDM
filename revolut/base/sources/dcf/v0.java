package dcf;

import aw0.n6;
import com.revolut.feature.alipay.impl.ui.supportedqrs.SupportedQRsScreen;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.details.BlockedMerchantDetailsScreen;
import com.revolut.feature.business.referrals.ui.screens.referral_campaign_state.ReferralCampaignStateScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.CreditCardInstalmentHubScreen;
import com.revolut.feature.crypto.exchange.fees.impl.ui.learnmore.CryptoExchangeFeesLearnMoreBottomSheet;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.list.InvoiceTemplatesListScreen;
import com.revolut.feature.junior_settings.impl.ui_kompot.app_access.JuniorAppAccessController;
import com.revolut.feature.pay_later.impl.ui.plandetails.PayLaterPlanDetailsScreen;
import com.revolut.feature.retail.restaurants.impl.domain.model.Customer;
import com.revolut.feature.rev_points.impl.ui.challenges.details.RevPointsChallengeDetailsScreen;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.manage.RentAndBillsManageLinkedPaymentsScreen;
import com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details.PortfolioAllocationsDetailsScreen;
import com.revolut.feature.security_hub.impl.ui.add_to_click_to_pay.AddToClickToPayScreen;
import com.revolut.feature.statements.impl.ui.consolidated.bank_id.BankIDAnnualStatementsScreen;
import com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.ThreeDsScreen;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.main_screen.TradingAddOnsMainScreenRevamp;
import com.revolut.feature.transport.impl.ui.hub.ticket_details.TicketDetailsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.booking.TravelHotelsRoomsSelectionBookingScreen;
import com.revolut.feature.wealth_discovery.impl.collection.popular_first_buy.PopularFirstBuyScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.modal_screens.sharpe_ratio_info.SharpeRatioInfoScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.DetailedStatsController;
import kotlin.Lazy;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import skm.a2;
import vkm.j2;
import yhm.m;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v0((TradingAddOnsMainScreenRevamp) this.v, continuation, 0);
            case 1:
                return new v0((com.revolut.feature.retail.restaurants.impl.ui.customerdetails.a) this.v, continuation, 1);
            case 2:
                return new v0((TravelHotelsRoomsSelectionBookingScreen) this.v, continuation, 2);
            case 3:
                return new v0((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c) this.v, continuation, 3);
            case 4:
                return new v0((CryptoExchangeFeesLearnMoreBottomSheet) this.v, continuation, 4);
            case 5:
                return new v0((RentAndBillsManageLinkedPaymentsScreen) this.v, continuation, 5);
            case 6:
                return new v0((PayLaterPlanDetailsScreen) this.v, continuation, 6);
            case 7:
                return new v0((dkk.y) this.v, continuation, 7);
            case 8:
                return new v0((SupportedQRsScreen) this.v, continuation, 8);
            case 9:
                return new v0((PortfolioAllocationsDetailsScreen) this.v, continuation, 9);
            case 10:
                return new v0((JuniorAppAccessController) this.v, continuation, 10);
            case 11:
                return new v0((com.revolut.feature.tax_residency.impl.flows.single_tin.c) this.v, continuation, 11);
            case 12:
                return new v0((PopularFirstBuyScreen) this.v, continuation, 12);
            case 13:
                return new v0((r10.r) this.v, continuation, 13);
            case 14:
                return new v0((BlockedMerchantDetailsScreen) this.v, continuation, 14);
            case 15:
                return new v0((ds2.i) this.v, continuation, 15);
            case 16:
                return new v0((CreditCardInstalmentHubScreen) this.v, continuation, 16);
            case 17:
                return new v0((ReferralCampaignStateScreen) this.v, continuation, 17);
            case 18:
                return new v0((AddToClickToPayScreen) this.v, continuation, 18);
            case 19:
                return new v0((SharpeRatioInfoScreen) this.v, continuation, 19);
            case 20:
                return new v0((DetailedStatsController) this.v, continuation, 20);
            case 21:
                return new v0((com.revolut.feature.kyc.impl.idnow.eid.flow.a) this.v, continuation, 21);
            case 22:
                return new v0((TicketDetailsScreen) this.v, continuation, 22);
            case 23:
                return new v0((dx5.n) this.v, continuation, 23);
            case 24:
                return new v0((com.revolut.feature.wealth.analytics.ui.widgetised.allocation.a) this.v, continuation, 24);
            case 25:
                return new v0((InvoiceTemplatesListScreen) this.v, continuation, 25);
            case 26:
                return new v0((RevPointsChallengeDetailsScreen) this.v, continuation, 26);
            case 27:
                return new v0((dzb.i) this.v, continuation, 27);
            case 28:
                return new v0((BankIDAnnualStatementsScreen) this.v, continuation, 28);
            default:
                return new v0((ThreeDsScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((v0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((v0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                ((v0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            case 3:
                return ((v0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((v0) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((v0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((v0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((v0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((v0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((v0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((v0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((v0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((v0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((v0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((v0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((v0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((v0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((v0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((v0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((v0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((v0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((v0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((v0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((v0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((v0) create((vyg.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((v0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((v0) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((v0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((v0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((v0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r11v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v69, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v85, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v95, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        int i = this.u;
        int i2 = 0;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((i0) ((TradingAddOnsMainScreenRevamp) obj3).T2()).u2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.restaurants.impl.ui.customerdetails.a aVar3 = (com.revolut.feature.retail.restaurants.impl.ui.customerdetails.a) obj3;
                deb.h hVar = (deb.h) ((j2) aVar3.f82846r.f22677a).getValue();
                if (!hVar.c()) {
                    return Unit.f186387a;
                }
                Object content = hVar.f113352a.getContent();
                if (content == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String string = kotlin.text.d0.F0((String) content).toString();
                Object content2 = hVar.f113353b.getContent();
                if (content2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String string2 = kotlin.text.d0.F0((String) content2).toString();
                deb.b bVar = aVar3.o;
                deb.j phone = hVar.f113354c;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(phone, "phone");
                String strJ = hx7.a.J(phone.f113359c);
                String str = (String) phone.f113357a.getContent();
                if (str == null) {
                    str = "";
                }
                String strR = a0.d.r(strJ, kotlin.text.d0.F0(str).toString());
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    objA = bVar.f113349a.a(strR, null, yk0.b.E164);
                    break;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                Object obj4 = strR;
                if (!(objA instanceof yhm.n)) {
                    obj4 = objA;
                }
                String str2 = (String) obj4;
                Object content3 = hVar.d.getContent();
                if (content3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Customer customer = new Customer(string, string2, str2, kotlin.text.d0.F0((String) content3).toString());
                String string3 = kotlin.text.d0.F0(hVar.e).toString();
                aVar3.C2(new deb.i(customer, kotlin.text.d0.W(string3) ? null : string3));
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((deg.i) ((TravelHotelsRoomsSelectionBookingScreen) obj3).R2()).getClass();
                throw new NotImplementedError("An operation is not implemented: TRAVEL-1350 Not yet implemented");
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c) obj3).o.b();
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((dg5.c) ((dg5.a) ((CryptoExchangeFeesLearnMoreBottomSheet) obj3).S.getValue())).C2(aii.q.f5292a);
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((djc.b0) ((RentAndBillsManageLinkedPaymentsScreen) obj3).e3()).B2();
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PayLaterPlanDetailsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return zi0.c.P(Boolean.valueOf(((nyb.b) ((dkk.y) obj3).f115632b).f()), false, null, 3);
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((dl1.f) ((dl1.c) ((SupportedQRsScreen) obj3).N.getValue())).B2();
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PortfolioAllocationsDetailsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((JuniorAppAccessController) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.tax_residency.impl.flows.single_tin.c) obj3).J2();
                return Unit.f186387a;
            case 12:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PopularFirstBuyScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((arl.a) ((Lazy) ((r10.t) ((r10.r) obj3).f250852b).f250858b).getValue()).getClass();
                return Unit.f186387a;
            case 14:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((BlockedMerchantDetailsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 15:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ds2.i) obj3).u2();
                return Unit.f186387a;
            case 16:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.instalment.hub.a) ((ds4.q) ((CreditCardInstalmentHubScreen) obj3).N.getValue())).B2();
                return Unit.f186387a;
            case 17:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ReferralCampaignStateScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 18:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((AddToClickToPayScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 19:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((duk.i) ((SharpeRatioInfoScreen) obj3).M.getValue()).B2();
                return Unit.f186387a;
            case 20:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.a) ((DetailedStatsController) obj3).e3()).B2();
                return Unit.f186387a;
            case 21:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.kyc.impl.idnow.eid.flow.a) obj3).I2(dw8.d.SDK_NOT_SUPPORTED);
                return Unit.f186387a;
            case 22:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TicketDetailsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 23:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dx5.n nVar = (dx5.n) obj3;
                nVar.n2(new dx5.m(nVar, null), new whi.b(6));
                return Unit.f186387a;
            case 24:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.analytics.ui.widgetised.allocation.a) obj3).I2();
                return Unit.f186387a;
            case 25:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((InvoiceTemplatesListScreen) obj3).R2().B2();
                return Unit.f186387a;
            case 26:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dzb.i iVar = (dzb.i) ((RevPointsChallengeDetailsScreen) obj3).S.getValue();
                m1c.l0 challenge = (m1c.l0) ((dzb.b) ((j2) iVar.u.f22677a).getValue()).f121300a.getContent();
                if (challenge != null) {
                    String str3 = challenge.i;
                    Continuation continuation = null;
                    if (challenge.a()) {
                        iVar.n2(new dzb.h(str3, iVar, null), new whi.b(6));
                    } else {
                        int i3 = 2;
                        int i5 = 1;
                        if (challenge.f201394q) {
                            a2 a2Var = iVar.f121312t;
                            if (a2Var != null) {
                                a2Var.f(null);
                            }
                            bzb.a aVar29 = iVar.f121311s;
                            dzb.f onActivated = new dzb.f(iVar, i2);
                            dzb.f onError = new dzb.f(iVar, i5);
                            aVar29.getClass();
                            Intrinsics.checkNotNullParameter(challenge, "challenge");
                            Intrinsics.checkNotNullParameter("ACTION_BUTTON_LOADING_ID", "buttonTag");
                            Intrinsics.checkNotNullParameter(onActivated, "onActivated");
                            Intrinsics.checkNotNullParameter(onError, "onError");
                            aVar29.T2(new b96.d(aVar29, challenge, onActivated, continuation, 25), new byc.a(aVar29, onError, i3));
                        } else if (challenge.f201393p) {
                            iVar.l2(new dz6.o(iVar, challenge, continuation, i5), new dzb.f(iVar, i3));
                        } else if (str3 != null) {
                            iVar.n2(new dzb.h(iVar, str3, continuation, i5), new whi.b(6));
                        } else {
                            iVar.B2();
                        }
                    }
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((dzb.i) obj3).B2();
                return Unit.f186387a;
            case 28:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((dzd.g) ((dzd.b) ((BankIDAnnualStatementsScreen) obj3).Q.getValue())).B2();
                return Unit.f186387a;
            default:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c) ((ThreeDsScreen) obj3).R2()).J2();
                return Unit.f186387a;
        }
    }
}
