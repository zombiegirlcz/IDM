package vz9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz9.c f293435a;

    public o(iz9.c transactionsInteractor) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f293435a = transactionsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(tof.a3 r9, com.revolut.feature.payments.social.api.model.ChatTransferRecipient r10, gim.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof vz9.n
            if (r0 == 0) goto L13
            r0 = r11
            vz9.n r0 = (vz9.n) r0
            int r1 = r0.f293434x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f293434x = r1
            goto L18
        L13:
            vz9.n r0 = new vz9.n
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f293434x
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            tof.a3 r9 = r0.u
            yhm.o.b(r11)
        L28:
            r3 = r9
            goto L5e
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            yhm.o.b(r11)
            r0.u = r9
            r0.f293434x = r3
            iz9.c r11 = r8.f293435a
            qz9.n r11 = (qz9.n) r11
            efm.r r2 = r11.d(r10)
            qz9.l r4 = new qz9.l
            r5 = 0
            r4.<init>(r11, r10, r5)
            efm.r r10 = nim.a.w(r2, r4)
            qsk.d r11 = new qsk.d
            r2 = 26
            r11.<init>(r2)
            r2 = 0
            efm.r r10 = m70.a.g(r10, r2, r11, r3)
            java.lang.Object r11 = nim.a.e(r10, r0)
            if (r11 != r1) goto L28
            return r1
        L5e:
            r4 = r11
            tof.i7 r4 = (tof.i7) r4
            com.revolut.domain.interactors.transactions.TransactionContext$a r9 = com.revolut.domain.interactors.transactions.TransactionContext.INSTANCE
            r9.getClass()
            com.revolut.domain.interactors.transactions.TransactionContext r5 = com.revolut.domain.interactors.transactions.TransactionContext.f60264c
            kotlin.jvm.internal.t0 r9 = kotlin.jvm.internal.t0.f186434a
            m70.a.c(r9)
            rhf.d r7 = rhf.d.PAYMENTS_CHAT
            rhf.e r2 = new rhf.e
            java.lang.String r6 = ""
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vz9.o.a(tof.a3, com.revolut.feature.payments.social.api.model.ChatTransferRecipient, gim.c):java.lang.Object");
    }
}
