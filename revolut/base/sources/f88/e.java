package f88;

import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wsg.n f132748l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m78.i f132749m;

    public e(wsg.n walletInteractor, m78.i juniorWalletInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorWalletInteractor, "juniorWalletInteractor");
        this.f132748l = walletInteractor;
        this.f132749m = juniorWalletInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.tab.accounts.models.ProductAccountId r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof f88.b
            if (r0 == 0) goto L13
            r0 = r7
            f88.b r0 = (f88.b) r0
            int r1 = r0.f132745w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f132745w = r1
            goto L18
        L13:
            f88.b r0 = new f88.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f132745w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L61
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            com.revolut.feature.junior.accounts.models.JuniorProductAccountIdPayload r6 = z88.a.a(r6)
            java.lang.String r6 = r6.f76717a
            r0.f132745w = r3
            m78.i r7 = r5.f132749m
            wsg.n r7 = r7.f203347a
            w4l.h r2 = w4l.h.f294642c
            efm.r r7 = r7.e0(r6, r2)
            vkm.d r7 = rd0.e.b(r7)
            m56.g r2 = new m56.g
            r4 = 9
            r2.<init>(r4)
            r4 = 0
            jhi.b r7 = mo3.a.g(r7, r4, r2, r3)
            f1l.e r2 = new f1l.e
            r3 = 3
            r2.<init>(r7, r6, r3)
            java.lang.Object r7 = vkm.q.x(r2, r0)
            if (r7 != r1) goto L61
            return r1
        L61:
            io3.d r7 = (io3.d) r7
            java.lang.String r6 = r7.f163145a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f88.e.Z2(com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dc, code lost:
    
        if (r3 == r5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f3, code lost:
    
        if (r3 == r5) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature.tab.accounts.models.ProductAccountId r21, java.lang.Object r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f88.e.b3(com.revolut.feature.tab.accounts.models.ProductAccountId, java.lang.Object, gim.c):java.lang.Object");
    }
}
