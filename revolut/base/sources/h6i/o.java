package h6i;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f149697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g48.r0 f149698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ldi.f f149699c;
    public final n6i.x d;
    public final n6i.s e;
    public final k6i.k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o6i.f f149700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n6i.e f149701h;
    public final n6i.o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k7i.i f149702j;
    public final q0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n6i.j f149703l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n6i.h f149704m;

    public o(wsg.n walletInteractor, g48.r0 jointAccountsInteractor, ldi.f revPointsPocketInteractor, n6i.x subaccountsProvider, n6i.s savingsProvider, k6i.k juniorAccountProvider, o6i.f teenAccountProvider, n6i.e cashHoldingProvider, n6i.o nonExistingAccountProvider, k7i.i transferWalletInteractor, q0 moveMoneyCountryProfileInteractor, n6i.j creditCardProvider, n6i.h moveMoneyCollateralAccountProvider) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(revPointsPocketInteractor, "revPointsPocketInteractor");
        Intrinsics.checkNotNullParameter(subaccountsProvider, "subaccountsProvider");
        Intrinsics.checkNotNullParameter(savingsProvider, "savingsProvider");
        Intrinsics.checkNotNullParameter(juniorAccountProvider, "juniorAccountProvider");
        Intrinsics.checkNotNullParameter(teenAccountProvider, "teenAccountProvider");
        Intrinsics.checkNotNullParameter(cashHoldingProvider, "cashHoldingProvider");
        Intrinsics.checkNotNullParameter(nonExistingAccountProvider, "nonExistingAccountProvider");
        Intrinsics.checkNotNullParameter(transferWalletInteractor, "transferWalletInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyCountryProfileInteractor, "moveMoneyCountryProfileInteractor");
        Intrinsics.checkNotNullParameter(creditCardProvider, "creditCardProvider");
        Intrinsics.checkNotNullParameter(moveMoneyCollateralAccountProvider, "moveMoneyCollateralAccountProvider");
        this.f149697a = walletInteractor;
        this.f149698b = jointAccountsInteractor;
        this.f149699c = revPointsPocketInteractor;
        this.d = subaccountsProvider;
        this.e = savingsProvider;
        this.f = juniorAccountProvider;
        this.f149700g = teenAccountProvider;
        this.f149701h = cashHoldingProvider;
        this.i = nonExistingAccountProvider;
        this.f149702j = transferWalletInteractor;
        this.k = moveMoneyCountryProfileInteractor;
        this.f149703l = creditCardProvider;
        this.f149704m = moveMoneyCollateralAccountProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r14, gim.c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof h6i.h
            if (r0 == 0) goto L13
            r0 = r15
            h6i.h r0 = (h6i.h) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            h6i.h r0 = new h6i.h
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f149672y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            com.revolut.feature_move_money.api.model.AccountSource$PocketSource r14 = r0.f149671x
            com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage r1 = r0.f149670w
            com.revolut.core.ui_kit.models.CurrencyClause r2 = r0.v
            j8l.a r0 = r0.u
            yhm.o.b(r15)
            r11 = r14
            r8 = r0
            r10 = r1
            r9 = r2
            goto L97
        L36:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3e:
            yhm.o.b(r15)
            goto L50
        L42:
            yhm.o.b(r15)
            r0.A = r4
            k7i.i r15 = r13.f149702j
            java.io.Serializable r15 = r15.l(r14, r0)
            if (r15 != r1) goto L50
            goto L92
        L50:
            kotlin.Pair r15 = (kotlin.Pair) r15
            java.lang.Object r14 = r15.f186385a
            fo3.c r14 = (fo3.c) r14
            java.lang.Object r15 = r15.f186386b
            io3.d r15 = (io3.d) r15
            j8l.a r2 = j8l.a.COMMODITIES
            com.revolut.core.ui_kit.models.CurrencyClause r4 = new com.revolut.core.ui_kit.models.CurrencyClause
            xi0.a r5 = xi0.b.Companion
            java.lang.String r6 = r15.f163147c
            r5.getClass()
            xi0.b r5 = xi0.a.a(r6)
            com.revolut.core.ui_kit.models.CurrencyClause$Format$Ticker r6 = com.revolut.core.ui_kit.models.CurrencyClause.Format.Ticker.f57756a
            r7 = 4
            r8 = 0
            r4.<init>(r5, r6, r8, r7)
            com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage r5 = new com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage
            java.lang.String r6 = r15.f163147c
            r7 = 14
            r5.<init>(r6, r8, r8, r7)
            com.revolut.feature_move_money.api.model.AccountSource$PocketSource r6 = new com.revolut.feature_move_money.api.model.AccountSource$PocketSource
            r6.<init>(r15)
            java.lang.String r14 = r14.f136805h
            r0.u = r2
            r0.v = r4
            r0.f149670w = r5
            r0.f149671x = r6
            r0.A = r3
            h6i.q0 r15 = r13.k
            java.lang.Object r15 = r15.a(r14, r0)
            if (r15 != r1) goto L93
        L92:
            return r1
        L93:
            r8 = r2
            r9 = r4
            r10 = r5
            r11 = r6
        L97:
            r12 = r15
            com.revolut.feature.transfer.core.models.CountryProfile r12 = (com.revolut.feature.transfer.core.models.CountryProfile) r12
            com.revolut.feature_move_money.api.model.AccountWrapper r7 = new com.revolut.feature_move_money.api.model.AccountWrapper
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h6i.o.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof h6i.i
            if (r0 == 0) goto L13
            r0 = r8
            h6i.i r0 = (h6i.i) r0
            int r1 = r0.f149676w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149676w = r1
            goto L18
        L13:
            h6i.i r0 = new h6i.i
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149676w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L43
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            wsg.n r8 = r6.f149697a
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a
            efm.d0 r7 = r8.z(r2, r7)
            r0.f149676w = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            io3.d r8 = (io3.d) r8
            com.revolut.feature_move_money.api.model.AccountWrapper r0 = new com.revolut.feature_move_money.api.model.AccountWrapper
            j8l.a r1 = j8l.a.CRYPTO
            com.revolut.core.ui_kit.models.CurrencyClause r2 = new com.revolut.core.ui_kit.models.CurrencyClause
            xi0.a r7 = xi0.b.Companion
            java.lang.String r3 = r8.f163147c
            r7.getClass()
            xi0.b r7 = xi0.a.a(r3)
            com.revolut.core.ui_kit.models.CurrencyClause$Format$Ticker r3 = com.revolut.core.ui_kit.models.CurrencyClause.Format.Ticker.f57756a
            r4 = 4
            r5 = 0
            r2.<init>(r7, r3, r5, r4)
            com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage r3 = new com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage
            java.lang.String r7 = r8.f163147c
            r4 = 14
            r3.<init>(r7, r5, r5, r4)
            com.revolut.feature_move_money.api.model.AccountSource$PocketSource r4 = new com.revolut.feature_move_money.api.model.AccountSource$PocketSource
            r4.<init>(r8)
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h6i.o.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof h6i.j
            if (r0 == 0) goto L13
            r0 = r6
            h6i.j r0 = (h6i.j) r0
            int r1 = r0.f149680w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149680w = r1
            goto L18
        L13:
            h6i.j r0 = new h6i.j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149680w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            g48.r0 r6 = r5.f149698b
            w4l.j r2 = w4l.j.f294644c
            cxe.u r6 = r6.h(r2)
            r2 = 3
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r4, r2)
            r0.f149680w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            od0.i r6 = (od0.i) r6
            java.lang.Object r6 = r6.c()
            n38.a r6 = (n38.a) r6
            com.revolut.core.model.account.AccountId$Joint r6 = l38.a.c(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h6i.o.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0197, code lost:
    
        if (r1 == r5) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0235, code lost:
    
        if (r1 != r5) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r20, java.lang.String r21, k1j.a r22) {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h6i.o.d(gim.c, java.lang.String, k1j.a):java.lang.Object");
    }

    public final Object e(gim.c cVar, String str, k1j.a aVar) {
        switch (g.f149669a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                return d(cVar, str, aVar);
            case 20:
            case 21:
                return this.f149701h.a(str, cVar);
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                return this.i.c(cVar, str, aVar);
            case 27:
            case 28:
                this.f149704m.a(cVar, str, aVar);
                throw null;
            case 29:
            case 30:
                throw new IllegalArgumentException(p.a.p("BalanceType ", aVar.name(), " is not supported"));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Object f(gim.c cVar) {
        ldi.f fVar = this.f149699c;
        w4l.h hVar = w4l.h.f294642c;
        return vkm.q.x(new t38.e(new g48.r(mo3.a.g(fVar.c(hVar), null, null, 3), 4), 24, mo3.a.g(fVar.b(hVar), null, null, 3), new m(3, null)), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r21, gim.c r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof h6i.n
            if (r2 == 0) goto L17
            r2 = r1
            h6i.n r2 = (h6i.n) r2
            int r3 = r2.f149693w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f149693w = r3
            goto L1c
        L17:
            h6i.n r2 = new h6i.n
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f149693w
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L49
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            yhm.o.b(r1)
            wsg.n r1 = r0.f149697a
            com.revolut.core.model.account.AccountId$Personal r4 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r6 = r21
            efm.d0 r1 = r1.z(r4, r6)
            r2.f149693w = r5
            java.lang.Object r1 = nim.a.b(r1, r2)
            if (r1 != r3) goto L49
            return r3
        L49:
            io3.d r1 = (io3.d) r1
            com.revolut.feature_move_money.api.model.AccountWrapper r2 = new com.revolut.feature_move_money.api.model.AccountWrapper
            j8l.a r3 = j8l.a.REVX_FIAT
            com.revolut.core.ui_kit.models.CompositeClause r4 = new com.revolut.core.ui_kit.models.CompositeClause
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r6 = com.revolut.feature_move_money.impl.R$string.cryptobuysell_editor_balance_rev_x_fiat
            r10 = 0
            r11 = 14
            r5.<init>(r6, r10, r10, r11)
            com.revolut.core.ui_kit.models.CurrencyClause r6 = new com.revolut.core.ui_kit.models.CurrencyClause
            xi0.a r7 = xi0.b.Companion
            java.lang.String r8 = r1.f163147c
            r7.getClass()
            xi0.b r7 = xi0.a.a(r8)
            com.revolut.core.ui_kit.models.CurrencyClause$Format$Ticker r8 = com.revolut.core.ui_kit.models.CurrencyClause.Format.Ticker.f57756a
            r9 = 4
            r6.<init>(r7, r8, r10, r9)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6}
            java.util.List r5 = zhm.v.k(r5)
            com.revolut.core.ui_kit.models.TextClause r6 = new com.revolut.core.ui_kit.models.TextClause
            kotlin.jvm.internal.t0 r7 = kotlin.jvm.internal.t0.f186434a
            m70.a.a(r7)
            r18 = 0
            r19 = 126(0x7e, float:1.77E-43)
            java.lang.String r13 = " · "
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r12 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r8 = 0
            r9 = 12
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage r5 = new com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage
            java.lang.String r6 = r1.f163147c
            r5.<init>(r6, r10, r10, r11)
            com.revolut.feature_move_money.api.model.AccountSource$PocketSource r6 = new com.revolut.feature_move_money.api.model.AccountSource$PocketSource
            r6.<init>(r1)
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h6i.o.g(java.lang.String, gim.c):java.lang.Object");
    }
}
