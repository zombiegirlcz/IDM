package elf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n0 extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f127378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ra7.d f127379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final klf.h0 f127380n;

    public n0(com.revolut.domain.interactors.transactions.a transactionsInteractor, ra7.d hideTransactionDialogProvider, klf.h0 commonDataSource) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(hideTransactionDialogProvider, "hideTransactionDialogProvider");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        this.f127378l = transactionsInteractor;
        this.f127379m = hideTransactionDialogProvider;
        this.f127380n = commonDataSource;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (nim.a.a(r1, r2) == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r23) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.n0.Z2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (nim.a.a(r0, r2) == r3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r12, java.lang.String r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r2 = r14 instanceof elf.k0
            if (r2 == 0) goto L13
            r2 = r14
            elf.k0 r2 = (elf.k0) r2
            int r3 = r2.f127360x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L13
            int r3 = r3 - r4
            r2.f127360x = r3
            goto L1b
        L13:
            elf.k0 r2 = new elf.k0
            r1 = r14
            gim.c r1 = (gim.c) r1
            r2.<init>(r11, r1)
        L1b:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f127360x
            r5 = 0
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L44
            if (r4 == r8) goto L40
            if (r4 == r7) goto L3a
            if (r4 != r6) goto L32
            yhm.o.b(r1)
            goto L8a
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            com.revolut.domain.interactors.transactions.a r0 = r2.u
            yhm.o.b(r1)
            goto L77
        L40:
            yhm.o.b(r1)
            return r1
        L44:
            yhm.o.b(r1)
            java.lang.String r1 = "ID_MENU_ITEM_HIDE_TRANSACTION"
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r13, r1)
            if (r1 == 0) goto L59
            r2.f127360x = r8
            java.lang.Object r0 = r11.Z2(r2)
            if (r0 != r3) goto L58
            goto L89
        L58:
            return r0
        L59:
            java.lang.String r1 = "ID_MENU_ITEM_UNHIDE_TRANSACTION"
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r13, r1)
            if (r0 == 0) goto Laa
            klf.h0 r0 = r11.f127380n
            kotlinx.coroutines.flow.SharedFlow r0 = r0.d()
            com.revolut.domain.interactors.transactions.a r1 = r11.f127378l
            r2.u = r1
            r2.f127360x = r7
            java.lang.Object r0 = vkm.q.x(r0, r2)
            if (r0 != r3) goto L74
            goto L89
        L74:
            r10 = r1
            r1 = r0
            r0 = r10
        L77:
            tof.a3 r1 = (tof.a3) r1
            mjf.b0 r0 = (mjf.b0) r0
            pfm.r r0 = r0.s(r1, r5)
            r2.u = r9
            r2.f127360x = r6
            java.lang.Object r0 = nim.a.a(r0, r2)
            if (r0 != r3) goto L8a
        L89:
            return r3
        L8a:
            ra7.d r0 = r11.f127379m
            za7.d r0 = (za7.d) r0
            r0.getClass()
            mii.k r1 = new mii.k
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.feature.hidden_accounts.impl.R$string.hidden_transaction_unhide_success
            r2 = 14
            r3.<init>(r0, r9, r9, r2)
            r6 = 0
            r7 = 28
            java.lang.String r2 = "TRANSACTION_UNHIDDEN_DIALOG_ID"
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r11.L2(r1)
            r5 = r8
        Laa:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.n0.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
