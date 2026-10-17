package n6i;

import g48.r0;
import h6i.q0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f212810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f212811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f212812c;

    public o(wsg.n walletInteractor, r0 jointAccountsInteractor, q0 moveMoneyCountryProfileInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyCountryProfileInteractor, "moveMoneyCountryProfileInteractor");
        this.f212810a = walletInteractor;
        this.f212811b = jointAccountsInteractor;
        this.f212812c = moveMoneyCountryProfileInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.core.model.account.AccountId r11, io3.l r12, xi0.b r13, gim.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof n6i.l
            if (r0 == 0) goto L13
            r0 = r14
            n6i.l r0 = (n6i.l) r0
            int r1 = r0.f212803w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212803w = r1
            goto L18
        L13:
            n6i.l r0 = new n6i.l
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f212803w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r14)     // Catch: java.lang.Throwable -> L27
            goto L4c
        L27:
            r0 = move-exception
            r11 = r0
            goto L59
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            yhm.o.b(r14)
            yhm.m$a r14 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            wsg.n r4 = r10.f212810a     // Catch: java.lang.Throwable -> L27
            r7 = 0
            r9 = 28
            r8 = r11
            r6 = r12
            r5 = r13
            efm.d0 r11 = osg.b.r(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L27
            r0.f212803w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r14 = nim.a.b(r11, r0)     // Catch: java.lang.Throwable -> L27
            if (r14 != r1) goto L4c
            return r1
        L4c:
            io3.d r14 = (io3.d) r14     // Catch: java.lang.Throwable -> L27
            com.revolut.feature_move_money.api.model.AccountSource$PocketSource r11 = new com.revolut.feature_move_money.api.model.AccountSource$PocketSource     // Catch: java.lang.Throwable -> L27
            kotlin.jvm.internal.Intrinsics.h(r14)     // Catch: java.lang.Throwable -> L27
            r11.<init>(r14)     // Catch: java.lang.Throwable -> L27
            yhm.m$a r12 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            goto L5f
        L59:
            yhm.m$a r12 = yhm.m.INSTANCE
            yhm.n r11 = yhm.o.a(r11)
        L5f:
            boolean r12 = r11 instanceof yhm.n
            if (r12 == 0) goto L64
            r11 = 0
        L64:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: n6i.o.a(com.revolut.core.model.account.AccountId, io3.l, xi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(k1j.a r10, xi0.b r11, com.revolut.feature_move_money.api.model.AccountSource r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n6i.o.b(k1j.a, xi0.b, com.revolut.feature_move_money.api.model.AccountSource, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r10, java.lang.String r11, k1j.a r12) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n6i.o.c(gim.c, java.lang.String, k1j.a):java.lang.Object");
    }
}
