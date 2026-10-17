package com.revolut.feature.onboarding.impl.playbilling;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f78526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hlm.c f78527c;
    public final dug.e d;
    public final Lazy e;
    public final Lazy f;

    public e(Context context, fc9.b billingClientFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(billingClientFactory, "billingClientFactory");
        this.f78525a = context.getApplicationContext();
        this.f78526b = new AtomicBoolean(false);
        this.f78527c = hlm.d.a();
        this.d = new dug.e(19);
        this.e = j.b(new fb6.j(billingClientFactory, this, 3));
        this.f = j.b(new es.e(this, 22));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof fc9.h
            if (r0 == 0) goto L13
            r0 = r6
            fc9.h r0 = (fc9.h) r0
            int r1 = r0.f133665w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f133665w = r1
            goto L18
        L13:
            fc9.h r0 = new fc9.h
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f133665w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L83
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f78526b
            boolean r6 = r6.get()
            if (r6 == 0) goto L46
            yhm.m$a r6 = yhm.m.INSTANCE
            com.revolut.feature.onboarding.impl.playbilling.OnboardingPlayBillingFailure$SessionReleased r6 = new com.revolut.feature.onboarding.impl.playbilling.OnboardingPlayBillingFailure$SessionReleased
            r6.<init>()
            yhm.n r6 = yhm.o.a(r6)
            return r6
        L46:
            kotlin.Lazy r6 = r5.e
            java.lang.Object r2 = r6.getValue()
            com.android.billingclient.api.BillingClient r2 = (com.android.billingclient.api.BillingClient) r2
            boolean r2 = r2.isReady()
            if (r2 == 0) goto L59
            yhm.m$a r6 = yhm.m.INSTANCE
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L59:
            r0.f133665w = r3
            skm.l r2 = new skm.l
            kotlin.coroutines.Continuation r4 = fim.h.b(r0)
            r2.<init>(r3, r4)
            r2.u()
            java.lang.Object r6 = r6.getValue()
            com.android.billingclient.api.BillingClient r6 = (com.android.billingclient.api.BillingClient) r6
            com.revolut.feature.onboarding.impl.playbilling.d r3 = new com.revolut.feature.onboarding.impl.playbilling.d
            r3.<init>(r2)
            r6.startConnection(r3)
            java.lang.Object r6 = r2.t()
            if (r6 != r1) goto L80
            java.lang.String r2 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
        L80:
            if (r6 != r1) goto L83
            return r1
        L83:
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r6 = r6.f314193a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.playbilling.e.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof fc9.i
            if (r0 == 0) goto L13
            r0 = r8
            fc9.i r0 = (fc9.i) r0
            int r1 = r0.f133668y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f133668y = r1
            goto L18
        L13:
            fc9.i r0 = new fc9.i
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f133666w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f133668y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            hlm.a r0 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L31
            yhm.m r8 = (yhm.m) r8     // Catch: java.lang.Throwable -> L31
            java.lang.Object r8 = r8.f314193a     // Catch: java.lang.Throwable -> L31
            goto L67
        L31:
            r8 = move-exception
            goto L6f
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            int r2 = r0.v
            hlm.a r4 = r0.u
            yhm.o.b(r8)
            r8 = r4
            goto L57
        L44:
            yhm.o.b(r8)
            hlm.c r8 = r7.f78527c
            r0.u = r8
            r2 = 0
            r0.v = r2
            r0.f133668y = r4
            java.lang.Object r4 = r8.lock(r5, r0)
            if (r4 != r1) goto L57
            goto L63
        L57:
            r0.u = r8     // Catch: java.lang.Throwable -> L6b
            r0.v = r2     // Catch: java.lang.Throwable -> L6b
            r0.f133668y = r3     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r0 = r7.a(r0)     // Catch: java.lang.Throwable -> L6b
            if (r0 != r1) goto L64
        L63:
            return r1
        L64:
            r6 = r0
            r0 = r8
            r8 = r6
        L67:
            r0.unlock(r5)
            return r8
        L6b:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L6f:
            r0.unlock(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.playbilling.e.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(a35.j r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof fc9.j
            if (r0 == 0) goto L13
            r0 = r7
            fc9.j r0 = (fc9.j) r0
            int r1 = r0.f133670x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f133670x = r1
            goto L18
        L13:
            fc9.j r0 = new fc9.j
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f133670x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L70
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            a35.j r6 = r0.u
            yhm.o.b(r7)
            yhm.m r7 = (yhm.m) r7
            java.lang.Object r7 = r7.f314193a
            goto L4a
        L3c:
            yhm.o.b(r7)
            r0.u = r6
            r0.f133670x = r4
            java.lang.Object r7 = r5.b(r0)
            if (r7 != r1) goto L4a
            goto L6f
        L4a:
            yhm.m$a r2 = yhm.m.INSTANCE
            boolean r2 = r7 instanceof yhm.n
            if (r2 == 0) goto L5c
            java.lang.Throwable r6 = yhm.m.a(r7)
            kotlin.jvm.internal.Intrinsics.h(r6)
            yhm.n r6 = yhm.o.a(r6)
            return r6
        L5c:
            kotlin.Lazy r7 = r5.f
            java.lang.Object r7 = r7.getValue()
            fc9.e r7 = (fc9.e) r7
            r2 = 0
            r0.u = r2
            r0.f133670x = r3
            java.lang.Object r7 = r6.invoke(r7, r0)
            if (r7 != r1) goto L70
        L6f:
            return r1
        L70:
            yhm.m r7 = (yhm.m) r7
            java.lang.Object r6 = r7.f314193a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.playbilling.e.c(a35.j, gim.c):java.lang.Object");
    }
}
