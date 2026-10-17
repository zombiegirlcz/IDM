package com.revolut.retail.feature.esim.impl.ui.flows.home;

import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import com.revolut.feature.esim.instructions.navigation.EsimInstructionsControllerDescriptor$InputData;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimGetPlanLaunchMode;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.impl.ui.flows.get_plan.EsimGetPlanFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.get_plan.EsimGetPlanFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a;
import com.revolut.retail.feature.esim.impl.ui.flows.help.EsimHelpFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.help.EsimHelpFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.home.EsimHomeFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.home.EsimHomeFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_phone_number_purchase.EsimMobilePlanPhoneNumberPurchaseFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_phone_number_purchase.EsimMobilePlanPhoneNumberPurchaseFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlowContract$EsimSubscriptionsToRefund;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.EsimConnectivityTroubleshootingFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.EsimConnectivityTroubleshootingFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.expired_subscriptions.EsimExpiredSubscriptionsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.EsimGiftRecipientSelectionScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$OutputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.EsimMobilePlanBillingScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.EsimMobilePlanBillingScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_invoices.EsimMobilePlanInvoicesScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_invoices.EsimMobilePlanInvoicesScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer.EsimMobilePlanNumberTransferScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer.EsimMobilePlanNumberTransferScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_payments.EsimMobilePlanPaymentsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_payments.EsimMobilePlanPaymentsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreenContract$InputData;
import dej.c4;
import dfj.f;
import dfj.h;
import dfj.j;
import dfj.w;
import dfj.z2;
import efj.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rhj.g;
import vjj.m;
import vjj.o;
import vjj.p;
import vjj.r;
import vjj.s;
import vjj.t;
import vjj.u;
import vkm.i;
import vkm.q;
import x18.e;
import xd2.n;
import yji.l;
import zmj.a0;
import zmj.b0;
import zmj.c0;
import zmj.d0;
import zmj.v;
import zmj.x;
import zmj.y;
import zmj.z;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends sfj.b implements xfj.b {
    public final EsimHomeFlowContract$EmptyState A;
    public final vii.b B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w f100685w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final bej.a f100686x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final cej.b f100687y;
    public final EsimHomeFlowContract$Step z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EsimHomeFlowContract$InputData inputData, w esimDataPlansInteractor, bej.a esimApnInteractor, cej.b mobilePlansFeatureAvailabilityInteractor, z2 esimRestrictionsInteractor) {
        EsimHomeFlowContract$Step subscriptions;
        super(esimRestrictionsInteractor, a.f);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(esimDataPlansInteractor, "esimDataPlansInteractor");
        Intrinsics.checkNotNullParameter(esimApnInteractor, "esimApnInteractor");
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(esimRestrictionsInteractor, "esimRestrictionsInteractor");
        this.f100685w = esimDataPlansInteractor;
        this.f100686x = esimApnInteractor;
        this.f100687y = mobilePlansFeatureAvailabilityInteractor;
        EsimHomeFlowContract$InputData.InitialDestination initialDestination = inputData.f100645a;
        if (initialDestination instanceof EsimHomeFlowContract$InputData.InitialDestination.Subscriptions) {
            EsimHomeFlowContract$InputData.InitialDestination.Subscriptions subscriptions2 = (EsimHomeFlowContract$InputData.InitialDestination.Subscriptions) initialDestination;
            subscriptions = new EsimHomeFlowContract$Step.Subscriptions(subscriptions2.f100649a, subscriptions2.f100651c, subscriptions2.f100650b == c4.EXPIRED);
        } else {
            if (!(initialDestination instanceof EsimHomeFlowContract$InputData.InitialDestination.Gifting)) {
                throw new NoWhenBranchMatchedException();
            }
            subscriptions = EsimHomeFlowContract$Step.GiftRecipientSelection.f100660a;
        }
        this.z = subscriptions;
        this.A = EsimHomeFlowContract$EmptyState.f100644a;
        this.B = new vii.b();
    }

    @Override // sfj.b, yji.l
    public final void I1() {
        super.I1();
        Continuation continuation = null;
        l.a1(this, q.Q(this.B, new e(continuation, this, 8)), null, null, null, 7);
        j jVar = (j) this.f100686x;
        l.a1(this, !jVar.f114003a.d() ? i.f290039a : q.Q(q.Q(new f(jVar.f114005c.f224612a.d, 0), new h(continuation, jVar, 0)), new h(continuation, jVar, 1)), null, null, null, 7);
    }

    public final boolean O2() {
        return ((d) this.f100687y).a();
    }

    public final void P2(c4 c4Var) {
        if (c4Var != c4.EXPIRED) {
            r2();
            E2(new EsimHomeFlowContract$Step.Subscriptions(0), false, null, false);
        } else if (K2(new dki.h((Function1) new n(12), false)) && B2(true)) {
            E2(EsimHomeFlowContract$Step.ExpiredSubscriptions.f100657a, true, TransitionAnimation.NONE.f98393a, true);
        } else {
            P2(c4.ACTIVE);
        }
        this.B.a();
    }

    public final void Q2() {
        if (K2(new dki.h((Function1) new n(11), false)) && B2(true)) {
            return;
        }
        P2(c4.ACTIVE);
    }

    public final void R2(String str) {
        l.j2(this, e1(new sd6.b(new EsimInstructionsControllerDescriptor$InputData(str, null))), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, null, 2);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        EsimSubscriptionsScreenContract$InputData.PreferredView giftRecipient;
        EsimHomeFlowContract$Step step = (EsimHomeFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof EsimHomeFlowContract$Step.GetDataPlan) {
            EsimHomeFlowContract$Step.GetDataPlan getDataPlan = (EsimHomeFlowContract$Step.GetDataPlan) step;
            EsimGetPlanFlow esimGetPlanFlow = new EsimGetPlanFlow(new EsimGetPlanFlowContract$InputData.Purchase(null, null, getDataPlan.f100658a, getDataPlan.f100659b, 3));
            final int i = 2;
            Function1 block = new Function1(this) { // from class: xfj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.home.c f305437b;

                {
                    this.f305437b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            d0 output = (d0) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof a0;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar = this.f305437b;
                            if (z) {
                                a0 a0Var = (a0) output;
                                cVar.E2(new EsimHomeFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b, 2), true, null, false);
                            } else if (output instanceof c0) {
                                cVar.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((c0) output).f323549a), true, null, false);
                            } else if (output instanceof x) {
                                cVar.E2(new EsimHomeFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                            } else if (output instanceof b0) {
                                cVar.E2(new EsimHomeFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                            } else if (output instanceof v) {
                                v vVar = (v) output;
                                cVar.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.DataPlanChange(vVar.f323593a, vVar.f323594b), vVar.f323595c), true, null, false);
                            } else if (output instanceof zmj.w) {
                                cVar.E2(new EsimHomeFlowContract$Step.ConnectivityTroubleshooting(((zmj.w) output).f323596a), true, null, false);
                            } else if (Intrinsics.f(output, y.f323598a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar.R2("INSTALLATION");
                            } else {
                                if (!(output instanceof z)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((z) output).f323599a), false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a result = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z3 = result instanceof m;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar2 = this.f305437b;
                            if (z3) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanBilling(((m) result).f289772a), true, null, false);
                                }
                            } else if (result instanceof vjj.n) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.Help(((vjj.n) result).f289773a), true, null, false);
                                }
                            } else if (result instanceof u) {
                                if (cVar2.O2()) {
                                    u uVar = (u) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(uVar.f289788a, uVar.f289789b), true, null, false);
                                }
                            } else if (Intrinsics.f(result, a.C0617a.f101205a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar2.R2("INSTALLATION");
                            } else if (result instanceof p) {
                                if (cVar2.O2()) {
                                    p pVar = (p) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false);
                                }
                            } else if (result instanceof vjj.l) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(((vjj.l) result).f289771a, lgj.e.ADD_NUMBER, null), true, null, false);
                                }
                            } else if (result instanceof o) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((o) result).f289774a), true, null, false);
                                }
                            } else if (result instanceof r) {
                                r rVar = (r) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, rVar.f289780a), true, null, false);
                            } else if (result instanceof vjj.q) {
                                vjj.q qVar = (vjj.q) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false);
                            } else if (result instanceof t) {
                                t tVar = (t) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(tVar.f289786a, tVar.f289787b), null, 2), true, null, false);
                            } else {
                                if (!(result instanceof s)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                s sVar = (s) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof a.C0610a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.r2();
                            return Unit.f186387a;
                        case 3:
                            d67.u it8 = (d67.u) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f305437b.I2();
                            return Unit.f186387a;
                        case 4:
                            wfj.c result2 = (wfj.c) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.EsimRefund(null), true, null, false);
                            return Unit.f186387a;
                        case 5:
                            uhj.e output3 = (uhj.e) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, output3.f280256a, 1), true, null, false);
                            return Unit.f186387a;
                        case 6:
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result3 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean zF = Intrinsics.f(result3, a.b.f100765a);
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar3 = this.f305437b;
                            if (zF) {
                                cVar3.Q2();
                                cVar3.B.a();
                            } else {
                                if (!(result3 instanceof a.C0612a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((a.C0612a) result3).f100764a) {
                                    cVar3.Q2();
                                } else {
                                    cVar3.q2();
                                }
                            }
                            return Unit.f186387a;
                        case 7:
                            rhj.i output4 = (rhj.i) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            boolean z4 = output4 instanceof g;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar4 = this.f305437b;
                            if (z4) {
                                cVar4.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((g) output4).f254496a), true, null, false);
                            } else {
                                if (!(output4 instanceof rhj.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (cVar4.O2()) {
                                    cVar4.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((rhj.h) output4).f254497a), true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 8:
                            bgj.c result4 = (bgj.c) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            if (result4 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(result4.f15206a);
                            return Unit.f186387a;
                        case 9:
                            pgj.d result5 = (pgj.d) obj2;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (!(result5 instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(((pgj.c) result5).f235975a);
                            return Unit.f186387a;
                        case 10:
                            fjj.p result6 = (fjj.p) obj2;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z6 = result6 instanceof fjj.n;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar5 = this.f305437b;
                            if (z6) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanPayments(((fjj.n) result6).f135664a), true, null, false);
                                }
                            } else if (result6 instanceof fjj.l) {
                                if (cVar5.O2()) {
                                    fjj.l lVar = (fjj.l) result6;
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false);
                                }
                            } else if (result6 instanceof fjj.m) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((fjj.m) result6).f135663a), true, null, false);
                                }
                            } else {
                                if (!(result6 instanceof fjj.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fjj.o oVar = (fjj.o) result6;
                                cVar5.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(oVar.f135665a, oVar.f135666b), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            EsimSubscriptionsScreenContract$OutputData output5 = (EsimSubscriptionsScreenContract$OutputData) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean z11 = output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToGetPlan;
                            boolean z12 = false;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar6 = this.f305437b;
                            if (z11) {
                                int i2 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToGetPlan) output5).f101049a.ordinal()];
                                if (i2 == 1) {
                                    cVar6.r2();
                                    cVar6.n2(new com.revolut.retail.feature.esim.impl.ui.flows.home.b(cVar6, null), new whi.b(6));
                                } else {
                                    if (i2 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, null, 3), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GiftPlanClicked) {
                                cVar6.E2(EsimHomeFlowContract$Step.GiftRecipientSelection.f100660a, true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) {
                                int i3 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) output5).f101048a.ordinal()];
                                if (i3 != 1) {
                                    if (i3 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z12 = true;
                                }
                                cVar6.E2(EsimHomeFlowContract$Step.ExpiredSubscriptions.f100657a, true, z12 ? TransitionAnimation.SLIDE_END_TO_START.f98395a : TransitionAnimation.NONE.f98393a, !z12);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Checkout(((EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) output5).f101044a, (EsimGiftRecipient) null, 6), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) output5).f101045a), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.InstallationInstructionsClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("INSTALLATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.EnableEsimClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("ACTIVATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.HelpClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Help(null), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) {
                                if (cVar6.O2()) {
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) output5).f101060a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked mobilePlanResubscribeClicked = (EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(mobilePlanResubscribeClicked.f101058a, mobilePlanResubscribeClicked.f101059b), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick mobilePlanPortingUpdateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(mobilePlanPortingUpdateClick.f101055a, mobilePlanPortingUpdateClick.f101056b, mobilePlanPortingUpdateClick.f101057c, mobilePlanPortingUpdateClick.d), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick mobilePlanPortingCreateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(mobilePlanPortingCreateClick.d, mobilePlanPortingCreateClick.f101053b, mobilePlanPortingCreateClick.f101054c, mobilePlanPortingCreateClick.f101052a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanChange) {
                                EsimSubscriptionsScreenContract$OutputData.PlanChange planChange = (EsimSubscriptionsScreenContract$OutputData.PlanChange) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(planChange.f101062b, planChange.f101061a), null, 2), true, null, false);
                            } else {
                                if (!(output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanUpgrade)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                EsimSubscriptionsScreenContract$OutputData.PlanUpgrade planUpgrade = (EsimSubscriptionsScreenContract$OutputData.PlanUpgrade) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(planUpgrade.f101064b, planUpgrade.f101063a), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            esimGetPlanFlow.H = block;
            return esimGetPlanFlow;
        }
        if (step instanceof EsimHomeFlowContract$Step.GiftRecipientSelection) {
            EsimGiftRecipientSelectionScreen esimGiftRecipientSelectionScreen = new EsimGiftRecipientSelectionScreen();
            final int i2 = 5;
            Function1 block2 = new Function1(this) { // from class: xfj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.home.c f305437b;

                {
                    this.f305437b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            d0 output = (d0) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof a0;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar = this.f305437b;
                            if (z) {
                                a0 a0Var = (a0) output;
                                cVar.E2(new EsimHomeFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b, 2), true, null, false);
                            } else if (output instanceof c0) {
                                cVar.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((c0) output).f323549a), true, null, false);
                            } else if (output instanceof x) {
                                cVar.E2(new EsimHomeFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                            } else if (output instanceof b0) {
                                cVar.E2(new EsimHomeFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                            } else if (output instanceof v) {
                                v vVar = (v) output;
                                cVar.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.DataPlanChange(vVar.f323593a, vVar.f323594b), vVar.f323595c), true, null, false);
                            } else if (output instanceof zmj.w) {
                                cVar.E2(new EsimHomeFlowContract$Step.ConnectivityTroubleshooting(((zmj.w) output).f323596a), true, null, false);
                            } else if (Intrinsics.f(output, y.f323598a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar.R2("INSTALLATION");
                            } else {
                                if (!(output instanceof z)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((z) output).f323599a), false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a result = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z3 = result instanceof m;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar2 = this.f305437b;
                            if (z3) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanBilling(((m) result).f289772a), true, null, false);
                                }
                            } else if (result instanceof vjj.n) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.Help(((vjj.n) result).f289773a), true, null, false);
                                }
                            } else if (result instanceof u) {
                                if (cVar2.O2()) {
                                    u uVar = (u) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(uVar.f289788a, uVar.f289789b), true, null, false);
                                }
                            } else if (Intrinsics.f(result, a.C0617a.f101205a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar2.R2("INSTALLATION");
                            } else if (result instanceof p) {
                                if (cVar2.O2()) {
                                    p pVar = (p) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false);
                                }
                            } else if (result instanceof vjj.l) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(((vjj.l) result).f289771a, lgj.e.ADD_NUMBER, null), true, null, false);
                                }
                            } else if (result instanceof o) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((o) result).f289774a), true, null, false);
                                }
                            } else if (result instanceof r) {
                                r rVar = (r) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, rVar.f289780a), true, null, false);
                            } else if (result instanceof vjj.q) {
                                vjj.q qVar = (vjj.q) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false);
                            } else if (result instanceof t) {
                                t tVar = (t) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(tVar.f289786a, tVar.f289787b), null, 2), true, null, false);
                            } else {
                                if (!(result instanceof s)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                s sVar = (s) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof a.C0610a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.r2();
                            return Unit.f186387a;
                        case 3:
                            d67.u it8 = (d67.u) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f305437b.I2();
                            return Unit.f186387a;
                        case 4:
                            wfj.c result2 = (wfj.c) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.EsimRefund(null), true, null, false);
                            return Unit.f186387a;
                        case 5:
                            uhj.e output3 = (uhj.e) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, output3.f280256a, 1), true, null, false);
                            return Unit.f186387a;
                        case 6:
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result3 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean zF = Intrinsics.f(result3, a.b.f100765a);
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar3 = this.f305437b;
                            if (zF) {
                                cVar3.Q2();
                                cVar3.B.a();
                            } else {
                                if (!(result3 instanceof a.C0612a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((a.C0612a) result3).f100764a) {
                                    cVar3.Q2();
                                } else {
                                    cVar3.q2();
                                }
                            }
                            return Unit.f186387a;
                        case 7:
                            rhj.i output4 = (rhj.i) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            boolean z4 = output4 instanceof g;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar4 = this.f305437b;
                            if (z4) {
                                cVar4.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((g) output4).f254496a), true, null, false);
                            } else {
                                if (!(output4 instanceof rhj.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (cVar4.O2()) {
                                    cVar4.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((rhj.h) output4).f254497a), true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 8:
                            bgj.c result4 = (bgj.c) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            if (result4 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(result4.f15206a);
                            return Unit.f186387a;
                        case 9:
                            pgj.d result5 = (pgj.d) obj2;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (!(result5 instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(((pgj.c) result5).f235975a);
                            return Unit.f186387a;
                        case 10:
                            fjj.p result6 = (fjj.p) obj2;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z6 = result6 instanceof fjj.n;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar5 = this.f305437b;
                            if (z6) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanPayments(((fjj.n) result6).f135664a), true, null, false);
                                }
                            } else if (result6 instanceof fjj.l) {
                                if (cVar5.O2()) {
                                    fjj.l lVar = (fjj.l) result6;
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false);
                                }
                            } else if (result6 instanceof fjj.m) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((fjj.m) result6).f135663a), true, null, false);
                                }
                            } else {
                                if (!(result6 instanceof fjj.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fjj.o oVar = (fjj.o) result6;
                                cVar5.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(oVar.f135665a, oVar.f135666b), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            EsimSubscriptionsScreenContract$OutputData output5 = (EsimSubscriptionsScreenContract$OutputData) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean z11 = output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToGetPlan;
                            boolean z12 = false;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar6 = this.f305437b;
                            if (z11) {
                                int i22 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToGetPlan) output5).f101049a.ordinal()];
                                if (i22 == 1) {
                                    cVar6.r2();
                                    cVar6.n2(new com.revolut.retail.feature.esim.impl.ui.flows.home.b(cVar6, null), new whi.b(6));
                                } else {
                                    if (i22 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, null, 3), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GiftPlanClicked) {
                                cVar6.E2(EsimHomeFlowContract$Step.GiftRecipientSelection.f100660a, true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) {
                                int i3 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) output5).f101048a.ordinal()];
                                if (i3 != 1) {
                                    if (i3 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z12 = true;
                                }
                                cVar6.E2(EsimHomeFlowContract$Step.ExpiredSubscriptions.f100657a, true, z12 ? TransitionAnimation.SLIDE_END_TO_START.f98395a : TransitionAnimation.NONE.f98393a, !z12);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Checkout(((EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) output5).f101044a, (EsimGiftRecipient) null, 6), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) output5).f101045a), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.InstallationInstructionsClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("INSTALLATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.EnableEsimClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("ACTIVATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.HelpClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Help(null), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) {
                                if (cVar6.O2()) {
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) output5).f101060a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked mobilePlanResubscribeClicked = (EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(mobilePlanResubscribeClicked.f101058a, mobilePlanResubscribeClicked.f101059b), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick mobilePlanPortingUpdateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(mobilePlanPortingUpdateClick.f101055a, mobilePlanPortingUpdateClick.f101056b, mobilePlanPortingUpdateClick.f101057c, mobilePlanPortingUpdateClick.d), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick mobilePlanPortingCreateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(mobilePlanPortingCreateClick.d, mobilePlanPortingCreateClick.f101053b, mobilePlanPortingCreateClick.f101054c, mobilePlanPortingCreateClick.f101052a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanChange) {
                                EsimSubscriptionsScreenContract$OutputData.PlanChange planChange = (EsimSubscriptionsScreenContract$OutputData.PlanChange) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(planChange.f101062b, planChange.f101061a), null, 2), true, null, false);
                            } else {
                                if (!(output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanUpgrade)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                EsimSubscriptionsScreenContract$OutputData.PlanUpgrade planUpgrade = (EsimSubscriptionsScreenContract$OutputData.PlanUpgrade) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(planUpgrade.f101064b, planUpgrade.f101063a), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            esimGiftRecipientSelectionScreen.H = block2;
            return esimGiftRecipientSelectionScreen;
        }
        if (step instanceof EsimHomeFlowContract$Step.Subscriptions) {
            EsimHomeFlowContract$Step.Subscriptions subscriptions = (EsimHomeFlowContract$Step.Subscriptions) step;
            EsimHomeFlowContract$InputData.InitialDestination.PreferredView preferredView = subscriptions.f100682a;
            if (Intrinsics.f(preferredView, EsimHomeFlowContract$InputData.InitialDestination.PreferredView.CurrentDevice.f100647a)) {
                giftRecipient = EsimSubscriptionsScreenContract$InputData.PreferredView.CurrentDevice.f101031a;
            } else {
                if (!(preferredView instanceof EsimHomeFlowContract$InputData.InitialDestination.PreferredView.GiftRecipient)) {
                    throw new NoWhenBranchMatchedException();
                }
                giftRecipient = new EsimSubscriptionsScreenContract$InputData.PreferredView.GiftRecipient(((EsimHomeFlowContract$InputData.InitialDestination.PreferredView.GiftRecipient) preferredView).f100648a);
            }
            EsimSubscriptionsScreen esimSubscriptionsScreen = new EsimSubscriptionsScreen(new EsimSubscriptionsScreenContract$InputData(giftRecipient, new EsimSubscriptionsScreenContract$InputData.Routing(subscriptions.f100683b, subscriptions.f100684c)));
            final int i3 = 11;
            Function1 block3 = new Function1(this) { // from class: xfj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.home.c f305437b;

                {
                    this.f305437b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            d0 output = (d0) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof a0;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar = this.f305437b;
                            if (z) {
                                a0 a0Var = (a0) output;
                                cVar.E2(new EsimHomeFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b, 2), true, null, false);
                            } else if (output instanceof c0) {
                                cVar.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((c0) output).f323549a), true, null, false);
                            } else if (output instanceof x) {
                                cVar.E2(new EsimHomeFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                            } else if (output instanceof b0) {
                                cVar.E2(new EsimHomeFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                            } else if (output instanceof v) {
                                v vVar = (v) output;
                                cVar.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.DataPlanChange(vVar.f323593a, vVar.f323594b), vVar.f323595c), true, null, false);
                            } else if (output instanceof zmj.w) {
                                cVar.E2(new EsimHomeFlowContract$Step.ConnectivityTroubleshooting(((zmj.w) output).f323596a), true, null, false);
                            } else if (Intrinsics.f(output, y.f323598a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar.R2("INSTALLATION");
                            } else {
                                if (!(output instanceof z)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((z) output).f323599a), false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a result = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z3 = result instanceof m;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar2 = this.f305437b;
                            if (z3) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanBilling(((m) result).f289772a), true, null, false);
                                }
                            } else if (result instanceof vjj.n) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.Help(((vjj.n) result).f289773a), true, null, false);
                                }
                            } else if (result instanceof u) {
                                if (cVar2.O2()) {
                                    u uVar = (u) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(uVar.f289788a, uVar.f289789b), true, null, false);
                                }
                            } else if (Intrinsics.f(result, a.C0617a.f101205a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar2.R2("INSTALLATION");
                            } else if (result instanceof p) {
                                if (cVar2.O2()) {
                                    p pVar = (p) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false);
                                }
                            } else if (result instanceof vjj.l) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(((vjj.l) result).f289771a, lgj.e.ADD_NUMBER, null), true, null, false);
                                }
                            } else if (result instanceof o) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((o) result).f289774a), true, null, false);
                                }
                            } else if (result instanceof r) {
                                r rVar = (r) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, rVar.f289780a), true, null, false);
                            } else if (result instanceof vjj.q) {
                                vjj.q qVar = (vjj.q) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false);
                            } else if (result instanceof t) {
                                t tVar = (t) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(tVar.f289786a, tVar.f289787b), null, 2), true, null, false);
                            } else {
                                if (!(result instanceof s)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                s sVar = (s) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof a.C0610a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.r2();
                            return Unit.f186387a;
                        case 3:
                            d67.u it8 = (d67.u) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f305437b.I2();
                            return Unit.f186387a;
                        case 4:
                            wfj.c result2 = (wfj.c) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.EsimRefund(null), true, null, false);
                            return Unit.f186387a;
                        case 5:
                            uhj.e output3 = (uhj.e) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, output3.f280256a, 1), true, null, false);
                            return Unit.f186387a;
                        case 6:
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result3 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean zF = Intrinsics.f(result3, a.b.f100765a);
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar3 = this.f305437b;
                            if (zF) {
                                cVar3.Q2();
                                cVar3.B.a();
                            } else {
                                if (!(result3 instanceof a.C0612a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((a.C0612a) result3).f100764a) {
                                    cVar3.Q2();
                                } else {
                                    cVar3.q2();
                                }
                            }
                            return Unit.f186387a;
                        case 7:
                            rhj.i output4 = (rhj.i) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            boolean z4 = output4 instanceof g;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar4 = this.f305437b;
                            if (z4) {
                                cVar4.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((g) output4).f254496a), true, null, false);
                            } else {
                                if (!(output4 instanceof rhj.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (cVar4.O2()) {
                                    cVar4.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((rhj.h) output4).f254497a), true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 8:
                            bgj.c result4 = (bgj.c) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            if (result4 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(result4.f15206a);
                            return Unit.f186387a;
                        case 9:
                            pgj.d result5 = (pgj.d) obj2;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (!(result5 instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(((pgj.c) result5).f235975a);
                            return Unit.f186387a;
                        case 10:
                            fjj.p result6 = (fjj.p) obj2;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z6 = result6 instanceof fjj.n;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar5 = this.f305437b;
                            if (z6) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanPayments(((fjj.n) result6).f135664a), true, null, false);
                                }
                            } else if (result6 instanceof fjj.l) {
                                if (cVar5.O2()) {
                                    fjj.l lVar = (fjj.l) result6;
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false);
                                }
                            } else if (result6 instanceof fjj.m) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((fjj.m) result6).f135663a), true, null, false);
                                }
                            } else {
                                if (!(result6 instanceof fjj.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fjj.o oVar = (fjj.o) result6;
                                cVar5.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(oVar.f135665a, oVar.f135666b), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            EsimSubscriptionsScreenContract$OutputData output5 = (EsimSubscriptionsScreenContract$OutputData) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean z11 = output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToGetPlan;
                            boolean z12 = false;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar6 = this.f305437b;
                            if (z11) {
                                int i22 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToGetPlan) output5).f101049a.ordinal()];
                                if (i22 == 1) {
                                    cVar6.r2();
                                    cVar6.n2(new com.revolut.retail.feature.esim.impl.ui.flows.home.b(cVar6, null), new whi.b(6));
                                } else {
                                    if (i22 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, null, 3), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GiftPlanClicked) {
                                cVar6.E2(EsimHomeFlowContract$Step.GiftRecipientSelection.f100660a, true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) {
                                int i32 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) output5).f101048a.ordinal()];
                                if (i32 != 1) {
                                    if (i32 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z12 = true;
                                }
                                cVar6.E2(EsimHomeFlowContract$Step.ExpiredSubscriptions.f100657a, true, z12 ? TransitionAnimation.SLIDE_END_TO_START.f98395a : TransitionAnimation.NONE.f98393a, !z12);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Checkout(((EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) output5).f101044a, (EsimGiftRecipient) null, 6), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) output5).f101045a), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.InstallationInstructionsClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("INSTALLATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.EnableEsimClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("ACTIVATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.HelpClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Help(null), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) {
                                if (cVar6.O2()) {
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) output5).f101060a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked mobilePlanResubscribeClicked = (EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(mobilePlanResubscribeClicked.f101058a, mobilePlanResubscribeClicked.f101059b), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick mobilePlanPortingUpdateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(mobilePlanPortingUpdateClick.f101055a, mobilePlanPortingUpdateClick.f101056b, mobilePlanPortingUpdateClick.f101057c, mobilePlanPortingUpdateClick.d), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick mobilePlanPortingCreateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(mobilePlanPortingCreateClick.d, mobilePlanPortingCreateClick.f101053b, mobilePlanPortingCreateClick.f101054c, mobilePlanPortingCreateClick.f101052a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanChange) {
                                EsimSubscriptionsScreenContract$OutputData.PlanChange planChange = (EsimSubscriptionsScreenContract$OutputData.PlanChange) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(planChange.f101062b, planChange.f101061a), null, 2), true, null, false);
                            } else {
                                if (!(output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanUpgrade)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                EsimSubscriptionsScreenContract$OutputData.PlanUpgrade planUpgrade = (EsimSubscriptionsScreenContract$OutputData.PlanUpgrade) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(planUpgrade.f101064b, planUpgrade.f101063a), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            esimSubscriptionsScreen.H = block3;
            return esimSubscriptionsScreen;
        }
        if (step instanceof EsimHomeFlowContract$Step.ExpiredSubscriptions) {
            EsimExpiredSubscriptionsScreen esimExpiredSubscriptionsScreen = new EsimExpiredSubscriptionsScreen();
            final int i5 = 7;
            Function1 block4 = new Function1(this) { // from class: xfj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.home.c f305437b;

                {
                    this.f305437b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i5) {
                        case 0:
                            d0 output = (d0) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof a0;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar = this.f305437b;
                            if (z) {
                                a0 a0Var = (a0) output;
                                cVar.E2(new EsimHomeFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b, 2), true, null, false);
                            } else if (output instanceof c0) {
                                cVar.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((c0) output).f323549a), true, null, false);
                            } else if (output instanceof x) {
                                cVar.E2(new EsimHomeFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                            } else if (output instanceof b0) {
                                cVar.E2(new EsimHomeFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                            } else if (output instanceof v) {
                                v vVar = (v) output;
                                cVar.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.DataPlanChange(vVar.f323593a, vVar.f323594b), vVar.f323595c), true, null, false);
                            } else if (output instanceof zmj.w) {
                                cVar.E2(new EsimHomeFlowContract$Step.ConnectivityTroubleshooting(((zmj.w) output).f323596a), true, null, false);
                            } else if (Intrinsics.f(output, y.f323598a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar.R2("INSTALLATION");
                            } else {
                                if (!(output instanceof z)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((z) output).f323599a), false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a result = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z3 = result instanceof m;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar2 = this.f305437b;
                            if (z3) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanBilling(((m) result).f289772a), true, null, false);
                                }
                            } else if (result instanceof vjj.n) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.Help(((vjj.n) result).f289773a), true, null, false);
                                }
                            } else if (result instanceof u) {
                                if (cVar2.O2()) {
                                    u uVar = (u) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(uVar.f289788a, uVar.f289789b), true, null, false);
                                }
                            } else if (Intrinsics.f(result, a.C0617a.f101205a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar2.R2("INSTALLATION");
                            } else if (result instanceof p) {
                                if (cVar2.O2()) {
                                    p pVar = (p) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false);
                                }
                            } else if (result instanceof vjj.l) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(((vjj.l) result).f289771a, lgj.e.ADD_NUMBER, null), true, null, false);
                                }
                            } else if (result instanceof o) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((o) result).f289774a), true, null, false);
                                }
                            } else if (result instanceof r) {
                                r rVar = (r) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, rVar.f289780a), true, null, false);
                            } else if (result instanceof vjj.q) {
                                vjj.q qVar = (vjj.q) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false);
                            } else if (result instanceof t) {
                                t tVar = (t) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(tVar.f289786a, tVar.f289787b), null, 2), true, null, false);
                            } else {
                                if (!(result instanceof s)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                s sVar = (s) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof a.C0610a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.r2();
                            return Unit.f186387a;
                        case 3:
                            d67.u it8 = (d67.u) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f305437b.I2();
                            return Unit.f186387a;
                        case 4:
                            wfj.c result2 = (wfj.c) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.EsimRefund(null), true, null, false);
                            return Unit.f186387a;
                        case 5:
                            uhj.e output3 = (uhj.e) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, output3.f280256a, 1), true, null, false);
                            return Unit.f186387a;
                        case 6:
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result3 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean zF = Intrinsics.f(result3, a.b.f100765a);
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar3 = this.f305437b;
                            if (zF) {
                                cVar3.Q2();
                                cVar3.B.a();
                            } else {
                                if (!(result3 instanceof a.C0612a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((a.C0612a) result3).f100764a) {
                                    cVar3.Q2();
                                } else {
                                    cVar3.q2();
                                }
                            }
                            return Unit.f186387a;
                        case 7:
                            rhj.i output4 = (rhj.i) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            boolean z4 = output4 instanceof g;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar4 = this.f305437b;
                            if (z4) {
                                cVar4.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((g) output4).f254496a), true, null, false);
                            } else {
                                if (!(output4 instanceof rhj.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (cVar4.O2()) {
                                    cVar4.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((rhj.h) output4).f254497a), true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 8:
                            bgj.c result4 = (bgj.c) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            if (result4 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(result4.f15206a);
                            return Unit.f186387a;
                        case 9:
                            pgj.d result5 = (pgj.d) obj2;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (!(result5 instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(((pgj.c) result5).f235975a);
                            return Unit.f186387a;
                        case 10:
                            fjj.p result6 = (fjj.p) obj2;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z6 = result6 instanceof fjj.n;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar5 = this.f305437b;
                            if (z6) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanPayments(((fjj.n) result6).f135664a), true, null, false);
                                }
                            } else if (result6 instanceof fjj.l) {
                                if (cVar5.O2()) {
                                    fjj.l lVar = (fjj.l) result6;
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false);
                                }
                            } else if (result6 instanceof fjj.m) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((fjj.m) result6).f135663a), true, null, false);
                                }
                            } else {
                                if (!(result6 instanceof fjj.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fjj.o oVar = (fjj.o) result6;
                                cVar5.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(oVar.f135665a, oVar.f135666b), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            EsimSubscriptionsScreenContract$OutputData output5 = (EsimSubscriptionsScreenContract$OutputData) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean z11 = output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToGetPlan;
                            boolean z12 = false;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar6 = this.f305437b;
                            if (z11) {
                                int i22 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToGetPlan) output5).f101049a.ordinal()];
                                if (i22 == 1) {
                                    cVar6.r2();
                                    cVar6.n2(new com.revolut.retail.feature.esim.impl.ui.flows.home.b(cVar6, null), new whi.b(6));
                                } else {
                                    if (i22 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, null, 3), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GiftPlanClicked) {
                                cVar6.E2(EsimHomeFlowContract$Step.GiftRecipientSelection.f100660a, true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) {
                                int i32 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) output5).f101048a.ordinal()];
                                if (i32 != 1) {
                                    if (i32 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z12 = true;
                                }
                                cVar6.E2(EsimHomeFlowContract$Step.ExpiredSubscriptions.f100657a, true, z12 ? TransitionAnimation.SLIDE_END_TO_START.f98395a : TransitionAnimation.NONE.f98393a, !z12);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Checkout(((EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) output5).f101044a, (EsimGiftRecipient) null, 6), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) output5).f101045a), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.InstallationInstructionsClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("INSTALLATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.EnableEsimClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("ACTIVATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.HelpClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Help(null), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) {
                                if (cVar6.O2()) {
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) output5).f101060a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked mobilePlanResubscribeClicked = (EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(mobilePlanResubscribeClicked.f101058a, mobilePlanResubscribeClicked.f101059b), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick mobilePlanPortingUpdateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(mobilePlanPortingUpdateClick.f101055a, mobilePlanPortingUpdateClick.f101056b, mobilePlanPortingUpdateClick.f101057c, mobilePlanPortingUpdateClick.d), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick mobilePlanPortingCreateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(mobilePlanPortingCreateClick.d, mobilePlanPortingCreateClick.f101053b, mobilePlanPortingCreateClick.f101054c, mobilePlanPortingCreateClick.f101052a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanChange) {
                                EsimSubscriptionsScreenContract$OutputData.PlanChange planChange = (EsimSubscriptionsScreenContract$OutputData.PlanChange) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(planChange.f101062b, planChange.f101061a), null, 2), true, null, false);
                            } else {
                                if (!(output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanUpgrade)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                EsimSubscriptionsScreenContract$OutputData.PlanUpgrade planUpgrade = (EsimSubscriptionsScreenContract$OutputData.PlanUpgrade) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(planUpgrade.f101064b, planUpgrade.f101063a), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block4, "block");
            esimExpiredSubscriptionsScreen.H = block4;
            return esimExpiredSubscriptionsScreen;
        }
        if (step instanceof EsimHomeFlowContract$Step.Checkout) {
            EsimHomeFlowContract$Step.Checkout checkout = (EsimHomeFlowContract$Step.Checkout) step;
            EsimGetPlanFlow esimGetPlanFlow2 = new EsimGetPlanFlow(new EsimGetPlanFlowContract$InputData.DataPlanCheckout(checkout.f100652a, checkout.f100653b, checkout.f100654c));
            final int i6 = 2;
            Function1 block5 = new Function1(this) { // from class: xfj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.home.c f305437b;

                {
                    this.f305437b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i6) {
                        case 0:
                            d0 output = (d0) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof a0;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar = this.f305437b;
                            if (z) {
                                a0 a0Var = (a0) output;
                                cVar.E2(new EsimHomeFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b, 2), true, null, false);
                            } else if (output instanceof c0) {
                                cVar.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((c0) output).f323549a), true, null, false);
                            } else if (output instanceof x) {
                                cVar.E2(new EsimHomeFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                            } else if (output instanceof b0) {
                                cVar.E2(new EsimHomeFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                            } else if (output instanceof v) {
                                v vVar = (v) output;
                                cVar.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.DataPlanChange(vVar.f323593a, vVar.f323594b), vVar.f323595c), true, null, false);
                            } else if (output instanceof zmj.w) {
                                cVar.E2(new EsimHomeFlowContract$Step.ConnectivityTroubleshooting(((zmj.w) output).f323596a), true, null, false);
                            } else if (Intrinsics.f(output, y.f323598a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar.R2("INSTALLATION");
                            } else {
                                if (!(output instanceof z)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((z) output).f323599a), false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a result = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z3 = result instanceof m;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar2 = this.f305437b;
                            if (z3) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanBilling(((m) result).f289772a), true, null, false);
                                }
                            } else if (result instanceof vjj.n) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.Help(((vjj.n) result).f289773a), true, null, false);
                                }
                            } else if (result instanceof u) {
                                if (cVar2.O2()) {
                                    u uVar = (u) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(uVar.f289788a, uVar.f289789b), true, null, false);
                                }
                            } else if (Intrinsics.f(result, a.C0617a.f101205a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar2.R2("INSTALLATION");
                            } else if (result instanceof p) {
                                if (cVar2.O2()) {
                                    p pVar = (p) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false);
                                }
                            } else if (result instanceof vjj.l) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(((vjj.l) result).f289771a, lgj.e.ADD_NUMBER, null), true, null, false);
                                }
                            } else if (result instanceof o) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((o) result).f289774a), true, null, false);
                                }
                            } else if (result instanceof r) {
                                r rVar = (r) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, rVar.f289780a), true, null, false);
                            } else if (result instanceof vjj.q) {
                                vjj.q qVar = (vjj.q) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false);
                            } else if (result instanceof t) {
                                t tVar = (t) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(tVar.f289786a, tVar.f289787b), null, 2), true, null, false);
                            } else {
                                if (!(result instanceof s)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                s sVar = (s) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof a.C0610a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.r2();
                            return Unit.f186387a;
                        case 3:
                            d67.u it8 = (d67.u) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f305437b.I2();
                            return Unit.f186387a;
                        case 4:
                            wfj.c result2 = (wfj.c) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.EsimRefund(null), true, null, false);
                            return Unit.f186387a;
                        case 5:
                            uhj.e output3 = (uhj.e) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, output3.f280256a, 1), true, null, false);
                            return Unit.f186387a;
                        case 6:
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result3 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean zF = Intrinsics.f(result3, a.b.f100765a);
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar3 = this.f305437b;
                            if (zF) {
                                cVar3.Q2();
                                cVar3.B.a();
                            } else {
                                if (!(result3 instanceof a.C0612a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((a.C0612a) result3).f100764a) {
                                    cVar3.Q2();
                                } else {
                                    cVar3.q2();
                                }
                            }
                            return Unit.f186387a;
                        case 7:
                            rhj.i output4 = (rhj.i) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            boolean z4 = output4 instanceof g;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar4 = this.f305437b;
                            if (z4) {
                                cVar4.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((g) output4).f254496a), true, null, false);
                            } else {
                                if (!(output4 instanceof rhj.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (cVar4.O2()) {
                                    cVar4.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((rhj.h) output4).f254497a), true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 8:
                            bgj.c result4 = (bgj.c) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            if (result4 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(result4.f15206a);
                            return Unit.f186387a;
                        case 9:
                            pgj.d result5 = (pgj.d) obj2;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (!(result5 instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(((pgj.c) result5).f235975a);
                            return Unit.f186387a;
                        case 10:
                            fjj.p result6 = (fjj.p) obj2;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z6 = result6 instanceof fjj.n;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar5 = this.f305437b;
                            if (z6) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanPayments(((fjj.n) result6).f135664a), true, null, false);
                                }
                            } else if (result6 instanceof fjj.l) {
                                if (cVar5.O2()) {
                                    fjj.l lVar = (fjj.l) result6;
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false);
                                }
                            } else if (result6 instanceof fjj.m) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((fjj.m) result6).f135663a), true, null, false);
                                }
                            } else {
                                if (!(result6 instanceof fjj.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fjj.o oVar = (fjj.o) result6;
                                cVar5.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(oVar.f135665a, oVar.f135666b), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            EsimSubscriptionsScreenContract$OutputData output5 = (EsimSubscriptionsScreenContract$OutputData) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean z11 = output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToGetPlan;
                            boolean z12 = false;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar6 = this.f305437b;
                            if (z11) {
                                int i22 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToGetPlan) output5).f101049a.ordinal()];
                                if (i22 == 1) {
                                    cVar6.r2();
                                    cVar6.n2(new com.revolut.retail.feature.esim.impl.ui.flows.home.b(cVar6, null), new whi.b(6));
                                } else {
                                    if (i22 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, null, 3), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GiftPlanClicked) {
                                cVar6.E2(EsimHomeFlowContract$Step.GiftRecipientSelection.f100660a, true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) {
                                int i32 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) output5).f101048a.ordinal()];
                                if (i32 != 1) {
                                    if (i32 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z12 = true;
                                }
                                cVar6.E2(EsimHomeFlowContract$Step.ExpiredSubscriptions.f100657a, true, z12 ? TransitionAnimation.SLIDE_END_TO_START.f98395a : TransitionAnimation.NONE.f98393a, !z12);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Checkout(((EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) output5).f101044a, (EsimGiftRecipient) null, 6), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) output5).f101045a), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.InstallationInstructionsClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("INSTALLATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.EnableEsimClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("ACTIVATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.HelpClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Help(null), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) {
                                if (cVar6.O2()) {
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) output5).f101060a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked mobilePlanResubscribeClicked = (EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(mobilePlanResubscribeClicked.f101058a, mobilePlanResubscribeClicked.f101059b), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick mobilePlanPortingUpdateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(mobilePlanPortingUpdateClick.f101055a, mobilePlanPortingUpdateClick.f101056b, mobilePlanPortingUpdateClick.f101057c, mobilePlanPortingUpdateClick.d), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick mobilePlanPortingCreateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(mobilePlanPortingCreateClick.d, mobilePlanPortingCreateClick.f101053b, mobilePlanPortingCreateClick.f101054c, mobilePlanPortingCreateClick.f101052a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanChange) {
                                EsimSubscriptionsScreenContract$OutputData.PlanChange planChange = (EsimSubscriptionsScreenContract$OutputData.PlanChange) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(planChange.f101062b, planChange.f101061a), null, 2), true, null, false);
                            } else {
                                if (!(output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanUpgrade)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                EsimSubscriptionsScreenContract$OutputData.PlanUpgrade planUpgrade = (EsimSubscriptionsScreenContract$OutputData.PlanUpgrade) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(planUpgrade.f101064b, planUpgrade.f101063a), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block5, "block");
            esimGetPlanFlow2.H = block5;
            return esimGetPlanFlow2;
        }
        if (step instanceof EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout) {
            EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout mobilePlanResubscribeCheckout = (EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout) step;
            EsimGetPlanFlow esimGetPlanFlow3 = new EsimGetPlanFlow(new EsimGetPlanFlowContract$InputData.MobilePlanCheckout(mobilePlanResubscribeCheckout.f100669a, mobilePlanResubscribeCheckout.f100670b, null));
            final int i21 = 2;
            Function1 block6 = new Function1(this) { // from class: xfj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.home.c f305437b;

                {
                    this.f305437b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i21) {
                        case 0:
                            d0 output = (d0) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof a0;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar = this.f305437b;
                            if (z) {
                                a0 a0Var = (a0) output;
                                cVar.E2(new EsimHomeFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b, 2), true, null, false);
                            } else if (output instanceof c0) {
                                cVar.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((c0) output).f323549a), true, null, false);
                            } else if (output instanceof x) {
                                cVar.E2(new EsimHomeFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                            } else if (output instanceof b0) {
                                cVar.E2(new EsimHomeFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                            } else if (output instanceof v) {
                                v vVar = (v) output;
                                cVar.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.DataPlanChange(vVar.f323593a, vVar.f323594b), vVar.f323595c), true, null, false);
                            } else if (output instanceof zmj.w) {
                                cVar.E2(new EsimHomeFlowContract$Step.ConnectivityTroubleshooting(((zmj.w) output).f323596a), true, null, false);
                            } else if (Intrinsics.f(output, y.f323598a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar.R2("INSTALLATION");
                            } else {
                                if (!(output instanceof z)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((z) output).f323599a), false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a result = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z3 = result instanceof m;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar2 = this.f305437b;
                            if (z3) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanBilling(((m) result).f289772a), true, null, false);
                                }
                            } else if (result instanceof vjj.n) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.Help(((vjj.n) result).f289773a), true, null, false);
                                }
                            } else if (result instanceof u) {
                                if (cVar2.O2()) {
                                    u uVar = (u) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(uVar.f289788a, uVar.f289789b), true, null, false);
                                }
                            } else if (Intrinsics.f(result, a.C0617a.f101205a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar2.R2("INSTALLATION");
                            } else if (result instanceof p) {
                                if (cVar2.O2()) {
                                    p pVar = (p) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false);
                                }
                            } else if (result instanceof vjj.l) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(((vjj.l) result).f289771a, lgj.e.ADD_NUMBER, null), true, null, false);
                                }
                            } else if (result instanceof o) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((o) result).f289774a), true, null, false);
                                }
                            } else if (result instanceof r) {
                                r rVar = (r) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, rVar.f289780a), true, null, false);
                            } else if (result instanceof vjj.q) {
                                vjj.q qVar = (vjj.q) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false);
                            } else if (result instanceof t) {
                                t tVar = (t) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(tVar.f289786a, tVar.f289787b), null, 2), true, null, false);
                            } else {
                                if (!(result instanceof s)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                s sVar = (s) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof a.C0610a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.r2();
                            return Unit.f186387a;
                        case 3:
                            d67.u it8 = (d67.u) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f305437b.I2();
                            return Unit.f186387a;
                        case 4:
                            wfj.c result2 = (wfj.c) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.EsimRefund(null), true, null, false);
                            return Unit.f186387a;
                        case 5:
                            uhj.e output3 = (uhj.e) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, output3.f280256a, 1), true, null, false);
                            return Unit.f186387a;
                        case 6:
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result3 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean zF = Intrinsics.f(result3, a.b.f100765a);
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar3 = this.f305437b;
                            if (zF) {
                                cVar3.Q2();
                                cVar3.B.a();
                            } else {
                                if (!(result3 instanceof a.C0612a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((a.C0612a) result3).f100764a) {
                                    cVar3.Q2();
                                } else {
                                    cVar3.q2();
                                }
                            }
                            return Unit.f186387a;
                        case 7:
                            rhj.i output4 = (rhj.i) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            boolean z4 = output4 instanceof g;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar4 = this.f305437b;
                            if (z4) {
                                cVar4.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((g) output4).f254496a), true, null, false);
                            } else {
                                if (!(output4 instanceof rhj.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (cVar4.O2()) {
                                    cVar4.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((rhj.h) output4).f254497a), true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 8:
                            bgj.c result4 = (bgj.c) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            if (result4 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(result4.f15206a);
                            return Unit.f186387a;
                        case 9:
                            pgj.d result5 = (pgj.d) obj2;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (!(result5 instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(((pgj.c) result5).f235975a);
                            return Unit.f186387a;
                        case 10:
                            fjj.p result6 = (fjj.p) obj2;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z6 = result6 instanceof fjj.n;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar5 = this.f305437b;
                            if (z6) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanPayments(((fjj.n) result6).f135664a), true, null, false);
                                }
                            } else if (result6 instanceof fjj.l) {
                                if (cVar5.O2()) {
                                    fjj.l lVar = (fjj.l) result6;
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false);
                                }
                            } else if (result6 instanceof fjj.m) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((fjj.m) result6).f135663a), true, null, false);
                                }
                            } else {
                                if (!(result6 instanceof fjj.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fjj.o oVar = (fjj.o) result6;
                                cVar5.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(oVar.f135665a, oVar.f135666b), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            EsimSubscriptionsScreenContract$OutputData output5 = (EsimSubscriptionsScreenContract$OutputData) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean z11 = output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToGetPlan;
                            boolean z12 = false;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar6 = this.f305437b;
                            if (z11) {
                                int i22 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToGetPlan) output5).f101049a.ordinal()];
                                if (i22 == 1) {
                                    cVar6.r2();
                                    cVar6.n2(new com.revolut.retail.feature.esim.impl.ui.flows.home.b(cVar6, null), new whi.b(6));
                                } else {
                                    if (i22 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, null, 3), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GiftPlanClicked) {
                                cVar6.E2(EsimHomeFlowContract$Step.GiftRecipientSelection.f100660a, true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) {
                                int i32 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) output5).f101048a.ordinal()];
                                if (i32 != 1) {
                                    if (i32 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z12 = true;
                                }
                                cVar6.E2(EsimHomeFlowContract$Step.ExpiredSubscriptions.f100657a, true, z12 ? TransitionAnimation.SLIDE_END_TO_START.f98395a : TransitionAnimation.NONE.f98393a, !z12);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Checkout(((EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) output5).f101044a, (EsimGiftRecipient) null, 6), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) output5).f101045a), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.InstallationInstructionsClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("INSTALLATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.EnableEsimClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("ACTIVATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.HelpClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Help(null), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) {
                                if (cVar6.O2()) {
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) output5).f101060a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked mobilePlanResubscribeClicked = (EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(mobilePlanResubscribeClicked.f101058a, mobilePlanResubscribeClicked.f101059b), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick mobilePlanPortingUpdateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(mobilePlanPortingUpdateClick.f101055a, mobilePlanPortingUpdateClick.f101056b, mobilePlanPortingUpdateClick.f101057c, mobilePlanPortingUpdateClick.d), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick mobilePlanPortingCreateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(mobilePlanPortingCreateClick.d, mobilePlanPortingCreateClick.f101053b, mobilePlanPortingCreateClick.f101054c, mobilePlanPortingCreateClick.f101052a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanChange) {
                                EsimSubscriptionsScreenContract$OutputData.PlanChange planChange = (EsimSubscriptionsScreenContract$OutputData.PlanChange) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(planChange.f101062b, planChange.f101061a), null, 2), true, null, false);
                            } else {
                                if (!(output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanUpgrade)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                EsimSubscriptionsScreenContract$OutputData.PlanUpgrade planUpgrade = (EsimSubscriptionsScreenContract$OutputData.PlanUpgrade) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(planUpgrade.f101064b, planUpgrade.f101063a), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block6, "block");
            esimGetPlanFlow3.H = block6;
            return esimGetPlanFlow3;
        }
        if (step instanceof EsimHomeFlowContract$Step.SubscriptionDetails) {
            EsimSubscriptionDetailsScreen esimSubscriptionDetailsScreen = new EsimSubscriptionDetailsScreen(new EsimSubscriptionDetailsScreenContract$InputData(((EsimHomeFlowContract$Step.SubscriptionDetails) step).f100681a));
            final int i22 = 0;
            Function1 block7 = new Function1(this) { // from class: xfj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.home.c f305437b;

                {
                    this.f305437b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i22) {
                        case 0:
                            d0 output = (d0) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof a0;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar = this.f305437b;
                            if (z) {
                                a0 a0Var = (a0) output;
                                cVar.E2(new EsimHomeFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b, 2), true, null, false);
                            } else if (output instanceof c0) {
                                cVar.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((c0) output).f323549a), true, null, false);
                            } else if (output instanceof x) {
                                cVar.E2(new EsimHomeFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                            } else if (output instanceof b0) {
                                cVar.E2(new EsimHomeFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                            } else if (output instanceof v) {
                                v vVar = (v) output;
                                cVar.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.DataPlanChange(vVar.f323593a, vVar.f323594b), vVar.f323595c), true, null, false);
                            } else if (output instanceof zmj.w) {
                                cVar.E2(new EsimHomeFlowContract$Step.ConnectivityTroubleshooting(((zmj.w) output).f323596a), true, null, false);
                            } else if (Intrinsics.f(output, y.f323598a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar.R2("INSTALLATION");
                            } else {
                                if (!(output instanceof z)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((z) output).f323599a), false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a result = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z3 = result instanceof m;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar2 = this.f305437b;
                            if (z3) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanBilling(((m) result).f289772a), true, null, false);
                                }
                            } else if (result instanceof vjj.n) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.Help(((vjj.n) result).f289773a), true, null, false);
                                }
                            } else if (result instanceof u) {
                                if (cVar2.O2()) {
                                    u uVar = (u) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(uVar.f289788a, uVar.f289789b), true, null, false);
                                }
                            } else if (Intrinsics.f(result, a.C0617a.f101205a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar2.R2("INSTALLATION");
                            } else if (result instanceof p) {
                                if (cVar2.O2()) {
                                    p pVar = (p) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false);
                                }
                            } else if (result instanceof vjj.l) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(((vjj.l) result).f289771a, lgj.e.ADD_NUMBER, null), true, null, false);
                                }
                            } else if (result instanceof o) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((o) result).f289774a), true, null, false);
                                }
                            } else if (result instanceof r) {
                                r rVar = (r) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, rVar.f289780a), true, null, false);
                            } else if (result instanceof vjj.q) {
                                vjj.q qVar = (vjj.q) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false);
                            } else if (result instanceof t) {
                                t tVar = (t) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(tVar.f289786a, tVar.f289787b), null, 2), true, null, false);
                            } else {
                                if (!(result instanceof s)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                s sVar = (s) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof a.C0610a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.r2();
                            return Unit.f186387a;
                        case 3:
                            d67.u it8 = (d67.u) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f305437b.I2();
                            return Unit.f186387a;
                        case 4:
                            wfj.c result2 = (wfj.c) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.EsimRefund(null), true, null, false);
                            return Unit.f186387a;
                        case 5:
                            uhj.e output3 = (uhj.e) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, output3.f280256a, 1), true, null, false);
                            return Unit.f186387a;
                        case 6:
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result3 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean zF = Intrinsics.f(result3, a.b.f100765a);
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar3 = this.f305437b;
                            if (zF) {
                                cVar3.Q2();
                                cVar3.B.a();
                            } else {
                                if (!(result3 instanceof a.C0612a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((a.C0612a) result3).f100764a) {
                                    cVar3.Q2();
                                } else {
                                    cVar3.q2();
                                }
                            }
                            return Unit.f186387a;
                        case 7:
                            rhj.i output4 = (rhj.i) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            boolean z4 = output4 instanceof g;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar4 = this.f305437b;
                            if (z4) {
                                cVar4.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((g) output4).f254496a), true, null, false);
                            } else {
                                if (!(output4 instanceof rhj.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (cVar4.O2()) {
                                    cVar4.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((rhj.h) output4).f254497a), true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 8:
                            bgj.c result4 = (bgj.c) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            if (result4 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(result4.f15206a);
                            return Unit.f186387a;
                        case 9:
                            pgj.d result5 = (pgj.d) obj2;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (!(result5 instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(((pgj.c) result5).f235975a);
                            return Unit.f186387a;
                        case 10:
                            fjj.p result6 = (fjj.p) obj2;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z6 = result6 instanceof fjj.n;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar5 = this.f305437b;
                            if (z6) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanPayments(((fjj.n) result6).f135664a), true, null, false);
                                }
                            } else if (result6 instanceof fjj.l) {
                                if (cVar5.O2()) {
                                    fjj.l lVar = (fjj.l) result6;
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false);
                                }
                            } else if (result6 instanceof fjj.m) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((fjj.m) result6).f135663a), true, null, false);
                                }
                            } else {
                                if (!(result6 instanceof fjj.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fjj.o oVar = (fjj.o) result6;
                                cVar5.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(oVar.f135665a, oVar.f135666b), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            EsimSubscriptionsScreenContract$OutputData output5 = (EsimSubscriptionsScreenContract$OutputData) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean z11 = output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToGetPlan;
                            boolean z12 = false;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar6 = this.f305437b;
                            if (z11) {
                                int i222 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToGetPlan) output5).f101049a.ordinal()];
                                if (i222 == 1) {
                                    cVar6.r2();
                                    cVar6.n2(new com.revolut.retail.feature.esim.impl.ui.flows.home.b(cVar6, null), new whi.b(6));
                                } else {
                                    if (i222 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, null, 3), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GiftPlanClicked) {
                                cVar6.E2(EsimHomeFlowContract$Step.GiftRecipientSelection.f100660a, true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) {
                                int i32 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) output5).f101048a.ordinal()];
                                if (i32 != 1) {
                                    if (i32 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z12 = true;
                                }
                                cVar6.E2(EsimHomeFlowContract$Step.ExpiredSubscriptions.f100657a, true, z12 ? TransitionAnimation.SLIDE_END_TO_START.f98395a : TransitionAnimation.NONE.f98393a, !z12);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Checkout(((EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) output5).f101044a, (EsimGiftRecipient) null, 6), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) output5).f101045a), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.InstallationInstructionsClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("INSTALLATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.EnableEsimClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("ACTIVATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.HelpClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Help(null), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) {
                                if (cVar6.O2()) {
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) output5).f101060a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked mobilePlanResubscribeClicked = (EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(mobilePlanResubscribeClicked.f101058a, mobilePlanResubscribeClicked.f101059b), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick mobilePlanPortingUpdateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(mobilePlanPortingUpdateClick.f101055a, mobilePlanPortingUpdateClick.f101056b, mobilePlanPortingUpdateClick.f101057c, mobilePlanPortingUpdateClick.d), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick mobilePlanPortingCreateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(mobilePlanPortingCreateClick.d, mobilePlanPortingCreateClick.f101053b, mobilePlanPortingCreateClick.f101054c, mobilePlanPortingCreateClick.f101052a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanChange) {
                                EsimSubscriptionsScreenContract$OutputData.PlanChange planChange = (EsimSubscriptionsScreenContract$OutputData.PlanChange) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(planChange.f101062b, planChange.f101061a), null, 2), true, null, false);
                            } else {
                                if (!(output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanUpgrade)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                EsimSubscriptionsScreenContract$OutputData.PlanUpgrade planUpgrade = (EsimSubscriptionsScreenContract$OutputData.PlanUpgrade) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(planUpgrade.f101064b, planUpgrade.f101063a), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block7, "block");
            esimSubscriptionDetailsScreen.H = block7;
            return esimSubscriptionDetailsScreen;
        }
        if (step instanceof EsimHomeFlowContract$Step.Help) {
            EsimHelpFlow esimHelpFlow = new EsimHelpFlow(new EsimHelpFlowContract$InputData(((EsimHomeFlowContract$Step.Help) step).f100661a));
            final int i32 = 4;
            Function1 block8 = new Function1(this) { // from class: xfj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.home.c f305437b;

                {
                    this.f305437b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i32) {
                        case 0:
                            d0 output = (d0) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof a0;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar = this.f305437b;
                            if (z) {
                                a0 a0Var = (a0) output;
                                cVar.E2(new EsimHomeFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b, 2), true, null, false);
                            } else if (output instanceof c0) {
                                cVar.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((c0) output).f323549a), true, null, false);
                            } else if (output instanceof x) {
                                cVar.E2(new EsimHomeFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                            } else if (output instanceof b0) {
                                cVar.E2(new EsimHomeFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                            } else if (output instanceof v) {
                                v vVar = (v) output;
                                cVar.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.DataPlanChange(vVar.f323593a, vVar.f323594b), vVar.f323595c), true, null, false);
                            } else if (output instanceof zmj.w) {
                                cVar.E2(new EsimHomeFlowContract$Step.ConnectivityTroubleshooting(((zmj.w) output).f323596a), true, null, false);
                            } else if (Intrinsics.f(output, y.f323598a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar.R2("INSTALLATION");
                            } else {
                                if (!(output instanceof z)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((z) output).f323599a), false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a result = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z3 = result instanceof m;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar2 = this.f305437b;
                            if (z3) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanBilling(((m) result).f289772a), true, null, false);
                                }
                            } else if (result instanceof vjj.n) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.Help(((vjj.n) result).f289773a), true, null, false);
                                }
                            } else if (result instanceof u) {
                                if (cVar2.O2()) {
                                    u uVar = (u) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(uVar.f289788a, uVar.f289789b), true, null, false);
                                }
                            } else if (Intrinsics.f(result, a.C0617a.f101205a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar2.R2("INSTALLATION");
                            } else if (result instanceof p) {
                                if (cVar2.O2()) {
                                    p pVar = (p) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false);
                                }
                            } else if (result instanceof vjj.l) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(((vjj.l) result).f289771a, lgj.e.ADD_NUMBER, null), true, null, false);
                                }
                            } else if (result instanceof o) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((o) result).f289774a), true, null, false);
                                }
                            } else if (result instanceof r) {
                                r rVar = (r) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, rVar.f289780a), true, null, false);
                            } else if (result instanceof vjj.q) {
                                vjj.q qVar = (vjj.q) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false);
                            } else if (result instanceof t) {
                                t tVar = (t) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(tVar.f289786a, tVar.f289787b), null, 2), true, null, false);
                            } else {
                                if (!(result instanceof s)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                s sVar = (s) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof a.C0610a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.r2();
                            return Unit.f186387a;
                        case 3:
                            d67.u it8 = (d67.u) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f305437b.I2();
                            return Unit.f186387a;
                        case 4:
                            wfj.c result2 = (wfj.c) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.EsimRefund(null), true, null, false);
                            return Unit.f186387a;
                        case 5:
                            uhj.e output3 = (uhj.e) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, output3.f280256a, 1), true, null, false);
                            return Unit.f186387a;
                        case 6:
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result3 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean zF = Intrinsics.f(result3, a.b.f100765a);
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar3 = this.f305437b;
                            if (zF) {
                                cVar3.Q2();
                                cVar3.B.a();
                            } else {
                                if (!(result3 instanceof a.C0612a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((a.C0612a) result3).f100764a) {
                                    cVar3.Q2();
                                } else {
                                    cVar3.q2();
                                }
                            }
                            return Unit.f186387a;
                        case 7:
                            rhj.i output4 = (rhj.i) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            boolean z4 = output4 instanceof g;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar4 = this.f305437b;
                            if (z4) {
                                cVar4.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((g) output4).f254496a), true, null, false);
                            } else {
                                if (!(output4 instanceof rhj.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (cVar4.O2()) {
                                    cVar4.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((rhj.h) output4).f254497a), true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 8:
                            bgj.c result4 = (bgj.c) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            if (result4 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(result4.f15206a);
                            return Unit.f186387a;
                        case 9:
                            pgj.d result5 = (pgj.d) obj2;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (!(result5 instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(((pgj.c) result5).f235975a);
                            return Unit.f186387a;
                        case 10:
                            fjj.p result6 = (fjj.p) obj2;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z6 = result6 instanceof fjj.n;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar5 = this.f305437b;
                            if (z6) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanPayments(((fjj.n) result6).f135664a), true, null, false);
                                }
                            } else if (result6 instanceof fjj.l) {
                                if (cVar5.O2()) {
                                    fjj.l lVar = (fjj.l) result6;
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false);
                                }
                            } else if (result6 instanceof fjj.m) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((fjj.m) result6).f135663a), true, null, false);
                                }
                            } else {
                                if (!(result6 instanceof fjj.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fjj.o oVar = (fjj.o) result6;
                                cVar5.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(oVar.f135665a, oVar.f135666b), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            EsimSubscriptionsScreenContract$OutputData output5 = (EsimSubscriptionsScreenContract$OutputData) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean z11 = output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToGetPlan;
                            boolean z12 = false;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar6 = this.f305437b;
                            if (z11) {
                                int i222 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToGetPlan) output5).f101049a.ordinal()];
                                if (i222 == 1) {
                                    cVar6.r2();
                                    cVar6.n2(new com.revolut.retail.feature.esim.impl.ui.flows.home.b(cVar6, null), new whi.b(6));
                                } else {
                                    if (i222 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, null, 3), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GiftPlanClicked) {
                                cVar6.E2(EsimHomeFlowContract$Step.GiftRecipientSelection.f100660a, true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) {
                                int i322 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) output5).f101048a.ordinal()];
                                if (i322 != 1) {
                                    if (i322 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z12 = true;
                                }
                                cVar6.E2(EsimHomeFlowContract$Step.ExpiredSubscriptions.f100657a, true, z12 ? TransitionAnimation.SLIDE_END_TO_START.f98395a : TransitionAnimation.NONE.f98393a, !z12);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Checkout(((EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) output5).f101044a, (EsimGiftRecipient) null, 6), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) output5).f101045a), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.InstallationInstructionsClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("INSTALLATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.EnableEsimClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("ACTIVATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.HelpClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Help(null), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) {
                                if (cVar6.O2()) {
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) output5).f101060a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked mobilePlanResubscribeClicked = (EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(mobilePlanResubscribeClicked.f101058a, mobilePlanResubscribeClicked.f101059b), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick mobilePlanPortingUpdateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(mobilePlanPortingUpdateClick.f101055a, mobilePlanPortingUpdateClick.f101056b, mobilePlanPortingUpdateClick.f101057c, mobilePlanPortingUpdateClick.d), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick mobilePlanPortingCreateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(mobilePlanPortingCreateClick.d, mobilePlanPortingCreateClick.f101053b, mobilePlanPortingCreateClick.f101054c, mobilePlanPortingCreateClick.f101052a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanChange) {
                                EsimSubscriptionsScreenContract$OutputData.PlanChange planChange = (EsimSubscriptionsScreenContract$OutputData.PlanChange) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(planChange.f101062b, planChange.f101061a), null, 2), true, null, false);
                            } else {
                                if (!(output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanUpgrade)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                EsimSubscriptionsScreenContract$OutputData.PlanUpgrade planUpgrade = (EsimSubscriptionsScreenContract$OutputData.PlanUpgrade) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(planUpgrade.f101064b, planUpgrade.f101063a), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block8, "block");
            esimHelpFlow.H = block8;
            return esimHelpFlow;
        }
        if (step instanceof EsimHomeFlowContract$Step.ConnectivityTroubleshooting) {
            return new EsimConnectivityTroubleshootingFlow(new EsimConnectivityTroubleshootingFlowContract$InputData(((EsimHomeFlowContract$Step.ConnectivityTroubleshooting) step).f100655a));
        }
        if (step instanceof EsimHomeFlowContract$Step.EsimRefund) {
            String str = ((EsimHomeFlowContract$Step.EsimRefund) step).f100656a;
            EsimRefundFlow esimRefundFlow = new EsimRefundFlow(new EsimRefundFlowContract$InputData(str != null ? new EsimRefundFlowContract$EsimSubscriptionsToRefund.Subscription(str) : EsimRefundFlowContract$EsimSubscriptionsToRefund.AllAvailable.f100866a));
            final int i33 = 9;
            Function1 block9 = new Function1(this) { // from class: xfj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.home.c f305437b;

                {
                    this.f305437b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i33) {
                        case 0:
                            d0 output = (d0) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof a0;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar = this.f305437b;
                            if (z) {
                                a0 a0Var = (a0) output;
                                cVar.E2(new EsimHomeFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b, 2), true, null, false);
                            } else if (output instanceof c0) {
                                cVar.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((c0) output).f323549a), true, null, false);
                            } else if (output instanceof x) {
                                cVar.E2(new EsimHomeFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                            } else if (output instanceof b0) {
                                cVar.E2(new EsimHomeFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                            } else if (output instanceof v) {
                                v vVar = (v) output;
                                cVar.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.DataPlanChange(vVar.f323593a, vVar.f323594b), vVar.f323595c), true, null, false);
                            } else if (output instanceof zmj.w) {
                                cVar.E2(new EsimHomeFlowContract$Step.ConnectivityTroubleshooting(((zmj.w) output).f323596a), true, null, false);
                            } else if (Intrinsics.f(output, y.f323598a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar.R2("INSTALLATION");
                            } else {
                                if (!(output instanceof z)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((z) output).f323599a), false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a result = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z3 = result instanceof m;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar2 = this.f305437b;
                            if (z3) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanBilling(((m) result).f289772a), true, null, false);
                                }
                            } else if (result instanceof vjj.n) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.Help(((vjj.n) result).f289773a), true, null, false);
                                }
                            } else if (result instanceof u) {
                                if (cVar2.O2()) {
                                    u uVar = (u) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(uVar.f289788a, uVar.f289789b), true, null, false);
                                }
                            } else if (Intrinsics.f(result, a.C0617a.f101205a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar2.R2("INSTALLATION");
                            } else if (result instanceof p) {
                                if (cVar2.O2()) {
                                    p pVar = (p) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false);
                                }
                            } else if (result instanceof vjj.l) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(((vjj.l) result).f289771a, lgj.e.ADD_NUMBER, null), true, null, false);
                                }
                            } else if (result instanceof o) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((o) result).f289774a), true, null, false);
                                }
                            } else if (result instanceof r) {
                                r rVar = (r) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, rVar.f289780a), true, null, false);
                            } else if (result instanceof vjj.q) {
                                vjj.q qVar = (vjj.q) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false);
                            } else if (result instanceof t) {
                                t tVar = (t) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(tVar.f289786a, tVar.f289787b), null, 2), true, null, false);
                            } else {
                                if (!(result instanceof s)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                s sVar = (s) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof a.C0610a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.r2();
                            return Unit.f186387a;
                        case 3:
                            d67.u it8 = (d67.u) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f305437b.I2();
                            return Unit.f186387a;
                        case 4:
                            wfj.c result2 = (wfj.c) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.EsimRefund(null), true, null, false);
                            return Unit.f186387a;
                        case 5:
                            uhj.e output3 = (uhj.e) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, output3.f280256a, 1), true, null, false);
                            return Unit.f186387a;
                        case 6:
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result3 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean zF = Intrinsics.f(result3, a.b.f100765a);
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar3 = this.f305437b;
                            if (zF) {
                                cVar3.Q2();
                                cVar3.B.a();
                            } else {
                                if (!(result3 instanceof a.C0612a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((a.C0612a) result3).f100764a) {
                                    cVar3.Q2();
                                } else {
                                    cVar3.q2();
                                }
                            }
                            return Unit.f186387a;
                        case 7:
                            rhj.i output4 = (rhj.i) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            boolean z4 = output4 instanceof g;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar4 = this.f305437b;
                            if (z4) {
                                cVar4.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((g) output4).f254496a), true, null, false);
                            } else {
                                if (!(output4 instanceof rhj.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (cVar4.O2()) {
                                    cVar4.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((rhj.h) output4).f254497a), true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 8:
                            bgj.c result4 = (bgj.c) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            if (result4 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(result4.f15206a);
                            return Unit.f186387a;
                        case 9:
                            pgj.d result5 = (pgj.d) obj2;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (!(result5 instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(((pgj.c) result5).f235975a);
                            return Unit.f186387a;
                        case 10:
                            fjj.p result6 = (fjj.p) obj2;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z6 = result6 instanceof fjj.n;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar5 = this.f305437b;
                            if (z6) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanPayments(((fjj.n) result6).f135664a), true, null, false);
                                }
                            } else if (result6 instanceof fjj.l) {
                                if (cVar5.O2()) {
                                    fjj.l lVar = (fjj.l) result6;
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false);
                                }
                            } else if (result6 instanceof fjj.m) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((fjj.m) result6).f135663a), true, null, false);
                                }
                            } else {
                                if (!(result6 instanceof fjj.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fjj.o oVar = (fjj.o) result6;
                                cVar5.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(oVar.f135665a, oVar.f135666b), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            EsimSubscriptionsScreenContract$OutputData output5 = (EsimSubscriptionsScreenContract$OutputData) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean z11 = output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToGetPlan;
                            boolean z12 = false;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar6 = this.f305437b;
                            if (z11) {
                                int i222 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToGetPlan) output5).f101049a.ordinal()];
                                if (i222 == 1) {
                                    cVar6.r2();
                                    cVar6.n2(new com.revolut.retail.feature.esim.impl.ui.flows.home.b(cVar6, null), new whi.b(6));
                                } else {
                                    if (i222 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, null, 3), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GiftPlanClicked) {
                                cVar6.E2(EsimHomeFlowContract$Step.GiftRecipientSelection.f100660a, true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) {
                                int i322 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) output5).f101048a.ordinal()];
                                if (i322 != 1) {
                                    if (i322 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z12 = true;
                                }
                                cVar6.E2(EsimHomeFlowContract$Step.ExpiredSubscriptions.f100657a, true, z12 ? TransitionAnimation.SLIDE_END_TO_START.f98395a : TransitionAnimation.NONE.f98393a, !z12);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Checkout(((EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) output5).f101044a, (EsimGiftRecipient) null, 6), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) output5).f101045a), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.InstallationInstructionsClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("INSTALLATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.EnableEsimClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("ACTIVATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.HelpClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Help(null), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) {
                                if (cVar6.O2()) {
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) output5).f101060a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked mobilePlanResubscribeClicked = (EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(mobilePlanResubscribeClicked.f101058a, mobilePlanResubscribeClicked.f101059b), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick mobilePlanPortingUpdateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(mobilePlanPortingUpdateClick.f101055a, mobilePlanPortingUpdateClick.f101056b, mobilePlanPortingUpdateClick.f101057c, mobilePlanPortingUpdateClick.d), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick mobilePlanPortingCreateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(mobilePlanPortingCreateClick.d, mobilePlanPortingCreateClick.f101053b, mobilePlanPortingCreateClick.f101054c, mobilePlanPortingCreateClick.f101052a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanChange) {
                                EsimSubscriptionsScreenContract$OutputData.PlanChange planChange = (EsimSubscriptionsScreenContract$OutputData.PlanChange) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(planChange.f101062b, planChange.f101061a), null, 2), true, null, false);
                            } else {
                                if (!(output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanUpgrade)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                EsimSubscriptionsScreenContract$OutputData.PlanUpgrade planUpgrade = (EsimSubscriptionsScreenContract$OutputData.PlanUpgrade) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(planUpgrade.f101064b, planUpgrade.f101063a), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block9, "block");
            esimRefundFlow.H = block9;
            return esimRefundFlow;
        }
        if (step instanceof EsimHomeFlowContract$Step.MobilePlanDetails) {
            EsimMobilePlanDetailsScreen esimMobilePlanDetailsScreen = new EsimMobilePlanDetailsScreen(new EsimMobilePlanDetailsScreenContract$InputData(((EsimHomeFlowContract$Step.MobilePlanDetails) step).f100666a));
            final int i43 = 1;
            Function1 block10 = new Function1(this) { // from class: xfj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.home.c f305437b;

                {
                    this.f305437b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i43) {
                        case 0:
                            d0 output = (d0) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof a0;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar = this.f305437b;
                            if (z) {
                                a0 a0Var = (a0) output;
                                cVar.E2(new EsimHomeFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b, 2), true, null, false);
                            } else if (output instanceof c0) {
                                cVar.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((c0) output).f323549a), true, null, false);
                            } else if (output instanceof x) {
                                cVar.E2(new EsimHomeFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                            } else if (output instanceof b0) {
                                cVar.E2(new EsimHomeFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                            } else if (output instanceof v) {
                                v vVar = (v) output;
                                cVar.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.DataPlanChange(vVar.f323593a, vVar.f323594b), vVar.f323595c), true, null, false);
                            } else if (output instanceof zmj.w) {
                                cVar.E2(new EsimHomeFlowContract$Step.ConnectivityTroubleshooting(((zmj.w) output).f323596a), true, null, false);
                            } else if (Intrinsics.f(output, y.f323598a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar.R2("INSTALLATION");
                            } else {
                                if (!(output instanceof z)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((z) output).f323599a), false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a result = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z3 = result instanceof m;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar2 = this.f305437b;
                            if (z3) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanBilling(((m) result).f289772a), true, null, false);
                                }
                            } else if (result instanceof vjj.n) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.Help(((vjj.n) result).f289773a), true, null, false);
                                }
                            } else if (result instanceof u) {
                                if (cVar2.O2()) {
                                    u uVar = (u) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(uVar.f289788a, uVar.f289789b), true, null, false);
                                }
                            } else if (Intrinsics.f(result, a.C0617a.f101205a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar2.R2("INSTALLATION");
                            } else if (result instanceof p) {
                                if (cVar2.O2()) {
                                    p pVar = (p) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false);
                                }
                            } else if (result instanceof vjj.l) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(((vjj.l) result).f289771a, lgj.e.ADD_NUMBER, null), true, null, false);
                                }
                            } else if (result instanceof o) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((o) result).f289774a), true, null, false);
                                }
                            } else if (result instanceof r) {
                                r rVar = (r) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, rVar.f289780a), true, null, false);
                            } else if (result instanceof vjj.q) {
                                vjj.q qVar = (vjj.q) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false);
                            } else if (result instanceof t) {
                                t tVar = (t) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(tVar.f289786a, tVar.f289787b), null, 2), true, null, false);
                            } else {
                                if (!(result instanceof s)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                s sVar = (s) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof a.C0610a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.r2();
                            return Unit.f186387a;
                        case 3:
                            d67.u it8 = (d67.u) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f305437b.I2();
                            return Unit.f186387a;
                        case 4:
                            wfj.c result2 = (wfj.c) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.EsimRefund(null), true, null, false);
                            return Unit.f186387a;
                        case 5:
                            uhj.e output3 = (uhj.e) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, output3.f280256a, 1), true, null, false);
                            return Unit.f186387a;
                        case 6:
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result3 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean zF = Intrinsics.f(result3, a.b.f100765a);
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar3 = this.f305437b;
                            if (zF) {
                                cVar3.Q2();
                                cVar3.B.a();
                            } else {
                                if (!(result3 instanceof a.C0612a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((a.C0612a) result3).f100764a) {
                                    cVar3.Q2();
                                } else {
                                    cVar3.q2();
                                }
                            }
                            return Unit.f186387a;
                        case 7:
                            rhj.i output4 = (rhj.i) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            boolean z4 = output4 instanceof g;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar4 = this.f305437b;
                            if (z4) {
                                cVar4.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((g) output4).f254496a), true, null, false);
                            } else {
                                if (!(output4 instanceof rhj.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (cVar4.O2()) {
                                    cVar4.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((rhj.h) output4).f254497a), true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 8:
                            bgj.c result4 = (bgj.c) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            if (result4 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(result4.f15206a);
                            return Unit.f186387a;
                        case 9:
                            pgj.d result5 = (pgj.d) obj2;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (!(result5 instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(((pgj.c) result5).f235975a);
                            return Unit.f186387a;
                        case 10:
                            fjj.p result6 = (fjj.p) obj2;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z6 = result6 instanceof fjj.n;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar5 = this.f305437b;
                            if (z6) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanPayments(((fjj.n) result6).f135664a), true, null, false);
                                }
                            } else if (result6 instanceof fjj.l) {
                                if (cVar5.O2()) {
                                    fjj.l lVar = (fjj.l) result6;
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false);
                                }
                            } else if (result6 instanceof fjj.m) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((fjj.m) result6).f135663a), true, null, false);
                                }
                            } else {
                                if (!(result6 instanceof fjj.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fjj.o oVar = (fjj.o) result6;
                                cVar5.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(oVar.f135665a, oVar.f135666b), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            EsimSubscriptionsScreenContract$OutputData output5 = (EsimSubscriptionsScreenContract$OutputData) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean z11 = output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToGetPlan;
                            boolean z12 = false;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar6 = this.f305437b;
                            if (z11) {
                                int i222 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToGetPlan) output5).f101049a.ordinal()];
                                if (i222 == 1) {
                                    cVar6.r2();
                                    cVar6.n2(new com.revolut.retail.feature.esim.impl.ui.flows.home.b(cVar6, null), new whi.b(6));
                                } else {
                                    if (i222 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, null, 3), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GiftPlanClicked) {
                                cVar6.E2(EsimHomeFlowContract$Step.GiftRecipientSelection.f100660a, true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) {
                                int i322 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) output5).f101048a.ordinal()];
                                if (i322 != 1) {
                                    if (i322 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z12 = true;
                                }
                                cVar6.E2(EsimHomeFlowContract$Step.ExpiredSubscriptions.f100657a, true, z12 ? TransitionAnimation.SLIDE_END_TO_START.f98395a : TransitionAnimation.NONE.f98393a, !z12);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Checkout(((EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) output5).f101044a, (EsimGiftRecipient) null, 6), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) output5).f101045a), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.InstallationInstructionsClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("INSTALLATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.EnableEsimClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("ACTIVATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.HelpClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Help(null), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) {
                                if (cVar6.O2()) {
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) output5).f101060a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked mobilePlanResubscribeClicked = (EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(mobilePlanResubscribeClicked.f101058a, mobilePlanResubscribeClicked.f101059b), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick mobilePlanPortingUpdateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(mobilePlanPortingUpdateClick.f101055a, mobilePlanPortingUpdateClick.f101056b, mobilePlanPortingUpdateClick.f101057c, mobilePlanPortingUpdateClick.d), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick mobilePlanPortingCreateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(mobilePlanPortingCreateClick.d, mobilePlanPortingCreateClick.f101053b, mobilePlanPortingCreateClick.f101054c, mobilePlanPortingCreateClick.f101052a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanChange) {
                                EsimSubscriptionsScreenContract$OutputData.PlanChange planChange = (EsimSubscriptionsScreenContract$OutputData.PlanChange) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(planChange.f101062b, planChange.f101061a), null, 2), true, null, false);
                            } else {
                                if (!(output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanUpgrade)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                EsimSubscriptionsScreenContract$OutputData.PlanUpgrade planUpgrade = (EsimSubscriptionsScreenContract$OutputData.PlanUpgrade) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(planUpgrade.f101064b, planUpgrade.f101063a), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block10, "block");
            esimMobilePlanDetailsScreen.H = block10;
            return esimMobilePlanDetailsScreen;
        }
        if (step instanceof EsimHomeFlowContract$Step.MobilePlanBilling) {
            EsimMobilePlanBillingScreen esimMobilePlanBillingScreen = new EsimMobilePlanBillingScreen(new EsimMobilePlanBillingScreenContract$InputData(((EsimHomeFlowContract$Step.MobilePlanBilling) step).f100662a));
            final int i59 = 10;
            Function1 block11 = new Function1(this) { // from class: xfj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.home.c f305437b;

                {
                    this.f305437b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i59) {
                        case 0:
                            d0 output = (d0) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof a0;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar = this.f305437b;
                            if (z) {
                                a0 a0Var = (a0) output;
                                cVar.E2(new EsimHomeFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b, 2), true, null, false);
                            } else if (output instanceof c0) {
                                cVar.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((c0) output).f323549a), true, null, false);
                            } else if (output instanceof x) {
                                cVar.E2(new EsimHomeFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                            } else if (output instanceof b0) {
                                cVar.E2(new EsimHomeFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                            } else if (output instanceof v) {
                                v vVar = (v) output;
                                cVar.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.DataPlanChange(vVar.f323593a, vVar.f323594b), vVar.f323595c), true, null, false);
                            } else if (output instanceof zmj.w) {
                                cVar.E2(new EsimHomeFlowContract$Step.ConnectivityTroubleshooting(((zmj.w) output).f323596a), true, null, false);
                            } else if (Intrinsics.f(output, y.f323598a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar.R2("INSTALLATION");
                            } else {
                                if (!(output instanceof z)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((z) output).f323599a), false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a result = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z3 = result instanceof m;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar2 = this.f305437b;
                            if (z3) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanBilling(((m) result).f289772a), true, null, false);
                                }
                            } else if (result instanceof vjj.n) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.Help(((vjj.n) result).f289773a), true, null, false);
                                }
                            } else if (result instanceof u) {
                                if (cVar2.O2()) {
                                    u uVar = (u) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(uVar.f289788a, uVar.f289789b), true, null, false);
                                }
                            } else if (Intrinsics.f(result, a.C0617a.f101205a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar2.R2("INSTALLATION");
                            } else if (result instanceof p) {
                                if (cVar2.O2()) {
                                    p pVar = (p) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false);
                                }
                            } else if (result instanceof vjj.l) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(((vjj.l) result).f289771a, lgj.e.ADD_NUMBER, null), true, null, false);
                                }
                            } else if (result instanceof o) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((o) result).f289774a), true, null, false);
                                }
                            } else if (result instanceof r) {
                                r rVar = (r) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, rVar.f289780a), true, null, false);
                            } else if (result instanceof vjj.q) {
                                vjj.q qVar = (vjj.q) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false);
                            } else if (result instanceof t) {
                                t tVar = (t) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(tVar.f289786a, tVar.f289787b), null, 2), true, null, false);
                            } else {
                                if (!(result instanceof s)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                s sVar = (s) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof a.C0610a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.r2();
                            return Unit.f186387a;
                        case 3:
                            d67.u it8 = (d67.u) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f305437b.I2();
                            return Unit.f186387a;
                        case 4:
                            wfj.c result2 = (wfj.c) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.EsimRefund(null), true, null, false);
                            return Unit.f186387a;
                        case 5:
                            uhj.e output3 = (uhj.e) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, output3.f280256a, 1), true, null, false);
                            return Unit.f186387a;
                        case 6:
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result3 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean zF = Intrinsics.f(result3, a.b.f100765a);
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar3 = this.f305437b;
                            if (zF) {
                                cVar3.Q2();
                                cVar3.B.a();
                            } else {
                                if (!(result3 instanceof a.C0612a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((a.C0612a) result3).f100764a) {
                                    cVar3.Q2();
                                } else {
                                    cVar3.q2();
                                }
                            }
                            return Unit.f186387a;
                        case 7:
                            rhj.i output4 = (rhj.i) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            boolean z4 = output4 instanceof g;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar4 = this.f305437b;
                            if (z4) {
                                cVar4.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((g) output4).f254496a), true, null, false);
                            } else {
                                if (!(output4 instanceof rhj.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (cVar4.O2()) {
                                    cVar4.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((rhj.h) output4).f254497a), true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 8:
                            bgj.c result4 = (bgj.c) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            if (result4 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(result4.f15206a);
                            return Unit.f186387a;
                        case 9:
                            pgj.d result5 = (pgj.d) obj2;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (!(result5 instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(((pgj.c) result5).f235975a);
                            return Unit.f186387a;
                        case 10:
                            fjj.p result6 = (fjj.p) obj2;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z6 = result6 instanceof fjj.n;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar5 = this.f305437b;
                            if (z6) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanPayments(((fjj.n) result6).f135664a), true, null, false);
                                }
                            } else if (result6 instanceof fjj.l) {
                                if (cVar5.O2()) {
                                    fjj.l lVar = (fjj.l) result6;
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false);
                                }
                            } else if (result6 instanceof fjj.m) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((fjj.m) result6).f135663a), true, null, false);
                                }
                            } else {
                                if (!(result6 instanceof fjj.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fjj.o oVar = (fjj.o) result6;
                                cVar5.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(oVar.f135665a, oVar.f135666b), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            EsimSubscriptionsScreenContract$OutputData output5 = (EsimSubscriptionsScreenContract$OutputData) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean z11 = output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToGetPlan;
                            boolean z12 = false;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar6 = this.f305437b;
                            if (z11) {
                                int i222 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToGetPlan) output5).f101049a.ordinal()];
                                if (i222 == 1) {
                                    cVar6.r2();
                                    cVar6.n2(new com.revolut.retail.feature.esim.impl.ui.flows.home.b(cVar6, null), new whi.b(6));
                                } else {
                                    if (i222 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, null, 3), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GiftPlanClicked) {
                                cVar6.E2(EsimHomeFlowContract$Step.GiftRecipientSelection.f100660a, true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) {
                                int i322 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) output5).f101048a.ordinal()];
                                if (i322 != 1) {
                                    if (i322 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z12 = true;
                                }
                                cVar6.E2(EsimHomeFlowContract$Step.ExpiredSubscriptions.f100657a, true, z12 ? TransitionAnimation.SLIDE_END_TO_START.f98395a : TransitionAnimation.NONE.f98393a, !z12);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Checkout(((EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) output5).f101044a, (EsimGiftRecipient) null, 6), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) output5).f101045a), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.InstallationInstructionsClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("INSTALLATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.EnableEsimClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("ACTIVATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.HelpClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Help(null), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) {
                                if (cVar6.O2()) {
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) output5).f101060a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked mobilePlanResubscribeClicked = (EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(mobilePlanResubscribeClicked.f101058a, mobilePlanResubscribeClicked.f101059b), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick mobilePlanPortingUpdateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(mobilePlanPortingUpdateClick.f101055a, mobilePlanPortingUpdateClick.f101056b, mobilePlanPortingUpdateClick.f101057c, mobilePlanPortingUpdateClick.d), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick mobilePlanPortingCreateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(mobilePlanPortingCreateClick.d, mobilePlanPortingCreateClick.f101053b, mobilePlanPortingCreateClick.f101054c, mobilePlanPortingCreateClick.f101052a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanChange) {
                                EsimSubscriptionsScreenContract$OutputData.PlanChange planChange = (EsimSubscriptionsScreenContract$OutputData.PlanChange) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(planChange.f101062b, planChange.f101061a), null, 2), true, null, false);
                            } else {
                                if (!(output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanUpgrade)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                EsimSubscriptionsScreenContract$OutputData.PlanUpgrade planUpgrade = (EsimSubscriptionsScreenContract$OutputData.PlanUpgrade) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(planUpgrade.f101064b, planUpgrade.f101063a), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block11, "block");
            esimMobilePlanBillingScreen.H = block11;
            return esimMobilePlanBillingScreen;
        }
        if (step instanceof EsimHomeFlowContract$Step.MobilePlanPayments) {
            return new EsimMobilePlanPaymentsScreen(new EsimMobilePlanPaymentsScreenContract$InputData(((EsimHomeFlowContract$Step.MobilePlanPayments) step).f100668a));
        }
        if (step instanceof EsimHomeFlowContract$Step.MobilePlanInvoices) {
            return new EsimMobilePlanInvoicesScreen(new EsimMobilePlanInvoicesScreenContract$InputData(((EsimHomeFlowContract$Step.MobilePlanInvoices) step).f100667a));
        }
        if (step instanceof EsimHomeFlowContract$Step.MobilePlanCancellation) {
            EsimHomeFlowContract$Step.MobilePlanCancellation mobilePlanCancellation = (EsimHomeFlowContract$Step.MobilePlanCancellation) step;
            EsimMobilePlanCancellationFlow esimMobilePlanCancellationFlow = new EsimMobilePlanCancellationFlow(new EsimMobilePlanCancellationFlowContract$InputData(mobilePlanCancellation.f100663a, mobilePlanCancellation.f100664b, mobilePlanCancellation.f100665c, mobilePlanCancellation.d));
            final int i66 = 8;
            Function1 block12 = new Function1(this) { // from class: xfj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.home.c f305437b;

                {
                    this.f305437b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i66) {
                        case 0:
                            d0 output = (d0) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof a0;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar = this.f305437b;
                            if (z) {
                                a0 a0Var = (a0) output;
                                cVar.E2(new EsimHomeFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b, 2), true, null, false);
                            } else if (output instanceof c0) {
                                cVar.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((c0) output).f323549a), true, null, false);
                            } else if (output instanceof x) {
                                cVar.E2(new EsimHomeFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                            } else if (output instanceof b0) {
                                cVar.E2(new EsimHomeFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                            } else if (output instanceof v) {
                                v vVar = (v) output;
                                cVar.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.DataPlanChange(vVar.f323593a, vVar.f323594b), vVar.f323595c), true, null, false);
                            } else if (output instanceof zmj.w) {
                                cVar.E2(new EsimHomeFlowContract$Step.ConnectivityTroubleshooting(((zmj.w) output).f323596a), true, null, false);
                            } else if (Intrinsics.f(output, y.f323598a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar.R2("INSTALLATION");
                            } else {
                                if (!(output instanceof z)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((z) output).f323599a), false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a result = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z3 = result instanceof m;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar2 = this.f305437b;
                            if (z3) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanBilling(((m) result).f289772a), true, null, false);
                                }
                            } else if (result instanceof vjj.n) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.Help(((vjj.n) result).f289773a), true, null, false);
                                }
                            } else if (result instanceof u) {
                                if (cVar2.O2()) {
                                    u uVar = (u) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(uVar.f289788a, uVar.f289789b), true, null, false);
                                }
                            } else if (Intrinsics.f(result, a.C0617a.f101205a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar2.R2("INSTALLATION");
                            } else if (result instanceof p) {
                                if (cVar2.O2()) {
                                    p pVar = (p) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false);
                                }
                            } else if (result instanceof vjj.l) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(((vjj.l) result).f289771a, lgj.e.ADD_NUMBER, null), true, null, false);
                                }
                            } else if (result instanceof o) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((o) result).f289774a), true, null, false);
                                }
                            } else if (result instanceof r) {
                                r rVar = (r) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, rVar.f289780a), true, null, false);
                            } else if (result instanceof vjj.q) {
                                vjj.q qVar = (vjj.q) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false);
                            } else if (result instanceof t) {
                                t tVar = (t) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(tVar.f289786a, tVar.f289787b), null, 2), true, null, false);
                            } else {
                                if (!(result instanceof s)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                s sVar = (s) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof a.C0610a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.r2();
                            return Unit.f186387a;
                        case 3:
                            d67.u it8 = (d67.u) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f305437b.I2();
                            return Unit.f186387a;
                        case 4:
                            wfj.c result2 = (wfj.c) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.EsimRefund(null), true, null, false);
                            return Unit.f186387a;
                        case 5:
                            uhj.e output3 = (uhj.e) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, output3.f280256a, 1), true, null, false);
                            return Unit.f186387a;
                        case 6:
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result3 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean zF = Intrinsics.f(result3, a.b.f100765a);
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar3 = this.f305437b;
                            if (zF) {
                                cVar3.Q2();
                                cVar3.B.a();
                            } else {
                                if (!(result3 instanceof a.C0612a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((a.C0612a) result3).f100764a) {
                                    cVar3.Q2();
                                } else {
                                    cVar3.q2();
                                }
                            }
                            return Unit.f186387a;
                        case 7:
                            rhj.i output4 = (rhj.i) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            boolean z4 = output4 instanceof g;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar4 = this.f305437b;
                            if (z4) {
                                cVar4.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((g) output4).f254496a), true, null, false);
                            } else {
                                if (!(output4 instanceof rhj.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (cVar4.O2()) {
                                    cVar4.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((rhj.h) output4).f254497a), true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 8:
                            bgj.c result4 = (bgj.c) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            if (result4 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(result4.f15206a);
                            return Unit.f186387a;
                        case 9:
                            pgj.d result5 = (pgj.d) obj2;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (!(result5 instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(((pgj.c) result5).f235975a);
                            return Unit.f186387a;
                        case 10:
                            fjj.p result6 = (fjj.p) obj2;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z6 = result6 instanceof fjj.n;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar5 = this.f305437b;
                            if (z6) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanPayments(((fjj.n) result6).f135664a), true, null, false);
                                }
                            } else if (result6 instanceof fjj.l) {
                                if (cVar5.O2()) {
                                    fjj.l lVar = (fjj.l) result6;
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false);
                                }
                            } else if (result6 instanceof fjj.m) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((fjj.m) result6).f135663a), true, null, false);
                                }
                            } else {
                                if (!(result6 instanceof fjj.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fjj.o oVar = (fjj.o) result6;
                                cVar5.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(oVar.f135665a, oVar.f135666b), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            EsimSubscriptionsScreenContract$OutputData output5 = (EsimSubscriptionsScreenContract$OutputData) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean z11 = output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToGetPlan;
                            boolean z12 = false;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar6 = this.f305437b;
                            if (z11) {
                                int i222 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToGetPlan) output5).f101049a.ordinal()];
                                if (i222 == 1) {
                                    cVar6.r2();
                                    cVar6.n2(new com.revolut.retail.feature.esim.impl.ui.flows.home.b(cVar6, null), new whi.b(6));
                                } else {
                                    if (i222 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, null, 3), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GiftPlanClicked) {
                                cVar6.E2(EsimHomeFlowContract$Step.GiftRecipientSelection.f100660a, true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) {
                                int i322 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) output5).f101048a.ordinal()];
                                if (i322 != 1) {
                                    if (i322 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z12 = true;
                                }
                                cVar6.E2(EsimHomeFlowContract$Step.ExpiredSubscriptions.f100657a, true, z12 ? TransitionAnimation.SLIDE_END_TO_START.f98395a : TransitionAnimation.NONE.f98393a, !z12);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Checkout(((EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) output5).f101044a, (EsimGiftRecipient) null, 6), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) output5).f101045a), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.InstallationInstructionsClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("INSTALLATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.EnableEsimClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("ACTIVATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.HelpClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Help(null), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) {
                                if (cVar6.O2()) {
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) output5).f101060a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked mobilePlanResubscribeClicked = (EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(mobilePlanResubscribeClicked.f101058a, mobilePlanResubscribeClicked.f101059b), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick mobilePlanPortingUpdateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(mobilePlanPortingUpdateClick.f101055a, mobilePlanPortingUpdateClick.f101056b, mobilePlanPortingUpdateClick.f101057c, mobilePlanPortingUpdateClick.d), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick mobilePlanPortingCreateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(mobilePlanPortingCreateClick.d, mobilePlanPortingCreateClick.f101053b, mobilePlanPortingCreateClick.f101054c, mobilePlanPortingCreateClick.f101052a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanChange) {
                                EsimSubscriptionsScreenContract$OutputData.PlanChange planChange = (EsimSubscriptionsScreenContract$OutputData.PlanChange) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(planChange.f101062b, planChange.f101061a), null, 2), true, null, false);
                            } else {
                                if (!(output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanUpgrade)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                EsimSubscriptionsScreenContract$OutputData.PlanUpgrade planUpgrade = (EsimSubscriptionsScreenContract$OutputData.PlanUpgrade) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(planUpgrade.f101064b, planUpgrade.f101063a), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block12, "block");
            esimMobilePlanCancellationFlow.H = block12;
            return esimMobilePlanCancellationFlow;
        }
        if (step instanceof EsimHomeFlowContract$Step.NumberTransferConfirmation) {
            EsimHomeFlowContract$Step.NumberTransferConfirmation numberTransferConfirmation = (EsimHomeFlowContract$Step.NumberTransferConfirmation) step;
            EsimMobilePlanNumberTransferConfirmationOrchestratorFlow esimMobilePlanNumberTransferConfirmationOrchestratorFlow = new EsimMobilePlanNumberTransferConfirmationOrchestratorFlow(new EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData(numberTransferConfirmation.f100674a, numberTransferConfirmation.f100675b, numberTransferConfirmation.f100676c, numberTransferConfirmation.d, numberTransferConfirmation.e));
            final int i74 = 6;
            Function1 block13 = new Function1(this) { // from class: xfj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.home.c f305437b;

                {
                    this.f305437b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i74) {
                        case 0:
                            d0 output = (d0) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof a0;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar = this.f305437b;
                            if (z) {
                                a0 a0Var = (a0) output;
                                cVar.E2(new EsimHomeFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b, 2), true, null, false);
                            } else if (output instanceof c0) {
                                cVar.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((c0) output).f323549a), true, null, false);
                            } else if (output instanceof x) {
                                cVar.E2(new EsimHomeFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                            } else if (output instanceof b0) {
                                cVar.E2(new EsimHomeFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                            } else if (output instanceof v) {
                                v vVar = (v) output;
                                cVar.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.DataPlanChange(vVar.f323593a, vVar.f323594b), vVar.f323595c), true, null, false);
                            } else if (output instanceof zmj.w) {
                                cVar.E2(new EsimHomeFlowContract$Step.ConnectivityTroubleshooting(((zmj.w) output).f323596a), true, null, false);
                            } else if (Intrinsics.f(output, y.f323598a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar.R2("INSTALLATION");
                            } else {
                                if (!(output instanceof z)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((z) output).f323599a), false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a result = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z3 = result instanceof m;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar2 = this.f305437b;
                            if (z3) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanBilling(((m) result).f289772a), true, null, false);
                                }
                            } else if (result instanceof vjj.n) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.Help(((vjj.n) result).f289773a), true, null, false);
                                }
                            } else if (result instanceof u) {
                                if (cVar2.O2()) {
                                    u uVar = (u) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(uVar.f289788a, uVar.f289789b), true, null, false);
                                }
                            } else if (Intrinsics.f(result, a.C0617a.f101205a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar2.R2("INSTALLATION");
                            } else if (result instanceof p) {
                                if (cVar2.O2()) {
                                    p pVar = (p) result;
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false);
                                }
                            } else if (result instanceof vjj.l) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(((vjj.l) result).f289771a, lgj.e.ADD_NUMBER, null), true, null, false);
                                }
                            } else if (result instanceof o) {
                                if (cVar2.O2()) {
                                    cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((o) result).f289774a), true, null, false);
                                }
                            } else if (result instanceof r) {
                                r rVar = (r) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, rVar.f289780a), true, null, false);
                            } else if (result instanceof vjj.q) {
                                vjj.q qVar = (vjj.q) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false);
                            } else if (result instanceof t) {
                                t tVar = (t) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(tVar.f289786a, tVar.f289787b), null, 2), true, null, false);
                            } else {
                                if (!(result instanceof s)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                s sVar = (s) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof a.C0610a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.r2();
                            return Unit.f186387a;
                        case 3:
                            d67.u it8 = (d67.u) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f305437b.I2();
                            return Unit.f186387a;
                        case 4:
                            wfj.c result2 = (wfj.c) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.EsimRefund(null), true, null, false);
                            return Unit.f186387a;
                        case 5:
                            uhj.e output3 = (uhj.e) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, output3.f280256a, 1), true, null, false);
                            return Unit.f186387a;
                        case 6:
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result3 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean zF = Intrinsics.f(result3, a.b.f100765a);
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar3 = this.f305437b;
                            if (zF) {
                                cVar3.Q2();
                                cVar3.B.a();
                            } else {
                                if (!(result3 instanceof a.C0612a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((a.C0612a) result3).f100764a) {
                                    cVar3.Q2();
                                } else {
                                    cVar3.q2();
                                }
                            }
                            return Unit.f186387a;
                        case 7:
                            rhj.i output4 = (rhj.i) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            boolean z4 = output4 instanceof g;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar4 = this.f305437b;
                            if (z4) {
                                cVar4.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((g) output4).f254496a), true, null, false);
                            } else {
                                if (!(output4 instanceof rhj.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (cVar4.O2()) {
                                    cVar4.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((rhj.h) output4).f254497a), true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 8:
                            bgj.c result4 = (bgj.c) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            if (result4 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(result4.f15206a);
                            return Unit.f186387a;
                        case 9:
                            pgj.d result5 = (pgj.d) obj2;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (!(result5 instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f305437b.P2(((pgj.c) result5).f235975a);
                            return Unit.f186387a;
                        case 10:
                            fjj.p result6 = (fjj.p) obj2;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z6 = result6 instanceof fjj.n;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar5 = this.f305437b;
                            if (z6) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanPayments(((fjj.n) result6).f135664a), true, null, false);
                                }
                            } else if (result6 instanceof fjj.l) {
                                if (cVar5.O2()) {
                                    fjj.l lVar = (fjj.l) result6;
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false);
                                }
                            } else if (result6 instanceof fjj.m) {
                                if (cVar5.O2()) {
                                    cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((fjj.m) result6).f135663a), true, null, false);
                                }
                            } else {
                                if (!(result6 instanceof fjj.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fjj.o oVar = (fjj.o) result6;
                                cVar5.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(oVar.f135665a, oVar.f135666b), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            EsimSubscriptionsScreenContract$OutputData output5 = (EsimSubscriptionsScreenContract$OutputData) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean z11 = output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToGetPlan;
                            boolean z12 = false;
                            com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar6 = this.f305437b;
                            if (z11) {
                                int i222 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToGetPlan) output5).f101049a.ordinal()];
                                if (i222 == 1) {
                                    cVar6.r2();
                                    cVar6.n2(new com.revolut.retail.feature.esim.impl.ui.flows.home.b(cVar6, null), new whi.b(6));
                                } else {
                                    if (i222 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, null, 3), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GiftPlanClicked) {
                                cVar6.E2(EsimHomeFlowContract$Step.GiftRecipientSelection.f100660a, true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) {
                                int i322 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) output5).f101048a.ordinal()];
                                if (i322 != 1) {
                                    if (i322 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z12 = true;
                                }
                                cVar6.E2(EsimHomeFlowContract$Step.ExpiredSubscriptions.f100657a, true, z12 ? TransitionAnimation.SLIDE_END_TO_START.f98395a : TransitionAnimation.NONE.f98393a, !z12);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Checkout(((EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) output5).f101044a, (EsimGiftRecipient) null, 6), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) output5).f101045a), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.InstallationInstructionsClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("INSTALLATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.EnableEsimClicked) {
                                EsimInstructionType.INSTANCE.getClass();
                                cVar6.R2("ACTIVATION");
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.HelpClicked) {
                                cVar6.E2(new EsimHomeFlowContract$Step.Help(null), true, null, false);
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) {
                                if (cVar6.O2()) {
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) output5).f101060a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked mobilePlanResubscribeClicked = (EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(mobilePlanResubscribeClicked.f101058a, mobilePlanResubscribeClicked.f101059b), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick mobilePlanPortingUpdateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(mobilePlanPortingUpdateClick.f101055a, mobilePlanPortingUpdateClick.f101056b, mobilePlanPortingUpdateClick.f101057c, mobilePlanPortingUpdateClick.d), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) {
                                if (cVar6.O2()) {
                                    EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick mobilePlanPortingCreateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) output5;
                                    cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(mobilePlanPortingCreateClick.d, mobilePlanPortingCreateClick.f101053b, mobilePlanPortingCreateClick.f101054c, mobilePlanPortingCreateClick.f101052a), true, null, false);
                                }
                            } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanChange) {
                                EsimSubscriptionsScreenContract$OutputData.PlanChange planChange = (EsimSubscriptionsScreenContract$OutputData.PlanChange) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(planChange.f101062b, planChange.f101061a), null, 2), true, null, false);
                            } else {
                                if (!(output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanUpgrade)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                EsimSubscriptionsScreenContract$OutputData.PlanUpgrade planUpgrade = (EsimSubscriptionsScreenContract$OutputData.PlanUpgrade) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(planUpgrade.f101064b, planUpgrade.f101063a), null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block13, "block");
            esimMobilePlanNumberTransferConfirmationOrchestratorFlow.H = block13;
            return esimMobilePlanNumberTransferConfirmationOrchestratorFlow;
        }
        if (step instanceof EsimHomeFlowContract$Step.NumberTransferCreation) {
            EsimHomeFlowContract$Step.NumberTransferCreation numberTransferCreation = (EsimHomeFlowContract$Step.NumberTransferCreation) step;
            EsimMobilePlanNumberTransferScreen esimMobilePlanNumberTransferScreen = new EsimMobilePlanNumberTransferScreen(new EsimMobilePlanNumberTransferScreenContract$InputData(numberTransferCreation.f100678b, numberTransferCreation.d));
            xf0.j block14 = new xf0.j(this, step, 1);
            Intrinsics.checkNotNullParameter(block14, "block");
            esimMobilePlanNumberTransferScreen.H = block14;
            return esimMobilePlanNumberTransferScreen;
        }
        if (step instanceof EsimHomeFlowContract$Step.NumberPurchase) {
            EsimHomeFlowContract$Step.NumberPurchase numberPurchase = (EsimHomeFlowContract$Step.NumberPurchase) step;
            EsimMobilePlanPhoneNumberPurchaseFlow esimMobilePlanPhoneNumberPurchaseFlow = new EsimMobilePlanPhoneNumberPurchaseFlow(new EsimMobilePlanPhoneNumberPurchaseFlowContract$InputData(numberPurchase.f100671a, numberPurchase.f100672b, numberPurchase.f100673c));
            xf0.j block15 = new xf0.j(this, esimMobilePlanPhoneNumberPurchaseFlow, 2);
            Intrinsics.checkNotNullParameter(block15, "block");
            esimMobilePlanPhoneNumberPurchaseFlow.H = block15;
            return esimMobilePlanPhoneNumberPurchaseFlow;
        }
        if (!(step instanceof EsimHomeFlowContract$Step.Restricted)) {
            throw new NoWhenBranchMatchedException();
        }
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(((EsimHomeFlowContract$Step.Restricted) step).f100680a);
        final int i92 = 3;
        Function1 block16 = new Function1(this) { // from class: xfj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.home.c f305437b;

            {
                this.f305437b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i92) {
                    case 0:
                        d0 output = (d0) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean z = output instanceof a0;
                        com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar = this.f305437b;
                        if (z) {
                            a0 a0Var = (a0) output;
                            cVar.E2(new EsimHomeFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b, 2), true, null, false);
                        } else if (output instanceof c0) {
                            cVar.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((c0) output).f323549a), true, null, false);
                        } else if (output instanceof x) {
                            cVar.E2(new EsimHomeFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                        } else if (output instanceof b0) {
                            cVar.E2(new EsimHomeFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                        } else if (output instanceof v) {
                            v vVar = (v) output;
                            cVar.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.DataPlanChange(vVar.f323593a, vVar.f323594b), vVar.f323595c), true, null, false);
                        } else if (output instanceof zmj.w) {
                            cVar.E2(new EsimHomeFlowContract$Step.ConnectivityTroubleshooting(((zmj.w) output).f323596a), true, null, false);
                        } else if (Intrinsics.f(output, y.f323598a)) {
                            EsimInstructionType.INSTANCE.getClass();
                            cVar.R2("INSTALLATION");
                        } else {
                            if (!(output instanceof z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((z) output).f323599a), false, TransitionAnimation.NONE.f98393a, false);
                        }
                        return Unit.f186387a;
                    case 1:
                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a result = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj2;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean z3 = result instanceof m;
                        com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar2 = this.f305437b;
                        if (z3) {
                            if (cVar2.O2()) {
                                cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanBilling(((m) result).f289772a), true, null, false);
                            }
                        } else if (result instanceof vjj.n) {
                            if (cVar2.O2()) {
                                cVar2.E2(new EsimHomeFlowContract$Step.Help(((vjj.n) result).f289773a), true, null, false);
                            }
                        } else if (result instanceof u) {
                            if (cVar2.O2()) {
                                u uVar = (u) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(uVar.f289788a, uVar.f289789b), true, null, false);
                            }
                        } else if (Intrinsics.f(result, a.C0617a.f101205a)) {
                            EsimInstructionType.INSTANCE.getClass();
                            cVar2.R2("INSTALLATION");
                        } else if (result instanceof p) {
                            if (cVar2.O2()) {
                                p pVar = (p) result;
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false);
                            }
                        } else if (result instanceof vjj.l) {
                            if (cVar2.O2()) {
                                cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(((vjj.l) result).f289771a, lgj.e.ADD_NUMBER, null), true, null, false);
                            }
                        } else if (result instanceof o) {
                            if (cVar2.O2()) {
                                cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((o) result).f289774a), true, null, false);
                            }
                        } else if (result instanceof r) {
                            r rVar = (r) result;
                            cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, rVar.f289780a), true, null, false);
                        } else if (result instanceof vjj.q) {
                            vjj.q qVar = (vjj.q) result;
                            cVar2.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false);
                        } else if (result instanceof t) {
                            t tVar = (t) result;
                            cVar2.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(tVar.f289786a, tVar.f289787b), null, 2), true, null, false);
                        } else {
                            if (!(result instanceof s)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            s sVar = (s) result;
                            cVar2.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false);
                        }
                        return Unit.f186387a;
                    case 2:
                        com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        if (!(output2 instanceof a.C0610a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f305437b.r2();
                        return Unit.f186387a;
                    case 3:
                        d67.u it8 = (d67.u) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        this.f305437b.I2();
                        return Unit.f186387a;
                    case 4:
                        wfj.c result2 = (wfj.c) obj2;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        if (!(result2 instanceof wfj.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f305437b.E2(new EsimHomeFlowContract$Step.EsimRefund(null), true, null, false);
                        return Unit.f186387a;
                    case 5:
                        uhj.e output3 = (uhj.e) obj2;
                        Intrinsics.checkNotNullParameter(output3, "output");
                        if (output3 == null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f305437b.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, output3.f280256a, 1), true, null, false);
                        return Unit.f186387a;
                    case 6:
                        com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result3 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj2;
                        Intrinsics.checkNotNullParameter(result3, "result");
                        boolean zF = Intrinsics.f(result3, a.b.f100765a);
                        com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar3 = this.f305437b;
                        if (zF) {
                            cVar3.Q2();
                            cVar3.B.a();
                        } else {
                            if (!(result3 instanceof a.C0612a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (((a.C0612a) result3).f100764a) {
                                cVar3.Q2();
                            } else {
                                cVar3.q2();
                            }
                        }
                        return Unit.f186387a;
                    case 7:
                        rhj.i output4 = (rhj.i) obj2;
                        Intrinsics.checkNotNullParameter(output4, "output");
                        boolean z4 = output4 instanceof g;
                        com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar4 = this.f305437b;
                        if (z4) {
                            cVar4.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((g) output4).f254496a), true, null, false);
                        } else {
                            if (!(output4 instanceof rhj.h)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (cVar4.O2()) {
                                cVar4.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((rhj.h) output4).f254497a), true, null, false);
                            }
                        }
                        return Unit.f186387a;
                    case 8:
                        bgj.c result4 = (bgj.c) obj2;
                        Intrinsics.checkNotNullParameter(result4, "result");
                        if (result4 == null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f305437b.P2(result4.f15206a);
                        return Unit.f186387a;
                    case 9:
                        pgj.d result5 = (pgj.d) obj2;
                        Intrinsics.checkNotNullParameter(result5, "result");
                        if (!(result5 instanceof pgj.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f305437b.P2(((pgj.c) result5).f235975a);
                        return Unit.f186387a;
                    case 10:
                        fjj.p result6 = (fjj.p) obj2;
                        Intrinsics.checkNotNullParameter(result6, "result");
                        boolean z6 = result6 instanceof fjj.n;
                        com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar5 = this.f305437b;
                        if (z6) {
                            if (cVar5.O2()) {
                                cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanPayments(((fjj.n) result6).f135664a), true, null, false);
                            }
                        } else if (result6 instanceof fjj.l) {
                            if (cVar5.O2()) {
                                fjj.l lVar = (fjj.l) result6;
                                cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false);
                            }
                        } else if (result6 instanceof fjj.m) {
                            if (cVar5.O2()) {
                                cVar5.E2(new EsimHomeFlowContract$Step.MobilePlanInvoices(((fjj.m) result6).f135663a), true, null, false);
                            }
                        } else {
                            if (!(result6 instanceof fjj.o)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fjj.o oVar = (fjj.o) result6;
                            cVar5.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(oVar.f135665a, oVar.f135666b), null, 2), true, null, false);
                        }
                        return Unit.f186387a;
                    default:
                        EsimSubscriptionsScreenContract$OutputData output5 = (EsimSubscriptionsScreenContract$OutputData) obj2;
                        Intrinsics.checkNotNullParameter(output5, "output");
                        boolean z11 = output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToGetPlan;
                        boolean z12 = false;
                        com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar6 = this.f305437b;
                        if (z11) {
                            int i222 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToGetPlan) output5).f101049a.ordinal()];
                            if (i222 == 1) {
                                cVar6.r2();
                                cVar6.n2(new com.revolut.retail.feature.esim.impl.ui.flows.home.b(cVar6, null), new whi.b(6));
                            } else {
                                if (i222 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(null, null, 3), true, null, false);
                            }
                        } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GiftPlanClicked) {
                            cVar6.E2(EsimHomeFlowContract$Step.GiftRecipientSelection.f100660a, true, null, false);
                        } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) {
                            int i322 = d.f305438a[((EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans) output5).f101048a.ordinal()];
                            if (i322 != 1) {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                z12 = true;
                            }
                            cVar6.E2(EsimHomeFlowContract$Step.ExpiredSubscriptions.f100657a, true, z12 ? TransitionAnimation.SLIDE_END_TO_START.f98395a : TransitionAnimation.NONE.f98393a, !z12);
                        } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) {
                            cVar6.E2(new EsimHomeFlowContract$Step.Checkout(((EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked) output5).f101044a, (EsimGiftRecipient) null, 6), true, null, false);
                        } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) {
                            cVar6.E2(new EsimHomeFlowContract$Step.SubscriptionDetails(((EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked) output5).f101045a), true, null, false);
                        } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.InstallationInstructionsClicked) {
                            EsimInstructionType.INSTANCE.getClass();
                            cVar6.R2("INSTALLATION");
                        } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.EnableEsimClicked) {
                            EsimInstructionType.INSTANCE.getClass();
                            cVar6.R2("ACTIVATION");
                        } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.HelpClicked) {
                            cVar6.E2(new EsimHomeFlowContract$Step.Help(null), true, null, false);
                        } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) {
                            if (cVar6.O2()) {
                                cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanDetails(((EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked) output5).f101060a), true, null, false);
                            }
                        } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) {
                            if (cVar6.O2()) {
                                EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked mobilePlanResubscribeClicked = (EsimSubscriptionsScreenContract$OutputData.MobilePlanResubscribeClicked) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.MobilePlanResubscribeCheckout(mobilePlanResubscribeClicked.f101058a, mobilePlanResubscribeClicked.f101059b), true, null, false);
                            }
                        } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) {
                            if (cVar6.O2()) {
                                EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick mobilePlanPortingUpdateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingUpdateClick) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(mobilePlanPortingUpdateClick.f101055a, mobilePlanPortingUpdateClick.f101056b, mobilePlanPortingUpdateClick.f101057c, mobilePlanPortingUpdateClick.d), true, null, false);
                            }
                        } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) {
                            if (cVar6.O2()) {
                                EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick mobilePlanPortingCreateClick = (EsimSubscriptionsScreenContract$OutputData.MobilePlanPortingCreateClick) output5;
                                cVar6.E2(new EsimHomeFlowContract$Step.NumberTransferCreation(mobilePlanPortingCreateClick.d, mobilePlanPortingCreateClick.f101053b, mobilePlanPortingCreateClick.f101054c, mobilePlanPortingCreateClick.f101052a), true, null, false);
                            }
                        } else if (output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanChange) {
                            EsimSubscriptionsScreenContract$OutputData.PlanChange planChange = (EsimSubscriptionsScreenContract$OutputData.PlanChange) output5;
                            cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanChange(planChange.f101062b, planChange.f101061a), null, 2), true, null, false);
                        } else {
                            if (!(output5 instanceof EsimSubscriptionsScreenContract$OutputData.PlanUpgrade)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            EsimSubscriptionsScreenContract$OutputData.PlanUpgrade planUpgrade = (EsimSubscriptionsScreenContract$OutputData.PlanUpgrade) output5;
                            cVar6.E2(new EsimHomeFlowContract$Step.GetDataPlan(new EsimGetPlanLaunchMode.PlanUpgrade(planUpgrade.f101064b, planUpgrade.f101063a), null, 2), true, null, false);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block16, "block");
        promptMarketingScreen.H = block16;
        return promptMarketingScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.A;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.z;
    }
}
