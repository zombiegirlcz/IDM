package opf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class z implements xof.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wzg.a f227651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k18.c f227652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g26.b f227653c;
    public final wa7.m d;
    public final b e;
    public final djb.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rnb.p f227654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k7i.i f227655h;
    public final jx0.a i;

    public z(wzg.a cashHoldingsInteractor, k18.c deFiAccountsInteractor, g26.b deFiAssetDetailsInteractor, wa7.m hiddenAccountsInteractor, b paymentsPocketInteractor, djb.n savingAccountsInteractor, rnb.p savingsDisclaimersDelegate, k7i.i transferWalletInteractor, jx0.a transferCountryProfilesInteractor) {
        Intrinsics.checkNotNullParameter(cashHoldingsInteractor, "cashHoldingsInteractor");
        Intrinsics.checkNotNullParameter(deFiAccountsInteractor, "deFiAccountsInteractor");
        Intrinsics.checkNotNullParameter(deFiAssetDetailsInteractor, "deFiAssetDetailsInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(paymentsPocketInteractor, "paymentsPocketInteractor");
        Intrinsics.checkNotNullParameter(savingAccountsInteractor, "savingAccountsInteractor");
        Intrinsics.checkNotNullParameter(savingsDisclaimersDelegate, "savingsDisclaimersDelegate");
        Intrinsics.checkNotNullParameter(transferWalletInteractor, "transferWalletInteractor");
        Intrinsics.checkNotNullParameter(transferCountryProfilesInteractor, "transferCountryProfilesInteractor");
        this.f227651a = cashHoldingsInteractor;
        this.f227652b = deFiAccountsInteractor;
        this.f227653c = deFiAssetDetailsInteractor;
        this.d = hiddenAccountsInteractor;
        this.e = paymentsPocketInteractor;
        this.f = savingAccountsInteractor;
        this.f227654g = savingsDisclaimersDelegate;
        this.f227655h = transferWalletInteractor;
        this.i = transferCountryProfilesInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof opf.r
            if (r0 == 0) goto L13
            r0 = r9
            opf.r r0 = (opf.r) r0
            int r1 = r0.f227631y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f227631y = r1
            goto L18
        L13:
            opf.r r0 = new opf.r
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f227629w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f227631y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            com.revolut.feature.defi.accounts.api.model.DeFiBalance r8 = r0.v
            yhm.o.b(r9)
            goto Laf
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L6a
        L3c:
            yhm.o.b(r9)
            k18.c r9 = r7.f227652b
            wkm.l r9 = r9.F()
            q09.a r2 = new q09.a
            r6 = 15
            r2.<init>(r6)
            akg.n r9 = nim.a.v(r9, r2)
            kotlinx.coroutines.flow.Flow r9 = vkm.q.q(r9)
            op0.v3 r2 = new op0.v3
            r6 = 26
            r2.<init>(r6)
            jhi.b r9 = mo3.a.g(r9, r5, r2, r4)
            r0.u = r8
            r0.f227631y = r4
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L6a
            goto Lae
        L6a:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L70:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r9.next()
            r6 = r2
            com.revolut.feature.defi.accounts.api.model.DeFiBalance r6 = (com.revolut.feature.defi.accounts.api.model.DeFiBalance) r6
            java.lang.String r6 = r6.f71638g
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r8)
            if (r6 == 0) goto L70
            goto L87
        L86:
            r2 = r5
        L87:
            r8 = r2
            com.revolut.feature.defi.accounts.api.model.DeFiBalance r8 = (com.revolut.feature.defi.accounts.api.model.DeFiBalance) r8
            if (r8 != 0) goto L8d
            return r5
        L8d:
            java.lang.String r9 = r8.f71635a
            w4l.j r2 = w4l.j.f294644c
            g26.b r6 = r7.f227653c
            wkm.l r9 = r6.a(r9, r2)
            op0.v3 r2 = new op0.v3
            r6 = 27
            r2.<init>(r6)
            jhi.b r9 = mo3.a.g(r9, r5, r2, r4)
            r0.u = r5
            r0.v = r8
            r0.f227631y = r3
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto Laf
        Lae:
            return r1
        Laf:
            com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails r9 = (com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails) r9
            com.revolut.feature.defi.asset_details.api.model.DefiCurrency r9 = r9.f71665a
            com.revolut.feature.transfer.core.models.DeFiBalanceSource r0 = new com.revolut.feature.transfer.core.models.DeFiBalanceSource
            java.lang.String r1 = r8.f71638g
            java.lang.String r2 = r9.f71672b
            java.lang.String r3 = r9.f71673c
            java.lang.String r4 = r9.f
            ej0.b r5 = r8.a()
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: opf.z.c(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        if (r12 == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0090, code lost:
    
        if (r12 == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a8, code lost:
    
        if (r12 == r1) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.core.model.account.AccountId r11, gim.c r12, java.lang.String r13, k1j.a r14) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: opf.z.d(com.revolut.core.model.account.AccountId, gim.c, java.lang.String, k1j.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0264, code lost:
    
        if (r0 == r3) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ff, code lost:
    
        if (r0 != r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0119, code lost:
    
        if (r0 == r3) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ed, code lost:
    
        if (r0 != r3) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.feature.transfer.core.models.TransferMoneyPocket r14, com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy r15, java.util.List r16, kotlin.jvm.functions.Function1 r17, gim.c r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: opf.z.e(com.revolut.feature.transfer.core.models.TransferMoneyPocket, com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy, java.util.List, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(com.revolut.core.model.account.AccountId r6, java.util.List r7, com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy r8, io3.l r9, gim.c r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof opf.u
            if (r0 == 0) goto L13
            r0 = r10
            opf.u r0 = (opf.u) r0
            int r1 = r0.f227639x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f227639x = r1
            goto L18
        L13:
            opf.u r0 = new opf.u
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f227639x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            io3.d r6 = r0.u
            yhm.o.b(r10)
            goto L5c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r10)
            goto L4a
        L38:
            yhm.o.b(r10)
            opf.b r10 = r5.e
            ufm.i r6 = r10.a(r8, r7, r9, r6)
            r0.f227639x = r4
            java.lang.Object r10 = nim.a.b(r6, r0)
            if (r10 != r1) goto L4a
            goto L5b
        L4a:
            r6 = r10
            io3.d r6 = (io3.d) r6
            java.lang.String r7 = r6.f163145a
            r0.u = r6
            r0.f227639x = r3
            k7i.i r8 = r5.f227655h
            java.lang.Object r10 = r8.j(r7, r0)
            if (r10 != r1) goto L5c
        L5b:
            return r1
        L5c:
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r6, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: opf.z.f(com.revolut.core.model.account.AccountId, java.util.List, com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy, io3.l, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if (r9 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.core.model.account.AccountId r8, gim.c r9, java.lang.String r10) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof opf.v
            if (r0 == 0) goto L13
            r0 = r9
            opf.v r0 = (opf.v) r0
            int r1 = r0.f227642y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f227642y = r1
            goto L18
        L13:
            opf.v r0 = new opf.v
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f227640w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f227642y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r9)
            goto Lb5
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            com.revolut.core.model.account.AccountId r8 = r0.v
            java.lang.String r10 = r0.u
            yhm.o.b(r9)
            goto L7f
        L3c:
            yhm.o.b(r9)
            boolean r9 = r8 instanceof com.revolut.core.model.account.AccountId.Joint
            if (r9 == 0) goto L46
            djb.k$a r9 = djb.k.a.f115281a
            goto L50
        L46:
            com.revolut.core.model.account.AccountId$Personal r9 = com.revolut.core.model.account.AccountId.Personal.f51414a
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r8, r9)
            if (r9 == 0) goto Lb9
            djb.k$b r9 = djb.k.b.f115282a
        L50:
            w4l.j r2 = w4l.j.f294644c
            djb.n r6 = r7.f
            rnb.i r6 = (rnb.i) r6
            efm.r r9 = r6.f(r9, r2)
            efm.r r9 = zi0.c.J(r9)
            op0.v3 r2 = new op0.v3
            r6 = 25
            r2.<init>(r6)
            efm.r r9 = m70.a.g(r9, r5, r2, r4)
            efm.d0 r9 = r9.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            r0.u = r10
            r0.v = r8
            r0.f227642y = r4
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L7f
            goto Lb4
        L7f:
            ejb.b r9 = (ejb.b) r9
            java.util.List r9 = r9.f126837b
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L89:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto La3
            java.lang.Object r2 = r9.next()
            r4 = r2
            com.revolut.feature.shared.savings.models.SavingsAccountDetails r4 = (com.revolut.feature.shared.savings.models.SavingsAccountDetails) r4
            pcd.s r4 = r4.f86460a
            java.lang.String r4 = r4.f()
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r10)
            if (r4 == 0) goto L89
            goto La4
        La3:
            r2 = r5
        La4:
            com.revolut.feature.shared.savings.models.SavingsAccountDetails r2 = (com.revolut.feature.shared.savings.models.SavingsAccountDetails) r2
            if (r2 == 0) goto Lb8
            r0.u = r5
            r0.v = r5
            r0.f227642y = r3
            java.lang.Object r9 = r7.j(r2, r8, r0)
            if (r9 != r1) goto Lb5
        Lb4:
            return r1
        Lb5:
            com.revolut.feature.transfer.core.models.SavingsAccount r9 = (com.revolut.feature.transfer.core.models.SavingsAccount) r9
            return r9
        Lb8:
            return r5
        Lb9:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: opf.z.g(com.revolut.core.model.account.AccountId, gim.c, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0134, code lost:
    
        if (r0 == r8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016a, code lost:
    
        if (r0 == r8) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.revolut.feature.transfer.core.models.SourceAccount$Pocket, io3.l] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy, com.revolut.feature.transfer.core.models.SourceAccount$Pocket, io3.l, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy, com.revolut.feature.transfer.core.models.SourceAccount$Pocket, io3.l, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, opf.z] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.transfer.core.models.SourceAccount.Pocket r16, com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy r17, java.util.List r18, gim.c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: opf.z.h(com.revolut.feature.transfer.core.models.SourceAccount$Pocket, com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy, java.util.List, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r7, xi0.b r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: opf.z.i(java.lang.String, xi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.revolut.feature.shared.savings.models.SavingsAccountDetails r25, com.revolut.core.model.account.AccountId r26, gim.c r27) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: opf.z.j(com.revolut.feature.shared.savings.models.SavingsAccountDetails, com.revolut.core.model.account.AccountId, gim.c):java.lang.Object");
    }
}
