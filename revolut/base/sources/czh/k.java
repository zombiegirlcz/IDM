package czh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wsg.n;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zjh.f f110254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f110255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f110256c;

    public k(zjh.f cryptoExchangeSecondaryPocketRepository, n walletInteractor, b balancesProvider) {
        Intrinsics.checkNotNullParameter(cryptoExchangeSecondaryPocketRepository, "cryptoExchangeSecondaryPocketRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(balancesProvider, "balancesProvider");
        this.f110254a = cryptoExchangeSecondaryPocketRepository;
        this.f110255b = walletInteractor;
        this.f110256c = balancesProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof czh.f
            if (r0 == 0) goto L13
            r0 = r5
            czh.f r0 = (czh.f) r0
            int r1 = r0.f110241w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f110241w = r1
            goto L18
        L13:
            czh.f r0 = new czh.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f110241w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            wsg.n r5 = r4.f110255b
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r5 = r5.y(r2)
            r0.f110241w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: czh.k.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(xi0.b r6, java.util.List r7, wd6.e r8, wd6.h r9, boolean r10, gim.c r11) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r11 instanceof czh.g
            if (r0 == 0) goto L14
            r0 = r11
            czh.g r0 = (czh.g) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.B = r1
        L12:
            r11 = r0
            goto L1a
        L14:
            czh.g r0 = new czh.g
            r0.<init>(r5, r11)
            goto L12
        L1a:
            java.lang.Object r0 = r11.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r11.B
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            czh.d r6 = r11.f110243x
            yhm.o.b(r0)
            goto L8e
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            boolean r10 = r11.f110244y
            wd6.h r9 = r11.f110242w
            wd6.e r8 = r11.v
            xi0.b r6 = r11.u
            yhm.o.b(r0)
        L41:
            r7 = r6
            goto L57
        L43:
            yhm.o.b(r0)
            r11.u = r6
            r11.v = r8
            r11.f110242w = r9
            r11.f110244y = r10
            r11.B = r4
            java.lang.Object r0 = r5.e(r8, r7, r10, r11)
            if (r0 != r1) goto L41
            goto L8b
        L57:
            com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper r0 = (com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper) r0
            if (r0 == 0) goto L75
            czh.d r6 = czh.k.Companion
            r6.getClass()
            czh.e r6 = new czh.e
            xi0.b r7 = r0.getF99406c()
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails$BalanceIdentifier$Pocket r8 = new com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails$BalanceIdentifier$Pocket
            java.lang.String r9 = r0.f99404a
            com.revolut.core.model.account.AccountId r10 = r0.getD()
            r8.<init>(r10, r9)
            r6.<init>(r7, r8)
            return r6
        L75:
            czh.d r0 = czh.k.Companion
            r6 = 0
            r11.u = r6
            r11.v = r6
            r11.f110242w = r6
            r11.f110243x = r0
            r11.f110244y = r10
            r11.B = r3
            r6 = r5
            java.io.Serializable r7 = r6.c(r7, r8, r9, r10, r11)
            if (r7 != r1) goto L8c
        L8b:
            return r1
        L8c:
            r6 = r0
            r0 = r7
        L8e:
            io3.d r0 = (io3.d) r0
            r6.getClass()
            com.revolut.core.model.account.AccountId$Personal r6 = com.revolut.core.model.account.AccountId.Personal.f51414a
            czh.e r6 = czh.d.a(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: czh.k.b(xi0.b, java.util.List, wd6.e, wd6.h, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(xi0.b r9, wd6.e r10, wd6.h r11, boolean r12, gim.c r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof czh.h
            if (r0 == 0) goto L14
            r0 = r13
            czh.h r0 = (czh.h) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.B = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            czh.h r0 = new czh.h
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.z
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.B
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L45
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            io3.d r9 = r7.f110246x
            yhm.o.b(r13)
            goto L7e
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            boolean r12 = r7.f110247y
            wd6.h r11 = r7.f110245w
            wd6.e r10 = r7.v
            xi0.b r9 = r7.u
            yhm.o.b(r13)
        L41:
            r4 = r10
            r5 = r11
            r6 = r12
            goto L59
        L45:
            yhm.o.b(r13)
            r7.u = r9
            r7.v = r10
            r7.f110245w = r11
            r7.f110247y = r12
            r7.B = r3
            java.lang.Object r13 = r8.a(r7)
            if (r13 != r0) goto L41
            goto L7c
        L59:
            r10 = r13
            io3.d r10 = (io3.d) r10
            xi0.a r11 = xi0.b.Companion
            java.lang.String r12 = r10.f163147c
            r11.getClass()
            xi0.b r3 = xi0.a.a(r12)
            r11 = 0
            r7.u = r11
            r7.v = r11
            r7.f110245w = r11
            r7.f110246x = r10
            r7.f110247y = r6
            r7.B = r2
            r1 = r8
            r2 = r9
            java.io.Serializable r13 = r1.d(r2, r3, r4, r5, r6, r7)
            if (r13 != r0) goto L7d
        L7c:
            return r0
        L7d:
            r9 = r10
        L7e:
            io3.d r13 = (io3.d) r13
            if (r13 != 0) goto L83
            return r9
        L83:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: czh.k.c(xi0.b, wd6.e, wd6.h, boolean, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d9, code lost:
    
        if (r1 == r4) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Serializable, kotlin.jvm.functions.Function2, xi0.b] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(xi0.b r18, xi0.b r19, wd6.e r20, wd6.h r21, boolean r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: czh.k.d(xi0.b, xi0.b, wd6.e, wd6.h, boolean, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(wd6.e r8, java.util.List r9, boolean r10, gim.c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: czh.k.e(wd6.e, java.util.List, boolean, gim.c):java.lang.Object");
    }
}
