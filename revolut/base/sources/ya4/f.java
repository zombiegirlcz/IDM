package ya4;

import kotlin.jvm.internal.Intrinsics;
import xq3.j;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rz3.c f311926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f311927b;

    public f(rz3.c creditApplicationRouter, j creditApplicationLifecycleInteractor) {
        Intrinsics.checkNotNullParameter(creditApplicationRouter, "creditApplicationRouter");
        Intrinsics.checkNotNullParameter(creditApplicationLifecycleInteractor, "creditApplicationLifecycleInteractor");
        this.f311926a = creditApplicationRouter;
        this.f311927b = creditApplicationLifecycleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ya4.d
            if (r0 == 0) goto L13
            r0 = r8
            ya4.d r0 = (ya4.d) r0
            int r1 = r0.f311923x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f311923x = r1
            goto L18
        L13:
            ya4.d r0 = new ya4.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f311923x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r7 = r0.u
            yhm.o.b(r8)
            goto L4f
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            ft3.d1 r8 = new ft3.d1
            ft3.j1 r2 = r7.d
            gt3.f r5 = r7.e
            r8.<init>(r2, r5, r3)
            java.util.Set r8 = zhm.y0.b(r8)
            r0.u = r7
            r0.f311923x = r4
            xq3.j r2 = r6.f311927b
            java.lang.Object r8 = xq3.j.g(r2, r8, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            java.util.List r8 = (java.util.List) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L57:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r8.next()
            r1 = r0
            it3.d r1 = (it3.d) r1
            java.lang.String r1 = r1.f168323a
            java.lang.String r2 = r7.f66892b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r1 == 0) goto L57
            return r0
        L6f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ya4.f.a(com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ya4.e
            if (r0 == 0) goto L13
            r0 = r10
            ya4.e r0 = (ya4.e) r0
            int r1 = r0.f311925x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f311925x = r1
            goto L18
        L13:
            ya4.e r0 = new ya4.e
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f311925x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r10)
            goto L67
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r9 = r0.u
            yhm.o.b(r10)
            goto L46
        L38:
            yhm.o.b(r10)
            r0.u = r9
            r0.f311925x = r4
            java.lang.Object r10 = r8.a(r9, r0)
            if (r10 != r1) goto L46
            goto L66
        L46:
            it3.d r10 = (it3.d) r10
            r2 = 0
            if (r10 == 0) goto L6a
            grl.r2 r5 = r9.f66893c
            java.lang.String r9 = r9.f66899n
            com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig r6 = new com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig
            r7 = 10
            r6.<init>(r4, r4, r7)
            rz3.c r4 = r8.f311926a
            ufm.i r9 = r4.a(r10, r5, r9, r6)
            r0.u = r2
            r0.f311925x = r3
            java.lang.Object r10 = nim.a.b(r9, r0)
            if (r10 != r1) goto L67
        L66:
            return r1
        L67:
            r2 = r10
            com.revolut.retail.core.navigation.NaviCommand r2 = (com.revolut.retail.core.navigation.NaviCommand) r2
        L6a:
            ya4.b r9 = new ya4.b
            r9.<init>(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ya4.f.b(com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration, gim.c):java.lang.Object");
    }
}
