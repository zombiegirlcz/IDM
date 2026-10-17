package com.revolut.feature.onboarding.impl.onboarding.biometric;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.u
            com.revolut.feature.onboarding.impl.onboarding.biometric.d r2 = r9.v
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            yhm.o.b(r10)
            goto L3e
        Lf:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L17:
            yhm.o.b(r10)
            com.revolut.feature.onboarding.impl.onboarding.biometric.OnboardingBiometricFlowContract$InputData r10 = r2.o
            java.util.Set r10 = r10.f78388b
            if (r10 != 0) goto L40
            mt8.d r10 = r2.f78394p
            r9.u = r3
            qt8.d r10 = (qt8.d) r10
            qt8.e r10 = r10.f249018a
            qt8.l r10 = (qt8.l) r10
            r10.getClass()
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            qt8.i r4 = new qt8.i
            r5 = 0
            r4.<init>(r10, r5, r3)
            java.lang.Object r10 = skm.e0.J(r1, r4, r9)
            if (r10 != r0) goto L3e
            return r0
        L3e:
            java.util.Set r10 = (java.util.Set) r10
        L40:
            com.revolut.feature.onboarding.impl.onboarding.biometric.OnboardingBiometricFlowContract$InputData r0 = r2.o
            java.lang.String r0 = r0.f78387a
            if (r0 != 0) goto L56
            yki.i r3 = r2.f78396r
            com.revolut.feature.onboarding.impl.onboarding.biometric.OnboardingBiometricFlowContract$Step$Selfie r4 = new com.revolut.feature.onboarding.impl.onboarding.biometric.OnboardingBiometricFlowContract$Step$Selfie
            r4.<init>(r10)
            r7 = 0
            r8 = 12
            r5 = 0
            r6 = 0
            oki.h.t2(r2, r3, r4, r5, r6, r7, r8)
            goto L65
        L56:
            yki.i r3 = r2.f78396r
            com.revolut.feature.onboarding.impl.onboarding.biometric.OnboardingBiometricFlowContract$Step$BiometricAuth r4 = new com.revolut.feature.onboarding.impl.onboarding.biometric.OnboardingBiometricFlowContract$Step$BiometricAuth
            r4.<init>(r0, r10)
            r7 = 0
            r8 = 12
            r5 = 0
            r6 = 0
            oki.h.t2(r2, r3, r4, r5, r6, r7, r8)
        L65:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.onboarding.biometric.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
