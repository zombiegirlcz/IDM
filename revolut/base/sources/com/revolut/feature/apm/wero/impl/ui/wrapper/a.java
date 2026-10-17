package com.revolut.feature.apm.wero.impl.ui.wrapper;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        if (r9 == r2) goto L18;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.revolut.feature.apm.wero.impl.ui.wrapper.b r0 = r8.v
            uw1.c r1 = r0.f63111p
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.u
            r4 = 6
            r5 = 0
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L22
            if (r3 == r7) goto L1e
            if (r3 != r6) goto L16
            yhm.o.b(r9)
            goto L6e
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            yhm.o.b(r9)
            goto L3a
        L22:
            yhm.o.b(r9)
            r9 = r1
            ty1.b r9 = (ty1.b) r9
            r9.getClass()
            yoj.c r3 = yoj.c.APM_WERO
            pfm.z r9 = r9.c(r3)
            r8.u = r7
            java.lang.Object r9 = nim.a.b(r9, r8)
            if (r9 != r2) goto L3a
            goto L6d
        L3a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L4f
            yki.i r9 = r0.f63112q
            com.revolut.feature.apm.wero.impl.ui.wrapper.WeroWrapperFlowContract$Step$Wero r1 = new com.revolut.feature.apm.wero.impl.ui.wrapper.WeroWrapperFlowContract$Step$Wero
            com.revolut.feature.apm.wero.api.navigation.WeroNavigation$InputData r2 = r0.o
            r1.<init>(r2)
            oki.h.u2(r0, r9, r1, r5, r4)
            goto L9d
        L4f:
            ty1.b r1 = (ty1.b) r1
            r1.getClass()
            s2i.i r9 = new s2i.i
            r3 = 4
            r9.<init>(r1, r3)
            ufm.c r1 = new ufm.c
            r3 = 2
            r1.<init>(r9, r3)
            java.lang.String r9 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r9)
            r8.u = r6
            java.lang.Object r9 = nim.a.b(r1, r8)
            if (r9 != r2) goto L6e
        L6d:
            return r2
        L6e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L9a
            com.revolut.feature.apm.wero.api.navigation.WeroNavigation$InputData r9 = r0.o
            com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType r9 = r9.f63018a
            boolean r1 = r9 instanceof com.revolut.feature.apm.wero.api.navigation.WeroNavigation.StartType.Pay.URL
            if (r1 == 0) goto L81
            com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType$Pay$URL r9 = (com.revolut.feature.apm.wero.api.navigation.WeroNavigation.StartType.Pay.URL) r9
            goto L82
        L81:
            r9 = r5
        L82:
            if (r9 == 0) goto L96
            yki.i r1 = r0.f63112q
            com.revolut.feature.apm.wero.impl.ui.wrapper.WeroWrapperFlowContract$Step$WeroP2M r2 = new com.revolut.feature.apm.wero.impl.ui.wrapper.WeroWrapperFlowContract$Step$WeroP2M
            com.revolut.feature.apm.wero.impl.ui.p2m.WeroP2MFlowContract$InputData r3 = new com.revolut.feature.apm.wero.impl.ui.p2m.WeroP2MFlowContract$InputData
            java.lang.String r9 = r9.f63027a
            r3.<init>(r9)
            r2.<init>(r3)
            oki.h.u2(r0, r1, r2, r5, r4)
            goto L9d
        L96:
            com.revolut.feature.apm.wero.impl.ui.wrapper.b.I2(r0)
            goto L9d
        L9a:
            com.revolut.feature.apm.wero.impl.ui.wrapper.b.I2(r0)
        L9d:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.wero.impl.ui.wrapper.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
