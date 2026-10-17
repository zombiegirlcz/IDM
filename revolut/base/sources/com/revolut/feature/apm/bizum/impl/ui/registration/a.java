package com.revolut.feature.apm.bizum.impl.ui.registration;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.apm.bizum.impl.ui.registration.BizumRegistrationFlowContract$Step;
import com.revolut.feature.apm.bizum.impl.ui.registration.confirmation.BizumRegistrationConfirmationScreen;
import com.revolut.feature.apm.bizum.impl.ui.registration.intro.BizumRegistrationIntroScreen;
import com.revolut.feature.apm.bizum.impl.ui.registration.terms_old.BizumRegistrationTermsOldScreen;
import com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ns1.b;
import ns1.e;
import til.m;
import til.r;
import wp5.v;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends g implements ws1.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final BizumRegistrationFlowContract$InputData f61586t;
    public final b u;
    public final m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final BizumRegistrationFlowContract$Step.Intro f61587w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final BizumRegistrationFlowContract$State f61588x;

    public a(BizumRegistrationFlowContract$InputData inputData, b errorHandlerExtension, m workflowFlowProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        this.f61586t = inputData;
        this.u = errorHandlerExtension;
        this.v = workflowFlowProvider;
        this.f61587w = BizumRegistrationFlowContract$Step.Intro.f61583a;
        this.f61588x = BizumRegistrationFlowContract$State.f61581a;
    }

    public final void O2(BizumRegistrationFlowContract$Step bizumRegistrationFlowContract$Step, boolean z) {
        E2(bizumRegistrationFlowContract$Step, false, z ? TransitionAnimation.SLIDE_END_TO_START.f98395a : TransitionAnimation.SLIDE_START_TO_END.f98396a, false);
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (((e) this.u).b3(throwable)) {
            return true;
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        BizumRegistrationFlowContract$Step step = (BizumRegistrationFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof BizumRegistrationFlowContract$Step.Intro) {
            BizumRegistrationIntroScreen bizumRegistrationIntroScreen = new BizumRegistrationIntroScreen();
            final int i = 2;
            Function1 function1 = new Function1(this) { // from class: ws1.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.apm.bizum.impl.ui.registration.a f299646b;

                {
                    this.f299646b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            ys1.e outputData = (ys1.e) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean zF = Intrinsics.f(outputData, ys1.b.f316384a);
                            com.revolut.feature.apm.bizum.impl.ui.registration.a aVar = this.f299646b;
                            if (zF) {
                                aVar.G2(d.f299644a);
                            } else if (Intrinsics.f(outputData, ys1.c.f316385a)) {
                                aVar.O2(BizumRegistrationFlowContract$Step.Terms.f61585a, false);
                            } else {
                                if (!Intrinsics.f(outputData, ys1.d.f316386a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.G2(c.f299643a);
                            }
                            return Unit.f186387a;
                        case 1:
                            r it8 = (r) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f299646b.I2();
                            return Unit.f186387a;
                        default:
                            ct1.d outputData2 = (ct1.d) obj2;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean zF2 = Intrinsics.f(outputData2, ct1.b.f108612a);
                            com.revolut.feature.apm.bizum.impl.ui.registration.a aVar2 = this.f299646b;
                            if (zF2) {
                                aVar2.O2(BizumRegistrationFlowContract$Step.Terms.f61585a, true);
                            } else {
                                if (!Intrinsics.f(outputData2, ct1.c.f108613a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.G2(b.f299642a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            bizumRegistrationIntroScreen.H = function1;
            return bizumRegistrationIntroScreen;
        }
        boolean z = step instanceof BizumRegistrationFlowContract$Step.Confirmation;
        BizumRegistrationFlowContract$InputData bizumRegistrationFlowContract$InputData = this.f61586t;
        if (z) {
            BizumRegistrationConfirmationScreen bizumRegistrationConfirmationScreen = new BizumRegistrationConfirmationScreen(bizumRegistrationFlowContract$InputData);
            final int i2 = 0;
            Function1 function12 = new Function1(this) { // from class: ws1.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.apm.bizum.impl.ui.registration.a f299646b;

                {
                    this.f299646b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            ys1.e outputData = (ys1.e) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean zF = Intrinsics.f(outputData, ys1.b.f316384a);
                            com.revolut.feature.apm.bizum.impl.ui.registration.a aVar = this.f299646b;
                            if (zF) {
                                aVar.G2(d.f299644a);
                            } else if (Intrinsics.f(outputData, ys1.c.f316385a)) {
                                aVar.O2(BizumRegistrationFlowContract$Step.Terms.f61585a, false);
                            } else {
                                if (!Intrinsics.f(outputData, ys1.d.f316386a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.G2(c.f299643a);
                            }
                            return Unit.f186387a;
                        case 1:
                            r it8 = (r) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f299646b.I2();
                            return Unit.f186387a;
                        default:
                            ct1.d outputData2 = (ct1.d) obj2;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean zF2 = Intrinsics.f(outputData2, ct1.b.f108612a);
                            com.revolut.feature.apm.bizum.impl.ui.registration.a aVar2 = this.f299646b;
                            if (zF2) {
                                aVar2.O2(BizumRegistrationFlowContract$Step.Terms.f61585a, true);
                            } else {
                                if (!Intrinsics.f(outputData2, ct1.c.f108613a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.G2(b.f299642a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function12, "<set-?>");
            bizumRegistrationConfirmationScreen.H = function12;
            return bizumRegistrationConfirmationScreen;
        }
        if (step instanceof BizumRegistrationFlowContract$Step.Remediation) {
            WorkflowFlow workflowFlowB = m.b(this.v, new WorkflowConfiguration.Workflow(((BizumRegistrationFlowContract$Step.Remediation) step).f61584a, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 126), new WorkflowFlowType.Regular(0), null, 56);
            final int i3 = 1;
            Function1 block = new Function1(this) { // from class: ws1.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.apm.bizum.impl.ui.registration.a f299646b;

                {
                    this.f299646b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            ys1.e outputData = (ys1.e) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean zF = Intrinsics.f(outputData, ys1.b.f316384a);
                            com.revolut.feature.apm.bizum.impl.ui.registration.a aVar = this.f299646b;
                            if (zF) {
                                aVar.G2(d.f299644a);
                            } else if (Intrinsics.f(outputData, ys1.c.f316385a)) {
                                aVar.O2(BizumRegistrationFlowContract$Step.Terms.f61585a, false);
                            } else {
                                if (!Intrinsics.f(outputData, ys1.d.f316386a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.G2(c.f299643a);
                            }
                            return Unit.f186387a;
                        case 1:
                            r it8 = (r) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f299646b.I2();
                            return Unit.f186387a;
                        default:
                            ct1.d outputData2 = (ct1.d) obj2;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean zF2 = Intrinsics.f(outputData2, ct1.b.f108612a);
                            com.revolut.feature.apm.bizum.impl.ui.registration.a aVar2 = this.f299646b;
                            if (zF2) {
                                aVar2.O2(BizumRegistrationFlowContract$Step.Terms.f61585a, true);
                            } else {
                                if (!Intrinsics.f(outputData2, ct1.c.f108613a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.G2(b.f299642a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            workflowFlowB.H = block;
            return workflowFlowB;
        }
        if (!(step instanceof BizumRegistrationFlowContract$Step.Terms)) {
            throw new NoWhenBranchMatchedException();
        }
        BizumRegistrationStatus.NotRegistered notRegistered = bizumRegistrationFlowContract$InputData.f61580a;
        Object remediation = notRegistered instanceof BizumRegistrationStatus.NotRegistered.Remediation ? new BizumRegistrationFlowContract$Step.Remediation(((BizumRegistrationStatus.NotRegistered.Remediation) notRegistered).f61917h) : BizumRegistrationFlowContract$Step.Confirmation.f61582a;
        BizumRegistrationTermsOldScreen bizumRegistrationTermsOldScreen = new BizumRegistrationTermsOldScreen(bizumRegistrationFlowContract$InputData);
        v vVar = new v(this, remediation, 13);
        Intrinsics.checkNotNullParameter(vVar, "<set-?>");
        bizumRegistrationTermsOldScreen.H = vVar;
        return bizumRegistrationTermsOldScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f61588x;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f61587w;
    }
}
