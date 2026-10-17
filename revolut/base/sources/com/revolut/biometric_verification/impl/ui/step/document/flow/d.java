package com.revolut.biometric_verification.impl.ui.step.document.flow;

import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BiometricVerificationDocumentStepFlowContract$Step.Camera f50586w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, BiometricVerificationDocumentStepFlowContract$Step.Camera camera, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f50586w = camera;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, this.f50586w, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (!(n1Var instanceof j1) && !(n1Var instanceof m1)) {
            boolean z = n1Var instanceof k1;
            BiometricVerificationDocumentStepFlowContract$Step.Camera camera = this.f50586w;
            e eVar = this.v;
            if (!z && !(n1Var instanceof l1)) {
                throw new NoWhenBranchMatchedException();
            }
            eVar.K2(camera.f50551a, camera.f50553c);
        }
        return Unit.f186387a;
    }
}
