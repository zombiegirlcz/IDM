package ofe;

import ife.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements hfe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f224803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f224804b;

    public b(com.revolut.domain.interactors.transactions.a transactionsInteractor, c suspiciousRecipientFilterInteractor, d suspiciousRecipientWarningDestinationProvider) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(suspiciousRecipientFilterInteractor, "suspiciousRecipientFilterInteractor");
        Intrinsics.checkNotNullParameter(suspiciousRecipientWarningDestinationProvider, "suspiciousRecipientWarningDestinationProvider");
        this.f224803a = transactionsInteractor;
        this.f224804b = suspiciousRecipientWarningDestinationProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(jq9.t r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ofe.a
            if (r0 == 0) goto L13
            r0 = r10
            ofe.a r0 = (ofe.a) r0
            int r1 = r0.f224802w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f224802w = r1
            goto L18
        L13:
            ofe.a r0 = new ofe.a
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f224802w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r10)
            goto La2
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L30:
            yhm.o.b(r10)
            yhm.m$a r10 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L3a
            tof.q7 r9 = ofe.c.b(r9)     // Catch: java.lang.Throwable -> L3a
            goto L41
        L3a:
            r9 = move-exception
            yhm.m$a r10 = yhm.m.INSTANCE
            yhm.n r9 = yhm.o.a(r9)
        L41:
            boolean r10 = r9 instanceof yhm.n
            r2 = 0
            if (r10 == 0) goto L47
            r9 = r2
        L47:
            tof.i7 r9 = (tof.i7) r9
            gal.c r10 = gal.c.f142195a
            if (r9 != 0) goto L4e
            return r10
        L4e:
            com.revolut.domain.interactors.transactions.TransactionContext r4 = new com.revolut.domain.interactors.transactions.TransactionContext
            com.revolut.domain.interactors.transactions.TransactionContext$DataSet$Included r5 = new com.revolut.domain.interactors.transactions.TransactionContext$DataSet$Included
            com.revolut.domain.interactors.transactions.TransactionContext$TransactionData r6 = com.revolut.domain.interactors.transactions.TransactionContext.TransactionData.TRANSFER_USERS
            com.revolut.domain.interactors.transactions.TransactionContext$TransactionData r7 = com.revolut.domain.interactors.transactions.TransactionContext.TransactionData.HIDDEN
            com.revolut.domain.interactors.transactions.TransactionContext$TransactionData[] r6 = new com.revolut.domain.interactors.transactions.TransactionContext.TransactionData[]{r6, r7}
            java.lang.String r7 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            java.util.Set r6 = kotlin.collections.d.y0(r6)
            r5.<init>(r6)
            r4.<init>(r2, r5, r3)
            com.revolut.domain.interactors.transactions.a r2 = r8.f224803a
            mjf.b0 r2 = (mjf.b0) r2
            efm.r r9 = r2.j(r9, r4)
            efm.d0 r9 = r9.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            o9h.b r2 = new o9h.b
            r4 = 19
            r2.<init>(r8, r4)
            oc8.e r4 = new oc8.e
            r5 = 21
            r4.<init>(r5, r2)
            r9.getClass()
            ufm.i r2 = new ufm.i
            r2.<init>(r9, r4, r3)
            java.lang.String r9 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r9)
            pfm.z r9 = ue0.e.F(r2, r10)
            r0.f224802w = r3
            java.lang.Object r10 = nim.a.b(r9, r0)
            if (r10 != r1) goto La2
            return r1
        La2:
            java.lang.String r9 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ofe.b.a(jq9.t, gim.c):java.lang.Object");
    }
}
