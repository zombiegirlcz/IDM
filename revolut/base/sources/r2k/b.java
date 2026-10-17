package r2k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3j.b f251134a;

    public b(d3j.b beneficiaryInteractor) {
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        this.f251134a = beneficiaryInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof r2k.a
            if (r0 == 0) goto L13
            r0 = r8
            r2k.a r0 = (r2k.a) r0
            int r1 = r0.f251133w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f251133w = r1
            goto L18
        L13:
            r2k.a r0 = new r2k.a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f251133w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L66
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            yhm.o.b(r8)
            com.revolut.domain.models.beneficiary.BeneficiarySpecialPurpose r8 = com.revolut.domain.models.beneficiary.BeneficiarySpecialPurpose.INDIA_MCY_WITHDRAWAL
            r2 = 9
            d3j.b r4 = r7.f251134a
            r5 = 0
            efm.r r8 = w2j.a.c(r4, r8, r5, r2)
            efm.r r8 = zi0.c.J(r8)
            qz9.u r2 = new qz9.u
            r4 = 14
            r2.<init>(r4)
            efm.r r8 = m70.a.g(r8, r5, r2, r3)
            vkm.d r8 = rd0.e.b(r8)
            qtb.o r2 = new qtb.o
            r4 = 3
            r6 = 5
            r2.<init>(r4, r6, r5)
            zhm.h0 r4 = zhm.h0.f322473a
            vkm.y r8 = rd0.e.e(r8, r4, r2)
            r0.f251133w = r3
            java.lang.Object r8 = vkm.q.z(r8, r0)
            if (r8 != r1) goto L66
            return r1
        L66:
            java.util.List r8 = (java.util.List) r8
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L7a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L74
            goto L7a
        L74:
            b2k.c r0 = new b2k.c
            r0.<init>(r8)
            return r0
        L7a:
            b2k.b$a r8 = b2k.b.a.f11960a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r2k.b.a(gim.c):java.lang.Object");
    }
}
