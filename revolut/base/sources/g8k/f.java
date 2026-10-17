package g8k;

import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f141412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f141413b;

    public f(fk3.a configurationInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f141412a = configurationInteractor;
        this.f141413b = walletInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof g8k.c
            if (r0 == 0) goto L13
            r0 = r5
            g8k.c r0 = (g8k.c) r0
            int r1 = r0.f141409w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141409w = r1
            goto L18
        L13:
            g8k.c r0 = new g8k.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f141409w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            wsg.n r5 = r4.f141413b
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r5 = r5.x(r2)
            r0.f141409w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g8k.f.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof g8k.d
            if (r0 == 0) goto L13
            r0 = r6
            g8k.d r0 = (g8k.d) r0
            int r1 = r0.f141410w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141410w = r1
            goto L18
        L13:
            g8k.d r0 = new g8k.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f141410w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L55
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            fk3.a r6 = r5.f141412a
            ik3.c r6 = (ik3.c) r6
            efm.r r6 = r6.o()
            g5k.f r2 = new g5k.f
            r4 = 13
            r2.<init>(r4)
            r4 = 0
            efm.r r6 = m70.a.g(r6, r4, r2, r3)
            zhm.h0 r2 = zhm.h0.f322473a
            efm.r r6 = ue0.e.E(r6, r2)
            r0.f141410w = r3
            java.lang.Object r6 = nim.a.c(r6, r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            java.lang.String r0 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g8k.f.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof g8k.e
            if (r0 == 0) goto L13
            r0 = r8
            g8k.e r0 = (g8k.e) r0
            int r1 = r0.f141411w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141411w = r1
            goto L18
        L13:
            g8k.e r0 = new g8k.e
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f141411w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L6a
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            yhm.o.b(r8)
            w4l.j r8 = w4l.j.f294644c
            fk3.a r2 = r7.f141412a
            ik3.c r2 = (ik3.c) r2
            e7l.g$b r4 = e7l.g.b.f123407a
            efm.r r8 = r2.l(r4, r8)
            fq7.k r2 = new fq7.k
            r4 = 15
            r2.<init>(r4)
            g5k.f r4 = new g5k.f
            r5 = 12
            r4.<init>(r5)
            r5 = 2
            r6 = 0
            efm.r r8 = m70.a.h(r8, r2, r6, r4, r5)
            efm.d0 r8 = r8.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            pfm.z r8 = ue0.e.F(r8, r2)
            r0.f141411w = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L6a
            return r1
        L6a:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g8k.f.c(gim.c):java.lang.Object");
    }
}
