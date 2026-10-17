package tz1;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements cx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f275742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b90.a f275743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lifecycle f275744c;
    public final m d;

    public g(b apmPendingPaymentsHandler, b90.a pushMessageHandler, Lifecycle lifecycle, m navigator) {
        Intrinsics.checkNotNullParameter(apmPendingPaymentsHandler, "apmPendingPaymentsHandler");
        Intrinsics.checkNotNullParameter(pushMessageHandler, "pushMessageHandler");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f275742a = apmPendingPaymentsHandler;
        this.f275743b = pushMessageHandler;
        this.f275744c = lifecycle;
        this.d = navigator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (r15 != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.apm.core.api.product.ApmProduct r13, java.lang.String r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tz1.g.a(com.revolut.feature.apm.core.api.product.ApmProduct, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r14 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r13, gim.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof tz1.f
            if (r0 == 0) goto L13
            r0 = r14
            tz1.f r0 = (tz1.f) r0
            int r1 = r0.f275741x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f275741x = r1
            goto L18
        L13:
            tz1.f r0 = new tz1.f
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f275741x
            tz1.b r3 = r12.f275742a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r14)
            goto La3
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            java.lang.String r13 = r0.u
            yhm.o.b(r14)
            goto L6e
        L3b:
            yhm.o.b(r14)
            java.util.concurrent.CopyOnWriteArrayList r14 = rd0.d.f253311a
            rd0.c r6 = rd0.c.INFO
            java.lang.String r14 = "Checking APM Pending Payments: "
            java.lang.String r8 = j6.a.q(r14, r13)
            r10 = 0
            r11 = 16
            java.lang.String r7 = "APM-PUSH"
            r9 = 0
            rd0.d.b(r6, r7, r8, r9, r10, r11)
            androidx.lifecycle.Lifecycle r14 = r12.f275744c
            androidx.lifecycle.Lifecycle$State r14 = r14.getState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r14 = r14.isAtLeast(r2)
            if (r14 == 0) goto Lbf
            r0.u = r13
            r0.f275741x = r5
            sy1.g r14 = r3.f275731a
            com.revolut.feature.apm.core.api.product.ApmBizum r2 = com.revolut.feature.apm.core.api.product.ApmBizum.f61808c
            java.lang.Object r14 = r14.b(r2, r0)
            if (r14 != r1) goto L6e
            goto La2
        L6e:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto Lbf
            java.util.concurrent.CopyOnWriteArrayList r14 = rd0.d.f253311a
            rd0.c r5 = rd0.c.INFO
            r9 = 0
            r10 = 16
            java.lang.String r6 = "APM-PUSH"
            java.lang.String r7 = "Checking Pending Payments: found"
            r8 = 0
            rd0.d.b(r5, r6, r7, r8, r9, r10)
            if (r13 == 0) goto L8c
            b90.a r14 = r12.f275743b
            r14.a(r13)
        L8c:
            r13 = 0
            r0.u = r13
            r0.f275741x = r4
            sy1.g r14 = r3.f275731a
            com.revolut.feature.apm.core.api.product.ApmBizum r2 = com.revolut.feature.apm.core.api.product.ApmBizum.f61808c
            my1.b r14 = r14.a(r2)
            if (r14 == 0) goto L9f
            java.lang.Object r13 = r14.c(r0)
        L9f:
            r14 = r13
            if (r14 != r1) goto La3
        La2:
            return r1
        La3:
            com.revolut.kompot.bridge.navigation.KompotDestination r14 = (com.revolut.kompot.bridge.navigation.KompotDestination) r14
            if (r14 == 0) goto Lbf
            java.util.concurrent.CopyOnWriteArrayList r13 = rd0.d.f253311a
            rd0.c r0 = rd0.c.INFO
            r4 = 0
            r5 = 16
            java.lang.String r1 = "APM-PUSH"
            java.lang.String r2 = "Confirmation feature config received, navigate"
            r3 = 0
            rd0.d.b(r0, r1, r2, r3, r4, r5)
            sri.m r13 = r12.d
            com.revolut.retail.core.navigation.FeatureCommand r14 = zh9.u0.f(r14)
            r13.c(r14)
        Lbf:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: tz1.g.b(java.lang.String, gim.c):java.lang.Object");
    }
}
