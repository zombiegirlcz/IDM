package com.revolut.retail.feature.esim.impl.ui.flows.subscription;

import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import com.revolut.feature.esim.instructions.navigation.EsimInstructionsControllerDescriptor$InputData;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimGetPlanLaunchMode;
import com.revolut.retail.feature.esim.impl.ui.flows.get_plan.EsimGetPlanFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.get_plan.EsimGetPlanFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a;
import com.revolut.retail.feature.esim.impl.ui.flows.help.EsimHelpFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.help.EsimHelpFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.home.EsimHomeFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.home.EsimHomeFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.EsimMobilePlanSubscriptionFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.EsimMobilePlanSubscriptionFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlowContract$EsimSubscriptionsToRefund;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.subscription.EsimSubscriptionFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.EsimConnectivityTroubleshootingFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.EsimConnectivityTroubleshootingFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreenContract$InputData;
import d67.u;
import dej.c4;
import dej.m;
import dfj.z2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pgj.d;
import sgj.c;
import yji.l;
import zmj.a0;
import zmj.b0;
import zmj.c0;
import zmj.d0;
import zmj.v;
import zmj.w;
import zmj.x;
import zmj.y;
import zmj.z;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends sfj.b implements sgj.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final EsimSubscriptionFlowContract$Step.Subscription f100895w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final EsimSubscriptionFlowContract$EmptyState f100896x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EsimSubscriptionFlowContract$InputData inputData, z2 esimRestrictionsInteractor) {
        super(esimRestrictionsInteractor, a.f);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(esimRestrictionsInteractor, "esimRestrictionsInteractor");
        this.f100895w = new EsimSubscriptionFlowContract$Step.Subscription(inputData.f100882a);
        this.f100896x = EsimSubscriptionFlowContract$EmptyState.f100881a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        EsimSubscriptionFlowContract$Step step = (EsimSubscriptionFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof EsimSubscriptionFlowContract$Step.Restricted) {
            PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(((EsimSubscriptionFlowContract$Step.Restricted) step).f100892a);
            final int i = 0;
            Function1 block = new Function1(this) { // from class: sgj.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.subscription.b f262661b;

                {
                    this.f262661b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            u it8 = (u) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f262661b.I2();
                            return Unit.f186387a;
                        case 1:
                            d0 output = (d0) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof a0;
                            com.revolut.retail.feature.esim.impl.ui.flows.subscription.b bVar = this.f262661b;
                            if (z) {
                                a0 a0Var = (a0) output;
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b), true, null, false);
                            } else if (output instanceof c0) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Subscription(((c0) output).f323549a), true, null, false);
                            } else if (output instanceof x) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                            } else if (output instanceof b0) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                            } else if (output instanceof v) {
                                v vVar = (v) output;
                                bVar.E2(new EsimSubscriptionFlowContract$Step.ChangeDataPlan(vVar.f323593a, vVar.f323594b, vVar.f323595c), true, null, false);
                            } else if (Intrinsics.f(output, y.f323598a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                l.j2(bVar, bVar.e1(new sd6.b(new EsimInstructionsControllerDescriptor$InputData("INSTALLATION", null))), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, null, 2);
                            } else if (output instanceof w) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.ConnectivityTroubleshooting(((w) output).f323596a), true, null, false);
                            } else {
                                if (!(output instanceof z)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Subscription(((z) output).f323599a, m.MOBILE_PLAN), false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            wfj.c result = (wfj.c) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!(result instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f262661b.E2(new EsimSubscriptionFlowContract$Step.EsimRefund(null), true, null, false);
                            return Unit.f186387a;
                        case 3:
                            com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof a.C0610a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f262661b.r2();
                            return Unit.f186387a;
                        default:
                            d result2 = (d) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c4 c4Var = ((pgj.c) result2).f235975a;
                            com.revolut.retail.feature.esim.impl.ui.flows.subscription.b bVar2 = this.f262661b;
                            bVar2.r2();
                            bVar2.E2(new EsimSubscriptionFlowContract$Step.EsimHome(c4Var), false, null, false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            promptMarketingScreen.H = block;
            return promptMarketingScreen;
        }
        if (step instanceof EsimSubscriptionFlowContract$Step.Subscription) {
            EsimSubscriptionFlowContract$Step.Subscription subscription = (EsimSubscriptionFlowContract$Step.Subscription) step;
            String str = subscription.f100893a;
            int i2 = c.f262662a[subscription.f100894b.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return new EsimMobilePlanSubscriptionFlow(new EsimMobilePlanSubscriptionFlowContract$InputData(str));
                }
                throw new NoWhenBranchMatchedException();
            }
            EsimSubscriptionDetailsScreen esimSubscriptionDetailsScreen = new EsimSubscriptionDetailsScreen(new EsimSubscriptionDetailsScreenContract$InputData(str));
            final int i3 = 1;
            Function1 block2 = new Function1(this) { // from class: sgj.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.subscription.b f262661b;

                {
                    this.f262661b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            u it8 = (u) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f262661b.I2();
                            return Unit.f186387a;
                        case 1:
                            d0 output = (d0) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof a0;
                            com.revolut.retail.feature.esim.impl.ui.flows.subscription.b bVar = this.f262661b;
                            if (z) {
                                a0 a0Var = (a0) output;
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b), true, null, false);
                            } else if (output instanceof c0) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Subscription(((c0) output).f323549a), true, null, false);
                            } else if (output instanceof x) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                            } else if (output instanceof b0) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                            } else if (output instanceof v) {
                                v vVar = (v) output;
                                bVar.E2(new EsimSubscriptionFlowContract$Step.ChangeDataPlan(vVar.f323593a, vVar.f323594b, vVar.f323595c), true, null, false);
                            } else if (Intrinsics.f(output, y.f323598a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                l.j2(bVar, bVar.e1(new sd6.b(new EsimInstructionsControllerDescriptor$InputData("INSTALLATION", null))), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, null, 2);
                            } else if (output instanceof w) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.ConnectivityTroubleshooting(((w) output).f323596a), true, null, false);
                            } else {
                                if (!(output instanceof z)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Subscription(((z) output).f323599a, m.MOBILE_PLAN), false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            wfj.c result = (wfj.c) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!(result instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f262661b.E2(new EsimSubscriptionFlowContract$Step.EsimRefund(null), true, null, false);
                            return Unit.f186387a;
                        case 3:
                            com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof a.C0610a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f262661b.r2();
                            return Unit.f186387a;
                        default:
                            d result2 = (d) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c4 c4Var = ((pgj.c) result2).f235975a;
                            com.revolut.retail.feature.esim.impl.ui.flows.subscription.b bVar2 = this.f262661b;
                            bVar2.r2();
                            bVar2.E2(new EsimSubscriptionFlowContract$Step.EsimHome(c4Var), false, null, false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            esimSubscriptionDetailsScreen.H = block2;
            return esimSubscriptionDetailsScreen;
        }
        if (step instanceof EsimSubscriptionFlowContract$Step.Checkout) {
            EsimSubscriptionFlowContract$Step.Checkout checkout = (EsimSubscriptionFlowContract$Step.Checkout) step;
            EsimGetPlanFlow esimGetPlanFlow = new EsimGetPlanFlow(new EsimGetPlanFlowContract$InputData.DataPlanCheckout(checkout.f100886a, null, checkout.f100887b));
            final int i5 = 3;
            Function1 block3 = new Function1(this) { // from class: sgj.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.subscription.b f262661b;

                {
                    this.f262661b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i5) {
                        case 0:
                            u it8 = (u) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f262661b.I2();
                            return Unit.f186387a;
                        case 1:
                            d0 output = (d0) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof a0;
                            com.revolut.retail.feature.esim.impl.ui.flows.subscription.b bVar = this.f262661b;
                            if (z) {
                                a0 a0Var = (a0) output;
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b), true, null, false);
                            } else if (output instanceof c0) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Subscription(((c0) output).f323549a), true, null, false);
                            } else if (output instanceof x) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                            } else if (output instanceof b0) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                            } else if (output instanceof v) {
                                v vVar = (v) output;
                                bVar.E2(new EsimSubscriptionFlowContract$Step.ChangeDataPlan(vVar.f323593a, vVar.f323594b, vVar.f323595c), true, null, false);
                            } else if (Intrinsics.f(output, y.f323598a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                l.j2(bVar, bVar.e1(new sd6.b(new EsimInstructionsControllerDescriptor$InputData("INSTALLATION", null))), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, null, 2);
                            } else if (output instanceof w) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.ConnectivityTroubleshooting(((w) output).f323596a), true, null, false);
                            } else {
                                if (!(output instanceof z)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Subscription(((z) output).f323599a, m.MOBILE_PLAN), false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            wfj.c result = (wfj.c) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!(result instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f262661b.E2(new EsimSubscriptionFlowContract$Step.EsimRefund(null), true, null, false);
                            return Unit.f186387a;
                        case 3:
                            com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof a.C0610a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f262661b.r2();
                            return Unit.f186387a;
                        default:
                            d result2 = (d) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c4 c4Var = ((pgj.c) result2).f235975a;
                            com.revolut.retail.feature.esim.impl.ui.flows.subscription.b bVar2 = this.f262661b;
                            bVar2.r2();
                            bVar2.E2(new EsimSubscriptionFlowContract$Step.EsimHome(c4Var), false, null, false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            esimGetPlanFlow.H = block3;
            return esimGetPlanFlow;
        }
        if (step instanceof EsimSubscriptionFlowContract$Step.Help) {
            EsimHelpFlow esimHelpFlow = new EsimHelpFlow(new EsimHelpFlowContract$InputData(((EsimSubscriptionFlowContract$Step.Help) step).f100891a));
            final int i6 = 2;
            Function1 block4 = new Function1(this) { // from class: sgj.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.subscription.b f262661b;

                {
                    this.f262661b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i6) {
                        case 0:
                            u it8 = (u) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f262661b.I2();
                            return Unit.f186387a;
                        case 1:
                            d0 output = (d0) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof a0;
                            com.revolut.retail.feature.esim.impl.ui.flows.subscription.b bVar = this.f262661b;
                            if (z) {
                                a0 a0Var = (a0) output;
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b), true, null, false);
                            } else if (output instanceof c0) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Subscription(((c0) output).f323549a), true, null, false);
                            } else if (output instanceof x) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                            } else if (output instanceof b0) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                            } else if (output instanceof v) {
                                v vVar = (v) output;
                                bVar.E2(new EsimSubscriptionFlowContract$Step.ChangeDataPlan(vVar.f323593a, vVar.f323594b, vVar.f323595c), true, null, false);
                            } else if (Intrinsics.f(output, y.f323598a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                l.j2(bVar, bVar.e1(new sd6.b(new EsimInstructionsControllerDescriptor$InputData("INSTALLATION", null))), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, null, 2);
                            } else if (output instanceof w) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.ConnectivityTroubleshooting(((w) output).f323596a), true, null, false);
                            } else {
                                if (!(output instanceof z)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Subscription(((z) output).f323599a, m.MOBILE_PLAN), false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            wfj.c result = (wfj.c) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!(result instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f262661b.E2(new EsimSubscriptionFlowContract$Step.EsimRefund(null), true, null, false);
                            return Unit.f186387a;
                        case 3:
                            com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof a.C0610a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f262661b.r2();
                            return Unit.f186387a;
                        default:
                            d result2 = (d) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c4 c4Var = ((pgj.c) result2).f235975a;
                            com.revolut.retail.feature.esim.impl.ui.flows.subscription.b bVar2 = this.f262661b;
                            bVar2.r2();
                            bVar2.E2(new EsimSubscriptionFlowContract$Step.EsimHome(c4Var), false, null, false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block4, "block");
            esimHelpFlow.H = block4;
            return esimHelpFlow;
        }
        if (step instanceof EsimSubscriptionFlowContract$Step.ConnectivityTroubleshooting) {
            return new EsimConnectivityTroubleshootingFlow(new EsimConnectivityTroubleshootingFlowContract$InputData(((EsimSubscriptionFlowContract$Step.ConnectivityTroubleshooting) step).f100888a));
        }
        if (step instanceof EsimSubscriptionFlowContract$Step.EsimHome) {
            r2();
            return new EsimHomeFlow(new EsimHomeFlowContract$InputData(new EsimHomeFlowContract$InputData.InitialDestination.Subscriptions((EsimHomeFlowContract$InputData.InitialDestination.PreferredView) null, c4.EXPIRED, 5)));
        }
        if (step instanceof EsimSubscriptionFlowContract$Step.EsimRefund) {
            String str2 = ((EsimSubscriptionFlowContract$Step.EsimRefund) step).f100890a;
            EsimRefundFlow esimRefundFlow = new EsimRefundFlow(new EsimRefundFlowContract$InputData(str2 != null ? new EsimRefundFlowContract$EsimSubscriptionsToRefund.Subscription(str2) : EsimRefundFlowContract$EsimSubscriptionsToRefund.AllAvailable.f100866a));
            final int i21 = 4;
            Function1 block5 = new Function1(this) { // from class: sgj.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.subscription.b f262661b;

                {
                    this.f262661b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i21) {
                        case 0:
                            u it8 = (u) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f262661b.I2();
                            return Unit.f186387a;
                        case 1:
                            d0 output = (d0) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof a0;
                            com.revolut.retail.feature.esim.impl.ui.flows.subscription.b bVar = this.f262661b;
                            if (z) {
                                a0 a0Var = (a0) output;
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b), true, null, false);
                            } else if (output instanceof c0) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Subscription(((c0) output).f323549a), true, null, false);
                            } else if (output instanceof x) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                            } else if (output instanceof b0) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                            } else if (output instanceof v) {
                                v vVar = (v) output;
                                bVar.E2(new EsimSubscriptionFlowContract$Step.ChangeDataPlan(vVar.f323593a, vVar.f323594b, vVar.f323595c), true, null, false);
                            } else if (Intrinsics.f(output, y.f323598a)) {
                                EsimInstructionType.INSTANCE.getClass();
                                l.j2(bVar, bVar.e1(new sd6.b(new EsimInstructionsControllerDescriptor$InputData("INSTALLATION", null))), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, null, 2);
                            } else if (output instanceof w) {
                                bVar.E2(new EsimSubscriptionFlowContract$Step.ConnectivityTroubleshooting(((w) output).f323596a), true, null, false);
                            } else {
                                if (!(output instanceof z)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar.E2(new EsimSubscriptionFlowContract$Step.Subscription(((z) output).f323599a, m.MOBILE_PLAN), false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            wfj.c result = (wfj.c) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!(result instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f262661b.E2(new EsimSubscriptionFlowContract$Step.EsimRefund(null), true, null, false);
                            return Unit.f186387a;
                        case 3:
                            com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof a.C0610a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f262661b.r2();
                            return Unit.f186387a;
                        default:
                            d result2 = (d) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c4 c4Var = ((pgj.c) result2).f235975a;
                            com.revolut.retail.feature.esim.impl.ui.flows.subscription.b bVar2 = this.f262661b;
                            bVar2.r2();
                            bVar2.E2(new EsimSubscriptionFlowContract$Step.EsimHome(c4Var), false, null, false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block5, "block");
            esimRefundFlow.H = block5;
            return esimRefundFlow;
        }
        if (!(step instanceof EsimSubscriptionFlowContract$Step.ChangeDataPlan)) {
            throw new NoWhenBranchMatchedException();
        }
        EsimSubscriptionFlowContract$Step.ChangeDataPlan changeDataPlan = (EsimSubscriptionFlowContract$Step.ChangeDataPlan) step;
        EsimGetPlanFlow esimGetPlanFlow2 = new EsimGetPlanFlow(new EsimGetPlanFlowContract$InputData.Purchase(null, null, new EsimGetPlanLaunchMode.DataPlanChange(changeDataPlan.f100883a, changeDataPlan.f100884b), changeDataPlan.f100885c, 3));
        final int i22 = 3;
        Function1 block6 = new Function1(this) { // from class: sgj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.flows.subscription.b f262661b;

            {
                this.f262661b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i22) {
                    case 0:
                        u it8 = (u) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        this.f262661b.I2();
                        return Unit.f186387a;
                    case 1:
                        d0 output = (d0) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean z = output instanceof a0;
                        com.revolut.retail.feature.esim.impl.ui.flows.subscription.b bVar = this.f262661b;
                        if (z) {
                            a0 a0Var = (a0) output;
                            bVar.E2(new EsimSubscriptionFlowContract$Step.Checkout(a0Var.f323545a, a0Var.f323546b), true, null, false);
                        } else if (output instanceof c0) {
                            bVar.E2(new EsimSubscriptionFlowContract$Step.Subscription(((c0) output).f323549a), true, null, false);
                        } else if (output instanceof x) {
                            bVar.E2(new EsimSubscriptionFlowContract$Step.Help(((x) output).f323597a), true, null, false);
                        } else if (output instanceof b0) {
                            bVar.E2(new EsimSubscriptionFlowContract$Step.EsimRefund(((b0) output).f323547a), true, null, false);
                        } else if (output instanceof v) {
                            v vVar = (v) output;
                            bVar.E2(new EsimSubscriptionFlowContract$Step.ChangeDataPlan(vVar.f323593a, vVar.f323594b, vVar.f323595c), true, null, false);
                        } else if (Intrinsics.f(output, y.f323598a)) {
                            EsimInstructionType.INSTANCE.getClass();
                            l.j2(bVar, bVar.e1(new sd6.b(new EsimInstructionsControllerDescriptor$InputData("INSTALLATION", null))), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, null, 2);
                        } else if (output instanceof w) {
                            bVar.E2(new EsimSubscriptionFlowContract$Step.ConnectivityTroubleshooting(((w) output).f323596a), true, null, false);
                        } else {
                            if (!(output instanceof z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar.E2(new EsimSubscriptionFlowContract$Step.Subscription(((z) output).f323599a, m.MOBILE_PLAN), false, TransitionAnimation.NONE.f98393a, false);
                        }
                        return Unit.f186387a;
                    case 2:
                        wfj.c result = (wfj.c) obj2;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (!(result instanceof wfj.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f262661b.E2(new EsimSubscriptionFlowContract$Step.EsimRefund(null), true, null, false);
                        return Unit.f186387a;
                    case 3:
                        com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output2 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj2;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        if (!(output2 instanceof a.C0610a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f262661b.r2();
                        return Unit.f186387a;
                    default:
                        d result2 = (d) obj2;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        if (!(result2 instanceof pgj.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c4 c4Var = ((pgj.c) result2).f235975a;
                        com.revolut.retail.feature.esim.impl.ui.flows.subscription.b bVar2 = this.f262661b;
                        bVar2.r2();
                        bVar2.E2(new EsimSubscriptionFlowContract$Step.EsimHome(c4Var), false, null, false);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block6, "block");
        esimGetPlanFlow2.H = block6;
        return esimGetPlanFlow2;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f100896x;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f100895w;
    }
}
