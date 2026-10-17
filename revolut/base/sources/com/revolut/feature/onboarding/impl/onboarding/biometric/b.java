package com.revolut.feature.onboarding.impl.onboarding.biometric;

import com.revolut.feature.onboarding.impl.onboarding.biometric.OnboardingBiometricFlowContract$Step;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oq.e;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ e u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ OnboardingBiometricFlowContract$Step f78393w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, d dVar, OnboardingBiometricFlowContract$Step onboardingBiometricFlowContract$Step, Continuation continuation) {
        super(2, continuation);
        this.u = eVar;
        this.v = dVar;
        this.f78393w = onboardingBiometricFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, this.v, this.f78393w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = this.u;
        boolean z = eVar instanceof oq.a;
        d dVar = this.v;
        if (z || (eVar instanceof oq.b)) {
            dVar.I2(new ja9.d(dVar, 2));
        } else {
            if (!(eVar instanceof oq.c) && !(eVar instanceof oq.d)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar.C2(new ja9.c(((OnboardingBiometricFlowContract$Step.BiometricAuth) this.f78393w).f78390b));
        }
        return Unit.f186387a;
    }
}
