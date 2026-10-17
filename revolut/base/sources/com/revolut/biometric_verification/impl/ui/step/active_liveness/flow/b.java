package com.revolut.biometric_verification.impl.ui.step.active_liveness.flow;

import com.revolut.biometric_verification.impl.domain.models.active_liveness.ActiveLivenessCode;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.BiometricVerificationActiveLivenessStepFlowContract$Step;
import elm.f;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import lb0.b0;
import oki.h;
import skm.e0;
import skm.p0;
import yhm.o;
import zr.k;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f50503w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, boolean z, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f50503w = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f50503w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            k kVar = cVar.f50509w;
            b0 b0Var = new b0(kVar.f324516a, cVar.o.f50497c, (Continuation) null);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, b0Var, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.t2(cVar, cVar.B, new BiometricVerificationActiveLivenessStepFlowContract$Step.Camera((ActiveLivenessCode) obj2, this.f50503w), true, null, false, 12);
        return Unit.f186387a;
    }
}
