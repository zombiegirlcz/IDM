package pye;

import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f240816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f240817b;

    public g(zf3.a checkTopupInteractor, fk3.a configurationInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(checkTopupInteractor, "checkTopupInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f240816a = configurationInteractor;
        this.f240817b = walletInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof pye.d
            if (r0 == 0) goto L13
            r0 = r5
            pye.d r0 = (pye.d) r0
            int r1 = r0.f240813w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f240813w = r1
            goto L18
        L13:
            pye.d r0 = new pye.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f240813w
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
            r0.f240813w = r3
            java.lang.Object r5 = r4.b(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L48:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r5.next()
            boolean r2 = r1 instanceof com.revolut.feature.wallets.api.module.WalletLimit.CounterLimit
            if (r2 == 0) goto L48
            r0.add(r1)
            goto L48
        L5a:
            java.util.Iterator r5 = r0.iterator()
        L5e:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L73
            java.lang.Object r0 = r5.next()
            r2 = r0
            com.revolut.feature.wallets.api.module.WalletLimit$CounterLimit r2 = (com.revolut.feature.wallets.api.module.WalletLimit.CounterLimit) r2
            com.revolut.feature.wallets.api.module.a r2 = r2.f94844a
            com.revolut.feature.wallets.api.module.a r3 = com.revolut.feature.wallets.api.module.a.DIRECT_DEBIT_MONTHLY
            if (r2 != r3) goto L5e
            goto L74
        L73:
            r0 = r1
        L74:
            com.revolut.feature.wallets.api.module.WalletLimit$CounterLimit r0 = (com.revolut.feature.wallets.api.module.WalletLimit.CounterLimit) r0
            if (r0 != 0) goto L79
            return r1
        L79:
            e1f.a r5 = new e1f.a
            dj0.d r1 = r0.f94846c
            dj0.d r0 = r0.e
            r5.<init>(r1, r0)
            jye.a r0 = new jye.a
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pye.g.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof pye.e
            if (r0 == 0) goto L13
            r0 = r12
            pye.e r0 = (pye.e) r0
            int r1 = r0.f240814w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f240814w = r1
            goto L18
        L13:
            pye.e r0 = new pye.e
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f240814w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L58
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2f:
            yhm.o.b(r12)
            r12 = 0
            r2 = 3
            wsg.n r4 = r11.f240817b
            efm.r r5 = osg.b.k(r4, r12, r2)
            r8 = 0
            r10 = 31
            r6 = 0
            efm.r r12 = rd0.e.p(r5, r6, r8, r10)
            pyb.g r2 = new pyb.g
            r4 = 4
            r2.<init>(r4)
            r4 = 0
            efm.r r12 = m70.a.g(r12, r4, r2, r3)
            r0.f240814w = r3
            java.lang.Object r12 = nim.a.c(r12, r0)
            if (r12 != r1) goto L58
            return r1
        L58:
            java.lang.String r0 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: pye.g.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof pye.f
            if (r0 == 0) goto L13
            r0 = r8
            pye.f r0 = (pye.f) r0
            int r1 = r0.f240815w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f240815w = r1
            goto L18
        L13:
            pye.f r0 = new pye.f
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f240815w
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            return r8
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            yhm.o.b(r8)
            goto L57
        L37:
            yhm.o.b(r8)
            e7l.g$b r8 = e7l.g.b.f123407a
            fk3.a r2 = r7.f240816a
            ik3.c r2 = (ik3.c) r2
            efm.r r8 = r2.k(r8)
            pyb.g r2 = new pyb.g
            r6 = 3
            r2.<init>(r6)
            efm.r r8 = m70.a.g(r8, r4, r2, r5)
            r0.f240815w = r5
            java.lang.Object r8 = nim.a.c(r8, r0)
            if (r8 != r1) goto L57
            goto L6d
        L57:
            e7l.f r8 = (e7l.f) r8
            e7l.a r8 = r8.C0
            int[] r2 = pye.c.f240812a
            int r8 = r8.ordinal()
            r8 = r2[r8]
            if (r8 != r5) goto L6f
            r0.f240815w = r3
            java.lang.Object r8 = r7.a(r0)
            if (r8 != r1) goto L6e
        L6d:
            return r1
        L6e:
            return r8
        L6f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pye.g.c(gim.c):java.lang.Object");
    }
}
