package com.revolut.biometric_verification.impl.ui.step.document.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import nq.a0;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ e u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Continuation continuation) {
        super(2, continuation);
        this.u = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = this.u;
        eVar.C2(new a0(((BiometricVerificationDocumentStepFlowContract$State) ((j2) eVar.B.f22677a).getValue()).f50548a));
        return Unit.f186387a;
    }
}
