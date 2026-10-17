package rth;

import com.revolut.feature.workflow.engine.onboarding.impl.workflow.InternalStep;
import com.revolut.shared.feature.workflow.engine.api.models.DataPoint;
import com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import com.revolut.shared.feature.workflow.engine.api.models.eligibility.exceptions.UnrecognisedContractException;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration;
import com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pth.e f257253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ra0.h f257254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final atb.d f257255c;

    public j(pth.e configurationProvider, ra0.h backendFlowRepository, atb.d workflowUserInteractor) {
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(backendFlowRepository, "backendFlowRepository");
        Intrinsics.checkNotNullParameter(workflowUserInteractor, "workflowUserInteractor");
        this.f257253a = configurationProvider;
        this.f257254b = backendFlowRepository;
        this.f257255c = workflowUserInteractor;
    }

    public static boolean a(EligibilityStep eligibilityStep, String str) {
        List f105420h = eligibilityStep.getF105420h();
        if ((f105420h instanceof Collection) && f105420h.isEmpty()) {
            return false;
        }
        Iterator it8 = f105420h.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(((DataPoint) it8.next()).f105376b, str)) {
                return true;
            }
        }
        return false;
    }

    public static SharedStep.CreditOnboardingPluginStep b(EligibilityStep eligibilityStep) {
        Intrinsics.checkNotNullParameter(eligibilityStep, "eligibilityStep");
        EligibilityStep.Workflow workflow = eligibilityStep instanceof EligibilityStep.Workflow ? (EligibilityStep.Workflow) eligibilityStep : null;
        k(workflow, "ONBOARDING_STEP step is supported only for workflows endpoint");
        return new SharedStep.CreditOnboardingPluginStep(workflow.f105418c, null, workflow.f105416a, eligibilityStep.getF(), false, eligibilityStep.getD());
    }

    public static InternalStep.Polling e(EligibilityStep eligibilityStep, String str) {
        Intrinsics.checkNotNullParameter(eligibilityStep, "eligibilityStep");
        k(str, "LOADING_STEP step is supported only for workflows endpoint");
        EligibilityStep.Workflow workflow = eligibilityStep instanceof EligibilityStep.Workflow ? (EligibilityStep.Workflow) eligibilityStep : null;
        k(workflow, "LOADING_STEP step is supported only for workflows endpoint");
        WorkflowStepConfiguration workflowStepConfiguration = workflow.f105417b;
        WorkflowScreenConfiguration workflowScreenConfiguration = workflowStepConfiguration != null ? workflowStepConfiguration.f105508g : null;
        k(workflowScreenConfiguration, "screenConfiguration should be present for LOADING_STEP step");
        Integer num = workflowStepConfiguration != null ? workflowStepConfiguration.f105513n : null;
        k(num, "pollingInterval should be present for LOADING_STEP step");
        return new InternalStep.Polling(workflow.f105418c, workflow.f105416a, workflow.f, str, workflowScreenConfiguration, num.intValue(), workflow.f105419g);
    }

    public static SharedStep.NavigationHub f(EligibilityStep eligibilityStep) {
        Intrinsics.checkNotNullParameter(eligibilityStep, "eligibilityStep");
        EligibilityStep.Workflow workflow = eligibilityStep instanceof EligibilityStep.Workflow ? (EligibilityStep.Workflow) eligibilityStep : null;
        k(workflow, "NAVIGATION_HUB step supported only in Workflows");
        return new SharedStep.NavigationHub(workflow.f105418c, workflow.f105416a, eligibilityStep.getF(), eligibilityStep.getF105419g());
    }

    public static SharedStep.OnboardingStep g(EligibilityStep eligibilityStep) {
        Intrinsics.checkNotNullParameter(eligibilityStep, "eligibilityStep");
        EligibilityStep.Workflow workflow = eligibilityStep instanceof EligibilityStep.Workflow ? (EligibilityStep.Workflow) eligibilityStep : null;
        k(workflow, "ONBOARDING_STEP step is supported only for workflows endpoint");
        WorkflowStepConfiguration workflowStepConfiguration = workflow.f105417b;
        String str = workflowStepConfiguration != null ? workflowStepConfiguration.f105510j : null;
        k(str, "ONBOARDING_STEP step requires name as configuration parameter");
        return new SharedStep.OnboardingStep(workflow.f105418c, null, workflow.f105416a, str, eligibilityStep.getF(), eligibilityStep.getF105419g());
    }

    public static void k(Object obj2, String str) {
        if (obj2 == null) {
            throw new UnrecognisedContractException(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep r27, java.lang.String r28, gim.c r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rth.j.c(com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep r30, com.revolut.analytics.tracking.v3.AnalyticsProduct r31, java.lang.String r32, com.revolut.analytics.tracking.v3.AnalyticsContext r33, gim.c r34) throws com.revolut.feature.workflow.engine.shared.data.WorkflowFormException {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rth.j.d(com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep, com.revolut.analytics.tracking.v3.AnalyticsProduct, java.lang.String, com.revolut.analytics.tracking.v3.AnalyticsContext, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rth.j.h(com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep r22, java.lang.String r23, com.revolut.analytics.tracking.v3.AnalyticsProduct r24, java.lang.String r25, gim.c r26) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rth.j.i(com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep, java.lang.String, com.revolut.analytics.tracking.v3.AnalyticsProduct, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof rth.g
            if (r0 == 0) goto L13
            r0 = r8
            rth.g r0 = (rth.g) r0
            int r1 = r0.f257246y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257246y = r1
            goto L18
        L13:
            rth.g r0 = new rth.g
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f257244w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f257246y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r7 = r0.v
            com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep r0 = r0.u
            yhm.o.b(r8)
            r2 = r7
            r7 = r0
            goto L59
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            boolean r8 = r7 instanceof com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep.Workflow
            r2 = 0
            if (r8 == 0) goto L41
            r8 = r7
            com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep$Workflow r8 = (com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep.Workflow) r8
            goto L42
        L41:
            r8 = r2
        L42:
            if (r8 == 0) goto L47
            java.lang.String r8 = r8.f105416a
            goto L48
        L47:
            r8 = r2
        L48:
            r0.u = r7
            r0.v = r8
            r0.f257246y = r3
            pth.e r2 = r6.f257253a
            java.lang.Object r0 = r2.b(r0)
            if (r0 != r1) goto L57
            return r1
        L57:
            r2 = r8
            r8 = r0
        L59:
            r3 = r8
            wi0.b r3 = (wi0.b) r3
            boolean r4 = r7.getF()
            boolean r5 = r7.getF105419g()
            com.revolut.feature.workflow.engine.onboarding.impl.workflow.InternalStep$WorkflowEligibility r0 = new com.revolut.feature.workflow.engine.onboarding.impl.workflow.InternalStep$WorkflowEligibility
            com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation$a r7 = com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation.INSTANCE
            r7.getClass()
            com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation r1 = com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation.e
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rth.j.j(com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x012f, code lost:
    
        if (r2 == r6) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0146, code lost:
    
        if (r2 == r6) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015b, code lost:
    
        if (r2 == r6) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0173, code lost:
    
        if (r2 == r6) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ab, code lost:
    
        if (r2 == r6) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x020b, code lost:
    
        if (r2 == r6) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep r19, java.lang.String r20, com.revolut.analytics.tracking.v3.AnalyticsProduct r21, java.lang.String r22, com.revolut.analytics.tracking.v3.AnalyticsContext r23, gim.c r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rth.j.l(com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep, java.lang.String, com.revolut.analytics.tracking.v3.AnalyticsProduct, java.lang.String, com.revolut.analytics.tracking.v3.AnalyticsContext, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00a0 -> B:23:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00bd -> B:45:0x0151). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.revolut.shared.feature.workflow.engine.api.models.workflow.Workflow r23, java.lang.String r24, com.revolut.analytics.tracking.v3.AnalyticsProduct r25, com.revolut.analytics.tracking.v3.AnalyticsContext r26, gim.c r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rth.j.m(com.revolut.shared.feature.workflow.engine.api.models.workflow.Workflow, java.lang.String, com.revolut.analytics.tracking.v3.AnalyticsProduct, com.revolut.analytics.tracking.v3.AnalyticsContext, gim.c):java.lang.Object");
    }
}
