package i48;

import ang.f;
import cfa.e;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import g48.r0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements nda.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f158313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f158314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f158315c;
    public final r0 d;

    public c(e defaultRemovePocketContentProvider, f userInteractor, n walletInteractor, r0 jointAccountsInteractor) {
        Intrinsics.checkNotNullParameter(defaultRemovePocketContentProvider, "defaultRemovePocketContentProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        this.f158313a = defaultRemovePocketContentProvider;
        this.f158314b = userInteractor;
        this.f158315c = walletInteractor;
        this.d = jointAccountsInteractor;
    }

    @Override // nda.b
    public final Object a(ProductAccountId productAccountId, boolean z, Continuation continuation) {
        return this.f158313a.a(productAccountId, z, continuation);
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
            boolean r0 = r10 instanceof i48.a
            if (r0 == 0) goto L13
            r0 = r10
            i48.a r0 = (i48.a) r0
            int r1 = r0.f158309x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f158309x = r1
            goto L18
        L13:
            i48.a r0 = new i48.a
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f158309x
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
            r0.f158309x = r3
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
        throw new UnsupportedOperationException("Method not decompiled: i48.c.b(com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (r10 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.tab.accounts.models.ProductAccountId r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof i48.b
            if (r0 == 0) goto L13
            r0 = r10
            i48.b r0 = (i48.b) r0
            int r1 = r0.f158312y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f158312y = r1
            goto L18
        L13:
            i48.b r0 = new i48.b
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f158310w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f158312y
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L43
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            io3.d r9 = r0.v
            yhm.o.b(r10)
            goto L80
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            yhm.o.b(r10)
            goto L6a
        L3d:
            com.revolut.feature.tab.accounts.models.ProductAccountId r9 = r0.u
            yhm.o.b(r10)
            goto L53
        L43:
            yhm.o.b(r10)
            r0.u = r9
            r0.f158312y = r6
            g48.r0 r10 = r8.d
            java.lang.Object r10 = t38.s.a(r10, r0)
            if (r10 != r1) goto L53
            goto L7f
        L53:
            com.revolut.core.model.account.AccountId$Joint r10 = (com.revolut.core.model.account.AccountId.Joint) r10
            if (r10 == 0) goto Lb5
            wsg.n r2 = r8.f158315c
            java.lang.String r9 = r9.f89729a
            efm.d0 r9 = r2.z(r10, r9)
            r0.u = r7
            r0.f158312y = r5
            java.lang.Object r10 = nim.a.b(r9, r0)
            if (r10 != r1) goto L6a
            goto L7f
        L6a:
            r9 = r10
            io3.d r9 = (io3.d) r9
            ang.f r10 = r8.f158314b
            efm.d0 r10 = r10.f(r3)
            r0.u = r7
            r0.v = r9
            r0.f158312y = r4
            java.lang.Object r10 = nim.a.b(r10, r0)
            if (r10 != r1) goto L80
        L7f:
            return r1
        L80:
            do3.n r10 = (do3.n) r10
            io3.k r9 = r9.f
            io3.k r0 = io3.k.DELISTED
            if (r9 != r0) goto L89
            r3 = r6
        L89:
            boolean r9 = te0.w.V(r10)
            r10 = 14
            if (r9 == 0) goto La3
            if (r3 == 0) goto L9b
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_body_delisted_currency
            r9.<init>(r0, r7, r7, r10)
            return r9
        L9b:
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_body_currency
            r9.<init>(r0, r7, r7, r10)
            return r9
        La3:
            if (r3 == 0) goto Lad
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_body_delisted_account
            r9.<init>(r0, r7, r7, r10)
            return r9
        Lad:
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_currency_account_body_account
            r9.<init>(r0, r7, r7, r10)
            return r9
        Lb5:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Joint Account must be active"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i48.c.c(com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }
}
