package com.revolut.feature_move_money.impl.amount;

import h6i.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveAmountScreenContract$InputData f97297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f97298b;

    public f(MoveAmountScreenContract$InputData inputData, o moveMoneyAccountProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(moveMoneyAccountProvider, "moveMoneyAccountProvider");
        this.f97297a = inputData;
        this.f97298b = moveMoneyAccountProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(k1j.a r7, b6i.j r8, java.lang.String r9, s6i.e r10, gim.c r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof b6i.c1
            if (r0 == 0) goto L13
            r0 = r11
            b6i.c1 r0 = (b6i.c1) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            b6i.c1 r0 = new b6i.c1
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.f12769x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            com.revolut.feature_move_money.api.model.AccountWrapper r7 = r0.f12768w
            s6i.e r10 = r0.v
            b6i.j r8 = r0.u
            yhm.o.b(r11)
            goto L68
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            yhm.o.b(r11)
            int[] r11 = b6i.b1.f12762a
            int r2 = r8.ordinal()
            r11 = r11[r2]
            if (r11 == r4) goto L50
            if (r11 != r3) goto L4a
            x5i.a r11 = r10.f260363b
            com.revolut.feature_move_money.api.model.AccountWrapper r11 = r11.f302980b
            goto L54
        L4a:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L50:
            x5i.a r11 = r10.f260362a
            com.revolut.feature_move_money.api.model.AccountWrapper r11 = r11.f302980b
        L54:
            r0.u = r8
            r0.v = r10
            r0.f12768w = r11
            r0.z = r4
            h6i.o r2 = r6.f97298b
            java.lang.Object r7 = r2.d(r0, r9, r7)
            if (r7 != r1) goto L65
            return r1
        L65:
            r5 = r11
            r11 = r7
            r7 = r5
        L68:
            com.revolut.feature_move_money.api.model.AccountWrapper r11 = (com.revolut.feature_move_money.api.model.AccountWrapper) r11
            int[] r9 = b6i.b1.f12762a
            int r8 = r8.ordinal()
            r8 = r9[r8]
            r9 = 28
            r0 = 13
            r1 = 0
            if (r8 == r4) goto L92
            if (r8 != r3) goto L8c
            x5i.a r8 = r10.f260362a
            x5i.a r7 = x5i.a.a(r8, r1, r7, r0)
            x5i.a r8 = r10.f260363b
            x5i.a r8 = x5i.a.a(r8, r1, r11, r0)
            s6i.e r7 = s6i.e.a(r10, r7, r8, r9)
            return r7
        L8c:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L92:
            x5i.a r8 = r10.f260362a
            x5i.a r8 = x5i.a.a(r8, r1, r11, r0)
            x5i.a r11 = r10.f260363b
            x5i.a r7 = x5i.a.a(r11, r1, r7, r0)
            s6i.e r7 = s6i.e.a(r10, r8, r7, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.amount.f.a(k1j.a, b6i.j, java.lang.String, s6i.e, gim.c):java.lang.Object");
    }
}
