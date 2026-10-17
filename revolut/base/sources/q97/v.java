package q97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pzi.a f243803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f243804c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t97.c productCellProvider, pzi.a budgetOverviewInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(budgetOverviewInteractor, "budgetOverviewInteractor");
        this.f243803b = budgetOverviewInteractor;
        this.f243804c = t97.d.BUDGETING;
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f243804c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // r97.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof q97.u
            if (r0 == 0) goto L13
            r0 = r6
            q97.u r0 = (q97.u) r0
            int r1 = r0.f243797x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f243797x = r1
            goto L1a
        L13:
            q97.u r0 = new q97.u
            gim.c r6 = (gim.c) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f243797x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.revolut.core.model.account.AccountId$Personal r0 = r0.u
            yhm.o.b(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            yhm.o.b(r6)
            com.revolut.core.model.account.AccountId$Personal r6 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r0.u = r6
            r0.f243797x = r3
            java.io.Serializable r0 = r5.h(r0)
            if (r0 != r1) goto L43
            return r1
        L43:
            r4 = r0
            r0 = r6
            r6 = r4
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$Budget r1 = new com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$Budget
            r1.<init>(r0, r6)
            com.revolut.retail.core.navigation.FeatureCommand r6 = new com.revolut.retail.core.navigation.FeatureCommand
            r6.<init>(r1)
            o97.l r0 = new o97.l
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q97.v.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof q97.t
            if (r0 == 0) goto L13
            r0 = r5
            q97.t r0 = (q97.t) r0
            int r1 = r0.f243788w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f243788w = r1
            goto L18
        L13:
            q97.t r0 = new q97.t
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f243788w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L27
            goto L49
        L27:
            r5 = move-exception
            goto L56
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            pzi.a r5 = r4.f243803b     // Catch: java.lang.Throwable -> L27
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a     // Catch: java.lang.Throwable -> L27
            grj.f r5 = (grj.f) r5     // Catch: java.lang.Throwable -> L27
            efm.r r5 = r5.a(r2)     // Catch: java.lang.Throwable -> L27
            r0.f243788w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = nim.a.c(r5, r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L49
            return r1
        L49:
            od0.i r5 = (od0.i) r5     // Catch: java.lang.Throwable -> L27
            boolean r5 = r5.d()     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L27
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            goto L5c
        L56:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L5c:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r5 instanceof yhm.n
            if (r1 == 0) goto L63
            r5 = r0
        L63:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q97.v.h(gim.c):java.io.Serializable");
    }
}
