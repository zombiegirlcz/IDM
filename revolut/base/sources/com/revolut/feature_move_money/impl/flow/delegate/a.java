package com.revolut.feature_move_money.impl.flow.delegate;

import a8i.e;
import a8i.g;
import c8i.v;
import kotlin.jvm.internal.Intrinsics;
import z1l.d;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f4h.a f97387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f97388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f97389c;
    public final zq.a d;
    public final g e;
    public final a8i.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a8i.b f97390g;

    public a(f4h.a transferReasonInteractor, v exchangeGlobalAccessInteractor, d quoteValidationDelegate, zq.a moveMoneyScaInteractor, g uaeAccountLimitChecker, a8i.d killSwitchConfirmationChecker, e savingsChallengeWithdrawChecker, a8i.b cfdMarginCallRiskIncreaseChecker) {
        Intrinsics.checkNotNullParameter(transferReasonInteractor, "transferReasonInteractor");
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessInteractor, "exchangeGlobalAccessInteractor");
        Intrinsics.checkNotNullParameter(quoteValidationDelegate, "quoteValidationDelegate");
        Intrinsics.checkNotNullParameter(moveMoneyScaInteractor, "moveMoneyScaInteractor");
        Intrinsics.checkNotNullParameter(uaeAccountLimitChecker, "uaeAccountLimitChecker");
        Intrinsics.checkNotNullParameter(killSwitchConfirmationChecker, "killSwitchConfirmationChecker");
        Intrinsics.checkNotNullParameter(savingsChallengeWithdrawChecker, "savingsChallengeWithdrawChecker");
        Intrinsics.checkNotNullParameter(cfdMarginCallRiskIncreaseChecker, "cfdMarginCallRiskIncreaseChecker");
        this.f97387a = transferReasonInteractor;
        this.f97388b = exchangeGlobalAccessInteractor;
        this.f97389c = quoteValidationDelegate;
        this.d = moveMoneyScaInteractor;
        this.e = uaeAccountLimitChecker;
        this.f = killSwitchConfirmationChecker;
        this.f97390g = cfdMarginCallRiskIncreaseChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState r5, gim.c r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof z7i.a
            if (r0 == 0) goto L13
            r0 = r6
            z7i.a r0 = (z7i.a) r0
            int r1 = r0.f320009w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f320009w = r1
            goto L18
        L13:
            z7i.a r0 = new z7i.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f320009w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo r5 = r5.f97347a
            com.revolut.feature_move_money.api.model.AccountWrapper r6 = r5.d
            xi0.b r6 = r6.getCurrency()
            com.revolut.feature_move_money.api.model.AccountWrapper r2 = r5.e
            xi0.b r2 = r2.getCurrency()
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r2)
            if (r6 == 0) goto L52
            com.revolut.feature_move_money.api.model.AccountWrapper r6 = r5.d
            j8l.a r6 = r6.f97224a
            j8l.a r2 = j8l.a.CREDIT_CARD
            if (r6 != r2) goto L4f
            goto L52
        L4f:
            z7i.k r5 = z7i.k.f320020a
            return r5
        L52:
            r0.f320009w = r3
            z1l.d r6 = r4.f97389c
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L5d
            return r1
        L5d:
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r6 = (com.revolut.shared.feature.market_data.models.domain.models.OrderQuote) r6
            z7i.i r5 = new z7i.i
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.flow.delegate.a.a(com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof z7i.b
            if (r0 == 0) goto L13
            r0 = r6
            z7i.b r0 = (z7i.b) r0
            int r1 = r0.f320010w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f320010w = r1
            goto L18
        L13:
            z7i.b r0 = new z7i.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f320010w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L50
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            boolean r6 = r5.e
            com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo r5 = r5.f97347a
            if (r6 == 0) goto L39
            goto L68
        L39:
            com.revolut.feature_move_money.api.model.AccountWrapper r6 = r5.d
            xi0.b r6 = r6.getCurrency()
            com.revolut.feature_move_money.api.model.AccountWrapper r5 = r5.e
            xi0.b r5 = r5.getCurrency()
            r0.f320010w = r3
            c8i.v r2 = r4.f97388b
            java.lang.Object r6 = r2.b(r6, r5, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output r6 = (com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output) r6
            boolean r5 = r6 instanceof com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldLaunch
            if (r5 == 0) goto L60
            z7i.g r5 = new z7i.g
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output$ShouldLaunch r6 = (com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldLaunch) r6
            bla.c r6 = r6.f78169a
            r5.<init>(r6)
            return r5
        L60:
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output$ShouldNotLaunch r5 = com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldNotLaunch.f78170a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r6, r5)
            if (r5 == 0) goto L6a
        L68:
            r5 = 0
            return r5
        L6a:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.flow.delegate.a.b(com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof z7i.c
            if (r0 == 0) goto L13
            r0 = r7
            z7i.c r0 = (z7i.c) r0
            int r1 = r0.f320011w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f320011w = r1
            goto L18
        L13:
            z7i.c r0 = new z7i.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f320011w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L4a
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            boolean r7 = r6.f97348b
            if (r7 == 0) goto L38
            goto L62
        L38:
            r0.f320011w = r3
            cuc.c r7 = new cuc.c
            r2 = 21
            zq.a r3 = r5.d
            r7.<init>(r3, r6, r4, r2)
            java.lang.Object r7 = skm.e0.o(r7, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            vrc.g r7 = (vrc.g) r7
            boolean r6 = r7 instanceof vrc.f
            if (r6 == 0) goto L5a
            z7i.j r6 = new z7i.j
            vrc.f r7 = (vrc.f) r7
            java.lang.String r7 = r7.f291575a
            r6.<init>(r7)
            return r6
        L5a:
            vrc.e r6 = vrc.e.f291574a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r7, r6)
            if (r6 == 0) goto L63
        L62:
            return r4
        L63:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.flow.delegate.a.c(com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof z7i.d
            if (r0 == 0) goto L13
            r0 = r7
            z7i.d r0 = (z7i.d) r0
            int r1 = r0.f320012w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f320012w = r1
            goto L18
        L13:
            z7i.d r0 = new z7i.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f320012w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L45
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            com.revolut.shared.feature.move_money.api.model.MoveMoneyReason r7 = r6.d
            if (r7 == 0) goto L38
            goto L5b
        L38:
            com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo r6 = r6.f97347a
            r0.f320012w = r3
            f4h.a r7 = r5.f97387a
            java.lang.Object r7 = r7.o(r6, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            com.revolut.shared.feature.move_money.api.model.MoveMoneyReasonConfig r7 = (com.revolut.shared.feature.move_money.api.model.MoveMoneyReasonConfig) r7
            if (r7 == 0) goto L5b
            java.util.ArrayList r6 = r7.f104801a
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L52
            goto L53
        L52:
            r7 = r4
        L53:
            if (r7 == 0) goto L5b
            z7i.h r6 = new z7i.h
            r6.<init>(r7)
            return r6
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.flow.delegate.a.d(com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0147 A[PHI: r11 r12
      0x0147: PHI (r11v5 'state' com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState) = 
      (r11v1 'state' com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState)
      (r11v6 'state' com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState)
     binds: [B:91:0x0144, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0147: PHI (r12v21 java.lang.Object) = (r12v12 java.lang.Object), (r12v1 java.lang.Object) binds: [B:91:0x0144, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState r11, gim.c r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.flow.delegate.a.e(com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState, gim.c):java.lang.Object");
    }
}
