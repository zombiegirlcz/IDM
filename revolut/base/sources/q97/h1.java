package q97;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class h1 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.external_accounts.api.navigation.a f243702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y91.b f243703c;
    public final t97.d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(t97.c productCellProvider, com.revolut.feature.external_accounts.api.navigation.a externalPocketNavigationFactory, y91.b accountsProductFeatureChecker) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(externalPocketNavigationFactory, "externalPocketNavigationFactory");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        this.f243702b = externalPocketNavigationFactory;
        this.f243703c = accountsProductFeatureChecker;
        this.d = t97.d.LINKED_ACCOUNTS;
    }

    @Override // r97.b
    public final Flow d() {
        return new v0f.p(new ht0.b0(0, this.f243703c, y91.b.class, "linkedAccountsIsEnabled", "linkedAccountsIsEnabled()Z", 0, 18), 5);
    }

    @Override // r97.b
    public final p97.b f() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // r97.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof q97.g1
            if (r0 == 0) goto L13
            r0 = r5
            q97.g1 r0 = (q97.g1) r0
            int r1 = r0.f243696w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f243696w = r1
            goto L1a
        L13:
            q97.g1 r0 = new q97.g1
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f243696w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            com.revolut.feature.external_accounts.api.navigation.a r5 = r4.f243702b
            ym6.d r5 = (ym6.d) r5
            r2 = 0
            ufm.i r5 = r5.b(r2, r2, r3)
            r0.f243696w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            com.revolut.retail.core.navigation.NaviCommand r5 = (com.revolut.retail.core.navigation.NaviCommand) r5
            o97.l r0 = new o97.l
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q97.h1.g(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
