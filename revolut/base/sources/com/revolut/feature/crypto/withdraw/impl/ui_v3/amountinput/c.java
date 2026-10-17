package com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput;

import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CryptoSendAmountInputScreenContract$ModalStep.ActivatePocket f71261w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, CryptoSendAmountInputScreenContract$ModalStep.ActivatePocket activatePocket, Continuation continuation) {
        super(1, continuation);
        this.v = jVar;
        this.f71261w = activatePocket;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f71261w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j.I2(r3, r6) == r0) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            r2 = 1
            com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j r3 = r6.v
            r4 = 2
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L1a
            if (r1 != r4) goto L12
            yhm.o.b(r7)
            goto L3f
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            goto L36
        L1e:
            yhm.o.b(r7)
            rea.m r7 = r3.f71279r
            com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreenContract$ModalStep$ActivatePocket r1 = r6.f71261w
            io3.d r1 = r1.f71243a
            com.revolut.core.model.account.AccountId$Personal r5 = com.revolut.core.model.account.AccountId.Personal.f51414a
            pfm.r r7 = r7.d(r5, r1)
            r6.u = r2
            java.lang.Object r7 = nim.a.a(r7, r6)
            if (r7 != r0) goto L36
            goto L3e
        L36:
            r6.u = r4
            java.lang.Object r7 = com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j.I2(r3, r6)
            if (r7 != r0) goto L3f
        L3e:
            return r0
        L3f:
            r3.J2()
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
