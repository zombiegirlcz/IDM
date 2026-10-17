package com.revolut.feature.workflow.engine.onboarding.impl.workflow;

import android.os.Parcelable;
import atb.b;
import bn4.z;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.feedback.api.di.FeedbackApi$FeedbackToggles$WorkflowStepNpsRedesign;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.workflow.engine.R$string;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation;
import com.revolut.shared.feature.workflow.engine.api.models.eligibility.exceptions.UnrecognisedContractException;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowState;
import com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import grl.k9;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s;
import kvh.g;
import nii.j0;
import nii.u1;
import nii.y0;
import nuh.l;
import oki.h;
import om4.d0;
import org.jetbrains.annotations.NotNull;
import prl.k;
import pth.e;
import pth.f;
import pth.m;
import pth.n;
import pth.x;
import pth.y;
import qki.d;
import rth.j;
import rth.o;
import skd.i;
import skm.a2;
import til.p;
import vkm.j2;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements f {

    @NotNull
    public static final n Companion = new n();
    public final kvh.h A;
    public final b B;
    public final pvh.b C;
    public final i D;
    public final d0 E;
    public final gte.a F;
    public final WorkflowFlowContract$InputData G;
    public a2 H;
    public final com.revolut.kompot.navigable.vc.modal.a I;
    public final d J;
    public final yki.i K;
    public final jvh.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f96492p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f96493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final avh.i f96494r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f96495s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final til.a f96496t;
    public final l u;
    public final til.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final hvh.a f96497w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ep6.n f96498x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final qd0.b f96499y;
    public final til.h z;

    public a(jvh.a workflowInteractor, j workflowStepMapper, o eligibilityStepToFlowMapper, avh.i workflowStepToFlowMapper, e configurationProvider, til.a externalDestinationsFactory, l rfiFlowProvider, til.d flowsProvider, hvh.a eventBus, ep6.n feedbackExtension, qd0.b languageProvider, til.h finishDestinationsExtension, kvh.h serverErrorHelper, b workflowFeatureInteractor, pvh.b workflowSsoFlowProvider, i slotManagerInteractor, d0 mainApplicationSlotContextProvider, gte.a featureToggleInteractor, WorkflowFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(workflowStepMapper, "workflowStepMapper");
        Intrinsics.checkNotNullParameter(eligibilityStepToFlowMapper, "eligibilityStepToFlowMapper");
        Intrinsics.checkNotNullParameter(workflowStepToFlowMapper, "workflowStepToFlowMapper");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(externalDestinationsFactory, "externalDestinationsFactory");
        Intrinsics.checkNotNullParameter(rfiFlowProvider, "rfiFlowProvider");
        Intrinsics.checkNotNullParameter(flowsProvider, "flowsProvider");
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        Intrinsics.checkNotNullParameter(feedbackExtension, "feedbackExtension");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(finishDestinationsExtension, "finishDestinationsExtension");
        Intrinsics.checkNotNullParameter(serverErrorHelper, "serverErrorHelper");
        Intrinsics.checkNotNullParameter(workflowFeatureInteractor, "workflowFeatureInteractor");
        Intrinsics.checkNotNullParameter(workflowSsoFlowProvider, "workflowSsoFlowProvider");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(mainApplicationSlotContextProvider, "mainApplicationSlotContextProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = workflowInteractor;
        this.f96492p = workflowStepMapper;
        this.f96493q = eligibilityStepToFlowMapper;
        this.f96494r = workflowStepToFlowMapper;
        this.f96495s = configurationProvider;
        this.f96496t = externalDestinationsFactory;
        this.u = rfiFlowProvider;
        this.v = flowsProvider;
        this.f96497w = eventBus;
        this.f96498x = feedbackExtension;
        this.f96499y = languageProvider;
        this.z = finishDestinationsExtension;
        this.A = serverErrorHelper;
        this.B = workflowFeatureInteractor;
        this.C = workflowSsoFlowProvider;
        this.D = slotManagerInteractor;
        this.E = mainApplicationSlotContextProvider;
        this.F = featureToggleInteractor;
        this.G = inputData;
        final int i = 0;
        this.I = new com.revolut.kompot.navigable.vc.modal.a(this, new Function2(this) { // from class: pth.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.workflow.engine.onboarding.impl.workflow.a f239698b;

            {
                this.f239698b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21) {
                /*
                    Method dump skipped, instruction units count: 988
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: pth.k.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        });
        WorkflowFlowContract$Workflow workflowFlowContract$Workflow = new WorkflowFlowContract$Workflow(f0.f322471a, WorkflowState.NOT_DEFINED);
        h0 h0Var = h0.f322473a;
        String d = inputData.f96479b.getD();
        String languageTag = ((s80.b) languageProvider).b().toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "toLanguageTag(...)");
        this.J = hx7.e.b(this, new WorkflowFlowContract$State(workflowFlowContract$Workflow, h0Var, false, h0Var, h0Var, d, languageTag));
        final int i2 = 1;
        this.K = d8l.d.a(this, new Function2(this) { // from class: pth.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.workflow.engine.onboarding.impl.workflow.a f239698b;

            {
                this.f239698b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21) {
                /*
                    Method dump skipped, instruction units count: 988
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: pth.k.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.workflow.engine.onboarding.impl.workflow.a r7, java.util.Map r8, java.lang.String r9, com.revolut.analytics.tracking.v3.AnalyticsProduct r10, gim.c r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof pth.o
            if (r0 == 0) goto L14
            r0 = r11
            pth.o r0 = (pth.o) r0
            int r1 = r0.f239706y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f239706y = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            pth.o r0 = new pth.o
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f239704w
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f239706y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            yhm.o.b(r11)
            return r11
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            com.revolut.analytics.tracking.v3.AnalyticsProduct r8 = r6.v
            r10 = r8
            com.revolut.analytics.tracking.v3.AnalyticsProduct r10 = (com.revolut.analytics.tracking.v3.AnalyticsProduct) r10
            java.lang.String r9 = r6.u
            yhm.o.b(r11)
        L3e:
            r3 = r9
            r4 = r10
            goto L56
        L41:
            yhm.o.b(r11)
            jvh.a r11 = r7.o
            r6.u = r9
            r1 = r10
            com.revolut.analytics.tracking.v3.AnalyticsProduct r1 = (com.revolut.analytics.tracking.v3.AnalyticsProduct) r1
            r6.v = r1
            r6.f239706y = r3
            java.lang.Object r11 = r11.b(r8, r6)
            if (r11 != r0) goto L3e
            goto L68
        L56:
            java.lang.String r11 = (java.lang.String) r11
            r8 = 0
            r6.u = r8
            r6.v = r8
            r6.f239706y = r2
            r5 = 0
            r1 = r7
            r2 = r11
            java.lang.Object r7 = r1.R2(r2, r3, r4, r5, r6)
            if (r7 != r0) goto L69
        L68:
            return r0
        L69:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.workflow.engine.onboarding.impl.workflow.a.I2(com.revolut.feature.workflow.engine.onboarding.impl.workflow.a, java.util.Map, java.lang.String, com.revolut.analytics.tracking.v3.AnalyticsProduct, gim.c):java.lang.Object");
    }

    public static final Object J2(a aVar) {
        yki.i iVar = aVar.K;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = aVar.I;
        WorkflowState workflowState = ((WorkflowFlowContract$State) ((j2) aVar.J.f22677a).getValue()).f96484a.f96489b;
        WorkflowState workflowState2 = WorkflowState.COMPLETED;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (workflowState == workflowState2) {
            h.v2(aVar2, WorkflowFlowContract$ModalStep.WorkflowCompleted.f96483a, bottom_dialog);
            return Unit.f186387a;
        }
        int i = 4;
        Continuation continuation = null;
        if (!aVar.f96495s.f239690a.f96480c) {
            return aVar.l2(new k(aVar, continuation, continuation, i), new yi5.b(26));
        }
        if (iVar.d() == null) {
            h.v2(aVar2, WorkflowFlowContract$ModalStep.AlreadyInReview.f96481a, bottom_dialog);
            return Unit.f186387a;
        }
        WorkflowFlowStep workflowFlowStep = (WorkflowFlowStep) iVar.d();
        if (workflowFlowStep != null && workflowFlowStep.getE()) {
            aVar.N2();
            return Unit.f186387a;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.product_eligibility_status_reviewing_information_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.product_eligibility_status_reviewing_information_description, null, null, 14);
        k9 k9Var = k9.Eligibility;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        yji.l.a1(aVar, aVar.X1(new y0("ELIGIBILITY", new j0((Clause) textLocalisedClause, (Clause) textLocalisedClause2, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4028), false, 4)), null, null, new pnb.b(aVar, continuation, 11), 3);
        return Unit.f186387a;
    }

    public static final Object K2(a aVar, Function1 function1, gim.i iVar) {
        if (aVar.K.d() == null) {
            if (aVar.G.f96478a instanceof WorkflowFlowType.Onboarding) {
                Object objInvoke = function1.invoke(iVar);
                return objInvoke == fim.a.COROUTINE_SUSPENDED ? objInvoke : Unit.f186387a;
            }
            aVar.C2(new til.o(3));
        }
        return Unit.f186387a;
    }

    public static boolean L2(Throwable th10) {
        if ((th10 != null ? th10.getCause() : null) == null) {
            return false;
        }
        if (th10.getCause() instanceof UnrecognisedContractException) {
            return true;
        }
        return L2(th10.getCause());
    }

    public static void Q2(a aVar, Set set, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z3 = z;
        a2 a2Var = aVar.H;
        if (a2Var != null) {
            a2Var.f(null);
        }
        aVar.H = aVar.l2(new z(aVar, false, set, z3, null, 2), new pth.i(aVar, 13));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    @Override // yji.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I1() {
        /*
            r11 = this;
            qki.d r7 = r11.J
            java.lang.Object r1 = r7.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r2 = r7.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r1 = r1.getValue()
            com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$State r1 = (com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$State) r1
            java.lang.String r1 = r1.f96487g
            qd0.b r3 = r11.f96499y
            s80.b r3 = (s80.b) r3
            java.util.Locale r3 = r3.b()
            java.lang.String r3 = r3.toLanguageTag()
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            yki.i r1 = r11.K
            com.revolut.kompot.navigable.flow.FlowStep r3 = r1.d()
            com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep r3 = (com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep) r3
            r9 = 0
            r4 = 0
            if (r3 != 0) goto L30
            r6 = r2
            goto L71
        L30:
            boolean r5 = r3 instanceof com.revolut.feature.workflow.engine.onboarding.impl.workflow.InternalStep.SdkFlow
            r6 = r2
            r2 = 1
            if (r5 != 0) goto L3d
            boolean r3 = r3 instanceof com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            if (r3 == 0) goto L3b
            goto L3d
        L3b:
            r3 = r2
            goto L3e
        L3d:
            r3 = r4
        L3e:
            if (r8 != 0) goto L71
            if (r3 == 0) goto L71
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            r1.a()
            java.lang.Object r1 = r6.getValue()
            com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$State r1 = (com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$State) r1
            java.util.Set r3 = r1.f96485b
            skm.a2 r1 = r11.H
            if (r1 == 0) goto L59
            r1.f(r9)
        L59:
            pth.i r10 = new pth.i
            r1 = 13
            r10.<init>(r11, r1)
            bn4.z r0 = new bn4.z
            r5 = 0
            r6 = 2
            r4 = r2
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r0
            skm.a2 r1 = r11.l2(r1, r10)
            r11.H = r1
            goto L83
        L71:
            com.revolut.kompot.navigable.flow.FlowStep r1 = r1.d()
            if (r1 != 0) goto L83
            java.lang.Object r1 = r6.getValue()
            com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$State r1 = (com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$State) r1
            java.util.Set r1 = r1.f96485b
            r2 = 6
            Q2(r11, r1, r4, r2)
        L83:
            if (r8 != 0) goto L8f
            pth.i r1 = new pth.i
            r2 = 12
            r1.<init>(r11, r2)
            r11.H2(r7, r1)
        L8f:
            til.h r1 = r11.z
            a83.j0 r1 = r1.b3()
            pth.u r4 = new pth.u
            r4.<init>(r11, r9)
            r5 = 3
            r2 = 0
            r3 = 0
            r0 = r11
            yji.l.a1(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.workflow.engine.onboarding.impl.workflow.a.I1():void");
    }

    @Override // yki.j
    public final void M0() {
    }

    public final void M2(y yVar) {
        l2(new pe2.l(yVar, null, 26), new m(this, yVar, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N2() {
        yki.i iVar = this.K;
        WorkflowFlowStep workflowFlowStep = (WorkflowFlowStep) iVar.d();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (workflowFlowStep == null || !workflowFlowStep.getD()) {
            l2(new k((Object) this, (Object) (objArr2 == true ? 1 : 0), (Continuation) (objArr == true ? 1 : 0), 4), new yi5.b(26));
            return;
        }
        if (((jte.d) this.F).c(FeedbackApi$FeedbackToggles$WorkflowStepNpsRedesign.f73123c)) {
            WorkflowFlowStep workflowFlowStep2 = (WorkflowFlowStep) iVar.d();
            String f105812b = workflowFlowStep2 != null ? workflowFlowStep2.getF105812b() : null;
            if (f105812b == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            h.v2(this.I, new WorkflowFlowContract$ModalStep.OneClickFeedback(f105812b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        WorkflowFlowStep workflowFlowStep3 = (WorkflowFlowStep) iVar.d();
        String f105812b2 = workflowFlowStep3 != null ? workflowFlowStep3.getF105812b() : null;
        if (f105812b2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        yo6.d dVar = yo6.d.WORKFLOW_STEP;
        ep6.e eVar = ep6.n.Companion;
        yji.l.a1(this, this.f96498x.I1(f105812b2, dVar, null), null, null, new pqc.k(this, objArr3 == true ? 1 : 0, 14), 3);
    }

    public final void O2(Throwable th10, Function0 function0) {
        kvh.h hVar = this.A;
        if (hVar.a(th10)) {
            C2(new til.o(1));
            return;
        }
        if ((th10 instanceof UnrecognisedContractException) || L2(th10)) {
            S2("Handled an unexpected workflows response", th10);
            Y2(new plc.i(1, function0, s.class, "suspendConversion0", "handleLoadStepsError$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 21));
            return;
        }
        if (th10 instanceof HandledNetworkException) {
            return;
        }
        TextLocalisedClause textLocalisedClauseB = hVar.b(th10);
        if (textLocalisedClauseB != null) {
            X2(textLocalisedClauseB, th10, new plc.i(1, function0, s.class, "suspendConversion1", "handleLoadStepsError$suspendConversion1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 22));
            return;
        }
        Y2(new plc.i(1, function0, s.class, "suspendConversion2", "handleLoadStepsError$suspendConversion2(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 23));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
    
        if (r2 == r4) goto L51;
     */
    /* JADX WARN: Path cross not found for [B:10:0x002c, B:20:0x0091], limit reached: 57 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0109 -> B:37:0x010f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0185 -> B:53:0x018a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable P2(java.lang.String r20, java.util.Set r21, java.lang.String r22, com.revolut.analytics.tracking.v3.AnalyticsProduct r23, gim.c r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.workflow.engine.onboarding.impl.workflow.a.P2(java.lang.String, java.util.Set, java.lang.String, com.revolut.analytics.tracking.v3.AnalyticsProduct, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c1  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12, types: [com.revolut.analytics.tracking.v3.AnalyticsProduct, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x02af -> B:95:0x02bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R2(java.lang.String r31, java.lang.String r32, com.revolut.analytics.tracking.v3.AnalyticsProduct r33, boolean r34, gim.c r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.workflow.engine.onboarding.impl.workflow.a.R2(java.lang.String, java.lang.String, com.revolut.analytics.tracking.v3.AnalyticsProduct, boolean, gim.c):java.lang.Object");
    }

    public final void S2(String str, Throwable th10) {
        WorkflowConfiguration workflowConfiguration = this.G.f96479b;
        String str2 = workflowConfiguration instanceof WorkflowConfiguration.Workflow ? ((WorkflowConfiguration.Workflow) workflowConfiguration).f78244a : null;
        g gVar = kvh.h.Companion;
        WorkflowFlowStep workflowFlowStep = (WorkflowFlowStep) this.K.d();
        String f105812b = workflowFlowStep != null ? workflowFlowStep.getF105812b() : null;
        gVar.getClass();
        g.b(str, str2, f105812b, th10);
    }

    public final void T2(WorkflowFlowStep workflowFlowStep, boolean z) {
        if (workflowFlowStep instanceof SharedStep) {
            this.v.Z2((SharedStep) workflowFlowStep);
        }
        if (workflowFlowStep instanceof til.b) {
            til.b bVar = (til.b) workflowFlowStep;
            C2(new p(bVar.getE(), bVar.getF105757c()));
            return;
        }
        boolean z3 = false;
        yki.i iVar = this.K;
        if (!z) {
            WorkflowFlowStep workflowFlowStep2 = (WorkflowFlowStep) iVar.d();
            if (!(workflowFlowStep2 instanceof SharedStep.Form ? ((WorkflowFlowContract$State) ((j2) this.J.f22677a).getValue()).e.contains(((SharedStep.Form) workflowFlowStep2).f105713c) : false) && workflowFlowStep.getF105811a().f105563a && iVar.d() != null) {
                z3 = true;
            }
        }
        h.t2(this, iVar, workflowFlowStep, z3, null, false, 12);
    }

    public final void U2() {
        WorkflowStepNavigation f105811a;
        d dVar = this.J;
        List list = ((WorkflowFlowContract$State) ((j2) dVar.f22677a).getValue()).f96484a.f96488a;
        WorkflowFlowStep workflowFlowStep = (WorkflowFlowStep) this.K.d();
        boolean z = workflowFlowStep == null || !list.contains(workflowFlowStep);
        int iG0 = zhm.d0.g0(workflowFlowStep, list) + 1;
        if ((workflowFlowStep == null || (f105811a = workflowFlowStep.getF105811a()) == null || !Intrinsics.f(f105811a.f105565c, "COMPLETED")) && !z && iG0 < list.size()) {
            T2((WorkflowFlowStep) list.get(iG0), false);
        } else {
            Q2(this, ((WorkflowFlowContract$State) ((j2) dVar.f22677a).getValue()).f96485b, false, 6);
        }
    }

    public final void V2(od9.i stepResult) {
        Intrinsics.checkNotNullParameter(stepResult, "stepResult");
        boolean z = stepResult instanceof od9.h;
        d dVar = this.J;
        yki.i iVar = this.K;
        if (z) {
            od9.h stepResult2 = (od9.h) stepResult;
            Intrinsics.checkNotNullParameter(stepResult2, "stepResult");
            WorkflowFlowStep workflowFlowStep = (WorkflowFlowStep) iVar.d();
            if (workflowFlowStep instanceof SharedStep.Form) {
                H2(dVar, new pj3.b(stepResult2, (SharedStep.Form) workflowFlowStep, 28));
            }
            U2();
            return;
        }
        if (stepResult instanceof od9.f) {
            WorkflowFlowStep workflowFlowStep2 = (WorkflowFlowStep) iVar.d();
            WorkflowStepNavigation f105811a = workflowFlowStep2 != null ? workflowFlowStep2.getF105811a() : null;
            if (f105811a == null || !f105811a.f105563a) {
                C2(new til.o((f105811a != null ? f105811a.d : null) != null, ((od9.f) stepResult).f224334a));
                return;
            } else {
                B2();
                return;
            }
        }
        if (!(stepResult instanceof od9.g)) {
            throw new NoWhenBranchMatchedException();
        }
        aim.o oVar = new aim.o();
        oVar.addAll(((WorkflowFlowContract$State) ((j2) dVar.f22677a).getValue()).f96485b);
        WorkflowFlowStep step = (WorkflowFlowStep) iVar.d();
        if (step != null) {
            this.f96492p.getClass();
            Intrinsics.checkNotNullParameter(step, "step");
            if (step instanceof SharedStep.Kyc) {
                obj = ril.b.DOCUMENTS;
            } else if (step instanceof SharedStep.TaxResidency) {
                obj = ril.b.TAX_RESIDENCY;
            }
            if (obj != null) {
                oVar.add(obj);
            }
        }
        H2(dVar, new imk.e(25, zhm.y0.a(oVar)));
        U2();
    }

    public final void W2() {
        Q2(this, ((WorkflowFlowContract$State) ((j2) this.J.f22677a).getValue()).f96485b, false, 6);
    }

    public final void X2(TextLocalisedClause textLocalisedClause, Throwable th10, Function1 function1) {
        yji.l.a1(this, X1(new y0("ERROR_DIALOG_ID", new nii.z(textLocalisedClause, null, new TextLocalisedClause(R$string.common_action_try_again, null, null, 14), null, null, null, true, null, null, null, null, new nii.y(2, com.google.android.gms.internal.mlkit_vision_face.a.o(o0.f186429a.b(th10.getClass()).m(), ": ", th10.getMessage()), null), null, 24310), false, 4)), null, null, new x(this, function1, (Continuation) null), 3);
    }

    public final void Y2(Function1 function1) {
        yji.l.a1(this, X1(new y0("UPDATE_APP_DIALOG_ID", new nii.z(new TextLocalisedClause(R$string.product_eligibility_status_error_or_app_update_title, null, null, 14), new TextLocalisedClause(R$string.product_eligibility_status_error_or_app_update_description, null, null, 14), new TextLocalisedClause(R$string.common_action_try_again, null, null, 14), new TextLocalisedClause(R$string.product_eligibility_status_app_update_button, null, null, 14), null, null, true, null, null, null, null, null, null, 32468), false, 4)), null, null, new x(function1, this, (Continuation) null), 3);
    }

    @Override // qki.e
    public final d getState() {
        return this.J;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.K;
    }
}
