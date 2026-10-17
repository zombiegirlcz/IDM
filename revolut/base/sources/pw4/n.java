package pw4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al4.d f240334a;

    public n(al4.d creditCardAdditionalCardholdersInteractor) {
        Intrinsics.checkNotNullParameter(creditCardAdditionalCardholdersInteractor, "creditCardAdditionalCardholdersInteractor");
        this.f240334a = creditCardAdditionalCardholdersInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof pw4.m
            if (r0 == 0) goto L13
            r0 = r9
            pw4.m r0 = (pw4.m) r0
            int r1 = r0.f240333w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f240333w = r1
            goto L18
        L13:
            pw4.m r0 = new pw4.m
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f240333w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L85
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            al4.d r9 = r7.f240334a
            om4.l r9 = (om4.l) r9
            java.lang.String r2 = "facilityId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            om4.k4 r2 = r9.f226626c
            kotlinx.coroutines.flow.Flow r2 = r2.d()
            kotlinx.coroutines.flow.Flow r2 = vkm.q.q(r2)
            au.c0 r4 = new au.c0
            r5 = 18
            r6 = 0
            r4.<init>(r6, r9, r8, r5)
            kotlinx.coroutines.flow.Flow r8 = xam.a.h(r4, r2)
            kotlinx.coroutines.flow.Flow r8 = vkm.q.q(r8)
            pui.a r9 = new pui.a
            r2 = 19
            r9.<init>(r2)
            akg.n r8 = nim.a.v(r8, r9)
            pui.a r9 = new pui.a
            r2 = 20
            r9.<init>(r2)
            cxe.u r8 = nim.a.A(r8, r9)
            d7e.f r9 = new d7e.f
            r2 = 2
            r9.<init>(r8, r2)
            psl.m r8 = new psl.m
            r2 = 28
            r8.<init>(r2)
            jhi.b r8 = mo3.a.g(r9, r6, r8, r3)
            r0.f240333w = r3
            java.lang.Object r9 = vkm.q.z(r8, r0)
            if (r9 != r1) goto L85
            return r1
        L85:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r9, r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pw4.n.a(java.lang.String, gim.c):java.lang.Object");
    }
}
