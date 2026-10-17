package com.revolut.feature.apm.wero.impl.ui.pay;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r9 == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r9 == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        if (r9 == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        if (r9 == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        if (com.revolut.feature.apm.wero.impl.ui.pay.b.L2(r2, r9, r8) == r0) goto L47;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.u
            com.revolut.feature.apm.wero.impl.ui.pay.b r2 = r8.v
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L34
            if (r1 == r7) goto L30
            if (r1 == r6) goto L2c
            if (r1 == r5) goto L28
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1c
            yhm.o.b(r9)
            goto L9b
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            yhm.o.b(r9)
            goto L80
        L28:
            yhm.o.b(r9)
            goto L6c
        L2c:
            yhm.o.b(r9)
            goto L5c
        L30:
            yhm.o.b(r9)
            goto L4a
        L34:
            yhm.o.b(r9)
            com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$InputData r9 = r2.o
            com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType$Pay r9 = r9.f63084a
            boolean r1 = r9 instanceof com.revolut.feature.apm.wero.api.navigation.WeroNavigation.StartType.Pay.Scanner
            if (r1 == 0) goto L4d
            g12.r r9 = g12.r.SCAN
            r8.u = r7
            java.lang.Object r9 = com.revolut.feature.apm.wero.impl.ui.pay.b.J2(r2, r9, r8)
            if (r9 != r0) goto L4a
            goto L9a
        L4a:
            com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$Step r9 = (com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$Step) r9
            goto Laa
        L4d:
            boolean r1 = r9 instanceof com.revolut.feature.apm.wero.api.navigation.WeroNavigation.StartType.Pay.ScannerDetails
            if (r1 == 0) goto L5f
            g12.r r9 = g12.r.DETAILS
            r8.u = r6
            java.lang.Object r9 = com.revolut.feature.apm.wero.impl.ui.pay.b.J2(r2, r9, r8)
            if (r9 != r0) goto L5c
            goto L9a
        L5c:
            com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$Step r9 = (com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$Step) r9
            goto Laa
        L5f:
            boolean r1 = r9 instanceof com.revolut.feature.apm.wero.api.navigation.WeroNavigation.StartType.Pay.ShowUserCode
            if (r1 == 0) goto L6f
            r8.u = r5
            java.lang.Object r9 = com.revolut.feature.apm.wero.impl.ui.pay.b.K2(r2, r8)
            if (r9 != r0) goto L6c
            goto L9a
        L6c:
            com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$Step r9 = (com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$Step) r9
            goto Laa
        L6f:
            boolean r1 = r9 instanceof com.revolut.feature.apm.wero.api.navigation.WeroNavigation.StartType.Pay.RequestLinkDetails
            if (r1 == 0) goto L83
            com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType$Pay$RequestLinkDetails r9 = (com.revolut.feature.apm.wero.api.navigation.WeroNavigation.StartType.Pay.RequestLinkDetails) r9
            java.lang.String r9 = r9.f63023a
            r8.u = r4
            java.lang.Object r9 = com.revolut.feature.apm.wero.impl.ui.pay.b.I2(r2, r9, r8)
            if (r9 != r0) goto L80
            goto L9a
        L80:
            com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$Step r9 = (com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$Step) r9
            goto Laa
        L83:
            boolean r1 = r9 instanceof com.revolut.feature.apm.wero.api.navigation.WeroNavigation.StartType.Pay.CreateRequestLink
            if (r1 == 0) goto L8a
            com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$Step$CreateRequestLink r9 = com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$Step.CreateRequestLink.f63086a
            goto Laa
        L8a:
            boolean r1 = r9 instanceof com.revolut.feature.apm.wero.api.navigation.WeroNavigation.StartType.Pay.URL
            if (r1 == 0) goto L9e
            com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType$Pay$URL r9 = (com.revolut.feature.apm.wero.api.navigation.WeroNavigation.StartType.Pay.URL) r9
            java.lang.String r9 = r9.f63027a
            r8.u = r3
            java.lang.Object r9 = com.revolut.feature.apm.wero.impl.ui.pay.b.L2(r2, r9, r8)
            if (r9 != r0) goto L9b
        L9a:
            return r0
        L9b:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L9e:
            boolean r0 = r9 instanceof com.revolut.feature.apm.wero.api.navigation.WeroNavigation.StartType.Pay.PendingAction
            if (r0 == 0) goto Lb4
            com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType$Pay$PendingAction r9 = (com.revolut.feature.apm.wero.api.navigation.WeroNavigation.StartType.Pay.PendingAction) r9
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary r9 = r9.f63022a
            com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$Step r9 = r2.M2(r9)
        Laa:
            yki.i r0 = r2.f63098x
            r1 = 0
            r3 = 6
            oki.h.u2(r2, r0, r9, r1, r3)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        Lb4:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.wero.impl.ui.pay.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
