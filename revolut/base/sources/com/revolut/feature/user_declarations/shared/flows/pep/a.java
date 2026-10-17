package com.revolut.feature.user_declarations.shared.flows.pep;

import com.revolut.feature.user_declarations.shared.flows.pep.PepFlowContract$Step;
import com.revolut.shared.feature.user_declarations.api.navigation.PepFlowControllerDescriptor$InputData;
import cp5.d;
import dog.b;
import dog.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements b {

    @NotNull
    public static final c Companion = new c();
    public final PepFlowControllerDescriptor$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jvh.a f94638p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fog.a f94639q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ivh.c f94640r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f94641s;

    public a(PepFlowControllerDescriptor$InputData inputData, jvh.a workflowInteractor, fog.a personalDetailsToPepConnectionsMapper, ivh.c workflowsErrorHandlerExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(personalDetailsToPepConnectionsMapper, "personalDetailsToPepConnectionsMapper");
        Intrinsics.checkNotNullParameter(workflowsErrorHandlerExtension, "workflowsErrorHandlerExtension");
        this.o = inputData;
        this.f94638p = workflowInteractor;
        this.f94639q = personalDetailsToPepConnectionsMapper;
        this.f94640r = workflowsErrorHandlerExtension;
        dgj.h hVar = new dgj.h(this, 18);
        this.f94641s = d.a(this, PepFlowContract$Step.PersonsList.f94637a, f0.f322471a, hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.user_declarations.shared.flows.pep.a r18, java.util.List r19, gim.c r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof dog.d
            if (r3 == 0) goto L19
            r3 = r2
            dog.d r3 = (dog.d) r3
            int r4 = r3.f116563w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f116563w = r4
            goto L1e
        L19:
            dog.d r3 = new dog.d
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.u
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f116563w
            r6 = 1
            if (r5 == 0) goto L36
            if (r5 != r6) goto L2e
            yhm.o.b(r2)
            goto La9
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            yhm.o.b(r2)
            jvh.a r2 = r0.f94638p
            com.revolut.shared.feature.user_declarations.api.navigation.PepFlowControllerDescriptor$InputData r5 = r0.o
            java.lang.String r7 = r5.f105063a
            com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams$PepConnections r8 = new com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams$PepConnections
            com.revolut.shared.feature.user_declarations.api.navigation.PepFlowControllerDescriptor$UseCase r5 = r5.f105064b
            java.lang.String r5 = r5.getF105069a()
            fog.a r9 = r0.f94639q
            r9.getClass()
            java.lang.String r9 = "personalDetails"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r9)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r10 = zhm.w.t(r1, r10)
            r9.<init>(r10)
            java.util.Iterator r1 = r1.iterator()
        L62:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L9c
            java.lang.Object r10 = r1.next()
            com.revolut.feature.user_declarations.shared.flows.pep.models.PersonalDetails r10 = (com.revolut.feature.user_declarations.shared.flows.pep.models.PersonalDetails) r10
            com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams$PepConnections$PepConnection r11 = new com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams$PepConnections$PepConnection
            gog.b r12 = r10.f94643b
            r13 = 0
            if (r12 == 0) goto L7b
            java.lang.String r12 = r12.name()
            r14 = r13
            goto L7d
        L7b:
            r12 = r13
            r14 = r12
        L7d:
            java.lang.String r13 = r10.f94644c
            r15 = r14
            java.lang.String r14 = r10.d
            r16 = r15
            java.lang.String r15 = r10.e
            gog.a r6 = r10.f
            if (r6 == 0) goto L90
            java.lang.String r6 = r6.name()
            r16 = r6
        L90:
            java.lang.String r6 = r10.f94645g
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r9.add(r11)
            r6 = 1
            goto L62
        L9c:
            r8.<init>(r5, r9)
            r1 = 1
            r3.f116563w = r1
            java.lang.Object r1 = r2.j(r7, r8, r3)
            if (r1 != r4) goto La9
            return r4
        La9:
            com.revolut.shared.feature.user_declarations.api.navigation.PepFlowControllerDescriptor$OutputData$Success r1 = com.revolut.shared.feature.user_declarations.api.navigation.PepFlowControllerDescriptor$OutputData.Success.f105067a
            r0.C2(r1)
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.user_declarations.shared.flows.pep.a.I2(com.revolut.feature.user_declarations.shared.flows.pep.a, java.util.List, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f94641s;
    }
}
