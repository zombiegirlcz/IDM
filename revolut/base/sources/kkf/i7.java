package kkf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class i7 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184753l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nhf.a f184754m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final klf.z2 f184755n;
    public final klf.c o;

    public i7(klf.h0 commonDataSource, nhf.a unitedWalletInteractor, klf.z2 subscriptionDataSource, klf.c blockedMerchantDataSource) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(subscriptionDataSource, "subscriptionDataSource");
        Intrinsics.checkNotNullParameter(blockedMerchantDataSource, "blockedMerchantDataSource");
        this.f184753l = commonDataSource;
        this.f184754m = unitedWalletInteractor;
        this.f184755n = subscriptionDataSource;
        this.o = blockedMerchantDataSource;
    }

    public final cmf.p Z2(nof.i statisticsProvider) {
        Intrinsics.checkNotNullParameter(statisticsProvider, "statisticsProvider");
        klf.h0 h0Var = this.f184753l;
        return new cmf.p(ta6.a.g(zi0.c.w(vkm.q.Q(h0Var.d(), new m5(null, statisticsProvider, 3))), this.f184755n.a(), (SharedFlow) this.o.e.getValue(), h0Var.d(), new g7(this, statisticsProvider, null)), new chc.c0(23), zhm.u.c(this), "Statistics");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(java.lang.Object r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kkf.h7
            if (r0 == 0) goto L13
            r0 = r9
            kkf.h7 r0 = (kkf.h7) r0
            int r1 = r0.f184726x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184726x = r1
            goto L18
        L13:
            kkf.h7 r0 = new kkf.h7
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184726x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            nof.d r8 = r0.u
            yhm.o.b(r9)
            goto L8f
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            nof.d r8 = r0.u
            yhm.o.b(r9)
            goto L5c
        L3b:
            yhm.o.b(r9)
            boolean r9 = r8 instanceof nof.d
            if (r9 == 0) goto L45
            nof.d r8 = (nof.d) r8
            goto L46
        L45:
            r8 = r5
        L46:
            if (r8 != 0) goto L4b
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L4b:
            klf.h0 r9 = r7.f184753l
            kotlinx.coroutines.flow.SharedFlow r9 = r9.d()
            r0.u = r8
            r0.f184726x = r4
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L5c
            goto L8e
        L5c:
            tof.a3 r9 = (tof.a3) r9
            r0.u = r8
            r0.f184726x = r3
            boolean r9 = k71.k.M0(r9)
            if (r9 != 0) goto L6b
            com.revolut.core.model.account.AccountId$Personal r9 = com.revolut.core.model.account.AccountId.Personal.f51414a
            goto L8c
        L6b:
            nhf.a r9 = r7.f184754m
            njf.j r9 = (njf.j) r9
            efm.r r9 = r9.a()
            vkm.d r9 = rd0.e.b(r9)
            kkf.b4 r2 = new kkf.b4
            r3 = 3
            r2.<init>(r3)
            jhi.b r9 = mo3.a.g(r9, r5, r2, r4)
            g48.r r2 = new g48.r
            r3 = 21
            r2.<init>(r9, r3)
            java.lang.Object r9 = vkm.q.x(r2, r0)
        L8c:
            if (r9 != r1) goto L8f
        L8e:
            return r1
        L8f:
            r4 = r9
            com.revolut.core.model.account.AccountId r4 = (com.revolut.core.model.account.AccountId) r4
            com.revolut.feature.transactions.api.navigation.SimpleTransactionsDestination r0 = new com.revolut.feature.transactions.api.navigation.SimpleTransactionsDestination
            java.lang.Object r1 = r8.f218025a
            java.lang.Object r2 = r8.f218026b
            tof.i7 r3 = r8.f218027c
            r5 = 1
            r6 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.A2(r0)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.i7.b3(java.lang.Object, gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return Intrinsics.f(str, "ID_STATS_SEE_ALL") ? b3(obj2, (gim.c) continuation) : Boolean.FALSE;
    }
}
