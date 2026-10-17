package cfa;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements nda.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f23666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f23667b;

    public e(ang.f userInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f23666a = userInteractor;
        this.f23667b = walletInteractor;
    }

    @Override // nda.b
    public final Object a(ProductAccountId productAccountId, boolean z, Continuation continuation) {
        return z ? e((gim.c) continuation) : d((gim.c) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // xfe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.tab.accounts.models.ProductAccountId r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof cfa.a
            if (r0 == 0) goto L13
            r0 = r10
            cfa.a r0 = (cfa.a) r0
            int r1 = r0.f23661x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23661x = r1
            goto L18
        L13:
            cfa.a r0 = new cfa.a
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23661x
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = r0.u
            yhm.o.b(r10)
            r3 = r9
            goto L4c
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            yhm.o.b(r10)
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_title
            r4 = 14
            r5 = 0
            r10.<init>(r2, r5, r5, r4)
            r0.u = r10
            r0.f23661x = r3
            java.lang.Object r9 = r8.c(r9, r0)
            if (r9 != r1) goto L4a
            return r1
        L4a:
            r3 = r10
            r10 = r9
        L4c:
            r4 = r10
            com.revolut.core.ui_kit.models.Clause r4 = (com.revolut.core.ui_kit.models.Clause) r4
            xfe.d r2 = new xfe.d
            r5 = 0
            r6 = 0
            r7 = 12
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cfa.e.b(com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.tab.accounts.models.ProductAccountId r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof cfa.b
            if (r0 == 0) goto L13
            r0 = r8
            cfa.b r0 = (cfa.b) r0
            int r1 = r0.f23663x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23663x = r1
            goto L18
        L13:
            cfa.b r0 = new cfa.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23663x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            io3.d r7 = r0.u
            yhm.o.b(r8)
            goto L63
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            goto L4f
        L39:
            yhm.o.b(r8)
            java.lang.String r7 = r7.f89729a
            com.revolut.core.model.account.AccountId$Personal r8 = com.revolut.core.model.account.AccountId.Personal.f51414a
            wsg.n r2 = r6.f23667b
            efm.d0 r7 = r2.z(r8, r7)
            r0.f23663x = r5
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L4f
            goto L62
        L4f:
            r7 = r8
            io3.d r7 = (io3.d) r7
            ang.f r8 = r6.f23666a
            efm.d0 r8 = r8.f(r3)
            r0.u = r7
            r0.f23663x = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L63
        L62:
            return r1
        L63:
            do3.n r8 = (do3.n) r8
            io3.k r7 = r7.f
            io3.k r0 = io3.k.DELISTED
            if (r7 != r0) goto L6c
            r3 = r5
        L6c:
            boolean r7 = te0.w.V(r8)
            r8 = 14
            r0 = 0
            if (r7 == 0) goto L87
            if (r3 == 0) goto L7f
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_body_delisted_currency
            r7.<init>(r1, r0, r0, r8)
            return r7
        L7f:
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_body_currency
            r7.<init>(r1, r0, r0, r8)
            return r7
        L87:
            if (r3 == 0) goto L91
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_body_delisted_account
            r7.<init>(r1, r0, r0, r8)
            return r7
        L91:
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_body_account
            r7.<init>(r1, r0, r0, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cfa.e.c(com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof cfa.c
            if (r0 == 0) goto L13
            r0 = r7
            cfa.c r0 = (cfa.c) r0
            int r1 = r0.f23664w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23664w = r1
            goto L18
        L13:
            cfa.c r0 = new cfa.c
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23664w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L42
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            ang.f r7 = r6.f23666a
            r2 = 0
            efm.d0 r7 = r7.f(r2)
            r0.f23664w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L42
            return r1
        L42:
            do3.n r7 = (do3.n) r7
            boolean r7 = te0.w.V(r7)
            r0 = 14
            r1 = 0
            if (r7 == 0) goto L68
            nda.a r7 = new nda.a
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_negative_balance_warning_title
            r2.<init>(r3, r1, r1, r0)
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_negative_balance_warning_body_currency
            r3.<init>(r4, r1, r1, r0)
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_negative_balance_warning_title
            r4.<init>(r5, r1, r1, r0)
            r7.<init>(r2, r3, r4)
            return r7
        L68:
            nda.a r7 = new nda.a
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_negative_balance_warning_title
            r2.<init>(r3, r1, r1, r0)
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_negative_balance_warning_body
            r3.<init>(r4, r1, r1, r0)
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_negative_balance_warning_title
            r4.<init>(r5, r1, r1, r0)
            r7.<init>(r2, r3, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cfa.e.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof cfa.d
            if (r0 == 0) goto L13
            r0 = r7
            cfa.d r0 = (cfa.d) r0
            int r1 = r0.f23665w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23665w = r1
            goto L18
        L13:
            cfa.d r0 = new cfa.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23665w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L42
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            ang.f r7 = r6.f23666a
            r2 = 0
            efm.d0 r7 = r7.f(r2)
            r0.f23665w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L42
            return r1
        L42:
            do3.n r7 = (do3.n) r7
            boolean r7 = te0.w.V(r7)
            r0 = 14
            r1 = 0
            if (r7 == 0) goto L68
            nda.a r7 = new nda.a
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_positive_balance_warning_title_currency
            r2.<init>(r3, r1, r1, r0)
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_positive_balance_warning_body_currency
            r3.<init>(r4, r1, r1, r0)
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_positive_balance_warning_action
            r4.<init>(r5, r1, r1, r0)
            r7.<init>(r2, r3, r4)
            return r7
        L68:
            nda.a r7 = new nda.a
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_positive_balance_warning_title
            r2.<init>(r3, r1, r1, r0)
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_positive_balance_warning_body
            r3.<init>(r4, r1, r1, r0)
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_positive_balance_warning_action
            r4.<init>(r5, r1, r1, r0)
            r7.<init>(r2, r3, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cfa.e.e(gim.c):java.lang.Object");
    }
}
