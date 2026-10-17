package wik;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al4.q f297909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l61.a f297910b;

    public d(al4.q creditCardProductInteractor, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f297909a = creditCardProductInteractor;
        this.f297910b = userCompanyInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof wik.b
            if (r0 == 0) goto L13
            r0 = r5
            wik.b r0 = (wik.b) r0
            int r1 = r0.f297907w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f297907w = r1
            goto L18
        L13:
            wik.b r0 = new wik.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f297907w
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
            l61.a r5 = r4.f297910b
            ang.b r5 = (ang.b) r5
            efm.d0 r5 = r5.a()
            r0.f297907w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            l71.d r5 = (l71.d) r5
            com.revolut.domain.models.user.UserCompanyRegion r5 = r5.a()
            com.revolut.domain.models.user.UserCompanyRegion r0 = com.revolut.domain.models.user.UserCompanyRegion.BR
            if (r5 != r0) goto L4e
            goto L4f
        L4e:
            r3 = 0
        L4f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wik.d.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof wik.c
            if (r0 == 0) goto L13
            r0 = r6
            wik.c r0 = (wik.c) r0
            int r1 = r0.f297908w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f297908w = r1
            goto L18
        L13:
            wik.c r0 = new wik.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f297908w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L42
        L36:
            yhm.o.b(r6)
            r0.f297908w = r4
            java.lang.Object r6 = r5.a(r0)
            if (r6 != r1) goto L42
            goto L6e
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L70
            r0.f297908w = r3
            w4l.h r6 = w4l.h.f294642c
            al4.q r2 = r5.f297909a
            om4.y3 r2 = (om4.y3) r2
            kotlinx.coroutines.flow.Flow r6 = r2.e(r6, r4)
            wf0.b r2 = new wf0.b
            r3 = 12
            r2.<init>(r3)
            r3 = 0
            jhi.b r6 = mo3.a.g(r6, r3, r2, r4)
            vvh.e r2 = new vvh.e
            r3 = 3
            r2.<init>(r6, r3)
            java.lang.Object r6 = vkm.q.x(r2, r0)
            if (r6 != r1) goto L6f
        L6e:
            return r1
        L6f:
            return r6
        L70:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wik.d.b(gim.c):java.lang.Object");
    }
}
