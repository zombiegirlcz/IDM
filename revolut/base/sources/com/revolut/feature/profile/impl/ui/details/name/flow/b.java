package com.revolut.feature.profile.impl.ui.details.name.flow;

import bv4.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.profile.impl.ui.details.name.flow.ChangeNameFlowContract$ChangeNameMode;
import com.revolut.feature.profile.impl.ui.details.name.flow.ChangeNameFlowContract$Step;
import com.revolut.feature.profile.impl.ui.details.name.screen.ChangeNameScreen;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import dki.g;
import dna.c;
import dna.d;
import grl.k9;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import til.m;
import til.n;
import til.o;
import til.p;
import til.q;
import til.r;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends g implements cna.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jvh.a f81406t;
    public final m u;
    public final ChangeNameFlowContract$Step.Consent v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final EmptyFlowState f81407w;

    public b(ChangeNameFlowContract$InputData inputData, jvh.a workflowInteractor, m workflowFlowProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        this.f81406t = workflowInteractor;
        this.u = workflowFlowProvider;
        if (!(inputData.f81403a instanceof ChangeNameFlowContract$ChangeNameMode.DocumentSubmission)) {
            throw new NoWhenBranchMatchedException();
        }
        this.v = ChangeNameFlowContract$Step.Consent.f81404a;
        this.f81407w = EmptyFlowState.f98428a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        ChangeNameFlowContract$Step step = (ChangeNameFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof ChangeNameFlowContract$Step.Consent) {
            ChangeNameScreen changeNameScreen = new ChangeNameScreen();
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: cna.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.profile.impl.ui.details.name.flow.b f25373b;

                {
                    this.f25373b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i2 = i;
                    com.revolut.feature.profile.impl.ui.details.name.flow.b bVar = this.f25373b;
                    Continuation continuation = null;
                    switch (i2) {
                        case 0:
                            d nameChangeResult = (d) obj2;
                            Intrinsics.checkNotNullParameter(nameChangeResult, "nameChangeResult");
                            if (Intrinsics.f(nameChangeResult, dna.b.f116252a)) {
                                bVar.l2(new h(bVar, continuation, 26), new yi5.b(26));
                            } else {
                                if (!Intrinsics.f(nameChangeResult, c.f116253a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar.I2();
                            }
                            return Unit.f186387a;
                        default:
                            r result = (r) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (Intrinsics.f(result, n.f271581a) || (result instanceof o) || Intrinsics.f(result, q.f271586a)) {
                                bVar.I2();
                            } else {
                                if (!(result instanceof p)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                p pVar = (p) result;
                                IllegalStateException illegalStateException = new IllegalStateException(j6.a.s("RedirectStep(name=", pVar.f271584a, ", workflowStepId=", pVar.f271585b, ") can't be handled in change name flow"));
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            changeNameScreen.H = function1;
            return changeNameScreen;
        }
        if (!(step instanceof ChangeNameFlowContract$Step.Workflow)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((ChangeNameFlowContract$Step.Workflow) step).f81405a;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = k9.Profile;
        companion.getClass();
        WorkflowFlow workflowFlowB = m.b(this.u, new WorkflowConfiguration.Workflow(str, (wi0.b) null, (NaviCommand) null, (String) null, AnalyticsProduct.Companion.b(k9Var), (WorkflowConfiguration.Extras) null, LDSFile.EF_DG14_TAG), new WorkflowFlowType.Regular(0), null, 60);
        final int i2 = 1;
        Function1 block = new Function1(this) { // from class: cna.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.profile.impl.ui.details.name.flow.b f25373b;

            {
                this.f25373b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                com.revolut.feature.profile.impl.ui.details.name.flow.b bVar = this.f25373b;
                Continuation continuation = null;
                switch (i22) {
                    case 0:
                        d nameChangeResult = (d) obj2;
                        Intrinsics.checkNotNullParameter(nameChangeResult, "nameChangeResult");
                        if (Intrinsics.f(nameChangeResult, dna.b.f116252a)) {
                            bVar.l2(new h(bVar, continuation, 26), new yi5.b(26));
                        } else {
                            if (!Intrinsics.f(nameChangeResult, c.f116253a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar.I2();
                        }
                        return Unit.f186387a;
                    default:
                        r result = (r) obj2;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (Intrinsics.f(result, n.f271581a) || (result instanceof o) || Intrinsics.f(result, q.f271586a)) {
                            bVar.I2();
                        } else {
                            if (!(result instanceof p)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            p pVar = (p) result;
                            IllegalStateException illegalStateException = new IllegalStateException(j6.a.s("RedirectStep(name=", pVar.f271584a, ", workflowStepId=", pVar.f271585b, ") can't be handled in change name flow"));
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block, "block");
        workflowFlowB.H = block;
        return workflowFlowB;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f81407w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
