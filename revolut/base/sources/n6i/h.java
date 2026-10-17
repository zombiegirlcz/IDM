package n6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    public h() {
        od0.i moveMoneyCollateralBalanceProvider = od0.i.f224256b;
        Intrinsics.checkNotNullParameter(moveMoneyCollateralBalanceProvider, "moveMoneyCollateralBalanceProvider");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(gim.c r5, java.lang.String r6, k1j.a r7) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof n6i.g
            if (r0 == 0) goto L13
            r0 = r5
            n6i.g r0 = (n6i.g) r0
            int r1 = r0.f212797w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212797w = r1
            goto L18
        L13:
            n6i.g r0 = new n6i.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r0 = r0.f212797w
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L4b
            r6 = 0
            if (r0 == r2) goto L3d
            if (r0 != r1) goto L35
            yhm.o.b(r5)
            if (r5 != 0) goto L2f
            j8l.a r5 = j8l.a.FIAT
            throw r6
        L2f:
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            yhm.o.b(r5)
            if (r5 != 0) goto L45
            j8l.a r5 = j8l.a.FIAT
            throw r6
        L45:
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        L4b:
            yhm.o.b(r5)
            int[] r5 = n6i.f.f212796a
            int r0 = r7.ordinal()
            r5 = r5[r0]
            java.lang.String r0 = "MoveMoneyCollateralBalanceProvider must be configured in this app"
            if (r5 == r2) goto L8a
            if (r5 != r1) goto L72
            xi0.a r5 = xi0.b.Companion
            java.lang.String r7 = r7.name()
            java.lang.String r6 = kotlin.text.d0.e0(r6, r7)
            r5.getClass()
            xi0.a.a(r6)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r0)
            throw r5
        L72:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Unsupported collateral balance type: "
            r6.<init>(r0)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L8a:
            xi0.a r5 = xi0.b.Companion
            java.lang.String r7 = r7.name()
            java.lang.String r6 = kotlin.text.d0.e0(r6, r7)
            r5.getClass()
            xi0.a.a(r6)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n6i.h.a(gim.c, java.lang.String, k1j.a):void");
    }
}
