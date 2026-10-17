package fmc;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tzg.m f136361a;

    public v(tzg.m wealthAccountsInteractor) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.f136361a = wealthAccountsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof fmc.r
            if (r0 == 0) goto L13
            r0 = r5
            fmc.r r0 = (fmc.r) r0
            int r1 = r0.f136357w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f136357w = r1
            goto L18
        L13:
            fmc.r r0 = new fmc.r
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f136357w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f136357w = r3
            java.lang.Object r5 = r4.d(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L41:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r5.next()
            r1 = r0
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Portfolio r1 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Portfolio) r1
            com.revolut.shared.feature.wealth.models.trading_accounts.a r2 = com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE
            com.revolut.shared.feature.wealth.models.trading_accounts.a[] r2 = new com.revolut.shared.feature.wealth.models.trading_accounts.a[]{r2}
            com.revolut.shared.feature.wealth.models.trading_accounts.a r1 = r1.f105211b
            boolean r1 = kotlin.collections.d.I(r2, r1)
            if (r1 == 0) goto L41
            return r0
        L5d:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fmc.v.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof fmc.s
            if (r0 == 0) goto L13
            r0 = r6
            fmc.s r0 = (fmc.s) r0
            int r1 = r0.f136358w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f136358w = r1
            goto L18
        L13:
            fmc.s r0 = new fmc.s
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f136358w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            r0.f136358w = r3
            java.lang.Object r6 = r5.d(r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L41:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r6.next()
            r1 = r0
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Portfolio r1 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Portfolio) r1
            com.revolut.shared.feature.wealth.models.trading_accounts.a r2 = com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE
            com.revolut.shared.feature.wealth.models.trading_accounts.a r3 = com.revolut.shared.feature.wealth.models.trading_accounts.a.SUSPENDED
            com.revolut.shared.feature.wealth.models.trading_accounts.a r4 = com.revolut.shared.feature.wealth.models.trading_accounts.a.OFFBOARDING
            com.revolut.shared.feature.wealth.models.trading_accounts.a[] r2 = new com.revolut.shared.feature.wealth.models.trading_accounts.a[]{r2, r3, r4}
            com.revolut.shared.feature.wealth.models.trading_accounts.a r1 = r1.f105211b
            boolean r1 = kotlin.collections.d.I(r2, r1)
            if (r1 == 0) goto L41
            return r0
        L61:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fmc.v.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof fmc.t
            if (r0 == 0) goto L13
            r0 = r6
            fmc.t r0 = (fmc.t) r0
            int r1 = r0.f136360x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f136360x = r1
            goto L18
        L13:
            fmc.t r0 = new fmc.t
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f136360x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f136360x = r3
            java.lang.Object r6 = r4.d(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L45:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r6.next()
            r1 = r0
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Portfolio r1 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Portfolio) r1
            java.util.UUID r1 = r1.f105210a
            java.lang.String r1 = r1.toString()
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            if (r1 == 0) goto L45
            return r0
        L5f:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fmc.v.c(java.lang.String, gim.c):java.lang.Object");
    }

    public final Object d(gim.c cVar) {
        return vkm.q.x(rd0.e.e(mo3.a.g(nim.a.v(tzg.m.a(this.f136361a, WealthAccountType.ROBO), new fkh.f(9)), null, null, 3), h0.f322473a, new u(3, null)), cVar);
    }
}
