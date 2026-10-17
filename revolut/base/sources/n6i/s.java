package n6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final djb.n f212818a;

    public s(djb.n savingsAccountsDetailsInteractor) {
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        this.f212818a = savingsAccountsDetailsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof n6i.p
            if (r0 == 0) goto L13
            r0 = r8
            n6i.p r0 = (n6i.p) r0
            int r1 = r0.f212813w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212813w = r1
            goto L18
        L13:
            n6i.p r0 = new n6i.p
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f212813w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L3d
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            r0.f212813w = r3
            djb.k$a r8 = djb.k.a.f115281a
            java.lang.Object r8 = r6.c(r8, r0, r7)
            if (r8 != r1) goto L3d
            return r1
        L3d:
            com.revolut.feature.shared.savings.models.SavingsAccountDetails r8 = (com.revolut.feature.shared.savings.models.SavingsAccountDetails) r8
            com.revolut.feature_move_money.api.model.AccountWrapper r0 = new com.revolut.feature_move_money.api.model.AccountWrapper
            j8l.a r1 = j8l.a.JOINT_SAVINGS
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r7 = com.revolut.feature_move_money.impl.R$string.joint_move_money_amount_input_title
            pcd.s r3 = r8.f86460a
            pcd.g0 r3 = r3.f234885h
            java.lang.String r3 = r3.f234859a
            java.util.List r3 = zhm.u.c(r3)
            r4 = 0
            r5 = 12
            r2.<init>(r7, r3, r4, r5)
            com.revolut.core.ui_kit_core.displayers.image.Image r3 = r8.f86461b
            com.revolut.feature_move_money.api.model.AccountSource$JointSavingsSource r4 = new com.revolut.feature_move_money.api.model.AccountSource$JointSavingsSource
            r4.<init>(r8)
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n6i.s.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof n6i.q
            if (r0 == 0) goto L13
            r0 = r12
            n6i.q r0 = (n6i.q) r0
            int r1 = r0.f212814w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212814w = r1
            goto L18
        L13:
            n6i.q r0 = new n6i.q
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f212814w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L3d
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            r0.f212814w = r3
            djb.k$b r12 = djb.k.b.f115282a
            java.lang.Object r12 = r10.c(r12, r0, r11)
            if (r12 != r1) goto L3d
            return r1
        L3d:
            com.revolut.feature.shared.savings.models.SavingsAccountDetails r12 = (com.revolut.feature.shared.savings.models.SavingsAccountDetails) r12
            com.revolut.feature_move_money.api.model.AccountWrapper r0 = new com.revolut.feature_move_money.api.model.AccountWrapper
            j8l.a r1 = j8l.a.SAVINGS
            com.revolut.core.ui_kit.models.TextClause r2 = new com.revolut.core.ui_kit.models.TextClause
            pcd.s r11 = r12.f86460a
            pcd.g0 r11 = r11.f234885h
            java.lang.String r3 = r11.f234859a
            r8 = 0
            r9 = 126(0x7e, float:1.77E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            com.revolut.core.ui_kit_core.displayers.image.Image r3 = r12.f86461b
            com.revolut.feature_move_money.api.model.AccountSource$SavingsSource r4 = new com.revolut.feature_move_money.api.model.AccountSource$SavingsSource
            r4.<init>(r12)
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n6i.s.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(djb.k r7, gim.c r8, java.lang.String r9) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof n6i.r
            if (r0 == 0) goto L13
            r0 = r8
            n6i.r r0 = (n6i.r) r0
            int r1 = r0.f212817y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212817y = r1
            goto L18
        L13:
            n6i.r r0 = new n6i.r
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f212815w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f212817y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            djb.k r7 = r0.v
            java.lang.String r9 = r0.u
            yhm.o.b(r8)
            goto L66
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            w4l.j r8 = w4l.j.f294644c
            djb.n r2 = r6.f212818a
            rnb.i r2 = (rnb.i) r2
            efm.r r8 = r2.f(r7, r8)
            efm.r r8 = zi0.c.J(r8)
            n33.l0 r2 = new n33.l0
            r5 = 23
            r2.<init>(r5)
            efm.r r8 = m70.a.g(r8, r3, r2, r4)
            efm.d0 r8 = r8.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.u = r9
            r0.v = r7
            r0.f212817y = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L66
            return r1
        L66:
            ejb.b r8 = (ejb.b) r8
            java.util.List r8 = r8.f126837b
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L70:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r8.next()
            r1 = r0
            com.revolut.feature.shared.savings.models.SavingsAccountDetails r1 = (com.revolut.feature.shared.savings.models.SavingsAccountDetails) r1
            pcd.s r2 = r1.f86460a
            java.lang.String r2 = r2.f()
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r9)
            if (r2 != 0) goto L93
            pcd.s r1 = r1.f86460a
            java.lang.String r1 = r1.f234882b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r9)
            if (r1 == 0) goto L70
        L93:
            r3 = r0
        L94:
            com.revolut.feature.shared.savings.models.SavingsAccountDetails r3 = (com.revolut.feature.shared.savings.models.SavingsAccountDetails) r3
            if (r3 == 0) goto L99
            return r3
        L99:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Couldn't find savings account by id: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = " ; filter: "
            r0.append(r9)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n6i.s.c(djb.k, gim.c, java.lang.String):java.lang.Object");
    }
}
