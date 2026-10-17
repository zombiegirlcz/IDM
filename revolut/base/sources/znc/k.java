package znc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f323698a;

    public k(bdh.e helpWidgetMapper) {
        Intrinsics.checkNotNullParameter(helpWidgetMapper, "helpWidgetMapper");
        this.f323698a = helpWidgetMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof fmc.m
            if (r0 == 0) goto L13
            r0 = r12
            fmc.m r0 = (fmc.m) r0
            int r1 = r0.f136349w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f136349w = r1
            goto L18
        L13:
            fmc.m r0 = new fmc.m
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f136349w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L4f
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            java.lang.Object r12 = r10.f323698a
            t1j.b r12 = (t1j.b) r12
            efm.r r11 = t1j.b.m(r12, r11)
            com.revolut.data.model.Data r4 = new com.revolut.data.model.Data
            r8 = 6
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f136349w = r3
            clm.a r12 = clm.a.FIRST_OR_DEFAULT
            java.lang.Object r12 = nim.a.g(r11, r12, r4, r0)
            if (r12 != r1) goto L4f
            return r1
        L4f:
            com.revolut.data.model.Data r12 = (com.revolut.data.model.Data) r12
            java.lang.Object r11 = r12.getContent()
            java.util.List r11 = (java.util.List) r11
            if (r11 == 0) goto L60
            od0.h r12 = od0.i.Companion
            od0.i r11 = m72.b.x(r11, r12)
            return r11
        L60:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: znc.k.a(java.lang.String, gim.c):java.lang.Object");
    }

    public k(t1j.b portfolioRecurringOrdersInteractor) {
        Intrinsics.checkNotNullParameter(portfolioRecurringOrdersInteractor, "portfolioRecurringOrdersInteractor");
        this.f323698a = portfolioRecurringOrdersInteractor;
    }
}
