package com.revolut.feature.onboarding.impl.onboarding.biometric;

import com.revolut.feature.onboarding.impl.onboarding.biometric.OnboardingBiometricFlowContract$Step;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import tb9.e;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ e u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ OnboardingBiometricFlowContract$Step f78392w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, d dVar, OnboardingBiometricFlowContract$Step onboardingBiometricFlowContract$Step, Continuation continuation) {
        super(2, continuation);
        this.u = eVar;
        this.v = dVar;
        this.f78392w = onboardingBiometricFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, this.v, this.f78392w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        tb9.d dVar = tb9.d.f269509a;
        e eVar = this.u;
        boolean zF = Intrinsics.f(eVar, dVar);
        d dVar2 = this.v;
        if (zF) {
            dVar2.C2(new ja9.c(((OnboardingBiometricFlowContract$Step.Selfie) this.f78392w).f78391a));
        } else {
            if (!Intrinsics.f(eVar, tb9.c.f269508a)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar2.I2(new ja9.d(dVar2, 1));
        }
        return Unit.f186387a;
    }
}
