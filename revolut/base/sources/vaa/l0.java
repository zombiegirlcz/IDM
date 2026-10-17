package vaa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kz9.a f287205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f287206b;

    public l0(kz9.a chatNavigationProvider, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(chatNavigationProvider, "chatNavigationProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f287205a = chatNavigationProvider;
        this.f287206b = walletInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r1 instanceof vaa.k0
            if (r2 == 0) goto L17
            r2 = r1
            vaa.k0 r2 = (vaa.k0) r2
            int r3 = r2.f287203w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f287203w = r3
            goto L1c
        L17:
            vaa.k0 r2 = new vaa.k0
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f287203w
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L51
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            yhm.o.b(r1)
            xi0.a r1 = xi0.b.Companion
            r1.getClass()
            xi0.b r7 = xi0.b.D
            r10 = 0
            r11 = 62
            wsg.n r6 = r0.f287206b
            r8 = 0
            r9 = 0
            efm.d0 r1 = osg.b.r(r6, r7, r8, r9, r10, r11)
            r2.f287203w = r5
            java.lang.Object r1 = nim.a.b(r1, r2)
            if (r1 != r3) goto L51
            return r3
        L51:
            io3.d r1 = (io3.d) r1
            com.revolut.feature.transactions.api.navigation.TransactionListDestination r2 = new com.revolut.feature.transactions.api.navigation.TransactionListDestination
            com.revolut.feature.transactions.api.navigation.TransactionListDestination$InputData r3 = new com.revolut.feature.transactions.api.navigation.TransactionListDestination$InputData
            com.revolut.feature.transactions.api.navigation.TransactionsListFilterType$ByAccounts r8 = new com.revolut.feature.transactions.api.navigation.TransactionsListFilterType$ByAccounts
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r4 = new com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main
            com.revolut.feature.tab.accounts.models.ProductId r5 = com.revolut.feature.tab.accounts.models.ProductId.CURRENCY
            com.revolut.feature.tab.accounts.models.ProductAccountId r6 = new com.revolut.feature.tab.accounts.models.ProductAccountId
            java.lang.String r1 = r1.f163145a
            r7 = 0
            r6.<init>(r1, r7)
            r4.<init>(r6, r5)
            r8.<init>(r4, r7)
            r18 = 0
            r19 = 65519(0xffef, float:9.1812E-41)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2.<init>(r3)
            vaa.h0 r1 = new vaa.h0
            r1.<init>(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vaa.l0.a(gim.c):java.lang.Object");
    }
}
