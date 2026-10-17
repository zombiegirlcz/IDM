package n7i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f213159a;

    public z(ang.f userInteractor, a0 moveMoneyCreditCardLocalizationProvider) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyCreditCardLocalizationProvider, "moveMoneyCreditCardLocalizationProvider");
        this.f213159a = userInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r1 == null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(x5i.a r18, x5i.a r19, com.revolut.feature.transfer.models.quotes.CreditCardInterest r20, gim.c r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r21
            boolean r2 = r1 instanceof n7i.w
            if (r2 == 0) goto L17
            r2 = r1
            n7i.w r2 = (n7i.w) r2
            int r3 = r2.z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.z = r3
            goto L1c
        L17:
            n7i.w r2 = new n7i.w
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f213155x
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.z
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L36
            java.lang.Object[] r3 = r2.f213154w
            com.revolut.core.ui_kit.models.Clause[] r3 = (com.revolut.core.ui_kit.models.Clause[]) r3
            java.lang.Object[] r4 = r2.v
            com.revolut.core.ui_kit.models.Clause[] r4 = (com.revolut.core.ui_kit.models.Clause[]) r4
            com.revolut.feature.credit.card.api.models.limits.CreditCardLimits$Direction r2 = r2.u
            yhm.o.b(r1)
            goto L7f
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3e:
            yhm.o.b(r1)
            r1 = r18
            com.revolut.feature_move_money.api.model.AccountWrapper r1 = r1.f302980b
            com.revolut.feature_move_money.api.model.AccountSource r1 = r1.d
            boolean r4 = r1 instanceof com.revolut.feature_move_money.api.model.AccountSource.CreditCardSource
            if (r4 == 0) goto L4e
            com.revolut.feature_move_money.api.model.AccountSource$CreditCardSource r1 = (com.revolut.feature_move_money.api.model.AccountSource.CreditCardSource) r1
            goto L4f
        L4e:
            r1 = r6
        L4f:
            if (r1 != 0) goto L62
            r7 = r19
            com.revolut.feature_move_money.api.model.AccountWrapper r1 = r7.f302980b
            com.revolut.feature_move_money.api.model.AccountSource r1 = r1.d
            boolean r7 = r1 instanceof com.revolut.feature_move_money.api.model.AccountSource.CreditCardSource
            if (r7 == 0) goto L5e
            com.revolut.feature_move_money.api.model.AccountSource$CreditCardSource r1 = (com.revolut.feature_move_money.api.model.AccountSource.CreditCardSource) r1
            goto L5f
        L5e:
            r1 = r6
        L5f:
            if (r1 != 0) goto L62
            goto La8
        L62:
            com.revolut.feature.credit.card.api.models.limits.CreditCardLimits$Direction r1 = com.revolut.feature_move_money.api.model.a.a(r1, r4)
            r7 = 2
            com.revolut.core.ui_kit.models.Clause[] r7 = new com.revolut.core.ui_kit.models.Clause[r7]
            r2.u = r1
            r2.v = r7
            r2.f213154w = r7
            r2.z = r5
            r8 = r20
            java.lang.Object r2 = r0.c(r4, r8, r2)
            if (r2 != r3) goto L7a
            return r3
        L7a:
            r3 = r2
            r2 = r1
            r1 = r3
            r3 = r7
            r4 = r3
        L7f:
            r7 = 0
            r3[r7] = r1
            if (r2 == 0) goto L93
            java.lang.String r13 = r2.f68820c
            if (r13 == 0) goto L93
            com.revolut.core.ui_kit.models.HtmlClause r8 = new com.revolut.core.ui_kit.models.HtmlClause
            r12 = 0
            r10 = 30
            r9 = 0
            r11 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            goto L94
        L93:
            r8 = r6
        L94:
            r4[r5] = r8
            java.lang.String r1 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            java.util.List r8 = kotlin.collections.d.L(r4)
            r1 = r8
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto La9
        La8:
            return r6
        La9:
            com.revolut.core.ui_kit.models.CompositeClause r7 = new com.revolut.core.ui_kit.models.CompositeClause
            com.revolut.core.ui_kit.models.TextClause r9 = new com.revolut.core.ui_kit.models.TextClause
            r15 = 0
            r16 = 126(0x7e, float:1.77E-43)
            java.lang.String r10 = "\n\n"
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r12 = 12
            r10 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n7i.z.a(x5i.a, x5i.a, com.revolut.feature.transfer.models.quotes.CreditCardInterest, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(gim.c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof n7i.x
            if (r0 == 0) goto L13
            r0 = r5
            n7i.x r0 = (n7i.x) r0
            int r1 = r0.f213157w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213157w = r1
            goto L18
        L13:
            n7i.x r0 = new n7i.x
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213157w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L48
        L27:
            r5 = move-exception
            goto L56
        L29:
            r5 = move-exception
            goto L6b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            yhm.o.b(r5)
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            ang.f r5 = r4.f213159a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r2 = 0
            efm.d0 r5 = r5.f(r2)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f213157w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = nim.a.b(r5, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L48
            return r1
        L48:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            do3.n r5 = (do3.n) r5     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            wi0.b r5 = do3.q.y(r5)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L5c
        L56:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L5c:
            java.lang.Throwable r0 = yhm.m.a(r5)
            if (r0 == 0) goto L65
            hx7.e.n(r0)
        L65:
            boolean r0 = r5 instanceof yhm.n
            if (r0 == 0) goto L6a
            r5 = 0
        L6a:
            return r5
        L6b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n7i.z.b(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r13, com.revolut.feature.transfer.models.quotes.CreditCardInterest r14, gim.c r15) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r15 instanceof n7i.y
            if (r0 == 0) goto L13
            r0 = r15
            n7i.y r0 = (n7i.y) r0
            int r1 = r0.f213158w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213158w = r1
            goto L18
        L13:
            n7i.y r0 = new n7i.y
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213158w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r15)
            goto L41
        L28:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L30:
            yhm.o.b(r15)
            if (r13 == 0) goto L8d
            if (r14 != 0) goto L38
            goto L8d
        L38:
            r0.f213158w = r3
            java.io.Serializable r15 = r12.b(r0)
            if (r15 != r1) goto L41
            return r1
        L41:
            wi0.b r15 = (wi0.b) r15
            if (r15 != 0) goto L46
            goto L8d
        L46:
            com.revolut.core.ui_kit.models.CompositeClause r5 = new com.revolut.core.ui_kit.models.CompositeClause
            com.revolut.core.ui_kit.models.ImageClause r6 = new com.revolut.core.ui_kit.models.ImageClause
            int r7 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_16_info_outline
            com.revolut.core.ui_kit.models.ImageClauseTint$Color r8 = new com.revolut.core.ui_kit.models.ImageClauseTint$Color
            int r13 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorAccent
            r8.<init>(r13)
            r10 = 0
            r11 = 28
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            com.revolut.core.ui_kit.models.TextLocalisedClause r13 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r14 = com.revolut.feature_move_money.impl.R$string.move_money_credit_card_disclaimer_sell
            r0 = 14
            r13.<init>(r14, r4, r4, r0)
            r14 = 2
            com.revolut.core.ui_kit.models.Clause[] r0 = new com.revolut.core.ui_kit.models.Clause[r14]
            r1 = 0
            r0[r1] = r6
            r0[r3] = r13
            java.util.List r6 = zhm.v.k(r0)
            com.revolut.core.ui_kit.models.TextClause r7 = sx4.g.e(r14)
            r10 = 12
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            com.revolut.core.ui_kit.models.Click r6 = new com.revolut.core.ui_kit.models.Click
            com.revolut.feature_move_money.impl.amount.mappers.CreditCardFooterParcel$RevolvingInterestInfoParcel r9 = new com.revolut.feature_move_money.impl.amount.mappers.CreditCardFooterParcel$RevolvingInterestInfoParcel
            r9.<init>(r15)
            r7 = 28
            java.lang.String r10 = "CREDIT_CARD_DISCLAIMER_LINK_ID"
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            com.revolut.core.ui_kit.models.Clause r13 = sx4.g.f(r5, r6)
            return r13
        L8d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n7i.z.c(boolean, com.revolut.feature.transfer.models.quotes.CreditCardInterest, gim.c):java.lang.Object");
    }
}
