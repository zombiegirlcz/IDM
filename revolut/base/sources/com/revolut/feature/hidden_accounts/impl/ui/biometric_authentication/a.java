package com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import rl0.d;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function1 {
    public d u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f74655w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f74655w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f74655w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.v
            com.revolut.core.ui_kit.views.pin.PinCodeView$Mode$Dynamic r2 = com.revolut.core.ui_kit.views.pin.PinCodeView.Mode.Dynamic.f59608a
            com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.b r3 = r7.f74655w
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L22
            if (r1 == r5) goto L1e
            if (r1 != r4) goto L16
            rl0.d r0 = r7.u
            yhm.o.b(r8)
            goto L54
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            yhm.o.b(r8)
            goto L30
        L22:
            yhm.o.b(r8)
            cn0.e r8 = r3.f74660t
            r7.v = r5
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L30
            goto L51
        L30:
            rl0.d r8 = (rl0.d) r8
            int[] r1 = bb7.f.f14181a
            int r6 = r8.ordinal()
            r1 = r1[r6]
            if (r1 == r5) goto L45
            if (r1 != r4) goto L3f
            goto L64
        L3f:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L45:
            cn0.c r1 = r3.f74656p
            r7.u = r8
            r7.v = r4
            java.lang.Object r1 = r1.a(r7)
            if (r1 != r0) goto L52
        L51:
            return r0
        L52:
            r0 = r8
            r8 = r1
        L54:
            zm0.a r8 = (zm0.a) r8
            java.lang.Integer r8 = r8.f323318a
            if (r8 == 0) goto L63
            com.revolut.core.ui_kit.views.pin.PinCodeView$Mode$Placeholder r2 = new com.revolut.core.ui_kit.views.pin.PinCodeView$Mode$Placeholder
            int r8 = r8.intValue()
            r2.<init>(r8)
        L63:
            r8 = r0
        L64:
            yki.i r0 = r3.u
            com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.BiometricAuthenticationFlowContract$Step$Authentication r1 = new com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.BiometricAuthenticationFlowContract$Step$Authentication
            r1.<init>(r2, r8)
            r8 = 0
            r2 = 6
            oki.h.u2(r3, r0, r1, r8, r2)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
