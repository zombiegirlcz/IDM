package com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput;

import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CryptoSendAmountInputScreenContract$ModalStep.ActivatePocket f71262w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, CryptoSendAmountInputScreenContract$ModalStep.ActivatePocket activatePocket, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f71262w = activatePocket;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f71262w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            CryptoSendAmountInputScreenContract$ModalStep.ActivatePocket activatePocket = this.f71262w;
            j jVar = this.v;
            c cVar = new c(jVar, activatePocket, null);
            this.u = 1;
            if (u0.b0(jVar.X(), "CryptoSendAmountInputScreen_NextButton_LoadingTag", cVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
