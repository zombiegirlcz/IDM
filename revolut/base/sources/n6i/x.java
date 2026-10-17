package n6i;

import h6i.q0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ppg.b f212827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f212828b;

    public x(ppg.b vaultsInteractor, q0 moveMoneyCountryProfileInteractor) {
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyCountryProfileInteractor, "moveMoneyCountryProfileInteractor");
        this.f212827a = vaultsInteractor;
        this.f212828b = moveMoneyCountryProfileInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof n6i.t
            if (r0 == 0) goto L13
            r0 = r8
            n6i.t r0 = (n6i.t) r0
            int r1 = r0.f212819w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212819w = r1
            goto L18
        L13:
            n6i.t r0 = new n6i.t
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f212819w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L44
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            pcd.f r8 = new pcd.f
            pcd.l0 r2 = pcd.l0.REGULAR
            pcd.j$c r4 = pcd.j.c.f234866a
            r8.<init>(r2, r4)
            r0.f212819w = r3
            java.io.Serializable r8 = r6.d(r7, r8, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            pcd.s r8 = (pcd.s) r8
            com.revolut.feature_move_money.api.model.AccountWrapper r0 = new com.revolut.feature_move_money.api.model.AccountWrapper
            j8l.a r1 = j8l.a.JOINT_VAULT
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r7 = com.revolut.feature_move_money.impl.R$string.joint_move_money_amount_input_title
            pcd.g0 r3 = r8.f234885h
            java.lang.String r3 = r3.f234859a
            java.util.List r3 = zhm.u.c(r3)
            r4 = 0
            r5 = 12
            r2.<init>(r7, r3, r4, r5)
            com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage r3 = fpg.a.a()
            com.revolut.feature_move_money.api.model.AccountSource$JointVaultSource r4 = new com.revolut.feature_move_money.api.model.AccountSource$JointVaultSource
            r4.<init>(r8)
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n6i.x.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof n6i.u
            if (r0 == 0) goto L13
            r0 = r12
            n6i.u r0 = (n6i.u) r0
            int r1 = r0.f212820w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212820w = r1
            goto L18
        L13:
            n6i.u r0 = new n6i.u
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f212820w
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
            pcd.g r12 = pcd.g.f234858b
            r0.f212820w = r3
            java.io.Serializable r12 = r10.d(r11, r12, r0)
            if (r12 != r1) goto L3d
            return r1
        L3d:
            pcd.s r12 = (pcd.s) r12
            com.revolut.feature_move_money.api.model.AccountWrapper r0 = new com.revolut.feature_move_money.api.model.AccountWrapper
            j8l.a r1 = j8l.a.PRO_VAULT
            com.revolut.core.ui_kit.models.TextClause r2 = new com.revolut.core.ui_kit.models.TextClause
            pcd.g0 r11 = r12.f234885h
            java.lang.String r3 = r11.f234859a
            r8 = 0
            r9 = 126(0x7e, float:1.77E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage r3 = fpg.a.a()
            com.revolut.feature_move_money.api.model.AccountSource$VaultSource r4 = new com.revolut.feature_move_money.api.model.AccountSource$VaultSource
            r4.<init>(r12)
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n6i.x.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r13, gim.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof n6i.v
            if (r0 == 0) goto L13
            r0 = r14
            n6i.v r0 = (n6i.v) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            n6i.v r0 = new n6i.v
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f212823y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            com.revolut.feature_move_money.api.model.AccountSource$VaultSource r13 = r0.f212822x
            com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage r1 = r0.f212821w
            com.revolut.core.ui_kit.models.TextClause r2 = r0.v
            j8l.a r0 = r0.u
            yhm.o.b(r14)
            r10 = r13
            r7 = r0
            r9 = r1
            r8 = r2
            goto L86
        L36:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3e:
            yhm.o.b(r14)
            goto L50
        L42:
            yhm.o.b(r14)
            pcd.g r14 = pcd.g.f234858b
            r0.A = r4
            java.io.Serializable r14 = r12.d(r13, r14, r0)
            if (r14 != r1) goto L50
            goto L81
        L50:
            pcd.s r14 = (pcd.s) r14
            j8l.a r13 = j8l.a.VAULT
            com.revolut.core.ui_kit.models.TextClause r4 = new com.revolut.core.ui_kit.models.TextClause
            pcd.g0 r2 = r14.f234885h
            java.lang.String r5 = r2.f234859a
            r10 = 0
            r11 = 126(0x7e, float:1.77E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage r2 = fpg.a.a()
            com.revolut.feature_move_money.api.model.AccountSource$VaultSource r5 = new com.revolut.feature_move_money.api.model.AccountSource$VaultSource
            r5.<init>(r14)
            java.lang.String r14 = r14.f
            r0.u = r13
            r0.v = r4
            r0.f212821w = r2
            r0.f212822x = r5
            r0.A = r3
            h6i.q0 r3 = r12.f212828b
            java.lang.Object r14 = r3.a(r14, r0)
            if (r14 != r1) goto L82
        L81:
            return r1
        L82:
            r7 = r13
            r9 = r2
            r8 = r4
            r10 = r5
        L86:
            r11 = r14
            com.revolut.feature.transfer.core.models.CountryProfile r11 = (com.revolut.feature.transfer.core.models.CountryProfile) r11
            com.revolut.feature_move_money.api.model.AccountWrapper r6 = new com.revolut.feature_move_money.api.model.AccountWrapper
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n6i.x.c(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(java.lang.String r7, pcd.i r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof n6i.w
            if (r0 == 0) goto L13
            r0 = r9
            n6i.w r0 = (n6i.w) r0
            int r1 = r0.f212826y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212826y = r1
            goto L18
        L13:
            n6i.w r0 = new n6i.w
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f212824w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f212826y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            pcd.i r8 = r0.v
            java.lang.String r7 = r0.u
            yhm.o.b(r9)
            goto L66
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r9)
            w4l.j r9 = w4l.j.f294644c
            ppg.b r2 = r6.f212827a
            ypg.p r2 = (ypg.p) r2
            efm.r r9 = r2.f(r9, r8)
            efm.r r9 = zi0.c.J(r9)
            n33.l0 r2 = new n33.l0
            r5 = 24
            r2.<init>(r5)
            efm.r r9 = m70.a.g(r9, r3, r2, r4)
            efm.d0 r9 = r9.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            r0.u = r7
            r0.v = r8
            r0.f212826y = r4
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L66
            return r1
        L66:
            java.util.List r9 = (java.util.List) r9
            kotlin.jvm.internal.Intrinsics.h(r9)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L71:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r0 = r9.next()
            r1 = r0
            pcd.s r1 = (pcd.s) r1
            java.lang.String r1 = r1.f()
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r7)
            if (r1 == 0) goto L71
            r3 = r0
        L89:
            pcd.s r3 = (pcd.s) r3
            if (r3 == 0) goto L8e
            return r3
        L8e:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No vault found by id: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = " ; filter: "
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = r0.toString()
            r9.<init>(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n6i.x.d(java.lang.String, pcd.i, gim.c):java.io.Serializable");
    }
}
