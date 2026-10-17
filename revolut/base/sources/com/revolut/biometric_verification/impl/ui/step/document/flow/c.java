package com.revolut.biometric_verification.impl.ui.step.document.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f50585w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Continuation continuation) {
        super(2, continuation);
        this.f50585w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.f50585w, continuation);
        cVar.v = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((zr.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            com.revolut.biometric_verification.impl.ui.step.document.flow.e r0 = r7.f50585w
            java.lang.Object r1 = r0.D
            r2 = r1
            yki.a r1 = r0.E
            java.lang.Object r3 = r7.v
            zr.d r3 = (zr.d) r3
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r7.u
            r6 = 1
            if (r5 == 0) goto L20
            if (r5 != r6) goto L18
            yhm.o.b(r8)
            goto L83
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            yhm.o.b(r8)
            boolean r8 = r3 instanceof zr.c
            if (r8 == 0) goto L69
            com.revolut.kompot.navigable.flow.FlowStep r8 = r1.d()
            com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step r8 = (com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step) r8
            boolean r3 = r8 instanceof com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step.Camera
            if (r3 == 0) goto L56
            com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step$Camera r8 = (com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step.Camera) r8
            com.revolut.biometric_verification.api.models.BiometricVerificationDocumentPage r3 = r8.f50552b
            com.revolut.biometric_verification.api.models.BiometricVerificationDocument r8 = r8.f50551a
            java.util.ArrayList r8 = r8.f50377c
            java.lang.Object r8 = zhm.d0.b0(r8)
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r3, r8)
            if (r8 == 0) goto L56
            py.d r8 = r0.f50590s
            py.a r0 = new py.a
            r1 = 0
            r0.<init>(r1)
            r7.v = r1
            r7.u = r6
            java.lang.Object r8 = r8.a(r0, r7)
            if (r8 != r4) goto L83
            return r4
        L56:
            oki.h.r2(r1)
            java.lang.Object r8 = r2.getValue()
            r2 = r8
            com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step r2 = (com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step) r2
            r5 = 0
            r6 = 12
            r3 = 0
            r4 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            goto L83
        L69:
            zr.b r8 = zr.b.f324504a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r3, r8)
            if (r8 == 0) goto L86
            oki.h.r2(r1)
            java.lang.Object r8 = r2.getValue()
            r2 = r8
            com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step r2 = (com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step) r2
            r5 = 0
            r6 = 12
            r3 = 0
            r4 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
        L83:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L86:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.biometric_verification.impl.ui.step.document.flow.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
