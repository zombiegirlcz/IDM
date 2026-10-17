package xve;

import elm.f;
import etj.l;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import wsg.n;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements vte.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f309243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eve.b f309244b;

    public d(n walletInteractor, eve.b topUpLimitsRepository) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(topUpLimitsRepository, "topUpLimitsRepository");
        this.f309243a = walletInteractor;
        this.f309244b = topUpLimitsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof xve.a
            if (r0 == 0) goto L13
            r0 = r12
            xve.a r0 = (xve.a) r0
            int r1 = r0.f309240w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f309240w = r1
            goto L18
        L13:
            xve.a r0 = new xve.a
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f309240w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L59
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2f:
            yhm.o.b(r12)
            r12 = 0
            r2 = 3
            wsg.n r4 = r11.f309243a
            efm.r r5 = osg.b.k(r4, r12, r2)
            r8 = 0
            r10 = 31
            r6 = 0
            efm.r r12 = rd0.e.p(r5, r6, r8, r10)
            xti.k r2 = new xti.k
            r4 = 8
            r2.<init>(r4)
            r4 = 0
            efm.r r12 = m70.a.g(r12, r4, r2, r3)
            r0.f309240w = r3
            java.lang.Object r12 = nim.a.c(r12, r0)
            if (r12 != r1) goto L59
            return r1
        L59:
            java.lang.String r0 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: xve.d.a(gim.c):java.lang.Object");
    }

    public final Object b(String str, String str2, gim.c cVar) {
        eve.b bVar = this.f309244b;
        bVar.getClass();
        l lVar = new l(bVar, str, str2, null, 3);
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, lVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r11, gim.c r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof xve.b
            if (r0 == 0) goto L13
            r0 = r12
            xve.b r0 = (xve.b) r0
            int r1 = r0.f309241w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f309241w = r1
            goto L18
        L13:
            xve.b r0 = new xve.b
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f309241w
            r3 = 1
            r8 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r12)
            goto L4e
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            yhm.o.b(r12)
            aue.c r7 = aue.c.UNVERIFIED_CARDS_LIMIT
            r0.f309241w = r3
            eve.b r5 = r10.f309244b
            r5.getClass()
            etj.l r4 = new etj.l
            r9 = 2
            r6 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r11, r4, r0)
            if (r12 != r1) goto L4e
            return r1
        L4e:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r11 = r12.iterator()
        L54:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L6a
            java.lang.Object r12 = r11.next()
            r0 = r12
            aue.b r0 = (aue.b) r0
            aue.c r0 = r0.a()
            aue.c r1 = aue.c.UNVERIFIED_CARDS_LIMIT
            if (r0 != r1) goto L54
            goto L6b
        L6a:
            r12 = r8
        L6b:
            boolean r11 = r12 instanceof aue.a
            if (r11 == 0) goto L72
            aue.a r12 = (aue.a) r12
            return r12
        L72:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xve.d.c(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof xve.c
            if (r0 == 0) goto L13
            r0 = r8
            xve.c r0 = (xve.c) r0
            int r1 = r0.f309242w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f309242w = r1
            goto L18
        L13:
            xve.c r0 = new xve.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f309242w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L3b
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            yhm.o.b(r8)
            r0.f309242w = r3
            java.lang.Object r8 = r7.a(r0)
            if (r8 != r1) goto L3b
            return r1
        L3b:
            java.util.List r8 = (java.util.List) r8
            com.revolut.feature.wallets.api.module.a r0 = com.revolut.feature.wallets.api.module.a.BALANCE_MCY
            com.revolut.feature.wallets.api.module.WalletLimit$CounterLimit r0 = xve.e.a(r8, r0)
            com.revolut.feature.wallets.api.module.a r1 = com.revolut.feature.wallets.api.module.a.ANNUAL_LRS
            com.revolut.feature.wallets.api.module.WalletLimit$CounterLimit r1 = xve.e.a(r8, r1)
            com.revolut.feature.wallets.api.module.a r2 = com.revolut.feature.wallets.api.module.a.DAILY_INBOUND_MCY
            com.revolut.feature.wallets.api.module.WalletLimit$CounterLimit r2 = xve.e.a(r8, r2)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r8 = r8.iterator()
        L5a:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L6c
            java.lang.Object r4 = r8.next()
            boolean r5 = r4 instanceof com.revolut.feature.wallets.api.module.WalletLimit.TransactionLimit
            if (r5 == 0) goto L5a
            r3.add(r4)
            goto L5a
        L6c:
            java.util.Iterator r8 = r3.iterator()
        L70:
            boolean r3 = r8.hasNext()
            r4 = 0
            if (r3 == 0) goto L85
            java.lang.Object r3 = r8.next()
            r5 = r3
            com.revolut.feature.wallets.api.module.WalletLimit$TransactionLimit r5 = (com.revolut.feature.wallets.api.module.WalletLimit.TransactionLimit) r5
            com.revolut.feature.wallets.api.module.c r5 = r5.f94847a
            com.revolut.feature.wallets.api.module.c r6 = com.revolut.feature.wallets.api.module.c.TRANSACTION_INBOUND_MCY
            if (r5 != r6) goto L70
            goto L86
        L85:
            r3 = r4
        L86:
            com.revolut.feature.wallets.api.module.WalletLimit$TransactionLimit r3 = (com.revolut.feature.wallets.api.module.WalletLimit.TransactionLimit) r3
            if (r0 != 0) goto L8f
            if (r1 != 0) goto L8f
            if (r3 != 0) goto L8f
            return r4
        L8f:
            bue.a r8 = new bue.a
            r8.<init>(r1, r0, r2, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xve.d.d(gim.c):java.lang.Object");
    }
}
