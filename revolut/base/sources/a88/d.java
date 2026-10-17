package a88;

import kotlin.jvm.internal.Intrinsics;
import om4.d0;
import wsg.n;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements nda.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hj8.a f2132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.b f2133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f2134c;
    public final n d;

    public d(hj8.a juniorProfileInteractor, wsg.b newWalletsInteractor, d0 juniorAllowancesInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(juniorAllowancesInteractor, "juniorAllowancesInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f2132a = juniorProfileInteractor;
        this.f2133b = newWalletsInteractor;
        this.f2134c = juniorAllowancesInteractor;
        this.d = walletInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nda.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.tab.accounts.models.ProductAccountId r13, boolean r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a88.d.a(com.revolut.feature.tab.accounts.models.ProductAccountId, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // xfe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.tab.accounts.models.ProductAccountId r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a88.d.b(com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(java.lang.String r6, java.lang.String r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof a88.c
            if (r0 == 0) goto L13
            r0 = r8
            a88.c r0 = (a88.c) r0
            int r1 = r0.f2131x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2131x = r1
            goto L18
        L13:
            a88.c r0 = new a88.c
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f2131x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r8)
            wsg.b r8 = r5.f2133b
            w4l.h r2 = w4l.h.f294642c
            kotlinx.coroutines.flow.Flow r6 = r8.c(r6, r2)
            zfd.e r6 = zi0.c.w(r6)
            a5g.l r8 = new a5g.l
            r2 = 23
            r8.<init>(r2)
            jhi.b r6 = mo3.a.g(r6, r4, r8, r3)
            r0.u = r7
            r0.f2131x = r3
            java.lang.Object r8 = vkm.q.z(r6, r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto La1
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r8 = r8.iterator()
        L66:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r8.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.f186386b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            zhm.a0.x(r0, r6)
            goto L66
        L7a:
            java.util.Iterator r6 = r6.iterator()
        L7e:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L94
            java.lang.Object r8 = r6.next()
            r0 = r8
            io3.d r0 = (io3.d) r0
            java.lang.String r0 = r0.f163145a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r7)
            if (r0 == 0) goto L7e
            r4 = r8
        L94:
            io3.d r4 = (io3.d) r4
            if (r4 == 0) goto L99
            return r4
        L99:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Pocket is expected"
            r6.<init>(r7)
            throw r6
        La1:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "List<WalletWithPockets> is expected"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a88.d.c(java.lang.String, java.lang.String, gim.c):java.io.Serializable");
    }
}
