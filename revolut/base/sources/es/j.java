package es;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes17.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.biometric_verification.impl.ui.flow.launcher.d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r12 == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r12 == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        if (com.revolut.biometric_verification.impl.ui.flow.launcher.d.M2(r10, r12, r11) == r0) goto L40;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.u
            r2 = 3
            r3 = 2
            r8 = 0
            r4 = 1
            com.revolut.biometric_verification.impl.ui.flow.launcher.d r10 = r11.v
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            yhm.o.b(r12)
            goto La4
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            yhm.o.b(r12)
            goto L5b
        L23:
            yhm.o.b(r12)
            goto L45
        L27:
            yhm.o.b(r12)
            com.revolut.biometric_verification.api.navigation.BiometricVerificationFlowProvider$InputData r12 = r10.o
            com.revolut.biometric_verification.api.navigation.BiometricVerificationFlowProvider$LoadingType r12 = r12.e
            com.revolut.biometric_verification.api.navigation.BiometricVerificationFlowProvider$LoadingType$Loading r1 = com.revolut.biometric_verification.api.navigation.BiometricVerificationFlowProvider$LoadingType.Loading.f50457a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r12, r1)
            if (r1 == 0) goto L48
            e94.g r12 = new e94.g
            r1 = 7
            r12.<init>(r10, r8, r1)
            r11.u = r4
            java.lang.Object r12 = r10.p2(r11, r12)
            if (r12 != r0) goto L45
            goto La3
        L45:
            vr.i r12 = (vr.i) r12
            goto L5d
        L48:
            com.revolut.biometric_verification.api.navigation.BiometricVerificationFlowProvider$LoadingType$NoLoading r1 = com.revolut.biometric_verification.api.navigation.BiometricVerificationFlowProvider$LoadingType.NoLoading.f50458a
            boolean r12 = kotlin.jvm.internal.Intrinsics.f(r12, r1)
            if (r12 == 0) goto La7
            hs.a r12 = r10.B
            r11.u = r3
            java.lang.Object r12 = r12.a(r11)
            if (r12 != r0) goto L5b
            goto La3
        L5b:
            vr.i r12 = (vr.i) r12
        L5d:
            boolean r1 = r12 instanceof vr.f
            if (r1 == 0) goto L9b
            r1 = r12
            vr.f r1 = (vr.f) r1
            com.revolut.biometric_verification.api.models.BiometricVerificationFeatures r1 = r1.f291443c
            com.revolut.biometric_verification.api.models.DeviceFingerprint r1 = r1.e
            es.a0 r5 = r10.I
            es.d r3 = new es.d
            r6 = 1
            r3.<init>(r10, r6)
            r5.getClass()
            java.lang.String r6 = "launchBackground"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r6)
            if (r1 == 0) goto L7d
            java.lang.Long r6 = r1.f50424b
            goto L7e
        L7d:
            r6 = r8
        L7e:
            if (r1 == 0) goto L9b
            boolean r1 = r1.f50423a
            if (r1 != r4) goto L9b
            if (r6 == 0) goto L9b
            skm.r r1 = r5.d
            if (r1 == 0) goto L8b
            goto L9b
        L8b:
            skm.r r7 = skm.e0.b()
            r5.d = r7
            com.revolut.feature.credit.application.plugins.impl.ui.form.a r4 = new com.revolut.feature.credit.application.plugins.impl.ui.form.a
            r9 = 18
            r4.<init>(r5, r6, r7, r8, r9)
            r3.invoke(r4)
        L9b:
            r11.u = r2
            java.lang.Object r12 = com.revolut.biometric_verification.impl.ui.flow.launcher.d.M2(r10, r12, r11)
            if (r12 != r0) goto La4
        La3:
            return r0
        La4:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        La7:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: es.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
