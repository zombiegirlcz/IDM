package tnb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rnb.w f272414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f272415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final djb.n f272416c;

    public t(rnb.w savingsVaultInteractor, wsg.n walletInteractor, djb.n savingsAccountsDetailsInteractor) {
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        this.f272414a = savingsVaultInteractor;
        this.f272415b = walletInteractor;
        this.f272416c = savingsAccountsDetailsInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if (r14 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.tab.accounts.models.ProductAccountId r13, gim.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof tnb.s
            if (r0 == 0) goto L13
            r0 = r14
            tnb.s r0 = (tnb.s) r0
            int r1 = r0.f272413w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f272413w = r1
            goto L18
        L13:
            tnb.s r0 = new tnb.s
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f272413w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r14)
            goto L88
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            yhm.o.b(r14)
            goto L62
        L37:
            yhm.o.b(r14)
            java.lang.String r13 = r13.f89729a
            w4l.h r14 = w4l.h.f294642c
            djb.n r2 = r12.f272416c
            rnb.i r2 = (rnb.i) r2
            efm.r r13 = r2.b(r13, r14)
            efm.r r13 = zi0.c.J(r13)
            tj9.d r14 = new tj9.d
            r2 = 19
            r14.<init>(r2)
            efm.r r13 = m70.a.g(r13, r5, r14, r4)
            vkm.d r13 = rd0.e.b(r13)
            r0.f272413w = r4
            java.lang.Object r14 = vkm.q.x(r13, r0)
            if (r14 != r1) goto L62
            goto L87
        L62:
            com.revolut.feature.shared.savings.models.SavingsAccountDetails r14 = (com.revolut.feature.shared.savings.models.SavingsAccountDetails) r14
            pcd.s r13 = r14.f86460a
            pcd.g0 r13 = r13.f234885h
            xi0.b r7 = r13.f234860b
            r10 = 0
            r11 = 62
            wsg.n r6 = r12.f272415b
            r8 = 0
            r9 = 0
            efm.d0 r13 = osg.b.r(r6, r7, r8, r9, r10, r11)
            com.revolut.core.model.account.AccountId$Personal r14 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r14 = r6.y(r14)
            ufm.i r13 = ue0.e.C(r13, r14)
            r0.f272413w = r3
            java.lang.Object r14 = nim.a.b(r13, r0)
            if (r14 != r1) goto L88
        L87:
            return r1
        L88:
            io3.d r14 = (io3.d) r14
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r13 = new com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main
            com.revolut.feature.tab.accounts.models.ProductId r0 = com.revolut.feature.tab.accounts.models.ProductId.CURRENCY
            com.revolut.feature.tab.accounts.models.ProductAccountId r1 = new com.revolut.feature.tab.accounts.models.ProductAccountId
            java.lang.String r14 = r14.f163145a
            r1.<init>(r14, r5)
            r13.<init>(r1, r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: tnb.t.a(com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }
}
