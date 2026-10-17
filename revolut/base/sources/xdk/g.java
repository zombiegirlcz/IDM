package xdk;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.DeFiBalanceSource;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.PocketSource;
import com.revolut.feature.transfer.core.models.SavingsAccount;
import com.revolut.feature.transfer.core.models.WealthPortfolio;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f304500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z71.a f304501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wsg.b f304502n;

    public g(a enablePocketDialogMapper, z71.a revolutBankAccountsRepository, wsg.b newWalletsInteractor) {
        Intrinsics.checkNotNullParameter(enablePocketDialogMapper, "enablePocketDialogMapper");
        Intrinsics.checkNotNullParameter(revolutBankAccountsRepository, "revolutBankAccountsRepository");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        this.f304500l = enablePocketDialogMapper;
        this.f304501m = revolutBankAccountsRepository;
        this.f304502n = newWalletsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c3(xdk.g r4, eim.c r5, nii.n1 r6, com.revolut.core.model.account.AccountId r7, java.lang.String r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof xdk.e
            if (r0 == 0) goto L13
            r0 = r9
            xdk.e r0 = (xdk.e) r0
            int r1 = r0.f304496x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f304496x = r1
            goto L18
        L13:
            xdk.e r0 = new xdk.e
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f304496x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            eim.c r5 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L29
            goto L45
        L29:
            r4 = move-exception
            goto L4d
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            yhm.o.b(r9)
            boolean r6 = r6 instanceof nii.l1
            if (r6 == 0) goto L57
            r0.u = r5     // Catch: java.lang.Exception -> L29
            r0.f304496x = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r4 = r4.d3(r7, r0, r8)     // Catch: java.lang.Exception -> L29
            if (r4 != r1) goto L45
            return r1
        L45:
            yhm.m$a r4 = yhm.m.INSTANCE     // Catch: java.lang.Exception -> L29
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L29
            r5.resumeWith(r4)     // Catch: java.lang.Exception -> L29
            goto L5e
        L4d:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r4 = yhm.o.a(r4)
            r5.resumeWith(r4)
            goto L5e
        L57:
            yhm.m$a r4 = yhm.m.INSTANCE
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r5.resumeWith(r4)
        L5e:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xdk.g.c3(xdk.g, eim.c, nii.n1, com.revolut.core.model.account.AccountId, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // xdk.b
    public final Object Z2(AccountId accountId, xi0.b bVar, FundingSource fundingSource, gim.c cVar) {
        if (fundingSource instanceof PocketSource) {
            return b3(accountId, bVar, ((PocketSource) fundingSource).d.f163145a, cVar);
        }
        if ((fundingSource instanceof SavingsAccount) || (fundingSource instanceof WealthPortfolio) || (fundingSource instanceof DeFiBalanceSource)) {
            return Boolean.TRUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // xdk.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.core.model.account.AccountId r21, xi0.b r22, java.lang.String r23, gim.c r24) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xdk.g.b3(com.revolut.core.model.account.AccountId, xi0.b, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (nim.a.a(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(com.revolut.core.model.account.AccountId r6, gim.c r7, java.lang.String r8) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof xdk.c
            if (r0 == 0) goto L13
            r0 = r7
            xdk.c r0 = (xdk.c) r0
            int r1 = r0.f304492x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f304492x = r1
            goto L18
        L13:
            xdk.c r0 = new xdk.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f304492x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.revolut.core.model.account.AccountId r6 = r0.u
            yhm.o.b(r7)
            goto L46
        L38:
            yhm.o.b(r7)
            r0.u = r6
            r0.f304492x = r4
            java.io.Serializable r7 = r5.e3(r8, r0)
            if (r7 != r1) goto L46
            goto L5b
        L46:
            io3.d r7 = (io3.d) r7
            z71.a r8 = r5.f304501m
            j31.g r8 = (j31.g) r8
            pfm.r r6 = r8.d(r6, r7)
            r7 = 0
            r0.u = r7
            r0.f304492x = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xdk.g.d3(com.revolut.core.model.account.AccountId, gim.c, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e3(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof xdk.d
            if (r0 == 0) goto L13
            r0 = r8
            xdk.d r0 = (xdk.d) r0
            int r1 = r0.f304494x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f304494x = r1
            goto L18
        L13:
            xdk.d r0 = new xdk.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f304494x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L56
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            wsg.b r8 = r6.f304502n
            w4l.h r2 = w4l.h.f294642c
            akg.n r8 = r8.b(r2)
            zfd.e r8 = zi0.c.w(r8)
            xce.d r2 = new xce.d
            r5 = 3
            r2.<init>(r5)
            jhi.b r8 = mo3.a.g(r8, r3, r2, r4)
            r0.u = r7
            r0.f304494x = r4
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L56
            return r1
        L56:
            java.util.List r8 = (java.util.List) r8
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "pocketId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.Pair r8 = yh5.b.m(r7, r8)
            if (r8 != 0) goto L69
            goto L6e
        L69:
            java.lang.Object r8 = r8.f186386b
            r3 = r8
            io3.d r3 = (io3.d) r3
        L6e:
            if (r3 == 0) goto L71
            return r3
        L71:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to find pocket with id="
            java.lang.String r7 = h30.l.r(r0, r7)
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xdk.g.e3(java.lang.String, gim.c):java.io.Serializable");
    }
}
